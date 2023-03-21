package in.swiggy.android.sliceproviders;

import android.content.Context;
import in.swiggy.android.SwiggyApplication;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: SwiggySliceProvider.kt */
final class SwiggySliceProvider$applicationContext$2 extends Lambda implements a<SwiggyApplication> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwiggySliceProvider f18733a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwiggySliceProvider$applicationContext$2(SwiggySliceProvider swiggySliceProvider) {
        super(0);
        this.f18733a = swiggySliceProvider;
    }

    /* renamed from: a */
    public final SwiggyApplication invoke() {
        Context context = this.f18733a.getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext instanceof SwiggyApplication) {
            return (SwiggyApplication) applicationContext;
        }
        return null;
    }
}
