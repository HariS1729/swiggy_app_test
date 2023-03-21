package in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.isphonepeavailable;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: IsPhonePeAvailableResponsePayload.kt */
public final class IsPhonePeAvailableResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19315a;

    /* compiled from: IsPhonePeAvailableResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<IsPhonePeAvailableResponsePayload> serializer() {
            return IsPhonePeAvailableResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IsPhonePeAvailableResponsePayload(int i11, boolean z11, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19315a = z11;
            return;
        }
        throw new MissingFieldException("isAvailable");
    }

    public static final void a(IsPhonePeAvailableResponsePayload isPhonePeAvailableResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(isPhonePeAvailableResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.m(serialDescriptor, 0, isPhonePeAvailableResponsePayload.f19315a);
    }

    public IsPhonePeAvailableResponsePayload(boolean z11) {
        this.f19315a = z11;
    }
}
