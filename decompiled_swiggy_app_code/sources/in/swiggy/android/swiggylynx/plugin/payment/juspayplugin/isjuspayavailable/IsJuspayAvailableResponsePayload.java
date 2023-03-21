package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.isjuspayavailable;

import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.x0;
import gq0.z;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: IsJuspayAvailableResponsePayload.kt */
public final class IsJuspayAvailableResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19193a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Boolean> f19194b;

    /* compiled from: IsJuspayAvailableResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<IsJuspayAvailableResponsePayload> serializer() {
            return IsJuspayAvailableResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IsJuspayAvailableResponsePayload(int i11, boolean z11, Map map, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19193a = z11;
            if ((i11 & 2) != 0) {
                this.f19194b = map;
                return;
            }
            throw new MissingFieldException("featuresAvailability");
        }
        throw new MissingFieldException("isAvailable");
    }

    public static final void a(IsJuspayAvailableResponsePayload isJuspayAvailableResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(isJuspayAvailableResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.m(serialDescriptor, 0, isJuspayAvailableResponsePayload.f19193a);
        dVar.v(serialDescriptor, 1, new z(a1.f23069b, h.f23089b), isJuspayAvailableResponsePayload.f19194b);
    }

    public IsJuspayAvailableResponsePayload(boolean z11, Map<String, Boolean> map) {
        p.j(map, "featuresAvailability");
        this.f19193a = z11;
        this.f19194b = map;
    }
}
