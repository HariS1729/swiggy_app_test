package in.swiggy.android.swiggylynx.plugin.restempathy;

import android.os.Parcel;
import android.os.Parcelable;
import com.newrelic.agent.android.agentdata.HexAttribute;
import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: RestEmpathyResponsePayload.kt */
public final class RestEmpathyResponsePayload extends b implements Parcelable {
    public static final Parcelable.Creator<RestEmpathyResponsePayload> CREATOR = new a();
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19365a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19366b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19367c;

    /* renamed from: d  reason: collision with root package name */
    private final RestEmpathySharePayload f19368d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19369e;

    /* renamed from: f  reason: collision with root package name */
    private final String f19370f;

    /* renamed from: g  reason: collision with root package name */
    private final String f19371g;

    /* compiled from: RestEmpathyResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<RestEmpathyResponsePayload> serializer() {
            return RestEmpathyResponsePayload$$serializer.INSTANCE;
        }
    }

    /* compiled from: RestEmpathyResponsePayload.kt */
    public static final class a implements Parcelable.Creator<RestEmpathyResponsePayload> {
        /* renamed from: a */
        public final RestEmpathyResponsePayload createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new RestEmpathyResponsePayload(parcel.readString(), parcel.readString(), parcel.readString(), RestEmpathySharePayload.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final RestEmpathyResponsePayload[] newArray(int i11) {
            return new RestEmpathyResponsePayload[i11];
        }
    }

    public /* synthetic */ RestEmpathyResponsePayload(int i11, String str, String str2, String str3, RestEmpathySharePayload restEmpathySharePayload, String str4, String str5, String str6, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19365a = str;
            if ((i11 & 2) != 0) {
                this.f19366b = str2;
                if ((i11 & 4) != 0) {
                    this.f19367c = str3;
                    if ((i11 & 8) != 0) {
                        this.f19368d = restEmpathySharePayload;
                        if ((i11 & 16) != 0) {
                            this.f19369e = str4;
                            if ((i11 & 32) != 0) {
                                this.f19370f = str5;
                                if ((i11 & 64) != 0) {
                                    this.f19371g = str6;
                                    return;
                                }
                                throw new MissingFieldException("orderId");
                            }
                            throw new MissingFieldException("restaurantName");
                        }
                        throw new MissingFieldException("userName");
                    }
                    throw new MissingFieldException("share");
                }
                throw new MissingFieldException(HexAttribute.HEX_ATTR_MESSAGE);
            }
            throw new MissingFieldException("header");
        }
        throw new MissingFieldException("imageId");
    }

    public static final void b(RestEmpathyResponsePayload restEmpathyResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(restEmpathyResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, restEmpathyResponsePayload.f19365a);
        dVar.n(serialDescriptor, 1, restEmpathyResponsePayload.f19366b);
        dVar.n(serialDescriptor, 2, restEmpathyResponsePayload.f19367c);
        dVar.v(serialDescriptor, 3, RestEmpathySharePayload$$serializer.INSTANCE, restEmpathyResponsePayload.f19368d);
        dVar.n(serialDescriptor, 4, restEmpathyResponsePayload.f19369e);
        dVar.n(serialDescriptor, 5, restEmpathyResponsePayload.f19370f);
        dVar.n(serialDescriptor, 6, restEmpathyResponsePayload.f19371g);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestEmpathyResponsePayload)) {
            return false;
        }
        RestEmpathyResponsePayload restEmpathyResponsePayload = (RestEmpathyResponsePayload) obj;
        return p.e(this.f19365a, restEmpathyResponsePayload.f19365a) && p.e(this.f19366b, restEmpathyResponsePayload.f19366b) && p.e(this.f19367c, restEmpathyResponsePayload.f19367c) && p.e(this.f19368d, restEmpathyResponsePayload.f19368d) && p.e(this.f19369e, restEmpathyResponsePayload.f19369e) && p.e(this.f19370f, restEmpathyResponsePayload.f19370f) && p.e(this.f19371g, restEmpathyResponsePayload.f19371g);
    }

    public int hashCode() {
        return (((((((((((this.f19365a.hashCode() * 31) + this.f19366b.hashCode()) * 31) + this.f19367c.hashCode()) * 31) + this.f19368d.hashCode()) * 31) + this.f19369e.hashCode()) * 31) + this.f19370f.hashCode()) * 31) + this.f19371g.hashCode();
    }

    public String toString() {
        return "RestEmpathyResponsePayload(imageId=" + this.f19365a + ", header=" + this.f19366b + ", message=" + this.f19367c + ", share=" + this.f19368d + ", userName=" + this.f19369e + ", restaurantName=" + this.f19370f + ", orderId=" + this.f19371g + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeString(this.f19365a);
        parcel.writeString(this.f19366b);
        parcel.writeString(this.f19367c);
        this.f19368d.writeToParcel(parcel, i11);
        parcel.writeString(this.f19369e);
        parcel.writeString(this.f19370f);
        parcel.writeString(this.f19371g);
    }

    public RestEmpathyResponsePayload(String str, String str2, String str3, RestEmpathySharePayload restEmpathySharePayload, String str4, String str5, String str6) {
        p.j(str, "imageId");
        p.j(str2, "header");
        p.j(str3, HexAttribute.HEX_ATTR_MESSAGE);
        p.j(restEmpathySharePayload, "share");
        p.j(str4, "userName");
        p.j(str5, "restaurantName");
        p.j(str6, "orderId");
        this.f19365a = str;
        this.f19366b = str2;
        this.f19367c = str3;
        this.f19368d = restEmpathySharePayload;
        this.f19369e = str4;
        this.f19370f = str5;
        this.f19371g = str6;
    }
}
