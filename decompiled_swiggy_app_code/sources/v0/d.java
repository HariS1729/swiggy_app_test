package v0;

import androidx.compose.ui.graphics.colorspace.Rgb;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import v0.b;

/* compiled from: Connector.kt */
public class d {

    /* renamed from: g  reason: collision with root package name */
    public static final a f17018g = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final androidx.compose.ui.graphics.colorspace.a f17019a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.compose.ui.graphics.colorspace.a f17020b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.compose.ui.graphics.colorspace.a f17021c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.compose.ui.graphics.colorspace.a f17022d;

    /* renamed from: e  reason: collision with root package name */
    private final int f17023e;

    /* renamed from: f  reason: collision with root package name */
    private final float[] f17024f;

    /* compiled from: Connector.kt */
    public static final class a {

        /* renamed from: v0.d$a$a  reason: collision with other inner class name */
        /* compiled from: Connector.kt */
        public static final class C0196a extends d {
            C0196a(androidx.compose.ui.graphics.colorspace.a aVar, int i11) {
                super(aVar, aVar, i11, (i) null);
            }

            public float[] a(float[] fArr) {
                p.j(fArr, "v");
                return fArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final float[] b(androidx.compose.ui.graphics.colorspace.a aVar, androidx.compose.ui.graphics.colorspace.a aVar2, int i11) {
            if (!f.e(i11, f.f17036a.a())) {
                return null;
            }
            long f11 = aVar.f();
            b.a aVar3 = b.f17013a;
            boolean e11 = b.e(f11, aVar3.b());
            boolean e12 = b.e(aVar2.f(), aVar3.b());
            if (e11 && e12) {
                return null;
            }
            if (!e11 && !e12) {
                return null;
            }
            if (!e11) {
                aVar = aVar2;
            }
            Rgb rgb = (Rgb) aVar;
            float[] c11 = e11 ? rgb.r().c() : e.f17027a.c();
            float[] c12 = e12 ? rgb.r().c() : e.f17027a.c();
            return new float[]{c11[0] / c12[0], c11[1] / c12[1], c11[2] / c12[2]};
        }

        public final d c(androidx.compose.ui.graphics.colorspace.a aVar) {
            p.j(aVar, "source");
            return new C0196a(aVar, f.f17036a.c());
        }
    }

    /* compiled from: Connector.kt */
    public static final class b extends d {

        /* renamed from: h  reason: collision with root package name */
        private final Rgb f17025h;

        /* renamed from: i  reason: collision with root package name */
        private final Rgb f17026i;
        private final float[] j;

        private b(Rgb rgb, Rgb rgb2, int i11) {
            super(rgb, rgb2, rgb, rgb2, i11, (float[]) null, (i) null);
            this.f17025h = rgb;
            this.f17026i = rgb2;
            this.j = b(rgb, rgb2, i11);
        }

        public /* synthetic */ b(Rgb rgb, Rgb rgb2, int i11, i iVar) {
            this(rgb, rgb2, i11);
        }

        private final float[] b(Rgb rgb, Rgb rgb2, int i11) {
            if (c.f(rgb.r(), rgb2.r())) {
                return c.k(rgb2.n(), rgb.q());
            }
            float[] q = rgb.q();
            float[] n = rgb2.n();
            float[] c11 = rgb.r().c();
            float[] c12 = rgb2.r().c();
            h r11 = rgb.r();
            e eVar = e.f17027a;
            if (!c.f(r11, eVar.b())) {
                float[] b11 = a.f17008b.a().b();
                float[] c13 = eVar.c();
                float[] copyOf = Arrays.copyOf(c13, c13.length);
                p.i(copyOf, "copyOf(this, size)");
                q = c.k(c.e(b11, c11, copyOf), rgb.q());
            }
            if (!c.f(rgb2.r(), eVar.b())) {
                float[] b12 = a.f17008b.a().b();
                float[] c14 = eVar.c();
                float[] copyOf2 = Arrays.copyOf(c14, c14.length);
                p.i(copyOf2, "copyOf(this, size)");
                n = c.j(c.k(c.e(b12, c12, copyOf2), rgb2.q()));
            }
            if (f.e(i11, f.f17036a.a())) {
                q = c.l(new float[]{c11[0] / c12[0], c11[1] / c12[1], c11[2] / c12[2]}, q);
            }
            return c.k(n, q);
        }

        public float[] a(float[] fArr) {
            p.j(fArr, "v");
            fArr[0] = (float) this.f17025h.l().invoke(Double.valueOf((double) fArr[0])).doubleValue();
            fArr[1] = (float) this.f17025h.l().invoke(Double.valueOf((double) fArr[1])).doubleValue();
            fArr[2] = (float) this.f17025h.l().invoke(Double.valueOf((double) fArr[2])).doubleValue();
            c.m(this.j, fArr);
            fArr[0] = (float) this.f17026i.o().invoke(Double.valueOf((double) fArr[0])).doubleValue();
            fArr[1] = (float) this.f17026i.o().invoke(Double.valueOf((double) fArr[1])).doubleValue();
            fArr[2] = (float) this.f17026i.o().invoke(Double.valueOf((double) fArr[2])).doubleValue();
            return fArr;
        }
    }

    public /* synthetic */ d(androidx.compose.ui.graphics.colorspace.a aVar, androidx.compose.ui.graphics.colorspace.a aVar2, int i11, i iVar) {
        this(aVar, aVar2, i11);
    }

    private d(androidx.compose.ui.graphics.colorspace.a aVar, androidx.compose.ui.graphics.colorspace.a aVar2, androidx.compose.ui.graphics.colorspace.a aVar3, androidx.compose.ui.graphics.colorspace.a aVar4, int i11, float[] fArr) {
        this.f17019a = aVar;
        this.f17020b = aVar2;
        this.f17021c = aVar3;
        this.f17022d = aVar4;
        this.f17023e = i11;
        this.f17024f = fArr;
    }

    public /* synthetic */ d(androidx.compose.ui.graphics.colorspace.a aVar, androidx.compose.ui.graphics.colorspace.a aVar2, androidx.compose.ui.graphics.colorspace.a aVar3, androidx.compose.ui.graphics.colorspace.a aVar4, int i11, float[] fArr, i iVar) {
        this(aVar, aVar2, aVar3, aVar4, i11, fArr);
    }

    public float[] a(float[] fArr) {
        p.j(fArr, "v");
        float[] i11 = this.f17021c.i(fArr);
        float[] fArr2 = this.f17024f;
        if (fArr2 != null) {
            i11[0] = i11[0] * fArr2[0];
            i11[1] = i11[1] * fArr2[1];
            i11[2] = i11[2] * fArr2[2];
        }
        return this.f17022d.a(i11);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private d(androidx.compose.ui.graphics.colorspace.a r13, androidx.compose.ui.graphics.colorspace.a r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.f()
            v0.b$a r2 = v0.b.f17013a
            long r3 = r2.b()
            boolean r0 = v0.b.e(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L_0x001e
            v0.e r0 = v0.e.f17027a
            v0.h r0 = r0.b()
            androidx.compose.ui.graphics.colorspace.a r0 = v0.c.d(r13, r0, r3, r1, r3)
            r7 = r0
            goto L_0x001f
        L_0x001e:
            r7 = r13
        L_0x001f:
            long r4 = r14.f()
            long r8 = r2.b()
            boolean r0 = v0.b.e(r4, r8)
            if (r0 == 0) goto L_0x0039
            v0.e r0 = v0.e.f17027a
            v0.h r0 = r0.b()
            androidx.compose.ui.graphics.colorspace.a r0 = v0.c.d(r14, r0, r3, r1, r3)
            r8 = r0
            goto L_0x003a
        L_0x0039:
            r8 = r14
        L_0x003a:
            v0.d$a r0 = f17018g
            float[] r10 = r0.b(r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.d.<init>(androidx.compose.ui.graphics.colorspace.a, androidx.compose.ui.graphics.colorspace.a, int):void");
    }
}
