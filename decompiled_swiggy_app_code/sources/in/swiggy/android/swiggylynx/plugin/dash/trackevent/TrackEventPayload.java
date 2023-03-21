package in.swiggy.android.swiggylynx.plugin.dash.trackevent;

import fq0.d;
import gq0.x0;
import java.util.HashMap;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;
import lp.b;

/* compiled from: TrackEventPayload.kt */
public final class TrackEventPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19125a;

    /* renamed from: b  reason: collision with root package name */
    private final JsonElement f19126b;

    /* compiled from: TrackEventPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<TrackEventPayload> serializer() {
            return TrackEventPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackEventPayload(int i11, String str, JsonElement jsonElement, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19125a = str;
            if ((i11 & 2) == 0) {
                this.f19126b = new JsonObject(new HashMap());
            } else {
                this.f19126b = jsonElement;
            }
        } else {
            throw new MissingFieldException("eventName");
        }
    }

    public static final void d(TrackEventPayload trackEventPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(trackEventPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.n(serialDescriptor, 0, trackEventPayload.f19125a);
        if (dVar.o(serialDescriptor, 1) || !p.e(trackEventPayload.f19126b, new JsonObject(new HashMap()))) {
            z11 = true;
        }
        if (z11) {
            dVar.v(serialDescriptor, 1, JsonElementSerializer.f26449b, trackEventPayload.f19126b);
        }
    }

    public final String b() {
        return this.f19125a;
    }

    public final JsonElement c() {
        return this.f19126b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackEventPayload)) {
            return false;
        }
        TrackEventPayload trackEventPayload = (TrackEventPayload) obj;
        return p.e(this.f19125a, trackEventPayload.f19125a) && p.e(this.f19126b, trackEventPayload.f19126b);
    }

    public int hashCode() {
        return (this.f19125a.hashCode() * 31) + this.f19126b.hashCode();
    }

    public String toString() {
        return "TrackEventPayload(eventName=" + this.f19125a + ", eventParams=" + this.f19126b + ')';
    }
}
