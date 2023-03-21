package in.swiggy.android.swiggylynx.plugin.addressplugin;

import bp0.k;
import in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressDirectionsResponsePayload;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import zp.b;

/* compiled from: AddressPlugin.kt */
final class AddressPlugin$receiverEditAddressDirectionsCallback$1 extends Lambda implements p<Boolean, String, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddressPlugin f18990a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AddressPlugin$receiverEditAddressDirectionsCallback$1(AddressPlugin addressPlugin) {
        super(2);
        this.f18990a = addressPlugin;
    }

    public final void a(boolean z11, String str) {
        b W0;
        kotlin.jvm.internal.p.j(str, "resultCode");
        EditAddressDirectionsResponsePayload editAddressDirectionsResponsePayload = new EditAddressDirectionsResponsePayload(z11);
        String p11 = this.f18990a.p();
        if (p11 != null && (W0 = this.f18990a.W0()) != null) {
            b.a.a(W0, p11, 0, (String) null, editAddressDirectionsResponsePayload, EditAddressDirectionsResponsePayload.Companion.serializer(), 6, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a(((Boolean) obj).booleanValue(), (String) obj2);
        return k.f22762a;
    }
}
