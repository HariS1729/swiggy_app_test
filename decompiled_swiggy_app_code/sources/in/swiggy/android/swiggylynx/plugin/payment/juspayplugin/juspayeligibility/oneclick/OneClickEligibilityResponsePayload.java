package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick;

import fq0.d;
import gq0.f;
import gq0.x0;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: OneClickEligibilityResponsePayload.kt */
public final class OneClickEligibilityResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final List<EligibilityDetails> f19213a;

    /* compiled from: OneClickEligibilityResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<OneClickEligibilityResponsePayload> serializer() {
            return OneClickEligibilityResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OneClickEligibilityResponsePayload(int i11, List list, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19213a = list;
            return;
        }
        throw new MissingFieldException("cardEligiblityDetails");
    }

    public static final void a(OneClickEligibilityResponsePayload oneClickEligibilityResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(oneClickEligibilityResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, new f(EligibilityDetails$$serializer.INSTANCE), oneClickEligibilityResponsePayload.f19213a);
    }

    public OneClickEligibilityResponsePayload(List<EligibilityDetails> list) {
        p.j(list, "cardsDetail");
        this.f19213a = list;
    }
}
