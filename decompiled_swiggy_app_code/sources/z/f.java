package z;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.p;
import t0.b;
import t0.h;
import t0.k;
import t0.m;
import u0.r0;

/* compiled from: RoundedCornerShape.kt */
public final class f extends a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
        p.j(bVar, "topStart");
        p.j(bVar2, "topEnd");
        p.j(bVar3, "bottomEnd");
        p.j(bVar4, "bottomStart");
    }

    public r0 e(long j, float f11, float f12, float f13, float f14, LayoutDirection layoutDirection) {
        LayoutDirection layoutDirection2 = layoutDirection;
        p.j(layoutDirection2, "layoutDirection");
        if (((f11 + f12) + f13) + f14 == 0.0f) {
            return new r0.b(m.c(j));
        }
        h c11 = m.c(j);
        LayoutDirection layoutDirection3 = LayoutDirection.Ltr;
        return new r0.c(k.b(c11, b.b(layoutDirection2 == layoutDirection3 ? f11 : f12, 0.0f, 2, (Object) null), b.b(layoutDirection2 == layoutDirection3 ? f12 : f11, 0.0f, 2, (Object) null), b.b(layoutDirection2 == layoutDirection3 ? f13 : f14, 0.0f, 2, (Object) null), b.b(layoutDirection2 == layoutDirection3 ? f14 : f13, 0.0f, 2, (Object) null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p.e(i(), fVar.i()) && p.e(h(), fVar.h()) && p.e(f(), fVar.f()) && p.e(g(), fVar.g());
    }

    public int hashCode() {
        return (((((i().hashCode() * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    /* renamed from: j */
    public f c(b bVar, b bVar2, b bVar3, b bVar4) {
        p.j(bVar, "topStart");
        p.j(bVar2, "topEnd");
        p.j(bVar3, "bottomEnd");
        p.j(bVar4, "bottomStart");
        return new f(bVar, bVar2, bVar3, bVar4);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + i() + ", topEnd = " + h() + ", bottomEnd = " + f() + ", bottomStart = " + g() + ')';
    }
}
