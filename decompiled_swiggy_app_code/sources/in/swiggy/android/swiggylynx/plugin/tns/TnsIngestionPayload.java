package in.swiggy.android.swiggylynx.plugin.tns;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: TnsInjestionPayload.kt */
public final class TnsIngestionPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19509a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19510b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19511c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19512d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19513e;

    /* compiled from: TnsInjestionPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<TnsIngestionPayload> serializer() {
            return TnsIngestionPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TnsIngestionPayload(int i11, String str, String str2, String str3, String str4, String str5, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19509a = str;
            if ((i11 & 2) != 0) {
                this.f19510b = str2;
                if ((i11 & 4) != 0) {
                    this.f19511c = str3;
                    if ((i11 & 8) != 0) {
                        this.f19512d = str4;
                        if ((i11 & 16) != 0) {
                            this.f19513e = str5;
                            return;
                        }
                        throw new MissingFieldException("ipAddress");
                    }
                    throw new MissingFieldException("location");
                }
                throw new MissingFieldException("currentAppVersion");
            }
            throw new MissingFieldException("isDxAppInstalled");
        }
        throw new MissingFieldException("googlePlayIntegrity");
    }

    public static final void b(TnsIngestionPayload tnsIngestionPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(tnsIngestionPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        a1 a1Var = a1.f23069b;
        dVar.E(serialDescriptor, 0, a1Var, tnsIngestionPayload.f19509a);
        dVar.E(serialDescriptor, 1, a1Var, tnsIngestionPayload.f19510b);
        dVar.E(serialDescriptor, 2, a1Var, tnsIngestionPayload.f19511c);
        dVar.E(serialDescriptor, 3, a1Var, tnsIngestionPayload.f19512d);
        dVar.E(serialDescriptor, 4, a1Var, tnsIngestionPayload.f19513e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TnsIngestionPayload)) {
            return false;
        }
        TnsIngestionPayload tnsIngestionPayload = (TnsIngestionPayload) obj;
        return p.e(this.f19509a, tnsIngestionPayload.f19509a) && p.e(this.f19510b, tnsIngestionPayload.f19510b) && p.e(this.f19511c, tnsIngestionPayload.f19511c) && p.e(this.f19512d, tnsIngestionPayload.f19512d) && p.e(this.f19513e, tnsIngestionPayload.f19513e);
    }

    public int hashCode() {
        String str = this.f19509a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19510b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19511c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19512d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f19513e;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        return hashCode4 + i11;
    }

    public String toString() {
        return "TnsIngestionPayload(googlePlayIntegrity=" + this.f19509a + ", isDxAppInstalled=" + this.f19510b + ", currentAppVersion=" + this.f19511c + ", location=" + this.f19512d + ", ipAddress=" + this.f19513e + ')';
    }

    public TnsIngestionPayload(String str, String str2, String str3, String str4, String str5) {
        this.f19509a = str;
        this.f19510b = str2;
        this.f19511c = str3;
        this.f19512d = str4;
        this.f19513e = str5;
    }
}
