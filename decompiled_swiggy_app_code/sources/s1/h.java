package s1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PlaceholderSpan.kt */
public final class h extends ReplacementSpan {
    public static final a k = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f16612a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16613b;

    /* renamed from: c  reason: collision with root package name */
    private final float f16614c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16615d;

    /* renamed from: e  reason: collision with root package name */
    private final float f16616e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16617f;

    /* renamed from: g  reason: collision with root package name */
    private Paint.FontMetricsInt f16618g;

    /* renamed from: h  reason: collision with root package name */
    private int f16619h;

    /* renamed from: i  reason: collision with root package name */
    private int f16620i;
    private boolean j;

    /* compiled from: PlaceholderSpan.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public h(float f11, int i11, float f12, int i12, float f13, int i13) {
        this.f16612a = f11;
        this.f16613b = i11;
        this.f16614c = f12;
        this.f16615d = i12;
        this.f16616e = f13;
        this.f16617f = i13;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f16618g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        p.B("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.j) {
            return this.f16620i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        return this.f16617f;
    }

    public final int d() {
        if (this.j) {
            return this.f16619h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
        p.j(canvas, "canvas");
        p.j(paint, "paint");
    }

    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        float f11;
        int i13;
        p.j(paint, "paint");
        this.j = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        p.i(fontMetricsInt2, "paint.fontMetricsInt");
        this.f16618g = fontMetricsInt2;
        if (a().descent > a().ascent) {
            int i14 = this.f16613b;
            if (i14 == 0) {
                f11 = this.f16612a * this.f16616e;
            } else if (i14 == 1) {
                f11 = this.f16612a * textSize;
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f16619h = i.a(f11);
            int i15 = this.f16615d;
            if (i15 == 0) {
                i13 = i.a(this.f16614c * this.f16616e);
            } else if (i15 == 1) {
                i13 = i.a(this.f16614c * textSize);
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f16620i = i13;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = a().ascent;
                fontMetricsInt.descent = a().descent;
                fontMetricsInt.leading = a().leading;
                switch (this.f16617f) {
                    case 0:
                        if (fontMetricsInt.ascent > (-b())) {
                            fontMetricsInt.ascent = -b();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + b();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - b();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                            int b11 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = b11;
                            fontMetricsInt.descent = b11 + b();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
            }
            return d();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
}
