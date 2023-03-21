package pg0;

import android.os.Bundle;
import in.swiggy.android.swiggylynx.model.PaymentType;
import in.swiggy.android.swiggylynx.model.WebViewLastState;

/* compiled from: LynxStateManager.kt */
public interface a {
    void a(WebViewLastState webViewLastState);

    void b(Bundle bundle);

    void c(Bundle bundle);

    di0.a d();

    boolean e(Bundle bundle);

    void f(di0.a aVar);

    boolean g(Bundle bundle);

    PaymentType getPaymentType();

    String getState();

    void h(String str);

    void reset();
}
