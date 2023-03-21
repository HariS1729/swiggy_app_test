package amazonpay.silentpay;

import android.app.Activity;
import android.content.Context;

final class r {
    static <T> T a(T t, String str) throws IllegalArgumentException {
        if (t != null) {
            return t;
        }
        j.f("ValidationHelper", String.format("%s cannot be null", new Object[]{str}));
        throw new IllegalArgumentException(String.format("%s cannot be null", new Object[]{str}));
    }

    static void b(Context context) throws IllegalArgumentException {
        a(context, "Context");
        if (!(context instanceof Activity)) {
            j.f("ValidationHelper", "Application Context was passed");
            throw new IllegalArgumentException("Do not pass ApplicationContext. Pass activity context instead.");
        }
    }
}
