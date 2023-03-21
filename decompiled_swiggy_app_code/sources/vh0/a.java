package vh0;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.newrelic.agent.android.agentdata.HexAttribute;
import ef0.f;
import hq0.a;
import in.swiggy.android.commons.extension.StringExtensionsKt;
import in.swiggy.android.swiggylynx.model.PaymentType;
import in.swiggy.android.swiggylynx.model.WebViewLastState;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import os.u;

/* compiled from: LynxStateManagerImpl.kt */
public final class a implements pg0.a {
    public static final C0249a Companion = new C0249a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f19943a;

    /* renamed from: b  reason: collision with root package name */
    private final f f19944b;

    /* renamed from: c  reason: collision with root package name */
    private di0.a f19945c;

    /* renamed from: d  reason: collision with root package name */
    private String f19946d;

    /* renamed from: vh0.a$a  reason: collision with other inner class name */
    /* compiled from: LynxStateManagerImpl.kt */
    public static final class C0249a {
        private C0249a() {
        }

        public /* synthetic */ C0249a(i iVar) {
            this();
        }
    }

    public a(SharedPreferences sharedPreferences, f fVar) {
        p.j(sharedPreferences, "sharedPreferences");
        p.j(fVar, "xpExperiment");
        this.f19943a = sharedPreferences;
        this.f19944b = fVar;
    }

    private final WebViewLastState i(String str) {
        Class<WebViewLastState> cls = WebViewLastState.class;
        a.C0293a aVar = hq0.a.f23147b;
        KSerializer<Object> b11 = aVar.a().b(s.b(cls));
        if (b11 == null) {
            b11 = kotlinx.serialization.a.c(s.b(cls));
        }
        if (b11 == null) {
            b11 = kotlinx.serialization.a.b(s.k(cls));
            Objects.requireNonNull(b11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T>");
        }
        return (WebViewLastState) aVar.b(b11, str);
    }

    public void a(WebViewLastState webViewLastState) {
        p.j(webViewLastState, HexAttribute.HEX_ATTR_THREAD_STATE);
        if (k() && j(webViewLastState)) {
            try {
                js.a.b(this.f19943a, "webview_last_state", webViewLastState.d());
            } catch (Exception e11) {
                u.h("LynxStateManagerImpl", e11);
            }
        }
    }

    public void b(Bundle bundle) {
        if (bundle != null) {
            bundle.putString("has_activity_recreated", "true");
        }
    }

    public void c(Bundle bundle) {
        if (!e(bundle)) {
            reset();
        }
    }

    public di0.a d() {
        return this.f19945c;
    }

    public boolean e(Bundle bundle) {
        String str = "";
        String string = bundle == null ? null : bundle.getString("has_activity_recreated", str);
        if (string != null) {
            str = string;
        }
        return p.e(str, "true");
    }

    public void f(di0.a aVar) {
        p.j(aVar, "resultData");
        this.f19945c = aVar;
    }

    public boolean g(Bundle bundle) {
        return k() && l() && StringExtensionsKt.d(getState()) && e(bundle);
    }

    public PaymentType getPaymentType() {
        try {
            return i(getState()).c();
        } catch (Exception e11) {
            u.h("LynxStateManagerImpl", e11);
            return null;
        }
    }

    public String getState() {
        String str = "";
        String string = this.f19943a.getString("webview_last_state", str);
        if (string != null) {
            str = string;
        }
        if (!StringExtensionsKt.d(str)) {
            return str;
        }
        String str2 = this.f19946d;
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        WebViewLastState i11 = i(str);
        i11.e(this.f19946d);
        return i11.d();
    }

    public void h(String str) {
        this.f19946d = str;
    }

    public final boolean j(WebViewLastState webViewLastState) {
        p.j(webViewLastState, "lastState");
        if (StringExtensionsKt.b(webViewLastState.c().getWpConfigValue())) {
            return true;
        }
        String string = this.f19943a.getString(webViewLastState.c().getWpConfigValue(), "false");
        if (string == null) {
            string = "";
        }
        return p.e(string, "true");
    }

    public final boolean k() {
        String string = this.f19943a.getString("android_enable_webview_refresh_handling", "true");
        if (string == null) {
            string = "";
        }
        return p.e(string, "true");
    }

    public final boolean l() {
        return p.e(this.f19944b.u0("payment_methods_webview_refresh", "false"), "true");
    }

    public void reset() {
        this.f19945c = null;
        this.f19943a.edit().remove("webview_last_state").apply();
    }
}
