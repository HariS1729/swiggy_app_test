package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata;

import com.newrelic.agent.android.agentdata.HexAttribute;
import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: GetBalanceData.kt */
public final class GetBalanceData {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19178a;

    /* compiled from: GetBalanceData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetBalanceData> serializer() {
            return GetBalanceData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetBalanceData(int i11, String str, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19178a = str;
            return;
        }
        throw new MissingFieldException(HexAttribute.HEX_ATTR_METHOD_NAME);
    }

    public static final void a(GetBalanceData getBalanceData, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getBalanceData, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, getBalanceData.f19178a);
    }
}
