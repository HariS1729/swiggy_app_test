package q1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: StaticLayoutFactory.kt */
final class p {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f16335a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16336b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16337c;

    /* renamed from: d  reason: collision with root package name */
    private final TextPaint f16338d;

    /* renamed from: e  reason: collision with root package name */
    private final int f16339e;

    /* renamed from: f  reason: collision with root package name */
    private final TextDirectionHeuristic f16340f;

    /* renamed from: g  reason: collision with root package name */
    private final Layout.Alignment f16341g;

    /* renamed from: h  reason: collision with root package name */
    private final int f16342h;

    /* renamed from: i  reason: collision with root package name */
    private final TextUtils.TruncateAt f16343i;
    private final int j;
    private final float k;

    /* renamed from: l  reason: collision with root package name */
    private final float f16344l;

    /* renamed from: m  reason: collision with root package name */
    private final int f16345m;
    private final boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f16346o;

    /* renamed from: p  reason: collision with root package name */
    private final int f16347p;
    private final int q;

    /* renamed from: r  reason: collision with root package name */
    private final int[] f16348r;

    /* renamed from: s  reason: collision with root package name */
    private final int[] f16349s;

    public p(CharSequence charSequence, int i11, int i12, TextPaint textPaint, int i13, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i14, TextUtils.TruncateAt truncateAt, int i15, float f11, float f12, int i16, boolean z11, boolean z12, int i17, int i18, int[] iArr, int[] iArr2) {
        int i19 = i11;
        int i21 = i12;
        TextPaint textPaint2 = textPaint;
        int i22 = i13;
        TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
        Layout.Alignment alignment2 = alignment;
        int i23 = i14;
        int i24 = i15;
        float f13 = f11;
        kotlin.jvm.internal.p.j(charSequence, "text");
        kotlin.jvm.internal.p.j(textPaint2, "paint");
        kotlin.jvm.internal.p.j(textDirectionHeuristic2, "textDir");
        kotlin.jvm.internal.p.j(alignment2, "alignment");
        this.f16335a = charSequence;
        this.f16336b = i19;
        this.f16337c = i21;
        this.f16338d = textPaint2;
        this.f16339e = i22;
        this.f16340f = textDirectionHeuristic2;
        this.f16341g = alignment2;
        this.f16342h = i23;
        this.f16343i = truncateAt;
        this.j = i24;
        this.k = f13;
        this.f16344l = f12;
        this.f16345m = i16;
        this.n = z11;
        this.f16346o = z12;
        this.f16347p = i17;
        this.q = i18;
        this.f16348r = iArr;
        this.f16349s = iArr2;
        boolean z13 = true;
        if (i19 >= 0 && i19 <= i21) {
            if (i21 >= 0 && i21 <= charSequence.length()) {
                if (i23 >= 0) {
                    if (i22 >= 0) {
                        if (i24 >= 0) {
                            if (!(f13 < 0.0f ? false : z13)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final Layout.Alignment a() {
        return this.f16341g;
    }

    public final int b() {
        return this.f16347p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f16343i;
    }

    public final int d() {
        return this.j;
    }

    public final int e() {
        return this.f16337c;
    }

    public final int f() {
        return this.q;
    }

    public final boolean g() {
        return this.n;
    }

    public final int h() {
        return this.f16345m;
    }

    public final int[] i() {
        return this.f16348r;
    }

    public final float j() {
        return this.f16344l;
    }

    public final float k() {
        return this.k;
    }

    public final int l() {
        return this.f16342h;
    }

    public final TextPaint m() {
        return this.f16338d;
    }

    public final int[] n() {
        return this.f16349s;
    }

    public final int o() {
        return this.f16336b;
    }

    public final CharSequence p() {
        return this.f16335a;
    }

    public final TextDirectionHeuristic q() {
        return this.f16340f;
    }

    public final boolean r() {
        return this.f16346o;
    }

    public final int s() {
        return this.f16339e;
    }
}
