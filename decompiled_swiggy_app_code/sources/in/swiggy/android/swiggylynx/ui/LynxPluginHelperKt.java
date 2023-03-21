package in.swiggy.android.swiggylynx.ui;

import ah0.e;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.WebView;
import bp0.k;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs;
import in.swiggy.android.swiggylynx.plugin.addressplugin.AddressPlugin;
import in.swiggy.android.swiggylynx.plugin.dash.DashPlugin;
import in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.AmazonPlugin;
import in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspaySdkWrapper;
import in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.PaymentCorePlugin;
import in.swiggy.android.swiggylynx.plugin.payment.walletplugin.WalletPlugin;
import in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathyResponsePayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.SwiggyLynxCorePlugin;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import io.reactivex.processors.PublishProcessor;
import java.util.ArrayList;
import jz.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import mb0.n1;
import np.a;
import ps.b;
import us.f;
import wh0.j;

/* compiled from: LynxPluginHelper.kt */
public final class LynxPluginHelperKt {
    public static final void a(LynxActivity lynxActivity, Intent intent, ArrayList<a> arrayList, WebView webView, PublishProcessor<Integer> publishProcessor) {
        LynxActivity lynxActivity2 = lynxActivity;
        p.j(lynxActivity2, "<this>");
        p.j(arrayList, "pluginList");
        c w12 = lynxActivity.w1();
        SharedPreferences X1 = lynxActivity.X1();
        b s12 = lynxActivity.s1();
        f M1 = lynxActivity.M1();
        LynxPluginHelperKt$initCorePlugin$plugin$1 lynxPluginHelperKt$initCorePlugin$plugin$1 = new LynxPluginHelperKt$initCorePlugin$plugin$1(lynxActivity2);
        bf0.a B = lynxActivity.f().B();
        p.i(B, "cartService.cart");
        ArrayList<a> arrayList2 = arrayList;
        SwiggyLynxCorePlugin swiggyLynxCorePlugin = new SwiggyLynxCorePlugin(lynxActivity, w12, webView, lynxActivity.b2(), lynxActivity.F1(), lynxActivity.K1(), LynxActivity.class, X1, s12, M1, lynxActivity, lynxPluginHelperKt$initCorePlugin$plugin$1, (lp0.a) null, B, lynxActivity.e2(), (l) null, intent, lynxActivity.a2(), lynxActivity.R0(), lynxActivity.c2(), lynxActivity.Q1(), lynxActivity.Y1(), lynxActivity.D1(), lynxActivity.L1(), lynxActivity.g2(), lynxActivity.N1(), lynxActivity.t1(), lynxActivity.Z1(), (String) null, publishProcessor, lynxActivity.r1(), 268435456, (i) null);
        ArrayList<a> arrayList3 = arrayList;
        arrayList3.add(swiggyLynxCorePlugin);
        LynxActivity lynxActivity3 = lynxActivity;
        arrayList3.add(new oh0.b(lynxActivity3, lynxActivity.X1()));
        arrayList3.add(new AddressPlugin(lynxActivity, lynxActivity.F1(), lynxActivity.L1(), false, (n1) null, 24, (i) null));
        arrayList3.add(new qh0.b(lynxActivity3, lynxActivity.w1(), LynxActivity.class, new LynxPluginHelperKt$initCorePlugin$1(lynxActivity3)));
        e(lynxActivity3, arrayList3);
        arrayList3.add(new e(lynxActivity, lynxActivity.L1(), lynxActivity.R0(), lynxActivity.b2(), lynxActivity.x1()));
    }

    public static final void b(LynxActivity lynxActivity, String str, ArrayList<a> arrayList) {
        ArrayList<a> arrayList2 = arrayList;
        p.j(lynxActivity, "<this>");
        String str2 = str;
        p.j(str2, "url");
        p.j(arrayList2, "pluginList");
        arrayList2.add(new DashPlugin(lynxActivity, lynxActivity, lynxActivity.X1(), lynxActivity.K1(), lynxActivity.M1(), lynxActivity.F1(), lynxActivity.b2(), lynxActivity.R0(), lynxActivity.x1(), str2, lynxActivity.N1(), lynxActivity.f()));
    }

    public static final void c(LynxActivity lynxActivity, String str, ArrayList<a> arrayList, eo0.a aVar) {
        LynxActivity lynxActivity2 = lynxActivity;
        ArrayList<a> arrayList2 = arrayList;
        eo0.a aVar2 = aVar;
        p.j(lynxActivity2, "<this>");
        p.j(arrayList2, "pluginList");
        p.j(aVar2, "subscriptions");
        JuspaySdkWrapper juspaySdkWrapper = new JuspaySdkWrapper(lynxActivity2, lynxActivity.b2(), lynxActivity.N1(), lynxActivity.X1());
        ch0.a aVar3 = new ch0.a(aVar, lynxActivity, lynxActivity.N1(), LynxActivity.class, false, (n1) null, lynxActivity.X1());
        eh0.f fVar = new eh0.f(lynxActivity.X1(), juspaySdkWrapper, aVar2, lynxActivity.P1());
        bf0.a B = lynxActivity.f().B();
        bf0.a aVar4 = B;
        p.i(B, "cartService.cart");
        ch0.a aVar5 = aVar3;
        ArrayList<a> arrayList3 = arrayList2;
        LynxActivity lynxActivity3 = lynxActivity2;
        PaymentCorePlugin paymentCorePlugin = new PaymentCorePlugin(lynxActivity, str, aVar4, aVar, lynxActivity.K1(), lynxActivity.X1(), lynxActivity.N1(), lynxActivity.M1(), (l<? super Intent, k>) null, false, lynxActivity.w1(), lynxActivity, lynxActivity.P1(), lynxActivity.v1(), lynxActivity.a2(), lynxActivity.b2());
        LynxActivity lynxActivity4 = lynxActivity3;
        ArrayList<a> arrayList4 = arrayList3;
        kh0.b bVar = new kh0.b(lynxActivity, lynxActivity.X1(), lynxActivity.N1(), false, (n1) null);
        AmazonPlugin amazonPlugin = new AmazonPlugin(aVar5, lynxActivity.X1(), lynxActivity.N1());
        jh0.b bVar2 = new jh0.b(lynxActivity4, lynxActivity.N1(), false, (n1) null);
        WalletPlugin walletPlugin = new WalletPlugin(lynxActivity.b2(), lynxActivity, lynxActivity, lynxActivity.X1(), lynxActivity.N1());
        arrayList4.add(paymentCorePlugin);
        arrayList4.add(bVar);
        arrayList4.add(fVar);
        arrayList4.add(amazonPlugin);
        arrayList4.add(bVar2);
        arrayList4.add(walletPlugin);
    }

    public static final void d(RestEmpathyResponsePayload restEmpathyResponsePayload, ArrayList<a> arrayList) {
        p.j(restEmpathyResponsePayload, PaymentConstants.PAYLOAD);
        p.j(arrayList, "pluginList");
        arrayList.add(new lh0.b(restEmpathyResponsePayload));
    }

    public static final void e(LynxActivity lynxActivity, ArrayList<a> arrayList) {
        p.j(lynxActivity, "<this>");
        p.j(arrayList, "pluginList");
        a b11 = sh0.a.Companion.b(lynxActivity.z1(), lynxActivity.X1(), lynxActivity.F1(), lynxActivity.s1());
        if (b11 != null) {
            arrayList.add(b11);
        }
    }

    public static final void f(Activity activity, lp0.a<LynxData> aVar) {
        p.j(activity, "<this>");
        p.j(aVar, RenderingDetails.TYPE_BLOCK);
        LynxData invoke = aVar.invoke();
        int requestCode = invoke.getRequestCode();
        Intent intent = new Intent(activity, LynxActivity.class);
        intent.putExtras(new j(invoke, false, (DeliveryRatingClickEventNavArgs) null, (String) null, (String) null, (String) null, (String) null, 126, (i) null).h());
        if (requestCode == -9) {
            activity.startActivity(intent, (Bundle) null);
        } else {
            activity.startActivityForResult(intent, requestCode, (Bundle) null);
        }
    }

    public static final void g(n1 n1Var, Bundle bundle) {
        p.j(n1Var, "<this>");
        p.j(bundle, "bundle");
        Context context = n1Var.getContext();
        p.i(context, LogCategory.CONTEXT);
        Intent intent = new Intent(context, LynxActivity.class);
        intent.putExtras(bundle);
        n1Var.S(intent);
    }

    public static final void h(n1 n1Var, lp0.a<LynxData> aVar) {
        p.j(n1Var, "<this>");
        p.j(aVar, RenderingDetails.TYPE_BLOCK);
        LynxData invoke = aVar.invoke();
        int requestCode = invoke.getRequestCode();
        Context context = n1Var.getContext();
        p.i(context, LogCategory.CONTEXT);
        Intent intent = new Intent(context, LynxActivity.class);
        intent.putExtras(new j(invoke, false, (DeliveryRatingClickEventNavArgs) null, (String) null, (String) null, (String) null, (String) null, 126, (i) null).h());
        if (requestCode == -9) {
            n1Var.S(intent);
        } else {
            n1Var.G(intent, requestCode);
        }
    }
}
