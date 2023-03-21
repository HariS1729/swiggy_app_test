package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.content.res.h;
import androidx.core.view.a0;
import java.lang.ref.WeakReference;

/* compiled from: AppCompatTextHelper */
class s {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f2261a;

    /* renamed from: b  reason: collision with root package name */
    private m0 f2262b;

    /* renamed from: c  reason: collision with root package name */
    private m0 f2263c;

    /* renamed from: d  reason: collision with root package name */
    private m0 f2264d;

    /* renamed from: e  reason: collision with root package name */
    private m0 f2265e;

    /* renamed from: f  reason: collision with root package name */
    private m0 f2266f;

    /* renamed from: g  reason: collision with root package name */
    private m0 f2267g;

    /* renamed from: h  reason: collision with root package name */
    private m0 f2268h;

    /* renamed from: i  reason: collision with root package name */
    private final t f2269i;
    private int j = 0;
    private int k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f2270l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2271m;

    /* compiled from: AppCompatTextHelper */
    class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f2272a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2273b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f2274c;

        a(int i11, int i12, WeakReference weakReference) {
            this.f2272a = i11;
            this.f2273b = i12;
            this.f2274c = weakReference;
        }

        public void h(int i11) {
        }

        public void i(Typeface typeface) {
            int i11;
            if (Build.VERSION.SDK_INT >= 28 && (i11 = this.f2272a) != -1) {
                typeface = Typeface.create(typeface, i11, (this.f2273b & 2) != 0);
            }
            s.this.n(this.f2274c, typeface);
        }
    }

    /* compiled from: AppCompatTextHelper */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f2276a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f2277b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f2278c;

        b(TextView textView, Typeface typeface, int i11) {
            this.f2276a = textView;
            this.f2277b = typeface;
            this.f2278c = i11;
        }

        public void run() {
            this.f2276a.setTypeface(this.f2277b, this.f2278c);
        }
    }

    s(TextView textView) {
        this.f2261a = textView;
        this.f2269i = new t(textView);
    }

    private void B(int i11, float f11) {
        this.f2269i.v(i11, f11);
    }

    private void C(Context context, o0 o0Var) {
        String o11;
        this.j = o0Var.k(R.styleable.TextAppearance_android_textStyle, this.j);
        int i11 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        if (i11 >= 28) {
            int k11 = o0Var.k(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.k = k11;
            if (k11 != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        int i12 = R.styleable.TextAppearance_android_fontFamily;
        if (o0Var.s(i12) || o0Var.s(R.styleable.TextAppearance_fontFamily)) {
            this.f2270l = null;
            int i13 = R.styleable.TextAppearance_fontFamily;
            if (o0Var.s(i13)) {
                i12 = i13;
            }
            int i14 = this.k;
            int i15 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface j11 = o0Var.j(i12, this.j, new a(i14, i15, new WeakReference(this.f2261a)));
                    if (j11 != null) {
                        if (i11 < 28 || this.k == -1) {
                            this.f2270l = j11;
                        } else {
                            this.f2270l = Typeface.create(Typeface.create(j11, 0), this.k, (this.j & 2) != 0);
                        }
                    }
                    this.f2271m = this.f2270l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f2270l == null && (o11 = o0Var.o(i12)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    this.f2270l = Typeface.create(o11, this.j);
                    return;
                }
                Typeface create = Typeface.create(o11, 0);
                int i16 = this.k;
                if ((this.j & 2) != 0) {
                    z11 = true;
                }
                this.f2270l = Typeface.create(create, i16, z11);
                return;
            }
            return;
        }
        int i17 = R.styleable.TextAppearance_android_typeface;
        if (o0Var.s(i17)) {
            this.f2271m = false;
            int k12 = o0Var.k(i17, 1);
            if (k12 == 1) {
                this.f2270l = Typeface.SANS_SERIF;
            } else if (k12 == 2) {
                this.f2270l = Typeface.SERIF;
            } else if (k12 == 3) {
                this.f2270l = Typeface.MONOSPACE;
            }
        }
    }

    private void a(Drawable drawable, m0 m0Var) {
        if (drawable != null && m0Var != null) {
            g.i(drawable, m0Var, this.f2261a.getDrawableState());
        }
    }

    private static m0 d(Context context, g gVar, int i11) {
        ColorStateList f11 = gVar.f(context, i11);
        if (f11 == null) {
            return null;
        }
        m0 m0Var = new m0();
        m0Var.f2216d = true;
        m0Var.f2213a = f11;
        return m0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f2261a.getCompoundDrawablesRelative();
            TextView textView = this.f2261a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f2261a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f2261a.getCompoundDrawables();
                TextView textView2 = this.f2261a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.f2261a;
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
        }
    }

    private void z() {
        m0 m0Var = this.f2268h;
        this.f2262b = m0Var;
        this.f2263c = m0Var;
        this.f2264d = m0Var;
        this.f2265e = m0Var;
        this.f2266f = m0Var;
        this.f2267g = m0Var;
    }

    /* access modifiers changed from: package-private */
    public void A(int i11, float f11) {
        if (!androidx.core.widget.b.Z && !l()) {
            B(i11, f11);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!(this.f2262b == null && this.f2263c == null && this.f2264d == null && this.f2265e == null)) {
            Drawable[] compoundDrawables = this.f2261a.getCompoundDrawables();
            a(compoundDrawables[0], this.f2262b);
            a(compoundDrawables[1], this.f2263c);
            a(compoundDrawables[2], this.f2264d);
            a(compoundDrawables[3], this.f2265e);
        }
        if (this.f2266f != null || this.f2267g != null) {
            Drawable[] compoundDrawablesRelative = this.f2261a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f2266f);
            a(compoundDrawablesRelative[2], this.f2267g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f2269i.a();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f2269i.h();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f2269i.i();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f2269i.j();
    }

    /* access modifiers changed from: package-private */
    public int[] h() {
        return this.f2269i.k();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f2269i.l();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        m0 m0Var = this.f2268h;
        if (m0Var != null) {
            return m0Var.f2213a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        m0 m0Var = this.f2268h;
        if (m0Var != null) {
            return m0Var.f2214b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f2269i.p();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ca  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.f2261a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.g r11 = androidx.appcompat.widget.g.b()
            int[] r2 = androidx.appcompat.R.styleable.AppCompatTextHelper
            r12 = 0
            androidx.appcompat.widget.o0 r13 = androidx.appcompat.widget.o0.v(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f2261a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.r()
            r6 = 0
            r3 = r24
            r5 = r25
            androidx.core.view.a0.u0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance
            r14 = -1
            int r0 = r13.n(r0, r14)
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.m0 r1 = d(r10, r11, r1)
            r7.f2262b = r1
        L_0x0042:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.m0 r1 = d(r10, r11, r1)
            r7.f2263c = r1
        L_0x0054:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.m0 r1 = d(r10, r11, r1)
            r7.f2264d = r1
        L_0x0066:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.m0 r1 = d(r10, r11, r1)
            r7.f2265e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart
            boolean r3 = r13.s(r2)
            if (r3 == 0) goto L_0x008c
            int r2 = r13.n(r2, r12)
            androidx.appcompat.widget.m0 r2 = d(r10, r11, r2)
            r7.f2266f = r2
        L_0x008c:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd
            boolean r3 = r13.s(r2)
            if (r3 == 0) goto L_0x009e
            int r2 = r13.n(r2, r12)
            androidx.appcompat.widget.m0 r2 = d(r10, r11, r2)
            r7.f2267g = r2
        L_0x009e:
            r13.w()
            android.widget.TextView r2 = r7.f2261a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L_0x011a
            int[] r6 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.o0 r0 = androidx.appcompat.widget.o0.t(r10, r0, r6)
            if (r2 != 0) goto L_0x00c5
            int r6 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r15 = r0.s(r6)
            if (r15 == 0) goto L_0x00c5
            boolean r6 = r0.a(r6, r12)
            r15 = 1
            goto L_0x00c7
        L_0x00c5:
            r6 = 0
            r15 = 0
        L_0x00c7:
            r7.C(r10, r0)
            if (r1 >= r5) goto L_0x00f5
            int r4 = androidx.appcompat.R.styleable.TextAppearance_android_textColor
            boolean r17 = r0.s(r4)
            if (r17 == 0) goto L_0x00d9
            android.content.res.ColorStateList r4 = r0.c(r4)
            goto L_0x00da
        L_0x00d9:
            r4 = 0
        L_0x00da:
            int r13 = androidx.appcompat.R.styleable.TextAppearance_android_textColorHint
            boolean r18 = r0.s(r13)
            if (r18 == 0) goto L_0x00e7
            android.content.res.ColorStateList r13 = r0.c(r13)
            goto L_0x00e8
        L_0x00e7:
            r13 = 0
        L_0x00e8:
            int r14 = androidx.appcompat.R.styleable.TextAppearance_android_textColorLink
            boolean r19 = r0.s(r14)
            if (r19 == 0) goto L_0x00f7
            android.content.res.ColorStateList r14 = r0.c(r14)
            goto L_0x00f8
        L_0x00f5:
            r4 = 0
            r13 = 0
        L_0x00f7:
            r14 = 0
        L_0x00f8:
            int r5 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r20 = r0.s(r5)
            if (r20 == 0) goto L_0x0105
            java.lang.String r5 = r0.o(r5)
            goto L_0x0106
        L_0x0105:
            r5 = 0
        L_0x0106:
            if (r1 < r3) goto L_0x0115
            int r3 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r21 = r0.s(r3)
            if (r21 == 0) goto L_0x0115
            java.lang.String r3 = r0.o(r3)
            goto L_0x0116
        L_0x0115:
            r3 = 0
        L_0x0116:
            r0.w()
            goto L_0x0121
        L_0x011a:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0121:
            int[] r0 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.o0 r0 = androidx.appcompat.widget.o0.v(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x013c
            int r12 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r22 = r0.s(r12)
            if (r22 == 0) goto L_0x013c
            r22 = r3
            r3 = 0
            boolean r6 = r0.a(r12, r3)
            r3 = 23
            r15 = 1
            goto L_0x0140
        L_0x013c:
            r22 = r3
            r3 = 23
        L_0x0140:
            if (r1 >= r3) goto L_0x0166
            int r3 = androidx.appcompat.R.styleable.TextAppearance_android_textColor
            boolean r12 = r0.s(r3)
            if (r12 == 0) goto L_0x014e
            android.content.res.ColorStateList r4 = r0.c(r3)
        L_0x014e:
            int r3 = androidx.appcompat.R.styleable.TextAppearance_android_textColorHint
            boolean r12 = r0.s(r3)
            if (r12 == 0) goto L_0x015a
            android.content.res.ColorStateList r13 = r0.c(r3)
        L_0x015a:
            int r3 = androidx.appcompat.R.styleable.TextAppearance_android_textColorLink
            boolean r12 = r0.s(r3)
            if (r12 == 0) goto L_0x0166
            android.content.res.ColorStateList r14 = r0.c(r3)
        L_0x0166:
            int r3 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r12 = r0.s(r3)
            if (r12 == 0) goto L_0x0172
            java.lang.String r5 = r0.o(r3)
        L_0x0172:
            r3 = 26
            if (r1 < r3) goto L_0x0183
            int r3 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r12 = r0.s(r3)
            if (r12 == 0) goto L_0x0183
            java.lang.String r3 = r0.o(r3)
            goto L_0x0185
        L_0x0183:
            r3 = r22
        L_0x0185:
            r12 = 28
            if (r1 < r12) goto L_0x01a2
            int r12 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r16 = r0.s(r12)
            if (r16 == 0) goto L_0x01a2
            r16 = r11
            r11 = -1
            int r12 = r0.f(r12, r11)
            if (r12 != 0) goto L_0x01a4
            android.widget.TextView r11 = r7.f2261a
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L_0x01a4
        L_0x01a2:
            r16 = r11
        L_0x01a4:
            r7.C(r10, r0)
            r0.w()
            if (r4 == 0) goto L_0x01b1
            android.widget.TextView r0 = r7.f2261a
            r0.setTextColor(r4)
        L_0x01b1:
            if (r13 == 0) goto L_0x01b8
            android.widget.TextView r0 = r7.f2261a
            r0.setHintTextColor(r13)
        L_0x01b8:
            if (r14 == 0) goto L_0x01bf
            android.widget.TextView r0 = r7.f2261a
            r0.setLinkTextColor(r14)
        L_0x01bf:
            if (r2 != 0) goto L_0x01c6
            if (r15 == 0) goto L_0x01c6
            r7.s(r6)
        L_0x01c6:
            android.graphics.Typeface r0 = r7.f2270l
            if (r0 == 0) goto L_0x01dc
            int r2 = r7.k
            r4 = -1
            if (r2 != r4) goto L_0x01d7
            android.widget.TextView r2 = r7.f2261a
            int r4 = r7.j
            r2.setTypeface(r0, r4)
            goto L_0x01dc
        L_0x01d7:
            android.widget.TextView r2 = r7.f2261a
            r2.setTypeface(r0)
        L_0x01dc:
            if (r3 == 0) goto L_0x01e3
            android.widget.TextView r0 = r7.f2261a
            r0.setFontVariationSettings(r3)
        L_0x01e3:
            if (r5 == 0) goto L_0x0207
            r0 = 24
            if (r1 < r0) goto L_0x01f3
            android.widget.TextView r0 = r7.f2261a
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r5)
            r0.setTextLocales(r1)
            goto L_0x0207
        L_0x01f3:
            r0 = 44
            int r0 = r5.indexOf(r0)
            r1 = 0
            java.lang.String r0 = r5.substring(r1, r0)
            android.widget.TextView r1 = r7.f2261a
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            r1.setTextLocale(r0)
        L_0x0207:
            androidx.appcompat.widget.t r0 = r7.f2269i
            r1 = r24
            r0.q(r1, r9)
            boolean r0 = androidx.core.widget.b.Z
            if (r0 == 0) goto L_0x024f
            androidx.appcompat.widget.t r0 = r7.f2269i
            int r0 = r0.l()
            if (r0 == 0) goto L_0x024f
            androidx.appcompat.widget.t r0 = r7.f2269i
            int[] r0 = r0.k()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x024f
            android.widget.TextView r2 = r7.f2261a
            int r2 = r2.getAutoSizeStepGranularity()
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0249
            android.widget.TextView r0 = r7.f2261a
            androidx.appcompat.widget.t r2 = r7.f2269i
            int r2 = r2.i()
            androidx.appcompat.widget.t r3 = r7.f2269i
            int r3 = r3.h()
            androidx.appcompat.widget.t r4 = r7.f2269i
            int r4 = r4.j()
            r5 = 0
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L_0x024f
        L_0x0249:
            r5 = 0
            android.widget.TextView r2 = r7.f2261a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r0, r5)
        L_0x024f:
            int[] r0 = androidx.appcompat.R.styleable.AppCompatTextView
            androidx.appcompat.widget.o0 r8 = androidx.appcompat.widget.o0.u(r10, r1, r0)
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableLeftCompat
            r1 = -1
            int r0 = r8.n(r0, r1)
            r2 = r16
            if (r0 == r1) goto L_0x0266
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r3 = r0
            goto L_0x0267
        L_0x0266:
            r3 = 0
        L_0x0267:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTopCompat
            int r0 = r8.n(r0, r1)
            if (r0 == r1) goto L_0x0275
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r4 = r0
            goto L_0x0276
        L_0x0275:
            r4 = 0
        L_0x0276:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableRightCompat
            int r0 = r8.n(r0, r1)
            if (r0 == r1) goto L_0x0284
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r5 = r0
            goto L_0x0285
        L_0x0284:
            r5 = 0
        L_0x0285:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableBottomCompat
            int r0 = r8.n(r0, r1)
            if (r0 == r1) goto L_0x0293
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r6 = r0
            goto L_0x0294
        L_0x0293:
            r6 = 0
        L_0x0294:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableStartCompat
            int r0 = r8.n(r0, r1)
            if (r0 == r1) goto L_0x02a2
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r9 = r0
            goto L_0x02a3
        L_0x02a2:
            r9 = 0
        L_0x02a3:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableEndCompat
            int r0 = r8.n(r0, r1)
            if (r0 == r1) goto L_0x02b1
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r10 = r0
            goto L_0x02b2
        L_0x02b1:
            r10 = 0
        L_0x02b2:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.y(r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTint
            boolean r1 = r8.s(r0)
            if (r1 == 0) goto L_0x02ce
            android.content.res.ColorStateList r0 = r8.c(r0)
            android.widget.TextView r1 = r7.f2261a
            androidx.core.widget.l.h(r1, r0)
        L_0x02ce:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode
            boolean r1 = r8.s(r0)
            if (r1 == 0) goto L_0x02e6
            r1 = -1
            int r0 = r8.k(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.x.e(r0, r2)
            android.widget.TextView r2 = r7.f2261a
            androidx.core.widget.l.i(r2, r0)
            goto L_0x02e7
        L_0x02e6:
            r1 = -1
        L_0x02e7:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.f(r0, r1)
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_lastBaselineToBottomHeight
            int r2 = r8.f(r2, r1)
            int r3 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            int r3 = r8.f(r3, r1)
            r8.w()
            if (r0 == r1) goto L_0x0303
            android.widget.TextView r4 = r7.f2261a
            androidx.core.widget.l.k(r4, r0)
        L_0x0303:
            if (r2 == r1) goto L_0x030a
            android.widget.TextView r0 = r7.f2261a
            androidx.core.widget.l.l(r0, r2)
        L_0x030a:
            if (r3 == r1) goto L_0x0311
            android.widget.TextView r0 = r7.f2261a
            androidx.core.widget.l.m(r0, r3)
        L_0x0311:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s.m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f2271m) {
            this.f2270l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (a0.Z(textView)) {
                textView.post(new b(textView, typeface, this.j));
            } else {
                textView.setTypeface(typeface, this.j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z11, int i11, int i12, int i13, int i14) {
        if (!androidx.core.widget.b.Z) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* access modifiers changed from: package-private */
    public void q(Context context, int i11) {
        String o11;
        ColorStateList c11;
        ColorStateList c12;
        ColorStateList c13;
        o0 t = o0.t(context, i11, R.styleable.TextAppearance);
        int i12 = R.styleable.TextAppearance_textAllCaps;
        if (t.s(i12)) {
            s(t.a(i12, false));
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 23) {
            int i14 = R.styleable.TextAppearance_android_textColor;
            if (t.s(i14) && (c13 = t.c(i14)) != null) {
                this.f2261a.setTextColor(c13);
            }
            int i15 = R.styleable.TextAppearance_android_textColorLink;
            if (t.s(i15) && (c12 = t.c(i15)) != null) {
                this.f2261a.setLinkTextColor(c12);
            }
            int i16 = R.styleable.TextAppearance_android_textColorHint;
            if (t.s(i16) && (c11 = t.c(i16)) != null) {
                this.f2261a.setHintTextColor(c11);
            }
        }
        int i17 = R.styleable.TextAppearance_android_textSize;
        if (t.s(i17) && t.f(i17, -1) == 0) {
            this.f2261a.setTextSize(0, 0.0f);
        }
        C(context, t);
        if (i13 >= 26) {
            int i18 = R.styleable.TextAppearance_fontVariationSettings;
            if (t.s(i18) && (o11 = t.o(i18)) != null) {
                this.f2261a.setFontVariationSettings(o11);
            }
        }
        t.w();
        Typeface typeface = this.f2270l;
        if (typeface != null) {
            this.f2261a.setTypeface(typeface, this.j);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            s2.a.f(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z11) {
        this.f2261a.setAllCaps(z11);
    }

    /* access modifiers changed from: package-private */
    public void t(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        this.f2269i.r(i11, i12, i13, i14);
    }

    /* access modifiers changed from: package-private */
    public void u(int[] iArr, int i11) throws IllegalArgumentException {
        this.f2269i.s(iArr, i11);
    }

    /* access modifiers changed from: package-private */
    public void v(int i11) {
        this.f2269i.t(i11);
    }

    /* access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f2268h == null) {
            this.f2268h = new m0();
        }
        m0 m0Var = this.f2268h;
        m0Var.f2213a = colorStateList;
        m0Var.f2216d = colorStateList != null;
        z();
    }

    /* access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        if (this.f2268h == null) {
            this.f2268h = new m0();
        }
        m0 m0Var = this.f2268h;
        m0Var.f2214b = mode;
        m0Var.f2215c = mode != null;
        z();
    }
}
