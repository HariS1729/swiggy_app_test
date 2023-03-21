package in.swiggy.android.repositories.saveablecontexts;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$DoubleRef;
import lp0.q;

/* compiled from: UserLocationManager.kt */
final class UserLocationManager$getAddressWeightedScore$1 extends Lambda implements q<Double, Integer, Double, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Ref$DoubleRef f18550a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f18551b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UserLocationManager$getAddressWeightedScore$1(Ref$DoubleRef ref$DoubleRef, double d11) {
        super(3);
        this.f18550a = ref$DoubleRef;
        this.f18551b = d11;
    }

    public final void a(double d11, int i11, double d12) {
        this.f18550a.f25662a = (this.f18551b * d11) + (((double) i11) * d12);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a(((Number) obj).doubleValue(), ((Number) obj2).intValue(), ((Number) obj3).doubleValue());
        return k.f22762a;
    }
}
