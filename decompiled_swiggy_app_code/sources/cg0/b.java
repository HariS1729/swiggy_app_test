package cg0;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class b {
    @SerializedName("address-uid")

    /* renamed from: a  reason: collision with root package name */
    private String f18137a;
    @SerializedName("old-receivers-name")

    /* renamed from: b  reason: collision with root package name */
    private String f18138b;
    @SerializedName("new-receivers-name")

    /* renamed from: c  reason: collision with root package name */
    private String f18139c;
    @SerializedName("old receivers-phone")

    /* renamed from: d  reason: collision with root package name */
    private String f18140d;
    @SerializedName("new-receivers-phone")

    /* renamed from: e  reason: collision with root package name */
    private String f18141e;

    public b() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (i) null);
    }

    public b(String str, String str2, String str3, String str4, String str5) {
        this.f18137a = str;
        this.f18138b = str2;
        this.f18139c = str3;
        this.f18140d = str4;
        this.f18141e = str5;
    }

    public final void a(String str) {
        this.f18139c = str;
    }

    public final void b(String str) {
        this.f18141e = str;
    }

    public final void c(String str) {
        this.f18138b = str;
    }

    public final void d(String str) {
        this.f18140d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p.e(this.f18137a, bVar.f18137a) && p.e(this.f18138b, bVar.f18138b) && p.e(this.f18139c, bVar.f18139c) && p.e(this.f18140d, bVar.f18140d) && p.e(this.f18141e, bVar.f18141e);
    }

    public int hashCode() {
        String str = this.f18137a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18138b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18139c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18140d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18141e;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        return hashCode4 + i11;
    }

    public String toString() {
        return "AddressFAndFEventData(addressUid=" + this.f18137a + ", oldReceiversName=" + this.f18138b + ", newReceiversName=" + this.f18139c + ", oldReceiversPhone=" + this.f18140d + ", newReceiversPhone=" + this.f18141e + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.i r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: cg0.b.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
