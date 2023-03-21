package in.swiggy.android.swiggylynx.plugin.restempathy;

import android.os.Parcel;
import android.os.Parcelable;
import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: RestEmpathyResponsePayload.kt */
public final class RestEmpathySharePayload implements Parcelable {
    public static final Parcelable.Creator<RestEmpathySharePayload> CREATOR = new a();
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19372a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19373b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19374c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19375d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19376e;

    /* compiled from: RestEmpathyResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<RestEmpathySharePayload> serializer() {
            return RestEmpathySharePayload$$serializer.INSTANCE;
        }
    }

    /* compiled from: RestEmpathyResponsePayload.kt */
    public static final class a implements Parcelable.Creator<RestEmpathySharePayload> {
        /* renamed from: a */
        public final RestEmpathySharePayload createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new RestEmpathySharePayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final RestEmpathySharePayload[] newArray(int i11) {
            return new RestEmpathySharePayload[i11];
        }
    }

    public /* synthetic */ RestEmpathySharePayload(int i11, String str, String str2, String str3, String str4, String str5, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19372a = str;
            if ((i11 & 2) != 0) {
                this.f19373b = str2;
                if ((i11 & 4) == 0) {
                    this.f19374c = null;
                } else {
                    this.f19374c = str3;
                }
                if ((i11 & 8) == 0) {
                    this.f19375d = null;
                } else {
                    this.f19375d = str4;
                }
                if ((i11 & 16) == 0) {
                    this.f19376e = null;
                } else {
                    this.f19376e = str5;
                }
            } else {
                throw new MissingFieldException("header");
            }
        } else {
            throw new MissingFieldException("buttonText");
        }
    }

    public static final void a(RestEmpathySharePayload restEmpathySharePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(restEmpathySharePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.n(serialDescriptor, 0, restEmpathySharePayload.f19372a);
        dVar.n(serialDescriptor, 1, restEmpathySharePayload.f19373b);
        if (dVar.o(serialDescriptor, 2) || restEmpathySharePayload.f19374c != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, restEmpathySharePayload.f19374c);
        }
        if (dVar.o(serialDescriptor, 3) || restEmpathySharePayload.f19375d != null) {
            dVar.E(serialDescriptor, 3, a1.f23069b, restEmpathySharePayload.f19375d);
        }
        if (dVar.o(serialDescriptor, 4) || restEmpathySharePayload.f19376e != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 4, a1.f23069b, restEmpathySharePayload.f19376e);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestEmpathySharePayload)) {
            return false;
        }
        RestEmpathySharePayload restEmpathySharePayload = (RestEmpathySharePayload) obj;
        return p.e(this.f19372a, restEmpathySharePayload.f19372a) && p.e(this.f19373b, restEmpathySharePayload.f19373b) && p.e(this.f19374c, restEmpathySharePayload.f19374c) && p.e(this.f19375d, restEmpathySharePayload.f19375d) && p.e(this.f19376e, restEmpathySharePayload.f19376e);
    }

    public int hashCode() {
        int hashCode = ((this.f19372a.hashCode() * 31) + this.f19373b.hashCode()) * 31;
        String str = this.f19374c;
        int i11 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19375d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19376e;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        return "RestEmpathySharePayload(buttonText=" + this.f19372a + ", header=" + this.f19373b + ", message=" + this.f19374c + ", title=" + this.f19375d + ", url=" + this.f19376e + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeString(this.f19372a);
        parcel.writeString(this.f19373b);
        parcel.writeString(this.f19374c);
        parcel.writeString(this.f19375d);
        parcel.writeString(this.f19376e);
    }

    public RestEmpathySharePayload(String str, String str2, String str3, String str4, String str5) {
        p.j(str, "buttonText");
        p.j(str2, "header");
        this.f19372a = str;
        this.f19373b = str2;
        this.f19374c = str3;
        this.f19375d = str4;
        this.f19376e = str5;
    }
}
