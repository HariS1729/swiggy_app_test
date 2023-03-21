package y0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.w0;
import y0.d;

/* compiled from: PathParser.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final List<d> f17956a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final b f17957b = new b(0.0f, 0.0f, 3, (i) null);

    /* renamed from: c  reason: collision with root package name */
    private final b f17958c = new b(0.0f, 0.0f, 3, (i) null);

    /* renamed from: d  reason: collision with root package name */
    private final b f17959d = new b(0.0f, 0.0f, 3, (i) null);

    /* renamed from: e  reason: collision with root package name */
    private final b f17960e = new b(0.0f, 0.0f, 3, (i) null);

    /* compiled from: PathParser.kt */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private float f17963a;

        /* renamed from: b  reason: collision with root package name */
        private float f17964b;

        public b() {
            this(0.0f, 0.0f, 3, (i) null);
        }

        public b(float f11, float f12) {
            this.f17963a = f11;
            this.f17964b = f12;
        }

        public final float a() {
            return this.f17963a;
        }

        public final float b() {
            return this.f17964b;
        }

        public final void c() {
            this.f17963a = 0.0f;
            this.f17964b = 0.0f;
        }

        public final void d(float f11) {
            this.f17963a = f11;
        }

        public final void e(float f11) {
            this.f17964b = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p.e(Float.valueOf(this.f17963a), Float.valueOf(bVar.f17963a)) && p.e(Float.valueOf(this.f17964b), Float.valueOf(bVar.f17964b));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f17963a) * 31) + Float.floatToIntBits(this.f17964b);
        }

        public String toString() {
            return "PathPoint(x=" + this.f17963a + ", y=" + this.f17964b + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(float f11, float f12, int i11, i iVar) {
            this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12);
        }
    }

    private final void A(d.q qVar, boolean z11, w0 w0Var) {
        if (z11) {
            this.f17960e.d(this.f17957b.a() - this.f17958c.a());
            this.f17960e.e(this.f17957b.b() - this.f17958c.b());
        } else {
            this.f17960e.c();
        }
        w0Var.d(this.f17960e.a(), this.f17960e.b(), qVar.c(), qVar.d());
        this.f17958c.d(this.f17957b.a() + this.f17960e.a());
        this.f17958c.e(this.f17957b.b() + this.f17960e.b());
        b bVar = this.f17957b;
        bVar.d(bVar.a() + qVar.c());
        b bVar2 = this.f17957b;
        bVar2.e(bVar2.b() + qVar.d());
    }

    private final void B(d.r rVar, w0 w0Var) {
        w0Var.q(0.0f, rVar.c());
        b bVar = this.f17957b;
        bVar.e(bVar.b() + rVar.c());
    }

    private final double E(double d11) {
        return (d11 / ((double) 180)) * 3.141592653589793d;
    }

    private final void F(d.s sVar, w0 w0Var) {
        w0Var.j(this.f17957b.a(), sVar.c());
        this.f17957b.e(sVar.c());
    }

    private final void a(char c11, float[] fArr) {
        this.f17956a.addAll(e.a(c11, fArr));
    }

    private final void c(d.a aVar, w0 w0Var) {
        i(w0Var, (double) this.f17957b.a(), (double) this.f17957b.b(), (double) aVar.c(), (double) aVar.d(), (double) aVar.e(), (double) aVar.g(), (double) aVar.f(), aVar.h(), aVar.i());
        this.f17957b.d(aVar.c());
        this.f17957b.e(aVar.d());
        this.f17958c.d(this.f17957b.a());
        this.f17958c.e(this.f17957b.b());
    }

    private final void d(w0 w0Var, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        double d21 = d13;
        double d22 = (double) 4;
        int ceil = (int) Math.ceil(Math.abs((d19 * d22) / 3.141592653589793d));
        double cos = Math.cos(d17);
        double sin = Math.sin(d17);
        double cos2 = Math.cos(d18);
        double sin2 = Math.sin(d18);
        double d23 = -d21;
        double d24 = d23 * cos;
        double d25 = d14 * sin;
        double d26 = (d24 * sin2) - (d25 * cos2);
        double d27 = d23 * sin;
        double d28 = d14 * cos;
        double d29 = (sin2 * d27) + (cos2 * d28);
        double d31 = d19 / ((double) ceil);
        double d32 = d15;
        double d33 = d18;
        double d34 = d29;
        double d35 = d26;
        int i11 = 0;
        double d36 = d16;
        while (i11 < ceil) {
            double d37 = d33 + d31;
            double sin3 = Math.sin(d37);
            double cos3 = Math.cos(d37);
            int i12 = ceil;
            double d38 = (d11 + ((d21 * cos) * cos3)) - (d25 * sin3);
            double d39 = d12 + (d21 * sin * cos3) + (d28 * sin3);
            double d41 = (d24 * sin3) - (d25 * cos3);
            double d42 = (sin3 * d27) + (cos3 * d28);
            double d43 = d37 - d33;
            double tan = Math.tan(d43 / ((double) 2));
            double d44 = d22;
            double sin4 = (Math.sin(d43) * (Math.sqrt(d22 + ((3.0d * tan) * tan)) - ((double) 1))) / ((double) 3);
            double d45 = d32;
            w0Var.n((float) (d45 + (d35 * sin4)), (float) (d36 + (d34 * sin4)), (float) (d38 - (sin4 * d41)), (float) (d39 - (sin4 * d42)), (float) d38, (float) d39);
            i11++;
            d31 = d31;
            sin = sin;
            d32 = d38;
            d27 = d27;
            d33 = d37;
            d34 = d42;
            d22 = d44;
            d35 = d41;
            cos = cos;
            ceil = i12;
            d36 = d39;
            d21 = d13;
        }
    }

    private final void f(w0 w0Var) {
        this.f17957b.d(this.f17959d.a());
        this.f17957b.e(this.f17959d.b());
        this.f17958c.d(this.f17959d.a());
        this.f17958c.e(this.f17959d.b());
        w0Var.close();
        w0Var.i(this.f17957b.a(), this.f17957b.b());
    }

    private final float[] g(float[] fArr, int i11, int i12) {
        if (i11 <= i12) {
            int length = fArr.length;
            if (i11 < 0 || i11 > length) {
                throw new IndexOutOfBoundsException();
            }
            int i13 = i12 - i11;
            int min = Math.min(i13, length - i11);
            float[] fArr2 = new float[i13];
            float[] unused = g.g(fArr, fArr2, 0, i11, min + i11);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    private final void h(d.c cVar, w0 w0Var) {
        w0Var.n(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
        this.f17958c.d(cVar.d());
        this.f17958c.e(cVar.g());
        this.f17957b.d(cVar.e());
        this.f17957b.e(cVar.h());
    }

    private final void i(w0 w0Var, double d11, double d12, double d13, double d14, double d15, double d16, double d17, boolean z11, boolean z12) {
        double d18;
        double d19;
        double d21 = d11;
        double d22 = d13;
        boolean z13 = z12;
        double E = E(d17);
        double cos = Math.cos(E);
        double sin = Math.sin(E);
        double d23 = ((d21 * cos) + (d12 * sin)) / d15;
        double d24 = (((-d21) * sin) + (d12 * cos)) / d16;
        double d25 = ((d22 * cos) + (d14 * sin)) / d15;
        double d26 = (((-d22) * sin) + (d14 * cos)) / d16;
        double d27 = d23 - d25;
        double d28 = d24 - d26;
        double d29 = (double) 2;
        double d31 = (d23 + d25) / d29;
        double d32 = (d24 + d26) / d29;
        double d33 = (d27 * d27) + (d28 * d28);
        if (!(d33 == 0.0d)) {
            double d34 = (1.0d / d33) - 0.25d;
            if (d34 < 0.0d) {
                double sqrt = (double) ((float) (Math.sqrt(d33) / 1.99999d));
                boolean z14 = z13;
                i(w0Var, d11, d12, d13, d14, d15 * sqrt, d16 * sqrt, d17, z11, z12);
                return;
            }
            double sqrt2 = Math.sqrt(d34);
            double d35 = d27 * sqrt2;
            double d36 = sqrt2 * d28;
            boolean z15 = z12;
            if (z11 == z15) {
                d19 = d31 - d36;
                d18 = d32 + d35;
            } else {
                d19 = d31 + d36;
                d18 = d32 - d35;
            }
            double atan2 = Math.atan2(d24 - d18, d23 - d19);
            double atan22 = Math.atan2(d26 - d18, d25 - d19) - atan2;
            int i11 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z15 != (i11 >= 0)) {
                atan22 = i11 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d37 = d19 * d15;
            double d38 = d18 * d16;
            d(w0Var, (d37 * cos) - (d38 * sin), (d37 * sin) + (d38 * cos), d15, d16, d11, d12, E, atan2, atan22);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0051 A[LOOP:0: B:1:0x0008->B:31:0x0051, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0054 A[EDGE_INSN: B:35:0x0054->B:32:0x0054 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j(java.lang.String r9, int r10, y0.f.a r11) {
        /*
            r8 = this;
            r0 = 0
            r11.d(r0)
            r1 = r10
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0008:
            int r5 = r9.length()
            if (r1 >= r5) goto L_0x0054
            char r5 = r9.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 != r6) goto L_0x0019
        L_0x0017:
            r6 = 1
            goto L_0x001f
        L_0x0019:
            r6 = 44
            if (r5 != r6) goto L_0x001e
            goto L_0x0017
        L_0x001e:
            r6 = 0
        L_0x001f:
            if (r6 == 0) goto L_0x0024
        L_0x0021:
            r2 = 0
            r4 = 1
            goto L_0x004e
        L_0x0024:
            r6 = 45
            if (r5 != r6) goto L_0x0030
            if (r1 == r10) goto L_0x004d
            if (r2 != 0) goto L_0x004d
            r11.d(r7)
            goto L_0x0021
        L_0x0030:
            r2 = 46
            if (r5 != r2) goto L_0x003d
            if (r3 != 0) goto L_0x0039
            r2 = 0
            r3 = 1
            goto L_0x004e
        L_0x0039:
            r11.d(r7)
            goto L_0x0021
        L_0x003d:
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto L_0x0043
        L_0x0041:
            r2 = 1
            goto L_0x0049
        L_0x0043:
            r2 = 69
            if (r5 != r2) goto L_0x0048
            goto L_0x0041
        L_0x0048:
            r2 = 0
        L_0x0049:
            if (r2 == 0) goto L_0x004d
            r2 = 1
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            if (r4 == 0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x0054:
            r11.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.f.j(java.lang.String, int, y0.f$a):void");
    }

    private final float[] k(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        float[] fArr = new float[str.length()];
        a aVar = new a(0, false, 3, (i) null);
        int length = str.length();
        int i11 = 1;
        int i12 = 0;
        while (i11 < length) {
            j(str, i11, aVar);
            int a11 = aVar.a();
            if (i11 < a11) {
                String substring = str.substring(i11, a11);
                p.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                fArr[i12] = Float.parseFloat(substring);
                i12++;
            }
            i11 = aVar.b() ? a11 : a11 + 1;
        }
        return g(fArr, 0, i12);
    }

    private final void l(d.C0212d dVar, w0 w0Var) {
        w0Var.j(dVar.c(), this.f17957b.b());
        this.f17957b.d(dVar.c());
    }

    private final void m(d.e eVar, w0 w0Var) {
        w0Var.j(eVar.c(), eVar.d());
        this.f17957b.d(eVar.c());
        this.f17957b.e(eVar.d());
    }

    private final void n(d.f fVar, w0 w0Var) {
        this.f17957b.d(fVar.c());
        this.f17957b.e(fVar.d());
        w0Var.i(fVar.c(), fVar.d());
        this.f17959d.d(this.f17957b.a());
        this.f17959d.e(this.f17957b.b());
    }

    private final int o(String str, int i11) {
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i11;
            }
            i11++;
        }
        return i11;
    }

    private final void q(d.g gVar, w0 w0Var) {
        w0Var.l(gVar.c(), gVar.e(), gVar.d(), gVar.f());
        this.f17958c.d(gVar.c());
        this.f17958c.e(gVar.e());
        this.f17957b.d(gVar.d());
        this.f17957b.e(gVar.f());
    }

    private final void r(d.h hVar, boolean z11, w0 w0Var) {
        if (z11) {
            float f11 = (float) 2;
            this.f17960e.d((this.f17957b.a() * f11) - this.f17958c.a());
            this.f17960e.e((f11 * this.f17957b.b()) - this.f17958c.b());
        } else {
            this.f17960e.d(this.f17957b.a());
            this.f17960e.e(this.f17957b.b());
        }
        w0Var.n(this.f17960e.a(), this.f17960e.b(), hVar.c(), hVar.e(), hVar.d(), hVar.f());
        this.f17958c.d(hVar.c());
        this.f17958c.e(hVar.e());
        this.f17957b.d(hVar.d());
        this.f17957b.e(hVar.f());
    }

    private final void s(d.i iVar, boolean z11, w0 w0Var) {
        if (z11) {
            float f11 = (float) 2;
            this.f17960e.d((this.f17957b.a() * f11) - this.f17958c.a());
            this.f17960e.e((f11 * this.f17957b.b()) - this.f17958c.b());
        } else {
            this.f17960e.d(this.f17957b.a());
            this.f17960e.e(this.f17957b.b());
        }
        w0Var.l(this.f17960e.a(), this.f17960e.b(), iVar.c(), iVar.d());
        this.f17958c.d(this.f17960e.a());
        this.f17958c.e(this.f17960e.b());
        this.f17957b.d(iVar.c());
        this.f17957b.e(iVar.d());
    }

    private final void t(d.j jVar, w0 w0Var) {
        float c11 = jVar.c() + this.f17957b.a();
        float d11 = jVar.d() + this.f17957b.b();
        i(w0Var, (double) this.f17957b.a(), (double) this.f17957b.b(), (double) c11, (double) d11, (double) jVar.e(), (double) jVar.g(), (double) jVar.f(), jVar.h(), jVar.i());
        this.f17957b.d(c11);
        this.f17957b.e(d11);
        this.f17958c.d(this.f17957b.a());
        this.f17958c.e(this.f17957b.b());
    }

    private final void u(d.k kVar, w0 w0Var) {
        w0Var.c(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
        this.f17958c.d(this.f17957b.a() + kVar.d());
        this.f17958c.e(this.f17957b.b() + kVar.g());
        b bVar = this.f17957b;
        bVar.d(bVar.a() + kVar.e());
        b bVar2 = this.f17957b;
        bVar2.e(bVar2.b() + kVar.h());
    }

    private final void v(d.l lVar, w0 w0Var) {
        w0Var.q(lVar.c(), 0.0f);
        b bVar = this.f17957b;
        bVar.d(bVar.a() + lVar.c());
    }

    private final void w(d.m mVar, w0 w0Var) {
        w0Var.q(mVar.c(), mVar.d());
        b bVar = this.f17957b;
        bVar.d(bVar.a() + mVar.c());
        b bVar2 = this.f17957b;
        bVar2.e(bVar2.b() + mVar.d());
    }

    private final void x(d.n nVar, w0 w0Var) {
        b bVar = this.f17957b;
        bVar.d(bVar.a() + nVar.c());
        b bVar2 = this.f17957b;
        bVar2.e(bVar2.b() + nVar.d());
        w0Var.b(nVar.c(), nVar.d());
        this.f17959d.d(this.f17957b.a());
        this.f17959d.e(this.f17957b.b());
    }

    private final void y(d.o oVar, w0 w0Var) {
        w0Var.d(oVar.c(), oVar.e(), oVar.d(), oVar.f());
        this.f17958c.d(this.f17957b.a() + oVar.c());
        this.f17958c.e(this.f17957b.b() + oVar.e());
        b bVar = this.f17957b;
        bVar.d(bVar.a() + oVar.d());
        b bVar2 = this.f17957b;
        bVar2.e(bVar2.b() + oVar.f());
    }

    private final void z(d.p pVar, boolean z11, w0 w0Var) {
        if (z11) {
            this.f17960e.d(this.f17957b.a() - this.f17958c.a());
            this.f17960e.e(this.f17957b.b() - this.f17958c.b());
        } else {
            this.f17960e.c();
        }
        w0Var.c(this.f17960e.a(), this.f17960e.b(), pVar.c(), pVar.e(), pVar.d(), pVar.f());
        this.f17958c.d(this.f17957b.a() + pVar.c());
        this.f17958c.e(this.f17957b.b() + pVar.e());
        b bVar = this.f17957b;
        bVar.d(bVar.a() + pVar.d());
        b bVar2 = this.f17957b;
        bVar2.e(bVar2.b() + pVar.f());
    }

    public final List<d> C() {
        return this.f17956a;
    }

    public final w0 D(w0 w0Var) {
        p.j(w0Var, "target");
        w0Var.reset();
        this.f17957b.c();
        this.f17958c.c();
        this.f17959d.c();
        this.f17960e.c();
        List<d> list = this.f17956a;
        int size = list.size();
        d dVar = null;
        int i11 = 0;
        while (i11 < size) {
            d dVar2 = list.get(i11);
            if (dVar == null) {
                dVar = dVar2;
            }
            if (dVar2 instanceof d.b) {
                f(w0Var);
            } else if (dVar2 instanceof d.n) {
                x((d.n) dVar2, w0Var);
            } else if (dVar2 instanceof d.f) {
                n((d.f) dVar2, w0Var);
            } else if (dVar2 instanceof d.m) {
                w((d.m) dVar2, w0Var);
            } else if (dVar2 instanceof d.e) {
                m((d.e) dVar2, w0Var);
            } else if (dVar2 instanceof d.l) {
                v((d.l) dVar2, w0Var);
            } else if (dVar2 instanceof d.C0212d) {
                l((d.C0212d) dVar2, w0Var);
            } else if (dVar2 instanceof d.r) {
                B((d.r) dVar2, w0Var);
            } else if (dVar2 instanceof d.s) {
                F((d.s) dVar2, w0Var);
            } else if (dVar2 instanceof d.k) {
                u((d.k) dVar2, w0Var);
            } else if (dVar2 instanceof d.c) {
                h((d.c) dVar2, w0Var);
            } else if (dVar2 instanceof d.p) {
                p.g(dVar);
                z((d.p) dVar2, dVar.a(), w0Var);
            } else if (dVar2 instanceof d.h) {
                p.g(dVar);
                r((d.h) dVar2, dVar.a(), w0Var);
            } else if (dVar2 instanceof d.o) {
                y((d.o) dVar2, w0Var);
            } else if (dVar2 instanceof d.g) {
                q((d.g) dVar2, w0Var);
            } else if (dVar2 instanceof d.q) {
                p.g(dVar);
                A((d.q) dVar2, dVar.b(), w0Var);
            } else if (dVar2 instanceof d.i) {
                p.g(dVar);
                s((d.i) dVar2, dVar.b(), w0Var);
            } else if (dVar2 instanceof d.j) {
                t((d.j) dVar2, w0Var);
            } else if (dVar2 instanceof d.a) {
                c((d.a) dVar2, w0Var);
            }
            i11++;
            dVar = dVar2;
        }
        return w0Var;
    }

    public final f b(List<? extends d> list) {
        p.j(list, "nodes");
        this.f17956a.addAll(list);
        return this;
    }

    public final void e() {
        this.f17956a.clear();
    }

    public final f p(String str) {
        p.j(str, "pathData");
        this.f17956a.clear();
        int i11 = 1;
        int i12 = 0;
        while (i11 < str.length()) {
            int o11 = o(str, i11);
            String substring = str.substring(i12, o11);
            p.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = substring.length() - 1;
            int i13 = 0;
            boolean z11 = false;
            while (i13 <= length) {
                boolean z12 = p.l(substring.charAt(!z11 ? i13 : length), 32) <= 0;
                if (!z11) {
                    if (!z12) {
                        z11 = true;
                    } else {
                        i13++;
                    }
                } else if (!z12) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = substring.subSequence(i13, length + 1).toString();
            if (obj.length() > 0) {
                a(obj.charAt(0), k(obj));
            }
            i12 = o11;
            i11 = o11 + 1;
        }
        if (i11 - i12 == 1 && i12 < str.length()) {
            a(str.charAt(i12), new float[0]);
        }
        return this;
    }

    /* compiled from: PathParser.kt */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f17961a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f17962b;

        public a() {
            this(0, false, 3, (i) null);
        }

        public a(int i11, boolean z11) {
            this.f17961a = i11;
            this.f17962b = z11;
        }

        public final int a() {
            return this.f17961a;
        }

        public final boolean b() {
            return this.f17962b;
        }

        public final void c(int i11) {
            this.f17961a = i11;
        }

        public final void d(boolean z11) {
            this.f17962b = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17961a == aVar.f17961a && this.f17962b == aVar.f17962b;
        }

        public int hashCode() {
            int i11 = this.f17961a * 31;
            boolean z11 = this.f17962b;
            if (z11) {
                z11 = true;
            }
            return i11 + (z11 ? 1 : 0);
        }

        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.f17961a + ", endWithNegativeOrDot=" + this.f17962b + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i11, boolean z11, int i12, i iVar) {
            this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? false : z11);
        }
    }
}
