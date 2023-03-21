package in.swiggy.android.swiggylynx.plugin.tns;

import fq0.d;
import gq0.a1;
import gq0.w;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: ApiIntegrityError.kt */
public final class ApiIntegrityError {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Integer f19505a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19506b;

    /* compiled from: ApiIntegrityError.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<ApiIntegrityError> serializer() {
            return ApiIntegrityError$$serializer.INSTANCE;
        }
    }

    public ApiIntegrityError() {
        this((Integer) null, (String) null, 3, (i) null);
    }

    public /* synthetic */ ApiIntegrityError(int i11, Integer num, String str, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19505a = null;
        } else {
            this.f19505a = num;
        }
        if ((i11 & 2) == 0) {
            this.f19506b = null;
        } else {
            this.f19506b = str;
        }
    }

    public static final void a(ApiIntegrityError apiIntegrityError, d dVar, SerialDescriptor serialDescriptor) {
        p.j(apiIntegrityError, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || apiIntegrityError.f19505a != null) {
            dVar.E(serialDescriptor, 0, w.f23130b, apiIntegrityError.f19505a);
        }
        if (dVar.o(serialDescriptor, 1) || apiIntegrityError.f19506b != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, a1.f23069b, apiIntegrityError.f19506b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiIntegrityError)) {
            return false;
        }
        ApiIntegrityError apiIntegrityError = (ApiIntegrityError) obj;
        return p.e(this.f19505a, apiIntegrityError.f19505a) && p.e(this.f19506b, apiIntegrityError.f19506b);
    }

    public int hashCode() {
        Integer num = this.f19505a;
        int i11 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f19506b;
        if (str != null) {
            i11 = str.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "ApiIntegrityError(errorCode=" + this.f19505a + ", errorMessage=" + this.f19506b + ')';
    }

    public ApiIntegrityError(Integer num, String str) {
        this.f19505a = num;
        this.f19506b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApiIntegrityError(Integer num, String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str);
    }
}
