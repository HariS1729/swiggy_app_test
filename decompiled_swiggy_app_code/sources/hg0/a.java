package hg0;

import android.location.Location;
import bp0.k;
import go0.g;
import in.swiggy.android.swiggylocation.utils.LocationPermissionState;
import lp0.l;

/* compiled from: ICommonLocationComponentService.kt */
public interface a {

    /* renamed from: hg0.a$a  reason: collision with other inner class name */
    /* compiled from: ICommonLocationComponentService.kt */
    public static final class C0225a {
        public static /* synthetic */ void a(a aVar, eo0.a aVar2, g gVar, boolean z11, String str, boolean z12, lp0.a aVar3, int i11, Object obj) {
            if (obj == null) {
                boolean z13 = (i11 & 16) != 0 ? true : z12;
                if ((i11 & 32) != 0) {
                    aVar3 = null;
                }
                aVar.j(aVar2, gVar, z11, str, z13, aVar3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrentGpsLocation");
        }
    }

    void a(eo0.a aVar);

    boolean b();

    void c(eo0.a aVar, l<? super Location, k> lVar, l<? super Boolean, k> lVar2);

    boolean d();

    void e(boolean z11);

    boolean f();

    void g(int i11, int i12);

    void h();

    void i(g<Boolean> gVar);

    void init();

    void j(eo0.a aVar, g<LocationPermissionState> gVar, boolean z11, String str, boolean z12, lp0.a<k> aVar2);
}
