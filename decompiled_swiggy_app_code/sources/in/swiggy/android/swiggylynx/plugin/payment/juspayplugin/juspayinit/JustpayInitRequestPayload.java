package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayinit;

import fq0.d;
import gq0.a1;
import gq0.x0;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: JustpayInitRequestPayload.kt */
public final class JustpayInitRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19221a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19222b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19223c;

    /* compiled from: JustpayInitRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<JustpayInitRequestPayload> serializer() {
            return JustpayInitRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JustpayInitRequestPayload(int i11, String str, String str2, String str3, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19221a = str;
            if ((i11 & 2) != 0) {
                this.f19222b = str2;
                if ((i11 & 4) == 0) {
                    this.f19223c = null;
                } else {
                    this.f19223c = str3;
                }
            } else {
                throw new MissingFieldException(PaymentConstants.MERCHANT_ID_CAMEL);
            }
        } else {
            throw new MissingFieldException(PaymentConstants.ENV);
        }
    }

    public static final void e(JustpayInitRequestPayload justpayInitRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(justpayInitRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.n(serialDescriptor, 0, justpayInitRequestPayload.f19221a);
        dVar.n(serialDescriptor, 1, justpayInitRequestPayload.f19222b);
        if (dVar.o(serialDescriptor, 2) || justpayInitRequestPayload.f19223c != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 2, a1.f23069b, justpayInitRequestPayload.f19223c);
        }
    }

    public final String b() {
        return this.f19223c;
    }

    public final String c() {
        return this.f19221a;
    }

    public final String d() {
        return this.f19222b;
    }
}
