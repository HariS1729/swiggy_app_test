package c4;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import tq0.a;

/* compiled from: WebViewProviderFactoryAdapter */
public class f implements e {

    /* renamed from: a  reason: collision with root package name */
    WebViewProviderFactoryBoundaryInterface f12819a;

    public f(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f12819a = webViewProviderFactoryBoundaryInterface;
    }

    public String[] a() {
        return this.f12819a.getSupportedFeatures();
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) a.a(WebkitToCompatConverterBoundaryInterface.class, this.f12819a.getWebkitToCompatConverter());
    }
}
