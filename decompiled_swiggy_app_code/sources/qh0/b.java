package qh0;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import androidx.appcompat.app.AppCompatActivity;
import bp0.k;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.submitfeedback.SubmitFeedbackPayload;
import java.util.ArrayList;
import jz.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import qh0.a;
import zp.d;

/* compiled from: SubmitFeedbackPlugin.kt */
public final class b implements a {
    public static final a Companion = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final AppCompatActivity f19856b;

    /* renamed from: c  reason: collision with root package name */
    private final c f19857c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<?> f19858d;

    /* renamed from: e  reason: collision with root package name */
    private final l<String, k> f19859e;

    /* compiled from: SubmitFeedbackPlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public b(AppCompatActivity appCompatActivity, c cVar, Class<?> cls, l<? super String, k> lVar) {
        p.j(appCompatActivity, "activity");
        p.j(cVar, "deepLinkHandler");
        p.j(cls, "clazz");
        p.j(lVar, "submitFeedback");
        this.f19856b = appCompatActivity;
        this.f19857c = cVar;
        this.f19858d = cls;
        this.f19859e = lVar;
    }

    public void G0(lp.a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    /* renamed from: c */
    public ArrayList<np.b> T() {
        return a.b.b(this);
    }

    public void g(SubmitFeedbackPayload submitFeedbackPayload, String str, zp.b bVar) {
        p.j(submitFeedbackPayload, "request");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        String c11 = submitFeedbackPayload.c();
        boolean z11 = true;
        if (c11 != null && StringsKt__StringsKt.S(c11, "explore", false, 2, (Object) null)) {
            String b11 = submitFeedbackPayload.b();
            if (!(b11 == null || b11.length() == 0)) {
                z11 = false;
            }
            if (!z11) {
                this.f19859e.invoke(submitFeedbackPayload.b());
            } else {
                this.f19859e.invoke("swiggy://explore?show_submit_feedback=true");
            }
        } else {
            String c12 = submitFeedbackPayload.c();
            if (c12 == null || !StringsKt__StringsKt.S(c12, "food-page", false, 2, (Object) null)) {
                z11 = false;
            }
            if (z11) {
                this.f19859e.invoke(submitFeedbackPayload.c());
            }
        }
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
