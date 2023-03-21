package androidx.navigation;

/* compiled from: NavOptions */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10965a;

    /* renamed from: b  reason: collision with root package name */
    private int f10966b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10967c;

    /* renamed from: d  reason: collision with root package name */
    private int f10968d;

    /* renamed from: e  reason: collision with root package name */
    private int f10969e;

    /* renamed from: f  reason: collision with root package name */
    private int f10970f;

    /* renamed from: g  reason: collision with root package name */
    private int f10971g;

    /* compiled from: NavOptions */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f10972a;

        /* renamed from: b  reason: collision with root package name */
        int f10973b = -1;

        /* renamed from: c  reason: collision with root package name */
        boolean f10974c;

        /* renamed from: d  reason: collision with root package name */
        int f10975d = -1;

        /* renamed from: e  reason: collision with root package name */
        int f10976e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f10977f = -1;

        /* renamed from: g  reason: collision with root package name */
        int f10978g = -1;

        public t a() {
            return new t(this.f10972a, this.f10973b, this.f10974c, this.f10975d, this.f10976e, this.f10977f, this.f10978g);
        }

        public a b(int i11) {
            this.f10975d = i11;
            return this;
        }

        public a c(int i11) {
            this.f10976e = i11;
            return this;
        }

        public a d(boolean z11) {
            this.f10972a = z11;
            return this;
        }

        public a e(int i11) {
            this.f10977f = i11;
            return this;
        }

        public a f(int i11) {
            this.f10978g = i11;
            return this;
        }

        public a g(int i11, boolean z11) {
            this.f10973b = i11;
            this.f10974c = z11;
            return this;
        }
    }

    t(boolean z11, int i11, boolean z12, int i12, int i13, int i14, int i15) {
        this.f10965a = z11;
        this.f10966b = i11;
        this.f10967c = z12;
        this.f10968d = i12;
        this.f10969e = i13;
        this.f10970f = i14;
        this.f10971g = i15;
    }

    public int a() {
        return this.f10968d;
    }

    public int b() {
        return this.f10969e;
    }

    public int c() {
        return this.f10970f;
    }

    public int d() {
        return this.f10971g;
    }

    public int e() {
        return this.f10966b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f10965a == tVar.f10965a && this.f10966b == tVar.f10966b && this.f10967c == tVar.f10967c && this.f10968d == tVar.f10968d && this.f10969e == tVar.f10969e && this.f10970f == tVar.f10970f && this.f10971g == tVar.f10971g) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.f10967c;
    }

    public boolean g() {
        return this.f10965a;
    }

    public int hashCode() {
        return ((((((((((((g() ? 1 : 0) * true) + e()) * 31) + (f() ? 1 : 0)) * 31) + a()) * 31) + b()) * 31) + c()) * 31) + d();
    }
}
