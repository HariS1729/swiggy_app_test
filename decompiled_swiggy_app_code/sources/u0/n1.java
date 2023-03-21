package u0;

import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.f;
import t0.g;
import t0.l;
import t0.m;

/* compiled from: Brush.kt */
public final class n1 extends f1 {

    /* renamed from: e  reason: collision with root package name */
    private final long f16842e;

    /* renamed from: f  reason: collision with root package name */
    private final List<d0> f16843f;

    /* renamed from: g  reason: collision with root package name */
    private final List<Float> f16844g;

    private n1(long j, List<d0> list, List<Float> list2) {
        this.f16842e = j;
        this.f16843f = list;
        this.f16844g = list2;
    }

    public /* synthetic */ n1(long j, List list, List list2, i iVar) {
        this(j, list, list2);
    }

    public Shader b(long j) {
        long j11;
        if (g.d(this.f16842e)) {
            j11 = m.b(j);
        } else {
            boolean z11 = true;
            float i11 = (f.m(this.f16842e) > Float.POSITIVE_INFINITY ? 1 : (f.m(this.f16842e) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? l.i(j) : f.m(this.f16842e);
            if (f.n(this.f16842e) != Float.POSITIVE_INFINITY) {
                z11 = false;
            }
            j11 = g.a(i11, z11 ? l.g(j) : f.n(this.f16842e));
        }
        return g1.b(j11, this.f16843f, this.f16844g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return f.j(this.f16842e, n1Var.f16842e) && p.e(this.f16843f, n1Var.f16843f) && p.e(this.f16844g, n1Var.f16844g);
    }

    public int hashCode() {
        int o11 = ((f.o(this.f16842e) * 31) + this.f16843f.hashCode()) * 31;
        List<Float> list = this.f16844g;
        return o11 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str;
        if (g.c(this.f16842e)) {
            str = "center=" + f.t(this.f16842e) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.f16843f + ", stops=" + this.f16844g + ')';
    }
}
