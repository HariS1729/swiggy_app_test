package se0;

import android.app.Activity;
import android.app.Dialog;
import in.swiggy.android.reactnative.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;

/* compiled from: SplashScreen.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f19868a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<Dialog> f19869b;

    /* renamed from: c  reason: collision with root package name */
    private static WeakReference<Activity> f19870c;

    private d() {
    }

    /* access modifiers changed from: private */
    public static final void d(Ref$ObjectRef ref$ObjectRef) {
        WeakReference<Dialog> weakReference;
        Dialog dialog;
        Dialog dialog2;
        p.j(ref$ObjectRef, "$refActivity");
        WeakReference<Dialog> weakReference2 = f19869b;
        if (weakReference2 != null) {
            boolean z11 = true;
            if (weakReference2 == null || (dialog2 = (Dialog) weakReference2.get()) == null || !dialog2.isShowing()) {
                z11 = false;
            }
            if (z11) {
                if (!((Activity) ref$ObjectRef.f25666a).isFinishing() && !((Activity) ref$ObjectRef.f25666a).isDestroyed() && (weakReference = f19869b) != null && (dialog = (Dialog) weakReference.get()) != null) {
                    dialog.dismiss();
                }
                f19869b = null;
            }
        }
    }

    public static /* synthetic */ void g(d dVar, Activity activity, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        if ((i11 & 8) != 0) {
            z13 = false;
        }
        dVar.f(activity, z11, z12, z13);
    }

    /* access modifiers changed from: private */
    public static final void h(Activity activity, int i11, int i12) {
        WeakReference<Dialog> weakReference;
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        if (!activity.isFinishing()) {
            WeakReference<Dialog> weakReference2 = new WeakReference<>(new Dialog(activity, i11));
            f19869b = weakReference2;
            Dialog dialog4 = (Dialog) weakReference2.get();
            if (dialog4 != null) {
                dialog4.setContentView(i12);
            }
            WeakReference<Dialog> weakReference3 = f19869b;
            boolean z11 = false;
            if (!(weakReference3 == null || (dialog3 = (Dialog) weakReference3.get()) == null)) {
                dialog3.setCancelable(false);
            }
            WeakReference<Dialog> weakReference4 = f19869b;
            if (!(weakReference4 == null || (dialog2 = (Dialog) weakReference4.get()) == null || dialog2.isShowing())) {
                z11 = true;
            }
            if (z11 && (weakReference = f19869b) != null && (dialog = (Dialog) weakReference.get()) != null) {
                dialog.show();
            }
        }
    }

    public final void c(Activity activity) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f25666a = activity;
        if (activity == null) {
            WeakReference<Activity> weakReference = f19870c;
            if (weakReference != null) {
                p.g(weakReference);
                ref$ObjectRef.f25666a = weakReference.get();
            } else {
                return;
            }
        }
        T t = ref$ObjectRef.f25666a;
        if (t != null) {
            ((Activity) t).runOnUiThread(new c(ref$ObjectRef));
        }
    }

    public final void e(Activity activity, int i11, int i12) {
        if (activity != null) {
            f19870c = new WeakReference<>(activity);
            activity.runOnUiThread(new b(activity, i11, i12));
        }
    }

    public final void f(Activity activity, boolean z11, boolean z12, boolean z13) {
        e(activity, z11 ? R.style.SplashScreen_Fullscreen : z13 ? R.style.SplashScreen_WithBottomBar : R.style.SplashScreen_SplashTheme, z12 ? R.layout.minis_splash_screen : z13 ? R.layout.diners_one_splash_screen_with_bottom_bar : R.layout.diners_one_splash_screen);
    }
}
