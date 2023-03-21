package g7;

import com.adobe.xmp.XMPException;
import com.truecaller.android.sdk.TruecallerSdkScope;

public final class a extends c {
    public a() {
    }

    public a(int i11) throws XMPException {
        super(i11);
    }

    /* access modifiers changed from: protected */
    public int e() {
        return 7680;
    }

    public boolean h() {
        return c(TruecallerSdkScope.FOOTER_TYPE_MANUALLY);
    }

    public boolean i() {
        return c(4096);
    }

    public boolean j() {
        return d() == 0;
    }

    public a k(boolean z11) {
        f(7680, z11);
        return this;
    }

    public a l(boolean z11) {
        f(1536, z11);
        return this;
    }

    public e m() throws XMPException {
        return new e(d());
    }
}
