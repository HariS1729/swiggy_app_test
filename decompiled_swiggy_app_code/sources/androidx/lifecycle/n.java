package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher */
class n {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f10771a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher */
    static class a extends g {
        a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            ReportFragment.g(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static void a(Context context) {
        if (!f10771a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
        }
    }
}
