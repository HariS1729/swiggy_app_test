package in.swiggy.android.swiggylynx.plugin.payment.walletplugin;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: AmazonDelinkPlugin.kt */
public abstract class AmazonDelinkPlugin extends b {

    /* compiled from: AmazonDelinkPlugin.kt */
    public static final class AmazonDelinkRequestPayload extends AmazonDelinkPlugin {
        public static final Companion Companion = new Companion((i) null);

        /* compiled from: AmazonDelinkPlugin.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final KSerializer<AmazonDelinkRequestPayload> serializer() {
                return AmazonDelinkPlugin$AmazonDelinkRequestPayload$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ AmazonDelinkRequestPayload(int i11, x0 x0Var) {
            super((i) null);
        }

        public static final void b(AmazonDelinkRequestPayload amazonDelinkRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
            p.j(amazonDelinkRequestPayload, "self");
            p.j(dVar, "output");
            p.j(serialDescriptor, "serialDesc");
        }

        public AmazonDelinkRequestPayload() {
            super((i) null);
        }
    }

    /* compiled from: AmazonDelinkPlugin.kt */
    public static final class AmazonDelinkResponsePayload extends AmazonDelinkPlugin {
        public static final Companion Companion = new Companion((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f19336a;

        /* compiled from: AmazonDelinkPlugin.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final KSerializer<AmazonDelinkResponsePayload> serializer() {
                return AmazonDelinkPlugin$AmazonDelinkResponsePayload$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ AmazonDelinkResponsePayload(int i11, String str, x0 x0Var) {
            super((i) null);
            if ((i11 & 1) != 0) {
                this.f19336a = str;
                return;
            }
            throw new MissingFieldException("status");
        }

        public static final void b(AmazonDelinkResponsePayload amazonDelinkResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
            p.j(amazonDelinkResponsePayload, "self");
            p.j(dVar, "output");
            p.j(serialDescriptor, "serialDesc");
            dVar.n(serialDescriptor, 0, amazonDelinkResponsePayload.f19336a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmazonDelinkResponsePayload) && p.e(this.f19336a, ((AmazonDelinkResponsePayload) obj).f19336a);
        }

        public int hashCode() {
            return this.f19336a.hashCode();
        }

        public String toString() {
            return "AmazonDelinkResponsePayload(status=" + this.f19336a + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AmazonDelinkResponsePayload(String str) {
            super((i) null);
            p.j(str, "status");
            this.f19336a = str;
        }
    }

    private AmazonDelinkPlugin() {
    }

    public /* synthetic */ AmazonDelinkPlugin(i iVar) {
        this();
    }
}
