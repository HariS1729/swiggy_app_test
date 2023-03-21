package cg0;

import go0.g;
import in.swiggy.android.swiggylocation.location.LocationContextExtensionKt;
import in.swiggy.android.swiggylocation.location.b;
import in.swiggy.android.tejas.oldapi.models.SimpleLocation;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g0 implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f12954a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f12955b;

    public /* synthetic */ g0(b bVar, long j) {
        this.f12954a = bVar;
        this.f12955b = j;
    }

    public final void accept(Object obj) {
        LocationContextExtensionKt.A(this.f12954a, this.f12955b, (SimpleLocation) obj);
    }
}
