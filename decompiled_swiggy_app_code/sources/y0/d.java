package y0;

/* compiled from: PathNode.kt */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f17895a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f17896b;

    /* compiled from: PathNode.kt */
    public static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17897c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17898d;

        /* renamed from: e  reason: collision with root package name */
        private final float f17899e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f17900f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f17901g;

        /* renamed from: h  reason: collision with root package name */
        private final float f17902h;

        /* renamed from: i  reason: collision with root package name */
        private final float f17903i;

        public a(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            super(false, false, 3, (kotlin.jvm.internal.i) null);
            this.f17897c = f11;
            this.f17898d = f12;
            this.f17899e = f13;
            this.f17900f = z11;
            this.f17901g = z12;
            this.f17902h = f14;
            this.f17903i = f15;
        }

        public final float c() {
            return this.f17902h;
        }

        public final float d() {
            return this.f17903i;
        }

        public final float e() {
            return this.f17897c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17897c), Float.valueOf(aVar.f17897c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17898d), Float.valueOf(aVar.f17898d)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17899e), Float.valueOf(aVar.f17899e)) && this.f17900f == aVar.f17900f && this.f17901g == aVar.f17901g && kotlin.jvm.internal.p.e(Float.valueOf(this.f17902h), Float.valueOf(aVar.f17902h)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17903i), Float.valueOf(aVar.f17903i));
        }

        public final float f() {
            return this.f17899e;
        }

        public final float g() {
            return this.f17898d;
        }

        public final boolean h() {
            return this.f17900f;
        }

        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.f17897c) * 31) + Float.floatToIntBits(this.f17898d)) * 31) + Float.floatToIntBits(this.f17899e)) * 31;
            boolean z11 = this.f17900f;
            boolean z12 = true;
            if (z11) {
                z11 = true;
            }
            int i11 = (floatToIntBits + (z11 ? 1 : 0)) * 31;
            boolean z13 = this.f17901g;
            if (!z13) {
                z12 = z13;
            }
            return ((((i11 + (z12 ? 1 : 0)) * 31) + Float.floatToIntBits(this.f17902h)) * 31) + Float.floatToIntBits(this.f17903i);
        }

        public final boolean i() {
            return this.f17901g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f17897c + ", verticalEllipseRadius=" + this.f17898d + ", theta=" + this.f17899e + ", isMoreThanHalf=" + this.f17900f + ", isPositiveArc=" + this.f17901g + ", arcStartX=" + this.f17902h + ", arcStartY=" + this.f17903i + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final b f17904c = new b();

        private b() {
            super(false, false, 3, (kotlin.jvm.internal.i) null);
        }
    }

    /* compiled from: PathNode.kt */
    public static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17905c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17906d;

        /* renamed from: e  reason: collision with root package name */
        private final float f17907e;

        /* renamed from: f  reason: collision with root package name */
        private final float f17908f;

        /* renamed from: g  reason: collision with root package name */
        private final float f17909g;

        /* renamed from: h  reason: collision with root package name */
        private final float f17910h;

        public c(float f11, float f12, float f13, float f14, float f15, float f16) {
            super(true, false, 2, (kotlin.jvm.internal.i) null);
            this.f17905c = f11;
            this.f17906d = f12;
            this.f17907e = f13;
            this.f17908f = f14;
            this.f17909g = f15;
            this.f17910h = f16;
        }

        public final float c() {
            return this.f17905c;
        }

        public final float d() {
            return this.f17907e;
        }

        public final float e() {
            return this.f17909g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17905c), Float.valueOf(cVar.f17905c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17906d), Float.valueOf(cVar.f17906d)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17907e), Float.valueOf(cVar.f17907e)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17908f), Float.valueOf(cVar.f17908f)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17909g), Float.valueOf(cVar.f17909g)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17910h), Float.valueOf(cVar.f17910h));
        }

        public final float f() {
            return this.f17906d;
        }

        public final float g() {
            return this.f17908f;
        }

        public final float h() {
            return this.f17910h;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.f17905c) * 31) + Float.floatToIntBits(this.f17906d)) * 31) + Float.floatToIntBits(this.f17907e)) * 31) + Float.floatToIntBits(this.f17908f)) * 31) + Float.floatToIntBits(this.f17909g)) * 31) + Float.floatToIntBits(this.f17910h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f17905c + ", y1=" + this.f17906d + ", x2=" + this.f17907e + ", y2=" + this.f17908f + ", x3=" + this.f17909g + ", y3=" + this.f17910h + ')';
        }
    }

    /* renamed from: y0.d$d  reason: collision with other inner class name */
    /* compiled from: PathNode.kt */
    public static final class C0212d extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17911c;

        public C0212d(float f11) {
            super(false, false, 3, (kotlin.jvm.internal.i) null);
            this.f17911c = f11;
        }

        public final float c() {
            return this.f17911c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0212d) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17911c), Float.valueOf(((C0212d) obj).f17911c));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f17911c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f17911c + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class e extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17912c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17913d;

        public e(float f11, float f12) {
            super(false, false, 3, (kotlin.jvm.internal.i) null);
            this.f17912c = f11;
            this.f17913d = f12;
        }

        public final float c() {
            return this.f17912c;
        }

        public final float d() {
            return this.f17913d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17912c), Float.valueOf(eVar.f17912c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17913d), Float.valueOf(eVar.f17913d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f17912c) * 31) + Float.floatToIntBits(this.f17913d);
        }

        public String toString() {
            return "LineTo(x=" + this.f17912c + ", y=" + this.f17913d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class f extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17914c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17915d;

        public f(float f11, float f12) {
            super(false, false, 3, (kotlin.jvm.internal.i) null);
            this.f17914c = f11;
            this.f17915d = f12;
        }

        public final float c() {
            return this.f17914c;
        }

        public final float d() {
            return this.f17915d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17914c), Float.valueOf(fVar.f17914c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17915d), Float.valueOf(fVar.f17915d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f17914c) * 31) + Float.floatToIntBits(this.f17915d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f17914c + ", y=" + this.f17915d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class g extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17916c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17917d;

        /* renamed from: e  reason: collision with root package name */
        private final float f17918e;

        /* renamed from: f  reason: collision with root package name */
        private final float f17919f;

        public g(float f11, float f12, float f13, float f14) {
            super(false, true, 1, (kotlin.jvm.internal.i) null);
            this.f17916c = f11;
            this.f17917d = f12;
            this.f17918e = f13;
            this.f17919f = f14;
        }

        public final float c() {
            return this.f17916c;
        }

        public final float d() {
            return this.f17918e;
        }

        public final float e() {
            return this.f17917d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17916c), Float.valueOf(gVar.f17916c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17917d), Float.valueOf(gVar.f17917d)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17918e), Float.valueOf(gVar.f17918e)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17919f), Float.valueOf(gVar.f17919f));
        }

        public final float f() {
            return this.f17919f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f17916c) * 31) + Float.floatToIntBits(this.f17917d)) * 31) + Float.floatToIntBits(this.f17918e)) * 31) + Float.floatToIntBits(this.f17919f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f17916c + ", y1=" + this.f17917d + ", x2=" + this.f17918e + ", y2=" + this.f17919f + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class h extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17920c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17921d;

        /* renamed from: e  reason: collision with root package name */
        private final float f17922e;

        /* renamed from: f  reason: collision with root package name */
        private final float f17923f;

        public h(float f11, float f12, float f13, float f14) {
            super(true, false, 2, (kotlin.jvm.internal.i) null);
            this.f17920c = f11;
            this.f17921d = f12;
            this.f17922e = f13;
            this.f17923f = f14;
        }

        public final float c() {
            return this.f17920c;
        }

        public final float d() {
            return this.f17922e;
        }

        public final float e() {
            return this.f17921d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17920c), Float.valueOf(hVar.f17920c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17921d), Float.valueOf(hVar.f17921d)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17922e), Float.valueOf(hVar.f17922e)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17923f), Float.valueOf(hVar.f17923f));
        }

        public final float f() {
            return this.f17923f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f17920c) * 31) + Float.floatToIntBits(this.f17921d)) * 31) + Float.floatToIntBits(this.f17922e)) * 31) + Float.floatToIntBits(this.f17923f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f17920c + ", y1=" + this.f17921d + ", x2=" + this.f17922e + ", y2=" + this.f17923f + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class i extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17924c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17925d;

        public i(float f11, float f12) {
            super(false, true, 1, (kotlin.jvm.internal.i) null);
            this.f17924c = f11;
            this.f17925d = f12;
        }

        public final float c() {
            return this.f17924c;
        }

        public final float d() {
            return this.f17925d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17924c), Float.valueOf(iVar.f17924c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17925d), Float.valueOf(iVar.f17925d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f17924c) * 31) + Float.floatToIntBits(this.f17925d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f17924c + ", y=" + this.f17925d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class j extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17926c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17927d;

        /* renamed from: e  reason: collision with root package name */
        private final float f17928e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f17929f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f17930g;

        /* renamed from: h  reason: collision with root package name */
        private final float f17931h;

        /* renamed from: i  reason: collision with root package name */
        private final float f17932i;

        public j(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            super(false, false, 3, (kotlin.jvm.internal.i) null);
            this.f17926c = f11;
            this.f17927d = f12;
            this.f17928e = f13;
            this.f17929f = z11;
            this.f17930g = z12;
            this.f17931h = f14;
            this.f17932i = f15;
        }

        public final float c() {
            return this.f17931h;
        }

        public final float d() {
            return this.f17932i;
        }

        public final float e() {
            return this.f17926c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17926c), Float.valueOf(jVar.f17926c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17927d), Float.valueOf(jVar.f17927d)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17928e), Float.valueOf(jVar.f17928e)) && this.f17929f == jVar.f17929f && this.f17930g == jVar.f17930g && kotlin.jvm.internal.p.e(Float.valueOf(this.f17931h), Float.valueOf(jVar.f17931h)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17932i), Float.valueOf(jVar.f17932i));
        }

        public final float f() {
            return this.f17928e;
        }

        public final float g() {
            return this.f17927d;
        }

        public final boolean h() {
            return this.f17929f;
        }

        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.f17926c) * 31) + Float.floatToIntBits(this.f17927d)) * 31) + Float.floatToIntBits(this.f17928e)) * 31;
            boolean z11 = this.f17929f;
            boolean z12 = true;
            if (z11) {
                z11 = true;
            }
            int i11 = (floatToIntBits + (z11 ? 1 : 0)) * 31;
            boolean z13 = this.f17930g;
            if (!z13) {
                z12 = z13;
            }
            return ((((i11 + (z12 ? 1 : 0)) * 31) + Float.floatToIntBits(this.f17931h)) * 31) + Float.floatToIntBits(this.f17932i);
        }

        public final boolean i() {
            return this.f17930g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f17926c + ", verticalEllipseRadius=" + this.f17927d + ", theta=" + this.f17928e + ", isMoreThanHalf=" + this.f17929f + ", isPositiveArc=" + this.f17930g + ", arcStartDx=" + this.f17931h + ", arcStartDy=" + this.f17932i + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class k extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17933c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17934d;

        /* renamed from: e  reason: collision with root package name */
        private final float f17935e;

        /* renamed from: f  reason: collision with root package name */
        private final float f17936f;

        /* renamed from: g  reason: collision with root package name */
        private final float f17937g;

        /* renamed from: h  reason: collision with root package name */
        private final float f17938h;

        public k(float f11, float f12, float f13, float f14, float f15, float f16) {
            super(true, false, 2, (kotlin.jvm.internal.i) null);
            this.f17933c = f11;
            this.f17934d = f12;
            this.f17935e = f13;
            this.f17936f = f14;
            this.f17937g = f15;
            this.f17938h = f16;
        }

        public final float c() {
            return this.f17933c;
        }

        public final float d() {
            return this.f17935e;
        }

        public final float e() {
            return this.f17937g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17933c), Float.valueOf(kVar.f17933c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17934d), Float.valueOf(kVar.f17934d)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17935e), Float.valueOf(kVar.f17935e)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17936f), Float.valueOf(kVar.f17936f)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17937g), Float.valueOf(kVar.f17937g)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17938h), Float.valueOf(kVar.f17938h));
        }

        public final float f() {
            return this.f17934d;
        }

        public final float g() {
            return this.f17936f;
        }

        public final float h() {
            return this.f17938h;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.f17933c) * 31) + Float.floatToIntBits(this.f17934d)) * 31) + Float.floatToIntBits(this.f17935e)) * 31) + Float.floatToIntBits(this.f17936f)) * 31) + Float.floatToIntBits(this.f17937g)) * 31) + Float.floatToIntBits(this.f17938h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f17933c + ", dy1=" + this.f17934d + ", dx2=" + this.f17935e + ", dy2=" + this.f17936f + ", dx3=" + this.f17937g + ", dy3=" + this.f17938h + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class l extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17939c;

        public l(float f11) {
            super(false, false, 3, (kotlin.jvm.internal.i) null);
            this.f17939c = f11;
        }

        public final float c() {
            return this.f17939c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17939c), Float.valueOf(((l) obj).f17939c));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f17939c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f17939c + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class m extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17940c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17941d;

        public m(float f11, float f12) {
            super(false, false, 3, (kotlin.jvm.internal.i) null);
            this.f17940c = f11;
            this.f17941d = f12;
        }

        public final float c() {
            return this.f17940c;
        }

        public final float d() {
            return this.f17941d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17940c), Float.valueOf(mVar.f17940c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17941d), Float.valueOf(mVar.f17941d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f17940c) * 31) + Float.floatToIntBits(this.f17941d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f17940c + ", dy=" + this.f17941d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class n extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17942c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17943d;

        public n(float f11, float f12) {
            super(false, false, 3, (kotlin.jvm.internal.i) null);
            this.f17942c = f11;
            this.f17943d = f12;
        }

        public final float c() {
            return this.f17942c;
        }

        public final float d() {
            return this.f17943d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17942c), Float.valueOf(nVar.f17942c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17943d), Float.valueOf(nVar.f17943d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f17942c) * 31) + Float.floatToIntBits(this.f17943d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f17942c + ", dy=" + this.f17943d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class o extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17944c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17945d;

        /* renamed from: e  reason: collision with root package name */
        private final float f17946e;

        /* renamed from: f  reason: collision with root package name */
        private final float f17947f;

        public o(float f11, float f12, float f13, float f14) {
            super(false, true, 1, (kotlin.jvm.internal.i) null);
            this.f17944c = f11;
            this.f17945d = f12;
            this.f17946e = f13;
            this.f17947f = f14;
        }

        public final float c() {
            return this.f17944c;
        }

        public final float d() {
            return this.f17946e;
        }

        public final float e() {
            return this.f17945d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17944c), Float.valueOf(oVar.f17944c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17945d), Float.valueOf(oVar.f17945d)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17946e), Float.valueOf(oVar.f17946e)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17947f), Float.valueOf(oVar.f17947f));
        }

        public final float f() {
            return this.f17947f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f17944c) * 31) + Float.floatToIntBits(this.f17945d)) * 31) + Float.floatToIntBits(this.f17946e)) * 31) + Float.floatToIntBits(this.f17947f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f17944c + ", dy1=" + this.f17945d + ", dx2=" + this.f17946e + ", dy2=" + this.f17947f + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class p extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17948c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17949d;

        /* renamed from: e  reason: collision with root package name */
        private final float f17950e;

        /* renamed from: f  reason: collision with root package name */
        private final float f17951f;

        public p(float f11, float f12, float f13, float f14) {
            super(true, false, 2, (kotlin.jvm.internal.i) null);
            this.f17948c = f11;
            this.f17949d = f12;
            this.f17950e = f13;
            this.f17951f = f14;
        }

        public final float c() {
            return this.f17948c;
        }

        public final float d() {
            return this.f17950e;
        }

        public final float e() {
            return this.f17949d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17948c), Float.valueOf(pVar.f17948c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17949d), Float.valueOf(pVar.f17949d)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17950e), Float.valueOf(pVar.f17950e)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17951f), Float.valueOf(pVar.f17951f));
        }

        public final float f() {
            return this.f17951f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f17948c) * 31) + Float.floatToIntBits(this.f17949d)) * 31) + Float.floatToIntBits(this.f17950e)) * 31) + Float.floatToIntBits(this.f17951f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f17948c + ", dy1=" + this.f17949d + ", dx2=" + this.f17950e + ", dy2=" + this.f17951f + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class q extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17952c;

        /* renamed from: d  reason: collision with root package name */
        private final float f17953d;

        public q(float f11, float f12) {
            super(false, true, 1, (kotlin.jvm.internal.i) null);
            this.f17952c = f11;
            this.f17953d = f12;
        }

        public final float c() {
            return this.f17952c;
        }

        public final float d() {
            return this.f17953d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return kotlin.jvm.internal.p.e(Float.valueOf(this.f17952c), Float.valueOf(qVar.f17952c)) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17953d), Float.valueOf(qVar.f17953d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f17952c) * 31) + Float.floatToIntBits(this.f17953d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f17952c + ", dy=" + this.f17953d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class r extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17954c;

        public r(float f11) {
            super(false, false, 3, (kotlin.jvm.internal.i) null);
            this.f17954c = f11;
        }

        public final float c() {
            return this.f17954c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17954c), Float.valueOf(((r) obj).f17954c));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f17954c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f17954c + ')';
        }
    }

    /* compiled from: PathNode.kt */
    public static final class s extends d {

        /* renamed from: c  reason: collision with root package name */
        private final float f17955c;

        public s(float f11) {
            super(false, false, 3, (kotlin.jvm.internal.i) null);
            this.f17955c = f11;
        }

        public final float c() {
            return this.f17955c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && kotlin.jvm.internal.p.e(Float.valueOf(this.f17955c), Float.valueOf(((s) obj).f17955c));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f17955c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f17955c + ')';
        }
    }

    private d(boolean z11, boolean z12) {
        this.f17895a = z11;
        this.f17896b = z12;
    }

    public /* synthetic */ d(boolean z11, boolean z12, kotlin.jvm.internal.i iVar) {
        this(z11, z12);
    }

    public final boolean a() {
        return this.f17895a;
    }

    public final boolean b() {
        return this.f17896b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(boolean z11, boolean z12, int i11, kotlin.jvm.internal.i iVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (kotlin.jvm.internal.i) null);
    }
}
