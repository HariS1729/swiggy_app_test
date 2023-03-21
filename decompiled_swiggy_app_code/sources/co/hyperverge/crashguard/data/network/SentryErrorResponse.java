package co.hyperverge.crashguard.data.network;

import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.x0;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* compiled from: SentryResponse.kt */
public final class SentryErrorResponse {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f13117a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f13118b;

    /* compiled from: SentryResponse.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<SentryErrorResponse> serializer() {
            return SentryErrorResponse$$serializer.INSTANCE;
        }
    }

    public SentryErrorResponse() {
        this((String) null, (List) null, 3, (i) null);
    }

    public /* synthetic */ SentryErrorResponse(int i11, String str, List list, x0 x0Var) {
        if ((i11 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i11, 0, SentryErrorResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.f13117a = null;
        } else {
            this.f13117a = str;
        }
        if ((i11 & 2) == 0) {
            this.f13118b = null;
        } else {
            this.f13118b = list;
        }
    }

    public static final void a(SentryErrorResponse sentryErrorResponse, d dVar, SerialDescriptor serialDescriptor) {
        p.j(sentryErrorResponse, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || sentryErrorResponse.f13117a != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, sentryErrorResponse.f13117a);
        }
        if (dVar.o(serialDescriptor, 1) || sentryErrorResponse.f13118b != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, new f(a1.f23069b), sentryErrorResponse.f13118b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SentryErrorResponse)) {
            return false;
        }
        SentryErrorResponse sentryErrorResponse = (SentryErrorResponse) obj;
        return p.e(this.f13117a, sentryErrorResponse.f13117a) && p.e(this.f13118b, sentryErrorResponse.f13118b);
    }

    public int hashCode() {
        String str = this.f13117a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.f13118b;
        if (list != null) {
            i11 = list.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "SentryErrorResponse(detail=" + this.f13117a + ", causes=" + this.f13118b + ')';
    }

    public SentryErrorResponse(String str, List<String> list) {
        this.f13117a = str;
        this.f13118b = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SentryErrorResponse(String str, List list, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list);
    }
}
