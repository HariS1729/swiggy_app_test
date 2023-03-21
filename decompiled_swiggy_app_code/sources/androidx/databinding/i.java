package androidx.databinding;

import androidx.core.util.f;
import androidx.databinding.c;
import androidx.databinding.m;

/* compiled from: ListChangeRegistry */
public class i extends c<m.a, m, b> {

    /* renamed from: f  reason: collision with root package name */
    private static final f<b> f9725f = new f<>(10);

    /* renamed from: g  reason: collision with root package name */
    private static final c.a<m.a, m, b> f9726g = new a();

    /* compiled from: ListChangeRegistry */
    class a extends c.a<m.a, m, b> {
        a() {
        }

        /* renamed from: b */
        public void a(m.a aVar, m mVar, int i11, b bVar) {
            if (i11 == 1) {
                aVar.e(mVar, bVar.f9727a, bVar.f9728b);
            } else if (i11 == 2) {
                aVar.f(mVar, bVar.f9727a, bVar.f9728b);
            } else if (i11 == 3) {
                aVar.g(mVar, bVar.f9727a, bVar.f9729c, bVar.f9728b);
            } else if (i11 != 4) {
                aVar.a(mVar);
            } else {
                aVar.h(mVar, bVar.f9727a, bVar.f9728b);
            }
        }
    }

    /* compiled from: ListChangeRegistry */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f9727a;

        /* renamed from: b  reason: collision with root package name */
        public int f9728b;

        /* renamed from: c  reason: collision with root package name */
        public int f9729c;

        b() {
        }
    }

    public i() {
        super(f9726g);
    }

    private static b o(int i11, int i12, int i13) {
        b b11 = f9725f.b();
        if (b11 == null) {
            b11 = new b();
        }
        b11.f9727a = i11;
        b11.f9729c = i12;
        b11.f9728b = i13;
        return b11;
    }

    /* renamed from: p */
    public synchronized void g(m mVar, int i11, b bVar) {
        super.g(mVar, i11, bVar);
        if (bVar != null) {
            f9725f.a(bVar);
        }
    }

    public void q(m mVar, int i11, int i12) {
        g(mVar, 1, o(i11, 0, i12));
    }

    public void r(m mVar, int i11, int i12) {
        g(mVar, 2, o(i11, 0, i12));
    }

    public void s(m mVar, int i11, int i12) {
        g(mVar, 4, o(i11, 0, i12));
    }
}
