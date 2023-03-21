package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import com.newrelic.agent.android.agentdata.HexAttribute;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.q;
import gq0.w;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InstamartItemInventory.kt */
public final class InstamartItemInventory$$serializer implements q<InstamartItemInventory> {
    public static final InstamartItemInventory$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartItemInventory$$serializer instamartItemInventory$$serializer = new InstamartItemInventory$$serializer();
        INSTANCE = instamartItemInventory$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory", instamartItemInventory$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("in_stock", true);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.TOTAL, true);
        pluginGeneratedSerialDescriptor.j("remaining", true);
        pluginGeneratedSerialDescriptor.j(HexAttribute.HEX_ATTR_MESSAGE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartItemInventory$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        w wVar = w.f23130b;
        return new KSerializer[]{a.p(h.f23089b), a.p(wVar), a.p(wVar), a.p(a1.f23069b)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory deserialize(kotlinx.serialization.encoding.Decoder r14) {
        /*
            r13 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.p.j(r14, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r13.getDescriptor()
            fq0.c r14 = r14.b(r0)
            boolean r1 = r14.k()
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0033
            gq0.h r1 = gq0.h.f23089b
            java.lang.Object r1 = r14.s(r0, r5, r1, r4)
            gq0.w r5 = gq0.w.f23130b
            java.lang.Object r6 = r14.s(r0, r6, r5, r4)
            java.lang.Object r3 = r14.s(r0, r3, r5, r4)
            gq0.a1 r5 = gq0.a1.f23069b
            java.lang.Object r2 = r14.s(r0, r2, r5, r4)
            r4 = 15
            r5 = 15
            goto L_0x007a
        L_0x0033:
            r1 = r4
            r7 = r1
            r8 = r7
            r9 = r8
            r4 = 0
            r10 = 1
        L_0x0039:
            if (r10 == 0) goto L_0x0076
            int r11 = r14.w(r0)
            r12 = -1
            if (r11 == r12) goto L_0x0074
            if (r11 == 0) goto L_0x006b
            if (r11 == r6) goto L_0x0062
            if (r11 == r3) goto L_0x0059
            if (r11 != r2) goto L_0x0053
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r9 = r14.s(r0, r2, r11, r9)
            r4 = r4 | 8
            goto L_0x0039
        L_0x0053:
            kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
            r14.<init>(r11)
            throw r14
        L_0x0059:
            gq0.w r11 = gq0.w.f23130b
            java.lang.Object r8 = r14.s(r0, r3, r11, r8)
            r4 = r4 | 4
            goto L_0x0039
        L_0x0062:
            gq0.w r11 = gq0.w.f23130b
            java.lang.Object r7 = r14.s(r0, r6, r11, r7)
            r4 = r4 | 2
            goto L_0x0039
        L_0x006b:
            gq0.h r11 = gq0.h.f23089b
            java.lang.Object r1 = r14.s(r0, r5, r11, r1)
            r4 = r4 | 1
            goto L_0x0039
        L_0x0074:
            r10 = 0
            goto L_0x0039
        L_0x0076:
            r5 = r4
            r6 = r7
            r3 = r8
            r2 = r9
        L_0x007a:
            r14.c(r0)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory r14 = new in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory
            r0 = r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r7 = r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            r8 = r3
            java.lang.Integer r8 = (java.lang.Integer) r8
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r10 = 0
            r4 = r14
            r6 = r0
            r4.<init>((int) r5, (java.lang.Boolean) r6, (java.lang.Integer) r7, (java.lang.Integer) r8, (java.lang.String) r9, (gq0.x0) r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartItemInventory patch(Decoder decoder, InstamartItemInventory instamartItemInventory) {
        return (InstamartItemInventory) q.a.a(this, decoder, instamartItemInventory);
    }

    public void serialize(Encoder encoder, InstamartItemInventory instamartItemInventory) {
        p.j(encoder, "encoder");
        p.j(instamartItemInventory, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartItemInventory.write$Self(instamartItemInventory, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
