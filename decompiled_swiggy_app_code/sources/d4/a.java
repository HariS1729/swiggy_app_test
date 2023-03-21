package d4;

import android.os.Build;
import androidx.work.NetworkType;

/* compiled from: Constraints */
public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f14106i = new C0116a().a();

    /* renamed from: a  reason: collision with root package name */
    private NetworkType f14107a = NetworkType.NOT_REQUIRED;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14108b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14109c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14110d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14111e;

    /* renamed from: f  reason: collision with root package name */
    private long f14112f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f14113g = -1;

    /* renamed from: h  reason: collision with root package name */
    private b f14114h = new b();

    /* renamed from: d4.a$a  reason: collision with other inner class name */
    /* compiled from: Constraints */
    public static final class C0116a {

        /* renamed from: a  reason: collision with root package name */
        boolean f14115a = false;

        /* renamed from: b  reason: collision with root package name */
        boolean f14116b = false;

        /* renamed from: c  reason: collision with root package name */
        NetworkType f14117c = NetworkType.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        boolean f14118d = false;

        /* renamed from: e  reason: collision with root package name */
        boolean f14119e = false;

        /* renamed from: f  reason: collision with root package name */
        long f14120f = -1;

        /* renamed from: g  reason: collision with root package name */
        long f14121g = -1;

        /* renamed from: h  reason: collision with root package name */
        b f14122h = new b();

        public a a() {
            return new a(this);
        }

        public C0116a b(NetworkType networkType) {
            this.f14117c = networkType;
            return this;
        }

        public C0116a c(boolean z11) {
            this.f14118d = z11;
            return this;
        }
    }

    public a() {
    }

    public b a() {
        return this.f14114h;
    }

    public NetworkType b() {
        return this.f14107a;
    }

    public long c() {
        return this.f14112f;
    }

    public long d() {
        return this.f14113g;
    }

    public boolean e() {
        return this.f14114h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f14108b == aVar.f14108b && this.f14109c == aVar.f14109c && this.f14110d == aVar.f14110d && this.f14111e == aVar.f14111e && this.f14112f == aVar.f14112f && this.f14113g == aVar.f14113g && this.f14107a == aVar.f14107a) {
            return this.f14114h.equals(aVar.f14114h);
        }
        return false;
    }

    public boolean f() {
        return this.f14110d;
    }

    public boolean g() {
        return this.f14108b;
    }

    public boolean h() {
        return this.f14109c;
    }

    public int hashCode() {
        long j = this.f14112f;
        long j11 = this.f14113g;
        return (((((((((((((this.f14107a.hashCode() * 31) + (this.f14108b ? 1 : 0)) * 31) + (this.f14109c ? 1 : 0)) * 31) + (this.f14110d ? 1 : 0)) * 31) + (this.f14111e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f14114h.hashCode();
    }

    public boolean i() {
        return this.f14111e;
    }

    public void j(b bVar) {
        this.f14114h = bVar;
    }

    public void k(NetworkType networkType) {
        this.f14107a = networkType;
    }

    public void l(boolean z11) {
        this.f14110d = z11;
    }

    public void m(boolean z11) {
        this.f14108b = z11;
    }

    public void n(boolean z11) {
        this.f14109c = z11;
    }

    public void o(boolean z11) {
        this.f14111e = z11;
    }

    public void p(long j) {
        this.f14112f = j;
    }

    public void q(long j) {
        this.f14113g = j;
    }

    a(C0116a aVar) {
        this.f14108b = aVar.f14115a;
        int i11 = Build.VERSION.SDK_INT;
        this.f14109c = i11 >= 23 && aVar.f14116b;
        this.f14107a = aVar.f14117c;
        this.f14110d = aVar.f14118d;
        this.f14111e = aVar.f14119e;
        if (i11 >= 24) {
            this.f14114h = aVar.f14122h;
            this.f14112f = aVar.f14120f;
            this.f14113g = aVar.f14121g;
        }
    }

    public a(a aVar) {
        this.f14108b = aVar.f14108b;
        this.f14109c = aVar.f14109c;
        this.f14107a = aVar.f14107a;
        this.f14110d = aVar.f14110d;
        this.f14111e = aVar.f14111e;
        this.f14114h = aVar.f14114h;
    }
}
