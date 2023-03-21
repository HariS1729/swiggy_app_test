package in.swiggy.android.swiggylynx.lynxFragment;

import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.dash.imageImport.ImageImportFragment;
import in.swiggy.android.payment.PaymentSource;
import in.swiggy.android.payment.SwiggyPaymentActivity;
import in.swiggy.android.swiggylynx.R;
import in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.superV2.OpenSuperV2RequestPayload;
import in.swiggy.android.swiggylynx.plugin.dash.DashPlugin;
import in.swiggy.android.swiggylynx.plugin.dash.imageupload.ImageUploadPayload;
import in.swiggy.android.swiggylynx.ui.fragment.LynxFragment;
import in.swiggy.android.tejas.payment.model.payment.response.Callouts;
import kotlin.jvm.internal.p;
import us.f;
import ut.q;
import zp.b;

/* compiled from: DashFragmentPlugin.kt */
public final class DashFragmentPlugin extends DashPlugin {
    /* access modifiers changed from: private */
    public final LynxFragment q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DashFragmentPlugin(in.swiggy.android.swiggylynx.ui.fragment.LynxFragment r15, eo0.a r16, og0.a r17, java.lang.String r18, cf0.i r19) {
        /*
            r14 = this;
            r13 = r15
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.p.j(r15, r0)
            java.lang.String r0 = "subscriptions"
            r8 = r16
            kotlin.jvm.internal.p.j(r8, r0)
            java.lang.String r0 = "defaultHeaders"
            r9 = r17
            kotlin.jvm.internal.p.j(r9, r0)
            java.lang.String r0 = "url"
            r10 = r18
            kotlin.jvm.internal.p.j(r10, r0)
            java.lang.String r0 = "cartService"
            r12 = r19
            kotlin.jvm.internal.p.j(r12, r0)
            androidx.fragment.app.FragmentActivity r1 = r15.requireActivity()
            yh0.a r0 = r15.G0()
            ef0.e r7 = r0.d()
            yh0.a r0 = r15.G0()
            us.f r5 = r0.k()
            yh0.a r0 = r15.G0()
            cg0.n r6 = r0.e()
            yh0.a r0 = r15.G0()
            android.content.SharedPreferences r3 = r0.getSharedPreferences()
            yh0.a r0 = r15.G0()
            jr.a r11 = r0.m()
            yh0.a r0 = r15.G0()
            fr.e r4 = r0.j()
            java.lang.String r0 = "requireActivity()"
            kotlin.jvm.internal.p.i(r1, r0)
            r0 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.q = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.lynxFragment.DashFragmentPlugin.<init>(in.swiggy.android.swiggylynx.ui.fragment.LynxFragment, eo0.a, og0.a, java.lang.String, cf0.i):void");
    }

    public void B(AddNewAddressRequestPayload addNewAddressRequestPayload, String str, b bVar) {
        p.j(addNewAddressRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        g1(str);
        h1(bVar);
        f Z0 = Z0();
        if (Z0 != null) {
            Z0.n(this.q, addNewAddressRequestPayload.c());
        }
    }

    public void I0(ImageUploadPayload imageUploadPayload, String str, b bVar) {
        p.j(imageUploadPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        q.f53911a.a(R.id.webContainer, this.q, new DashFragmentPlugin$processGoogleImageUpload$1(imageUploadPayload, str, bVar, this), ImageImportFragment.f60967l.c());
    }

    /* access modifiers changed from: protected */
    public void c1(String str, String str2, Callouts callouts) {
        p.j(str, "paymentLinkId");
        p.j(str2, "serviceLine");
        String str3 = str;
        SwiggyPaymentActivity.k.u(this.q, 4, str3, false, PaymentSource.GENERIC, Y0(str2), callouts, str2);
    }

    public void k(OpenSuperV2RequestPayload openSuperV2RequestPayload, String str, b bVar) {
        p.j(openSuperV2RequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        g1(str);
        h1(bVar);
        f Z0 = Z0();
        if (Z0 != null) {
            Z0.W(this.q, openSuperV2RequestPayload.b());
        }
    }

    public void s(ImageUploadPayload imageUploadPayload, String str, b bVar) {
        p.j(imageUploadPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        q.f53911a.a(R.id.webContainer, this.q, new DashFragmentPlugin$processImageUpload$1(imageUploadPayload, str, bVar, this), ImageImportFragment.f60967l.c());
    }
}
