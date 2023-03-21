package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: ActivityCompat */
public class b extends androidx.core.content.a {

    /* renamed from: c  reason: collision with root package name */
    private static g f8996c;

    /* compiled from: ActivityCompat */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String[] f8997a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f8998b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f8999c;

        a(String[] strArr, Activity activity, int i11) {
            this.f8997a = strArr;
            this.f8998b = activity;
            this.f8999c = i11;
        }

        public void run() {
            int[] iArr = new int[this.f8997a.length];
            PackageManager packageManager = this.f8998b.getPackageManager();
            String packageName = this.f8998b.getPackageName();
            int length = this.f8997a.length;
            for (int i11 = 0; i11 < length; i11++) {
                iArr[i11] = packageManager.checkPermission(this.f8997a[i11], packageName);
            }
            ((f) this.f8998b).onRequestPermissionsResult(this.f8999c, this.f8997a, iArr);
        }
    }

    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    /* compiled from: ActivityCompat */
    static class C0032b {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i11, Bundle bundle) {
            activity.startActivityForResult(intent, i11, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
        }
    }

    /* compiled from: ActivityCompat */
    static class c {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* compiled from: ActivityCompat */
    static class d {
        static Uri a(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* compiled from: ActivityCompat */
    static class e {
        static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i11) {
            activity.requestPermissions(strArr, i11);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat */
    public interface f {
        void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat */
    public interface g {
        boolean a(Activity activity, String[] strArr, int i11);
    }

    /* compiled from: ActivityCompat */
    public interface h {
        void validateRequestPermissionsRequestCode(int i11);
    }

    public static void A(Activity activity, IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
        C0032b.c(activity, intentSender, i11, intent, i12, i13, i14, bundle);
    }

    public static void B(Activity activity) {
        c.e(activity);
    }

    public static void p(Activity activity) {
        C0032b.a(activity);
    }

    public static void q(Activity activity) {
        c.a(activity);
    }

    public static Uri r(Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return d.a(activity);
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void s(Activity activity) {
        if (!activity.isFinishing() && !d.i(activity)) {
            activity.recreate();
        }
    }

    public static void t(Activity activity) {
        c.b(activity);
    }

    public static void u(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new a(activity));
        }
    }

    public static void v(Activity activity, String[] strArr, int i11) {
        g gVar = f8996c;
        if (gVar == null || !gVar.a(activity, strArr, i11)) {
            int length = strArr.length;
            int i12 = 0;
            while (i12 < length) {
                if (!TextUtils.isEmpty(strArr[i12])) {
                    i12++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof h) {
                    ((h) activity).validateRequestPermissionsRequestCode(i11);
                }
                e.b(activity, strArr, i11);
            } else if (activity instanceof f) {
                new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i11));
            }
        }
    }

    public static void w(Activity activity, s sVar) {
        c.c(activity, (SharedElementCallback) null);
    }

    public static void x(Activity activity, s sVar) {
        c.d(activity, (SharedElementCallback) null);
    }

    public static boolean y(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e.c(activity, str);
        }
        return false;
    }

    public static void z(Activity activity, Intent intent, int i11, Bundle bundle) {
        C0032b.b(activity, intent, i11, bundle);
    }
}
