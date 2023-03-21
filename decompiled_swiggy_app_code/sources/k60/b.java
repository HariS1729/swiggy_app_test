package k60;

import kotlin.jvm.internal.p;
import zf0.a;

/* compiled from: MenuCallbacksObservable.kt */
public final class b extends a<a> implements a {
    public void a() {
        for (a a11 : f()) {
            a11.a();
        }
        f().clear();
    }

    public void b() {
        for (a b11 : f()) {
            b11.b();
        }
    }

    public void d() {
        for (a d11 : f()) {
            d11.d();
        }
    }

    public void e() {
        for (a e11 : f()) {
            e11.e();
        }
    }

    public void h(String str) {
        p.j(str, "restaurantId");
        for (a h11 : f()) {
            h11.h(str);
        }
    }
}
