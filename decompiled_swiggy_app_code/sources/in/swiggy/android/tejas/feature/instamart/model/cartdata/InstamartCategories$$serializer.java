package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
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

/* compiled from: InstamartCategories.kt */
public final class InstamartCategories$$serializer implements q<InstamartCategories> {
    public static final InstamartCategories$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartCategories$$serializer instamartCategories$$serializer = new InstamartCategories$$serializer();
        INSTANCE = instamartCategories$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartCategories", instamartCategories$$serializer, 3);
        pluginGeneratedSerialDescriptor.j(DistributedTracing.NR_ID_ATTRIBUTE, true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("is_category_popular", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartCategories$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(w.f23130b), a.p(a1.f23069b), a.p(h.f23089b)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartCategories deserialize(kotlinx.serialization.encoding.Decoder r12) {
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
            if (r1 == 0) goto L_0x002d
            gq0.w r1 = gq0.w.f23130b
            java.lang.Object r1 = r12.s(r0, r4, r1, r2)
            gq0.a1 r4 = gq0.a1.f23069b
            java.lang.Object r4 = r12.s(r0, r5, r4, r2)
            gq0.h r5 = gq0.h.f23089b
            java.lang.Object r2 = r12.s(r0, r3, r5, r2)
            r3 = 7
            r3 = r4
            r4 = 7
            goto L_0x0067
        L_0x002d:
            r1 = r2
            r6 = r1
            r7 = 0
            r8 = 1
        L_0x0031:
            if (r8 == 0) goto L_0x0063
            int r9 = r12.w(r0)
            r10 = -1
            if (r9 == r10) goto L_0x0061
            if (r9 == 0) goto L_0x0058
            if (r9 == r5) goto L_0x004f
            if (r9 != r3) goto L_0x0049
            gq0.h r9 = gq0.h.f23089b
            java.lang.Object r6 = r12.s(r0, r3, r9, r6)
            r7 = r7 | 4
            goto L_0x0031
        L_0x0049:
            kotlinx.serialization.UnknownFieldException r12 = new kotlinx.serialization.UnknownFieldException
            r12.<init>(r9)
            throw r12
        L_0x004f:
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r1 = r12.s(r0, r5, r9, r1)
            r7 = r7 | 2
            goto L_0x0031
        L_0x0058:
            gq0.w r9 = gq0.w.f23130b
            java.lang.Object r2 = r12.s(r0, r4, r9, r2)
            r7 = r7 | 1
            goto L_0x0031
        L_0x0061:
            r8 = 0
            goto L_0x0031
        L_0x0063:
            r3 = r1
            r1 = r2
            r2 = r6
            r4 = r7
        L_0x0067:
            r12.c(r0)
            in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartCategories r12 = new in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartCategories
            r5 = r1
            java.lang.Integer r5 = (java.lang.Integer) r5
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            r7 = r2
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r8 = 0
            r3 = r12
            r3.<init>((int) r4, (java.lang.Integer) r5, (java.lang.String) r6, (java.lang.Boolean) r7, (gq0.x0) r8)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartCategories$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartCategories");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartCategories patch(Decoder decoder, InstamartCategories instamartCategories) {
        return (InstamartCategories) q.a.a(this, decoder, instamartCategories);
    }

    public void serialize(Encoder encoder, InstamartCategories instamartCategories) {
        p.j(encoder, "encoder");
        p.j(instamartCategories, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartCategories.write$Self(instamartCategories, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
