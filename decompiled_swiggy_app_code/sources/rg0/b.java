package rg0;

import android.content.Intent;
import android.provider.ContactsContract;
import androidx.fragment.app.FragmentActivity;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import dt.c;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.swiggylynx.plugin.statusbar.StatusBarColorChangePayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.SwiggyLynxCorePlugin;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.toggleBottomBarViewParams.ToggleBottomBarViewRequestPayload;
import in.swiggy.android.swiggylynx.ui.fragment.LynxFragment;
import kotlin.jvm.internal.p;
import us.f;
import yh0.a;
import zp.b;

/* compiled from: SwiggyLynxFragmentCorePlugin.kt */
public final class b extends SwiggyLynxCorePlugin {
    private final LynxFragment P;
    private final a Q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(in.swiggy.android.swiggylynx.ui.fragment.LynxFragment r36, fi0.a r37, eo0.a r38, android.content.Intent r39, java.lang.String r40, java.lang.String r41, android.webkit.WebView r42, lp0.a<bp0.k> r43, yh0.a r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, uh0.a r48, ef0.f r49, jr.a r50, pw.a r51, os.a r52, java.lang.String r53) {
        /*
            r35 = this;
            r13 = r35
            r7 = r36
            r2 = r44
            r0 = r35
            r11 = r37
            r19 = r38
            r17 = r39
            r18 = r40
            r15 = r41
            r3 = r42
            r12 = r43
            r22 = r45
            r21 = r46
            r23 = r47
            r24 = r48
            r25 = r49
            r26 = r50
            r27 = r51
            r31 = r52
            r29 = r53
            java.lang.String r1 = "fragment"
            kotlin.jvm.internal.p.j(r7, r1)
            java.lang.String r1 = "webViewClientCommunicationHandler"
            r4 = r37
            kotlin.jvm.internal.p.j(r4, r1)
            java.lang.String r1 = "subscriptions"
            r4 = r38
            kotlin.jvm.internal.p.j(r4, r1)
            java.lang.String r1 = "url"
            r4 = r40
            kotlin.jvm.internal.p.j(r4, r1)
            java.lang.String r1 = "webFlow"
            r4 = r41
            kotlin.jvm.internal.p.j(r4, r1)
            java.lang.String r1 = "onClose"
            r4 = r43
            kotlin.jvm.internal.p.j(r4, r1)
            java.lang.String r1 = "dependencies"
            kotlin.jvm.internal.p.j(r2, r1)
            java.lang.String r1 = "source"
            r4 = r45
            kotlin.jvm.internal.p.j(r4, r1)
            java.lang.String r1 = "orderJsonString"
            r4 = r46
            kotlin.jvm.internal.p.j(r4, r1)
            java.lang.String r1 = "launchScreenName"
            r4 = r47
            kotlin.jvm.internal.p.j(r4, r1)
            java.lang.String r1 = "mSwiggyLynxInterface"
            r4 = r48
            kotlin.jvm.internal.p.j(r4, r1)
            java.lang.String r1 = "xpExperimentContext"
            r4 = r49
            kotlin.jvm.internal.p.j(r4, r1)
            java.lang.String r1 = "newrelicPerformanceUtils"
            r4 = r50
            kotlin.jvm.internal.p.j(r4, r1)
            java.lang.String r1 = "crossPollinationDataManager"
            r4 = r51
            kotlin.jvm.internal.p.j(r4, r1)
            java.lang.String r1 = "appBuildDetails"
            r4 = r52
            kotlin.jvm.internal.p.j(r4, r1)
            androidx.fragment.app.FragmentActivity r1 = r36.requireActivity()
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
            android.content.SharedPreferences r8 = r44.getSharedPreferences()
            cf0.i r4 = r44.f()
            bf0.a r4 = r4.B()
            r14 = r4
            ps.b r9 = r44.g()
            cg0.n r5 = r44.e()
            fr.e r6 = r44.j()
            us.f r10 = r44.k()
            cg0.o r20 = r44.h()
            ef0.e r16 = r44.d()
            r13 = r4
            r4 = r16
            jz.c r16 = r44.l()
            r2 = r16
            androidx.fragment.app.FragmentActivity r16 = r36.requireActivity()
            java.lang.Class r16 = r16.getClass()
            r7 = r16
            r34 = r0
            java.lang.String r0 = "cart"
            kotlin.jvm.internal.p.i(r13, r0)
            r13 = 0
            r0 = r35
            r16 = 0
            r28 = 0
            r30 = 0
            r32 = 671088640(0x28000000, float:7.1054274E-15)
            r33 = 0
            r0 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0 = r35
            r1 = r36
            r0.P = r1
            r1 = r44
            r0.Q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rg0.b.<init>(in.swiggy.android.swiggylynx.ui.fragment.LynxFragment, fi0.a, eo0.a, android.content.Intent, java.lang.String, java.lang.String, android.webkit.WebView, lp0.a, yh0.a, java.lang.String, java.lang.String, java.lang.String, uh0.a, ef0.f, jr.a, pw.a, os.a, java.lang.String):void");
    }

    public void H(lp.b bVar, String str, zp.b bVar2) {
        FragmentActivity activity;
        f k;
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar2, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
        if (this.P.isVisible() && (activity = this.P.getActivity()) != null && (k = X1().k()) != null) {
            k.t(activity);
        }
    }

    public void I(lp.b bVar, String str, zp.b bVar2) {
        String b11;
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        if (!this.P.isResumed() || !this.P.isVisible()) {
            if (this.P.isVisible()) {
                StatusBarColorChangePayload statusBarColorChangePayload = bVar instanceof StatusBarColorChangePayload ? (StatusBarColorChangePayload) bVar : null;
                if (statusBarColorChangePayload != null && (b11 = statusBarColorChangePayload.b()) != null && o.N(b11, "#", false, 2, (Object) null)) {
                    Y1().u(b11);
                }
            }
        } else if (this.P.A1()) {
            super.I(bVar, str, bVar2);
        } else {
            StatusBarColorChangePayload statusBarColorChangePayload2 = bVar instanceof StatusBarColorChangePayload ? (StatusBarColorChangePayload) bVar : null;
            if (statusBarColorChangePayload2 != null) {
                String f12 = Y1().f1();
                R1(f12 == null ? -100000001 : c.f(f12, 0, 1, (Object) null));
                Y1().u(statusBarColorChangePayload2.b());
            }
        }
    }

    public void J0(ToggleBottomBarViewRequestPayload toggleBottomBarViewRequestPayload, String str, zp.b bVar) {
        p.j(toggleBottomBarViewRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        if (this.P.isVisible() && this.P.isResumed() && !this.P.A1()) {
            Boolean b11 = toggleBottomBarViewRequestPayload.b();
            this.P.O1(!(b11 == null ? true : b11.booleanValue()));
            f k = this.Q.k();
            if (k != null) {
                FragmentActivity requireActivity = this.P.requireActivity();
                p.i(requireActivity, "fragment.requireActivity()");
                k.J(requireActivity, p.e(toggleBottomBarViewRequestPayload.b(), Boolean.TRUE));
            }
        }
        super.J0(toggleBottomBarViewRequestPayload, str, bVar);
    }

    public final a X1() {
        return this.Q;
    }

    public final LynxFragment Y1() {
        return this.P;
    }

    public void a0(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        S1(str);
        T1(bVar2);
        this.P.startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI), 5);
    }

    public void d(wp.a aVar, String str, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(aVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        if (this.P.B1()) {
            this.P.V0().a(true);
        }
        super.d(aVar, str, bVar, iLynxViewUpdateHandler);
    }
}
