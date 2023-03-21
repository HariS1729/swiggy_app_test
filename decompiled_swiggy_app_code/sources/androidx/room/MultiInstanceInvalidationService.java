package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.u;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    int f11492a = 0;

    /* renamed from: b  reason: collision with root package name */
    final HashMap<Integer, String> f11493b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    final RemoteCallbackList<t> f11494c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final u.a f11495d = new b();

    class a extends RemoteCallbackList<t> {
        a() {
        }

        /* renamed from: a */
        public void onCallbackDied(t tVar, Object obj) {
            MultiInstanceInvalidationService.this.f11493b.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    class b extends u.a {
        b() {
        }

        public void R3(t tVar, int i11) {
            synchronized (MultiInstanceInvalidationService.this.f11494c) {
                MultiInstanceInvalidationService.this.f11494c.unregister(tVar);
                MultiInstanceInvalidationService.this.f11493b.remove(Integer.valueOf(i11));
            }
        }

        public int W2(t tVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f11494c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i11 = multiInstanceInvalidationService.f11492a + 1;
                multiInstanceInvalidationService.f11492a = i11;
                if (multiInstanceInvalidationService.f11494c.register(tVar, Integer.valueOf(i11))) {
                    MultiInstanceInvalidationService.this.f11493b.put(Integer.valueOf(i11), str);
                    return i11;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f11492a--;
                return 0;
            }
        }

        public void z2(int i11, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f11494c) {
                String str = MultiInstanceInvalidationService.this.f11493b.get(Integer.valueOf(i11));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f11494c.beginBroadcast();
                for (int i12 = 0; i12 < beginBroadcast; i12++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f11494c.getBroadcastCookie(i12)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f11493b.get(Integer.valueOf(intValue));
                        if (i11 != intValue && str.equals(str2)) {
                            MultiInstanceInvalidationService.this.f11494c.getBroadcastItem(i12).A(strArr);
                        }
                    } catch (RemoteException e11) {
                        Log.w("ROOM", "Error invoking a remote callback", e11);
                    } catch (Throwable th2) {
                        MultiInstanceInvalidationService.this.f11494c.finishBroadcast();
                        throw th2;
                    }
                }
                MultiInstanceInvalidationService.this.f11494c.finishBroadcast();
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f11495d;
    }
}
