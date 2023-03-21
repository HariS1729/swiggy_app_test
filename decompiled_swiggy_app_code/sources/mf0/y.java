package mf0;

import com.newrelic.agent.android.agentdata.HexAttribute;
import in.swiggy.android.tejas.oldapi.models.track.delfee.DelFeeNotificationEventData;
import ir.b;
import kotlin.jvm.internal.p;
import os.g0;

/* compiled from: KabootarNotificationAnalyticsHandler.kt */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f19750a = new y();

    private y() {
    }

    public final void a(String str, String str2, String str3, b bVar) {
        p.j(str, "pnId");
        p.j(str2, HexAttribute.HEX_ATTR_MESSAGE);
        p.j(str3, "orderId");
        p.j(bVar, "swiggyEventHandler");
        String json = g0.i().toJson((Object) new DelFeeNotificationEventData(str, str2));
        p.i(json, "getGson().toJson(\n      …e\n            )\n        )");
        bVar.i(bVar.k("notification", "impression-delfee-pn", str3, 9999, json));
    }

    public final void b(String str, int i11, b bVar) {
        p.j(str, "messageID");
        p.j(bVar, "swiggyEventHandler");
        bVar.i(bVar.k("nps", "impression-nps-notification-dismissed", str, i11, "-"));
    }

    public final void c(String str, int i11, b bVar) {
        p.j(str, "messageID");
        p.j(bVar, "swiggyEventHandler");
        bVar.i(bVar.k("nps", "impression-nps-notification-received", str, i11, "-"));
    }

    public final void d(b bVar, String str) {
        p.j(bVar, "swiggyEventHandler");
        if (str == null) {
            str = "-";
        }
        bVar.i(bVar.l("store-track", "impression-ni-notification-dismissed", str, "-", "-"));
    }

    public final void e(b bVar, String str, String str2) {
        p.j(bVar, "swiggyEventHandler");
        if (str == null) {
            str = "-";
        }
        bVar.i(bVar.l("store-track", "impression-ni-notification-received", str, str2, "-"));
    }

    public final void f(String str, b bVar, String str2, String str3) {
        p.j(str, "type");
        p.j(bVar, "swiggyEventHandler");
        if (p.e(str, "NI")) {
            if (str2 == null) {
                str2 = "-";
            }
            bVar.j(bVar.l("store-track", "click-ni-notification-clicked", str2, str3, "-"));
        }
    }
}
