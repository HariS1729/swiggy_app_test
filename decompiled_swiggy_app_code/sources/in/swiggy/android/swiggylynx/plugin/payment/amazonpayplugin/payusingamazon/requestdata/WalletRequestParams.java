package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: WalletRequestParams.kt */
public final class WalletRequestParams {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19182a;

    /* renamed from: b  reason: collision with root package name */
    private String f19183b;

    /* renamed from: c  reason: collision with root package name */
    private String f19184c;

    /* renamed from: d  reason: collision with root package name */
    private String f19185d;

    /* compiled from: WalletRequestParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<WalletRequestParams> serializer() {
            return WalletRequestParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletRequestParams(int i11, String str, String str2, String str3, String str4, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19182a = str;
            if ((i11 & 2) == 0) {
                this.f19183b = null;
            } else {
                this.f19183b = str2;
            }
            if ((i11 & 4) == 0) {
                this.f19184c = null;
            } else {
                this.f19184c = str3;
            }
            if ((i11 & 8) == 0) {
                this.f19185d = null;
            } else {
                this.f19185d = str4;
            }
        } else {
            throw new MissingFieldException("orderId");
        }
    }

    public static final void e(WalletRequestParams walletRequestParams, d dVar, SerialDescriptor serialDescriptor) {
        p.j(walletRequestParams, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.n(serialDescriptor, 0, walletRequestParams.f19182a);
        if (dVar.o(serialDescriptor, 1) || walletRequestParams.f19183b != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, walletRequestParams.f19183b);
        }
        if (dVar.o(serialDescriptor, 2) || walletRequestParams.f19184c != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, walletRequestParams.f19184c);
        }
        if (dVar.o(serialDescriptor, 3) || walletRequestParams.f19185d != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 3, a1.f23069b, walletRequestParams.f19185d);
        }
    }

    public final String a() {
        return this.f19184c;
    }

    public final String b() {
        return this.f19185d;
    }

    public final String c() {
        return this.f19182a;
    }

    public final String d() {
        return this.f19183b;
    }
}
