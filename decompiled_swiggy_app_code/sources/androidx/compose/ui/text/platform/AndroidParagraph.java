package androidx.compose.ui.text.platform;

import a2.e;
import android.graphics.Canvas;
import android.graphics.Path;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import bp0.f;
import d2.b;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p1.b0;
import p1.g;
import t0.h;
import t0.m;
import u0.h1;
import u0.o;
import u0.u;
import u0.w0;
import u0.x;
import x1.c;

/* compiled from: AndroidParagraph.android.kt */
public final class AndroidParagraph implements g {

    /* renamed from: a  reason: collision with root package name */
    private final AndroidParagraphIntrinsics f7640a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7641b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7642c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7643d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final TextLayout f7644e;

    /* renamed from: f  reason: collision with root package name */
    private final List<h> f7645f;

    /* renamed from: g  reason: collision with root package name */
    private final f f7646g;

    /* compiled from: AndroidParagraph.android.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7647a;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            f7647a = iArr;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018b, code lost:
        r7 = r7 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b5, code lost:
        r7 = r7 - ((float) r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b7, code lost:
        r12 = new t0.h(r9, r7, r11, ((float) r6.b()) + r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AndroidParagraph(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics r17, int r18, boolean r19, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            r16.<init>()
            r3 = r17
            r0.f7640a = r3
            r0.f7641b = r1
            r0.f7642c = r2
            r4 = r20
            r0.f7643d = r4
            int r6 = d2.b.o(r20)
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L_0x0025
            int r6 = d2.b.p(r20)
            if (r6 != 0) goto L_0x0025
            r6 = 1
            goto L_0x0026
        L_0x0025:
            r6 = 0
        L_0x0026:
            if (r6 == 0) goto L_0x01e9
            if (r1 < r8) goto L_0x002c
            r6 = 1
            goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            if (r6 == 0) goto L_0x01dd
            p1.c0 r3 = r17.h()
            a2.d r6 = r3.v()
            int r6 = x1.e.f(r6)
            a2.d r9 = r3.v()
            a2.d$a r10 = a2.d.f907b
            int r10 = r10.c()
            if (r9 != 0) goto L_0x0049
            r9 = 0
            goto L_0x0051
        L_0x0049:
            int r9 = r9.m()
            boolean r9 = a2.d.j(r9, r10)
        L_0x0051:
            r10 = 0
            if (r2 == 0) goto L_0x0057
            android.text.TextUtils$TruncateAt r11 = android.text.TextUtils.TruncateAt.END
            goto L_0x0058
        L_0x0057:
            r11 = r10
        L_0x0058:
            androidx.compose.ui.text.android.TextLayout r12 = r0.z(r6, r9, r11, r1)
            if (r2 == 0) goto L_0x007d
            int r2 = r12.b()
            int r13 = d2.b.m(r20)
            if (r2 <= r13) goto L_0x007d
            if (r1 <= r8) goto L_0x007d
            int r2 = d2.b.m(r20)
            int r2 = x1.e.e(r12, r2)
            if (r2 <= 0) goto L_0x007a
            if (r2 == r1) goto L_0x007a
            androidx.compose.ui.text.android.TextLayout r12 = r0.z(r6, r9, r11, r2)
        L_0x007a:
            r0.f7644e = r12
            goto L_0x007f
        L_0x007d:
            r0.f7644e = r12
        L_0x007f:
            x1.h r1 = r16.E()
            u0.u r2 = r3.f()
            float r3 = r16.getWidth()
            float r4 = r16.getHeight()
            long r3 = t0.m.a(r3, r4)
            r1.a(r2, r3)
            androidx.compose.ui.text.android.TextLayout r1 = r0.f7644e
            z1.a[] r1 = r0.C(r1)
            int r2 = r1.length
            r3 = 0
        L_0x009e:
            if (r3 >= r2) goto L_0x00b8
            r4 = r1[r3]
            float r5 = r16.getWidth()
            float r6 = r16.getHeight()
            long r5 = t0.m.a(r5, r6)
            t0.l r5 = t0.l.c(r5)
            r4.a(r5)
            int r3 = r3 + 1
            goto L_0x009e
        L_0x00b8:
            androidx.compose.ui.text.platform.AndroidParagraphIntrinsics r1 = r0.f7640a
            java.lang.CharSequence r1 = r1.e()
            boolean r2 = r1 instanceof android.text.Spanned
            if (r2 != 0) goto L_0x00c8
            java.util.List r1 = kotlin.collections.k.j()
            goto L_0x01cd
        L_0x00c8:
            r2 = r1
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r3 = r1.length()
            java.lang.Class<s1.h> r4 = s1.h.class
            java.lang.Object[] r2 = r2.getSpans(r7, r3, r4)
            java.lang.String r3 = "getSpans(0, length, PlaceholderSpan::class.java)"
            kotlin.jvm.internal.p.i(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.length
            r3.<init>(r4)
            int r4 = r2.length
            r5 = 0
        L_0x00e2:
            if (r5 >= r4) goto L_0x01cc
            r6 = r2[r5]
            s1.h r6 = (s1.h) r6
            r9 = r1
            android.text.Spanned r9 = (android.text.Spanned) r9
            int r11 = r9.getSpanStart(r6)
            int r9 = r9.getSpanEnd(r6)
            androidx.compose.ui.text.android.TextLayout r12 = r0.f7644e
            int r12 = r12.l(r11)
            androidx.compose.ui.text.android.TextLayout r13 = r0.f7644e
            int r13 = r13.i(r12)
            if (r13 <= 0) goto L_0x010b
            androidx.compose.ui.text.android.TextLayout r13 = r0.f7644e
            int r13 = r13.j(r12)
            if (r9 <= r13) goto L_0x010b
            r13 = 1
            goto L_0x010c
        L_0x010b:
            r13 = 0
        L_0x010c:
            androidx.compose.ui.text.android.TextLayout r14 = r0.f7644e
            int r14 = r14.k(r12)
            if (r9 <= r14) goto L_0x0116
            r9 = 1
            goto L_0x0117
        L_0x0116:
            r9 = 0
        L_0x0117:
            if (r13 != 0) goto L_0x01c3
            if (r9 == 0) goto L_0x011d
            goto L_0x01c3
        L_0x011d:
            androidx.compose.ui.text.style.ResolvedTextDirection r9 = r0.v(r11)
            int[] r13 = androidx.compose.ui.text.platform.AndroidParagraph.a.f7647a
            int r9 = r9.ordinal()
            r9 = r13[r9]
            r13 = 2
            if (r9 == r8) goto L_0x013f
            if (r9 != r13) goto L_0x0139
            float r9 = r0.s(r11, r8)
            int r11 = r6.d()
            float r11 = (float) r11
            float r9 = r9 - r11
            goto L_0x0143
        L_0x0139:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x013f:
            float r9 = r0.s(r11, r8)
        L_0x0143:
            int r11 = r6.d()
            float r11 = (float) r11
            float r11 = r11 + r9
            androidx.compose.ui.text.android.TextLayout r14 = r0.f7644e
            int r15 = r6.c()
            switch(r15) {
                case 0: goto L_0x01ad;
                case 1: goto L_0x01a8;
                case 2: goto L_0x019f;
                case 3: goto L_0x018d;
                case 4: goto L_0x0180;
                case 5: goto L_0x016f;
                case 6: goto L_0x015a;
                default: goto L_0x0152;
            }
        L_0x0152:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected verticalAlignment"
            r1.<init>(r2)
            throw r1
        L_0x015a:
            android.graphics.Paint$FontMetricsInt r15 = r6.a()
            int r7 = r15.ascent
            int r15 = r15.descent
            int r7 = r7 + r15
            int r15 = r6.b()
            int r7 = r7 - r15
            int r7 = r7 / r13
            float r7 = (float) r7
            float r12 = r14.f(r12)
            goto L_0x018b
        L_0x016f:
            android.graphics.Paint$FontMetricsInt r7 = r6.a()
            int r7 = r7.descent
            float r7 = (float) r7
            float r12 = r14.f(r12)
            float r7 = r7 + r12
            int r12 = r6.b()
            goto L_0x01b5
        L_0x0180:
            android.graphics.Paint$FontMetricsInt r7 = r6.a()
            int r7 = r7.ascent
            float r7 = (float) r7
            float r12 = r14.f(r12)
        L_0x018b:
            float r7 = r7 + r12
            goto L_0x01b7
        L_0x018d:
            float r7 = r14.q(r12)
            float r12 = r14.g(r12)
            float r7 = r7 + r12
            int r12 = r6.b()
            float r12 = (float) r12
            float r7 = r7 - r12
            float r12 = (float) r13
            float r7 = r7 / r12
            goto L_0x01b7
        L_0x019f:
            float r7 = r14.g(r12)
            int r12 = r6.b()
            goto L_0x01b5
        L_0x01a8:
            float r7 = r14.q(r12)
            goto L_0x01b7
        L_0x01ad:
            float r7 = r14.f(r12)
            int r12 = r6.b()
        L_0x01b5:
            float r12 = (float) r12
            float r7 = r7 - r12
        L_0x01b7:
            int r6 = r6.b()
            float r6 = (float) r6
            float r6 = r6 + r7
            t0.h r12 = new t0.h
            r12.<init>(r9, r7, r11, r6)
            goto L_0x01c4
        L_0x01c3:
            r12 = r10
        L_0x01c4:
            r3.add(r12)
            int r5 = r5 + 1
            r7 = 0
            goto L_0x00e2
        L_0x01cc:
            r1 = r3
        L_0x01cd:
            r0.f7645f = r1
            kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE
            androidx.compose.ui.text.platform.AndroidParagraph$wordBoundary$2 r2 = new androidx.compose.ui.text.platform.AndroidParagraph$wordBoundary$2
            r2.<init>(r0)
            bp0.f r1 = kotlin.b.a(r1, r2)
            r0.f7646g = r1
            return
        L_0x01dd:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "maxLines should be greater than 0"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01e9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraph.<init>(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics, int, boolean, long):void");
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i11, boolean z11, long j, i iVar) {
        this(androidParagraphIntrinsics, i11, z11, j);
    }

    private final z1.a[] C(TextLayout textLayout) {
        if (!(textLayout.z() instanceof Spanned)) {
            return new z1.a[0];
        }
        z1.a[] aVarArr = (z1.a[]) ((Spanned) textLayout.z()).getSpans(0, textLayout.z().length(), z1.a.class);
        p.i(aVarArr, "brushSpans");
        return aVarArr.length == 0 ? new z1.a[0] : aVarArr;
    }

    private final r1.a F() {
        return (r1.a) this.f7646g.getValue();
    }

    private final TextLayout z(int i11, int i12, TextUtils.TruncateAt truncateAt, int i13) {
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        int i14 = i13;
        CharSequence e11 = this.f7640a.e();
        float width = getWidth();
        x1.h E = E();
        int i15 = this.f7640a.i();
        LayoutIntrinsics g11 = this.f7640a.g();
        return new TextLayout(e11, width, E, i11, truncateAt2, i15, 1.0f, 0.0f, c.b(this.f7640a.h()), true, i14, 0, 0, i12, (int[]) null, (int[]) null, g11, 55424, (i) null);
    }

    public final CharSequence A() {
        return this.f7640a.e();
    }

    public final float B(int i11) {
        return this.f7644e.f(i11);
    }

    public final Locale D() {
        Locale textLocale = this.f7640a.j().getTextLocale();
        p.i(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    public final x1.h E() {
        return this.f7640a.j();
    }

    public float a() {
        return this.f7640a.a();
    }

    public ResolvedTextDirection b(int i11) {
        return this.f7644e.t(this.f7644e.l(i11)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    public float c(int i11) {
        return this.f7644e.q(i11);
    }

    public void d(x xVar, long j, h1 h1Var, e eVar) {
        p.j(xVar, "canvas");
        x1.h E = E();
        E.b(j);
        E.c(h1Var);
        E.d(eVar);
        Canvas c11 = u0.c.c(xVar);
        if (q()) {
            c11.save();
            c11.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f7644e.C(c11);
        if (q()) {
            c11.restore();
        }
    }

    public long e(int i11) {
        return b0.b(F().b(i11), F().a(i11));
    }

    public float f() {
        return B(0);
    }

    public int g(long j) {
        return this.f7644e.s(this.f7644e.m((int) t0.f.n(j)), t0.f.m(j));
    }

    public float getHeight() {
        return (float) this.f7644e.b();
    }

    public float getWidth() {
        return (float) b.n(this.f7643d);
    }

    public int h(int i11) {
        return this.f7644e.p(i11);
    }

    public int i(int i11, boolean z11) {
        if (z11) {
            return this.f7644e.r(i11);
        }
        return this.f7644e.k(i11);
    }

    public void j(x xVar, u uVar, h1 h1Var, e eVar) {
        p.j(xVar, "canvas");
        p.j(uVar, "brush");
        x1.h E = E();
        E.a(uVar, m.a(getWidth(), getHeight()));
        E.c(h1Var);
        E.d(eVar);
        Canvas c11 = u0.c.c(xVar);
        if (q()) {
            c11.save();
            c11.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f7644e.C(c11);
        if (q()) {
            c11.restore();
        }
    }

    public int k(float f11) {
        return this.f7644e.m((int) f11);
    }

    public float l(int i11) {
        return this.f7644e.n(i11);
    }

    public float m(int i11) {
        return this.f7644e.g(i11);
    }

    public h n(int i11) {
        if (i11 >= 0 && i11 <= A().length()) {
            float v = TextLayout.v(this.f7644e, i11, false, 2, (Object) null);
            int l11 = this.f7644e.l(i11);
            return new h(v, this.f7644e.q(l11), v, this.f7644e.g(l11));
        }
        throw new AssertionError("offset(" + i11 + ") is out of bounds (0," + A().length());
    }

    public int o() {
        return this.f7644e.h();
    }

    public float p(int i11) {
        return this.f7644e.o(i11);
    }

    public boolean q() {
        return this.f7644e.a();
    }

    public w0 r(int i11, int i12) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= i12) {
            z11 = true;
        }
        if (!z11 || i12 > A().length()) {
            throw new AssertionError("Start(" + i11 + ") or End(" + i12 + ") is out of Range(0.." + A().length() + "), or start > end!");
        }
        Path path = new Path();
        this.f7644e.y(i11, i12, path);
        return o.b(path);
    }

    public float s(int i11, boolean z11) {
        if (z11) {
            return TextLayout.v(this.f7644e, i11, false, 2, (Object) null);
        }
        return TextLayout.x(this.f7644e, i11, false, 2, (Object) null);
    }

    public float t() {
        if (this.f7641b < o()) {
            return B(this.f7641b - 1);
        }
        return B(o() - 1);
    }

    public int u(int i11) {
        return this.f7644e.l(i11);
    }

    public ResolvedTextDirection v(int i11) {
        if (this.f7644e.B(i11)) {
            return ResolvedTextDirection.Rtl;
        }
        return ResolvedTextDirection.Ltr;
    }

    public h w(int i11) {
        float v = TextLayout.v(this.f7644e, i11, false, 2, (Object) null);
        float v11 = TextLayout.v(this.f7644e, i11 + 1, false, 2, (Object) null);
        int l11 = this.f7644e.l(i11);
        return new h(v, this.f7644e.q(l11), v11, this.f7644e.g(l11));
    }

    public List<h> x() {
        return this.f7645f;
    }
}
