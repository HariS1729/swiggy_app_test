package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import os.o;

/* compiled from: JuspaySdkWrapper.kt */
final class JuspaySdkWrapper$geekStatsPrefs$2 extends Lambda implements a<SharedPreferences> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ JuspaySdkWrapper f19270a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    JuspaySdkWrapper$geekStatsPrefs$2(JuspaySdkWrapper juspaySdkWrapper) {
        super(0);
        this.f19270a = juspaySdkWrapper;
    }

    public final SharedPreferences invoke() {
        Context applicationContext = this.f19270a.f19246a.getApplicationContext();
        p.i(applicationContext, "fragmentActivity.applicationContext");
        return o.h(applicationContext);
    }
}
