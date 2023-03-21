package f1;

import f0.e;
import i1.m;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: HitPathTracker.kt */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final e<k> f14513a = new e<>(new k[16], 0);

    public boolean a(Map<u, v> map, m mVar, h hVar, boolean z11) {
        p.j(map, "changes");
        p.j(mVar, "parentCoordinates");
        p.j(hVar, "internalPointerEvent");
        e<k> eVar = this.f14513a;
        int m11 = eVar.m();
        if (m11 <= 0) {
            return false;
        }
        Object[] l11 = eVar.l();
        int i11 = 0;
        boolean z12 = false;
        do {
            z12 = ((k) l11[i11]).a(map, mVar, hVar, z11) || z12;
            i11++;
        } while (i11 < m11);
        return z12;
    }

    public void b(h hVar) {
        p.j(hVar, "internalPointerEvent");
        int m11 = this.f14513a.m();
        while (true) {
            m11--;
            if (-1 >= m11) {
                return;
            }
            if (((k) this.f14513a.l()[m11]).j().o()) {
                this.f14513a.u(m11);
            }
        }
    }

    public final void c() {
        this.f14513a.g();
    }

    public void d() {
        e<k> eVar = this.f14513a;
        int m11 = eVar.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = eVar.l();
            do {
                ((k) l11[i11]).d();
                i11++;
            } while (i11 < m11);
        }
    }

    public boolean e(h hVar) {
        p.j(hVar, "internalPointerEvent");
        e<k> eVar = this.f14513a;
        int m11 = eVar.m();
        boolean z11 = false;
        if (m11 > 0) {
            Object[] l11 = eVar.l();
            int i11 = 0;
            boolean z12 = false;
            do {
                z12 = ((k) l11[i11]).e(hVar) || z12;
                i11++;
            } while (i11 < m11);
            z11 = z12;
        }
        b(hVar);
        return z11;
    }

    public boolean f(Map<u, v> map, m mVar, h hVar, boolean z11) {
        p.j(map, "changes");
        p.j(mVar, "parentCoordinates");
        p.j(hVar, "internalPointerEvent");
        e<k> eVar = this.f14513a;
        int m11 = eVar.m();
        if (m11 <= 0) {
            return false;
        }
        Object[] l11 = eVar.l();
        int i11 = 0;
        boolean z12 = false;
        do {
            z12 = ((k) l11[i11]).f(map, mVar, hVar, z11) || z12;
            i11++;
        } while (i11 < m11);
        return z12;
    }

    public final e<k> g() {
        return this.f14513a;
    }

    public final void h() {
        int i11 = 0;
        while (i11 < this.f14513a.m()) {
            k kVar = (k) this.f14513a.l()[i11];
            if (!kVar.k().D0()) {
                this.f14513a.u(i11);
                kVar.d();
            } else {
                i11++;
                kVar.h();
            }
        }
    }
}
