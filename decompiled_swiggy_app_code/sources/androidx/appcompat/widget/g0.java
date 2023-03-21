package androidx.appcompat.widget;

/* compiled from: RtlSpacingHelper */
class g0 {

    /* renamed from: a  reason: collision with root package name */
    private int f2142a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f2143b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f2144c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f2145d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f2146e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f2147f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2148g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2149h = false;

    g0() {
    }

    public int a() {
        return this.f2148g ? this.f2142a : this.f2143b;
    }

    public int b() {
        return this.f2142a;
    }

    public int c() {
        return this.f2143b;
    }

    public int d() {
        return this.f2148g ? this.f2143b : this.f2142a;
    }

    public void e(int i11, int i12) {
        this.f2149h = false;
        if (i11 != Integer.MIN_VALUE) {
            this.f2146e = i11;
            this.f2142a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f2147f = i12;
            this.f2143b = i12;
        }
    }

    public void f(boolean z11) {
        if (z11 != this.f2148g) {
            this.f2148g = z11;
            if (!this.f2149h) {
                this.f2142a = this.f2146e;
                this.f2143b = this.f2147f;
            } else if (z11) {
                int i11 = this.f2145d;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = this.f2146e;
                }
                this.f2142a = i11;
                int i12 = this.f2144c;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = this.f2147f;
                }
                this.f2143b = i12;
            } else {
                int i13 = this.f2144c;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = this.f2146e;
                }
                this.f2142a = i13;
                int i14 = this.f2145d;
                if (i14 == Integer.MIN_VALUE) {
                    i14 = this.f2147f;
                }
                this.f2143b = i14;
            }
        }
    }

    public void g(int i11, int i12) {
        this.f2144c = i11;
        this.f2145d = i12;
        this.f2149h = true;
        if (this.f2148g) {
            if (i12 != Integer.MIN_VALUE) {
                this.f2142a = i12;
            }
            if (i11 != Integer.MIN_VALUE) {
                this.f2143b = i11;
                return;
            }
            return;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f2142a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f2143b = i12;
        }
    }
}
