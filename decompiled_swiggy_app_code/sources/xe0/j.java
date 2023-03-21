package xe0;

import bp0.h;
import com.newrelic.agent.android.NewRelic;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;
import os.u;

/* compiled from: StoreIdEmptyNrLogger.kt */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f19986a = new j();

    private j() {
    }

    public final void a(String str, boolean z11) {
        p.j(str, LogCategory.CONTEXT);
        try {
            NewRelic.recordCustomEvent("swiggy_generic_event", "empty_store_id_set_in_im_cart", x.i(h.a(LogCategory.CONTEXT, str), h.a("is_im_cart_empty", Boolean.valueOf(z11))));
        } catch (Throwable th2) {
            u.h("StoreIdEmptyNrLogger", th2);
        }
    }
}
