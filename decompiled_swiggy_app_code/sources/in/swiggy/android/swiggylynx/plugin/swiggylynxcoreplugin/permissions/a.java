package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import androidx.activity.ComponentActivity;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import e.c;
import in.juspay.hyper.constants.Labels;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions.PermissionRequestPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import zp.d;

/* compiled from: AbstractPermissionsPlugin.kt */
public abstract class a implements np.a {
    public static final C0229a Companion = new C0229a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private static final np.b f19461b;

    /* renamed from: c  reason: collision with root package name */
    private static final np.b f19462c;

    /* renamed from: d  reason: collision with root package name */
    private static final np.b f19463d;

    /* renamed from: e  reason: collision with root package name */
    private static final np.b f19464e = new np.b("LAUNCH_APP_SETTINGS", lp.b.Companion.a());

    /* renamed from: in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractPermissionsPlugin.kt */
    public static final class C0229a {
        private C0229a() {
        }

        public /* synthetic */ C0229a(i iVar) {
            this();
        }
    }

    /* compiled from: AbstractPermissionsPlugin.kt */
    protected final class b {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.activity.result.b<String> f19465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f19466b;

        public b(a aVar, a aVar2, ComponentActivity componentActivity) {
            p.j(aVar, "this$0");
            p.j(aVar2, "plugin");
            p.j(componentActivity, "activity");
            this.f19466b = aVar;
            androidx.activity.result.b<String> registerForActivityResult = componentActivity.registerForActivityResult(new c(), new nh0.a(aVar2));
            p.i(registerForActivityResult, "activity.registerForActi…          }\n            }");
            this.f19465a = registerForActivityResult;
        }

        /* access modifiers changed from: private */
        public static final void c(a aVar, Boolean bool) {
            p.j(aVar, "$plugin");
            p.i(bool, "granted");
            if (bool.booleanValue()) {
                aVar.Y0();
            } else {
                aVar.X0();
            }
        }

        public final void b(String str) {
            p.j(str, Labels.System.PERMISSION);
            this.f19465a.a(str);
        }
    }

    static {
        PermissionRequestPayload.Companion companion = PermissionRequestPayload.Companion;
        f19461b = new np.b("CHECK_PERMISSION", companion.serializer());
        f19462c = new np.b("SHOULD_SHOW_PERMISSION_RATIONALE", companion.serializer());
        f19463d = new np.b("REQUEST_PERMISSION", companion.serializer());
    }

    public void G0(lp.a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(aVar, "request");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        np.b c11 = aVar.c();
        if (p.e(c11, f19461b)) {
            c((PermissionRequestPayload) aVar.a(), aVar.b(), bVar);
        } else if (p.e(c11, f19462c)) {
            a1((PermissionRequestPayload) aVar.a(), aVar.b(), bVar);
        } else if (p.e(c11, f19463d)) {
            Z0((PermissionRequestPayload) aVar.a(), aVar.b(), bVar);
        } else if (p.e(c11, f19464e)) {
            W0(aVar.a(), aVar.b(), bVar);
        }
    }

    public abstract void W0(lp.b bVar, String str, zp.b bVar2);

    /* access modifiers changed from: protected */
    public abstract void X0();

    /* access modifiers changed from: protected */
    public abstract void Y0();

    public abstract void Z0(PermissionRequestPayload permissionRequestPayload, String str, zp.b bVar);

    public abstract void a1(PermissionRequestPayload permissionRequestPayload, String str, zp.b bVar);

    public abstract void c(PermissionRequestPayload permissionRequestPayload, String str, zp.b bVar);

    public void h() {
    }

    public boolean i0(WebResourceRequest webResourceRequest, d dVar) {
        return false;
    }

    public boolean n(ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        return false;
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
    }

    public void onNewIntent(Intent intent) {
        p.j(intent, "intent");
    }

    /* renamed from: p */
    public ArrayList<np.b> T() {
        return k.f(f19461b, f19462c, f19463d, f19464e);
    }
}
