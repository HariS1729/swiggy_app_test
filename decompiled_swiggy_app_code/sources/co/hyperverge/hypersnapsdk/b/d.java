package co.hyperverge.hypersnapsdk.b;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: MixpanelEvents */
public class d implements Serializable {
    @SerializedName("userSession")

    /* renamed from: a  reason: collision with root package name */
    private boolean f13321a = false;
    @SerializedName("instructionsScreenLaunched")

    /* renamed from: b  reason: collision with root package name */
    private boolean f13322b = false;
    @SerializedName("captureScreenLaunched")

    /* renamed from: c  reason: collision with root package name */
    private boolean f13323c = false;
    @SerializedName("captureScreenClosed")

    /* renamed from: d  reason: collision with root package name */
    private boolean f13324d = false;
    @SerializedName("captureSuccessful")

    /* renamed from: e  reason: collision with root package name */
    private boolean f13325e = false;
    @SerializedName("captureFailed")

    /* renamed from: f  reason: collision with root package name */
    private boolean f13326f = true;
    @SerializedName("oldDocReviewScreenEvents")

    /* renamed from: g  reason: collision with root package name */
    private boolean f13327g = false;
    @SerializedName("apiCallMade")

    /* renamed from: h  reason: collision with root package name */
    private boolean f13328h = false;
    @SerializedName("apiCallSuccessful")

    /* renamed from: i  reason: collision with root package name */
    private boolean f13329i = false;
    @SerializedName("apiCallFailed")
    private boolean j = false;
    @SerializedName("otherErrors")
    private boolean k = true;

    public void a(boolean z11) {
        this.j = z11;
    }

    public boolean b() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public boolean c(Object obj) {
        return obj instanceof d;
    }

    public void d(boolean z11) {
        this.f13328h = z11;
    }

    public boolean e() {
        return this.f13328h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.c(this) && y() == dVar.y() && r() == dVar.r() && n() == dVar.n() && l() == dVar.l() && p() == dVar.p() && j() == dVar.j() && t() == dVar.t() && e() == dVar.e() && h() == dVar.h() && b() == dVar.b() && w() == dVar.w();
    }

    public void g(boolean z11) {
        this.f13329i = z11;
    }

    public boolean h() {
        return this.f13329i;
    }

    public int hashCode() {
        int i11 = 79;
        int i12 = ((((((((((((((((((((y() ? 79 : 97) + 59) * 59) + (r() ? 79 : 97)) * 59) + (n() ? 79 : 97)) * 59) + (l() ? 79 : 97)) * 59) + (p() ? 79 : 97)) * 59) + (j() ? 79 : 97)) * 59) + (t() ? 79 : 97)) * 59) + (e() ? 79 : 97)) * 59) + (h() ? 79 : 97)) * 59) + (b() ? 79 : 97)) * 59;
        if (!w()) {
            i11 = 97;
        }
        return i12 + i11;
    }

    public void i(boolean z11) {
        this.f13326f = z11;
    }

    public boolean j() {
        return this.f13326f;
    }

    public void k(boolean z11) {
        this.f13324d = z11;
    }

    public boolean l() {
        return this.f13324d;
    }

    public void m(boolean z11) {
        this.f13323c = z11;
    }

    public boolean n() {
        return this.f13323c;
    }

    public void o(boolean z11) {
        this.f13325e = z11;
    }

    public boolean p() {
        return this.f13325e;
    }

    public void q(boolean z11) {
        this.f13322b = z11;
    }

    public boolean r() {
        return this.f13322b;
    }

    public void s(boolean z11) {
        this.f13327g = z11;
    }

    public boolean t() {
        return this.f13327g;
    }

    public String toString() {
        return "MixpanelEvents(userSession=" + y() + ", instructionsScreenLaunched=" + r() + ", captureScreenLaunched=" + n() + ", captureScreenClosed=" + l() + ", captureSuccessful=" + p() + ", captureFailed=" + j() + ", oldDocReviewScreenEvents=" + t() + ", apiCallMade=" + e() + ", apiCallSuccessful=" + h() + ", apiCallFailed=" + b() + ", otherErrors=" + w() + ")";
    }

    public void v(boolean z11) {
        this.k = z11;
    }

    public boolean w() {
        return this.k;
    }

    public void x(boolean z11) {
        this.f13321a = z11;
    }

    public boolean y() {
        return this.f13321a;
    }
}
