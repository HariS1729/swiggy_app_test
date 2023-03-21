package p;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: EnterExitTransition.kt */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final f f16015a;

    /* renamed from: b  reason: collision with root package name */
    private final m f16016b;

    /* renamed from: c  reason: collision with root package name */
    private final d f16017c;

    /* renamed from: d  reason: collision with root package name */
    private final j f16018d;

    public q() {
        this((f) null, (m) null, (d) null, (j) null, 15, (i) null);
    }

    public q(f fVar, m mVar, d dVar, j jVar) {
        this.f16015a = fVar;
        this.f16016b = mVar;
        this.f16017c = dVar;
        this.f16018d = jVar;
    }

    public final d a() {
        return this.f16017c;
    }

    public final f b() {
        return this.f16015a;
    }

    public final j c() {
        return this.f16018d;
    }

    public final m d() {
        return this.f16016b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p.e(this.f16015a, qVar.f16015a) && p.e(this.f16016b, qVar.f16016b) && p.e(this.f16017c, qVar.f16017c) && p.e(this.f16018d, qVar.f16018d);
    }

    public int hashCode() {
        f fVar = this.f16015a;
        int i11 = 0;
        int hashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        m mVar = this.f16016b;
        int hashCode2 = (hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        d dVar = this.f16017c;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        j jVar = this.f16018d;
        if (jVar != null) {
            i11 = jVar.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        return "TransitionData(fade=" + this.f16015a + ", slide=" + this.f16016b + ", changeSize=" + this.f16017c + ", scale=" + this.f16018d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(f fVar, m mVar, d dVar, j jVar, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : fVar, (i11 & 2) != 0 ? null : mVar, (i11 & 4) != 0 ? null : dVar, (i11 & 8) != 0 ? null : jVar);
    }
}
