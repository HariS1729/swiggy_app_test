package xh0;

import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LynxWebViewConfig.kt */
public abstract class l {

    /* compiled from: LynxWebViewConfig.kt */
    public static final class a extends l {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f20004a;

        public a(boolean z11) {
            super((i) null);
            this.f20004a = z11;
        }

        public final boolean a() {
            return this.f20004a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f20004a == ((a) obj).f20004a;
        }

        public int hashCode() {
            boolean z11 = this.f20004a;
            if (z11) {
                return 1;
            }
            return z11 ? 1 : 0;
        }

        public String toString() {
            return "Pop(popStack=" + this.f20004a + ')';
        }
    }

    /* compiled from: LynxWebViewConfig.kt */
    public static final class b extends l {

        /* renamed from: a  reason: collision with root package name */
        private final m f20005a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m mVar) {
            super((i) null);
            p.j(mVar, PaymentConstants.Category.CONFIG);
            this.f20005a = mVar;
        }

        public final m a() {
            return this.f20005a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p.e(this.f20005a, ((b) obj).f20005a);
        }

        public int hashCode() {
            return this.f20005a.hashCode();
        }

        public String toString() {
            return "Push(config=" + this.f20005a + ')';
        }
    }

    private l() {
    }

    public /* synthetic */ l(i iVar) {
        this();
    }
}
