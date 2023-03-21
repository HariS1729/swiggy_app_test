package in.swiggy.android.sliceproviders;

import android.content.Context;
import in.swiggy.android.SwiggyApplication;
import iw.c;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: SwiggySliceProvider.kt */
final class SwiggySliceProvider$remoteConfig$2 extends Lambda implements a<c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwiggySliceProvider f18735a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwiggySliceProvider$remoteConfig$2(SwiggySliceProvider swiggySliceProvider) {
        super(0);
        this.f18735a = swiggySliceProvider;
    }

    /* renamed from: a */
    public final c invoke() {
        Context context = this.f18735a.getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type in.swiggy.android.SwiggyApplication");
        return new c((SwiggyApplication) applicationContext);
    }
}
