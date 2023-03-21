package androidx.compose.ui;

import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import p0.d;

/* compiled from: Modifier.kt */
public final class CombinedModifier implements d {

    /* renamed from: a  reason: collision with root package name */
    private final d f6311a;

    /* renamed from: b  reason: collision with root package name */
    private final d f6312b;

    public CombinedModifier(d dVar, d dVar2) {
        p.j(dVar, "outer");
        p.j(dVar2, "inner");
        this.f6311a = dVar;
        this.f6312b = dVar2;
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public <R> R W(R r11, lp0.p<? super d.b, ? super R, ? extends R> pVar) {
        p.j(pVar, "operation");
        return this.f6311a.W(this.f6312b.W(r11, pVar), pVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            return p.e(this.f6311a, combinedModifier.f6311a) && p.e(this.f6312b, combinedModifier.f6312b);
        }
    }

    public int hashCode() {
        return this.f6311a.hashCode() + (this.f6312b.hashCode() * 31);
    }

    public <R> R s(R r11, lp0.p<? super R, ? super d.b, ? extends R> pVar) {
        p.j(pVar, "operation");
        return this.f6312b.s(this.f6311a.s(r11, pVar), pVar);
    }

    public String toString() {
        return '[' + ((String) s("", CombinedModifier$toString$1.f6313a)) + ']';
    }

    public boolean x(l<? super d.b, Boolean> lVar) {
        p.j(lVar, "predicate");
        return this.f6311a.x(lVar) && this.f6312b.x(lVar);
    }
}
