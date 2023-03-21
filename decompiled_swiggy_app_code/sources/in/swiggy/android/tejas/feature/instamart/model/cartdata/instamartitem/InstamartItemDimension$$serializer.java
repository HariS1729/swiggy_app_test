package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import dq0.a;
import fq0.d;
import gq0.q;
import gq0.w;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InstamartItemDimension.kt */
public final class InstamartItemDimension$$serializer implements q<InstamartItemDimension> {
    public static final InstamartItemDimension$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartItemDimension$$serializer instamartItemDimension$$serializer = new InstamartItemDimension$$serializer();
        INSTANCE = instamartItemDimension$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension", instamartItemDimension$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("length_in_cm", true);
        pluginGeneratedSerialDescriptor.j("width_in_cm", true);
        pluginGeneratedSerialDescriptor.j("height_in_cm", true);
        pluginGeneratedSerialDescriptor.j("volume_in_cc", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartItemDimension$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        w wVar = w.f23130b;
        return new KSerializer[]{a.p(wVar), a.p(wVar), a.p(wVar), a.p(wVar)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension deserialize(kotlinx.serialization.encoding.Decoder r14) {
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
            if (r1 == 0) goto L_0x0030
            gq0.w r1 = gq0.w.f23130b
            java.lang.Object r5 = r14.s(r0, r5, r1, r4)
            java.lang.Object r6 = r14.s(r0, r6, r1, r4)
            java.lang.Object r3 = r14.s(r0, r3, r1, r4)
            java.lang.Object r1 = r14.s(r0, r2, r1, r4)
            r2 = 15
            r8 = r3
            r3 = 15
            goto L_0x0076
        L_0x0030:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = 0
            r10 = 1
        L_0x0035:
            if (r10 == 0) goto L_0x0072
            int r11 = r14.w(r0)
            r12 = -1
            if (r11 == r12) goto L_0x0070
            if (r11 == 0) goto L_0x0067
            if (r11 == r6) goto L_0x005e
            if (r11 == r3) goto L_0x0055
            if (r11 != r2) goto L_0x004f
            gq0.w r11 = gq0.w.f23130b
            java.lang.Object r9 = r14.s(r0, r2, r11, r9)
            r1 = r1 | 8
            goto L_0x0035
        L_0x004f:
            kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
            r14.<init>(r11)
            throw r14
        L_0x0055:
            gq0.w r11 = gq0.w.f23130b
            java.lang.Object r8 = r14.s(r0, r3, r11, r8)
            r1 = r1 | 4
            goto L_0x0035
        L_0x005e:
            gq0.w r11 = gq0.w.f23130b
            java.lang.Object r7 = r14.s(r0, r6, r11, r7)
            r1 = r1 | 2
            goto L_0x0035
        L_0x0067:
            gq0.w r11 = gq0.w.f23130b
            java.lang.Object r4 = r14.s(r0, r5, r11, r4)
            r1 = r1 | 1
            goto L_0x0035
        L_0x0070:
            r10 = 0
            goto L_0x0035
        L_0x0072:
            r3 = r1
            r5 = r4
            r6 = r7
            r1 = r9
        L_0x0076:
            r14.c(r0)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension r14 = new in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension
            r4 = r5
            java.lang.Integer r4 = (java.lang.Integer) r4
            r5 = r6
            java.lang.Integer r5 = (java.lang.Integer) r5
            r6 = r8
            java.lang.Integer r6 = (java.lang.Integer) r6
            r7 = r1
            java.lang.Integer r7 = (java.lang.Integer) r7
            r8 = 0
            r2 = r14
            r2.<init>((int) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (java.lang.Integer) r6, (java.lang.Integer) r7, (gq0.x0) r8)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartItemDimension patch(Decoder decoder, InstamartItemDimension instamartItemDimension) {
        return (InstamartItemDimension) q.a.a(this, decoder, instamartItemDimension);
    }

    public void serialize(Encoder encoder, InstamartItemDimension instamartItemDimension) {
        p.j(encoder, "encoder");
        p.j(instamartItemDimension, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartItemDimension.write$Self(instamartItemDimension, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
