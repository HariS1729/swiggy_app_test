package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.t;
import androidx.room.u;
import androidx.room.x;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MultiInstanceInvalidationClient */
class y {

    /* renamed from: a  reason: collision with root package name */
    final Context f11673a;

    /* renamed from: b  reason: collision with root package name */
    final String f11674b;

    /* renamed from: c  reason: collision with root package name */
    int f11675c;

    /* renamed from: d  reason: collision with root package name */
    final x f11676d;

    /* renamed from: e  reason: collision with root package name */
    final x.c f11677e;

    /* renamed from: f  reason: collision with root package name */
    u f11678f;

    /* renamed from: g  reason: collision with root package name */
    final Executor f11679g;

    /* renamed from: h  reason: collision with root package name */
    final t f11680h = new a();

    /* renamed from: i  reason: collision with root package name */
    final AtomicBoolean f11681i = new AtomicBoolean(false);
    final ServiceConnection j;
    final Runnable k;

    /* renamed from: l  reason: collision with root package name */
    final Runnable f11682l;

    /* compiled from: MultiInstanceInvalidationClient */
    class a extends t.a {

        /* renamed from: androidx.room.y$a$a  reason: collision with other inner class name */
        /* compiled from: MultiInstanceInvalidationClient */
        class C0083a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String[] f11684a;

            C0083a(String[] strArr) {
                this.f11684a = strArr;
            }

            public void run() {
                y.this.f11676d.f(this.f11684a);
            }
        }

        a() {
        }

        public void A(String[] strArr) {
            y.this.f11679g.execute(new C0083a(strArr));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class b implements ServiceConnection {
        b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            y.this.f11678f = u.a.f(iBinder);
            y yVar = y.this;
            yVar.f11679g.execute(yVar.k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            y yVar = y.this;
            yVar.f11679g.execute(yVar.f11682l);
            y.this.f11678f = null;
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class c implements Runnable {
        c() {
        }

        public void run() {
            try {
                y yVar = y.this;
                u uVar = yVar.f11678f;
                if (uVar != null) {
                    yVar.f11675c = uVar.W2(yVar.f11680h, yVar.f11674b);
                    y yVar2 = y.this;
                    yVar2.f11676d.a(yVar2.f11677e);
                }
            } catch (RemoteException e11) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e11);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class d implements Runnable {
        d() {
        }

        public void run() {
            y yVar = y.this;
            yVar.f11676d.i(yVar.f11677e);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    class e extends x.c {
        e(String[] strArr) {
            super(strArr);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return true;
        }

        public void b(Set<String> set) {
            if (!y.this.f11681i.get()) {
                try {
                    y yVar = y.this;
                    u uVar = yVar.f11678f;
                    if (uVar != null) {
                        uVar.z2(yVar.f11675c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e11) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e11);
                }
            }
        }
    }

    y(Context context, String str, Intent intent, x xVar, Executor executor) {
        b bVar = new b();
        this.j = bVar;
        this.k = new c();
        this.f11682l = new d();
        Context applicationContext = context.getApplicationContext();
        this.f11673a = applicationContext;
        this.f11674b = str;
        this.f11676d = xVar;
        this.f11679g = executor;
        this.f11677e = new e((String[]) xVar.f11649a.keySet().toArray(new String[0]));
        applicationContext.bindService(intent, bVar, 1);
    }
}
