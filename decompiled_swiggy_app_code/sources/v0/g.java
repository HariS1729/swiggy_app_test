package v0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: TransferParameters.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final double f17041a;

    /* renamed from: b  reason: collision with root package name */
    private final double f17042b;

    /* renamed from: c  reason: collision with root package name */
    private final double f17043c;

    /* renamed from: d  reason: collision with root package name */
    private final double f17044d;

    /* renamed from: e  reason: collision with root package name */
    private final double f17045e;

    /* renamed from: f  reason: collision with root package name */
    private final double f17046f;

    /* renamed from: g  reason: collision with root package name */
    private final double f17047g;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        if ((r2 == 0.0d) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0093, code lost:
        if ((r2 == 0.0d) != false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
        /*
            r1 = this;
            r1.<init>()
            r1.f17041a = r2
            r1.f17042b = r4
            r1.f17043c = r6
            r1.f17044d = r8
            r1.f17045e = r10
            r1.f17046f = r12
            r1.f17047g = r14
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r6)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r8)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r10)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r12)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r14)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r2)
            if (r6 != 0) goto L_0x00d9
            r6 = 0
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 < 0) goto L_0x00c2
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x00c2
            r14 = 1
            r15 = 0
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x004f
            r0 = 1
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 == 0) goto L_0x006d
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0058
            r0 = 1
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            if (r0 != 0) goto L_0x0065
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0061
            r0 = 1
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            if (r0 != 0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parameter a or g is zero, the transfer function is constant"
            r2.<init>(r3)
            throw r2
        L_0x006d:
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0083
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0077
            r10 = 1
            goto L_0x0078
        L_0x0077:
            r10 = 0
        L_0x0078:
            if (r10 != 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parameter c is zero, the transfer function is constant"
            r2.<init>(r3)
            throw r2
        L_0x0083:
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0089
            r10 = 1
            goto L_0x008a
        L_0x0089:
            r10 = 0
        L_0x008a:
            if (r10 != 0) goto L_0x0095
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0092
            r10 = 1
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x009d
        L_0x0095:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r14 = 0
        L_0x009b:
            if (r14 != 0) goto L_0x00ba
        L_0x009d:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x00b2
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x00aa
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x00aa
            return
        L_0x00aa:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The transfer function must be positive or increasing"
            r2.<init>(r3)
            throw r2
        L_0x00b2:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The transfer function must be increasing"
            r2.<init>(r3)
            throw r2
        L_0x00ba:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parameter a or g is zero, and c is zero, the transfer function is constant"
            r2.<init>(r3)
            throw r2
        L_0x00c2:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Parameter d must be in the range [0..1], was "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x00d9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parameters cannot be NaN"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.g.<init>(double, double, double, double, double, double, double):void");
    }

    public final double a() {
        return this.f17042b;
    }

    public final double b() {
        return this.f17043c;
    }

    public final double c() {
        return this.f17044d;
    }

    public final double d() {
        return this.f17045e;
    }

    public final double e() {
        return this.f17046f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p.e(Double.valueOf(this.f17041a), Double.valueOf(gVar.f17041a)) && p.e(Double.valueOf(this.f17042b), Double.valueOf(gVar.f17042b)) && p.e(Double.valueOf(this.f17043c), Double.valueOf(gVar.f17043c)) && p.e(Double.valueOf(this.f17044d), Double.valueOf(gVar.f17044d)) && p.e(Double.valueOf(this.f17045e), Double.valueOf(gVar.f17045e)) && p.e(Double.valueOf(this.f17046f), Double.valueOf(gVar.f17046f)) && p.e(Double.valueOf(this.f17047g), Double.valueOf(gVar.f17047g));
    }

    public final double f() {
        return this.f17047g;
    }

    public final double g() {
        return this.f17041a;
    }

    public int hashCode() {
        return (((((((((((Double.doubleToLongBits(this.f17041a) * 31) + Double.doubleToLongBits(this.f17042b)) * 31) + Double.doubleToLongBits(this.f17043c)) * 31) + Double.doubleToLongBits(this.f17044d)) * 31) + Double.doubleToLongBits(this.f17045e)) * 31) + Double.doubleToLongBits(this.f17046f)) * 31) + Double.doubleToLongBits(this.f17047g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f17041a + ", a=" + this.f17042b + ", b=" + this.f17043c + ", c=" + this.f17044d + ", d=" + this.f17045e + ", e=" + this.f17046f + ", f=" + this.f17047g + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(double d11, double d12, double d13, double d14, double d15, double d16, double d17, int i11, i iVar) {
        this(d11, d12, d13, d14, d15, (i11 & 32) != 0 ? 0.0d : d16, (i11 & 64) != 0 ? 0.0d : d17);
    }
}
