package p1;

import a2.c;
import a2.d;
import a2.f;
import a2.j;
import d2.r;
import d2.s;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ParagraphStyle.kt */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final d f16147a;

    /* renamed from: b  reason: collision with root package name */
    private final f f16148b;

    /* renamed from: c  reason: collision with root package name */
    private final long f16149c;

    /* renamed from: d  reason: collision with root package name */
    private final j f16150d;

    /* renamed from: e  reason: collision with root package name */
    private final q f16151e;

    /* renamed from: f  reason: collision with root package name */
    private final c f16152f;

    public /* synthetic */ m(d dVar, f fVar, long j, j jVar, i iVar) {
        this(dVar, fVar, j, jVar);
    }

    private m(d dVar, f fVar, long j, j jVar, q qVar, c cVar) {
        this.f16147a = dVar;
        this.f16148b = fVar;
        this.f16149c = j;
        this.f16150d = jVar;
        this.f16151e = qVar;
        this.f16152f = cVar;
        if (!r.e(j, r.f14022b.a())) {
            if (!(r.h(j) >= 0.0f)) {
                throw new IllegalStateException(("lineHeight can't be negative (" + r.h(j) + ')').toString());
            }
        }
    }

    public /* synthetic */ m(d dVar, f fVar, long j, j jVar, q qVar, c cVar, i iVar) {
        this(dVar, fVar, j, jVar, qVar, cVar);
    }

    public static /* synthetic */ m b(m mVar, d dVar, f fVar, long j, j jVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = mVar.f16147a;
        }
        if ((i11 & 2) != 0) {
            fVar = mVar.f16148b;
        }
        f fVar2 = fVar;
        if ((i11 & 4) != 0) {
            j = mVar.f16149c;
        }
        long j11 = j;
        if ((i11 & 8) != 0) {
            jVar = mVar.f16150d;
        }
        return mVar.a(dVar, fVar2, j11, jVar);
    }

    private final q j(q qVar) {
        q qVar2 = this.f16151e;
        if (qVar2 == null) {
            return qVar;
        }
        if (qVar == null) {
            return qVar2;
        }
        return qVar2.c(qVar);
    }

    public final m a(d dVar, f fVar, long j, j jVar) {
        return new m(dVar, fVar, j, jVar, this.f16151e, this.f16152f, (i) null);
    }

    public final long c() {
        return this.f16149c;
    }

    public final c d() {
        return this.f16152f;
    }

    public final q e() {
        return this.f16151e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p.e(this.f16147a, mVar.f16147a) && p.e(this.f16148b, mVar.f16148b) && r.e(this.f16149c, mVar.f16149c) && p.e(this.f16150d, mVar.f16150d) && p.e(this.f16151e, mVar.f16151e) && p.e(this.f16152f, mVar.f16152f);
    }

    public final d f() {
        return this.f16147a;
    }

    public final f g() {
        return this.f16148b;
    }

    public final j h() {
        return this.f16150d;
    }

    public int hashCode() {
        d dVar = this.f16147a;
        int i11 = 0;
        int k = (dVar != null ? d.k(dVar.m()) : 0) * 31;
        f fVar = this.f16148b;
        int j = (((k + (fVar != null ? f.j(fVar.l()) : 0)) * 31) + r.i(this.f16149c)) * 31;
        j jVar = this.f16150d;
        int hashCode = (j + (jVar != null ? jVar.hashCode() : 0)) * 31;
        q qVar = this.f16151e;
        int hashCode2 = (hashCode + (qVar != null ? qVar.hashCode() : 0)) * 31;
        c cVar = this.f16152f;
        if (cVar != null) {
            i11 = cVar.hashCode();
        }
        return hashCode2 + i11;
    }

    public final m i(m mVar) {
        long j;
        if (mVar == null) {
            return this;
        }
        if (s.g(mVar.f16149c)) {
            j = this.f16149c;
        } else {
            j = mVar.f16149c;
        }
        long j11 = j;
        j jVar = mVar.f16150d;
        if (jVar == null) {
            jVar = this.f16150d;
        }
        j jVar2 = jVar;
        d dVar = mVar.f16147a;
        if (dVar == null) {
            dVar = this.f16147a;
        }
        d dVar2 = dVar;
        f fVar = mVar.f16148b;
        if (fVar == null) {
            fVar = this.f16148b;
        }
        f fVar2 = fVar;
        q j12 = j(mVar.f16151e);
        c cVar = mVar.f16152f;
        if (cVar == null) {
            cVar = this.f16152f;
        }
        return new m(dVar2, fVar2, j11, jVar2, j12, cVar, (i) null);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + this.f16147a + ", textDirection=" + this.f16148b + ", lineHeight=" + r.j(this.f16149c) + ", textIndent=" + this.f16150d + ", platformStyle=" + this.f16151e + ", lineHeightStyle=" + this.f16152f + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(d dVar, f fVar, long j, j jVar, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : dVar, (i11 & 2) != 0 ? null : fVar, (i11 & 4) != 0 ? r.f14022b.a() : j, (i11 & 8) != 0 ? null : jVar, (i) null);
    }

    private m(d dVar, f fVar, long j, j jVar) {
        this(dVar, fVar, j, jVar, (q) null, (c) null, (i) null);
    }
}
