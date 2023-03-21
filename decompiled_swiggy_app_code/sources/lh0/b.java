package lh0;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathyResponsePayload;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import lh0.a;
import lp.a;
import os.u;
import zp.b;
import zp.d;

/* compiled from: RestEmpathyPlugin.kt */
public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    private final RestEmpathyResponsePayload f19677b;

    public b(RestEmpathyResponsePayload restEmpathyResponsePayload) {
        p.j(restEmpathyResponsePayload, "responsePayload");
        this.f19677b = restEmpathyResponsePayload;
    }

    public void G0(a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    /* renamed from: c */
    public ArrayList<np.b> T() {
        return a.b.b(this);
    }

    public void d0(lp.b bVar, String str, zp.b bVar2) {
        p.j(bVar, "request");
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        u.d("TOFU", String.valueOf(this.f19677b));
        b.a.a(bVar2, str, 0, (String) null, this.f19677b, RestEmpathyResponsePayload.Companion.serializer(), 2, (Object) null);
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
