package i1;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import d2.b;
import kotlin.jvm.internal.p;

/* compiled from: Layout.kt */
public final class e implements r {

    /* renamed from: a  reason: collision with root package name */
    private final i f14873a;

    /* renamed from: b  reason: collision with root package name */
    private final IntrinsicMinMax f14874b;

    /* renamed from: c  reason: collision with root package name */
    private final IntrinsicWidthHeight f14875c;

    public e(i iVar, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        p.j(iVar, "measurable");
        p.j(intrinsicMinMax, "minMax");
        p.j(intrinsicWidthHeight, "widthHeight");
        this.f14873a = iVar;
        this.f14874b = intrinsicMinMax;
        this.f14875c = intrinsicWidthHeight;
    }

    public int J(int i11) {
        return this.f14873a.J(i11);
    }

    public int K(int i11) {
        return this.f14873a.K(i11);
    }

    public int L(int i11) {
        return this.f14873a.L(i11);
    }

    public e0 N(long j) {
        int i11;
        int i12;
        if (this.f14875c == IntrinsicWidthHeight.Width) {
            if (this.f14874b == IntrinsicMinMax.Max) {
                i12 = this.f14873a.L(b.m(j));
            } else {
                i12 = this.f14873a.K(b.m(j));
            }
            return new g(i12, b.m(j));
        }
        if (this.f14874b == IntrinsicMinMax.Max) {
            i11 = this.f14873a.x(b.n(j));
        } else {
            i11 = this.f14873a.J(b.n(j));
        }
        return new g(b.n(j), i11);
    }

    public Object p() {
        return this.f14873a.p();
    }

    public int x(int i11) {
        return this.f14873a.x(i11);
    }
}
