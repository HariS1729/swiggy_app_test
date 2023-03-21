package in.swiggy.android.tejas.feature.chathead.models;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Conversations.kt */
public final class Conversations {
    @SerializedName("avatarUrl")
    private final String avatarUrl;
    @SerializedName("createdAt")
    private final Long createdAt;
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f20216id;
    @SerializedName("lastReadAt")
    private final Long lastReadAt;
    @SerializedName("read")
    private Boolean read;
    @SerializedName("text")
    private String text;
    @SerializedName("type")
    private final String type;
    @SerializedName("updatedAt")
    private Long updatedAt;

    public Conversations() {
        this((String) null, (Boolean) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (Long) null, 255, (i) null);
    }

    public Conversations(String str, Boolean bool, String str2, String str3, String str4, Long l11, Long l12, Long l13) {
        this.f20216id = str;
        this.read = bool;
        this.type = str2;
        this.avatarUrl = str3;
        this.text = str4;
        this.lastReadAt = l11;
        this.createdAt = l12;
        this.updatedAt = l13;
    }

    public static /* synthetic */ Conversations copy$default(Conversations conversations, String str, Boolean bool, String str2, String str3, String str4, Long l11, Long l12, Long l13, int i11, Object obj) {
        Conversations conversations2 = conversations;
        int i12 = i11;
        return conversations.copy((i12 & 1) != 0 ? conversations2.f20216id : str, (i12 & 2) != 0 ? conversations2.read : bool, (i12 & 4) != 0 ? conversations2.type : str2, (i12 & 8) != 0 ? conversations2.avatarUrl : str3, (i12 & 16) != 0 ? conversations2.text : str4, (i12 & 32) != 0 ? conversations2.lastReadAt : l11, (i12 & 64) != 0 ? conversations2.createdAt : l12, (i12 & 128) != 0 ? conversations2.updatedAt : l13);
    }

    public final String component1() {
        return this.f20216id;
    }

    public final Boolean component2() {
        return this.read;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.avatarUrl;
    }

    public final String component5() {
        return this.text;
    }

    public final Long component6() {
        return this.lastReadAt;
    }

    public final Long component7() {
        return this.createdAt;
    }

    public final Long component8() {
        return this.updatedAt;
    }

    public final Conversations copy(String str, Boolean bool, String str2, String str3, String str4, Long l11, Long l12, Long l13) {
        return new Conversations(str, bool, str2, str3, str4, l11, l12, l13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Conversations)) {
            return false;
        }
        Conversations conversations = (Conversations) obj;
        return p.e(this.f20216id, conversations.f20216id) && p.e(this.read, conversations.read) && p.e(this.type, conversations.type) && p.e(this.avatarUrl, conversations.avatarUrl) && p.e(this.text, conversations.text) && p.e(this.lastReadAt, conversations.lastReadAt) && p.e(this.createdAt, conversations.createdAt) && p.e(this.updatedAt, conversations.updatedAt);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f20216id;
    }

    public final Long getLastReadAt() {
        return this.lastReadAt;
    }

    public final Boolean getRead() {
        return this.read;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.f20216id;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.read;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.type;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatarUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.lastReadAt;
        int hashCode6 = (hashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.createdAt;
        int hashCode7 = (hashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.updatedAt;
        if (l13 != null) {
            i11 = l13.hashCode();
        }
        return hashCode7 + i11;
    }

    public final void setRead(Boolean bool) {
        this.read = bool;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setUpdatedAt(Long l11) {
        this.updatedAt = l11;
    }

    public String toString() {
        return "Conversations(id=" + this.f20216id + ", read=" + this.read + ", type=" + this.type + ", avatarUrl=" + this.avatarUrl + ", text=" + this.text + ", lastReadAt=" + this.lastReadAt + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Conversations(java.lang.String r11, java.lang.Boolean r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, int r19, kotlin.jvm.internal.i r20) {
        /*
            r10 = this;
            r0 = r19
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = r15
        L_0x0025:
            r6 = r0 & 32
            r7 = 0
            if (r6 == 0) goto L_0x0030
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            goto L_0x0032
        L_0x0030:
            r6 = r16
        L_0x0032:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003b
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            goto L_0x003d
        L_0x003b:
            r9 = r17
        L_0x003d:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0046
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            goto L_0x0048
        L_0x0046:
            r0 = r18
        L_0x0048:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r2
            r17 = r6
            r18 = r9
            r19 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.chathead.models.Conversations.<init>(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, int, kotlin.jvm.internal.i):void");
    }
}
