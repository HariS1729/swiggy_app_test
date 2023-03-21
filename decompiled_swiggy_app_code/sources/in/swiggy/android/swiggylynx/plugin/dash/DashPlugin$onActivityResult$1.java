package in.swiggy.android.swiggylynx.plugin.dash;

import android.os.Bundle;
import bp0.k;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.swiggylynx.plugin.cart.superV2.OpenSuperV2ResponsePayload;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import zp.b;

/* compiled from: DashPlugin.kt */
final class DashPlugin$onActivityResult$1 extends Lambda implements q<String, b, Bundle, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final DashPlugin$onActivityResult$1 f19095a = new DashPlugin$onActivityResult$1();

    DashPlugin$onActivityResult$1() {
        super(3);
    }

    public final void a(String str, b bVar, Bundle bundle) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(bVar, "handler");
        p.j(bundle, "extras");
        b.a.a(bVar, str, 0, (String) null, new OpenSuperV2ResponsePayload(bundle.getString("superV2SelectedPlanId")), OpenSuperV2ResponsePayload.Companion.serializer(), 6, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((String) obj, (b) obj2, (Bundle) obj3);
        return k.f22762a;
    }
}
