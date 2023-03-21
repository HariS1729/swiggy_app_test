package d1;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import i1.a0;
import i1.m;
import j1.b;
import j1.d;
import j1.f;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import s0.t;

/* compiled from: KeyInputModifier.kt */
public final class e implements b, d<e>, a0 {

    /* renamed from: a  reason: collision with root package name */
    private final l<b, Boolean> f13985a;

    /* renamed from: b  reason: collision with root package name */
    private final l<b, Boolean> f13986b;

    /* renamed from: c  reason: collision with root package name */
    private FocusModifier f13987c;

    /* renamed from: d  reason: collision with root package name */
    private e f13988d;

    /* renamed from: e  reason: collision with root package name */
    private LayoutNode f13989e;

    public e(l<? super b, Boolean> lVar, l<? super b, Boolean> lVar2) {
        this.f13985a = lVar;
        this.f13986b = lVar2;
    }

    public void D(j1.e eVar) {
        f0.e<e> k;
        f0.e<e> k11;
        p.j(eVar, "scope");
        FocusModifier focusModifier = this.f13987c;
        if (!(focusModifier == null || (k11 = focusModifier.k()) == null)) {
            k11.r(this);
        }
        FocusModifier focusModifier2 = (FocusModifier) eVar.a(FocusModifierKt.c());
        this.f13987c = focusModifier2;
        if (!(focusModifier2 == null || (k = focusModifier2.k()) == null)) {
            k.b(this);
        }
        this.f13988d = (e) eVar.a(KeyInputModifierKt.a());
    }

    public void J(m mVar) {
        p.j(mVar, "coordinates");
        this.f13989e = ((LayoutNodeWrapper) mVar).j1();
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public final LayoutNode a() {
        return this.f13989e;
    }

    public final e c() {
        return this.f13988d;
    }

    /* renamed from: d */
    public e getValue() {
        return this;
    }

    public final boolean e(KeyEvent keyEvent) {
        FocusModifier b11;
        e d11;
        p.j(keyEvent, "keyEvent");
        FocusModifier focusModifier = this.f13987c;
        if (focusModifier == null || (b11 = t.b(focusModifier)) == null || (d11 = t.d(b11)) == null) {
            throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
        } else if (d11.g(keyEvent)) {
            return true;
        } else {
            return d11.f(keyEvent);
        }
    }

    public final boolean f(KeyEvent keyEvent) {
        p.j(keyEvent, "keyEvent");
        l<b, Boolean> lVar = this.f13985a;
        Boolean invoke = lVar != null ? lVar.invoke(b.a(keyEvent)) : null;
        if (p.e(invoke, Boolean.TRUE)) {
            return invoke.booleanValue();
        }
        e eVar = this.f13988d;
        if (eVar != null) {
            return eVar.f(keyEvent);
        }
        return false;
    }

    public final boolean g(KeyEvent keyEvent) {
        p.j(keyEvent, "keyEvent");
        e eVar = this.f13988d;
        Boolean valueOf = eVar != null ? Boolean.valueOf(eVar.g(keyEvent)) : null;
        if (p.e(valueOf, Boolean.TRUE)) {
            return valueOf.booleanValue();
        }
        l<b, Boolean> lVar = this.f13986b;
        if (lVar != null) {
            return lVar.invoke(b.a(keyEvent)).booleanValue();
        }
        return false;
    }

    public f<e> getKey() {
        return KeyInputModifierKt.a();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}
