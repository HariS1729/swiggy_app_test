package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.vibrate;

import bs.a;
import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: VibratePayload.kt */
public final class VibratePayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19503a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19504b;

    /* compiled from: VibratePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<VibratePayload> serializer() {
            return VibratePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VibratePayload(int i11, String str, long j, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19503a = str;
            if ((i11 & 2) != 0) {
                this.f19504b = j;
                return;
            }
            throw new MissingFieldException("duration");
        }
        throw new MissingFieldException("amplitude");
    }

    public static final void d(VibratePayload vibratePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(vibratePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, vibratePayload.f19503a);
        dVar.r(serialDescriptor, 1, vibratePayload.f19504b);
    }

    public final String b() {
        return this.f19503a;
    }

    public final long c() {
        return this.f19504b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibratePayload)) {
            return false;
        }
        VibratePayload vibratePayload = (VibratePayload) obj;
        return p.e(this.f19503a, vibratePayload.f19503a) && this.f19504b == vibratePayload.f19504b;
    }

    public int hashCode() {
        return (this.f19503a.hashCode() * 31) + a.a(this.f19504b);
    }

    public String toString() {
        return "VibratePayload(amplitude=" + this.f19503a + ", duration=" + this.f19504b + ')';
    }
}
