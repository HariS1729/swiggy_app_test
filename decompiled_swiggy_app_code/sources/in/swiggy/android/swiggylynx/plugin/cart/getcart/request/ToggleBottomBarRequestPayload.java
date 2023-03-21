package in.swiggy.android.swiggylynx.plugin.cart.getcart.request;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: ToggleBottomBarRequestPayload.kt */
public final class ToggleBottomBarRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19026a;

    /* compiled from: ToggleBottomBarRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<ToggleBottomBarRequestPayload> serializer() {
            return ToggleBottomBarRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ToggleBottomBarRequestPayload(int i11, boolean z11, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19026a = z11;
            return;
        }
        throw new MissingFieldException("show");
    }

    public static final void b(ToggleBottomBarRequestPayload toggleBottomBarRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(toggleBottomBarRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.m(serialDescriptor, 0, toggleBottomBarRequestPayload.f19026a);
    }
}
