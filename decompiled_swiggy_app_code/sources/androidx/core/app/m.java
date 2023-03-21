package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.a;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: NotificationManagerCompat */
public final class m {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f9107c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static String f9108d;

    /* renamed from: e  reason: collision with root package name */
    private static Set<String> f9109e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f9110f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static c f9111g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f9112a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f9113b;

    /* compiled from: NotificationManagerCompat */
    private static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final String f9114a;

        /* renamed from: b  reason: collision with root package name */
        final int f9115b;

        /* renamed from: c  reason: collision with root package name */
        final String f9116c;

        /* renamed from: d  reason: collision with root package name */
        final Notification f9117d;

        a(String str, int i11, String str2, Notification notification) {
            this.f9114a = str;
            this.f9115b = i11;
            this.f9116c = str2;
            this.f9117d = notification;
        }

        public void a(b.a aVar) throws RemoteException {
            aVar.l1(this.f9114a, this.f9115b, this.f9116c, this.f9117d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f9114a + ", id:" + this.f9115b + ", tag:" + this.f9116c + "]";
        }
    }

    /* compiled from: NotificationManagerCompat */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f9118a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f9119b;

        b(ComponentName componentName, IBinder iBinder) {
            this.f9118a = componentName;
            this.f9119b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat */
    private static class c implements Handler.Callback, ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final Context f9120a;

        /* renamed from: b  reason: collision with root package name */
        private final HandlerThread f9121b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f9122c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<ComponentName, a> f9123d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private Set<String> f9124e = new HashSet();

        /* compiled from: NotificationManagerCompat */
        private static class a {

            /* renamed from: a  reason: collision with root package name */
            final ComponentName f9125a;

            /* renamed from: b  reason: collision with root package name */
            boolean f9126b = false;

            /* renamed from: c  reason: collision with root package name */
            b.a f9127c;

            /* renamed from: d  reason: collision with root package name */
            ArrayDeque<d> f9128d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            int f9129e = 0;

            a(ComponentName componentName) {
                this.f9125a = componentName;
            }
        }

        c(Context context) {
            this.f9120a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f9121b = handlerThread;
            handlerThread.start();
            this.f9122c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f9126b) {
                return true;
            }
            boolean bindService = this.f9120a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f9125a), this, 33);
            aVar.f9126b = bindService;
            if (bindService) {
                aVar.f9129e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f9125a);
                this.f9120a.unbindService(this);
            }
            return aVar.f9126b;
        }

        private void b(a aVar) {
            if (aVar.f9126b) {
                this.f9120a.unbindService(this);
                aVar.f9126b = false;
            }
            aVar.f9127c = null;
        }

        private void c(d dVar) {
            j();
            for (a next : this.f9123d.values()) {
                next.f9128d.add(dVar);
                g(next);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f9123d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f9123d.get(componentName);
            if (aVar != null) {
                aVar.f9127c = a.C0096a.f(iBinder);
                aVar.f9129e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f9123d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f9125a + ", " + aVar.f9128d.size() + " queued tasks");
            }
            if (!aVar.f9128d.isEmpty()) {
                if (!a(aVar) || aVar.f9127c == null) {
                    i(aVar);
                    return;
                }
                while (true) {
                    d peek = aVar.f9128d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.f9127c);
                        aVar.f9128d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f9125a);
                        }
                    } catch (RemoteException e11) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f9125a, e11);
                    }
                }
                if (!aVar.f9128d.isEmpty()) {
                    i(aVar);
                }
            }
        }

        private void i(a aVar) {
            if (!this.f9122c.hasMessages(3, aVar.f9125a)) {
                int i11 = aVar.f9129e + 1;
                aVar.f9129e = i11;
                if (i11 > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f9128d.size() + " tasks to " + aVar.f9125a + " after " + aVar.f9129e + " retries");
                    aVar.f9128d.clear();
                    return;
                }
                int i12 = (1 << (i11 - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f9122c.sendMessageDelayed(this.f9122c.obtainMessage(3, aVar.f9125a), (long) i12);
            }
        }

        private void j() {
            Set<String> c11 = m.c(this.f9120a);
            if (!c11.equals(this.f9124e)) {
                this.f9124e = c11;
                List<ResolveInfo> queryIntentServices = this.f9120a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (c11.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f9123d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f9123d.put(componentName2, new a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, a>> it2 = this.f9123d.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry next2 = it2.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next2.getKey());
                        }
                        b((a) next2.getValue());
                        it2.remove();
                    }
                }
            }
        }

        public void h(d dVar) {
            this.f9122c.obtainMessage(0, dVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 0) {
                c((d) message.obj);
                return true;
            } else if (i11 == 1) {
                b bVar = (b) message.obj;
                e(bVar.f9118a, bVar.f9119b);
                return true;
            } else if (i11 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i11 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f9122c.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f9122c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat */
    private interface d {
        void a(b.a aVar) throws RemoteException;
    }

    private m(Context context) {
        this.f9112a = context;
        this.f9113b = (NotificationManager) context.getSystemService("notification");
    }

    public static m b(Context context) {
        return new m(context);
    }

    public static Set<String> c(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f9107c) {
            if (string != null) {
                if (!string.equals(f9108d)) {
                    String[] split = string.split(Constants.COLON_SEPARATOR, -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f9109e = hashSet;
                    f9108d = string;
                }
            }
            set = f9109e;
        }
        return set;
    }

    private void f(d dVar) {
        synchronized (f9110f) {
            if (f9111g == null) {
                f9111g = new c(this.f9112a.getApplicationContext());
            }
            f9111g.h(dVar);
        }
    }

    private static boolean g(Notification notification) {
        Bundle k = j.k(notification);
        return k != null && k.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f9113b.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f9112a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f9112a.getApplicationInfo();
        String packageName = this.f9112a.getApplicationContext().getPackageName();
        int i11 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i11), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void d(int i11, Notification notification) {
        e((String) null, i11, notification);
    }

    public void e(String str, int i11, Notification notification) {
        if (g(notification)) {
            f(new a(this.f9112a.getPackageName(), i11, str, notification));
            this.f9113b.cancel(str, i11);
            return;
        }
        this.f9113b.notify(str, i11, notification);
    }
}
