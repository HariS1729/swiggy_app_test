package d3;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.g;

/* compiled from: EmojiSpan */
public abstract class d extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    private final Paint.FontMetricsInt f14079a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    private final b f14080b;

    /* renamed from: c  reason: collision with root package name */
    private short f14081c = -1;

    /* renamed from: d  reason: collision with root package name */
    private short f14082d = -1;

    /* renamed from: e  reason: collision with root package name */
    private float f14083e = 1.0f;

    d(b bVar) {
        g.h(bVar, "metadata cannot be null");
        this.f14080b = bVar;
    }

    /* access modifiers changed from: package-private */
    public final b a() {
        return this.f14080b;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f14081c;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f14079a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f14079a;
        this.f14083e = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f14080b.e());
        this.f14082d = (short) ((int) (((float) this.f14080b.e()) * this.f14083e));
        short i13 = (short) ((int) (((float) this.f14080b.i()) * this.f14083e));
        this.f14081c = i13;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f14079a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i13;
    }
}
