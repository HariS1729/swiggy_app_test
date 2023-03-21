package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.socialshare;

import android.os.Parcel;
import android.os.Parcelable;
import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: ShareRequestPayload.kt */
public final class ShareRequestPayload extends b implements Parcelable {
    public static final Parcelable.Creator<ShareRequestPayload> CREATOR = new a();
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19484a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19485b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19486c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19487d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19488e;

    /* compiled from: ShareRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<ShareRequestPayload> serializer() {
            return ShareRequestPayload$$serializer.INSTANCE;
        }
    }

    /* compiled from: ShareRequestPayload.kt */
    public static final class a implements Parcelable.Creator<ShareRequestPayload> {
        /* renamed from: a */
        public final ShareRequestPayload createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new ShareRequestPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ShareRequestPayload[] newArray(int i11) {
            return new ShareRequestPayload[i11];
        }
    }

    public ShareRequestPayload() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (i) null);
    }

    public /* synthetic */ ShareRequestPayload(int i11, String str, String str2, String str3, String str4, String str5, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) == 0) {
            this.f19484a = null;
        } else {
            this.f19484a = str;
        }
        if ((i11 & 2) == 0) {
            this.f19485b = null;
        } else {
            this.f19485b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f19486c = null;
        } else {
            this.f19486c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f19487d = null;
        } else {
            this.f19487d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f19488e = null;
        } else {
            this.f19488e = str5;
        }
    }

    public static final void e(ShareRequestPayload shareRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(shareRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || shareRequestPayload.f19484a != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, shareRequestPayload.f19484a);
        }
        if (dVar.o(serialDescriptor, 1) || shareRequestPayload.f19485b != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, shareRequestPayload.f19485b);
        }
        if (dVar.o(serialDescriptor, 2) || shareRequestPayload.f19486c != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, shareRequestPayload.f19486c);
        }
        if (dVar.o(serialDescriptor, 3) || shareRequestPayload.f19487d != null) {
            dVar.E(serialDescriptor, 3, a1.f23069b, shareRequestPayload.f19487d);
        }
        if (dVar.o(serialDescriptor, 4) || shareRequestPayload.f19488e != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 4, a1.f23069b, shareRequestPayload.f19488e);
        }
    }

    public final String b() {
        return this.f19488e;
    }

    public final String c() {
        return this.f19484a;
    }

    public final String d() {
        return this.f19485b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareRequestPayload)) {
            return false;
        }
        ShareRequestPayload shareRequestPayload = (ShareRequestPayload) obj;
        return p.e(this.f19484a, shareRequestPayload.f19484a) && p.e(this.f19485b, shareRequestPayload.f19485b) && p.e(this.f19486c, shareRequestPayload.f19486c) && p.e(this.f19487d, shareRequestPayload.f19487d) && p.e(this.f19488e, shareRequestPayload.f19488e);
    }

    public int hashCode() {
        String str = this.f19484a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19485b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19486c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19487d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f19488e;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        return hashCode4 + i11;
    }

    public String toString() {
        return "ShareRequestPayload(message=" + this.f19484a + ", title=" + this.f19485b + ", platform=" + this.f19486c + ", url=" + this.f19487d + ", image=" + this.f19488e + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeString(this.f19484a);
        parcel.writeString(this.f19485b);
        parcel.writeString(this.f19486c);
        parcel.writeString(this.f19487d);
        parcel.writeString(this.f19488e);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShareRequestPayload(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.i r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.socialshare.ShareRequestPayload.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    public ShareRequestPayload(String str, String str2, String str3, String str4, String str5) {
        this.f19484a = str;
        this.f19485b = str2;
        this.f19486c = str3;
        this.f19487d = str4;
        this.f19488e = str5;
    }
}
