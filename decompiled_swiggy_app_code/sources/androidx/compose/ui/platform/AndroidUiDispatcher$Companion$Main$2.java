package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.e;
import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.a;
import wp0.h;
import wp0.u0;

/* compiled from: AndroidUiDispatcher.android.kt */
final class AndroidUiDispatcher$Companion$Main$2 extends Lambda implements a<CoroutineContext> {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidUiDispatcher$Companion$Main$2 f7086a = new AndroidUiDispatcher$Companion$Main$2();

    AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    /* renamed from: a */
    public final CoroutineContext invoke() {
        Choreographer choreographer;
        if (w.b()) {
            choreographer = Choreographer.getInstance();
        } else {
            choreographer = (Choreographer) h.e(u0.c(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1((c<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1>) null));
        }
        p.i(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
        Handler a11 = e.a(Looper.getMainLooper());
        p.i(a11, "createAsync(Looper.getMainLooper())");
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, a11, (i) null);
        return androidUiDispatcher.plus(androidUiDispatcher.c1());
    }
}
