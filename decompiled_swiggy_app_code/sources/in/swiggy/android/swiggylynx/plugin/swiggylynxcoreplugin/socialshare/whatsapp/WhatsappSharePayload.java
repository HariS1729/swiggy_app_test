package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.socialshare.whatsapp;

import fq0.d;
import gq0.x0;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: WhatsappSharePayload.kt */
public final class WhatsappSharePayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19492a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19493b;

    /* compiled from: WhatsappSharePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<WhatsappSharePayload> serializer() {
            return WhatsappSharePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WhatsappSharePayload(int i11, String str, String str2, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19492a = str;
            if ((i11 & 2) != 0) {
                this.f19493b = str2;
                return;
            }
            throw new MissingFieldException(PaymentConstants.Event.FALLBACK);
        }
        throw new MissingFieldException("text");
    }

    public static final void d(WhatsappSharePayload whatsappSharePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(whatsappSharePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, whatsappSharePayload.f19492a);
        dVar.n(serialDescriptor, 1, whatsappSharePayload.f19493b);
    }

    public final String b() {
        return this.f19493b;
    }

    public final String c() {
        return this.f19492a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhatsappSharePayload)) {
            return false;
        }
        WhatsappSharePayload whatsappSharePayload = (WhatsappSharePayload) obj;
        return p.e(this.f19492a, whatsappSharePayload.f19492a) && p.e(this.f19493b, whatsappSharePayload.f19493b);
    }

    public int hashCode() {
        return (this.f19492a.hashCode() * 31) + this.f19493b.hashCode();
    }

    public String toString() {
        return "WhatsappSharePayload(text=" + this.f19492a + ", fallback=" + this.f19493b + ')';
    }
}
