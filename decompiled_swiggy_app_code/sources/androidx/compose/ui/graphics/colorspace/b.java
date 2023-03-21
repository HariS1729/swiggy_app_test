package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import v0.e;

/* compiled from: Lab.kt */
public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f6486e = new a((i) null);

    /* compiled from: Lab.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str, int i11) {
        super(str, v0.b.f17013a.a(), i11, (i) null);
        p.j(str, "name");
    }

    public float[] a(float[] fArr) {
        p.j(fArr, "v");
        float f11 = fArr[0];
        e eVar = e.f17027a;
        float f12 = f11 / eVar.c()[0];
        float f13 = fArr[1] / eVar.c()[1];
        float f14 = fArr[2] / eVar.c()[2];
        float pow = f12 > 0.008856452f ? (float) Math.pow((double) f12, (double) 0.33333334f) : (f12 * 7.787037f) + 0.13793103f;
        float pow2 = f13 > 0.008856452f ? (float) Math.pow((double) f13, (double) 0.33333334f) : (f13 * 7.787037f) + 0.13793103f;
        float pow3 = f14 > 0.008856452f ? (float) Math.pow((double) f14, (double) 0.33333334f) : (f14 * 7.787037f) + 0.13793103f;
        fArr[0] = l.l((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = l.l((pow - pow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = l.l((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    public float d(int i11) {
        return i11 == 0 ? 100.0f : 128.0f;
    }

    public float e(int i11) {
        return i11 == 0 ? 0.0f : -128.0f;
    }

    public float[] i(float[] fArr) {
        p.j(fArr, "v");
        fArr[0] = l.l(fArr[0], 0.0f, 100.0f);
        fArr[1] = l.l(fArr[1], -128.0f, 128.0f);
        fArr[2] = l.l(fArr[2], -128.0f, 128.0f);
        float f11 = (fArr[0] + 16.0f) / 116.0f;
        float f12 = (fArr[1] * 0.002f) + f11;
        float f13 = f11 - (fArr[2] * 0.005f);
        float f14 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
        float f15 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
        float f16 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
        e eVar = e.f17027a;
        fArr[0] = f14 * eVar.c()[0];
        fArr[1] = f15 * eVar.c()[1];
        fArr[2] = f16 * eVar.c()[2];
        return fArr;
    }
}
