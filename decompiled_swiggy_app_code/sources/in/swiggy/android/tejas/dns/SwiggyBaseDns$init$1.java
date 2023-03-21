package in.swiggy.android.tejas.dns;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: SwiggyBaseDns.kt */
final class SwiggyBaseDns$init$1 extends Lambda implements q<Integer, String, Integer, k> {
    final /* synthetic */ SwiggyBaseDns this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwiggyBaseDns$init$1(SwiggyBaseDns swiggyBaseDns) {
        super(3);
        this.this$0 = swiggyBaseDns;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Integer) obj, (String) obj2, (Integer) obj3);
        return k.f22762a;
    }

    public final void invoke(Integer num, String str, Integer num2) {
        SwiggyBaseDns swiggyBaseDns = this.this$0;
        p.i(num, "code");
        int intValue = num.intValue();
        p.i(str, "host");
        p.i(num2, "noOfRetries");
        swiggyBaseDns.onDnsResolved(intValue, str, num2.intValue());
    }
}
