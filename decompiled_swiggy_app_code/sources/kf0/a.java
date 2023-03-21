package kf0;

import android.content.SharedPreferences;
import android.net.Uri;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import ef0.f;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.network.HttpRequest;
import in.swiggy.android.tejas.oldapi.models.KeySeparator;
import java.net.URLEncoder;
import js.c;
import kotlin.jvm.internal.p;
import org.json.JSONException;
import org.json.JSONObject;
import os.d0;
import os.u;

@Instrumented
/* compiled from: SearchUtils.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19639a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f19640b;

    private a() {
    }

    private final String c(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put(str2, str3);
            String jSONObjectInstrumentation = JSONObjectInstrumentation.toString(jSONObject);
            p.i(jSONObjectInstrumentation, "{\n            val jsonOb…nObj.toString()\n        }");
            return jSONObjectInstrumentation;
        } catch (JSONException e11) {
            u.h("SearchUtils", e11);
            return str;
        }
    }

    private final String p(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (JSONException e11) {
            u.h("SearchUtils", e11);
            return null;
        }
    }

    private final String v(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.remove(str2);
            jSONObject.put(str2, str3);
            String jSONObjectInstrumentation = JSONObjectInstrumentation.toString(jSONObject);
            p.i(jSONObjectInstrumentation, "{\n            val jsonOb…nObj.toString()\n        }");
            return jSONObjectInstrumentation;
        } catch (JSONException e11) {
            u.h("SearchUtils", e11);
            return str;
        }
    }

    public final String a(String str, boolean z11) {
        p.j(str, "json");
        return c(str, "adFlag", String.valueOf(z11));
    }

    public final String b(String str, boolean z11) {
        p.j(str, "json");
        return c(str, "imageFlag", String.valueOf(z11));
    }

    public final String d(String str, String str2, String str3) {
        p.j(str, "json");
        p.j(str2, HttpRequest.HEADER_KEY);
        p.j(str3, "value");
        return c(str, str2, str3);
    }

    public final String e(String str, String str2) {
        p.j(str, "json");
        p.j(str2, "source");
        return c(str, "clickTilePosition", str2);
    }

    public final String f(String str, String str2) {
        p.j(str, "json");
        p.j(str2, "source");
        return c(str, "Source", str2);
    }

    public final String g(String str, String str2) {
        p.j(str, "json");
        p.j(str2, "trackingId");
        return c(str, "trackingId", str2);
    }

    public final String h(String str, String str2, String str3) {
        p.j(str, "json");
        p.j(str2, HttpRequest.HEADER_KEY);
        p.j(str3, "value");
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put(str2, str3);
            String jSONObjectInstrumentation = JSONObjectInstrumentation.toString(jSONObject);
            p.i(jSONObjectInstrumentation, "{\n            val jsonOb…nObj.toString()\n        }");
            return jSONObjectInstrumentation;
        } catch (JSONException e11) {
            u.h("SearchUtils", e11);
            return str;
        }
    }

    public final String i(String str, String str2) {
        p.j(str, "ctaLink");
        p.j(str2, "queryParam");
        String str3 = "?";
        if (StringsKt__StringsKt.S(str, str3, false, 2, (Object) null)) {
            str3 = KeySeparator.AMP;
        }
        return p.s(p.s(str, str3), str2);
    }

    public final String j(String str, String str2) {
        p.j(str, "cta");
        p.j(str2, "placeholder");
        return StringsKt__StringsKt.S(str, "contextualSearch", false, 2, (Object) null) ? i(str, p.s("placeholder=", str2)) : str;
    }

    public final String k(String str, String str2) {
        p.j(str, "ctaLink");
        p.j(str2, "trackingId");
        String str3 = "?";
        if (StringsKt__StringsKt.S(str, str3, false, 2, (Object) null)) {
            str3 = KeySeparator.AMP;
        }
        return p.s(str, str3 + "randomTrackingId=" + str2);
    }

    public final boolean l() {
        return f19640b;
    }

    public final String m(String str) {
        String host;
        p.j(str, "link");
        Uri parse = Uri.parse(str);
        if (parse == null || (host = parse.getHost()) == null || !d0.f(parse.getQueryParameter(ECommerceParamNames.QUERY)) || d0.e(host)) {
            return null;
        }
        if (p.e(host, "explore") || p.e(host, "search")) {
            return parse.getQueryParameter(ECommerceParamNames.QUERY);
        }
        return null;
    }

    public final String n(String str) {
        p.j(str, ECommerceParamNames.QUERY);
        return p.s("swiggy://search?query=", URLEncoder.encode(str));
    }

    public final String o(String str) {
        p.j(str, "json");
        return p(str, "trackingId");
    }

    public final boolean q(String str, CTA cta) {
        p.j(str, "screenName");
        p.j(cta, "cta");
        if (p.e(str, "explore")) {
            String link = cta.getLink();
            if (link != null && StringsKt__StringsKt.S(link, "swiggy://search", false, 2, (Object) null)) {
                return true;
            }
            String link2 = cta.getLink();
            if (link2 != null && StringsKt__StringsKt.S(link2, "swiggy://explore", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(String str) {
        p.j(str, "ctaLink");
        return StringsKt__StringsKt.S(str, "swiggy://stores/go", false, 2, (Object) null);
    }

    public final boolean s(SharedPreferences sharedPreferences, f fVar) {
        p.j(sharedPreferences, "sharedPreferences");
        p.j(fVar, "xpExperimentContext");
        if (!c.q(sharedPreferences.getString("global_search_revamp_enabled", "false"), false, 1, (Object) null) || !p.e(fVar.u0("search_global_bar", "false"), "true")) {
            return false;
        }
        return true;
    }

    public final boolean t(String str) {
        p.j(str, "ctaLink");
        return StringsKt__StringsKt.S(str, "swiggy://stores/instamart?v=1", false, 2, (Object) null);
    }

    public final String u(String str, String str2, String str3) {
        p.j(str, "json");
        p.j(str2, HttpRequest.HEADER_KEY);
        p.j(str3, "value");
        return v(str, str2, str3);
    }

    public final void w(boolean z11) {
        f19640b = z11;
    }
}
