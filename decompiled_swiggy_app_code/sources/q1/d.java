package q1;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: LayoutHelper.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Layout f16305a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Integer> f16306b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Bidi> f16307c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean[] f16308d;

    /* renamed from: e  reason: collision with root package name */
    private char[] f16309e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16310f;

    /* compiled from: LayoutHelper.kt */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f16313a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16314b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f16315c;

        public a(int i11, int i12, boolean z11) {
            this.f16313a = i11;
            this.f16314b = i12;
            this.f16315c = z11;
        }

        public final int a() {
            return this.f16314b;
        }

        public final int b() {
            return this.f16313a;
        }

        public final boolean c() {
            return this.f16315c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16313a == aVar.f16313a && this.f16314b == aVar.f16314b && this.f16315c == aVar.f16315c;
        }

        public int hashCode() {
            int i11 = ((this.f16313a * 31) + this.f16314b) * 31;
            boolean z11 = this.f16315c;
            if (z11) {
                z11 = true;
            }
            return i11 + (z11 ? 1 : 0);
        }

        public String toString() {
            return "BidiRun(start=" + this.f16313a + ", end=" + this.f16314b + ", isRtl=" + this.f16315c + ')';
        }
    }

    public d(Layout layout) {
        p.j(layout, "layout");
        this.f16305a = layout;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        do {
            CharSequence text = this.f16305a.getText();
            p.i(text, "layout.text");
            int g02 = StringsKt__StringsKt.g0(text, 10, i11, false, 4, (Object) null);
            i11 = g02 < 0 ? this.f16305a.getText().length() : g02 + 1;
            arrayList.add(Integer.valueOf(i11));
        } while (i11 < this.f16305a.getText().length());
        this.f16306b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList2.add((Object) null);
        }
        this.f16307c = arrayList2;
        this.f16308d = new boolean[this.f16306b.size()];
        this.f16310f = this.f16306b.size();
    }

    private final float b(int i11, boolean z11) {
        if (z11) {
            return this.f16305a.getPrimaryHorizontal(i11);
        }
        return this.f16305a.getSecondaryHorizontal(i11);
    }

    private final int h(int i11) {
        while (i11 > 0 && f(this.f16305a.getText().charAt(i11 - 1))) {
            i11--;
        }
        return i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r3.getRunCount() == 1) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.text.Bidi a(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.f16308d
            boolean r0 = r0[r12]
            if (r0 == 0) goto L_0x000f
            java.util.List<java.text.Bidi> r0 = r11.f16307c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        L_0x000f:
            r0 = 0
            if (r12 != 0) goto L_0x0014
            r1 = 0
            goto L_0x0022
        L_0x0014:
            java.util.List<java.lang.Integer> r1 = r11.f16306b
            int r2 = r12 + -1
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L_0x0022:
            java.util.List<java.lang.Integer> r2 = r11.f16306b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.f16309e
            if (r3 == 0) goto L_0x0037
            int r4 = r3.length
            if (r4 >= r8) goto L_0x0039
        L_0x0037:
            char[] r3 = new char[r8]
        L_0x0039:
            r10 = r3
            android.text.Layout r3 = r11.f16305a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005f
            boolean r9 = r11.g(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L_0x0060
        L_0x005f:
            r0 = r1
        L_0x0060:
            java.util.List<java.text.Bidi> r3 = r11.f16307c
            r3.set(r12, r0)
            boolean[] r3 = r11.f16308d
            r3[r12] = r2
            if (r0 == 0) goto L_0x0072
            char[] r12 = r11.f16309e
            if (r10 != r12) goto L_0x0071
            r10 = r1
            goto L_0x0072
        L_0x0071:
            r10 = r12
        L_0x0072:
            r11.f16309e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.d.a(int):java.text.Bidi");
    }

    public final float c(int i11, boolean z11, boolean z12) {
        if (!z12) {
            return b(i11, z11);
        }
        int a11 = c.a(this.f16305a, i11, z12);
        int lineStart = this.f16305a.getLineStart(a11);
        int lineEnd = this.f16305a.getLineEnd(a11);
        if (i11 != lineStart && i11 != lineEnd) {
            return b(i11, z11);
        }
        if (i11 == 0 || i11 == this.f16305a.getText().length()) {
            return b(i11, z11);
        }
        int d11 = d(i11, z12);
        boolean g11 = g(d11);
        int h11 = h(lineEnd);
        int e11 = e(d11);
        int i12 = lineStart - e11;
        int i13 = h11 - e11;
        Bidi a12 = a(d11);
        Bidi createLineBidi = a12 != null ? a12.createLineBidi(i12, i13) : null;
        boolean z13 = false;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.f16305a.isRtlCharAt(lineStart);
            if (z11 || g11 == isRtlCharAt) {
                g11 = !g11;
            }
            if (i11 == lineStart) {
                z13 = g11;
            } else if (!g11) {
                z13 = true;
            }
            Layout layout = this.f16305a;
            return z13 ? layout.getLineLeft(a11) : layout.getLineRight(a11);
        }
        int runCount = createLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i14 = 0; i14 < runCount; i14++) {
            aVarArr[i14] = new a(createLineBidi.getRunStart(i14) + lineStart, createLineBidi.getRunLimit(i14) + lineStart, createLineBidi.getRunLevel(i14) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i15 = 0; i15 < runCount2; i15++) {
            bArr[i15] = (byte) createLineBidi.getRunLevel(i15);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i16 = -1;
        if (i11 == lineStart) {
            int i17 = 0;
            while (true) {
                if (i17 >= runCount) {
                    break;
                }
                if (aVarArr[i17].b() == i11) {
                    i16 = i17;
                    break;
                }
                i17++;
            }
            a aVar = aVarArr[i16];
            if (z11 || g11 == aVar.c()) {
                g11 = !g11;
            }
            if (i16 == 0 && g11) {
                return this.f16305a.getLineLeft(a11);
            }
            if (i16 == ArraysKt___ArraysKt.O(aVarArr) && !g11) {
                return this.f16305a.getLineRight(a11);
            }
            if (g11) {
                return this.f16305a.getPrimaryHorizontal(aVarArr[i16 - 1].b());
            }
            return this.f16305a.getPrimaryHorizontal(aVarArr[i16 + 1].b());
        }
        int i18 = 0;
        while (true) {
            if (i18 >= runCount) {
                break;
            }
            if (aVarArr[i18].a() == i11) {
                i16 = i18;
                break;
            }
            i18++;
        }
        a aVar2 = aVarArr[i16];
        if (!z11 && g11 != aVar2.c()) {
            g11 = !g11;
        }
        if (i16 == 0 && g11) {
            return this.f16305a.getLineLeft(a11);
        }
        if (i16 == ArraysKt___ArraysKt.O(aVarArr) && !g11) {
            return this.f16305a.getLineRight(a11);
        }
        if (g11) {
            return this.f16305a.getPrimaryHorizontal(aVarArr[i16 - 1].a());
        }
        return this.f16305a.getPrimaryHorizontal(aVarArr[i16 + 1].a());
    }

    public final int d(int i11, boolean z11) {
        int i12 = k.i(this.f16306b, Integer.valueOf(i11), 0, 0, 6, (Object) null);
        int i13 = i12 < 0 ? -(i12 + 1) : i12 + 1;
        if (z11 && i13 > 0) {
            int i14 = i13 - 1;
            if (i11 == this.f16306b.get(i14).intValue()) {
                return i14;
            }
        }
        return i13;
    }

    public final int e(int i11) {
        if (i11 == 0) {
            return 0;
        }
        return this.f16306b.get(i11 - 1).intValue();
    }

    public final boolean f(char c11) {
        if (c11 == ' ' || c11 == 10 || c11 == 5760) {
            return true;
        }
        return ((8192 <= c11 && c11 < 8203) && c11 != 8199) || c11 == 8287 || c11 == 12288;
    }

    public final boolean g(int i11) {
        return this.f16305a.getParagraphDirection(this.f16305a.getLineForOffset(e(i11))) == -1;
    }
}
