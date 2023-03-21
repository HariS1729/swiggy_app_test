package in.swiggy.android.sliceproviders;

import android.app.Application;
import android.content.Context;
import if0.m;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: SwiggySliceProvider.kt */
final class SwiggySliceProvider$xpExperimentContext$2 extends Lambda implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwiggySliceProvider f18738a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwiggySliceProvider$xpExperimentContext$2(SwiggySliceProvider swiggySliceProvider) {
        super(0);
        this.f18738a = swiggySliceProvider;
    }

    /* renamed from: a */
    public final m invoke() {
        Context context = this.f18738a.getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return new m((Application) applicationContext);
    }
}
