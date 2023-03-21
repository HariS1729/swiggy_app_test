package in.swiggy.android.tejas.dns;

import bp0.k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: SwiggyBaseDnsPrioritised.kt */
/* synthetic */ class SwiggyBaseDnsPrioritised$resolveUsingServer$swiggyResolver$1 extends FunctionReferenceImpl implements q<Integer, String, Integer, k> {
    SwiggyBaseDnsPrioritised$resolveUsingServer$swiggyResolver$1(Object obj) {
        super(3, obj, SwiggyBaseDnsPrioritised.class, "onDnsResolved", "onDnsResolved(ILjava/lang/String;I)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).intValue(), (String) obj2, ((Number) obj3).intValue());
        return k.f22762a;
    }

    public final void invoke(int i11, String str, int i12) {
        p.j(str, "p1");
        ((SwiggyBaseDnsPrioritised) this.receiver).onDnsResolved(i11, str, i12);
    }
}
