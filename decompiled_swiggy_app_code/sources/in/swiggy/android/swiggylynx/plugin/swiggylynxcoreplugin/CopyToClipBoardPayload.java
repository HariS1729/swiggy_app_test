package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: CopyToClipBoardPayload.kt */
public final class CopyToClipBoardPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19378a;

    /* compiled from: CopyToClipBoardPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CopyToClipBoardPayload> serializer() {
            return CopyToClipBoardPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CopyToClipBoardPayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19378a = str;
            return;
        }
        throw new MissingFieldException("text");
    }

    public static final void c(CopyToClipBoardPayload copyToClipBoardPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(copyToClipBoardPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, copyToClipBoardPayload.f19378a);
    }

    public final String b() {
        return this.f19378a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CopyToClipBoardPayload) && p.e(this.f19378a, ((CopyToClipBoardPayload) obj).f19378a);
    }

    public int hashCode() {
        return this.f19378a.hashCode();
    }

    public String toString() {
        return "CopyToClipBoardPayload(text=" + this.f19378a + ')';
    }
}
