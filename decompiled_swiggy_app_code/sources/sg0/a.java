package sg0;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import vr.a;
import zp.b;
import zp.d;

/* compiled from: BottomBarPlugin.kt */
public final class a implements vr.a {
    public static final C0243a Companion = new C0243a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final tr.a f19882b;

    /* renamed from: sg0.a$a  reason: collision with other inner class name */
    /* compiled from: BottomBarPlugin.kt */
    public static final class C0243a {
        private C0243a() {
        }

        public /* synthetic */ C0243a(i iVar) {
            this();
        }
    }

    public a(tr.a aVar) {
        p.j(aVar, "bottomBarSwitchHandler");
        this.f19882b = aVar;
    }

    private final void c(b bVar, String str) {
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
    }

    public void D0(ur.a aVar, String str, b bVar) {
        p.j(aVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        this.f19882b.V(aVar.b());
        c(bVar, str);
    }

    public void G0(lp.a aVar, b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    public List<np.b> T() {
        return a.b.b(this);
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
