package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen;

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

/* compiled from: NavigateToScreenRequestPayload.kt */
public final class NavigateToScreenRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19449a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19450b;

    /* renamed from: c  reason: collision with root package name */
    private final JsonElement f19451c;

    /* compiled from: NavigateToScreenRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<NavigateToScreenRequestPayload> serializer() {
            return NavigateToScreenRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NavigateToScreenRequestPayload(int i11, String str, String str2, JsonElement jsonElement, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19449a = str;
            if ((i11 & 2) != 0) {
                this.f19450b = str2;
                if ((i11 & 4) == 0) {
                    this.f19451c = new JsonObject(new HashMap());
                } else {
                    this.f19451c = jsonElement;
                }
            } else {
                throw new MissingFieldException("link");
            }
        } else {
            throw new MissingFieldException("type");
        }
    }

    public static final void e(NavigateToScreenRequestPayload navigateToScreenRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(navigateToScreenRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.n(serialDescriptor, 0, navigateToScreenRequestPayload.f19449a);
        dVar.n(serialDescriptor, 1, navigateToScreenRequestPayload.f19450b);
        if (dVar.o(serialDescriptor, 2) || !p.e(navigateToScreenRequestPayload.f19451c, new JsonObject(new HashMap()))) {
            z11 = true;
        }
        if (z11) {
            dVar.v(serialDescriptor, 2, JsonElementSerializer.f26449b, navigateToScreenRequestPayload.f19451c);
        }
    }

    public final String b() {
        return this.f19450b;
    }

    public final JsonElement c() {
        return this.f19451c;
    }

    public final String d() {
        return this.f19449a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigateToScreenRequestPayload)) {
            return false;
        }
        NavigateToScreenRequestPayload navigateToScreenRequestPayload = (NavigateToScreenRequestPayload) obj;
        return p.e(this.f19449a, navigateToScreenRequestPayload.f19449a) && p.e(this.f19450b, navigateToScreenRequestPayload.f19450b) && p.e(this.f19451c, navigateToScreenRequestPayload.f19451c);
    }

    public int hashCode() {
        return (((this.f19449a.hashCode() * 31) + this.f19450b.hashCode()) * 31) + this.f19451c.hashCode();
    }

    public String toString() {
        return "NavigateToScreenRequestPayload(type=" + this.f19449a + ", link=" + this.f19450b + ", params=" + this.f19451c + ')';
    }
}
