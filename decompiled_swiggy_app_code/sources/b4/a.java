package b4;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import androidx.webkit.internal.WebViewFeatureInternal;
import c4.c;
import c4.d;

/* compiled from: WebSettingsCompat */
public class a {
    private static c a(WebSettings webSettings) {
        return d.c().a(webSettings);
    }

    @SuppressLint({"NewApi"})
    public static void b(WebSettings webSettings, int i11) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.FORCE_DARK;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            webSettings.setForceDark(i11);
        } else if (webViewFeatureInternal.isSupportedByWebView()) {
            a(webSettings).a(i11);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @SuppressLint({"NewApi"})
    public static void c(WebSettings webSettings, int i11) {
        if (WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
            a(webSettings).b(i11);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
