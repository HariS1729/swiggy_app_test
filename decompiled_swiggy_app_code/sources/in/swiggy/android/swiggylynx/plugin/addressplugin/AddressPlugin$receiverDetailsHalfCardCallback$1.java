package in.swiggy.android.swiggylynx.plugin.addressplugin;

import bp0.k;
import in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType;
import in.swiggy.android.tejas.feature.address.model.Address;
import kotlin.jvm.internal.Lambda;
import lp0.q;

/* compiled from: AddressPlugin.kt */
final class AddressPlugin$receiverDetailsHalfCardCallback$1 extends Lambda implements q<Address, OperationType, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddressPlugin f18989a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AddressPlugin$receiverDetailsHalfCardCallback$1(AddressPlugin addressPlugin) {
        super(3);
        this.f18989a = addressPlugin;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        r9 = r8.f18989a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(in.swiggy.android.tejas.feature.address.model.Address r9, in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.p.j(r9, r0)
            java.lang.String r0 = "operationType"
            kotlin.jvm.internal.p.j(r10, r0)
            r0 = 1
            if (r11 != r0) goto L_0x0036
            java.lang.String r9 = r9.toJson()
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressResponsePayload r4 = new in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressResponsePayload
            r4.<init>(r9, r10)
            in.swiggy.android.swiggylynx.plugin.addressplugin.AddressPlugin r9 = r8.f18989a
            java.lang.String r1 = r9.p()
            if (r1 != 0) goto L_0x001f
            goto L_0x005c
        L_0x001f:
            in.swiggy.android.swiggylynx.plugin.addressplugin.AddressPlugin r9 = r8.f18989a
            zp.b r0 = r9.W0()
            if (r0 != 0) goto L_0x0028
            goto L_0x005c
        L_0x0028:
            r2 = 0
            r3 = 0
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressResponsePayload$Companion r9 = in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressResponsePayload.Companion
            kotlinx.serialization.KSerializer r5 = r9.serializer()
            r6 = 6
            r7 = 0
            zp.b.a.a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x005c
        L_0x0036:
            in.swiggy.android.swiggylynx.plugin.addressplugin.AddressPlugin r9 = r8.f18989a
            java.lang.String r1 = r9.p()
            if (r1 != 0) goto L_0x003f
            goto L_0x005c
        L_0x003f:
            in.swiggy.android.swiggylynx.plugin.addressplugin.AddressPlugin r9 = r8.f18989a
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressRequestPayload r4 = r9.c()
            if (r4 != 0) goto L_0x0048
            goto L_0x005c
        L_0x0048:
            zp.b r0 = r9.W0()
            if (r0 != 0) goto L_0x004f
            goto L_0x005c
        L_0x004f:
            r2 = 0
            r3 = 0
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressRequestPayload$Companion r9 = in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressRequestPayload.Companion
            kotlinx.serialization.KSerializer r5 = r9.serializer()
            r6 = 6
            r7 = 0
            zp.b.a.a(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.addressplugin.AddressPlugin$receiverDetailsHalfCardCallback$1.a(in.swiggy.android.tejas.feature.address.model.Address, in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((Address) obj, (OperationType) obj2, ((Number) obj3).intValue());
        return k.f22762a;
    }
}
