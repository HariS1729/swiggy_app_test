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
public final class CrashEvent$Exception$Value$StackTrace$$serializer implements q<CrashEvent.Exception.Value.StackTrace> {
    public static final CrashEvent$Exception$Value$StackTrace$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CrashEvent$Exception$Value$StackTrace$$serializer crashEvent$Exception$Value$StackTrace$$serializer = new CrashEvent$Exception$Value$StackTrace$$serializer();
        INSTANCE = crashEvent$Exception$Value$StackTrace$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("co.hyperverge.crashguard.data.models.CrashEvent.Exception.Value.StackTrace", crashEvent$Exception$Value$StackTrace$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("frames", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CrashEvent$Exception$Value$StackTrace$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(new f(CrashEvent$Exception$Value$StackTrace$Frame$$serializer.INSTANCE))};
    }

    public CrashEvent.Exception.Value.StackTrace deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.s(descriptor2, 0, new f(CrashEvent$Exception$Value$StackTrace$Frame$$serializer.INSTANCE), null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.s(descriptor2, 0, new f(CrashEvent$Exception$Value$StackTrace$Frame$$serializer.INSTANCE), obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new CrashEvent.Exception.Value.StackTrace(i11, (List) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public abstract /* synthetic */ Object patch(Decoder decoder, Object obj);

    public void serialize(Encoder encoder, CrashEvent.Exception.Value.StackTrace stackTrace) {
        p.j(encoder, "encoder");
        p.j(stackTrace, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CrashEvent.Exception.Value.StackTrace.a(stackTrace, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
