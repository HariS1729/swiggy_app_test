package c4;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import tq0.a;

/* compiled from: WebkitToCompatConverter */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f12820a;

    public g(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f12820a = webkitToCompatConverterBoundaryInterface;
    }

    public c a(WebSettings webSettings) {
        return new c((WebSettingsBoundaryInterface) a.a(WebSettingsBoundaryInterface.class, this.f12820a.convertSettings(webSettings)));
    }
}
