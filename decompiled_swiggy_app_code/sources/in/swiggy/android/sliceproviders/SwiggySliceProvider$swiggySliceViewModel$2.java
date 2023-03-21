package in.swiggy.android.sliceproviders;

import in.swiggy.android.SwiggyApplication;
import in.swiggy.android.mvvm.viewmodels.SwiggySliceViewModel;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: SwiggySliceProvider.kt */
final class SwiggySliceProvider$swiggySliceViewModel$2 extends Lambda implements a<SwiggySliceViewModel> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwiggySliceProvider f18736a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwiggySliceProvider$swiggySliceViewModel$2(SwiggySliceProvider swiggySliceProvider) {
        super(0);
        this.f18736a = swiggySliceProvider;
    }

    /* renamed from: a */
    public final SwiggySliceViewModel invoke() {
        SwiggyApplication u11 = this.f18736a.F();
        if (u11 == null) {
            return null;
        }
        return new SwiggySliceViewModel(this.f18736a.n, u11);
    }
}
