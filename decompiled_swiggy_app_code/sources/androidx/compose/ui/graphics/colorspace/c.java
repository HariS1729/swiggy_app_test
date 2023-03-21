package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import v0.b;
import v0.e;

/* compiled from: Oklab.kt */
public final class c extends a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f6487e = new a((i) null);

    /* renamed from: f  reason: collision with root package name */
    private static final float[] f6488f;

    /* renamed from: g  reason: collision with root package name */
    private static final float[] f6489g;

    /* renamed from: h  reason: collision with root package name */
    private static final float[] f6490h;

    /* renamed from: i  reason: collision with root package name */
    private static final float[] f6491i;

    /* compiled from: Oklab.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    static {
        float[] b11 = v0.a.f17008b.a().b();
        e eVar = e.f17027a;
        float[] k = v0.c.k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, v0.c.e(b11, eVar.b().c(), eVar.e().c()));
        f6488f = k;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f6489g = fArr;
        f6490h = v0.c.j(k);
        f6491i = v0.c.j(fArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, int i11) {
        super(str, b.f17013a.a(), i11, (i) null);
        p.j(str, "name");
    }

    public float[] a(float[] fArr) {
        p.j(fArr, "v");
        v0.c.m(f6488f, fArr);
        double d11 = (double) 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow((double) Math.abs(fArr[0]), d11));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow((double) Math.abs(fArr[1]), d11));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow((double) Math.abs(fArr[2]), d11));
        v0.c.m(f6489g, fArr);
        return fArr;
    }

    public float d(int i11) {
        return i11 == 0 ? 1.0f : 0.5f;
    }

    public float e(int i11) {
        return i11 == 0 ? 0.0f : -0.5f;
    }

    public float[] i(float[] fArr) {
        p.j(fArr, "v");
        fArr[0] = l.l(fArr[0], 0.0f, 1.0f);
        fArr[1] = l.l(fArr[1], -0.5f, 0.5f);
        fArr[2] = l.l(fArr[2], -0.5f, 0.5f);
        v0.c.m(f6491i, fArr);
        fArr[0] = fArr[0] * fArr[0] * fArr[0];
        fArr[1] = fArr[1] * fArr[1] * fArr[1];
        fArr[2] = fArr[2] * fArr[2] * fArr[2];
        v0.c.m(f6490h, fArr);
        return fArr;
    }
}
