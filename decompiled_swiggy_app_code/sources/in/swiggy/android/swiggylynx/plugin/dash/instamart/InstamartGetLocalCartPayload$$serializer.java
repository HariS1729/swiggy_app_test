package in.swiggy.android.swiggylynx.plugin.dash.instamart;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.h;
import gq0.q;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem$$serializer;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InstamartGetLocalCartPayload.kt */
public final class InstamartGetLocalCartPayload$$serializer implements q<InstamartGetLocalCartPayload> {
    public static final InstamartGetLocalCartPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartGetLocalCartPayload$$serializer instamartGetLocalCartPayload$$serializer = new InstamartGetLocalCartPayload$$serializer();
        INSTANCE = instamartGetLocalCartPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.dash.instamart.InstamartGetLocalCartPayload", instamartGetLocalCartPayload$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("structureItems", true);
        pluginGeneratedSerialDescriptor.j("storeId", false);
        pluginGeneratedSerialDescriptor.j("couponCode", true);
        pluginGeneratedSerialDescriptor.j("subscriptionPlanId", true);
        pluginGeneratedSerialDescriptor.j("contactlessDelivery", true);
        pluginGeneratedSerialDescriptor.j("preferredAddressId", true);
        pluginGeneratedSerialDescriptor.j("deliveryType", true);
        pluginGeneratedSerialDescriptor.j("preferredSlotId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartGetLocalCartPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(new f(LocalInstamartItem$$serializer.INSTANCE)), a1Var, a.p(a1Var), a.p(a1Var), a.p(h.f23089b), a.p(a1Var), a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.dash.instamart.InstamartGetLocalCartPayload deserialize(kotlinx.serialization.encoding.Decoder r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r20.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 0
            if (r2 == 0) goto L_0x004e
            gq0.f r2 = new gq0.f
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem$$serializer r12 = in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem$$serializer.INSTANCE
            r2.<init>(r12)
            java.lang.Object r2 = r0.s(r1, r9, r2, r11)
            java.lang.String r9 = r0.j(r1, r10)
            gq0.a1 r10 = gq0.a1.f23069b
            java.lang.Object r8 = r0.s(r1, r8, r10, r11)
            java.lang.Object r6 = r0.s(r1, r6, r10, r11)
            gq0.h r12 = gq0.h.f23089b
            java.lang.Object r7 = r0.s(r1, r7, r12, r11)
            java.lang.Object r5 = r0.s(r1, r5, r10, r11)
            java.lang.Object r4 = r0.s(r1, r4, r10, r11)
            java.lang.Object r3 = r0.s(r1, r3, r10, r11)
            r10 = 255(0xff, float:3.57E-43)
            r12 = r9
            goto L_0x00cc
        L_0x004e:
            r8 = r11
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
            r2 = 0
            r18 = 1
        L_0x0058:
            if (r18 == 0) goto L_0x00c4
            int r6 = r0.w(r1)
            switch(r6) {
                case -1: goto L_0x00bd;
                case 0: goto L_0x00aa;
                case 1: goto L_0x00a0;
                case 2: goto L_0x0095;
                case 3: goto L_0x008b;
                case 4: goto L_0x0082;
                case 5: goto L_0x0079;
                case 6: goto L_0x0070;
                case 7: goto L_0x0067;
                default: goto L_0x0061;
            }
        L_0x0061:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r6)
            throw r0
        L_0x0067:
            gq0.a1 r6 = gq0.a1.f23069b
            java.lang.Object r8 = r0.s(r1, r3, r6, r8)
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x00bb
        L_0x0070:
            gq0.a1 r6 = gq0.a1.f23069b
            java.lang.Object r10 = r0.s(r1, r4, r6, r10)
            r2 = r2 | 64
            goto L_0x00bb
        L_0x0079:
            gq0.a1 r6 = gq0.a1.f23069b
            java.lang.Object r9 = r0.s(r1, r5, r6, r9)
            r2 = r2 | 32
            goto L_0x00bb
        L_0x0082:
            gq0.h r6 = gq0.h.f23089b
            java.lang.Object r15 = r0.s(r1, r7, r6, r15)
            r2 = r2 | 16
            goto L_0x00bb
        L_0x008b:
            gq0.a1 r6 = gq0.a1.f23069b
            r3 = 3
            java.lang.Object r14 = r0.s(r1, r3, r6, r14)
            r2 = r2 | 8
            goto L_0x00a8
        L_0x0095:
            r3 = 3
            gq0.a1 r6 = gq0.a1.f23069b
            r3 = 2
            java.lang.Object r13 = r0.s(r1, r3, r6, r13)
            r2 = r2 | 4
            goto L_0x00a8
        L_0x00a0:
            r3 = 2
            r6 = 1
            java.lang.String r12 = r0.j(r1, r6)
            r2 = r2 | 2
        L_0x00a8:
            r3 = 7
            goto L_0x00bb
        L_0x00aa:
            r6 = 1
            gq0.f r3 = new gq0.f
            in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem$$serializer r4 = in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartItem$$serializer.INSTANCE
            r3.<init>(r4)
            r4 = 0
            java.lang.Object r11 = r0.s(r1, r4, r3, r11)
            r2 = r2 | 1
            r3 = 7
            r4 = 6
        L_0x00bb:
            r6 = 3
            goto L_0x0058
        L_0x00bd:
            r4 = 0
            r6 = 1
            r4 = 6
            r6 = 3
            r18 = 0
            goto L_0x0058
        L_0x00c4:
            r3 = r8
            r5 = r9
            r4 = r10
            r8 = r13
            r6 = r14
            r7 = r15
            r10 = r2
            r2 = r11
        L_0x00cc:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.dash.instamart.InstamartGetLocalCartPayload r0 = new in.swiggy.android.swiggylynx.plugin.dash.instamart.InstamartGetLocalCartPayload
            r11 = r2
            java.util.List r11 = (java.util.List) r11
            r13 = r8
            java.lang.String r13 = (java.lang.String) r13
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            r15 = r7
            java.lang.Boolean r15 = (java.lang.Boolean) r15
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
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.dash.instamart.InstamartGetLocalCartPayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.dash.instamart.InstamartGetLocalCartPayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartGetLocalCartPayload patch(Decoder decoder, InstamartGetLocalCartPayload instamartGetLocalCartPayload) {
        return (InstamartGetLocalCartPayload) q.a.a(this, decoder, instamartGetLocalCartPayload);
    }

    public void serialize(Encoder encoder, InstamartGetLocalCartPayload instamartGetLocalCartPayload) {
        p.j(encoder, "encoder");
        p.j(instamartGetLocalCartPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartGetLocalCartPayload.a(instamartGetLocalCartPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
