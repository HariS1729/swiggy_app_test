package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a2;
import kotlin.jvm.internal.p;

/* compiled from: Arrangement.kt */
public final class Arrangement {

    /* renamed from: a  reason: collision with root package name */
    public static final Arrangement f3654a = new Arrangement();

    /* renamed from: b  reason: collision with root package name */
    private static final d f3655b = new j();

    /* renamed from: c  reason: collision with root package name */
    private static final d f3656c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final l f3657d = new k();

    /* renamed from: e  reason: collision with root package name */
    private static final l f3658e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final e f3659f = new b();

    /* renamed from: g  reason: collision with root package name */
    private static final e f3660g = new h();

    /* renamed from: h  reason: collision with root package name */
    private static final e f3661h = new g();

    /* renamed from: i  reason: collision with root package name */
    private static final e f3662i = new f();

    /* compiled from: Arrangement.kt */
    public static final class a implements l {
        a() {
        }

        public /* synthetic */ float a() {
            return a2.d.a(this);
        }

        public void b(d2.e eVar, int i11, int[] iArr, int[] iArr2) {
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(iArr2, "outPositions");
            Arrangement.f3654a.k(i11, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f3663a = d2.h.n((float) 0);

        b() {
        }

        public float a() {
            return this.f3663a;
        }

        public void b(d2.e eVar, int i11, int[] iArr, int[] iArr2) {
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(iArr2, "outPositions");
            Arrangement.f3654a.i(i11, iArr, iArr2, false);
        }

        public void c(d2.e eVar, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(layoutDirection, "layoutDirection");
            p.j(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f3654a.i(i11, iArr, iArr2, false);
            } else {
                Arrangement.f3654a.i(i11, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class c implements d {
        c() {
        }

        public /* synthetic */ float a() {
            return a2.c.a(this);
        }

        public void c(d2.e eVar, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(layoutDirection, "layoutDirection");
            p.j(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f3654a.k(i11, iArr, iArr2, false);
            } else {
                Arrangement.f3654a.j(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    /* compiled from: Arrangement.kt */
    public interface d {
        float a();

        void c(d2.e eVar, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);
    }

    /* compiled from: Arrangement.kt */
    public interface e extends d, l {
    }

    /* compiled from: Arrangement.kt */
    public static final class f implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f3664a = d2.h.n((float) 0);

        f() {
        }

        public float a() {
            return this.f3664a;
        }

        public void b(d2.e eVar, int i11, int[] iArr, int[] iArr2) {
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(iArr2, "outPositions");
            Arrangement.f3654a.l(i11, iArr, iArr2, false);
        }

        public void c(d2.e eVar, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(layoutDirection, "layoutDirection");
            p.j(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f3654a.l(i11, iArr, iArr2, false);
            } else {
                Arrangement.f3654a.l(i11, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class g implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f3665a = d2.h.n((float) 0);

        g() {
        }

        public float a() {
            return this.f3665a;
        }

        public void b(d2.e eVar, int i11, int[] iArr, int[] iArr2) {
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(iArr2, "outPositions");
            Arrangement.f3654a.m(i11, iArr, iArr2, false);
        }

        public void c(d2.e eVar, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(layoutDirection, "layoutDirection");
            p.j(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f3654a.m(i11, iArr, iArr2, false);
            } else {
                Arrangement.f3654a.m(i11, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class h implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f3666a = d2.h.n((float) 0);

        h() {
        }

        public float a() {
            return this.f3666a;
        }

        public void b(d2.e eVar, int i11, int[] iArr, int[] iArr2) {
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(iArr2, "outPositions");
            Arrangement.f3654a.n(i11, iArr, iArr2, false);
        }

        public void c(d2.e eVar, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(layoutDirection, "layoutDirection");
            p.j(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f3654a.n(i11, iArr, iArr2, false);
            } else {
                Arrangement.f3654a.n(i11, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class i implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f3667a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f3668b;

        /* renamed from: c  reason: collision with root package name */
        private final lp0.p<Integer, LayoutDirection, Integer> f3669c;

        /* renamed from: d  reason: collision with root package name */
        private final float f3670d;

        private i(float f11, boolean z11, lp0.p<? super Integer, ? super LayoutDirection, Integer> pVar) {
            this.f3667a = f11;
            this.f3668b = z11;
            this.f3669c = pVar;
            this.f3670d = f11;
        }

        public /* synthetic */ i(float f11, boolean z11, lp0.p pVar, kotlin.jvm.internal.i iVar) {
            this(f11, z11, pVar);
        }

        public float a() {
            return this.f3670d;
        }

        public void b(d2.e eVar, int i11, int[] iArr, int[] iArr2) {
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(iArr2, "outPositions");
            c(eVar, i11, iArr, LayoutDirection.Ltr, iArr2);
        }

        public void c(d2.e eVar, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i12;
            int i13;
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(layoutDirection, "layoutDirection");
            p.j(iArr2, "outPositions");
            if (!(iArr.length == 0)) {
                int j02 = eVar.j0(this.f3667a);
                boolean z11 = this.f3668b && layoutDirection == LayoutDirection.Rtl;
                Arrangement arrangement = Arrangement.f3654a;
                if (!z11) {
                    int length = iArr.length;
                    int i14 = 0;
                    i13 = 0;
                    i12 = 0;
                    int i15 = 0;
                    while (i14 < length) {
                        int i16 = iArr[i14];
                        iArr2[i15] = Math.min(i13, i11 - i16);
                        int min = Math.min(j02, (i11 - iArr2[i15]) - i16);
                        int i17 = iArr2[i15] + i16 + min;
                        i14++;
                        i15++;
                        int i18 = i17;
                        i12 = min;
                        i13 = i18;
                    }
                } else {
                    int i19 = 0;
                    int i21 = 0;
                    for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                        int i22 = iArr[length2];
                        iArr2[length2] = Math.min(i13, i11 - i22);
                        i21 = Math.min(j02, (i11 - iArr2[length2]) - i22);
                        i19 = iArr2[length2] + i22 + i21;
                    }
                }
                int i23 = i13 - i12;
                lp0.p<Integer, LayoutDirection, Integer> pVar = this.f3669c;
                if (pVar != null && i23 < i11) {
                    int intValue = pVar.invoke(Integer.valueOf(i11 - i23), layoutDirection).intValue();
                    int length3 = iArr2.length;
                    for (int i24 = 0; i24 < length3; i24++) {
                        iArr2[i24] = iArr2[i24] + intValue;
                    }
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return d2.h.p(this.f3667a, iVar.f3667a) && this.f3668b == iVar.f3668b && p.e(this.f3669c, iVar.f3669c);
        }

        public int hashCode() {
            int q = d2.h.q(this.f3667a) * 31;
            boolean z11 = this.f3668b;
            if (z11) {
                z11 = true;
            }
            int i11 = (q + (z11 ? 1 : 0)) * 31;
            lp0.p<Integer, LayoutDirection, Integer> pVar = this.f3669c;
            return i11 + (pVar == null ? 0 : pVar.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f3668b ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append(d2.h.r(this.f3667a));
            sb2.append(", ");
            sb2.append(this.f3669c);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class j implements d {
        j() {
        }

        public /* synthetic */ float a() {
            return a2.c.a(this);
        }

        public void c(d2.e eVar, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(layoutDirection, "layoutDirection");
            p.j(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f3654a.j(iArr, iArr2, false);
            } else {
                Arrangement.f3654a.k(i11, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* compiled from: Arrangement.kt */
    public static final class k implements l {
        k() {
        }

        public /* synthetic */ float a() {
            return a2.d.a(this);
        }

        public void b(d2.e eVar, int i11, int[] iArr, int[] iArr2) {
            p.j(eVar, "<this>");
            p.j(iArr, "sizes");
            p.j(iArr2, "outPositions");
            Arrangement.f3654a.j(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* compiled from: Arrangement.kt */
    public interface l {
        float a();

        void b(d2.e eVar, int i11, int[] iArr, int[] iArr2);
    }

    private Arrangement() {
    }

    public final l a() {
        return f3658e;
    }

    public final e b() {
        return f3659f;
    }

    public final d c() {
        return f3656c;
    }

    public final e d() {
        return f3662i;
    }

    public final e e() {
        return f3661h;
    }

    public final e f() {
        return f3660g;
    }

    public final d g() {
        return f3655b;
    }

    public final l h() {
        return f3657d;
    }

    public final void i(int i11, int[] iArr, int[] iArr2, boolean z11) {
        p.j(iArr, "size");
        p.j(iArr2, "outPosition");
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float f11 = ((float) (i11 - i13)) / ((float) 2);
        if (!z11) {
            int length = iArr.length;
            int i15 = 0;
            while (i12 < length) {
                int i16 = iArr[i12];
                iArr2[i15] = c.c(f11);
                f11 += (float) i16;
                i12++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i17 = iArr[length2];
                iArr2[length2] = c.c(f11);
                f11 += (float) i17;
            } else {
                return;
            }
        }
    }

    public final void j(int[] iArr, int[] iArr2, boolean z11) {
        p.j(iArr, "size");
        p.j(iArr2, "outPosition");
        int i11 = 0;
        if (!z11) {
            int length = iArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int i14 = iArr[i11];
                iArr2[i12] = i13;
                i13 += i14;
                i11++;
                i12++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i15 = iArr[length2];
                iArr2[length2] = i11;
                i11 += i15;
            } else {
                return;
            }
        }
    }

    public final void k(int i11, int[] iArr, int[] iArr2, boolean z11) {
        p.j(iArr, "size");
        p.j(iArr2, "outPosition");
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        int i15 = i11 - i13;
        if (!z11) {
            int length = iArr.length;
            int i16 = 0;
            while (i12 < length) {
                int i17 = iArr[i12];
                iArr2[i16] = i15;
                i15 += i17;
                i12++;
                i16++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i18 = iArr[length2];
                iArr2[length2] = i15;
                i15 += i18;
            } else {
                return;
            }
        }
    }

    public final void l(int i11, int[] iArr, int[] iArr2, boolean z11) {
        p.j(iArr, "size");
        p.j(iArr2, "outPosition");
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float length = (iArr.length == 0) ^ true ? ((float) (i11 - i13)) / ((float) iArr.length) : 0.0f;
        float f11 = length / ((float) 2);
        if (!z11) {
            int length2 = iArr.length;
            int i15 = 0;
            while (i12 < length2) {
                int i16 = iArr[i12];
                iArr2[i15] = c.c(f11);
                f11 += ((float) i16) + length;
                i12++;
                i15++;
            }
            return;
        }
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i17 = iArr[length3];
            iArr2[length3] = c.c(f11);
            f11 += ((float) i17) + length;
        }
    }

    public final void m(int i11, int[] iArr, int[] iArr2, boolean z11) {
        p.j(iArr, "size");
        p.j(iArr2, "outPosition");
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float f11 = 0.0f;
        float length = iArr.length > 1 ? ((float) (i11 - i13)) / ((float) (iArr.length - 1)) : 0.0f;
        if (!z11) {
            int length2 = iArr.length;
            int i15 = 0;
            while (i12 < length2) {
                int i16 = iArr[i12];
                iArr2[i15] = c.c(f11);
                f11 += ((float) i16) + length;
                i12++;
                i15++;
            }
            return;
        }
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i17 = iArr[length3];
            iArr2[length3] = c.c(f11);
            f11 += ((float) i17) + length;
        }
    }

    public final void n(int i11, int[] iArr, int[] iArr2, boolean z11) {
        p.j(iArr, "size");
        p.j(iArr2, "outPosition");
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float length = ((float) (i11 - i13)) / ((float) (iArr.length + 1));
        if (!z11) {
            int length2 = iArr.length;
            float f11 = length;
            int i15 = 0;
            while (i12 < length2) {
                int i16 = iArr[i12];
                iArr2[i15] = c.c(f11);
                f11 += ((float) i16) + length;
                i12++;
                i15++;
            }
            return;
        }
        float f12 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i17 = iArr[length3];
            iArr2[length3] = c.c(f12);
            f12 += ((float) i17) + length;
        }
    }

    public final e o(float f11) {
        return new i(f11, true, Arrangement$spacedBy$1.f3671a, (kotlin.jvm.internal.i) null);
    }
}
