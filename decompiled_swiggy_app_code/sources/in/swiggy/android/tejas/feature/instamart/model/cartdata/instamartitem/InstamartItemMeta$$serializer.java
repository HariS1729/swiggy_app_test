package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.q;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InstamartItemMeta.kt */
public final class InstamartItemMeta$$serializer implements q<InstamartItemMeta> {
    public static final InstamartItemMeta$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartItemMeta$$serializer instamartItemMeta$$serializer = new InstamartItemMeta$$serializer();
        INSTANCE = instamartItemMeta$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta", instamartItemMeta$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("product_long_description", true);
        pluginGeneratedSerialDescriptor.j("product_short_description", true);
        pluginGeneratedSerialDescriptor.j("disclaimer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartItemMeta$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta deserialize(kotlinx.serialization.encoding.Decoder r12) {
        /*
            r11 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.p.j(r12, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r11.getDescriptor()
            fq0.c r12 = r12.b(r0)
            boolean r1 = r12.k()
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0028
            gq0.a1 r1 = gq0.a1.f23069b
            java.lang.Object r4 = r12.s(r0, r4, r1, r2)
            java.lang.Object r5 = r12.s(r0, r5, r1, r2)
            java.lang.Object r1 = r12.s(r0, r3, r1, r2)
            r2 = 7
            r3 = 7
            goto L_0x0063
        L_0x0028:
            r1 = r2
            r6 = r1
            r7 = r6
            r2 = 0
            r8 = 1
        L_0x002d:
            if (r8 == 0) goto L_0x005f
            int r9 = r12.w(r0)
            r10 = -1
            if (r9 == r10) goto L_0x005d
            if (r9 == 0) goto L_0x0054
            if (r9 == r5) goto L_0x004b
            if (r9 != r3) goto L_0x0045
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r7 = r12.s(r0, r3, r9, r7)
            r2 = r2 | 4
            goto L_0x002d
        L_0x0045:
            kotlinx.serialization.UnknownFieldException r12 = new kotlinx.serialization.UnknownFieldException
            r12.<init>(r9)
            throw r12
        L_0x004b:
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r6 = r12.s(r0, r5, r9, r6)
            r2 = r2 | 2
            goto L_0x002d
        L_0x0054:
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r1 = r12.s(r0, r4, r9, r1)
            r2 = r2 | 1
            goto L_0x002d
        L_0x005d:
            r8 = 0
            goto L_0x002d
        L_0x005f:
            r4 = r1
            r3 = r2
            r5 = r6
            r1 = r7
        L_0x0063:
            r12.c(r0)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta r12 = new in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = (java.lang.String) r5
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
            r2 = r12
            r2.<init>((int) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (gq0.x0) r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartItemMeta patch(Decoder decoder, InstamartItemMeta instamartItemMeta) {
        return (InstamartItemMeta) q.a.a(this, decoder, instamartItemMeta);
    }

    public void serialize(Encoder encoder, InstamartItemMeta instamartItemMeta) {
        p.j(encoder, "encoder");
        p.j(instamartItemMeta, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartItemMeta.write$Self(instamartItemMeta, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
