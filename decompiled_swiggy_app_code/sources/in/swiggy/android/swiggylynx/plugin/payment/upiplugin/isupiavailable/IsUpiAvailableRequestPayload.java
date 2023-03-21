package in.swiggy.android.swiggylynx.plugin.payment.upiplugin.isupiavailable;

import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.x0;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: IsUpiAvailableRequestPayload.kt */
public final class IsUpiAvailableRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<String> f19327a;

    /* compiled from: IsUpiAvailableRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<IsUpiAvailableRequestPayload> serializer() {
            return IsUpiAvailableRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IsUpiAvailableRequestPayload(int i11, ArrayList arrayList, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19327a = arrayList;
            return;
        }
        throw new MissingFieldException("methods");
    }

    public static final void c(IsUpiAvailableRequestPayload isUpiAvailableRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(isUpiAvailableRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, new f(a1.f23069b), isUpiAvailableRequestPayload.f19327a);
    }

    public final ArrayList<String> b() {
        return this.f19327a;
    }
}
