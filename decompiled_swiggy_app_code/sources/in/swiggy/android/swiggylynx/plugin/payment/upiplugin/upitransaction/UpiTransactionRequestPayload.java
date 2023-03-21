package in.swiggy.android.swiggylynx.plugin.payment.upiplugin.upitransaction;

import com.newrelic.agent.android.agentdata.HexAttribute;
import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: UpiTransactionRequestPayload.kt */
public final class UpiTransactionRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Params f19329a;

    /* compiled from: UpiTransactionRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<UpiTransactionRequestPayload> serializer() {
            return UpiTransactionRequestPayload$$serializer.INSTANCE;
        }
    }

    /* compiled from: UpiTransactionRequestPayload.kt */
    public static final class Params {
        public static final Companion Companion = new Companion((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f19330a;

        /* renamed from: b  reason: collision with root package name */
        private final String f19331b;

        /* renamed from: c  reason: collision with root package name */
        private final String f19332c;

        /* renamed from: d  reason: collision with root package name */
        private final String f19333d;

        /* compiled from: UpiTransactionRequestPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final KSerializer<Params> serializer() {
                return UpiTransactionRequestPayload$Params$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Params(int i11, String str, String str2, String str3, String str4, x0 x0Var) {
            if ((i11 & 1) != 0) {
                this.f19330a = str;
                if ((i11 & 2) != 0) {
                    this.f19331b = str2;
                    if ((i11 & 4) != 0) {
                        this.f19332c = str3;
                        if ((i11 & 8) != 0) {
                            this.f19333d = str4;
                            return;
                        }
                        throw new MissingFieldException(HexAttribute.HEX_ATTR_METHOD_NAME);
                    }
                    throw new MissingFieldException("url");
                }
                throw new MissingFieldException("orderAmount");
            }
            throw new MissingFieldException("orderId");
        }

        public static final void d(Params params, d dVar, SerialDescriptor serialDescriptor) {
            p.j(params, "self");
            p.j(dVar, "output");
            p.j(serialDescriptor, "serialDesc");
            dVar.n(serialDescriptor, 0, params.f19330a);
            dVar.n(serialDescriptor, 1, params.f19331b);
            dVar.n(serialDescriptor, 2, params.f19332c);
            dVar.n(serialDescriptor, 3, params.f19333d);
        }

        public final String a() {
            return this.f19333d;
        }

        public final String b() {
            return this.f19330a;
        }

        public final String c() {
            return this.f19332c;
        }
    }

    public /* synthetic */ UpiTransactionRequestPayload(int i11, Params params, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19329a = params;
            return;
        }
        throw new MissingFieldException("upiParams");
    }

    public static final void c(UpiTransactionRequestPayload upiTransactionRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(upiTransactionRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, UpiTransactionRequestPayload$Params$$serializer.INSTANCE, upiTransactionRequestPayload.f19329a);
    }

    public final Params b() {
        return this.f19329a;
    }
}
