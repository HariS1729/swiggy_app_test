package in.swiggy.android.swiggylynx.plugin.cart.superV2;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: OpenSuperV2RequestPayload.kt */
public final class OpenSuperV2RequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19047a;

    /* compiled from: OpenSuperV2RequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<OpenSuperV2RequestPayload> serializer() {
            return OpenSuperV2RequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OpenSuperV2RequestPayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19047a = str;
            return;
        }
        throw new MissingFieldException("link");
    }

    public static final void c(OpenSuperV2RequestPayload openSuperV2RequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(openSuperV2RequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, openSuperV2RequestPayload.f19047a);
    }

    public final String b() {
        return this.f19047a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenSuperV2RequestPayload) && p.e(this.f19047a, ((OpenSuperV2RequestPayload) obj).f19047a);
    }

    public int hashCode() {
        return this.f19047a.hashCode();
    }

    public String toString() {
        return "OpenSuperV2RequestPayload(link=" + this.f19047a + ')';
    }
}
