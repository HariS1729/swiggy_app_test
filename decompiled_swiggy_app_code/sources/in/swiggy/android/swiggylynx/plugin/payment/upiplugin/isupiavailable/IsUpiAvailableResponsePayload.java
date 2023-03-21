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

/* compiled from: IsUpiAvailableResponsePayload.kt */
public final class IsUpiAvailableResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<String> f19328a;

    /* compiled from: IsUpiAvailableResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<IsUpiAvailableResponsePayload> serializer() {
            return IsUpiAvailableResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IsUpiAvailableResponsePayload(int i11, ArrayList arrayList, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19328a = arrayList;
            return;
        }
        throw new MissingFieldException("methods");
    }

    public static final void a(IsUpiAvailableResponsePayload isUpiAvailableResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(isUpiAvailableResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, new f(a1.f23069b), isUpiAvailableResponsePayload.f19328a);
    }

    public IsUpiAvailableResponsePayload(ArrayList<String> arrayList) {
        p.j(arrayList, "methods");
        this.f19328a = arrayList;
    }
}
