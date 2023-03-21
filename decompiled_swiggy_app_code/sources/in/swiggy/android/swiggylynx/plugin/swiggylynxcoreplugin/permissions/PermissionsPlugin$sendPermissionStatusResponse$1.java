package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions;

import bp0.k;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import zp.b;

/* compiled from: PermissionsPlugin.kt */
final class PermissionsPlugin$sendPermissionStatusResponse$1 extends Lambda implements p<String, b, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PermissionStatus f19459a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PermissionsPlugin$sendPermissionStatusResponse$1(PermissionStatus permissionStatus) {
        super(2);
        this.f19459a = permissionStatus;
    }

    public final void a(String str, b bVar) {
        kotlin.jvm.internal.p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        kotlin.jvm.internal.p.j(bVar, "handler");
        b.a.a(bVar, str, 0, (String) null, new PermissionStatusResponsePayload(this.f19459a), PermissionStatusResponsePayload.Companion.serializer(), 6, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((String) obj, (b) obj2);
        return k.f22762a;
    }
}
