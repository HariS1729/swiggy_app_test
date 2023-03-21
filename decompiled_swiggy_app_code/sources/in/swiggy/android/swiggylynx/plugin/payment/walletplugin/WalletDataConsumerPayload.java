package in.swiggy.android.swiggylynx.plugin.payment.walletplugin;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: WalletDataConsumerPayload.kt */
public abstract class WalletDataConsumerPayload extends b {

    /* compiled from: WalletDataConsumerPayload.kt */
    public static final class WalletAddMoneySuccess extends WalletDataConsumerPayload {
        public static final Companion Companion = new Companion((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f19347a;

        /* compiled from: WalletDataConsumerPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final KSerializer<WalletAddMoneySuccess> serializer() {
                return WalletDataConsumerPayload$WalletAddMoneySuccess$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WalletAddMoneySuccess(int i11, String str, x0 x0Var) {
            super((i) null);
            if ((i11 & 1) != 0) {
                this.f19347a = str;
                return;
            }
            throw new MissingFieldException("walletCode");
        }

        public static final void c(WalletAddMoneySuccess walletAddMoneySuccess, d dVar, SerialDescriptor serialDescriptor) {
            p.j(walletAddMoneySuccess, "self");
            p.j(dVar, "output");
            p.j(serialDescriptor, "serialDesc");
            dVar.n(serialDescriptor, 0, walletAddMoneySuccess.f19347a);
        }

        public final String b() {
            return this.f19347a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WalletAddMoneySuccess) && p.e(this.f19347a, ((WalletAddMoneySuccess) obj).f19347a);
        }

        public int hashCode() {
            return this.f19347a.hashCode();
        }

        public String toString() {
            return "WalletAddMoneySuccess(walletCode=" + this.f19347a + ')';
        }
    }

    /* compiled from: WalletDataConsumerPayload.kt */
    public static final class WalletDelinked extends WalletDataConsumerPayload {
        public static final Companion Companion = new Companion((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f19348a;

        /* renamed from: b  reason: collision with root package name */
        private final String f19349b;

        /* compiled from: WalletDataConsumerPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final KSerializer<WalletDelinked> serializer() {
                return WalletDataConsumerPayload$WalletDelinked$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WalletDelinked(int i11, String str, String str2, x0 x0Var) {
            super((i) null);
            if ((i11 & 1) != 0) {
                this.f19348a = str;
                if ((i11 & 2) != 0) {
                    this.f19349b = str2;
                    return;
                }
                throw new MissingFieldException("mobileNumber");
            }
            throw new MissingFieldException("walletCode");
        }

        public static final void d(WalletDelinked walletDelinked, d dVar, SerialDescriptor serialDescriptor) {
            p.j(walletDelinked, "self");
            p.j(dVar, "output");
            p.j(serialDescriptor, "serialDesc");
            dVar.n(serialDescriptor, 0, walletDelinked.f19348a);
            dVar.n(serialDescriptor, 1, walletDelinked.f19349b);
        }

        public final String b() {
            return this.f19349b;
        }

        public final String c() {
            return this.f19348a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WalletDelinked)) {
                return false;
            }
            WalletDelinked walletDelinked = (WalletDelinked) obj;
            return p.e(this.f19348a, walletDelinked.f19348a) && p.e(this.f19349b, walletDelinked.f19349b);
        }

        public int hashCode() {
            return (this.f19348a.hashCode() * 31) + this.f19349b.hashCode();
        }

        public String toString() {
            return "WalletDelinked(walletCode=" + this.f19348a + ", mobileNumber=" + this.f19349b + ')';
        }
    }

    private WalletDataConsumerPayload() {
    }

    public /* synthetic */ WalletDataConsumerPayload(i iVar) {
        this();
    }
}
