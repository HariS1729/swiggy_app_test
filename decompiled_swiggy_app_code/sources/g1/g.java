package g1;

import d2.v;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import t0.f;

/* compiled from: VelocityTracker.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final c[] f14726a;

    /* renamed from: b  reason: collision with root package name */
    private int f14727b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14728c;

    public g() {
        c[] cVarArr = new c[20];
        for (int i11 = 0; i11 < 20; i11++) {
            cVarArr[i11] = null;
        }
        this.f14726a = cVarArr;
        this.f14728c = true;
    }

    private final long c() {
        c cVar = this.f14726a[this.f14727b];
        if (cVar == null) {
            return v.a(0.0f, 0.0f);
        }
        a aVar = new a();
        a aVar2 = new a();
        int i11 = this.f14727b;
        int i12 = 0;
        c cVar2 = cVar;
        do {
            i11 = (i11 + 1) % 20;
            c cVar3 = this.f14726a[i11];
            if (cVar3 != null) {
                long b11 = cVar.b() - cVar3.b();
                long abs = Math.abs(cVar3.b() - cVar2.b());
                if (b11 <= 100) {
                    if (abs > 40) {
                        aVar.c();
                        aVar2.c();
                    }
                    long j = -b11;
                    aVar.a(j, f.m(cVar3.a()));
                    aVar2.a(j, f.n(cVar3.a()));
                    i12++;
                }
                cVar2 = cVar;
            }
            if (i11 == this.f14727b) {
                break;
            }
        } while (i12 < 20);
        if (i12 < 3) {
            return v.a(0.0f, 0.0f);
        }
        return v.a(aVar.b(), aVar2.b());
    }

    private final f d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i11 = this.f14727b;
        c cVar = this.f14726a[i11];
        if (cVar == null) {
            return f.f14720e.a();
        }
        int i12 = 0;
        c cVar2 = cVar;
        while (true) {
            c cVar3 = this.f14726a[i11];
            if (cVar3 != null) {
                float b11 = (float) (cVar.b() - cVar3.b());
                float abs = (float) Math.abs(cVar3.b() - cVar2.b());
                if (b11 > 100.0f || abs > 40.0f) {
                    break;
                }
                long a11 = cVar3.a();
                arrayList.add(Float.valueOf(f.m(a11)));
                arrayList2.add(Float.valueOf(f.n(a11)));
                arrayList3.add(Float.valueOf(-b11));
                if (i11 == 0) {
                    i11 = 20;
                }
                i11--;
                i12++;
                if (i12 >= 20) {
                    cVar2 = cVar3;
                    break;
                }
                cVar2 = cVar3;
            } else {
                break;
            }
        }
        if (i12 >= 3) {
            try {
                d d11 = h.d(arrayList3, arrayList, 2);
                d d12 = h.d(arrayList3, arrayList2, 2);
                float f11 = (float) 1000;
                return new f(t0.g.a(d11.a().get(1).floatValue() * f11, d12.a().get(1).floatValue() * f11), d11.b() * d12.b(), cVar.b() - cVar2.b(), f.q(cVar.a(), cVar2.a()), (i) null);
            } catch (IllegalArgumentException unused) {
                return f.f14720e.a();
            }
        } else {
            return new f(f.f16662b.c(), 1.0f, cVar.b() - cVar2.b(), f.q(cVar.a(), cVar2.a()), (i) null);
        }
    }

    public final void a(long j, long j11) {
        int i11 = (this.f14727b + 1) % 20;
        this.f14727b = i11;
        this.f14726a[i11] = new c(j11, j, (i) null);
    }

    public final long b() {
        if (this.f14728c) {
            return c();
        }
        long b11 = d().b();
        return v.a(f.m(b11), f.n(b11));
    }
}
