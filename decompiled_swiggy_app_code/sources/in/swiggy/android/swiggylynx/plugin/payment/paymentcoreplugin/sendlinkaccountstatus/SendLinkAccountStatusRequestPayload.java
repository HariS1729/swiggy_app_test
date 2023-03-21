package in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.sendlinkaccountstatus;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: SendLinkAccountStatusRequestPayload.kt */
public final class SendLinkAccountStatusRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19310a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19311b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19312c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19313d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19314e;

    /* compiled from: SendLinkAccountStatusRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<SendLinkAccountStatusRequestPayload> serializer() {
            return SendLinkAccountStatusRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SendLinkAccountStatusRequestPayload(int i11, String str, String str2, String str3, String str4, String str5, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19310a = str;
            if ((i11 & 2) == 0) {
                this.f19311b = null;
            } else {
                this.f19311b = str2;
            }
            if ((i11 & 4) == 0) {
                this.f19312c = null;
            } else {
                this.f19312c = str3;
            }
            if ((i11 & 8) == 0) {
                this.f19313d = null;
            } else {
                this.f19313d = str4;
            }
            if ((i11 & 16) == 0) {
                this.f19314e = null;
            } else {
                this.f19314e = str5;
            }
        } else {
            throw new MissingFieldException("paymentCode");
        }
    }

    public static final void e(SendLinkAccountStatusRequestPayload sendLinkAccountStatusRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(sendLinkAccountStatusRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.n(serialDescriptor, 0, sendLinkAccountStatusRequestPayload.f19310a);
        if (dVar.o(serialDescriptor, 1) || sendLinkAccountStatusRequestPayload.f19311b != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, sendLinkAccountStatusRequestPayload.f19311b);
        }
        if (dVar.o(serialDescriptor, 2) || sendLinkAccountStatusRequestPayload.f19312c != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, sendLinkAccountStatusRequestPayload.f19312c);
        }
        if (dVar.o(serialDescriptor, 3) || sendLinkAccountStatusRequestPayload.f19313d != null) {
            dVar.E(serialDescriptor, 3, a1.f23069b, sendLinkAccountStatusRequestPayload.f19313d);
        }
        if (dVar.o(serialDescriptor, 4) || sendLinkAccountStatusRequestPayload.f19314e != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 4, a1.f23069b, sendLinkAccountStatusRequestPayload.f19314e);
        }
    }

    public final String b() {
        return this.f19313d;
    }

    public final String c() {
        return this.f19310a;
    }

    public final String d() {
        return this.f19314e;
    }
}
