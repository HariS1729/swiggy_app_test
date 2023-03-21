package in.swiggy.android.swiggylynx.plugin.dash.instamart;

import fq0.d;
import gq0.x0;
import in.swiggy.android.tejas.feature.instamart.model.GetIMCartResponse;
import in.swiggy.android.tejas.feature.instamart.model.GetIMCartResponse$$serializer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: InstamartUpdateLocalCartPayload.kt */
public final class InstamartUpdateLocalCartPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final GetIMCartResponse f19118a;

    /* compiled from: InstamartUpdateLocalCartPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartUpdateLocalCartPayload> serializer() {
            return InstamartUpdateLocalCartPayload$$serializer.INSTANCE;
        }
    }

    public InstamartUpdateLocalCartPayload() {
        this((GetIMCartResponse) null, 1, (i) null);
    }

    public /* synthetic */ InstamartUpdateLocalCartPayload(int i11, GetIMCartResponse getIMCartResponse, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) == 0) {
            this.f19118a = null;
        } else {
            this.f19118a = getIMCartResponse;
        }
    }

    public static final void c(InstamartUpdateLocalCartPayload instamartUpdateLocalCartPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartUpdateLocalCartPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && instamartUpdateLocalCartPayload.f19118a == null) {
            z11 = false;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, GetIMCartResponse$$serializer.INSTANCE, instamartUpdateLocalCartPayload.f19118a);
        }
    }

    public final GetIMCartResponse b() {
        return this.f19118a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstamartUpdateLocalCartPayload) && p.e(this.f19118a, ((InstamartUpdateLocalCartPayload) obj).f19118a);
    }

    public int hashCode() {
        GetIMCartResponse getIMCartResponse = this.f19118a;
        if (getIMCartResponse == null) {
            return 0;
        }
        return getIMCartResponse.hashCode();
    }

    public String toString() {
        return "InstamartUpdateLocalCartPayload(data=" + this.f19118a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstamartUpdateLocalCartPayload(GetIMCartResponse getIMCartResponse, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : getIMCartResponse);
    }

    public InstamartUpdateLocalCartPayload(GetIMCartResponse getIMCartResponse) {
        this.f19118a = getIMCartResponse;
    }
}
