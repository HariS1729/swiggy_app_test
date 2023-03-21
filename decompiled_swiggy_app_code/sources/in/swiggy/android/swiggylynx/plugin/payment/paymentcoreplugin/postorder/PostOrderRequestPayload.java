package in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.postorder;

import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.x0;
import hq0.o;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import lp.b;

/* compiled from: PostOrderRequestPayload.kt */
public final class PostOrderRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final JsonObject f19307a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19308b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f19309c;

    /* compiled from: PostOrderRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<PostOrderRequestPayload> serializer() {
            return PostOrderRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PostOrderRequestPayload(int i11, JsonObject jsonObject, String str, Boolean bool, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19307a = jsonObject;
            if ((i11 & 2) == 0) {
                this.f19308b = null;
            } else {
                this.f19308b = str;
            }
            if ((i11 & 4) == 0) {
                this.f19309c = null;
            } else {
                this.f19309c = bool;
            }
        } else {
            throw new MissingFieldException("orderData");
        }
    }

    public static final void e(PostOrderRequestPayload postOrderRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(postOrderRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.v(serialDescriptor, 0, o.f23170b, postOrderRequestPayload.f19307a);
        if (dVar.o(serialDescriptor, 1) || postOrderRequestPayload.f19308b != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, postOrderRequestPayload.f19308b);
        }
        if (dVar.o(serialDescriptor, 2) || postOrderRequestPayload.f19309c != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 2, h.f23089b, postOrderRequestPayload.f19309c);
        }
    }

    public final String b() {
        return this.f19308b;
    }

    public final Boolean c() {
        return this.f19309c;
    }

    public final JsonObject d() {
        return this.f19307a;
    }
}
