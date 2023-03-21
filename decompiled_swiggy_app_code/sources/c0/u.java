package c0;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import d2.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import z.a;
import z.g;

/* compiled from: Shapes.kt */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final a f12746a;

    /* renamed from: b  reason: collision with root package name */
    private final a f12747b;

    /* renamed from: c  reason: collision with root package name */
    private final a f12748c;

    public u() {
        this((a) null, (a) null, (a) null, 7, (i) null);
    }

    public u(a aVar, a aVar2, a aVar3) {
        p.j(aVar, "small");
        p.j(aVar2, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM);
        p.j(aVar3, "large");
        this.f12746a = aVar;
        this.f12747b = aVar2;
        this.f12748c = aVar3;
    }

    public final a a() {
        return this.f12748c;
    }

    public final a b() {
        return this.f12747b;
    }

    public final a c() {
        return this.f12746a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p.e(this.f12746a, uVar.f12746a) && p.e(this.f12747b, uVar.f12747b) && p.e(this.f12748c, uVar.f12748c);
    }

    public int hashCode() {
        return (((this.f12746a.hashCode() * 31) + this.f12747b.hashCode()) * 31) + this.f12748c.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.f12746a + ", medium=" + this.f12747b + ", large=" + this.f12748c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(a aVar, a aVar2, a aVar3, int i11, i iVar) {
        this((i11 & 1) != 0 ? g.c(h.n((float) 4)) : aVar, (i11 & 2) != 0 ? g.c(h.n((float) 4)) : aVar2, (i11 & 4) != 0 ? g.c(h.n((float) 0)) : aVar3);
    }
}
