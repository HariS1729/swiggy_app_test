package in.swiggy.android.swiggylynx.plugin.cart.address.add;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.q;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: AddNewAddressRequestPayload.kt */
public final class AddNewAddressRequestPayload$$serializer implements q<AddNewAddressRequestPayload> {
    public static final AddNewAddressRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AddNewAddressRequestPayload$$serializer addNewAddressRequestPayload$$serializer = new AddNewAddressRequestPayload$$serializer();
        INSTANCE = addNewAddressRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload", addNewAddressRequestPayload$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("storeId", false);
        pluginGeneratedSerialDescriptor.j("userContext", true);
        pluginGeneratedSerialDescriptor.j("disabledAnnotationTags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AddNewAddressRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a1Var, a.p(new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext", UserContext.values())), new f(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload deserialize(kotlinx.serialization.encoding.Decoder r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r20.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            java.lang.String r3 = "in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext"
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = r0.j(r1, r7)
            java.lang.String r7 = r0.j(r1, r8)
            kotlinx.serialization.internal.EnumSerializer r8 = new kotlinx.serialization.internal.EnumSerializer
            in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext[] r9 = in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext.values()
            r8.<init>(r3, r9)
            java.lang.Object r3 = r0.s(r1, r5, r8, r6)
            gq0.f r5 = new gq0.f
            gq0.a1 r8 = gq0.a1.f23069b
            r5.<init>(r8)
            java.lang.Object r4 = r0.o(r1, r4, r5, r6)
            r5 = 15
            r15 = r2
            r16 = r7
            r14 = 15
            goto L_0x0094
        L_0x0044:
            r9 = r6
            r10 = r9
            r11 = r10
            r2 = 0
            r12 = 1
        L_0x0049:
            if (r12 == 0) goto L_0x008e
            int r13 = r0.w(r1)
            r14 = -1
            if (r13 == r14) goto L_0x008c
            if (r13 == 0) goto L_0x0085
            if (r13 == r8) goto L_0x007e
            if (r13 == r5) goto L_0x006e
            if (r13 != r4) goto L_0x0068
            gq0.f r13 = new gq0.f
            gq0.a1 r14 = gq0.a1.f23069b
            r13.<init>(r14)
            java.lang.Object r11 = r0.o(r1, r4, r13, r11)
            r2 = r2 | 8
            goto L_0x0049
        L_0x0068:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r13)
            throw r0
        L_0x006e:
            kotlinx.serialization.internal.EnumSerializer r13 = new kotlinx.serialization.internal.EnumSerializer
            in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext[] r14 = in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext.values()
            r13.<init>(r3, r14)
            java.lang.Object r10 = r0.s(r1, r5, r13, r10)
            r2 = r2 | 4
            goto L_0x0049
        L_0x007e:
            java.lang.String r9 = r0.j(r1, r8)
            r2 = r2 | 2
            goto L_0x0049
        L_0x0085:
            java.lang.String r6 = r0.j(r1, r7)
            r2 = r2 | 1
            goto L_0x0049
        L_0x008c:
            r12 = 0
            goto L_0x0049
        L_0x008e:
            r14 = r2
            r15 = r6
            r16 = r9
            r3 = r10
            r4 = r11
        L_0x0094:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload r0 = new in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload
            r17 = r3
            in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext r17 = (in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext) r17
            r18 = r4
            java.util.List r18 = (java.util.List) r18
            r19 = 0
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AddNewAddressRequestPayload patch(Decoder decoder, AddNewAddressRequestPayload addNewAddressRequestPayload) {
        return (AddNewAddressRequestPayload) q.a.a(this, decoder, addNewAddressRequestPayload);
    }

    public void serialize(Encoder encoder, AddNewAddressRequestPayload addNewAddressRequestPayload) {
        p.j(encoder, "encoder");
        p.j(addNewAddressRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        AddNewAddressRequestPayload.e(addNewAddressRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
