package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: ProceedToPayData.kt */
public final class ProceedToPayData extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final WalletRequestParams f19181a;

    /* compiled from: ProceedToPayData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<ProceedToPayData> serializer() {
            return ProceedToPayData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProceedToPayData(int i11, WalletRequestParams walletRequestParams, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19181a = walletRequestParams;
            return;
        }
        throw new MissingFieldException("walletParams");
    }

    public static final void c(ProceedToPayData proceedToPayData, d dVar, SerialDescriptor serialDescriptor) {
        p.j(proceedToPayData, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, WalletRequestParams$$serializer.INSTANCE, proceedToPayData.f19181a);
    }

    public final WalletRequestParams b() {
        return this.f19181a;
    }
}
