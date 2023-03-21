package in.swiggy.android.sliceproviders;

import in.swiggy.android.mvvm.viewmodels.address.AddressExp;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: SwiggySliceProvider.kt */
final class SwiggySliceProvider$addressExp$2 extends Lambda implements a<AddressExp> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwiggySliceProvider f18731a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwiggySliceProvider$addressExp$2(SwiggySliceProvider swiggySliceProvider) {
        super(0);
        this.f18731a = swiggySliceProvider;
    }

    /* renamed from: a */
    public final AddressExp invoke() {
        return new AddressExp(this.f18731a.K());
    }
}
