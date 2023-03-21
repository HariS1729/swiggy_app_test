package s1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.p;

/* compiled from: LineHeightStyleSpan.kt */
public final class f implements LineHeightSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f16602a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16603b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16604c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f16605d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f16606e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16607f;

    /* renamed from: g  reason: collision with root package name */
    private int f16608g;

    /* renamed from: h  reason: collision with root package name */
    private int f16609h;

    /* renamed from: i  reason: collision with root package name */
    private int f16610i;
    private int j;
    private int k;

    /* renamed from: l  reason: collision with root package name */
    private int f16611l;

    public f(float f11, int i11, int i12, boolean z11, boolean z12, int i13) {
        this.f16602a = f11;
        this.f16603b = i11;
        this.f16604c = i12;
        this.f16605d = z11;
        this.f16606e = z12;
        this.f16607f = i13;
        boolean z13 = true;
        if (!(i13 >= 0 && i13 < 101) && i13 != -1) {
            z13 = false;
        }
        if (!z13) {
            throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
        }
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        double d11;
        int a11 = g.a(fontMetricsInt);
        int ceil = (int) ((float) Math.ceil((double) this.f16602a));
        int i11 = ceil - a11;
        int i12 = this.f16607f;
        if (i12 == -1) {
            i12 = (int) ((Math.abs((float) fontMetricsInt.ascent) / ((float) g.a(fontMetricsInt))) * 100.0f);
        }
        if (i11 <= 0) {
            d11 = Math.ceil((double) (((float) (i11 * i12)) / 100.0f));
        } else {
            d11 = Math.ceil((double) (((float) (i11 * (100 - i12))) / 100.0f));
        }
        int i13 = fontMetricsInt.descent;
        int i14 = ((int) ((float) d11)) + i13;
        this.f16610i = i14;
        int i15 = i14 - ceil;
        this.f16609h = i15;
        if (this.f16605d) {
            i15 = fontMetricsInt.ascent;
        }
        this.f16608g = i15;
        if (this.f16606e) {
            i14 = i13;
        }
        this.j = i14;
        this.k = fontMetricsInt.ascent - i15;
        this.f16611l = i14 - i13;
    }

    public final int b() {
        return this.k;
    }

    public final int c() {
        return this.f16611l;
    }

    public void chooseHeight(CharSequence charSequence, int i11, int i12, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        p.j(charSequence, "text");
        p.j(fontMetricsInt, "fontMetricsInt");
        if (g.a(fontMetricsInt) > 0) {
            boolean z11 = true;
            boolean z12 = i11 == this.f16603b;
            if (i12 != this.f16604c) {
                z11 = false;
            }
            if (!z12 || !z11 || !this.f16605d || !this.f16606e) {
                if (z12) {
                    a(fontMetricsInt);
                }
                fontMetricsInt.ascent = z12 ? this.f16608g : this.f16609h;
                fontMetricsInt.descent = z11 ? this.j : this.f16610i;
            }
        }
    }
}
