package h5;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private int f14811a;

    /* renamed from: b  reason: collision with root package name */
    private String f14812b;

    /* renamed from: c  reason: collision with root package name */
    long f14813c;

    public d() {
        this.f14811a = 1;
        this.f14812b = "ms";
        this.f14813c = 0;
        this.f14813c = a();
    }

    public long a() {
        int i11 = this.f14811a;
        if (i11 == 1) {
            return System.currentTimeMillis();
        }
        if (i11 == 2) {
            return System.nanoTime() / 1000;
        }
        if (i11 != 3) {
            return System.currentTimeMillis();
        }
        return System.nanoTime();
    }

    public void b(String str, String str2) {
        c();
        this.f14813c = a();
    }

    public String c() {
        return (a() - this.f14813c) + " " + this.f14812b;
    }
}
