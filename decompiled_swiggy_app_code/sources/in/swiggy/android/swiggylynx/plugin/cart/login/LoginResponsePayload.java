package in.swiggy.android.swiggylynx.plugin.cart.login;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: LoginResponsePayload.kt */
public final class LoginResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private boolean f19046a;

    /* compiled from: LoginResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<LoginResponsePayload> serializer() {
            return LoginResponsePayload$$serializer.INSTANCE;
        }
    }

    public LoginResponsePayload() {
        this(false, 1, (i) null);
    }

    public /* synthetic */ LoginResponsePayload(int i11, boolean z11, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19046a = false;
        } else {
            this.f19046a = z11;
        }
    }

    public static final void a(LoginResponsePayload loginResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(loginResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && !loginResponsePayload.f19046a) {
            z11 = false;
        }
        if (z11) {
            dVar.m(serialDescriptor, 0, loginResponsePayload.f19046a);
        }
    }

    public LoginResponsePayload(boolean z11) {
        this.f19046a = z11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoginResponsePayload(boolean z11, int i11, i iVar) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
