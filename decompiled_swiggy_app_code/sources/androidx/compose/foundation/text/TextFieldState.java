package androidx.compose.foundation.text;

import a0.e;
import a0.g;
import a0.n;
import a0.s;
import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import e0.a1;
import e0.h0;
import e0.o0;
import i1.m;
import kotlin.jvm.internal.p;
import lp0.l;
import p1.b;
import u0.i;
import u0.t0;
import u1.i;
import v1.c0;
import v1.f;

/* compiled from: CoreTextField.kt */
public final class TextFieldState {

    /* renamed from: a  reason: collision with root package name */
    private n f4626a;

    /* renamed from: b  reason: collision with root package name */
    private final o0 f4627b;

    /* renamed from: c  reason: collision with root package name */
    private final f f4628c = new f();

    /* renamed from: d  reason: collision with root package name */
    private c0 f4629d;

    /* renamed from: e  reason: collision with root package name */
    private final h0 f4630e;

    /* renamed from: f  reason: collision with root package name */
    private m f4631f;

    /* renamed from: g  reason: collision with root package name */
    private final h0 f4632g;

    /* renamed from: h  reason: collision with root package name */
    private final h0 f4633h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4634i;
    private final h0 j;
    private final h0 k;

    /* renamed from: l  reason: collision with root package name */
    private final h0 f4635l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final e f4636m;
    /* access modifiers changed from: private */
    public l<? super TextFieldValue, k> n;

    /* renamed from: o  reason: collision with root package name */
    private final l<TextFieldValue, k> f4637o;

    /* renamed from: p  reason: collision with root package name */
    private final l<v1.l, k> f4638p;
    private final t0 q;

    public TextFieldState(n nVar, o0 o0Var) {
        p.j(nVar, "textDelegate");
        p.j(o0Var, "recomposeScope");
        this.f4626a = nVar;
        this.f4627b = o0Var;
        Boolean bool = Boolean.FALSE;
        this.f4630e = j.e(bool, (a1) null, 2, (Object) null);
        this.f4632g = j.e((Object) null, (a1) null, 2, (Object) null);
        this.f4633h = j.e(HandleState.None, (a1) null, 2, (Object) null);
        this.j = j.e(bool, (a1) null, 2, (Object) null);
        this.k = j.e(bool, (a1) null, 2, (Object) null);
        this.f4635l = j.e(bool, (a1) null, 2, (Object) null);
        this.f4636m = new e();
        this.n = TextFieldState$onValueChangeOriginal$1.f4641a;
        this.f4637o = new TextFieldState$onValueChange$1(this);
        this.f4638p = new TextFieldState$onImeActionPerformed$1(this);
        this.q = i.a();
    }

    public final void A(b bVar, p1.c0 c0Var, boolean z11, d2.e eVar, i.b bVar2, l<? super TextFieldValue, k> lVar, g gVar, s0.f fVar, long j11) {
        l<? super TextFieldValue, k> lVar2 = lVar;
        g gVar2 = gVar;
        s0.f fVar2 = fVar;
        b bVar3 = bVar;
        p.j(bVar3, "visualText");
        p1.c0 c0Var2 = c0Var;
        p.j(c0Var2, "textStyle");
        d2.e eVar2 = eVar;
        p.j(eVar2, "density");
        i.b bVar4 = bVar2;
        p.j(bVar4, "fontFamilyResolver");
        p.j(lVar2, "onValueChange");
        p.j(gVar2, "keyboardActions");
        p.j(fVar2, "focusManager");
        this.n = lVar2;
        this.q.h(j11);
        e eVar3 = this.f4636m;
        eVar3.f(gVar2);
        eVar3.e(fVar2);
        this.f4626a = CoreTextKt.d(this.f4626a, bVar3, c0Var2, eVar2, bVar4, z11, 0, 0, k.j(), 192, (Object) null);
    }

    public final HandleState c() {
        return (HandleState) this.f4633h.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.f4630e.getValue()).booleanValue();
    }

    public final c0 e() {
        return this.f4629d;
    }

    public final m f() {
        return this.f4631f;
    }

    public final s g() {
        return (s) this.f4632g.getValue();
    }

    public final l<v1.l, k> h() {
        return this.f4638p;
    }

    public final l<TextFieldValue, k> i() {
        return this.f4637o;
    }

    public final f j() {
        return this.f4628c;
    }

    public final o0 k() {
        return this.f4627b;
    }

    public final t0 l() {
        return this.q;
    }

    public final boolean m() {
        return ((Boolean) this.f4635l.getValue()).booleanValue();
    }

    public final boolean n() {
        return this.f4634i;
    }

    public final boolean o() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final boolean p() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final n q() {
        return this.f4626a;
    }

    public final void r(HandleState handleState) {
        p.j(handleState, "<set-?>");
        this.f4633h.setValue(handleState);
    }

    public final void s(boolean z11) {
        this.f4630e.setValue(Boolean.valueOf(z11));
    }

    public final void t(c0 c0Var) {
        this.f4629d = c0Var;
    }

    public final void u(m mVar) {
        this.f4631f = mVar;
    }

    public final void v(s sVar) {
        this.f4632g.setValue(sVar);
    }

    public final void w(boolean z11) {
        this.f4635l.setValue(Boolean.valueOf(z11));
    }

    public final void x(boolean z11) {
        this.f4634i = z11;
    }

    public final void y(boolean z11) {
        this.k.setValue(Boolean.valueOf(z11));
    }

    public final void z(boolean z11) {
        this.j.setValue(Boolean.valueOf(z11));
    }
}
