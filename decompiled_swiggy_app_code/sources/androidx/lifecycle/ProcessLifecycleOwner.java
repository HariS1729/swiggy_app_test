package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;

public class ProcessLifecycleOwner implements r {

    /* renamed from: i  reason: collision with root package name */
    private static final ProcessLifecycleOwner f10656i = new ProcessLifecycleOwner();
    public static final /* synthetic */ int j = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f10657a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f10658b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10659c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10660d = true;

    /* renamed from: e  reason: collision with root package name */
    private Handler f10661e;

    /* renamed from: f  reason: collision with root package name */
    private final t f10662f = new t(this);

    /* renamed from: g  reason: collision with root package name */
    private Runnable f10663g = new a();

    /* renamed from: h  reason: collision with root package name */
    ReportFragment.a f10664h = new b();

    class a implements Runnable {
        a() {
        }

        public void run() {
            ProcessLifecycleOwner.this.f();
            ProcessLifecycleOwner.this.g();
        }
    }

    class b implements ReportFragment.a {
        b() {
        }

        public void b() {
            ProcessLifecycleOwner.this.c();
        }

        public void g() {
            ProcessLifecycleOwner.this.b();
        }

        public void h() {
        }
    }

    class c extends g {

        class a extends g {
            a() {
            }

            public void onActivityPostResumed(Activity activity) {
                ProcessLifecycleOwner.this.b();
            }

            public void onActivityPostStarted(Activity activity) {
                ProcessLifecycleOwner.this.c();
            }
        }

        c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                ReportFragment.f(activity).h(ProcessLifecycleOwner.this.f10664h);
            }
        }

        public void onActivityPaused(Activity activity) {
            ProcessLifecycleOwner.this.a();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            d.a(activity, new a());
        }

        public void onActivityStopped(Activity activity) {
            ProcessLifecycleOwner.this.d();
        }
    }

    static class d {
        static void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    private ProcessLifecycleOwner() {
    }

    public static r h() {
        return f10656i;
    }

    static void i(Context context) {
        f10656i.e(context);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int i11 = this.f10658b - 1;
        this.f10658b = i11;
        if (i11 == 0) {
            this.f10661e.postDelayed(this.f10663g, 700);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i11 = this.f10658b + 1;
        this.f10658b = i11;
        if (i11 != 1) {
            return;
        }
        if (this.f10659c) {
            this.f10662f.h(Lifecycle.Event.ON_RESUME);
            this.f10659c = false;
            return;
        }
        this.f10661e.removeCallbacks(this.f10663g);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        int i11 = this.f10657a + 1;
        this.f10657a = i11;
        if (i11 == 1 && this.f10660d) {
            this.f10662f.h(Lifecycle.Event.ON_START);
            this.f10660d = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f10657a--;
        g();
    }

    /* access modifiers changed from: package-private */
    public void e(Context context) {
        this.f10661e = new Handler();
        this.f10662f.h(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.f10658b == 0) {
            this.f10659c = true;
            this.f10662f.h(Lifecycle.Event.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.f10657a == 0 && this.f10659c) {
            this.f10662f.h(Lifecycle.Event.ON_STOP);
            this.f10660d = true;
        }
    }

    public Lifecycle getLifecycle() {
        return this.f10662f;
    }
}
