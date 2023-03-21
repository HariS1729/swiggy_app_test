package androidx.compose.ui.platform;

import a2.a;
import a2.e;
import a2.h;
import android.os.Parcel;
import android.util.Base64;
import d2.r;
import d2.t;
import kotlin.jvm.internal.p;
import p1.u;
import t0.f;
import u0.d0;
import u0.h1;
import u1.s;
import u1.t;
import u1.v;

/* compiled from: AndroidClipboardManager.android.kt */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private Parcel f7317a;

    public k0() {
        Parcel obtain = Parcel.obtain();
        p.i(obtain, "obtain()");
        this.f7317a = obtain;
    }

    public final void a(byte b11) {
        this.f7317a.writeByte(b11);
    }

    public final void b(float f11) {
        this.f7317a.writeFloat(f11);
    }

    public final void c(int i11) {
        this.f7317a.writeInt(i11);
    }

    public final void d(e eVar) {
        p.j(eVar, "textDecoration");
        c(eVar.e());
    }

    public final void e(h hVar) {
        p.j(hVar, "textGeometricTransform");
        b(hVar.b());
        b(hVar.c());
    }

    public final void f(String str) {
        p.j(str, "string");
        this.f7317a.writeString(str);
    }

    public final void g(u uVar) {
        p.j(uVar, "spanStyle");
        long f11 = uVar.f();
        d0.a aVar = d0.f16756b;
        if (!d0.n(f11, aVar.f())) {
            a((byte) 1);
            m(uVar.f());
        }
        long i11 = uVar.i();
        r.a aVar2 = r.f14022b;
        if (!r.e(i11, aVar2.a())) {
            a((byte) 2);
            j(uVar.i());
        }
        v l11 = uVar.l();
        if (l11 != null) {
            a((byte) 3);
            i(l11);
        }
        s j = uVar.j();
        if (j != null) {
            int i12 = j.i();
            a((byte) 4);
            o(i12);
        }
        t k = uVar.k();
        if (k != null) {
            int m11 = k.m();
            a((byte) 5);
            l(m11);
        }
        String h11 = uVar.h();
        if (h11 != null) {
            a((byte) 6);
            f(h11);
        }
        if (!r.e(uVar.m(), aVar2.a())) {
            a((byte) 7);
            j(uVar.m());
        }
        a d11 = uVar.d();
        if (d11 != null) {
            float h12 = d11.h();
            a((byte) 8);
            k(h12);
        }
        h s11 = uVar.s();
        if (s11 != null) {
            a((byte) 9);
            e(s11);
        }
        if (!d0.n(uVar.c(), aVar.f())) {
            a((byte) 10);
            m(uVar.c());
        }
        e q = uVar.q();
        if (q != null) {
            a((byte) 11);
            d(q);
        }
        h1 p11 = uVar.p();
        if (p11 != null) {
            a((byte) 12);
            h(p11);
        }
    }

    public final void h(h1 h1Var) {
        p.j(h1Var, "shadow");
        m(h1Var.c());
        b(f.m(h1Var.d()));
        b(f.n(h1Var.d()));
        b(h1Var.b());
    }

    public final void i(v vVar) {
        p.j(vVar, "fontWeight");
        c(vVar.s());
    }

    public final void j(long j) {
        long g11 = r.g(j);
        t.a aVar = d2.t.f14026b;
        byte b11 = 0;
        if (!d2.t.g(g11, aVar.c())) {
            if (d2.t.g(g11, aVar.b())) {
                b11 = 1;
            } else if (d2.t.g(g11, aVar.a())) {
                b11 = 2;
            }
        }
        a(b11);
        if (!d2.t.g(r.g(j), aVar.c())) {
            b(r.h(j));
        }
    }

    public final void k(float f11) {
        b(f11);
    }

    public final void l(int i11) {
        t.a aVar = u1.t.f16943b;
        byte b11 = 0;
        if (!u1.t.h(i11, aVar.b())) {
            if (u1.t.h(i11, aVar.a())) {
                b11 = 1;
            } else if (u1.t.h(i11, aVar.d())) {
                b11 = 2;
            } else if (u1.t.h(i11, aVar.c())) {
                b11 = 3;
            }
        }
        a(b11);
    }

    public final void m(long j) {
        n(j);
    }

    public final void n(long j) {
        this.f7317a.writeLong(j);
    }

    public final void o(int i11) {
        s.a aVar = s.f16939b;
        byte b11 = 0;
        if (!s.f(i11, aVar.b()) && s.f(i11, aVar.a())) {
            b11 = 1;
        }
        a(b11);
    }

    public final String p() {
        String encodeToString = Base64.encodeToString(this.f7317a.marshall(), 0);
        p.i(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return encodeToString;
    }

    public final void q() {
        this.f7317a.recycle();
        Parcel obtain = Parcel.obtain();
        p.i(obtain, "obtain()");
        this.f7317a = obtain;
    }
}
