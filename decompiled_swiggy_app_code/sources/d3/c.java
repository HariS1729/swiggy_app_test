package d3;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import d3.a;
import d3.g;
import java.util.Arrays;

/* compiled from: EmojiProcessor */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a.h f14064a;

    /* renamed from: b  reason: collision with root package name */
    private final g f14065b;

    /* renamed from: c  reason: collision with root package name */
    private b f14066c = new b();

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14067d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f14068e;

    /* compiled from: EmojiProcessor */
    private static final class a {
        static int a(CharSequence charSequence, int i11, int i12) {
            int length = charSequence.length();
            if (i11 < 0 || length < i11 || i12 < 0) {
                return -1;
            }
            while (true) {
                boolean z11 = false;
                while (i12 != 0) {
                    i11--;
                    if (i11 < 0) {
                        return z11 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i11);
                    if (z11) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i12--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i12--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z11 = true;
                    }
                }
                return i11;
            }
        }

        static int b(CharSequence charSequence, int i11, int i12) {
            int length = charSequence.length();
            if (i11 < 0 || length < i11 || i12 < 0) {
                return -1;
            }
            while (true) {
                boolean z11 = false;
                while (i12 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z11) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i12--;
                            i11 = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i12--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z11 = true;
                        }
                    } else if (z11) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    /* compiled from: EmojiProcessor */
    public static class b {

        /* renamed from: b  reason: collision with root package name */
        private static final ThreadLocal<StringBuilder> f14069b = new ThreadLocal<>();

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f14070a;

        b() {
            TextPaint textPaint = new TextPaint();
            this.f14070a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        private static StringBuilder a() {
            ThreadLocal<StringBuilder> threadLocal = f14069b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        public boolean b(CharSequence charSequence, int i11, int i12) {
            StringBuilder a11 = a();
            a11.setLength(0);
            while (i11 < i12) {
                a11.append(charSequence.charAt(i11));
                i11++;
            }
            return androidx.core.graphics.c.a(this.f14070a, a11.toString());
        }
    }

    /* renamed from: d3.c$c  reason: collision with other inner class name */
    /* compiled from: EmojiProcessor */
    static final class C0115c {

        /* renamed from: a  reason: collision with root package name */
        private int f14071a = 1;

        /* renamed from: b  reason: collision with root package name */
        private final g.a f14072b;

        /* renamed from: c  reason: collision with root package name */
        private g.a f14073c;

        /* renamed from: d  reason: collision with root package name */
        private g.a f14074d;

        /* renamed from: e  reason: collision with root package name */
        private int f14075e;

        /* renamed from: f  reason: collision with root package name */
        private int f14076f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f14077g;

        /* renamed from: h  reason: collision with root package name */
        private final int[] f14078h;

        C0115c(g.a aVar, boolean z11, int[] iArr) {
            this.f14072b = aVar;
            this.f14073c = aVar;
            this.f14077g = z11;
            this.f14078h = iArr;
        }

        private static boolean d(int i11) {
            return i11 == 65039;
        }

        private static boolean f(int i11) {
            return i11 == 65038;
        }

        private int g() {
            this.f14071a = 1;
            this.f14073c = this.f14072b;
            this.f14076f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f14073c.b().j() || d(this.f14075e)) {
                return true;
            }
            if (this.f14077g) {
                if (this.f14078h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f14078h, this.f14073c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int a(int i11) {
            g.a a11 = this.f14073c.a(i11);
            int i12 = 3;
            if (this.f14071a != 2) {
                if (a11 == null) {
                    i12 = g();
                    this.f14075e = i11;
                    return i12;
                }
                this.f14071a = 2;
                this.f14073c = a11;
                this.f14076f = 1;
            } else if (a11 != null) {
                this.f14073c = a11;
                this.f14076f++;
            } else {
                if (f(i11)) {
                    i12 = g();
                } else if (!d(i11)) {
                    if (this.f14073c.b() == null) {
                        i12 = g();
                    } else if (this.f14076f != 1) {
                        this.f14074d = this.f14073c;
                        g();
                    } else if (h()) {
                        this.f14074d = this.f14073c;
                        g();
                    } else {
                        i12 = g();
                    }
                }
                this.f14075e = i11;
                return i12;
            }
            i12 = 2;
            this.f14075e = i11;
            return i12;
        }

        /* access modifiers changed from: package-private */
        public b b() {
            return this.f14073c.b();
        }

        /* access modifiers changed from: package-private */
        public b c() {
            return this.f14074d.b();
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            if (this.f14071a != 2 || this.f14073c.b() == null || (this.f14076f <= 1 && !h())) {
                return false;
            }
            return true;
        }
    }

    c(g gVar, a.h hVar, boolean z11, int[] iArr) {
        this.f14064a = hVar;
        this.f14065b = gVar;
        this.f14067d = z11;
        this.f14068e = iArr;
    }

    private void a(Spannable spannable, b bVar, int i11, int i12) {
        spannable.setSpan(this.f14064a.a(bVar), i11, i12, 33);
    }

    private static boolean b(Editable editable, KeyEvent keyEvent, boolean z11) {
        d[] dVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (dVarArr = (d[]) editable.getSpans(selectionStart, selectionEnd, d.class)) != null && dVarArr.length > 0) {
            int length = dVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                d dVar = dVarArr[i11];
                int spanStart = editable.getSpanStart(dVar);
                int spanEnd = editable.getSpanEnd(dVar);
                if ((!z11 || spanStart != selectionStart) && ((z11 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i11++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean c(InputConnection inputConnection, Editable editable, int i11, int i12, boolean z11) {
        int i13;
        int i14;
        if (editable != null && inputConnection != null && i11 >= 0 && i12 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z11) {
                i14 = a.a(editable, selectionStart, Math.max(i11, 0));
                i13 = a.b(editable, selectionEnd, Math.max(i12, 0));
                if (i14 == -1 || i13 == -1) {
                    return false;
                }
            } else {
                i14 = Math.max(selectionStart - i11, 0);
                i13 = Math.min(selectionEnd + i12, editable.length());
            }
            d[] dVarArr = (d[]) editable.getSpans(i14, i13, d.class);
            if (dVarArr != null && dVarArr.length > 0) {
                for (d dVar : dVarArr) {
                    int spanStart = editable.getSpanStart(dVar);
                    int spanEnd = editable.getSpanEnd(dVar);
                    i14 = Math.min(spanStart, i14);
                    i13 = Math.max(spanEnd, i13);
                }
                int max = Math.max(i14, 0);
                int min = Math.min(i13, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean d(Editable editable, int i11, KeyEvent keyEvent) {
        boolean z11;
        if (i11 != 67) {
            z11 = i11 != 112 ? false : b(editable, keyEvent, true);
        } else {
            z11 = b(editable, keyEvent, false);
        }
        if (!z11) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean e(CharSequence charSequence, int i11, int i12, b bVar) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 23 && bVar.h() > i13) {
            return false;
        }
        if (bVar.d() == 0) {
            bVar.k(this.f14066c.b(charSequence, i11, i12));
        }
        if (bVar.d() == 2) {
            return true;
        }
        return false;
    }

    private static boolean f(int i11, int i12) {
        return i11 == -1 || i12 == -1 || i11 != i12;
    }

    private static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.text.Spannable} */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.CharSequence] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042 A[Catch:{ all -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ all -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence h(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.emoji.widget.i
            if (r0 == 0) goto L_0x000a
            r1 = r10
            androidx.emoji.widget.i r1 = (androidx.emoji.widget.i) r1
            r1.a()
        L_0x000a:
            r1 = 0
            if (r0 != 0) goto L_0x002b
            boolean r2 = r10 instanceof android.text.Spannable     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x0012
            goto L_0x002b
        L_0x0012:
            boolean r2 = r10 instanceof android.text.Spanned     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x002e
            r2 = r10
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x0116 }
            int r3 = r11 + -1
            int r4 = r12 + 1
            java.lang.Class<d3.d> r5 = d3.d.class
            int r2 = r2.nextSpanTransition(r3, r4, r5)     // Catch:{ all -> 0x0116 }
            if (r2 > r12) goto L_0x002e
            android.text.SpannableString r1 = new android.text.SpannableString     // Catch:{ all -> 0x0116 }
            r1.<init>(r10)     // Catch:{ all -> 0x0116 }
            goto L_0x002e
        L_0x002b:
            r1 = r10
            android.text.Spannable r1 = (android.text.Spannable) r1     // Catch:{ all -> 0x0116 }
        L_0x002e:
            r2 = 0
            if (r1 == 0) goto L_0x005c
            java.lang.Class<d3.d> r3 = d3.d.class
            java.lang.Object[] r3 = r1.getSpans(r11, r12, r3)     // Catch:{ all -> 0x0116 }
            d3.d[] r3 = (d3.d[]) r3     // Catch:{ all -> 0x0116 }
            if (r3 == 0) goto L_0x005c
            int r4 = r3.length     // Catch:{ all -> 0x0116 }
            if (r4 <= 0) goto L_0x005c
            int r4 = r3.length     // Catch:{ all -> 0x0116 }
            r5 = 0
        L_0x0040:
            if (r5 >= r4) goto L_0x005c
            r6 = r3[r5]     // Catch:{ all -> 0x0116 }
            int r7 = r1.getSpanStart(r6)     // Catch:{ all -> 0x0116 }
            int r8 = r1.getSpanEnd(r6)     // Catch:{ all -> 0x0116 }
            if (r7 == r12) goto L_0x0051
            r1.removeSpan(r6)     // Catch:{ all -> 0x0116 }
        L_0x0051:
            int r11 = java.lang.Math.min(r7, r11)     // Catch:{ all -> 0x0116 }
            int r12 = java.lang.Math.max(r8, r12)     // Catch:{ all -> 0x0116 }
            int r5 = r5 + 1
            goto L_0x0040
        L_0x005c:
            if (r11 == r12) goto L_0x010d
            int r3 = r10.length()     // Catch:{ all -> 0x0116 }
            if (r11 < r3) goto L_0x0066
            goto L_0x010d
        L_0x0066:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r3) goto L_0x007b
            if (r1 == 0) goto L_0x007b
            int r3 = r1.length()     // Catch:{ all -> 0x0116 }
            java.lang.Class<d3.d> r4 = d3.d.class
            java.lang.Object[] r3 = r1.getSpans(r2, r3, r4)     // Catch:{ all -> 0x0116 }
            d3.d[] r3 = (d3.d[]) r3     // Catch:{ all -> 0x0116 }
            int r3 = r3.length     // Catch:{ all -> 0x0116 }
            int r13 = r13 - r3
        L_0x007b:
            d3.c$c r3 = new d3.c$c     // Catch:{ all -> 0x0116 }
            d3.g r4 = r9.f14065b     // Catch:{ all -> 0x0116 }
            d3.g$a r4 = r4.f()     // Catch:{ all -> 0x0116 }
            boolean r5 = r9.f14067d     // Catch:{ all -> 0x0116 }
            int[] r6 = r9.f14068e     // Catch:{ all -> 0x0116 }
            r3.<init>(r4, r5, r6)     // Catch:{ all -> 0x0116 }
            int r4 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x0116 }
            r2 = r1
            r5 = r4
            r4 = 0
        L_0x0091:
            r1 = r11
        L_0x0092:
            if (r11 >= r12) goto L_0x00df
            if (r4 >= r13) goto L_0x00df
            int r6 = r3.a(r5)     // Catch:{ all -> 0x0116 }
            r7 = 1
            if (r6 == r7) goto L_0x00cd
            r7 = 2
            if (r6 == r7) goto L_0x00c1
            r7 = 3
            if (r6 == r7) goto L_0x00a4
            goto L_0x0092
        L_0x00a4:
            if (r14 != 0) goto L_0x00b0
            d3.b r6 = r3.c()     // Catch:{ all -> 0x0116 }
            boolean r6 = r9.e(r10, r1, r11, r6)     // Catch:{ all -> 0x0116 }
            if (r6 != 0) goto L_0x0091
        L_0x00b0:
            if (r2 != 0) goto L_0x00b7
            android.text.SpannableString r2 = new android.text.SpannableString     // Catch:{ all -> 0x0116 }
            r2.<init>(r10)     // Catch:{ all -> 0x0116 }
        L_0x00b7:
            d3.b r6 = r3.c()     // Catch:{ all -> 0x0116 }
            r9.a(r2, r6, r1, r11)     // Catch:{ all -> 0x0116 }
            int r4 = r4 + 1
            goto L_0x0091
        L_0x00c1:
            int r6 = java.lang.Character.charCount(r5)     // Catch:{ all -> 0x0116 }
            int r11 = r11 + r6
            if (r11 >= r12) goto L_0x0092
            int r5 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x0116 }
            goto L_0x0092
        L_0x00cd:
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x0116 }
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0116 }
            int r1 = r1 + r11
            if (r1 >= r12) goto L_0x00dd
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x0116 }
            r5 = r11
        L_0x00dd:
            r11 = r1
            goto L_0x0092
        L_0x00df:
            boolean r12 = r3.e()     // Catch:{ all -> 0x0116 }
            if (r12 == 0) goto L_0x0102
            if (r4 >= r13) goto L_0x0102
            if (r14 != 0) goto L_0x00f3
            d3.b r12 = r3.b()     // Catch:{ all -> 0x0116 }
            boolean r12 = r9.e(r10, r1, r11, r12)     // Catch:{ all -> 0x0116 }
            if (r12 != 0) goto L_0x0102
        L_0x00f3:
            if (r2 != 0) goto L_0x00fb
            android.text.SpannableString r12 = new android.text.SpannableString     // Catch:{ all -> 0x0116 }
            r12.<init>(r10)     // Catch:{ all -> 0x0116 }
            r2 = r12
        L_0x00fb:
            d3.b r12 = r3.b()     // Catch:{ all -> 0x0116 }
            r9.a(r2, r12, r1, r11)     // Catch:{ all -> 0x0116 }
        L_0x0102:
            if (r2 != 0) goto L_0x0105
            r2 = r10
        L_0x0105:
            if (r0 == 0) goto L_0x010c
            androidx.emoji.widget.i r10 = (androidx.emoji.widget.i) r10
            r10.d()
        L_0x010c:
            return r2
        L_0x010d:
            if (r0 == 0) goto L_0x0115
            r11 = r10
            androidx.emoji.widget.i r11 = (androidx.emoji.widget.i) r11
            r11.d()
        L_0x0115:
            return r10
        L_0x0116:
            r11 = move-exception
            if (r0 == 0) goto L_0x011e
            androidx.emoji.widget.i r10 = (androidx.emoji.widget.i) r10
            r10.d()
        L_0x011e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.c.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
