package in.swiggy.android.tejas.feature.cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.agentdata.HexAttribute;
import com.truecaller.android.sdk.TruecallerSdkScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: Popup.kt */
public final class Popup implements Parcelable {
    public static final Parcelable.Creator<Popup> CREATOR = new Creator();
    @SerializedName("button_text")
    private final String buttonText;
    @SerializedName("buttons")
    private final List<Button> buttons;
    @SerializedName("cta")
    private final String cta;
    @SerializedName("icon_url")
    private final String iconUrl;
    @SerializedName("message")
    private final String message;
    @SerializedName("message_separator_icon_url")
    private final String messageSeparatorIcon;
    @SerializedName("points")
    private final List<Point> points;
    @SerializedName("subtext")
    private String subtext;
    @SerializedName("title")
    private final String title;
    @SerializedName("title_separator_icon_url")
    private final String titleSeparatorIcon;

    /* compiled from: Popup.kt */
    public static final class Creator implements Parcelable.Creator<Popup> {
        public final Popup createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            p.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(Point.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList2.add(Button.CREATOR.createFromParcel(parcel));
                }
            }
            return new Popup(readString, readString2, readString3, readString4, readString5, readString6, arrayList, arrayList2, parcel.readString(), parcel.readString());
        }

        public final Popup[] newArray(int i11) {
            return new Popup[i11];
        }
    }

    public Popup(String str, String str2, String str3, String str4, String str5, String str6, List<Point> list, List<Button> list2, String str7, String str8) {
        p.j(str4, HexAttribute.HEX_ATTR_MESSAGE);
        this.buttonText = str;
        this.cta = str2;
        this.iconUrl = str3;
        this.message = str4;
        this.title = str5;
        this.subtext = str6;
        this.points = list;
        this.buttons = list2;
        this.messageSeparatorIcon = str7;
        this.titleSeparatorIcon = str8;
    }

    public static /* synthetic */ Popup copy$default(Popup popup, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, String str7, String str8, int i11, Object obj) {
        Popup popup2 = popup;
        int i12 = i11;
        return popup.copy((i12 & 1) != 0 ? popup2.buttonText : str, (i12 & 2) != 0 ? popup2.cta : str2, (i12 & 4) != 0 ? popup2.iconUrl : str3, (i12 & 8) != 0 ? popup2.message : str4, (i12 & 16) != 0 ? popup2.title : str5, (i12 & 32) != 0 ? popup2.subtext : str6, (i12 & 64) != 0 ? popup2.points : list, (i12 & 128) != 0 ? popup2.buttons : list2, (i12 & 256) != 0 ? popup2.messageSeparatorIcon : str7, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? popup2.titleSeparatorIcon : str8);
    }

    public final String component1() {
        return this.buttonText;
    }

    public final String component10() {
        return this.titleSeparatorIcon;
    }

    public final String component2() {
        return this.cta;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final String component4() {
        return this.message;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.subtext;
    }

    public final List<Point> component7() {
        return this.points;
    }

    public final List<Button> component8() {
        return this.buttons;
    }

    public final String component9() {
        return this.messageSeparatorIcon;
    }

    public final Popup copy(String str, String str2, String str3, String str4, String str5, String str6, List<Point> list, List<Button> list2, String str7, String str8) {
        String str9 = str4;
        p.j(str9, HexAttribute.HEX_ATTR_MESSAGE);
        return new Popup(str, str2, str3, str9, str5, str6, list, list2, str7, str8);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Popup)) {
            return false;
        }
        Popup popup = (Popup) obj;
        return p.e(this.buttonText, popup.buttonText) && p.e(this.cta, popup.cta) && p.e(this.iconUrl, popup.iconUrl) && p.e(this.message, popup.message) && p.e(this.title, popup.title) && p.e(this.subtext, popup.subtext) && p.e(this.points, popup.points) && p.e(this.buttons, popup.buttons) && p.e(this.messageSeparatorIcon, popup.messageSeparatorIcon) && p.e(this.titleSeparatorIcon, popup.titleSeparatorIcon);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessageSeparatorIcon() {
        return this.messageSeparatorIcon;
    }

    public final List<Point> getPoints() {
        return this.points;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleSeparatorIcon() {
        return this.titleSeparatorIcon;
    }

    public int hashCode() {
        String str = this.buttonText;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cta;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.message.hashCode()) * 31;
        String str4 = this.title;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subtext;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<Point> list = this.points;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<Button> list2 = this.buttons;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.messageSeparatorIcon;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.titleSeparatorIcon;
        if (str7 != null) {
            i11 = str7.hashCode();
        }
        return hashCode8 + i11;
    }

    public final void setSubtext(String str) {
        this.subtext = str;
    }

    public String toString() {
        return "Popup(buttonText=" + this.buttonText + ", cta=" + this.cta + ", iconUrl=" + this.iconUrl + ", message=" + this.message + ", title=" + this.title + ", subtext=" + this.subtext + ", points=" + this.points + ", buttons=" + this.buttons + ", messageSeparatorIcon=" + this.messageSeparatorIcon + ", titleSeparatorIcon=" + this.titleSeparatorIcon + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeString(this.buttonText);
        parcel.writeString(this.cta);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.message);
        parcel.writeString(this.title);
        parcel.writeString(this.subtext);
        List<Point> list = this.points;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Point writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i11);
            }
        }
        List<Button> list2 = this.buttons;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Button writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, i11);
            }
        }
        parcel.writeString(this.messageSeparatorIcon);
        parcel.writeString(this.titleSeparatorIcon);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Popup(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.List r21, java.util.List r22, java.lang.String r23, java.lang.String r24, int r25, kotlin.jvm.internal.i r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000a
        L_0x0009:
            r4 = r15
        L_0x000a:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0010
            r5 = r2
            goto L_0x0012
        L_0x0010:
            r5 = r16
        L_0x0012:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0018
            r6 = r2
            goto L_0x001a
        L_0x0018:
            r6 = r17
        L_0x001a:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0020
            r8 = r2
            goto L_0x0022
        L_0x0020:
            r8 = r19
        L_0x0022:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0028
            r9 = r2
            goto L_0x002a
        L_0x0028:
            r9 = r20
        L_0x002a:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0030
            r10 = r2
            goto L_0x0032
        L_0x0030:
            r10 = r21
        L_0x0032:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0038
            r11 = r2
            goto L_0x003a
        L_0x0038:
            r11 = r22
        L_0x003a:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0040
            r12 = r2
            goto L_0x0042
        L_0x0040:
            r12 = r23
        L_0x0042:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0048
            r13 = r2
            goto L_0x004a
        L_0x0048:
            r13 = r24
        L_0x004a:
            r3 = r14
            r7 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.cart.Popup.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
