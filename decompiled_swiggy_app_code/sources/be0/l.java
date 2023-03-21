package be0;

import go0.g;
import in.swiggy.android.payment.utility.freecharge.FreechargeUtility;
import retrofit2.Response;
import xd0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f12603a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FreechargeUtility f12604b;

    public /* synthetic */ l(b bVar, FreechargeUtility freechargeUtility) {
        this.f12603a = bVar;
        this.f12604b = freechargeUtility;
    }

    public final void accept(Object obj) {
        FreechargeUtility.g0(this.f12603a, this.f12604b, (Response) obj);
    }
}
