package z;

import androidx.compose.ui.unit.LayoutDirection;
import d2.e;
import kotlin.jvm.internal.p;
import t0.l;
import u0.j1;
import u0.r0;

/* compiled from: CornerBasedShape.kt */
public abstract class a implements j1 {

    /* renamed from: a  reason: collision with root package name */
    private final b f18034a;

    /* renamed from: b  reason: collision with root package name */
    private final b f18035b;

    /* renamed from: c  reason: collision with root package name */
    private final b f18036c;

    /* renamed from: d  reason: collision with root package name */
    private final b f18037d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        p.j(bVar, "topStart");
        p.j(bVar2, "topEnd");
        p.j(bVar3, "bottomEnd");
        p.j(bVar4, "bottomStart");
        this.f18034a = bVar;
        this.f18035b = bVar2;
        this.f18036c = bVar3;
        this.f18037d = bVar4;
    }

    public static /* synthetic */ a d(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                bVar = aVar.f18034a;
            }
            if ((i11 & 2) != 0) {
                bVar2 = aVar.f18035b;
            }
            if ((i11 & 4) != 0) {
                bVar3 = aVar.f18036c;
            }
            if ((i11 & 8) != 0) {
                bVar4 = aVar.f18037d;
            }
            return aVar.c(bVar, bVar2, bVar3, bVar4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final r0 a(long j, LayoutDirection layoutDirection, e eVar) {
        p.j(layoutDirection, "layoutDirection");
        p.j(eVar, "density");
        float a11 = this.f18034a.a(j, eVar);
        float a12 = this.f18035b.a(j, eVar);
        float a13 = this.f18036c.a(j, eVar);
        float a14 = this.f18037d.a(j, eVar);
        float h11 = l.h(j);
        float f11 = a11 + a14;
        if (f11 > h11) {
            float f12 = h11 / f11;
            a11 *= f12;
            a14 *= f12;
        }
        float f13 = a14;
        float f14 = a12 + a13;
        if (f14 > h11) {
            float f15 = h11 / f14;
            a12 *= f15;
            a13 *= f15;
        }
        if (a11 >= 0.0f && a12 >= 0.0f && a13 >= 0.0f && f13 >= 0.0f) {
            return e(j, a11, a12, a13, f13, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a11 + ", topEnd = " + a12 + ", bottomEnd = " + a13 + ", bottomStart = " + f13 + ")!").toString());
    }

    public final a b(b bVar) {
        p.j(bVar, "all");
        return c(bVar, bVar, bVar, bVar);
    }

    public abstract a c(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract r0 e(long j, float f11, float f12, float f13, float f14, LayoutDirection layoutDirection);

    public final b f() {
        return this.f18036c;
    }

    public final b g() {
        return this.f18037d;
    }

    public final b h() {
        return this.f18035b;
    }

    public final b i() {
        return this.f18034a;
    }
}
