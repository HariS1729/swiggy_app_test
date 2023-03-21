package in.swiggy.android.swiggylynx.ui.fragment.utils;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import bp0.k;
import eh0.f;
import in.swiggy.android.swiggylynx.lynxFragment.DashFragmentPlugin;
import in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.AmazonPlugin;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper;
import in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.PaymentCorePlugin;
import in.swiggy.android.swiggylynx.ui.fragment.LynxFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import lp0.l;
import mb0.n1;
import nh0.b;
import np.a;

/* compiled from: LynxFragmentPluginHelper.kt */
public final class LynxFragmentPluginHelperKt {
    public static final void a(LynxFragment lynxFragment, ArrayList<a> arrayList) {
        p.j(lynxFragment, "<this>");
        p.j(arrayList, "pluginList");
        FragmentActivity requireActivity = lynxFragment.requireActivity();
        b bVar = requireActivity instanceof b ? (b) requireActivity : null;
        if (bVar != null) {
            arrayList.add(bVar.N());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0033, code lost:
        r0 = r0.getString("orderJson");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(in.swiggy.android.swiggylynx.ui.fragment.LynxFragment r21, java.lang.String r22, java.lang.String r23, android.content.Intent r24, java.util.ArrayList<np.a> r25, java.lang.String r26) {
        /*
            r12 = r21
            r11 = r25
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r12, r0)
            java.lang.String r0 = "url"
            r5 = r22
            kotlin.jvm.internal.p.j(r5, r0)
            java.lang.String r0 = "webFlow"
            r6 = r23
            kotlin.jvm.internal.p.j(r6, r0)
            java.lang.String r0 = "pluginList"
            kotlin.jvm.internal.p.j(r11, r0)
            in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView r7 = r21.C0()
            eo0.a r3 = r21.R0()
            yh0.a r9 = r21.G0()
            android.os.Bundle r0 = r21.getArguments()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0033
        L_0x0030:
            r18 = r1
            goto L_0x003e
        L_0x0033:
            java.lang.String r2 = "orderJson"
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x003c
            goto L_0x0030
        L_0x003c:
            r18 = r0
        L_0x003e:
            android.os.Bundle r0 = r21.getArguments()
            if (r0 != 0) goto L_0x0046
        L_0x0044:
            r10 = r1
            goto L_0x0050
        L_0x0046:
            java.lang.String r2 = "launchScreen"
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x004f
            goto L_0x0044
        L_0x004f:
            r10 = r0
        L_0x0050:
            android.os.Bundle r0 = r21.getArguments()
            if (r0 != 0) goto L_0x0059
        L_0x0056:
            r19 = r1
            goto L_0x0064
        L_0x0059:
            java.lang.String r2 = "source"
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x0062
            goto L_0x0056
        L_0x0062:
            r19 = r0
        L_0x0064:
            uh0.a r13 = r21.a1()
            ef0.f r14 = r21.l1()
            jr.a r15 = r21.b1()
            in.swiggy.android.swiggylynx.ui.fragment.viewmodel.LynxFragmentViewModel r0 = r21.h1()
            pw.a r16 = r0.y1()
            os.a r17 = r21.u0()
            rg0.b r4 = new rg0.b
            r0 = r4
            in.swiggy.android.swiggylynx.ui.fragment.utils.LynxFragmentPluginHelperKt$initCorePlugin$plugin$1 r1 = new in.swiggy.android.swiggylynx.ui.fragment.utils.LynxFragmentPluginHelperKt$initCorePlugin$plugin$1
            r8 = r1
            r1.<init>(r12)
            r1 = r21
            r2 = r21
            r20 = r4
            r4 = r24
            r5 = r22
            r6 = r23
            r11 = r18
            r12 = r19
            r18 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r25
            r1 = r20
            r0.add(r1)
            oh0.b r1 = new oh0.b
            androidx.fragment.app.FragmentActivity r2 = r21.requireActivity()
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            yh0.a r3 = r21.G0()
            android.content.SharedPreferences r3 = r3.getSharedPreferences()
            r1.<init>(r2, r3)
            r0.add(r1)
            qh0.b r1 = new qh0.b
            androidx.fragment.app.FragmentActivity r2 = r21.requireActivity()
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            yh0.a r3 = r21.G0()
            jz.c r3 = r3.l()
            java.lang.Class<in.swiggy.android.swiggylynx.ui.LynxActivity> r4 = in.swiggy.android.swiggylynx.ui.LynxActivity.class
            in.swiggy.android.swiggylynx.ui.fragment.utils.LynxFragmentPluginHelperKt$initCorePlugin$1 r5 = new in.swiggy.android.swiggylynx.ui.fragment.utils.LynxFragmentPluginHelperKt$initCorePlugin$1
            r6 = r21
            r5.<init>(r6)
            r1.<init>(r2, r3, r4, r5)
            r0.add(r1)
            e(r6, r0)
            rg0.a r1 = new rg0.a
            androidx.fragment.app.FragmentActivity r2 = r21.requireActivity()
            r7 = r2
            androidx.appcompat.app.AppCompatActivity r7 = (androidx.appcompat.app.AppCompatActivity) r7
            uh0.a r8 = r21.a1()
            eo0.a r9 = r21.R0()
            ef0.e r10 = r21.g1()
            in.swiggy.android.swiggylynx.ui.fragment.viewmodel.LynxFragmentViewModel r2 = r21.h1()
            og0.a r11 = r2.z1()
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.ui.fragment.utils.LynxFragmentPluginHelperKt.b(in.swiggy.android.swiggylynx.ui.fragment.LynxFragment, java.lang.String, java.lang.String, android.content.Intent, java.util.ArrayList, java.lang.String):void");
    }

    public static final void c(LynxFragment lynxFragment, String str, ArrayList<a> arrayList) {
        p.j(lynxFragment, "<this>");
        p.j(str, "url");
        p.j(arrayList, "pluginList");
        arrayList.add(new DashFragmentPlugin(lynxFragment, lynxFragment.R0(), lynxFragment.h1().z1(), str, lynxFragment.A0()));
        FragmentActivity activity = lynxFragment.getActivity();
        tr.a aVar = activity instanceof tr.a ? (tr.a) activity : null;
        if (aVar != null) {
            arrayList.add(new sg0.a(aVar));
        }
    }

    public static final void d(LynxFragment lynxFragment, String str, ArrayList<a> arrayList, String str2) {
        ArrayList<a> arrayList2;
        p.j(lynxFragment, "<this>");
        p.j(arrayList, "pluginList");
        p.j(str2, "url");
        FragmentActivity requireActivity = lynxFragment.requireActivity();
        p.i(requireActivity, "requireActivity()");
        f fVar = new f(lynxFragment.G0().getSharedPreferences(), new JuspaySdkWrapper(requireActivity, lynxFragment.G0().d(), lynxFragment.G0().m(), lynxFragment.G0().getSharedPreferences()), lynxFragment.R0(), lynxFragment.c1());
        AppCompatActivity appCompatActivity = (AppCompatActivity) lynxFragment.requireActivity();
        bf0.a B = lynxFragment.G0().f().B();
        p.i(B, "dependencies.cartService.cart");
        PaymentCorePlugin paymentCorePlugin = r0;
        f fVar2 = fVar;
        PaymentCorePlugin paymentCorePlugin2 = new PaymentCorePlugin(appCompatActivity, str, B, lynxFragment.R0(), lynxFragment.G0().j(), lynxFragment.G0().getSharedPreferences(), lynxFragment.G0().m(), lynxFragment.G0().k(), (l<? super Intent, k>) null, false, lynxFragment.G0().l(), lynxFragment, lynxFragment.c1(), lynxFragment.E0(), str2, lynxFragment.g1());
        kh0.b bVar = new kh0.b(lynxFragment, lynxFragment.G0().getSharedPreferences(), lynxFragment.G0().m(), false, (n1) null);
        ch0.a aVar = new ch0.a(lynxFragment.R0(), lynxFragment, lynxFragment.G0().m(), lynxFragment.requireActivity().getClass(), false, (n1) null, lynxFragment.e1());
        FragmentActivity activity = lynxFragment.getActivity();
        if (activity == null) {
            LynxFragment lynxFragment2 = lynxFragment;
            arrayList2 = arrayList;
        } else {
            Context applicationContext = activity.getApplicationContext();
            p.i(applicationContext, "it.applicationContext");
            LynxFragment lynxFragment3 = lynxFragment;
            lynxFragment3.u1(applicationContext);
            arrayList2 = arrayList;
            arrayList2.add(new jh0.b(lynxFragment3, lynxFragment.G0().m(), false, (n1) null));
        }
        AmazonPlugin amazonPlugin = new AmazonPlugin(aVar, lynxFragment.G0().getSharedPreferences(), lynxFragment.b1());
        arrayList2.add(paymentCorePlugin);
        arrayList2.add(bVar);
        arrayList2.add(fVar2);
        arrayList2.add(amazonPlugin);
    }

    public static final void e(LynxFragment lynxFragment, ArrayList<a> arrayList) {
        p.j(lynxFragment, "<this>");
        p.j(arrayList, "pluginList");
        a b11 = sh0.a.Companion.b(lynxFragment.H0(), lynxFragment.e1(), lynxFragment.Y0(), lynxFragment.B0());
        if (b11 != null) {
            arrayList.add(b11);
        }
    }
}
