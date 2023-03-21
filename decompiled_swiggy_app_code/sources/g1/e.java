package g1;

import kotlin.jvm.internal.p;
import org.apache.pdfbox.pdmodel.common.PDPageLabelRange;

/* compiled from: VelocityTracker.kt */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final int f14718a;

    /* renamed from: b  reason: collision with root package name */
    private final Float[] f14719b;

    public e(int i11) {
        this.f14718a = i11;
        Float[] fArr = new Float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[i12] = Float.valueOf(0.0f);
        }
        this.f14719b = fArr;
    }

    public final float a(int i11) {
        return this.f14719b[i11].floatValue();
    }

    public final float b() {
        return (float) Math.sqrt((double) d(this));
    }

    public final void c(int i11, float f11) {
        this.f14719b[i11] = Float.valueOf(f11);
    }

    public final float d(e eVar) {
        p.j(eVar, PDPageLabelRange.STYLE_LETTERS_LOWER);
        int i11 = this.f14718a;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < i11; i12++) {
            f11 += a(i12) * eVar.a(i12);
        }
        return f11;
    }
}
