package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: OneClickVSCResponsePayload.kt */
public final class OneClickVSCResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19220a;

    /* compiled from: OneClickVSCResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<OneClickVSCResponsePayload> serializer() {
            return OneClickVSCResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OneClickVSCResponsePayload(int i11, boolean z11, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19220a = z11;
            return;
        }
        throw new MissingFieldException("isDeEnrolled");
    }

    public static final void a(OneClickVSCResponsePayload oneClickVSCResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(oneClickVSCResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.m(serialDescriptor, 0, oneClickVSCResponsePayload.f19220a);
    }

    public OneClickVSCResponsePayload(boolean z11) {
        this.f19220a = z11;
    }
}
