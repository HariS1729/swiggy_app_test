package s;

import android.os.Build;
import android.view.View;
import androidx.compose.foundation.MagnifierKt;
import d2.e;

/* compiled from: PlatformMagnifier.kt */
public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16550a = a.f16551a;

    /* compiled from: PlatformMagnifier.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f16551a = new a();

        private a() {
        }

        public final o a() {
            if (!MagnifierKt.c(0, 1, (Object) null)) {
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            } else if (Build.VERSION.SDK_INT == 28) {
                return p.f16552b;
            } else {
                return q.f16555b;
            }
        }
    }

    n a(j jVar, View view, e eVar, float f11);

    boolean b();
}
