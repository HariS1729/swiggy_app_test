package di0;

import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.orderfailed.OrderFailedRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.postorder.PostOrderRequestPayload;
import in.swiggy.android.tejas.feature.order.legacy.model.PaymentMethodData;
import in.swiggy.android.tejas.payment.model.payment.models.PaymentType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.p;
import os.g0;
import os.u;

@Instrumented
/* compiled from: PaymentHelper.kt */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f18281a = new q();

    /* compiled from: KotlinExtensions.kt */
    public static final class a extends TypeToken<PaymentMethodData> {
    }

    private q() {
    }

    public final boolean a(OrderFailedRequestPayload orderFailedRequestPayload) {
        Object obj;
        p.j(orderFailedRequestPayload, PaymentConstants.PAYLOAD);
        try {
            String valueOf = String.valueOf(orderFailedRequestPayload.d());
            String str = null;
            try {
                Gson j = g0.j();
                p.i(j, "getGsonBinaryBooleanSerializer()");
                Type type = new a().getType();
                obj = !(j instanceof Gson) ? j.fromJson(valueOf, type) : GsonInstrumentation.fromJson(j, valueOf, type);
            } catch (Throwable th2) {
                u.h("Extension", th2);
                obj = null;
            }
            PaymentMethodData paymentMethodData = (PaymentMethodData) obj;
            if (paymentMethodData != null) {
                str = paymentMethodData.getGroupName();
            }
            return p.e(str, PaymentType.CARD_GROUP);
        } catch (Exception e11) {
            u.h("PaymentHelper", e11);
            return false;
        }
    }

    public final boolean b(PostOrderRequestPayload postOrderRequestPayload) {
        p.j(postOrderRequestPayload, PaymentConstants.PAYLOAD);
        try {
            if (postOrderRequestPayload.d().get("payment_method") == null) {
                return true;
            }
            return StringsKt__StringsKt.S(String.valueOf(postOrderRequestPayload.d().get("payment_method")), PaymentType.CARD_GROUP, false, 2, (Object) null);
        } catch (Exception e11) {
            u.h("PaymentHelper", e11);
            return false;
        }
    }

    public final void c(SharedPreferences sharedPreferences, AppCompatActivity appCompatActivity, boolean z11) {
        p.j(sharedPreferences, "preferences");
        p.j(appCompatActivity, "activity");
        String string = sharedPreferences.getString("disable_screen_capturing_at_payment_screen", "true");
        if (string == null) {
            string = "";
        }
        if (!p.e(string, "true")) {
            return;
        }
        if (z11) {
            appCompatActivity.getWindow().setFlags(8192, 8192);
        } else {
            appCompatActivity.getWindow().clearFlags(8192);
        }
    }
}
