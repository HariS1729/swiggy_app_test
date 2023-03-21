package in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.orderfailed;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.q;
import hq0.o;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: OrderFailedRequestPayload.kt */
public final class OrderFailedRequestPayload$$serializer implements q<OrderFailedRequestPayload> {
    public static final OrderFailedRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        OrderFailedRequestPayload$$serializer orderFailedRequestPayload$$serializer = new OrderFailedRequestPayload$$serializer();
        INSTANCE = orderFailedRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.orderfailed.OrderFailedRequestPayload", orderFailedRequestPayload$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("paymentMethodData", true);
        pluginGeneratedSerialDescriptor.j("orderId", true);
        pluginGeneratedSerialDescriptor.j("errorCode", true);
        pluginGeneratedSerialDescriptor.j("errorText", true);
        pluginGeneratedSerialDescriptor.j("totalBill", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OrderFailedRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(o.f23170b), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.orderfailed.OrderFailedRequestPayload deserialize(kotlinx.serialization.encoding.Decoder r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r17.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 3
            r4 = 4
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0039
            hq0.o r2 = hq0.o.f23170b
            java.lang.Object r2 = r0.s(r1, r6, r2, r7)
            gq0.a1 r6 = gq0.a1.f23069b
            java.lang.Object r8 = r0.s(r1, r8, r6, r7)
            java.lang.Object r5 = r0.s(r1, r5, r6, r7)
            java.lang.Object r3 = r0.s(r1, r3, r6, r7)
            java.lang.Object r4 = r0.s(r1, r4, r6, r7)
            r6 = 31
            r7 = 31
            goto L_0x0090
        L_0x0039:
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r2 = 0
            r13 = 1
        L_0x003f:
            if (r13 == 0) goto L_0x0087
            int r14 = r0.w(r1)
            r15 = -1
            if (r14 == r15) goto L_0x0085
            if (r14 == 0) goto L_0x007c
            if (r14 == r8) goto L_0x0073
            if (r14 == r5) goto L_0x006a
            if (r14 == r3) goto L_0x0061
            if (r14 != r4) goto L_0x005b
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r12 = r0.s(r1, r4, r14, r12)
            r2 = r2 | 16
            goto L_0x003f
        L_0x005b:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r14)
            throw r0
        L_0x0061:
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r11 = r0.s(r1, r3, r14, r11)
            r2 = r2 | 8
            goto L_0x003f
        L_0x006a:
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r10 = r0.s(r1, r5, r14, r10)
            r2 = r2 | 4
            goto L_0x003f
        L_0x0073:
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r9 = r0.s(r1, r8, r14, r9)
            r2 = r2 | 2
            goto L_0x003f
        L_0x007c:
            hq0.o r14 = hq0.o.f23170b
            java.lang.Object r7 = r0.s(r1, r6, r14, r7)
            r2 = r2 | 1
            goto L_0x003f
        L_0x0085:
            r13 = 0
            goto L_0x003f
        L_0x0087:
            r8 = r9
            r5 = r10
            r3 = r11
            r4 = r12
            r16 = r7
            r7 = r2
            r2 = r16
        L_0x0090:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.orderfailed.OrderFailedRequestPayload r0 = new in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.orderfailed.OrderFailedRequestPayload
            r1 = r2
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            r12 = r4
            java.lang.String r12 = (java.lang.String) r12
            r13 = 0
            r6 = r0
            r8 = r1
            r6.<init>((int) r7, (kotlinx.serialization.json.JsonObject) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (gq0.x0) r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.orderfailed.OrderFailedRequestPayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.orderfailed.OrderFailedRequestPayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public OrderFailedRequestPayload patch(Decoder decoder, OrderFailedRequestPayload orderFailedRequestPayload) {
        return (OrderFailedRequestPayload) q.a.a(this, decoder, orderFailedRequestPayload);
    }

    public void serialize(Encoder encoder, OrderFailedRequestPayload orderFailedRequestPayload) {
        p.j(encoder, "encoder");
        p.j(orderFailedRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        OrderFailedRequestPayload.f(orderFailedRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
