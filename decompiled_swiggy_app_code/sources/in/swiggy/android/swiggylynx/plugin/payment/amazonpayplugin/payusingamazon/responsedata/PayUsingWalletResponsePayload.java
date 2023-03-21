package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.responsedata;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: PayUsingWalletResponsePayload.kt */
public final class PayUsingWalletResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19190a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19191b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19192c;

    /* compiled from: PayUsingWalletResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<PayUsingWalletResponsePayload> serializer() {
            return PayUsingWalletResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PayUsingWalletResponsePayload(int i11, String str, String str2, String str3, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19190a = str;
            if ((i11 & 2) != 0) {
                this.f19191b = str2;
                if ((i11 & 4) != 0) {
                    this.f19192c = str3;
                    return;
                }
                throw new MissingFieldException("transactionId");
            }
            throw new MissingFieldException("orderId");
        }
        throw new MissingFieldException("status");
    }

    public static final void a(PayUsingWalletResponsePayload payUsingWalletResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(payUsingWalletResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, payUsingWalletResponsePayload.f19190a);
        dVar.n(serialDescriptor, 1, payUsingWalletResponsePayload.f19191b);
        dVar.n(serialDescriptor, 2, payUsingWalletResponsePayload.f19192c);
    }

    public PayUsingWalletResponsePayload(String str, String str2, String str3) {
        p.j(str, "status");
        p.j(str2, "orderId");
        p.j(str3, "transactionId");
        this.f19190a = str;
        this.f19191b = str2;
        this.f19192c = str3;
    }
}
