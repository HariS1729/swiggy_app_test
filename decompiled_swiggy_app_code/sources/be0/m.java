package be0;

import go0.g;
import in.swiggy.android.payment.utility.freecharge.FreechargeUtility;
import retrofit2.Response;
import xd0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f12605a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FreechargeUtility f12606b;

    public /* synthetic */ m(b bVar, FreechargeUtility freechargeUtility) {
        this.f12605a = bVar;
        this.f12606b = freechargeUtility;
    }

    public final void accept(Object obj) {
        FreechargeUtility.J(this.f12605a, this.f12606b, (Response) obj);
    }
}
