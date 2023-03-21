package in.swiggy.android.swiggylynx.ui;

import androidx.activity.e;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: LynxActivity.kt */
final class LynxActivity$addBackPressDispatcherCallBack$1 extends Lambda implements l<e, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LynxActivity f19546a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LynxActivity$addBackPressDispatcherCallBack$1(LynxActivity lynxActivity) {
        super(1);
        this.f19546a = lynxActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        r0 = r0.getUrl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.activity.e r7) {
        /*
            r6 = this;
            java.lang.String r0 = "backPressCallBack"
            kotlin.jvm.internal.p.j(r7, r0)
            in.swiggy.android.swiggylynx.ui.LynxActivity r0 = r6.f19546a
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            int r0 = r0.p0()
            if (r0 <= 0) goto L_0x001c
            in.swiggy.android.swiggylynx.ui.LynxActivity r7 = r6.f19546a
            androidx.fragment.app.FragmentManager r7 = r7.getSupportFragmentManager()
            r7.d1()
            goto L_0x0107
        L_0x001c:
            in.swiggy.android.swiggylynx.ui.LynxActivity r0 = r6.f19546a
            in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView r0 = r0.u1()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x002a
        L_0x0028:
            r0 = 0
            goto L_0x003a
        L_0x002a:
            java.lang.String r0 = r0.getUrl()
            if (r0 != 0) goto L_0x0031
            goto L_0x0028
        L_0x0031:
            java.lang.String r5 = "custom_back=true"
            boolean r0 = kotlin.text.StringsKt__StringsKt.S(r0, r5, r4, r2, r1)
            if (r0 != r3) goto L_0x0028
            r0 = 1
        L_0x003a:
            if (r0 != 0) goto L_0x0102
            in.swiggy.android.swiggylynx.ui.LynxActivity r0 = r6.f19546a
            in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView r0 = r0.u1()
            if (r0 != 0) goto L_0x0046
        L_0x0044:
            r0 = 0
            goto L_0x0056
        L_0x0046:
            java.lang.String r0 = r0.getUrl()
            if (r0 != 0) goto L_0x004d
            goto L_0x0044
        L_0x004d:
            java.lang.String r5 = "play-game"
            boolean r0 = kotlin.text.StringsKt__StringsKt.S(r0, r5, r4, r2, r1)
            if (r0 != r3) goto L_0x0044
            r0 = 1
        L_0x0056:
            if (r0 == 0) goto L_0x005a
            goto L_0x0102
        L_0x005a:
            in.swiggy.android.swiggylynx.ui.LynxActivity r0 = r6.f19546a
            in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView r0 = r0.u1()
            if (r0 != 0) goto L_0x0064
        L_0x0062:
            r0 = 0
            goto L_0x006b
        L_0x0064:
            boolean r0 = r0.canGoBack()
            if (r0 != r3) goto L_0x0062
            r0 = 1
        L_0x006b:
            if (r0 == 0) goto L_0x006e
            return
        L_0x006e:
            in.swiggy.android.swiggylynx.ui.LynxActivity r0 = r6.f19546a
            int r1 = in.swiggy.android.swiggylynx.R.id.webContainer
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 != 0) goto L_0x007c
        L_0x007a:
            r3 = 0
            goto L_0x008a
        L_0x007c:
            int r0 = r0.getChildCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = js.c.f(r0, r3)
            if (r0 != r3) goto L_0x007a
        L_0x008a:
            if (r3 == 0) goto L_0x00bb
            in.swiggy.android.swiggylynx.ui.LynxActivity r7 = r6.f19546a
            r7.j2()
            in.swiggy.android.swiggylynx.ui.LynxActivity r7 = r6.f19546a
            android.view.View r7 = r7.findViewById(r1)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 != 0) goto L_0x009c
            goto L_0x00ab
        L_0x009c:
            in.swiggy.android.swiggylynx.ui.LynxActivity r0 = r6.f19546a
            java.util.Stack r0 = r0.G1()
            java.lang.Object r0 = r0.pop()
            android.view.View r0 = (android.view.View) r0
            r7.removeView(r0)
        L_0x00ab:
            in.swiggy.android.swiggylynx.ui.LynxActivity r7 = r6.f19546a
            java.util.Stack r0 = r7.G1()
            java.lang.Object r0 = r0.peek()
            in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView r0 = (in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView) r0
            r7.D2(r0)
            goto L_0x0107
        L_0x00bb:
            in.swiggy.android.swiggylynx.ui.LynxActivity r0 = r6.f19546a
            android.content.SharedPreferences r0 = r0.X1()
            java.lang.String r1 = "payment_pending"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00da
            in.swiggy.android.swiggylynx.ui.LynxActivity r0 = r6.f19546a
            android.content.SharedPreferences r0 = r0.X1()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
        L_0x00da:
            in.swiggy.android.swiggylynx.ui.LynxActivity r0 = r6.f19546a
            boolean r0 = r0.M
            if (r0 == 0) goto L_0x00f9
            wh0.c$a r7 = wh0.c.Companion
            wh0.c r7 = r7.a()
            in.swiggy.android.swiggylynx.ui.LynxActivity r0 = r6.f19546a
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            java.lang.String r1 = "it"
            kotlin.jvm.internal.p.i(r0, r1)
            java.lang.String r1 = "LynxActivity"
            r7.show(r0, r1)
            goto L_0x0107
        L_0x00f9:
            r7.f(r4)
            in.swiggy.android.swiggylynx.ui.LynxActivity r7 = r6.f19546a
            in.swiggy.android.swiggylynx.ui.LynxActivity$addBackPressDispatcherCallBack$1.super.onBackPressed()
            goto L_0x0107
        L_0x0102:
            in.swiggy.android.swiggylynx.ui.LynxActivity r7 = r6.f19546a
            r7.q1()
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.ui.LynxActivity$addBackPressDispatcherCallBack$1.a(androidx.activity.e):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e) obj);
        return k.f22762a;
    }
}
