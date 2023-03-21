package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.giftingpersonalizedmessage;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: UserFlowInfoRequestPayload.kt */
public final class UserFlowInfoRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19441a;

    /* renamed from: b  reason: collision with root package name */
    private final FlowData f19442b;

    /* compiled from: UserFlowInfoRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<UserFlowInfoRequestPayload> serializer() {
            return UserFlowInfoRequestPayload$$serializer.INSTANCE;
        }
    }

    /* compiled from: UserFlowInfoRequestPayload.kt */
    public static final class FlowData {
        public static final Companion Companion = new Companion((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f19443a;

        /* renamed from: b  reason: collision with root package name */
        private final String f19444b;

        /* renamed from: c  reason: collision with root package name */
        private final String f19445c;

        /* renamed from: d  reason: collision with root package name */
        private final String f19446d;

        /* compiled from: UserFlowInfoRequestPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final KSerializer<FlowData> serializer() {
                return UserFlowInfoRequestPayload$FlowData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ FlowData(int i11, String str, String str2, String str3, String str4, x0 x0Var) {
            if ((i11 & 1) != 0) {
                this.f19443a = str;
                if ((i11 & 2) != 0) {
                    this.f19444b = str2;
                    if ((i11 & 4) != 0) {
                        this.f19445c = str3;
                        if ((i11 & 8) != 0) {
                            this.f19446d = str4;
                            return;
                        }
                        throw new MissingFieldException("expiredTs");
                    }
                    throw new MissingFieldException("createdTs");
                }
                throw new MissingFieldException("recipientName");
            }
            throw new MissingFieldException("messageId");
        }

        public static final void e(FlowData flowData, d dVar, SerialDescriptor serialDescriptor) {
            p.j(flowData, "self");
            p.j(dVar, "output");
            p.j(serialDescriptor, "serialDesc");
            dVar.n(serialDescriptor, 0, flowData.f19443a);
            dVar.n(serialDescriptor, 1, flowData.f19444b);
            dVar.n(serialDescriptor, 2, flowData.f19445c);
            dVar.n(serialDescriptor, 3, flowData.f19446d);
        }

        public final String a() {
            return this.f19445c;
        }

        public final String b() {
            return this.f19446d;
        }

        public final String c() {
            return this.f19443a;
        }

        public final String d() {
            return this.f19444b;
        }
    }

    public /* synthetic */ UserFlowInfoRequestPayload(int i11, String str, FlowData flowData, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19441a = str;
            if ((i11 & 2) != 0) {
                this.f19442b = flowData;
                return;
            }
            throw new MissingFieldException("flowData");
        }
        throw new MissingFieldException("flowType");
    }

    public static final void d(UserFlowInfoRequestPayload userFlowInfoRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(userFlowInfoRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, userFlowInfoRequestPayload.f19441a);
        dVar.v(serialDescriptor, 1, UserFlowInfoRequestPayload$FlowData$$serializer.INSTANCE, userFlowInfoRequestPayload.f19442b);
    }

    public final String b() {
        return this.f19441a;
    }

    public final FlowData c() {
        return this.f19442b;
    }
}
