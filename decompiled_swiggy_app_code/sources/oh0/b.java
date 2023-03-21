package oh0;

import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Base64;
import android.webkit.WebResourceRequest;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.r;
import androidx.core.content.FileProvider;
import androidx.fragment.app.s;
import com.brentvatne.react.ReactVideoViewManager;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.OpenShareSheetPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.socialshare.ShareRequestPayload;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.socialshare.whatsapp.WhatsappSharePayload;
import in.swiggy.android.tejas.network.HttpRequest;
import io.sentry.instrumentation.file.l;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.Regex;
import oh0.a;
import os.u;
import ph0.c;
import ph0.d;
import ph0.f;
import ph0.h;
import ph0.j;
import ph0.k;
import ph0.l;
import ph0.m;

/* compiled from: SharePlugin.kt */
public final class b implements a {
    public static final a Companion = new a((i) null);

    /* renamed from: d  reason: collision with root package name */
    private static final Regex f19810d = new Regex("data:image/.*;base64,");

    /* renamed from: b  reason: collision with root package name */
    private final AppCompatActivity f19811b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f19812c;

    /* compiled from: SharePlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final Intent a(Uri uri, String str, String str2) {
            p.j(uri, ReactVideoViewManager.PROP_SRC_URI);
            Intent createChooser = Intent.createChooser(b(uri, str), str2);
            p.i(createChooser, "chooserIntent");
            return createChooser;
        }

        public final Intent b(Uri uri, String str) {
            p.j(uri, ReactVideoViewManager.PROP_SRC_URI);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setType("image/png");
            intent.addFlags(1);
            intent.putExtra("android.intent.extra.TEXT", str == null ? "" : str);
            intent.setClipData(new ClipData(str, new String[]{"image/png"}, new ClipData.Item(uri)));
            return intent;
        }
    }

    public b(AppCompatActivity appCompatActivity, SharedPreferences sharedPreferences) {
        p.j(appCompatActivity, "activity");
        p.j(sharedPreferences, "sharedPreferences");
        this.f19811b = appCompatActivity;
        this.f19812c = sharedPreferences;
    }

    public void G0(lp.a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    public final List<ph0.i> W0(Uri uri, ShareRequestPayload shareRequestPayload) {
        p.j(uri, "imageUri");
        p.j(shareRequestPayload, "request");
        return k.m(new j(this.f19811b, uri, shareRequestPayload.c()), new h(this.f19811b, uri, shareRequestPayload.c()), new m(this.f19811b, uri, shareRequestPayload.c()), new l(this.f19811b, this.f19812c, uri, shareRequestPayload.c()), new k(this.f19811b, uri, shareRequestPayload.c(), shareRequestPayload.d()));
    }

    public final File X0() {
        return new File(p(), "image.png");
    }

    public void Y(WhatsappSharePayload whatsappSharePayload, String str, zp.b bVar) {
        p.j(whatsappSharePayload, "request");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(HttpRequest.SHARE_TYPE);
        intent.setPackage("com.whatsapp");
        intent.putExtra("android.intent.extra.TEXT", whatsappSharePayload.c());
        try {
            this.f19811b.startActivity(intent);
        } catch (Exception e11) {
            Toast.makeText(this.f19811b, whatsappSharePayload.b(), 0).show();
            u.d("SwiggyLynxCorePlugin", e11.getMessage());
        }
    }

    public final File Y0() {
        File filesDir = this.f19811b.getFilesDir();
        if (filesDir != null) {
            return new File(filesDir, "shareable");
        }
        throw new IllegalStateException("no storage available".toString());
    }

    /* renamed from: Z0 */
    public ArrayList<np.b> T() {
        return a.b.b(this);
    }

    public final void a1(Uri uri, List<? extends ph0.i> list, String str) {
        p.j(uri, ReactVideoViewManager.PROP_SRC_URI);
        p.j(list, "customProviders");
        c a11 = c.Companion.a();
        a11.A0(new f(list, new d(a11), str, uri));
        s n = this.f19811b.getSupportFragmentManager().n();
        p.i(n, "activity.supportFragmentManager.beginTransaction()");
        n.e(a11, "CustomIntentBottomSheetFragment");
        n.k();
    }

    public final void b1(String str) throws Exception {
        p.j(str, "image");
        c();
        String g11 = f19810d.g(str, "");
        File X0 = X0();
        try {
            FileOutputStream a11 = l.b.a(new FileOutputStream(X0), X0);
            byte[] decode = Base64.decode(g11, 0);
            p.i(decode, "decode(cleanedString, Base64.DEFAULT)");
            a11.write(decode);
            a11.flush();
            a11.close();
        } catch (Exception e11) {
            u.h("SharePlugin", e11);
            throw e11;
        }
    }

    public final void c() {
        File X0 = X0();
        if (X0.exists()) {
            X0.delete();
        }
    }

    public final void c1(ShareRequestPayload shareRequestPayload, String str, zp.b bVar) {
        p.j(shareRequestPayload, "request");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        try {
            String b11 = shareRequestPayload.b();
            if (b11 != null) {
                b1(b11);
                AppCompatActivity appCompatActivity = this.f19811b;
                Uri f11 = FileProvider.f(appCompatActivity, p.s(appCompatActivity.getApplication().getPackageName(), ".dataprovider"), X0());
                p.i(f11, "getUriForFile(activity, …      getShareableFile())");
                String string = this.f19812c.getString("android_story_flow_enabled", "true");
                if (string == null) {
                    string = "";
                }
                if (p.e(string, "true")) {
                    List<ph0.i> W0 = W0(f11, shareRequestPayload);
                    ArrayList arrayList = new ArrayList();
                    for (ph0.i a11 : W0) {
                        Intent a12 = a11.a();
                        if (a12 != null) {
                            arrayList.add(a12);
                        }
                    }
                    if (arrayList.size() > 1) {
                        a1(f11, W0, shareRequestPayload.d());
                        return;
                    }
                }
                this.f19811b.startActivity(Companion.a(f11, shareRequestPayload.c(), shareRequestPayload.d()));
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Exception e11) {
            String message = e11.getMessage();
            mp.a aVar = mp.a.f53029a;
            bVar.c(str, 1, message, aVar, aVar.a());
        }
    }

    public final void d1(ShareRequestPayload shareRequestPayload) {
        p.j(shareRequestPayload, "request");
        r c11 = r.c(this.f19811b);
        c11.g(HttpRequest.SHARE_TYPE);
        String c12 = shareRequestPayload.c();
        if (c12 == null) {
            c12 = "";
        }
        c11.f(c12);
        c11.e(shareRequestPayload.d());
        c11.h();
    }

    public void h() {
        a.b.a(this);
    }

    public void h0(OpenShareSheetPayload openShareSheetPayload, String str, zp.b bVar) {
        p.j(openShareSheetPayload, "request");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        r.c(this.f19811b).g(HttpRequest.SHARE_TYPE).f(openShareSheetPayload.b()).h();
    }

    public boolean i0(WebResourceRequest webResourceRequest, zp.d dVar) {
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

    public final File p() {
        File Y0 = Y0();
        if (!Y0.exists()) {
            Y0.mkdirs();
        }
        return Y0;
    }

    public void q0(ShareRequestPayload shareRequestPayload, String str, zp.b bVar) {
        Boolean bool;
        p.j(shareRequestPayload, "request");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        u.b("TOFU", p.s("ShareRequestPayload ", shareRequestPayload));
        String b11 = shareRequestPayload.b();
        if (b11 == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(b11.length() > 0);
        }
        if (js.c.h(bool)) {
            c1(shareRequestPayload, str, bVar);
        } else {
            d1(shareRequestPayload);
        }
    }
}
