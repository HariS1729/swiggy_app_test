package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.screencapturing;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: StartStopScreenCapturing.kt */
public final class StartStopScreenCapturing extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19467a;

    /* compiled from: StartStopScreenCapturing.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<StartStopScreenCapturing> serializer() {
            return StartStopScreenCapturing$$serializer.INSTANCE;
        }
    }

    public StartStopScreenCapturing() {
        this(false, 1, (i) null);
    }

    public /* synthetic */ StartStopScreenCapturing(int i11, boolean z11, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) == 0) {
            this.f19467a = false;
        } else {
            this.f19467a = z11;
        }
    }

    public static final void c(StartStopScreenCapturing startStopScreenCapturing, d dVar, SerialDescriptor serialDescriptor) {
        p.j(startStopScreenCapturing, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && !startStopScreenCapturing.f19467a) {
            z11 = false;
        }
        if (z11) {
            dVar.m(serialDescriptor, 0, startStopScreenCapturing.f19467a);
        }
    }

    public final boolean b() {
        return this.f19467a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StartStopScreenCapturing(boolean z11, int i11, i iVar) {
        this((i11 & 1) != 0 ? false : z11);
    }

    public StartStopScreenCapturing(boolean z11) {
        this.f19467a = z11;
    }
}
