package if0;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: OldUserData.kt */
public final class b {
    @SerializedName("mName")

    /* renamed from: a  reason: collision with root package name */
    private String f18349a;
    @SerializedName("mPhoneNumber")

    /* renamed from: b  reason: collision with root package name */
    private String f18350b;
    @SerializedName("mEmail")

    /* renamed from: c  reason: collision with root package name */
    private String f18351c;
    @SerializedName("mTid")

    /* renamed from: d  reason: collision with root package name */
    private String f18352d;
    @SerializedName("mToken")

    /* renamed from: e  reason: collision with root package name */
    private String f18353e;
    @SerializedName("mCustomerId")

    /* renamed from: f  reason: collision with root package name */
    private String f18354f;
    @SerializedName("mAddresses")

    /* renamed from: g  reason: collision with root package name */
    private List<Address> f18355g = new ArrayList();
    @SerializedName("mUserType")

    /* renamed from: h  reason: collision with root package name */
    private String f18356h;
    @SerializedName("mReferral")

    /* renamed from: i  reason: collision with root package name */
    private String f18357i;
    @SerializedName("mMobileVerified")
    private String j;
    @SerializedName("mEmailVerified")
    private String k;
    @SerializedName("mSwuid")

    /* renamed from: l  reason: collision with root package name */
    private String f18358l;
    @SerializedName("mAuthToken")

    /* renamed from: m  reason: collision with root package name */
    private String f18359m;
    @SerializedName("mSessionId")
    private String n;
    @SerializedName("mRecentSearches")

    /* renamed from: o  reason: collision with root package name */
    private LinkedList<GooglePlace> f18360o;

    private final boolean a() {
        return !TextUtils.isEmpty(this.f18352d);
    }

    private final boolean b() {
        return !TextUtils.isEmpty(this.f18353e);
    }

    public final List<Address> c() {
        return this.f18355g;
    }

    public final String d() {
        return this.f18359m;
    }

    public final String e() {
        return this.f18354f;
    }

    public final String f() {
        return this.f18351c;
    }

    public final String g() {
        return this.k;
    }

    public final String h() {
        return this.j;
    }

    public final String i() {
        return this.f18349a;
    }

    public final String j() {
        return this.f18350b;
    }

    public final LinkedList<GooglePlace> k() {
        return this.f18360o;
    }

    public final String l() {
        return this.f18357i;
    }

    public final String m() {
        return this.n;
    }

    public final String n() {
        return this.f18358l;
    }

    public final String o() {
        return this.f18352d;
    }

    public final String p() {
        return this.f18353e;
    }

    public final String q() {
        return this.f18356h;
    }

    public final boolean r() {
        return a() && b();
    }
}
