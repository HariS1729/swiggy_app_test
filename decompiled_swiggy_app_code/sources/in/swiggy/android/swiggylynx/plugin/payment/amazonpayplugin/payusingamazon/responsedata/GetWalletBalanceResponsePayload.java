package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.responsedata;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: GetWalletBalanceResponsePayload.kt */
public final class GetWalletBalanceResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Float f19188a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f19189b;

    /* compiled from: GetWalletBalanceResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetWalletBalanceResponsePayload> serializer() {
            return GetWalletBalanceResponsePayload$$serializer.INSTANCE;
        }
    }

    public GetWalletBalanceResponsePayload() {
        this((Float) null, false, 3, (i) null);
    }

    public /* synthetic */ GetWalletBalanceResponsePayload(int i11, Float f11, boolean z11, x0 x0Var) {
        this.f19188a = (i11 & 1) == 0 ? null : f11;
        if ((i11 & 2) == 0) {
            this.f19189b = false;
        } else {
            this.f19189b = z11;
        }
    }

    public static final void a(GetWalletBalanceResponsePayload getWalletBalanceResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getWalletBalanceResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || getWalletBalanceResponsePayload.f19188a != null) {
            dVar.E(serialDescriptor, 0, gq0.p.f23116b, getWalletBalanceResponsePayload.f19188a);
        }
        if (dVar.o(serialDescriptor, 1) || getWalletBalanceResponsePayload.f19189b) {
            z11 = true;
        }
        if (z11) {
            dVar.m(serialDescriptor, 1, getWalletBalanceResponsePayload.f19189b);
        }
    }

    public GetWalletBalanceResponsePayload(Float f11, boolean z11) {
        this.f19188a = f11;
        this.f19189b = z11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetWalletBalanceResponsePayload(Float f11, boolean z11, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : f11, (i11 & 2) != 0 ? false : z11);
    }
}
