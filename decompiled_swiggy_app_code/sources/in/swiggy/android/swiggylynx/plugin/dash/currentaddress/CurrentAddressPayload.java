package in.swiggy.android.swiggylynx.plugin.dash.currentaddress;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CurrentAddressPayload.kt */
public final class CurrentAddressPayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19108a;

    /* compiled from: CurrentAddressPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CurrentAddressPayload> serializer() {
            return CurrentAddressPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CurrentAddressPayload(int i11, String str, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19108a = str;
            return;
        }
        throw new MissingFieldException("currentAddress");
    }

    public static final void a(CurrentAddressPayload currentAddressPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(currentAddressPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, currentAddressPayload.f19108a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CurrentAddressPayload) && p.e(this.f19108a, ((CurrentAddressPayload) obj).f19108a);
    }

    public int hashCode() {
        return this.f19108a.hashCode();
    }

    public String toString() {
        return "CurrentAddressPayload(currentAddress=" + this.f19108a + ')';
    }

    public CurrentAddressPayload(String str) {
        p.j(str, "currentAddress");
        this.f19108a = str;
    }
}
