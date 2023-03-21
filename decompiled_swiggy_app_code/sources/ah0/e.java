package ah0;

import ah0.a;
import android.content.Intent;
import android.webkit.WebResourceRequest;
import androidx.appcompat.app.AppCompatActivity;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.swiggylynx.plugin.cart.login.LoginResponsePayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.login.LoginRequestPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;
import zp.b;
import zp.d;

/* compiled from: LoginPlugin.kt */
public class e implements a {
    public static final a Companion = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final AppCompatActivity f18082b;

    /* renamed from: c  reason: collision with root package name */
    private final uh0.a f18083c;

    /* renamed from: d  reason: collision with root package name */
    private final eo0.a f18084d;

    /* renamed from: e  reason: collision with root package name */
    private final ef0.e f18085e;

    /* renamed from: f  reason: collision with root package name */
    private final og0.a f18086f;

    /* compiled from: LoginPlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public e(AppCompatActivity appCompatActivity, uh0.a aVar, eo0.a aVar2, ef0.e eVar, og0.a aVar3) {
        p.j(appCompatActivity, "activity");
        p.j(aVar, "mSwiggyLynxInterface");
        p.j(aVar2, "subscriptions");
        p.j(eVar, LogSubCategory.Action.USER);
        p.j(aVar3, "defaultHeaders");
        this.f18082b = appCompatActivity;
        this.f18083c = aVar;
        this.f18084d = aVar2;
        this.f18085e = eVar;
        this.f18086f = aVar3;
    }

    /* access modifiers changed from: private */
    public static final void a1(e eVar, b bVar, String str, LoginRequestPayload loginRequestPayload, ILynxViewUpdateHandler iLynxViewUpdateHandler, Boolean bool) {
        p.j(eVar, "this$0");
        b bVar2 = bVar;
        p.j(bVar, "$responseHandler");
        String str2 = str;
        p.j(str, "$requestId");
        p.j(loginRequestPayload, "$loginRequestPayload");
        p.j(iLynxViewUpdateHandler, "$viewUpdateHandler");
        if (eVar.f18085e.o0()) {
            b.a.a(bVar, str, 0, (String) null, new LoginResponsePayload(true), LoginResponsePayload.Companion.serializer(), 6, (Object) null);
            if (loginRequestPayload.b() != null) {
                ILynxViewUpdateHandler.DefaultImpls.a(iLynxViewUpdateHandler, loginRequestPayload.b(), eVar.Y0().a(), false, false, false, (String) null, (String) null, false, 252, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void b1(e eVar, Boolean bool) {
        p.j(eVar, "this$0");
        p.i(bool, "userBlocked");
        if (bool.booleanValue()) {
            eVar.X0();
        }
    }

    /* access modifiers changed from: private */
    public static final void c1(Throwable th2) {
        u.h("LoginPlugin", th2);
    }

    public void G0(lp.a aVar, b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    public void Q(LoginRequestPayload loginRequestPayload, String str, b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(loginRequestPayload, "loginRequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        uh0.a aVar = this.f18083c;
        if (aVar != null) {
            aVar.e(this.f18082b);
        }
        this.f18084d.c(this.f18085e.g1().Q(do0.a.a()).g0(new c(this, bVar, str, loginRequestPayload, iLynxViewUpdateHandler)));
        this.f18084d.c(this.f18085e.m().Q(do0.a.a()).h0(new b(this), d.f1107a));
    }

    /* access modifiers changed from: protected */
    public void X0() {
        this.f18082b.finish();
    }

    public final og0.a Y0() {
        return this.f18086f;
    }

    /* renamed from: Z0 */
    public ArrayList<np.b> T() {
        return a.b.b(this);
    }

    public void h() {
        a.b.a(this);
    }

    public boolean i0(WebResourceRequest webResourceRequest, d dVar) {
        return a.b.e(this, webResourceRequest, dVar);
    }

    public boolean n(ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        return a.b.d(this, iLynxViewUpdateHandler);
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        a.b.f(this, i11, i12, intent);
    }

    public void onNewIntent(Intent intent) {
        a.b.g(this, intent);
    }
}
