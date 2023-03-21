package in.swiggy.android.tejas.feature.errorscreen;

import bp0.k;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: ErrorScreenData.kt */
public final class ErrorScreenData {
    private final a<k> buttonAction1;
    private final a<k> buttonAction2;
    @SerializedName("buttonText1")
    private final String buttonText1;
    @SerializedName("buttonText2")
    private final String buttonText2;
    @SerializedName("description")
    private final String description;
    @SerializedName("drawableRes")
    private final int drawableRes;
    @SerializedName("header")
    private final String header;

    public ErrorScreenData(int i11, String str, String str2, String str3, String str4, a<k> aVar, a<k> aVar2) {
        p.j(aVar, "buttonAction1");
        p.j(aVar2, "buttonAction2");
        this.drawableRes = i11;
        this.header = str;
        this.description = str2;
        this.buttonText1 = str3;
        this.buttonText2 = str4;
        this.buttonAction1 = aVar;
        this.buttonAction2 = aVar2;
    }

    public static /* synthetic */ ErrorScreenData copy$default(ErrorScreenData errorScreenData, int i11, String str, String str2, String str3, String str4, a<k> aVar, a<k> aVar2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = errorScreenData.drawableRes;
        }
        if ((i12 & 2) != 0) {
            str = errorScreenData.header;
        }
        String str5 = str;
        if ((i12 & 4) != 0) {
            str2 = errorScreenData.description;
        }
        String str6 = str2;
        if ((i12 & 8) != 0) {
            str3 = errorScreenData.buttonText1;
        }
        String str7 = str3;
        if ((i12 & 16) != 0) {
            str4 = errorScreenData.buttonText2;
        }
        String str8 = str4;
        if ((i12 & 32) != 0) {
            aVar = errorScreenData.buttonAction1;
        }
        a<k> aVar3 = aVar;
        if ((i12 & 64) != 0) {
            aVar2 = errorScreenData.buttonAction2;
        }
        return errorScreenData.copy(i11, str5, str6, str7, str8, aVar3, aVar2);
    }

    public final int component1() {
        return this.drawableRes;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.buttonText1;
    }

    public final String component5() {
        return this.buttonText2;
    }

    public final a<k> component6() {
        return this.buttonAction1;
    }

    public final a<k> component7() {
        return this.buttonAction2;
    }

    public final ErrorScreenData copy(int i11, String str, String str2, String str3, String str4, a<k> aVar, a<k> aVar2) {
        p.j(aVar, "buttonAction1");
        a<k> aVar3 = aVar2;
        p.j(aVar3, "buttonAction2");
        return new ErrorScreenData(i11, str, str2, str3, str4, aVar, aVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorScreenData)) {
            return false;
        }
        ErrorScreenData errorScreenData = (ErrorScreenData) obj;
        return this.drawableRes == errorScreenData.drawableRes && p.e(this.header, errorScreenData.header) && p.e(this.description, errorScreenData.description) && p.e(this.buttonText1, errorScreenData.buttonText1) && p.e(this.buttonText2, errorScreenData.buttonText2) && p.e(this.buttonAction1, errorScreenData.buttonAction1) && p.e(this.buttonAction2, errorScreenData.buttonAction2);
    }

    public final a<k> getButtonAction1() {
        return this.buttonAction1;
    }

    public final a<k> getButtonAction2() {
        return this.buttonAction2;
    }

    public final String getButtonText1() {
        return this.buttonText1;
    }

    public final String getButtonText2() {
        return this.buttonText2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDrawableRes() {
        return this.drawableRes;
    }

    public final String getHeader() {
        return this.header;
    }

    public int hashCode() {
        int i11 = this.drawableRes * 31;
        String str = this.header;
        int i12 = 0;
        int hashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText1;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonText2;
        if (str4 != null) {
            i12 = str4.hashCode();
        }
        return ((((hashCode3 + i12) * 31) + this.buttonAction1.hashCode()) * 31) + this.buttonAction2.hashCode();
    }

    public String toString() {
        return "ErrorScreenData(drawableRes=" + this.drawableRes + ", header=" + this.header + ", description=" + this.description + ", buttonText1=" + this.buttonText1 + ", buttonText2=" + this.buttonText2 + ", buttonAction1=" + this.buttonAction1 + ", buttonAction2=" + this.buttonAction2 + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ErrorScreenData(int i11, String str, String str2, String str3, String str4, a aVar, a aVar2, int i12, i iVar) {
        this(i11, str, str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? AnonymousClass1.INSTANCE : aVar, (i12 & 64) != 0 ? AnonymousClass2.INSTANCE : aVar2);
    }
}
