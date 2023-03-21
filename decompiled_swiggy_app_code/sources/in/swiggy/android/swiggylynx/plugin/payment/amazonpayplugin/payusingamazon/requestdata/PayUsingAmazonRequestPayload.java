package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata;

import com.newrelic.agent.android.agentdata.HexAttribute;
import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import lp.b;

/* compiled from: PayUsingAmazonRequestPayload.kt */
public final class PayUsingAmazonRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19179a;

    /* renamed from: b  reason: collision with root package name */
    private final JsonElement f19180b;

    /* compiled from: PayUsingAmazonRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<PayUsingAmazonRequestPayload> serializer() {
            return PayUsingAmazonRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PayUsingAmazonRequestPayload(int i11, String str, JsonElement jsonElement, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19179a = str;
            if ((i11 & 2) == 0) {
                this.f19180b = null;
            } else {
                this.f19180b = jsonElement;
            }
        } else {
            throw new MissingFieldException(HexAttribute.HEX_ATTR_THREAD_STATE);
        }
    }

    public static final void d(PayUsingAmazonRequestPayload payUsingAmazonRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(payUsingAmazonRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.n(serialDescriptor, 0, payUsingAmazonRequestPayload.f19179a);
        if (dVar.o(serialDescriptor, 1) || payUsingAmazonRequestPayload.f19180b != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, JsonElementSerializer.f26449b, payUsingAmazonRequestPayload.f19180b);
        }
    }

    public final JsonElement b() {
        return this.f19180b;
    }

    public final String c() {
        return this.f19179a;
    }
}
