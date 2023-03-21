package in.swiggy.android.swiggylynx.plugin.location;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import androidx.fragment.app.FragmentActivity;
import cg0.n;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.swiggylynx.plugin.location.selectedlocation.SelectedLocationPayload;
import in.swiggy.android.tejas.feature.address.model.Address;
import java.util.List;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import us.f;
import yg0.a;
import zp.b;
import zp.d;

/* compiled from: LocationPlugin.kt */
public class LocationPlugin implements yg0.a {
    public static final a Companion = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final FragmentActivity f19149b;

    /* renamed from: c  reason: collision with root package name */
    private final n f19150c;

    /* renamed from: d  reason: collision with root package name */
    private final f f19151d;

    /* renamed from: e  reason: collision with root package name */
    private b f19152e;

    /* renamed from: f  reason: collision with root package name */
    private String f19153f;

    /* compiled from: LocationPlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public LocationPlugin(FragmentActivity fragmentActivity, n nVar, f fVar) {
        p.j(fragmentActivity, "activity");
        p.j(nVar, "locationContext");
        this.f19149b = fragmentActivity;
        this.f19150c = nVar;
        this.f19151d = fVar;
    }

    private final void W0() {
        this.f19153f = null;
        this.f19152e = null;
    }

    /* access modifiers changed from: private */
    public final void Y0(b bVar, String str) {
        String str2;
        String str3;
        n nVar = this.f19150c;
        String R = nVar.R();
        double latitude = nVar.getLatitude();
        double longitude = nVar.getLongitude();
        String addressId = nVar.getAddressId();
        String str4 = addressId == null ? "" : addressId;
        p.i(R, "annotation");
        String F0 = nVar.F0();
        if (F0 == null) {
            str2 = "";
        } else {
            str2 = F0;
        }
        Address p02 = nVar.p0();
        if (p02 == null || (str3 = p02.getAnnotationTagString()) == null) {
            str3 = "Other";
        }
        b.a.a(bVar, str, 0, (String) null, new SelectedLocationPayload(latitude, longitude, str4, R, str2, str3), SelectedLocationPayload.Companion.serializer(), 6, (Object) null);
    }

    public void G0(lp.a aVar, b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    public void Q0(lp.b bVar, String str, b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        Y0(bVar2, str);
    }

    public List<np.b> T() {
        return a.b.b(this);
    }

    /* access modifiers changed from: protected */
    public final void X0(String str, b bVar) {
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        this.f19153f = str;
        this.f19152e = bVar;
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
        if (i11 == 145) {
            c.o(this.f19152e, this.f19153f, new LocationPlugin$onActivityResult$1(this));
        }
        W0();
    }

    public void onNewIntent(Intent intent) {
        a.b.f(this, intent);
    }

    /* access modifiers changed from: protected */
    public final f p() {
        return this.f19151d;
    }

    public void r(lp.b bVar, String str, b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        X0(str, bVar2);
        f fVar = this.f19151d;
        if (fVar != null) {
            fVar.N(this.f19149b);
        }
    }
}
