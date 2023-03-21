package in.swiggy.android.sliceproviders;

import android.content.SharedPreferences;
import ef0.f;
import in.swiggy.android.dependencyconfig.AppBuildDetailsImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import lp0.a;

/* compiled from: SwiggySliceProvider.kt */
final class SwiggySliceProvider$appBuildDetails$2 extends Lambda implements a<AppBuildDetailsImpl> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwiggySliceProvider f18732a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwiggySliceProvider$appBuildDetails$2(SwiggySliceProvider swiggySliceProvider) {
        super(0);
        this.f18732a = swiggySliceProvider;
    }

    /* renamed from: a */
    public final AppBuildDetailsImpl invoke() {
        return new AppBuildDetailsImpl(this.f18732a.I(), (SharedPreferences) null, (f) null, 6, (i) null);
    }
}
