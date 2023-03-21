package in.swiggy.android.swiggylocation.utils;

import in.swiggy.android.tejas.feature.address.model.Address;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.i;

/* compiled from: LocationBundle.kt */
public final class LocationBundle implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private boolean f18918a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f18919b;

    /* renamed from: c  reason: collision with root package name */
    private List<Address> f18920c;

    public LocationBundle() {
        this(false, false, (List) null, 7, (i) null);
    }

    public LocationBundle(boolean z11, boolean z12, List<Address> list) {
        this.f18918a = z11;
        this.f18919b = z12;
        this.f18920c = list;
    }

    public final List<Address> a() {
        return this.f18920c;
    }

    public final boolean b() {
        return this.f18918a;
    }

    public final boolean c() {
        return this.f18919b;
    }

    public final void d(List<Address> list) {
        this.f18920c = list;
    }

    public final void e(boolean z11) {
        this.f18918a = z11;
    }

    public final void g(boolean z11) {
        this.f18919b = z11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocationBundle(boolean z11, boolean z12, List list, int i11, i iVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? null : list);
    }
}
