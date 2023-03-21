package in.swiggy.android.swiggylynx.plugin.dash.payment;

import fq0.d;
import gq0.x0;
import hq0.o;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import lp.b;

/* compiled from: DashPaymentPayload.kt */
public final class DashPaymentPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19120a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19121b;

    /* renamed from: c  reason: collision with root package name */
    private final JsonObject f19122c;

    /* compiled from: DashPaymentPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<DashPaymentPayload> serializer() {
            return DashPaymentPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DashPaymentPayload(int i11, String str, String str2, JsonObject jsonObject, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19120a = str;
            if ((i11 & 2) != 0) {
                this.f19121b = str2;
                if ((i11 & 4) != 0) {
                    this.f19122c = jsonObject;
                    return;
                }
                throw new MissingFieldException("dashCallouts");
            }
            throw new MissingFieldException("serviceLine");
        }
        throw new MissingFieldException("link");
    }

    public static final void e(DashPaymentPayload dashPaymentPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(dashPaymentPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, dashPaymentPayload.f19120a);
        dVar.n(serialDescriptor, 1, dashPaymentPayload.f19121b);
        dVar.v(serialDescriptor, 2, o.f23170b, dashPaymentPayload.f19122c);
    }

    public final JsonObject b() {
        return this.f19122c;
    }

    public final String c() {
        return this.f19120a;
    }

    public final String d() {
        return this.f19121b;
    }
}
