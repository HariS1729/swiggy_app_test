package in.swiggy.android.swiggylynx.plugin.cart.address.edit;

import dq0.a;
import fq0.d;
import gq0.f;
import gq0.q;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: EditAddressRequestPayload.kt */
public final class EditAddressRequestPayload$$serializer implements q<EditAddressRequestPayload> {
    public static final EditAddressRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EditAddressRequestPayload$$serializer editAddressRequestPayload$$serializer = new EditAddressRequestPayload$$serializer();
        INSTANCE = editAddressRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressRequestPayload", editAddressRequestPayload$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("address", false);
        pluginGeneratedSerialDescriptor.j("enabled", true);
        pluginGeneratedSerialDescriptor.j("focused", true);
        pluginGeneratedSerialDescriptor.j("actionType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EditAddressRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{LynxAddressData$$serializer.INSTANCE, new f(new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField", FormField.values())), a.p(new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField", FormField.values())), a.p(new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType", OperationType.values()))};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressRequestPayload deserialize(kotlinx.serialization.encoding.Decoder r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r16.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            java.lang.String r3 = "in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType"
            r4 = 3
            r5 = 2
            java.lang.String r6 = "in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField"
            r7 = 0
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L_0x0057
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.LynxAddressData$$serializer r2 = in.swiggy.android.swiggylynx.plugin.cart.address.edit.LynxAddressData$$serializer.INSTANCE
            java.lang.Object r2 = r0.o(r1, r8, r2, r7)
            gq0.f r8 = new gq0.f
            kotlinx.serialization.internal.EnumSerializer r10 = new kotlinx.serialization.internal.EnumSerializer
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField[] r11 = in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField.values()
            r10.<init>(r6, r11)
            r8.<init>(r10)
            java.lang.Object r8 = r0.o(r1, r9, r8, r7)
            kotlinx.serialization.internal.EnumSerializer r9 = new kotlinx.serialization.internal.EnumSerializer
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField[] r10 = in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField.values()
            r9.<init>(r6, r10)
            java.lang.Object r5 = r0.s(r1, r5, r9, r7)
            kotlinx.serialization.internal.EnumSerializer r6 = new kotlinx.serialization.internal.EnumSerializer
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType[] r9 = in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType.values()
            r6.<init>(r3, r9)
            java.lang.Object r3 = r0.s(r1, r4, r6, r7)
            r4 = 15
            r11 = r5
            r5 = 15
            goto L_0x00b8
        L_0x0057:
            r10 = r7
            r11 = r10
            r12 = r11
            r2 = 0
            r13 = 1
        L_0x005c:
            if (r13 == 0) goto L_0x00b4
            int r14 = r0.w(r1)
            r15 = -1
            if (r14 == r15) goto L_0x00b2
            if (r14 == 0) goto L_0x00a8
            if (r14 == r9) goto L_0x0093
            if (r14 == r5) goto L_0x0083
            if (r14 != r4) goto L_0x007d
            kotlinx.serialization.internal.EnumSerializer r14 = new kotlinx.serialization.internal.EnumSerializer
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType[] r15 = in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType.values()
            r14.<init>(r3, r15)
            java.lang.Object r12 = r0.s(r1, r4, r14, r12)
            r2 = r2 | 8
            goto L_0x005c
        L_0x007d:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r14)
            throw r0
        L_0x0083:
            kotlinx.serialization.internal.EnumSerializer r14 = new kotlinx.serialization.internal.EnumSerializer
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField[] r15 = in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField.values()
            r14.<init>(r6, r15)
            java.lang.Object r11 = r0.s(r1, r5, r14, r11)
            r2 = r2 | 4
            goto L_0x005c
        L_0x0093:
            gq0.f r14 = new gq0.f
            kotlinx.serialization.internal.EnumSerializer r15 = new kotlinx.serialization.internal.EnumSerializer
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField[] r4 = in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField.values()
            r15.<init>(r6, r4)
            r14.<init>(r15)
            java.lang.Object r10 = r0.o(r1, r9, r14, r10)
            r2 = r2 | 2
            goto L_0x00b0
        L_0x00a8:
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.LynxAddressData$$serializer r4 = in.swiggy.android.swiggylynx.plugin.cart.address.edit.LynxAddressData$$serializer.INSTANCE
            java.lang.Object r7 = r0.o(r1, r8, r4, r7)
            r2 = r2 | 1
        L_0x00b0:
            r4 = 3
            goto L_0x005c
        L_0x00b2:
            r13 = 0
            goto L_0x005c
        L_0x00b4:
            r5 = r2
            r2 = r7
            r8 = r10
            r3 = r12
        L_0x00b8:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressRequestPayload r0 = new in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressRequestPayload
            r6 = r2
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.LynxAddressData r6 = (in.swiggy.android.swiggylynx.plugin.cart.address.edit.LynxAddressData) r6
            r7 = r8
            java.util.List r7 = (java.util.List) r7
            r8 = r11
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField r8 = (in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField) r8
            r9 = r3
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType r9 = (in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType) r9
            r10 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressRequestPayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressRequestPayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public EditAddressRequestPayload patch(Decoder decoder, EditAddressRequestPayload editAddressRequestPayload) {
        return (EditAddressRequestPayload) q.a.a(this, decoder, editAddressRequestPayload);
    }

    public void serialize(Encoder encoder, EditAddressRequestPayload editAddressRequestPayload) {
        p.j(encoder, "encoder");
        p.j(editAddressRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        EditAddressRequestPayload.f(editAddressRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
