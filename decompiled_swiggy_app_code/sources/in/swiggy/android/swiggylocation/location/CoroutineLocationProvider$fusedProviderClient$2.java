package in.swiggy.android.swiggylocation.location;

import com.google.android.gms.location.d;
import com.google.android.gms.location.i;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: CoroutineLocationProvider.kt */
final class CoroutineLocationProvider$fusedProviderClient$2 extends Lambda implements a<d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineLocationProvider f18804a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutineLocationProvider$fusedProviderClient$2(CoroutineLocationProvider coroutineLocationProvider) {
        super(0);
        this.f18804a = coroutineLocationProvider;
    }

    /* renamed from: a */
    public final d invoke() {
        return i.a(this.f18804a.f18802b);
    }
}
