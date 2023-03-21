package androidx.compose.ui.layout;

import bp0.k;
import d2.c;
import d2.q;
import i1.e0;
import i1.i;
import i1.j;
import i1.r;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.j0;

/* compiled from: LayoutModifier.kt */
final class MeasuringIntrinsics {

    /* renamed from: a  reason: collision with root package name */
    public static final MeasuringIntrinsics f6761a = new MeasuringIntrinsics();

    /* compiled from: LayoutModifier.kt */
    private enum IntrinsicMinMax {
        Min,
        Max
    }

    /* compiled from: LayoutModifier.kt */
    private enum IntrinsicWidthHeight {
        Width,
        Height
    }

    /* compiled from: LayoutModifier.kt */
    private static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        private final i f6762a;

        /* renamed from: b  reason: collision with root package name */
        private final IntrinsicMinMax f6763b;

        /* renamed from: c  reason: collision with root package name */
        private final IntrinsicWidthHeight f6764c;

        public a(i iVar, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            p.j(iVar, "measurable");
            p.j(intrinsicMinMax, "minMax");
            p.j(intrinsicWidthHeight, "widthHeight");
            this.f6762a = iVar;
            this.f6763b = intrinsicMinMax;
            this.f6764c = intrinsicWidthHeight;
        }

        public int J(int i11) {
            return this.f6762a.J(i11);
        }

        public int K(int i11) {
            return this.f6762a.K(i11);
        }

        public int L(int i11) {
            return this.f6762a.L(i11);
        }

        public e0 N(long j) {
            int i11;
            int i12;
            if (this.f6764c == IntrinsicWidthHeight.Width) {
                if (this.f6763b == IntrinsicMinMax.Max) {
                    i12 = this.f6762a.L(d2.b.m(j));
                } else {
                    i12 = this.f6762a.K(d2.b.m(j));
                }
                return new b(i12, d2.b.m(j));
            }
            if (this.f6763b == IntrinsicMinMax.Max) {
                i11 = this.f6762a.x(d2.b.n(j));
            } else {
                i11 = this.f6762a.J(d2.b.n(j));
            }
            return new b(d2.b.n(j), i11);
        }

        public Object p() {
            return this.f6762a.p();
        }

        public int x(int i11) {
            return this.f6762a.x(i11);
        }
    }

    /* compiled from: LayoutModifier.kt */
    private static final class b extends e0 {
        public b(int i11, int i12) {
            F0(q.a(i11, i12));
        }

        public int A(i1.a aVar) {
            p.j(aVar, "alignmentLine");
            return Integer.MIN_VALUE;
        }

        /* access modifiers changed from: protected */
        public void D0(long j, float f11, l<? super j0, k> lVar) {
        }
    }

    private MeasuringIntrinsics() {
    }

    public final int a(i1.q qVar, j jVar, i iVar, int i11) {
        p.j(qVar, "modifier");
        p.j(jVar, "instrinsicMeasureScope");
        p.j(iVar, "intrinsicMeasurable");
        return qVar.K(new i1.k(jVar, jVar.getLayoutDirection()), new a(iVar, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), c.b(0, i11, 0, 0, 13, (Object) null)).getHeight();
    }

    public final int b(i1.q qVar, j jVar, i iVar, int i11) {
        p.j(qVar, "modifier");
        p.j(jVar, "instrinsicMeasureScope");
        p.j(iVar, "intrinsicMeasurable");
        return qVar.K(new i1.k(jVar, jVar.getLayoutDirection()), new a(iVar, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), c.b(0, 0, 0, i11, 7, (Object) null)).getWidth();
    }

    public final int c(i1.q qVar, j jVar, i iVar, int i11) {
        p.j(qVar, "modifier");
        p.j(jVar, "instrinsicMeasureScope");
        p.j(iVar, "intrinsicMeasurable");
        return qVar.K(new i1.k(jVar, jVar.getLayoutDirection()), new a(iVar, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), c.b(0, i11, 0, 0, 13, (Object) null)).getHeight();
    }

    public final int d(i1.q qVar, j jVar, i iVar, int i11) {
        p.j(qVar, "modifier");
        p.j(jVar, "instrinsicMeasureScope");
        p.j(iVar, "intrinsicMeasurable");
        return qVar.K(new i1.k(jVar, jVar.getLayoutDirection()), new a(iVar, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), c.b(0, 0, 0, i11, 7, (Object) null)).getWidth();
    }
}
