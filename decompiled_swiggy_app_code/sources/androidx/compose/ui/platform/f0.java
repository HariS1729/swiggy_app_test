package androidx.compose.ui.platform;

import a2.a;
import a2.e;
import a2.h;
import android.os.Parcel;
import android.util.Base64;
import d2.r;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.g;
import u0.d0;
import u0.h1;
import u1.s;
import u1.t;
import u1.v;

/* compiled from: AndroidClipboardManager.android.kt */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Parcel f7301a;

    public f0(String str) {
        p.j(str, "string");
        Parcel obtain = Parcel.obtain();
        p.i(obtain, "obtain()");
        this.f7301a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    private final int a() {
        return this.f7301a.dataAvail();
    }

    private final float b() {
        return a.c(e());
    }

    private final byte c() {
        return this.f7301a.readByte();
    }

    private final float e() {
        return this.f7301a.readFloat();
    }

    private final int i() {
        return this.f7301a.readInt();
    }

    private final h1 j() {
        return new h1(d(), g.a(e(), e()), e(), (i) null);
    }

    private final String l() {
        return this.f7301a.readString();
    }

    private final e m() {
        int i11 = i();
        e.a aVar = e.f915b;
        boolean z11 = (aVar.b().e() & i11) != 0;
        boolean z12 = (i11 & aVar.d().e()) != 0;
        if (z11 && z12) {
            return aVar.a(k.m(aVar.b(), aVar.d()));
        } else if (z11) {
            return aVar.b();
        } else {
            if (z12) {
                return aVar.d();
            }
            return aVar.c();
        }
    }

    private final h n() {
        return new h(e(), e());
    }

    private final long p() {
        return bp0.i.c(this.f7301a.readLong());
    }

    public final long d() {
        return d0.i(p());
    }

    public final int f() {
        byte c11 = c();
        if (c11 == 0) {
            return s.f16939b.b();
        }
        if (c11 == 1) {
            return s.f16939b.a();
        }
        return s.f16939b.b();
    }

    public final int g() {
        byte c11 = c();
        if (c11 == 0) {
            return t.f16943b.b();
        }
        if (c11 == 1) {
            return t.f16943b.a();
        }
        if (c11 == 3) {
            return t.f16943b.c();
        }
        if (c11 == 2) {
            return t.f16943b.d();
        }
        return t.f16943b.b();
    }

    public final v h() {
        return new v(i());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0112, code lost:
        r4 = r21;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p1.u k() {
        /*
            r22 = this;
            androidx.compose.ui.platform.t0 r15 = new androidx.compose.ui.platform.t0
            r0 = r15
            r1 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r21 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 16383(0x3fff, float:2.2957E-41)
            r20 = 0
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20)
            r0 = r22
        L_0x0024:
            android.os.Parcel r1 = r0.f7301a
            int r1 = r1.dataAvail()
            r2 = 1
            if (r1 <= r2) goto L_0x0112
            byte r1 = r22.c()
            r3 = 8
            if (r1 != r2) goto L_0x0045
            int r1 = r22.a()
            if (r1 < r3) goto L_0x0112
            long r1 = r22.d()
            r4 = r21
            r4.c(r1)
            goto L_0x0024
        L_0x0045:
            r4 = r21
            r5 = 2
            r6 = 5
            if (r1 != r5) goto L_0x005b
            int r1 = r22.a()
            if (r1 < r6) goto L_0x0114
            long r1 = r22.o()
            r4.e(r1)
        L_0x0058:
            r21 = r4
            goto L_0x0024
        L_0x005b:
            r5 = 3
            r7 = 4
            if (r1 != r5) goto L_0x006d
            int r1 = r22.a()
            if (r1 < r7) goto L_0x0114
            u1.v r1 = r22.h()
            r4.h(r1)
            goto L_0x0058
        L_0x006d:
            if (r1 != r7) goto L_0x0081
            int r1 = r22.a()
            if (r1 < r2) goto L_0x0114
            int r1 = r22.f()
            u1.s r1 = u1.s.c(r1)
            r4.f(r1)
            goto L_0x0058
        L_0x0081:
            if (r1 != r6) goto L_0x0095
            int r1 = r22.a()
            if (r1 < r2) goto L_0x0114
            int r1 = r22.g()
            u1.t r1 = u1.t.e(r1)
            r4.g(r1)
            goto L_0x0058
        L_0x0095:
            r2 = 6
            if (r1 != r2) goto L_0x00a0
            java.lang.String r1 = r22.l()
            r4.d(r1)
            goto L_0x0058
        L_0x00a0:
            r2 = 7
            if (r1 != r2) goto L_0x00b1
            int r1 = r22.a()
            if (r1 < r6) goto L_0x0114
            long r1 = r22.o()
            r4.i(r1)
            goto L_0x0058
        L_0x00b1:
            if (r1 != r3) goto L_0x00c5
            int r1 = r22.a()
            if (r1 < r7) goto L_0x0114
            float r1 = r22.b()
            a2.a r1 = a2.a.b(r1)
            r4.b(r1)
            goto L_0x0058
        L_0x00c5:
            r2 = 9
            if (r1 != r2) goto L_0x00d7
            int r1 = r22.a()
            if (r1 < r3) goto L_0x0114
            a2.h r1 = r22.n()
            r4.l(r1)
            goto L_0x0058
        L_0x00d7:
            r2 = 10
            if (r1 != r2) goto L_0x00ea
            int r1 = r22.a()
            if (r1 < r3) goto L_0x0114
            long r1 = r22.d()
            r4.a(r1)
            goto L_0x0058
        L_0x00ea:
            r2 = 11
            if (r1 != r2) goto L_0x00fd
            int r1 = r22.a()
            if (r1 < r7) goto L_0x0114
            a2.e r1 = r22.m()
            r4.k(r1)
            goto L_0x0058
        L_0x00fd:
            r2 = 12
            if (r1 != r2) goto L_0x0058
            int r1 = r22.a()
            r2 = 20
            if (r1 < r2) goto L_0x0114
            u0.h1 r1 = r22.j()
            r4.j(r1)
            goto L_0x0058
        L_0x0112:
            r4 = r21
        L_0x0114:
            p1.u r1 = r4.m()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.f0.k():p1.u");
    }

    public final long o() {
        long j;
        byte c11 = c();
        if (c11 == 1) {
            j = d2.t.f14026b.b();
        } else if (c11 == 2) {
            j = d2.t.f14026b.a();
        } else {
            j = d2.t.f14026b.c();
        }
        if (d2.t.g(j, d2.t.f14026b.c())) {
            return r.f14022b.a();
        }
        return d2.s.a(e(), j);
    }
}
