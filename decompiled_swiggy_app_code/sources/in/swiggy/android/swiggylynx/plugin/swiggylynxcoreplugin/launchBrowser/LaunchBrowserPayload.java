package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.launchBrowser;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: LaunchBrowserPayload.kt */
public final class LaunchBrowserPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19447a;

    /* compiled from: LaunchBrowserPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<LaunchBrowserPayload> serializer() {
            return LaunchBrowserPayload$$serializer.INSTANCE;
        }
    }

    public LaunchBrowserPayload() {
        this((String) null, 1, (i) null);
    }

    public /* synthetic */ LaunchBrowserPayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) == 0) {
            this.f19447a = null;
        } else {
            this.f19447a = str;
        }
    }

    public static final void c(LaunchBrowserPayload launchBrowserPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(launchBrowserPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && launchBrowserPayload.f19447a == null) {
            z11 = false;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, a1.f23069b, launchBrowserPayload.f19447a);
        }
    }

    public final String b() {
        return this.f19447a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LaunchBrowserPayload) && p.e(this.f19447a, ((LaunchBrowserPayload) obj).f19447a);
    }

    public int hashCode() {
        String str = this.f19447a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "LaunchBrowserPayload(url=" + this.f19447a + ')';
    }

    public LaunchBrowserPayload(String str) {
        this.f19447a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LaunchBrowserPayload(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str);
    }
}
