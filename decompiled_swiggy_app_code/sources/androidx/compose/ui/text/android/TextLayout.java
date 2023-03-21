package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import bp0.f;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.p;
import q1.d;
import q1.m;
import q1.q;
import q1.r;
import s1.a;

/* compiled from: TextLayout.kt */
public final class TextLayout {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7538a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7539b;

    /* renamed from: c  reason: collision with root package name */
    private final LayoutIntrinsics f7540c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7541d;

    /* renamed from: e  reason: collision with root package name */
    private final Layout f7542e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7543f;

    /* renamed from: g  reason: collision with root package name */
    private final int f7544g;

    /* renamed from: h  reason: collision with root package name */
    private final int f7545h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f7546i;
    private final f j;

    public TextLayout(CharSequence charSequence, float f11, TextPaint textPaint, int i11, TextUtils.TruncateAt truncateAt, int i12, float f12, float f13, boolean z11, boolean z12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics) {
        Layout layout;
        boolean z13;
        CharSequence charSequence2 = charSequence;
        float f14 = f11;
        int i17 = i13;
        LayoutIntrinsics layoutIntrinsics2 = layoutIntrinsics;
        p.j(charSequence2, "charSequence");
        p.j(textPaint, "textPaint");
        p.j(layoutIntrinsics2, "layoutIntrinsics");
        this.f7538a = z11;
        this.f7539b = z12;
        this.f7540c = layoutIntrinsics2;
        int length = charSequence.length();
        TextDirectionHeuristic e11 = r.e(i12);
        Layout.Alignment a11 = q.f16350a.a(i11);
        boolean z14 = (charSequence2 instanceof Spanned) && ((Spanned) charSequence2).nextSpanTransition(-1, length, a.class) < length;
        BoringLayout.Metrics a12 = layoutIntrinsics.a();
        double d11 = (double) f14;
        int ceil = (int) ((float) Math.ceil(d11));
        if (a12 == null || layoutIntrinsics.b() > f14 || z14) {
            this.f7546i = false;
            layout = m.f16330a.a(charSequence, 0, charSequence.length(), textPaint, ceil, e11, a11, i13, truncateAt, (int) ((float) Math.ceil(d11)), f12, f13, i16, z11, z12, i14, i15, iArr, iArr2);
        } else {
            this.f7546i = true;
            layout = q1.a.f16282a.a(charSequence, textPaint, ceil, a12, a11, z11, truncateAt, ceil);
        }
        this.f7542e = layout;
        int i18 = i13;
        int min = Math.min(layout.getLineCount(), i18);
        this.f7543f = min;
        if (min >= i18 && (layout.getEllipsisCount(min - 1) > 0 || layout.getLineEnd(min - 1) != charSequence.length())) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f7541d = z13;
        Pair b11 = r.f(this);
        Pair a13 = r.c(this);
        this.f7544g = Math.max(((Number) b11.c()).intValue(), ((Number) a13.c()).intValue());
        this.f7545h = Math.max(((Number) b11.d()).intValue(), ((Number) a13.d()).intValue());
        this.j = b.a(LazyThreadSafetyMode.NONE, new TextLayout$layoutHelper$2(this));
    }

    private final d e() {
        return (d) this.j.getValue();
    }

    public static /* synthetic */ float v(TextLayout textLayout, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return textLayout.u(i11, z11);
    }

    public static /* synthetic */ float x(TextLayout textLayout, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return textLayout.w(i11, z11);
    }

    public final boolean A() {
        return this.f7539b && !this.f7546i && Build.VERSION.SDK_INT >= 28;
    }

    public final boolean B(int i11) {
        return this.f7542e.isRtlCharAt(i11);
    }

    public final void C(Canvas canvas) {
        p.j(canvas, "canvas");
        int i11 = this.f7544g;
        if (i11 != 0) {
            canvas.translate(0.0f, (float) i11);
        }
        this.f7542e.draw(canvas);
        int i12 = this.f7544g;
        if (i12 != 0) {
            canvas.translate(0.0f, ((float) -1) * ((float) i12));
        }
    }

    public final boolean a() {
        return this.f7541d;
    }

    public final int b() {
        int i11;
        if (this.f7541d) {
            i11 = this.f7542e.getLineBottom(this.f7543f - 1);
        } else {
            i11 = this.f7542e.getHeight();
        }
        return i11 + this.f7544g + this.f7545h;
    }

    public final boolean c() {
        return this.f7538a;
    }

    public final Layout d() {
        return this.f7542e;
    }

    public final float f(int i11) {
        return ((float) this.f7544g) + ((float) this.f7542e.getLineBaseline(i11));
    }

    public final float g(int i11) {
        return ((float) this.f7544g) + ((float) this.f7542e.getLineBottom(i11)) + ((float) (i11 == this.f7543f + -1 ? this.f7545h : 0));
    }

    public final int h() {
        return this.f7543f;
    }

    public final int i(int i11) {
        return this.f7542e.getEllipsisCount(i11);
    }

    public final int j(int i11) {
        return this.f7542e.getEllipsisStart(i11);
    }

    public final int k(int i11) {
        if (this.f7542e.getEllipsisStart(i11) == 0) {
            return this.f7542e.getLineEnd(i11);
        }
        return this.f7542e.getText().length();
    }

    public final int l(int i11) {
        return this.f7542e.getLineForOffset(i11);
    }

    public final int m(int i11) {
        return this.f7542e.getLineForVertical(this.f7544g + i11);
    }

    public final float n(int i11) {
        return this.f7542e.getLineLeft(i11);
    }

    public final float o(int i11) {
        return this.f7542e.getLineRight(i11);
    }

    public final int p(int i11) {
        return this.f7542e.getLineStart(i11);
    }

    public final float q(int i11) {
        int i12;
        float lineTop = (float) this.f7542e.getLineTop(i11);
        if (i11 == 0) {
            i12 = 0;
        } else {
            i12 = this.f7544g;
        }
        return lineTop + ((float) i12);
    }

    public final int r(int i11) {
        if (this.f7542e.getEllipsisStart(i11) == 0) {
            return this.f7542e.getLineVisibleEnd(i11);
        }
        return this.f7542e.getEllipsisStart(i11) + this.f7542e.getLineStart(i11);
    }

    public final int s(int i11, float f11) {
        return this.f7542e.getOffsetForHorizontal(i11, f11);
    }

    public final int t(int i11) {
        return this.f7542e.getParagraphDirection(i11);
    }

    public final float u(int i11, boolean z11) {
        return e().c(i11, true, z11);
    }

    public final float w(int i11, boolean z11) {
        return e().c(i11, false, z11);
    }

    public final void y(int i11, int i12, Path path) {
        p.j(path, "dest");
        this.f7542e.getSelectionPath(i11, i12, path);
        if (this.f7544g != 0 && !path.isEmpty()) {
            path.offset(0.0f, (float) this.f7544g);
        }
    }

    public final CharSequence z() {
        CharSequence text = this.f7542e.getText();
        p.i(text, "layout.text");
        return text;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextLayout(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, float r28, float r29, boolean r30, boolean r31, int r32, int r33, int r34, int r35, int[] r36, int[] r37, androidx.compose.ui.text.android.LayoutIntrinsics r38, int r39, kotlin.jvm.internal.i r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = 0
            goto L_0x000b
        L_0x0009:
            r5 = r23
        L_0x000b:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L_0x0012
            r7 = 0
            goto L_0x0014
        L_0x0012:
            r7 = r25
        L_0x0014:
            r1 = r0 & 16
            r4 = 0
            if (r1 == 0) goto L_0x001b
            r8 = r4
            goto L_0x001d
        L_0x001b:
            r8 = r26
        L_0x001d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0024
            r1 = 2
            r9 = 2
            goto L_0x0026
        L_0x0024:
            r9 = r27
        L_0x0026:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002f
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0031
        L_0x002f:
            r10 = r28
        L_0x0031:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0037
            r11 = 0
            goto L_0x0039
        L_0x0037:
            r11 = r29
        L_0x0039:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003f
            r12 = 0
            goto L_0x0041
        L_0x003f:
            r12 = r30
        L_0x0041:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0048
            r1 = 1
            r13 = 1
            goto L_0x004a
        L_0x0048:
            r13 = r31
        L_0x004a:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0055
            r1 = 2147483647(0x7fffffff, float:NaN)
            r14 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0057
        L_0x0055:
            r14 = r32
        L_0x0057:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x005d
            r15 = 0
            goto L_0x005f
        L_0x005d:
            r15 = r33
        L_0x005f:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0066
            r16 = 0
            goto L_0x0068
        L_0x0066:
            r16 = r34
        L_0x0068:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006f
            r17 = 0
            goto L_0x0071
        L_0x006f:
            r17 = r35
        L_0x0071:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0078
            r18 = r4
            goto L_0x007a
        L_0x0078:
            r18 = r36
        L_0x007a:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0083
            r19 = r4
            goto L_0x0085
        L_0x0083:
            r19 = r37
        L_0x0085:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0096
            androidx.compose.ui.text.android.LayoutIntrinsics r0 = new androidx.compose.ui.text.android.LayoutIntrinsics
            r1 = r22
            r2 = r24
            r0.<init>(r1, r2, r9)
            r20 = r0
            goto L_0x009c
        L_0x0096:
            r1 = r22
            r2 = r24
            r20 = r38
        L_0x009c:
            r3 = r21
            r4 = r22
            r6 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int[], int[], androidx.compose.ui.text.android.LayoutIntrinsics, int, kotlin.jvm.internal.i):void");
    }
}
