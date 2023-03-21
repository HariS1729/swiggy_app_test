package u1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FontFamilyResolver.kt */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final i f16925a;

    /* renamed from: b  reason: collision with root package name */
    private final v f16926b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16927c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16928d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f16929e;

    private l0(i iVar, v vVar, int i11, int i12, Object obj) {
        this.f16925a = iVar;
        this.f16926b = vVar;
        this.f16927c = i11;
        this.f16928d = i12;
        this.f16929e = obj;
    }

    public /* synthetic */ l0(i iVar, v vVar, int i11, int i12, Object obj, i iVar2) {
        this(iVar, vVar, i11, i12, obj);
    }

    public static /* synthetic */ l0 b(l0 l0Var, i iVar, v vVar, int i11, int i12, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            iVar = l0Var.f16925a;
        }
        if ((i13 & 2) != 0) {
            vVar = l0Var.f16926b;
        }
        v vVar2 = vVar;
        if ((i13 & 4) != 0) {
            i11 = l0Var.f16927c;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            i12 = l0Var.f16928d;
        }
        int i15 = i12;
        if ((i13 & 16) != 0) {
            obj = l0Var.f16929e;
        }
        return l0Var.a(iVar, vVar2, i14, i15, obj);
    }

    public final l0 a(i iVar, v vVar, int i11, int i12, Object obj) {
        p.j(vVar, "fontWeight");
        return new l0(iVar, vVar, i11, i12, obj, (i) null);
    }

    public final i c() {
        return this.f16925a;
    }

    public final int d() {
        return this.f16927c;
    }

    public final int e() {
        return this.f16928d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return p.e(this.f16925a, l0Var.f16925a) && p.e(this.f16926b, l0Var.f16926b) && s.f(this.f16927c, l0Var.f16927c) && t.h(this.f16928d, l0Var.f16928d) && p.e(this.f16929e, l0Var.f16929e);
    }

    public final v f() {
        return this.f16926b;
    }

    public int hashCode() {
        i iVar = this.f16925a;
        int i11 = 0;
        int hashCode = (((((((iVar == null ? 0 : iVar.hashCode()) * 31) + this.f16926b.hashCode()) * 31) + s.g(this.f16927c)) * 31) + t.i(this.f16928d)) * 31;
        Object obj = this.f16929e;
        if (obj != null) {
            i11 = obj.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f16925a + ", fontWeight=" + this.f16926b + ", fontStyle=" + s.h(this.f16927c) + ", fontSynthesis=" + t.l(this.f16928d) + ", resourceLoaderCacheKey=" + this.f16929e + ')';
    }
}
