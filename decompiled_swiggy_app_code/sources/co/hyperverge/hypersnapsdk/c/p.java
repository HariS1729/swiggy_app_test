package co.hyperverge.hypersnapsdk.c;

import java.io.Serializable;

/* compiled from: TimingUtils */
public class p implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private int f13333a;

    /* renamed from: b  reason: collision with root package name */
    private String f13334b;

    /* renamed from: c  reason: collision with root package name */
    long f13335c;

    public p() {
        this.f13333a = 1;
        this.f13334b = "ms";
        this.f13335c = 0;
        this.f13335c = a();
    }

    public long a() {
        int i11 = this.f13333a;
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

    public long b() {
        long longValue = c().longValue();
        this.f13335c = a();
        return longValue;
    }

    public Long c() {
        return Long.valueOf(a() - this.f13335c);
    }

    public void d() {
        this.f13335c = a();
    }
}
