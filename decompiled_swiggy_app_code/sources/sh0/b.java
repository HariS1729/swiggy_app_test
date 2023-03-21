package sh0;

import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.WebResourceRequest;
import cg0.n;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.tns.Location;
import in.swiggy.android.swiggylynx.plugin.tns.TnsIngestionPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import lp.a;
import os.g0;
import sh0.a;
import zp.b;
import zp.d;

@Instrumented
/* compiled from: TnsPlugin.kt */
public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f19885b;

    /* renamed from: c  reason: collision with root package name */
    private final ps.b f19886c;

    /* renamed from: d  reason: collision with root package name */
    private final n f19887d;

    public b(SharedPreferences sharedPreferences, ps.b bVar, n nVar) {
        p.j(sharedPreferences, "sharedPreferences");
        p.j(bVar, "contextService");
        p.j(nVar, "locationContext");
        this.f19885b = sharedPreferences;
        this.f19886c = bVar;
        this.f19887d = nVar;
    }

    public void G0(a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    /* renamed from: c */
    public ArrayList<np.b> T() {
        return a.b.b(this);
    }

    public void e0(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, "tnsIngestionPayload");
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        String string = this.f19885b.getString("API_INTEGRITY", "");
        String valueOf = String.valueOf(g0.q(this.f19886c.f(), "in.swiggy.deliveryapp"));
        String l11 = g0.l(true);
        Gson i11 = g0.i();
        Location location = new Location(String.valueOf(this.f19887d.getLocation().getLatitude()), String.valueOf(this.f19887d.getLocation().getLongitude()));
        b.a.a(bVar2, str, 0, (String) null, new TnsIngestionPayload(string, valueOf, String.valueOf(1115), !(i11 instanceof Gson) ? i11.toJson((Object) location) : GsonInstrumentation.toJson(i11, (Object) location), l11), TnsIngestionPayload.Companion.serializer(), 6, (Object) null);
    }

    public void h() {
        a.b.a(this);
    }

    public boolean i0(WebResourceRequest webResourceRequest, d dVar) {
        return a.b.e(this, webResourceRequest, dVar);
    }

    public boolean n(ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        return a.b.d(this, iLynxViewUpdateHandler);
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        a.b.f(this, i11, i12, intent);
    }

    public void onNewIntent(Intent intent) {
        a.b.g(this, intent);
    }
}
