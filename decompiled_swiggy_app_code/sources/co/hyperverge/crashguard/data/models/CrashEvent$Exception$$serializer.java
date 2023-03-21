package co.hyperverge.crashguard.data.models;

import co.hyperverge.crashguard.data.models.CrashEvent;
import dq0.a;
import fq0.c;
import fq0.d;
import gq0.f;
import gq0.q;
import gq0.x0;
import java.util.List;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: CrashEvent.kt */
public final class CrashEvent$Exception$$serializer implements q<CrashEvent.Exception> {
    public static final CrashEvent$Exception$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CrashEvent$Exception$$serializer crashEvent$Exception$$serializer = new CrashEvent$Exception$$serializer();
        INSTANCE = crashEvent$Exception$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("co.hyperverge.crashguard.data.models.CrashEvent.Exception", crashEvent$Exception$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("values", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CrashEvent$Exception$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(new f(CrashEvent$Exception$Value$$serializer.INSTANCE))};
    }

    public CrashEvent.Exception deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.s(descriptor2, 0, new f(CrashEvent$Exception$Value$$serializer.INSTANCE), null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.s(descriptor2, 0, new f(CrashEvent$Exception$Value$$serializer.INSTANCE), obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new CrashEvent.Exception(i11, (List) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public abstract /* synthetic */ Object patch(Decoder decoder, Object obj);

    public void serialize(Encoder encoder, CrashEvent.Exception exception) {
        p.j(encoder, "encoder");
        p.j(exception, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CrashEvent.Exception.a(exception, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
