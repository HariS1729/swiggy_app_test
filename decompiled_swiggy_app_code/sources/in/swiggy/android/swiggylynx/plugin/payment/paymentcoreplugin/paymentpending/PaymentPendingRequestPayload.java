package in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.paymentpending;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: PaymentPendingRequestPayload.kt */
public final class PaymentPendingRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19297a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19298b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19299c;

    /* renamed from: d  reason: collision with root package name */
    private final PendingPaymentRequestParams f19300d;

    /* compiled from: PaymentPendingRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<PaymentPendingRequestPayload> serializer() {
            return PaymentPendingRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaymentPendingRequestPayload(int i11, String str, String str2, String str3, PendingPaymentRequestParams pendingPaymentRequestParams, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19297a = str;
            if ((i11 & 2) != 0) {
                this.f19298b = str2;
                if ((i11 & 4) != 0) {
                    this.f19299c = str3;
                    if ((i11 & 8) != 0) {
                        this.f19300d = pendingPaymentRequestParams;
                        return;
                    }
                    throw new MissingFieldException("requestObj");
                }
                throw new MissingFieldException("marketplaceCategory");
            }
            throw new MissingFieldException("marketplaceBusinessLine");
        }
        throw new MissingFieldException("paymentMethodName");
    }

    public static final void f(PaymentPendingRequestPayload paymentPendingRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(paymentPendingRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, paymentPendingRequestPayload.f19297a);
        dVar.n(serialDescriptor, 1, paymentPendingRequestPayload.f19298b);
        dVar.n(serialDescriptor, 2, paymentPendingRequestPayload.f19299c);
        dVar.v(serialDescriptor, 3, PendingPaymentRequestParams$$serializer.INSTANCE, paymentPendingRequestPayload.f19300d);
    }

    public final String b() {
        return this.f19298b;
    }

    public final String c() {
        return this.f19299c;
    }

    public final String d() {
        return this.f19297a;
    }

    public final PendingPaymentRequestParams e() {
        return this.f19300d;
    }
}
