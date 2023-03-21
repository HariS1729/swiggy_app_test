package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: OpenShareSheetPayload.kt */
public final class OpenShareSheetPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19380a;

    /* compiled from: OpenShareSheetPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<OpenShareSheetPayload> serializer() {
            return OpenShareSheetPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OpenShareSheetPayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19380a = str;
            return;
        }
        throw new MissingFieldException("text");
    }

    public static final void c(OpenShareSheetPayload openShareSheetPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(openShareSheetPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, openShareSheetPayload.f19380a);
    }

    public final String b() {
        return this.f19380a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenShareSheetPayload) && p.e(this.f19380a, ((OpenShareSheetPayload) obj).f19380a);
    }

    public int hashCode() {
        return this.f19380a.hashCode();
    }

    public String toString() {
        return "OpenShareSheetPayload(text=" + this.f19380a + ')';
    }
}
