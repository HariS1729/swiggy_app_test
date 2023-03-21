package hf0;

import gf0.a;
import java.util.Date;

/* compiled from: NPSService */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public a f18344a;

    public b(a aVar) {
        this.f18344a = aVar;
    }

    private int d() {
        long h11 = this.f18344a.h();
        if (h11 != 0) {
            return jf0.a.b(h11, new Date(System.currentTimeMillis()).getTime());
        }
        return 0;
    }

    public int a() {
        int c11 = this.f18344a.c();
        if (c11 <= 3) {
            int i11 = c11 + 1;
            this.f18344a.j(i11);
            return i11;
        }
        this.f18344a.j(0);
        return c11;
    }

    public boolean b() {
        if (!this.f18344a.g()) {
            return false;
        }
        if (this.f18344a.e() != this.f18344a.b()) {
            a aVar = this.f18344a;
            aVar.i(aVar.b());
        } else if (!this.f18344a.d() || (this.f18344a.c() == 3 && d() == 15)) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public void c() {
        if (this.f18344a.h() == 0) {
            this.f18344a.f(new java.sql.Date(System.currentTimeMillis()).getTime());
        }
    }
}
