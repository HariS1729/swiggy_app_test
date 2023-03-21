package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: IsLocationEnabledPayload.kt */
public final class IsLocationEnabledPayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19379a;

    /* compiled from: IsLocationEnabledPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<IsLocationEnabledPayload> serializer() {
            return IsLocationEnabledPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IsLocationEnabledPayload(int i11, boolean z11, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19379a = z11;
            return;
        }
        throw new MissingFieldException("enabled");
    }

    public static final void a(IsLocationEnabledPayload isLocationEnabledPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(isLocationEnabledPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.m(serialDescriptor, 0, isLocationEnabledPayload.f19379a);
    }

    public IsLocationEnabledPayload(boolean z11) {
        this.f19379a = z11;
    }
}
