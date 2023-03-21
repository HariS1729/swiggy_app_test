package in.swiggy.android.swiggylynx.plugin.location;

import bp0.k;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import zp.b;

/* compiled from: LocationPlugin.kt */
final class LocationPlugin$onActivityResult$1 extends Lambda implements p<b, String, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LocationPlugin f19154a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LocationPlugin$onActivityResult$1(LocationPlugin locationPlugin) {
        super(2);
        this.f19154a = locationPlugin;
    }

    public final void a(b bVar, String str) {
        kotlin.jvm.internal.p.j(bVar, "handler");
        kotlin.jvm.internal.p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        this.f19154a.Y0(bVar, str);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((b) obj, (String) obj2);
        return k.f22762a;
    }
}
