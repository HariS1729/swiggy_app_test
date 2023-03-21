package y0;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import u0.l1;
import u0.m1;
import u0.u;
import u0.y0;

/* compiled from: ImageVector.kt */
public final class o extends n {

    /* renamed from: a  reason: collision with root package name */
    private final String f17982a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f17983b;

    /* renamed from: c  reason: collision with root package name */
    private final int f17984c;

    /* renamed from: d  reason: collision with root package name */
    private final u f17985d;

    /* renamed from: e  reason: collision with root package name */
    private final float f17986e;

    /* renamed from: f  reason: collision with root package name */
    private final u f17987f;

    /* renamed from: g  reason: collision with root package name */
    private final float f17988g;

    /* renamed from: h  reason: collision with root package name */
    private final float f17989h;

    /* renamed from: i  reason: collision with root package name */
    private final int f17990i;
    private final int j;
    private final float k;

    /* renamed from: l  reason: collision with root package name */
    private final float f17991l;

    /* renamed from: m  reason: collision with root package name */
    private final float f17992m;
    private final float n;

    private o(String str, List<? extends d> list, int i11, u uVar, float f11, u uVar2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17) {
        super((i) null);
        this.f17982a = str;
        this.f17983b = list;
        this.f17984c = i11;
        this.f17985d = uVar;
        this.f17986e = f11;
        this.f17987f = uVar2;
        this.f17988g = f12;
        this.f17989h = f13;
        this.f17990i = i12;
        this.j = i13;
        this.k = f14;
        this.f17991l = f15;
        this.f17992m = f16;
        this.n = f17;
    }

    public /* synthetic */ o(String str, List list, int i11, u uVar, float f11, u uVar2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17, i iVar) {
        this(str, list, i11, uVar, f11, uVar2, f12, f13, i12, i13, f14, f15, f16, f17);
    }

    public final u c() {
        return this.f17985d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.e(s.b(o.class), s.b(obj.getClass()))) {
            return false;
        }
        o oVar = (o) obj;
        if (!p.e(this.f17982a, oVar.f17982a) || !p.e(this.f17985d, oVar.f17985d)) {
            return false;
        }
        if (!(this.f17986e == oVar.f17986e) || !p.e(this.f17987f, oVar.f17987f)) {
            return false;
        }
        if (!(this.f17988g == oVar.f17988g)) {
            return false;
        }
        if (!(this.f17989h == oVar.f17989h) || !l1.g(this.f17990i, oVar.f17990i) || !m1.g(this.j, oVar.j)) {
            return false;
        }
        if (!(this.k == oVar.k)) {
            return false;
        }
        if (!(this.f17991l == oVar.f17991l)) {
            return false;
        }
        if (!(this.f17992m == oVar.f17992m)) {
            return false;
        }
        return ((this.n > oVar.n ? 1 : (this.n == oVar.n ? 0 : -1)) == 0) && y0.f(this.f17984c, oVar.f17984c) && p.e(this.f17983b, oVar.f17983b);
    }

    public final float f() {
        return this.f17986e;
    }

    public final String g() {
        return this.f17982a;
    }

    public final List<d> h() {
        return this.f17983b;
    }

    public int hashCode() {
        int hashCode = ((this.f17982a.hashCode() * 31) + this.f17983b.hashCode()) * 31;
        u uVar = this.f17985d;
        int i11 = 0;
        int hashCode2 = (((hashCode + (uVar != null ? uVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f17986e)) * 31;
        u uVar2 = this.f17987f;
        if (uVar2 != null) {
            i11 = uVar2.hashCode();
        }
        return ((((((((((((((((((hashCode2 + i11) * 31) + Float.floatToIntBits(this.f17988g)) * 31) + Float.floatToIntBits(this.f17989h)) * 31) + l1.h(this.f17990i)) * 31) + m1.h(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.f17991l)) * 31) + Float.floatToIntBits(this.f17992m)) * 31) + Float.floatToIntBits(this.n)) * 31) + y0.g(this.f17984c);
    }

    public final int i() {
        return this.f17984c;
    }

    public final u k() {
        return this.f17987f;
    }

    public final float l() {
        return this.f17988g;
    }

    public final int m() {
        return this.f17990i;
    }

    public final int n() {
        return this.j;
    }

    public final float o() {
        return this.k;
    }

    public final float p() {
        return this.f17989h;
    }

    public final float q() {
        return this.f17992m;
    }

    public final float r() {
        return this.n;
    }

    public final float s() {
        return this.f17991l;
    }
}
