package in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.getcheckoutinfo;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.w;
import hh0.b;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: GetCheckoutInfoResponsePayload.kt */
public final class GetCheckoutInfoResponsePayload$$serializer implements q<GetCheckoutInfoResponsePayload> {
    public static final GetCheckoutInfoResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        GetCheckoutInfoResponsePayload$$serializer getCheckoutInfoResponsePayload$$serializer = new GetCheckoutInfoResponsePayload$$serializer();
        INSTANCE = getCheckoutInfoResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.getcheckoutinfo.GetCheckoutInfoResponsePayload", getCheckoutInfoResponsePayload$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("restaurantDetails", false);
        pluginGeneratedSerialDescriptor.j("cartItemsCount", false);
        pluginGeneratedSerialDescriptor.j("slaTime", false);
        pluginGeneratedSerialDescriptor.j("slaMessage", false);
        pluginGeneratedSerialDescriptor.j("deliveryAddress", false);
        pluginGeneratedSerialDescriptor.j("couponCode", false);
        pluginGeneratedSerialDescriptor.j("discountMessage", false);
        pluginGeneratedSerialDescriptor.j("orderComments", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetCheckoutInfoResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        w wVar = w.f23130b;
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{b.f18347a, wVar, a.p(wVar), a.p(a1Var), a.p(hh0.a.f18345a), a.p(a1Var), a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.getcheckoutinfo.GetCheckoutInfoResponsePayload deserialize(kotlinx.serialization.encoding.Decoder r22) {
        /*
            r21 = this;
            r0 = r22
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r21.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r2 == 0) goto L_0x004b
            hh0.b r2 = hh0.b.f18347a
            java.lang.Object r2 = r0.o(r1, r10, r2, r11)
            int r9 = r0.g(r1, r9)
            gq0.w r10 = gq0.w.f23130b
            java.lang.Object r8 = r0.s(r1, r8, r10, r11)
            gq0.a1 r10 = gq0.a1.f23069b
            java.lang.Object r6 = r0.s(r1, r6, r10, r11)
            hh0.a r12 = hh0.a.f18345a
            java.lang.Object r7 = r0.s(r1, r7, r12, r11)
            java.lang.Object r5 = r0.s(r1, r5, r10, r11)
            java.lang.Object r4 = r0.s(r1, r4, r10, r11)
            java.lang.Object r3 = r0.s(r1, r3, r10, r11)
            r10 = 255(0xff, float:3.57E-43)
            r12 = r9
            goto L_0x00c9
        L_0x004b:
            r8 = r11
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
            r2 = 0
            r11 = 0
            r18 = 1
        L_0x0056:
            if (r18 == 0) goto L_0x00bd
            int r6 = r0.w(r1)
            switch(r6) {
                case -1: goto L_0x00b6;
                case 0: goto L_0x00a8;
                case 1: goto L_0x009e;
                case 2: goto L_0x0093;
                case 3: goto L_0x0089;
                case 4: goto L_0x0080;
                case 5: goto L_0x0077;
                case 6: goto L_0x006e;
                case 7: goto L_0x0065;
                default: goto L_0x005f;
            }
        L_0x005f:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r6)
            throw r0
        L_0x0065:
            gq0.a1 r6 = gq0.a1.f23069b
            java.lang.Object r8 = r0.s(r1, r3, r6, r8)
            r11 = r11 | 128(0x80, float:1.794E-43)
            goto L_0x00b4
        L_0x006e:
            gq0.a1 r6 = gq0.a1.f23069b
            java.lang.Object r9 = r0.s(r1, r4, r6, r9)
            r11 = r11 | 64
            goto L_0x00b4
        L_0x0077:
            gq0.a1 r6 = gq0.a1.f23069b
            java.lang.Object r10 = r0.s(r1, r5, r6, r10)
            r11 = r11 | 32
            goto L_0x00b4
        L_0x0080:
            hh0.a r6 = hh0.a.f18345a
            java.lang.Object r15 = r0.s(r1, r7, r6, r15)
            r11 = r11 | 16
            goto L_0x00b4
        L_0x0089:
            gq0.a1 r6 = gq0.a1.f23069b
            r3 = 3
            java.lang.Object r14 = r0.s(r1, r3, r6, r14)
            r11 = r11 | 8
            goto L_0x00a6
        L_0x0093:
            r3 = 3
            gq0.w r6 = gq0.w.f23130b
            r3 = 2
            java.lang.Object r13 = r0.s(r1, r3, r6, r13)
            r11 = r11 | 4
            goto L_0x00a6
        L_0x009e:
            r3 = 2
            r6 = 1
            int r2 = r0.g(r1, r6)
            r11 = r11 | 2
        L_0x00a6:
            r3 = 7
            goto L_0x00b4
        L_0x00a8:
            r6 = 1
            hh0.b r3 = hh0.b.f18347a
            r4 = 0
            java.lang.Object r12 = r0.o(r1, r4, r3, r12)
            r11 = r11 | 1
            r3 = 7
            r4 = 6
        L_0x00b4:
            r6 = 3
            goto L_0x0056
        L_0x00b6:
            r4 = 0
            r6 = 1
            r4 = 6
            r6 = 3
            r18 = 0
            goto L_0x0056
        L_0x00bd:
            r3 = r8
            r4 = r9
            r5 = r10
            r10 = r11
            r8 = r13
            r6 = r14
            r7 = r15
            r20 = r12
            r12 = r2
            r2 = r20
        L_0x00c9:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.getcheckoutinfo.GetCheckoutInfoResponsePayload r0 = new in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.getcheckoutinfo.GetCheckoutInfoResponsePayload
            r11 = r2
            in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant r11 = (in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant) r11
            r13 = r8
            java.lang.Integer r13 = (java.lang.Integer) r13
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            r15 = r7
            in.swiggy.android.tejas.feature.address.model.Address r15 = (in.swiggy.android.tejas.feature.address.model.Address) r15
            r16 = r5
            java.lang.String r16 = (java.lang.String) r16
            r17 = r4
            java.lang.String r17 = (java.lang.String) r17
            r18 = r3
            java.lang.String r18 = (java.lang.String) r18
            r19 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.getcheckoutinfo.GetCheckoutInfoResponsePayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.getcheckoutinfo.GetCheckoutInfoResponsePayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public GetCheckoutInfoResponsePayload patch(Decoder decoder, GetCheckoutInfoResponsePayload getCheckoutInfoResponsePayload) {
        return (GetCheckoutInfoResponsePayload) q.a.a(this, decoder, getCheckoutInfoResponsePayload);
    }

    public void serialize(Encoder encoder, GetCheckoutInfoResponsePayload getCheckoutInfoResponsePayload) {
        p.j(encoder, "encoder");
        p.j(getCheckoutInfoResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        GetCheckoutInfoResponsePayload.a(getCheckoutInfoResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
