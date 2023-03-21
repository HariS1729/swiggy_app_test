package e4;

import androidx.lifecycle.y;
import androidx.work.impl.utils.futures.b;
import d4.j;

/* compiled from: OperationImpl */
public class c implements j {

    /* renamed from: c  reason: collision with root package name */
    private final y<j.b> f14285c = new y<>();

    /* renamed from: d  reason: collision with root package name */
    private final b<j.b.c> f14286d = b.t();

    public c() {
        b(j.f14136b);
    }

    public com.google.common.util.concurrent.b<j.b.c> a() {
        return this.f14286d;
    }

    public void b(j.b bVar) {
        this.f14285c.n(bVar);
        if (bVar instanceof j.b.c) {
            this.f14286d.p((j.b.c) bVar);
        } else if (bVar instanceof j.b.a) {
            this.f14286d.q(((j.b.a) bVar).a());
        }
    }
}
