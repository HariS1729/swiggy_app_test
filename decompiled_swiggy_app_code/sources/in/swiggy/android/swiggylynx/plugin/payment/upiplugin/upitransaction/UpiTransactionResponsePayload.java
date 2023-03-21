package in.swiggy.android.swiggylynx.plugin.payment.upiplugin.upitransaction;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: UpiTransactionResponsePayload.kt */
public final class UpiTransactionResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19334a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19335b;

    /* compiled from: UpiTransactionResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<UpiTransactionResponsePayload> serializer() {
            return UpiTransactionResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpiTransactionResponsePayload(int i11, String str, String str2, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19334a = str;
            if ((i11 & 2) != 0) {
                this.f19335b = str2;
                return;
            }
            throw new MissingFieldException("orderId");
        }
        throw new MissingFieldException("status");
    }

    public static final void a(UpiTransactionResponsePayload upiTransactionResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(upiTransactionResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, upiTransactionResponsePayload.f19334a);
        dVar.n(serialDescriptor, 1, upiTransactionResponsePayload.f19335b);
    }

    public UpiTransactionResponsePayload(String str, String str2) {
        p.j(str, "status");
        p.j(str2, "orderId");
        this.f19334a = str;
        this.f19335b = str2;
    }
}
