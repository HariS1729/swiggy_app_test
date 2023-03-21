package i3;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.newrelic.agent.android.agentdata.HexAttribute;
import i3.p;
import i3.r;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.i;

/* compiled from: JankStatsApi16Impl.kt */
public class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: e  reason: collision with root package name */
    public static final a f15008e = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Field f15009f;

    /* renamed from: a  reason: collision with root package name */
    private final Choreographer f15010a;

    /* renamed from: b  reason: collision with root package name */
    private final List<q> f15011b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<View> f15012c;

    /* renamed from: d  reason: collision with root package name */
    private final r.b f15013d;

    /* compiled from: JankStatsApi16Impl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final Field a() {
            return c.f15009f;
        }

        public final long b(View view) {
            Context context;
            p.a aVar = p.f15037b;
            if (aVar.a() < 0) {
                Window window = null;
                if (view == null) {
                    context = null;
                } else {
                    context = view.getContext();
                }
                if (context instanceof Activity) {
                    Context context2 = view.getContext();
                    Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
                    window = ((Activity) context2).getWindow();
                }
                float f11 = 60.0f;
                float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
                if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                    f11 = refreshRate;
                }
                aVar.b((long) ((((float) 1000) / f11) * ((float) 1000000)));
            }
            return aVar.a();
        }
    }

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        kotlin.jvm.internal.p.i(declaredField, "Choreographer::class.jav…ld(\"mLastFrameTimeNanos\")");
        f15009f = declaredField;
        declaredField.setAccessible(true);
    }

    public c(View view, Choreographer choreographer, List<q> list) {
        kotlin.jvm.internal.p.j(view, "decorView");
        kotlin.jvm.internal.p.j(choreographer, "choreographer");
        kotlin.jvm.internal.p.j(list, "delegates");
        this.f15010a = choreographer;
        this.f15011b = list;
        this.f15012c = new WeakReference<>(view);
        this.f15013d = r.f15040c.b(view);
    }

    private final long d() {
        Object obj = f15009f.get(this.f15010a);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) obj).longValue();
    }

    /* access modifiers changed from: private */
    public static final void e(View view, c cVar, long j) {
        kotlin.jvm.internal.p.j(cVar, "this$0");
        long nanoTime = System.nanoTime();
        long b11 = f15008e.b(view);
        for (q a11 : cVar.f15011b) {
            a11.a(j, nanoTime - j, b11);
        }
        r a12 = cVar.f15013d.a();
        if (a12 != null) {
            a12.b();
        }
    }

    public final List<q> c() {
        return this.f15011b;
    }

    public void f(Message message) {
        kotlin.jvm.internal.p.j(message, HexAttribute.HEX_ATTR_MESSAGE);
    }

    public boolean onPreDraw() {
        View view = (View) this.f15012c.get();
        kotlin.jvm.internal.p.g(view);
        long d11 = d();
        Handler handler = view.getHandler();
        Message obtain = Message.obtain(view.getHandler(), new b(view, this, d11));
        kotlin.jvm.internal.p.i(obtain, "this");
        f(obtain);
        handler.sendMessage(obtain);
        return true;
    }
}
