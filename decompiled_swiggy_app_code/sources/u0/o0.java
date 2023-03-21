package u0;

import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.f;
import t0.g;
import t0.l;

/* compiled from: Brush.kt */
public final class o0 extends f1 {

    /* renamed from: e  reason: collision with root package name */
    private final List<d0> f16845e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Float> f16846f;

    /* renamed from: g  reason: collision with root package name */
    private final long f16847g;

    /* renamed from: h  reason: collision with root package name */
    private final long f16848h;

    /* renamed from: i  reason: collision with root package name */
    private final int f16849i;

    private o0(List<d0> list, List<Float> list2, long j, long j11, int i11) {
        this.f16845e = list;
        this.f16846f = list2;
        this.f16847g = j;
        this.f16848h = j11;
        this.f16849i = i11;
    }

    public /* synthetic */ o0(List list, List list2, long j, long j11, int i11, i iVar) {
        this(list, list2, j, j11, i11);
    }

    public Shader b(long j) {
        boolean z11 = true;
        float i11 = (f.m(this.f16847g) > Float.POSITIVE_INFINITY ? 1 : (f.m(this.f16847g) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? l.i(j) : f.m(this.f16847g);
        float g11 = (f.n(this.f16847g) > Float.POSITIVE_INFINITY ? 1 : (f.n(this.f16847g) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? l.g(j) : f.n(this.f16847g);
        float i12 = (f.m(this.f16848h) > Float.POSITIVE_INFINITY ? 1 : (f.m(this.f16848h) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? l.i(j) : f.m(this.f16848h);
        if (f.n(this.f16848h) != Float.POSITIVE_INFINITY) {
            z11 = false;
        }
        return g1.a(g.a(i11, g11), g.a(i12, z11 ? l.g(j) : f.n(this.f16848h)), this.f16845e, this.f16846f, this.f16849i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return p.e(this.f16845e, o0Var.f16845e) && p.e(this.f16846f, o0Var.f16846f) && f.j(this.f16847g, o0Var.f16847g) && f.j(this.f16848h, o0Var.f16848h) && o1.f(this.f16849i, o0Var.f16849i);
    }

    public int hashCode() {
        int hashCode = this.f16845e.hashCode() * 31;
        List<Float> list = this.f16846f;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + f.o(this.f16847g)) * 31) + f.o(this.f16848h)) * 31) + o1.g(this.f16849i);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (g.b(this.f16847g)) {
            str = "start=" + f.t(this.f16847g) + ", ";
        } else {
            str = str2;
        }
        if (g.b(this.f16848h)) {
            str2 = "end=" + f.t(this.f16848h) + ", ";
        }
        return "LinearGradient(colors=" + this.f16845e + ", stops=" + this.f16846f + ", " + str + str2 + "tileMode=" + o1.h(this.f16849i) + ')';
    }
}
