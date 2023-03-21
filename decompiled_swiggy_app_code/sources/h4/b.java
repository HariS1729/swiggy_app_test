package h4;

/* compiled from: NetworkState */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14791a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14792b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14793c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14794d;

    public b(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f14791a = z11;
        this.f14792b = z12;
        this.f14793c = z13;
        this.f14794d = z14;
    }

    public boolean a() {
        return this.f14791a;
    }

    public boolean b() {
        return this.f14793c;
    }

    public boolean c() {
        return this.f14794d;
    }

    public boolean d() {
        return this.f14792b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f14791a == bVar.f14791a && this.f14792b == bVar.f14792b && this.f14793c == bVar.f14793c && this.f14794d == bVar.f14794d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f14791a;
        if (this.f14792b) {
            i11 += 16;
        }
        if (this.f14793c) {
            i11 += 256;
        }
        return this.f14794d ? i11 + 4096 : i11;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f14791a), Boolean.valueOf(this.f14792b), Boolean.valueOf(this.f14793c), Boolean.valueOf(this.f14794d)});
    }
}
