package i3;

import android.os.Build;
import android.view.View;
import android.view.Window;
import i3.r;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.p;

/* compiled from: JankStats.kt */
public final class i {

    /* renamed from: g  reason: collision with root package name */
    public static final a f15020g = new a((kotlin.jvm.internal.i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Executor f15021a;

    /* renamed from: b  reason: collision with root package name */
    private final b f15022b;

    /* renamed from: c  reason: collision with root package name */
    private final r.b f15023c;

    /* renamed from: d  reason: collision with root package name */
    private final p f15024d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15025e;

    /* renamed from: f  reason: collision with root package name */
    private float f15026f;

    /* compiled from: JankStats.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final i a(Window window, Executor executor, b bVar) {
            p.j(window, "window");
            p.j(executor, "executor");
            p.j(bVar, "frameListener");
            return new i(window, executor, bVar, (kotlin.jvm.internal.i) null);
        }
    }

    /* compiled from: JankStats.kt */
    public interface b {
        void a(e eVar);
    }

    private i(Window window, Executor executor, b bVar) {
        p pVar;
        this.f15021a = executor;
        this.f15022b = bVar;
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            this.f15023c = r.f15040c.a(peekDecorView);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                pVar = new o(this, peekDecorView, window);
            } else if (i11 >= 26) {
                pVar = new n(this, peekDecorView, window);
            } else if (i11 >= 24) {
                pVar = new m(this, peekDecorView, window);
            } else if (i11 >= 22) {
                pVar = new k(this, peekDecorView);
            } else {
                pVar = new j(this, peekDecorView);
            }
            this.f15024d = pVar;
            pVar.c(true);
            this.f15025e = true;
            this.f15026f = 2.0f;
            return;
        }
        throw new IllegalStateException("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
    }

    public /* synthetic */ i(Window window, Executor executor, b bVar, kotlin.jvm.internal.i iVar) {
        this(window, executor, bVar);
    }

    /* access modifiers changed from: private */
    public static final void c(i iVar, e eVar) {
        p.j(iVar, "this$0");
        p.j(eVar, "$frameData");
        iVar.f15022b.a(eVar);
    }

    public final float b() {
        return this.f15026f;
    }

    public final void d(e eVar) {
        p.j(eVar, "frameData");
        this.f15021a.execute(new h(this, eVar));
    }

    public final void e(boolean z11) {
        this.f15024d.c(z11);
        this.f15025e = z11;
    }
}
