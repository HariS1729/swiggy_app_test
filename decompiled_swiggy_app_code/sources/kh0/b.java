package kh0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.payment.upiplugin.isupiavailable.IsUpiAvailableRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.upiplugin.isupiavailable.IsUpiAvailableResponsePayload;
import in.swiggy.android.swiggylynx.plugin.payment.upiplugin.upitransaction.UpiTransactionRequestPayload;
import in.swiggy.android.swiggylynx.plugin.payment.upiplugin.upitransaction.UpiTransactionResponsePayload;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import js.c;
import kh0.a;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import mb0.n1;
import os.u;
import wh0.d;
import zp.b;

/* compiled from: UpiPlugin.kt */
public class b implements a {
    public static final a Companion = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final d f19653b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f19654c;

    /* renamed from: d  reason: collision with root package name */
    private final jr.a f19655d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f19656e;

    /* renamed from: f  reason: collision with root package name */
    private final n1 f19657f;

    /* renamed from: g  reason: collision with root package name */
    private zp.b f19658g;

    /* renamed from: h  reason: collision with root package name */
    private String f19659h;

    /* renamed from: i  reason: collision with root package name */
    private String f19660i;

    /* compiled from: UpiPlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public b(d dVar, SharedPreferences sharedPreferences, jr.a aVar, boolean z11, n1 n1Var) {
        p.j(dVar, "lynxViewComponent");
        p.j(sharedPreferences, "sharedPreferences");
        p.j(aVar, "newrelicPerformanceUtils");
        this.f19653b = dVar;
        this.f19654c = sharedPreferences;
        this.f19655d = aVar;
        this.f19656e = z11;
        this.f19657f = n1Var;
    }

    public void G0(lp.a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    public void M0(UpiTransactionRequestPayload upiTransactionRequestPayload, String str, zp.b bVar) {
        p.j(upiTransactionRequestPayload, "upiTransactionRequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        try {
            this.f19660i = str;
            this.f19659h = upiTransactionRequestPayload.b().b();
            this.f19658g = bVar;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(upiTransactionRequestPayload.b().c()));
            intent.setPackage(upiTransactionRequestPayload.b().a());
            if (this.f19656e) {
                n1 n1Var = this.f19657f;
                if (n1Var != null) {
                    n1Var.G(intent, 877);
                    return;
                }
                return;
            }
            this.f19653b.startActivityForResult(intent, 877);
        } catch (Exception e11) {
            String message = e11.getMessage();
            mp.a aVar = mp.a.f53029a;
            bVar.c(str, 1, message, aVar, aVar.a());
        }
    }

    /* renamed from: c */
    public ArrayList<np.b> T() {
        return a.b.b(this);
    }

    public void h() {
        a.b.a(this);
    }

    public boolean i0(WebResourceRequest webResourceRequest, zp.d dVar) {
        return a.b.e(this, webResourceRequest, dVar);
    }

    public boolean n(ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        return a.b.d(this, iLynxViewUpdateHandler);
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 != 877) {
            return;
        }
        if (i12 == -1) {
            String str = this.f19659h;
            zp.b bVar = this.f19658g;
            String str2 = this.f19660i;
            this.f19659h = null;
            this.f19658g = null;
            this.f19660i = null;
            if (str != null && bVar != null && str2 != null) {
                b.a.a(bVar, str2, 0, (String) null, new UpiTransactionResponsePayload("SUCCESS", str), UpiTransactionResponsePayload.Companion.serializer(), 2, (Object) null);
                return;
            }
            return;
        }
        String str3 = this.f19659h;
        zp.b bVar2 = this.f19658g;
        String str4 = this.f19660i;
        this.f19659h = null;
        this.f19658g = null;
        this.f19660i = null;
        if (str3 != null && bVar2 != null && str4 != null) {
            bVar2.a(str4, 1, (String) null, new UpiTransactionResponsePayload("FAILURE", str3), UpiTransactionResponsePayload.Companion.serializer());
        }
    }

    public void onNewIntent(Intent intent) {
        a.b.f(this, intent);
    }

    public final boolean p(String str) {
        String string = this.f19654c.getString("is_app_upi_ready", "false");
        if (string == null) {
            string = "";
        }
        boolean z11 = false;
        if (!c.p(string, false)) {
            return true;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("upi://pay"));
            Context N0 = this.f19653b.N0();
            List<ResolveInfo> list = null;
            PackageManager packageManager = N0 == null ? null : N0.getPackageManager();
            if (packageManager != null) {
                list = packageManager.queryIntentActivities(intent, 0);
            }
            if (list != null) {
                for (ResolveInfo resolveInfo : list) {
                    if (p.e(resolveInfo.activityInfo.packageName, str)) {
                        z11 = true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e11) {
            HashMap hashMap = new HashMap();
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            hashMap.put("excp_error_message", message);
            if (str == null) {
                str = "";
            }
            hashMap.put("package_name", str);
            hashMap.put("payment_platform", "web");
            this.f19655d.b("upi_app_name_not_found_exception", hashMap);
        }
        return z11;
    }

    public void v(IsUpiAvailableRequestPayload isUpiAvailableRequestPayload, String str, zp.b bVar) {
        p.j(isUpiAvailableRequestPayload, "isUpiAvailableRequestPayload");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        Context N0 = this.f19653b.N0();
        if (N0 != null) {
            ArrayList<String> b11 = isUpiAvailableRequestPayload.b();
            ArrayList arrayList = new ArrayList();
            for (T next : b11) {
                String str2 = (String) next;
                boolean z11 = false;
                try {
                    N0.getPackageManager().getPackageInfo(str2, 0);
                    z11 = p(str2);
                } catch (PackageManager.NameNotFoundException e11) {
                    u.d("UpiPlugin", e11.getMessage());
                }
                if (z11) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            b.a.a(bVar, str, 0, (String) null, new IsUpiAvailableResponsePayload(arrayList2), IsUpiAvailableResponsePayload.Companion.serializer(), 2, (Object) null);
        }
    }
}
