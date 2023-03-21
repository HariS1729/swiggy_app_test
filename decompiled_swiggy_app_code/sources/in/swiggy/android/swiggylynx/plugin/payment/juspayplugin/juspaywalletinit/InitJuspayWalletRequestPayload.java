package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspaywalletinit;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: InitJuspayWalletRequestPayload.kt */
public final class InitJuspayWalletRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19227a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19228b;

    /* compiled from: InitJuspayWalletRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InitJuspayWalletRequestPayload> serializer() {
            return InitJuspayWalletRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InitJuspayWalletRequestPayload(int i11, String str, long j, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19227a = str;
            if ((i11 & 2) != 0) {
                this.f19228b = j;
                return;
            }
            throw new MissingFieldException("clientAuthTokenExpiry");
        }
        throw new MissingFieldException("clientAuthToken");
    }

    public static final void c(InitJuspayWalletRequestPayload initJuspayWalletRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(initJuspayWalletRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, initJuspayWalletRequestPayload.f19227a);
        dVar.r(serialDescriptor, 1, initJuspayWalletRequestPayload.f19228b);
    }

    public final String b() {
        return this.f19227a;
    }
}
