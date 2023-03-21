package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.sendClevertapEvent;

import fq0.d;
import gq0.a1;
import gq0.x0;
import hq0.o;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import lp.b;

/* compiled from: SendClevertapEventRequestPayload.kt */
public final class SendClevertapEventRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19468a;

    /* renamed from: b  reason: collision with root package name */
    private final JsonObject f19469b;

    /* compiled from: SendClevertapEventRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<SendClevertapEventRequestPayload> serializer() {
            return SendClevertapEventRequestPayload$$serializer.INSTANCE;
        }
    }

    public SendClevertapEventRequestPayload() {
        this((String) null, (JsonObject) null, 3, (i) null);
    }

    public /* synthetic */ SendClevertapEventRequestPayload(int i11, String str, JsonObject jsonObject, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) == 0) {
            this.f19468a = null;
        } else {
            this.f19468a = str;
        }
        if ((i11 & 2) == 0) {
            this.f19469b = null;
        } else {
            this.f19469b = jsonObject;
        }
    }

    public static final void d(SendClevertapEventRequestPayload sendClevertapEventRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(sendClevertapEventRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || sendClevertapEventRequestPayload.f19468a != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, sendClevertapEventRequestPayload.f19468a);
        }
        if (dVar.o(serialDescriptor, 1) || sendClevertapEventRequestPayload.f19469b != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, o.f23170b, sendClevertapEventRequestPayload.f19469b);
        }
    }

    public final String b() {
        return this.f19468a;
    }

    public final JsonObject c() {
        return this.f19469b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SendClevertapEventRequestPayload(String str, JsonObject jsonObject, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : jsonObject);
    }

    public SendClevertapEventRequestPayload(String str, JsonObject jsonObject) {
        this.f19468a = str;
        this.f19469b = jsonObject;
    }
}
