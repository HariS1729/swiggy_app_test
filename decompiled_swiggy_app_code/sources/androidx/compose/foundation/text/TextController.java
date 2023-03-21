package androidx.compose.foundation.text;

import a0.n;
import a0.o;
import a0.u;
import a0.v;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import b0.c;
import b0.e;
import b0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import e0.r0;
import i1.m;
import i1.t;
import kotlin.jvm.internal.p;
import okhttp3.internal.http2.Settings;
import p0.d;
import p1.y;
import t0.f;
import u0.d1;
import u0.j1;

/* compiled from: CoreText.kt */
public final class TextController implements r0 {

    /* renamed from: a  reason: collision with root package name */
    private final TextState f4496a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public k f4497b;

    /* renamed from: c  reason: collision with root package name */
    public o f4498c;

    /* renamed from: d  reason: collision with root package name */
    private final t f4499d = new TextController$measurePolicy$1(this);

    /* renamed from: e  reason: collision with root package name */
    private final d f4500e;

    /* renamed from: f  reason: collision with root package name */
    private d f4501f;

    /* renamed from: g  reason: collision with root package name */
    private d f4502g;

    /* compiled from: CoreText.kt */
    public static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private long f4503a;

        /* renamed from: b  reason: collision with root package name */
        private long f4504b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextController f4505c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f4506d;

        a(TextController textController, k kVar) {
            this.f4505c = textController;
            this.f4506d = kVar;
            f.a aVar = f.f16662b;
            this.f4503a = aVar.c();
            this.f4504b = aVar.c();
        }

        public void d() {
            if (SelectionRegistrarKt.b(this.f4506d, this.f4505c.k().g())) {
                this.f4506d.b();
            }
        }

        public void e() {
            if (SelectionRegistrarKt.b(this.f4506d, this.f4505c.k().g())) {
                this.f4506d.b();
            }
        }

        public void f(long j) {
        }

        public void g(long j) {
            m b11 = this.f4505c.k().b();
            if (b11 != null) {
                k kVar = this.f4506d;
                TextController textController = this.f4505c;
                if (b11.D() && SelectionRegistrarKt.b(kVar, textController.k().g())) {
                    long r11 = f.r(this.f4504b, j);
                    this.f4504b = r11;
                    long r12 = f.r(this.f4503a, r11);
                    if (!textController.l(this.f4503a, r12)) {
                        if (kVar.h(b11, r12, this.f4503a, false, SelectionAdjustment.f4703a.d())) {
                            this.f4503a = r12;
                            this.f4504b = f.f16662b.c();
                        }
                    }
                }
            }
        }

        public void h(long j) {
            m b11 = this.f4505c.k().b();
            if (b11 != null) {
                TextController textController = this.f4505c;
                k kVar = this.f4506d;
                if (b11.D()) {
                    if (textController.l(j, j)) {
                        kVar.i(textController.k().g());
                    } else {
                        kVar.d(b11, j, SelectionAdjustment.f4703a.g());
                    }
                    this.f4503a = j;
                } else {
                    return;
                }
            }
            if (SelectionRegistrarKt.b(this.f4506d, this.f4505c.k().g())) {
                this.f4504b = f.f16662b.c();
            }
        }

        public void i() {
        }
    }

    /* compiled from: CoreText.kt */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private long f4507a = f.f16662b.c();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextController f4508b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f4509c;

        b(TextController textController, k kVar) {
            this.f4508b = textController;
            this.f4509c = kVar;
        }

        public boolean a(long j, SelectionAdjustment selectionAdjustment) {
            p.j(selectionAdjustment, "adjustment");
            m b11 = this.f4508b.k().b();
            if (b11 != null) {
                k kVar = this.f4509c;
                TextController textController = this.f4508b;
                if (!b11.D() || !SelectionRegistrarKt.b(kVar, textController.k().g())) {
                    return false;
                }
                if (kVar.h(b11, j, this.f4507a, false, selectionAdjustment)) {
                    this.f4507a = j;
                }
            }
            return true;
        }

        public boolean b(long j) {
            m b11 = this.f4508b.k().b();
            if (b11 == null) {
                return true;
            }
            k kVar = this.f4509c;
            TextController textController = this.f4508b;
            if (!b11.D() || !SelectionRegistrarKt.b(kVar, textController.k().g())) {
                return false;
            }
            if (!kVar.h(b11, j, this.f4507a, false, SelectionAdjustment.f4703a.e())) {
                return true;
            }
            this.f4507a = j;
            return true;
        }

        public boolean c(long j, SelectionAdjustment selectionAdjustment) {
            p.j(selectionAdjustment, "adjustment");
            m b11 = this.f4508b.k().b();
            if (b11 == null) {
                return false;
            }
            k kVar = this.f4509c;
            TextController textController = this.f4508b;
            if (!b11.D()) {
                return false;
            }
            kVar.d(b11, j, selectionAdjustment);
            this.f4507a = j;
            return SelectionRegistrarKt.b(kVar, textController.k().g());
        }

        public boolean d(long j) {
            m b11 = this.f4508b.k().b();
            if (b11 == null) {
                return false;
            }
            k kVar = this.f4509c;
            TextController textController = this.f4508b;
            if (!b11.D()) {
                return false;
            }
            if (kVar.h(b11, j, this.f4507a, false, SelectionAdjustment.f4703a.e())) {
                this.f4507a = j;
            }
            return SelectionRegistrarKt.b(kVar, textController.k().g());
        }
    }

    public TextController(TextState textState) {
        p.j(textState, HexAttribute.HEX_ATTR_THREAD_STATE);
        this.f4496a = textState;
        d.a aVar = d.f16037h0;
        this.f4500e = OnGloballyPositionedModifierKt.a(e(aVar), new TextController$coreModifiers$1(this));
        this.f4501f = d(textState.h().k());
        this.f4502g = aVar;
    }

    private final d d(p1.b bVar) {
        return SemanticsModifierKt.c(d.f16037h0, false, new TextController$createSemanticsModifierFor$1(bVar, this), 1, (Object) null);
    }

    private final d e(d dVar) {
        return DrawModifierKt.a(GraphicsLayerModifierKt.e(dVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (j1) null, false, (d1) null, 0, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE, (Object) null), new TextController$drawTextAndSelectionBehind$1(this));
    }

    /* access modifiers changed from: private */
    public final boolean l(long j, long j11) {
        y c11 = this.f4496a.c();
        if (c11 == null) {
            return false;
        }
        int length = c11.k().j().g().length();
        int w11 = c11.w(j);
        int w12 = c11.w(j11);
        int i11 = length - 1;
        if ((w11 < i11 || w12 < i11) && (w11 >= 0 || w12 >= 0)) {
            return false;
        }
        return true;
    }

    public void b() {
        k kVar = this.f4497b;
        if (kVar != null) {
            TextState textState = this.f4496a;
            textState.n(kVar.j(new b0.d(textState.g(), new TextController$onRemembered$1$1(this), new TextController$onRemembered$1$2(this))));
        }
    }

    public void f() {
        k kVar;
        e f11 = this.f4496a.f();
        if (f11 != null && (kVar = this.f4497b) != null) {
            kVar.e(f11);
        }
    }

    public void g() {
        k kVar;
        e f11 = this.f4496a.f();
        if (f11 != null && (kVar = this.f4497b) != null) {
            kVar.e(f11);
        }
    }

    public final o h() {
        o oVar = this.f4498c;
        if (oVar != null) {
            return oVar;
        }
        p.B("longPressDragObserver");
        return null;
    }

    public final t i() {
        return this.f4499d;
    }

    public final d j() {
        return this.f4500e.N(this.f4501f).N(this.f4502g);
    }

    public final TextState k() {
        return this.f4496a;
    }

    public final void m(o oVar) {
        p.j(oVar, "<set-?>");
        this.f4498c = oVar;
    }

    public final void n(n nVar) {
        p.j(nVar, "textDelegate");
        if (this.f4496a.h() != nVar) {
            this.f4496a.p(nVar);
            this.f4501f = d(this.f4496a.h().k());
        }
    }

    public final void o(k kVar) {
        d dVar;
        this.f4497b = kVar;
        if (kVar == null) {
            dVar = d.f16037h0;
        } else if (v.a()) {
            m(new a(this, kVar));
            dVar = SuspendingPointerInputFilterKt.c(d.f16037h0, h(), new TextController$update$2(this, (fp0.c<? super TextController$update$2>) null));
        } else {
            b bVar = new b(this, kVar);
            dVar = PointerIconKt.b(SuspendingPointerInputFilterKt.c(d.f16037h0, bVar, new TextController$update$3(bVar, (fp0.c<? super TextController$update$3>) null)), u.a(), false, 2, (Object) null);
        }
        this.f4502g = dVar;
    }
}
