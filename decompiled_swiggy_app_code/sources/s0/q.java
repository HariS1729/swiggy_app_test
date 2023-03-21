package s0;

import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import f0.e;
import j1.b;
import j1.d;
import j1.f;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;

/* compiled from: FocusRequesterModifier.kt */
public final class q implements b, d<q> {

    /* renamed from: a  reason: collision with root package name */
    private final o f16591a;

    /* renamed from: b  reason: collision with root package name */
    private q f16592b;

    /* renamed from: c  reason: collision with root package name */
    private final e<FocusModifier> f16593c = new e<>(new FocusModifier[16], 0);

    public q(o oVar) {
        p.j(oVar, "focusRequester");
        this.f16591a = oVar;
        oVar.b().b(this);
    }

    public void D(j1.e eVar) {
        p.j(eVar, "scope");
        q qVar = (q) eVar.a(FocusRequesterModifierKt.b());
        if (!p.e(qVar, this.f16592b)) {
            q qVar2 = this.f16592b;
            if (qVar2 != null) {
                qVar2.g(this.f16593c);
            }
            if (qVar != null) {
                qVar.c(this.f16593c);
            }
            this.f16592b = qVar;
        }
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public final void a(FocusModifier focusModifier) {
        p.j(focusModifier, "focusModifier");
        this.f16593c.b(focusModifier);
        q qVar = this.f16592b;
        if (qVar != null) {
            qVar.a(focusModifier);
        }
    }

    public final void c(e<FocusModifier> eVar) {
        p.j(eVar, "newModifiers");
        e<FocusModifier> eVar2 = this.f16593c;
        eVar2.c(eVar2.m(), eVar);
        q qVar = this.f16592b;
        if (qVar != null) {
            qVar.c(eVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r7.n(r5) < r7.n(r6)) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.focus.FocusModifier d() {
        /*
            r9 = this;
            f0.e<androidx.compose.ui.focus.FocusModifier> r0 = r9.f16593c
            int r1 = r0.m()
            r2 = 0
            if (r1 <= 0) goto L_0x008a
            r3 = 0
            java.lang.Object[] r0 = r0.l()
        L_0x000e:
            r4 = r0[r3]
            androidx.compose.ui.focus.FocusModifier r4 = (androidx.compose.ui.focus.FocusModifier) r4
            if (r2 == 0) goto L_0x0085
            androidx.compose.ui.node.LayoutNodeWrapper r5 = r2.m()
            if (r5 == 0) goto L_0x0085
            androidx.compose.ui.node.LayoutNode r5 = r5.j1()
            if (r5 != 0) goto L_0x0021
            goto L_0x0085
        L_0x0021:
            androidx.compose.ui.node.LayoutNodeWrapper r6 = r4.m()
            if (r6 == 0) goto L_0x0086
            androidx.compose.ui.node.LayoutNode r6 = r6.j1()
            if (r6 != 0) goto L_0x002e
            goto L_0x0086
        L_0x002e:
            int r7 = r5.Y()
            int r8 = r6.Y()
            if (r7 <= r8) goto L_0x0040
            androidx.compose.ui.node.LayoutNode r5 = r5.u0()
            kotlin.jvm.internal.p.g(r5)
            goto L_0x002e
        L_0x0040:
            int r7 = r6.Y()
            int r8 = r5.Y()
            if (r7 <= r8) goto L_0x0052
            androidx.compose.ui.node.LayoutNode r6 = r6.u0()
            kotlin.jvm.internal.p.g(r6)
            goto L_0x0040
        L_0x0052:
            androidx.compose.ui.node.LayoutNode r7 = r5.u0()
            androidx.compose.ui.node.LayoutNode r8 = r6.u0()
            boolean r7 = kotlin.jvm.internal.p.e(r7, r8)
            if (r7 != 0) goto L_0x006f
            androidx.compose.ui.node.LayoutNode r5 = r5.u0()
            kotlin.jvm.internal.p.g(r5)
            androidx.compose.ui.node.LayoutNode r6 = r6.u0()
            kotlin.jvm.internal.p.g(r6)
            goto L_0x0052
        L_0x006f:
            androidx.compose.ui.node.LayoutNode r7 = r5.u0()
            kotlin.jvm.internal.p.g(r7)
            f0.e r7 = r7.A0()
            int r5 = r7.n(r5)
            int r6 = r7.n(r6)
            if (r5 >= r6) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r2 = r4
        L_0x0086:
            int r3 = r3 + 1
            if (r3 < r1) goto L_0x000e
        L_0x008a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.q.d():androidx.compose.ui.focus.FocusModifier");
    }

    /* renamed from: e */
    public q getValue() {
        return this;
    }

    public final void f(FocusModifier focusModifier) {
        p.j(focusModifier, "focusModifier");
        this.f16593c.r(focusModifier);
        q qVar = this.f16592b;
        if (qVar != null) {
            qVar.f(focusModifier);
        }
    }

    public final void g(e<FocusModifier> eVar) {
        p.j(eVar, "removedModifiers");
        this.f16593c.s(eVar);
        q qVar = this.f16592b;
        if (qVar != null) {
            qVar.g(eVar);
        }
    }

    public f<q> getKey() {
        return FocusRequesterModifierKt.b();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}
