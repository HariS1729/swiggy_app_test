package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.responsedata;

import fq0.d;
import gq0.a1;
import gq0.x0;
import gq0.z;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CheckChargeStatusResponsePayload.kt */
public final class CheckChargeStatusResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f19187a;

    /* compiled from: CheckChargeStatusResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CheckChargeStatusResponsePayload> serializer() {
            return CheckChargeStatusResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckChargeStatusResponsePayload(int i11, Map map, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19187a = map;
            return;
        }
        throw new MissingFieldException("payment_meta");
    }

    public static final void a(CheckChargeStatusResponsePayload checkChargeStatusResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(checkChargeStatusResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        a1 a1Var = a1.f23069b;
        dVar.v(serialDescriptor, 0, new z(a1Var, a1Var), checkChargeStatusResponsePayload.f19187a);
    }

    public CheckChargeStatusResponsePayload(Map<String, String> map) {
        p.j(map, "chargeStatusResponsePayload");
        this.f19187a = map;
    }
}
