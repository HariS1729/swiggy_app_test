package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions.a;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import zp.b;

/* compiled from: PermissionsPlugin.kt */
public final class PermissionsPlugin extends a {
    public static final a Companion = new a((i) null);

    /* renamed from: f  reason: collision with root package name */
    private final ComponentActivity f19455f;

    /* renamed from: g  reason: collision with root package name */
    private final a.b f19456g;

    /* renamed from: h  reason: collision with root package name */
    private b f19457h;

    /* renamed from: i  reason: collision with root package name */
    private String f19458i;
    private String j;

    /* compiled from: PermissionsPlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public PermissionsPlugin(ComponentActivity componentActivity) {
        p.j(componentActivity, "activity");
        this.f19455f = componentActivity;
        this.f19456g = new a.b(this, this, componentActivity);
    }

    private final boolean b1(String str) {
        return androidx.core.content.a.a(this.f19455f, str) == 0;
    }

    private final void c1() {
        this.j = null;
        this.f19458i = null;
        this.f19457h = null;
    }

    private final void d1(PermissionStatus permissionStatus) {
        c.o(this.f19458i, this.f19457h, new PermissionsPlugin$sendPermissionStatusResponse$1(permissionStatus));
        c1();
    }

    private final boolean e1(String str) {
        return androidx.core.app.b.y(this.f19455f, str);
    }

    public void W0(lp.b bVar, String str, b bVar2) {
        p.j(bVar, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar2, "responseHandler");
        ComponentActivity componentActivity = this.f19455f;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.f19455f.getPackageName(), (String) null));
        componentActivity.startActivity(intent);
        mp.a aVar = mp.a.f53029a;
        b.a.a(bVar2, str, 0, (String) null, aVar, aVar.a(), 6, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void X0() {
        d1(PermissionStatus.DENIED);
    }

    /* access modifiers changed from: protected */
    public void Y0() {
        d1(PermissionStatus.GRANTED);
    }

    public void Z0(PermissionRequestPayload permissionRequestPayload, String str, b bVar) {
        p.j(permissionRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        this.f19457h = bVar;
        this.f19458i = str;
        this.j = permissionRequestPayload.b();
        this.f19456g.b(permissionRequestPayload.b());
    }

    public void a1(PermissionRequestPayload permissionRequestPayload, String str, b bVar) {
        p.j(permissionRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        b.a.a(bVar, str, 0, (String) null, new ShowRationaleResponsePayload(e1(permissionRequestPayload.b())), ShowRationaleResponsePayload.Companion.serializer(), 6, (Object) null);
    }

    public void c(PermissionRequestPayload permissionRequestPayload, String str, b bVar) {
        p.j(permissionRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        b.a.a(bVar, str, 0, (String) null, new CheckPermissionResponsePayload(b1(permissionRequestPayload.b())), CheckPermissionResponsePayload.Companion.serializer(), 6, (Object) null);
    }
}
