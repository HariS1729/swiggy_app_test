package androidx.compose.foundation.layout;

import d2.b;
import d2.e;
import d2.h;
import defpackage.a2;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p0.a;
import p0.d;

/* compiled from: BoxWithConstraints.kt */
final class c implements a2.f, a2.e {

    /* renamed from: a  reason: collision with root package name */
    private final e f3898a;

    /* renamed from: b  reason: collision with root package name */
    private final long f3899b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ BoxScopeInstance f3900c;

    private c(e eVar, long j) {
        this.f3898a = eVar;
        this.f3899b = j;
        this.f3900c = BoxScopeInstance.f3698a;
    }

    public /* synthetic */ c(e eVar, long j, i iVar) {
        this(eVar, j);
    }

    public float a() {
        return b.i(c()) ? this.f3898a.k(b.m(c())) : h.f13997b.b();
    }

    public d b(d dVar, a aVar) {
        p.j(dVar, "<this>");
        p.j(aVar, "alignment");
        return this.f3900c.b(dVar, aVar);
    }

    public long c() {
        return this.f3899b;
    }

    public d d(d dVar) {
        p.j(dVar, "<this>");
        return this.f3900c.d(dVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p.e(this.f3898a, cVar.f3898a) && b.g(c(), cVar.c());
    }

    public int hashCode() {
        return (this.f3898a.hashCode() * 31) + b.q(c());
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f3898a + ", constraints=" + b.s(c()) + ')';
    }
}
