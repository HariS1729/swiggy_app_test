package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.login;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: LoginRequestPayload.kt */
public final class LoginRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19448a;

    /* compiled from: LoginRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<LoginRequestPayload> serializer() {
            return LoginRequestPayload$$serializer.INSTANCE;
        }
    }

    public LoginRequestPayload() {
        this((String) null, 1, (i) null);
    }

    public /* synthetic */ LoginRequestPayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) == 0) {
            this.f19448a = null;
        } else {
            this.f19448a = str;
        }
    }

    public static final void c(LoginRequestPayload loginRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(loginRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && loginRequestPayload.f19448a == null) {
            z11 = false;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, a1.f23069b, loginRequestPayload.f19448a);
        }
    }

    public final String b() {
        return this.f19448a;
    }

    public LoginRequestPayload(String str) {
        this.f19448a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoginRequestPayload(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str);
    }
}
