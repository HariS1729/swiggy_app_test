package androidx.constraintlayout.compose;

import bp0.k;
import f2.b;
import i1.o;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstraintLayout.kt */
final class c implements o {

    /* renamed from: a  reason: collision with root package name */
    private final b f8003a;

    /* renamed from: b  reason: collision with root package name */
    private final l<ConstrainScope, k> f8004b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f8005c;

    public c(b bVar, l<? super ConstrainScope, k> lVar) {
        p.j(bVar, "ref");
        p.j(lVar, "constrain");
        this.f8003a = bVar;
        this.f8004b = lVar;
        this.f8005c = bVar.c();
    }

    public Object a() {
        return this.f8005c;
    }

    public final l<ConstrainScope, k> b() {
        return this.f8004b;
    }

    public final b c() {
        return this.f8003a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return p.e(this.f8003a.c(), cVar.f8003a.c()) && p.e(this.f8004b, cVar.f8004b);
        }
    }

    public int hashCode() {
        return (this.f8003a.c().hashCode() * 31) + this.f8004b.hashCode();
    }
}
