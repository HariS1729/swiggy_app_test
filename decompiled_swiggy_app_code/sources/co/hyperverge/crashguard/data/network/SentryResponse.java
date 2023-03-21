package co.hyperverge.crashguard.data.network;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* compiled from: SentryResponse.kt */
public final class SentryResponse {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f13119a;

    /* compiled from: SentryResponse.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<SentryResponse> serializer() {
            return SentryResponse$$serializer.INSTANCE;
        }
    }

    public SentryResponse() {
        this((String) null, 1, (i) null);
    }

    public /* synthetic */ SentryResponse(int i11, String str, x0 x0Var) {
        if ((i11 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i11, 0, SentryResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.f13119a = null;
        } else {
            this.f13119a = str;
        }
    }

    public static final void a(SentryResponse sentryResponse, d dVar, SerialDescriptor serialDescriptor) {
        p.j(sentryResponse, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && sentryResponse.f13119a == null) {
            z11 = false;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, a1.f23069b, sentryResponse.f13119a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SentryResponse) && p.e(this.f13119a, ((SentryResponse) obj).f13119a);
    }

    public int hashCode() {
        String str = this.f13119a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "SentryResponse(id=" + this.f13119a + ')';
    }

    public SentryResponse(String str) {
        this.f13119a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SentryResponse(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str);
    }
}
