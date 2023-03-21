package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.j;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.api.authorization.AuthorizeRequest;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;

/* renamed from: c  reason: default package */
public class c extends s1 {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final String f12652d = "c";

    /* renamed from: b  reason: collision with root package name */
    private e f12653b;

    /* renamed from: c  reason: collision with root package name */
    private w1 f12654c;

    /* renamed from: c$a */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f12655a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f12656b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AuthorizeRequest f12657c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f12658d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f12659e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String[] f12660f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f12661g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Bundle f12662h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ag f12663i;

        a(boolean z11, boolean z12, AuthorizeRequest authorizeRequest, Context context, String str, String[] strArr, g gVar, Bundle bundle, ag agVar) {
            this.f12655a = z11;
            this.f12656b = z12;
            this.f12657c = authorizeRequest;
            this.f12658d = context;
            this.f12659e = str;
            this.f12660f = strArr;
            this.f12661g = gVar;
            this.f12662h = bundle;
            this.f12663i = agVar;
        }

        public void run() {
            try {
                if (!this.f12655a) {
                    if (!this.f12656b) {
                        this.f12661g.d(new AuthError("WebView is not allowed for Authorization", AuthError.ERROR_TYPE.ERROR_BAD_PARAM));
                        return;
                    }
                }
                c.this.v(this.f12657c, this.f12658d, this.f12659e, this.f12660f, this.f12661g, this.f12662h, this.f12663i);
                o1.d(this.f12658d, false);
            } catch (AuthError e11) {
                this.f12661g.d(e11);
            }
        }
    }

    /* renamed from: c$b */
    class b implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f12665a;

        b(g gVar) {
            this.f12665a = gVar;
        }

        /* renamed from: a */
        public void onSuccess(Bundle bundle) {
            k1.i(c.f12652d, "Code for Token Exchange success");
            g gVar = this.f12665a;
            if (gVar != null) {
                gVar.a(bundle);
            }
        }

        public void b(Bundle bundle) {
            k1.j(c.f12652d, "Code for Token Exchange Cancel");
            g gVar = this.f12665a;
            if (gVar != null) {
                gVar.b(bundle);
            }
        }

        /* renamed from: d */
        public void c(AuthError authError) {
            String a11 = c.f12652d;
            k1.h(a11, "Code for Token Exchange Error. " + authError.getMessage());
            g gVar = this.f12665a;
            if (gVar != null) {
                gVar.d(authError);
            }
        }
    }

    /* renamed from: c$c  reason: collision with other inner class name */
    class C0104c extends e1<Bundle> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String[] f12667b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f12668c;

        C0104c(String[] strArr, Bundle bundle) {
            this.f12667b = strArr;
            this.f12668c = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Bundle b(Context context, q1 q1Var) throws AuthError, RemoteException {
            return c.w(context, this.f12667b, q1Var, this.f12668c);
        }
    }

    /* renamed from: c$d */
    /* compiled from: ActionButtonClickHandler */
    public interface d extends g {
        boolean c(Context context, Bundle bundle, int i11);
    }

    /* renamed from: c$e */
    /* compiled from: AudibleNotification */
    public interface e {
        j.f d(Context context, Bundle bundle, j.f fVar, CleverTapInstanceConfig cleverTapInstanceConfig);
    }

    /* renamed from: c$f */
    /* compiled from: INotificationParser */
    public interface f<T> {
        Bundle a(T t);
    }

    /* renamed from: c$g */
    /* compiled from: NotificationHandler */
    public interface g {
        boolean a(Context context, String str, String str2);

        boolean b(Context context, Bundle bundle, String str);
    }

    /* renamed from: c$h */
    /* compiled from: NotificationRenderedListener */
    public interface h {
        void a(boolean z11);
    }

    /* renamed from: c$i */
    /* compiled from: OnInitCleverTapIDListener */
    public interface i {
        void a(String str);
    }

    /* renamed from: c$j */
    /* compiled from: SCDomainListener */
    public interface j {
        void a(String str);

        void b();
    }

    public c() {
        this(new e());
    }

    public c(e eVar) {
        this.f12654c = w1.e();
        this.f12653b = eVar;
    }

    private Bundle p(Context context, String[] strArr, Bundle bundle) throws AuthError {
        Bundle bundle2 = (Bundle) new C0104c(strArr, bundle).a(context, this.f12653b);
        return bundle2 != null ? bundle2 : new Bundle();
    }

    private Bundle r(Bundle bundle) throws AuthError {
        Bundle bundle2;
        if (bundle.getBoolean(ch$b.GET_AUTH_CODE.f809a, false)) {
            String string = bundle.getString(ch$b.CODE_CHALLENGE.f809a);
            String string2 = bundle.getString(ch$b.CODE_CHALLENGE_METHOD.f809a);
            if (!TextUtils.isEmpty(string)) {
                bundle2 = new Bundle();
                bundle2.putString("code_challenge", string);
                bundle2.putString("code_challenge_method", string2);
            } else {
                throw new AuthError("Must provide code challenge parameter.", AuthError.ERROR_TYPE.ERROR_MISSING_CODE_CHALLENGE);
            }
        } else {
            bundle2 = this.f12654c.a();
        }
        ch$b ch_b = ch$b.SCOPE_DATA;
        if (bundle.getString(ch_b.f809a) != null) {
            bundle2.putString("scope_data", bundle.getString(ch_b.f809a));
        }
        bundle2.putString(PaymentConstants.CLIENT_ID, bundle.getString(ch$b.CLIENT_ID.f809a));
        return bundle2;
    }

    private void t(Context context, String str, String str2, Bundle bundle, Bundle bundle2, g gVar) {
        h(context, str, str2, bundle, false, (String) null, new m0(), new p1(), bundle2, new b(gVar));
    }

    /* access modifiers changed from: private */
    public void v(AuthorizeRequest authorizeRequest, Context context, String str, String[] strArr, g gVar, Bundle bundle, ag agVar) throws AuthError {
        bundle.getBundle(ch$b.EXTRA_URL_PARAMS.f809a).remove(PaymentConstants.CLIENT_ID);
        m1.a(context).e(new t1(authorizeRequest, str, strArr, bundle, agVar, gVar), context);
    }

    /* access modifiers changed from: private */
    public static Bundle w(Context context, String[] strArr, q1 q1Var, Bundle bundle) throws AuthError, RemoteException {
        Bundle I1 = q1Var.I1(bundle, context.getPackageName(), strArr);
        if (I1 != null) {
            I1.setClassLoader(context.getClassLoader());
        }
        return I1;
    }

    public void u(AuthorizeRequest authorizeRequest, Context context, String str, String str2, String str3, String[] strArr, boolean z11, m0 m0Var, g gVar, Bundle bundle) throws AuthError {
        Context context2 = context;
        String str4 = str2;
        g gVar2 = gVar;
        Bundle bundle2 = bundle;
        if (!z0.b()) {
            ag a11 = new p1().a(str, context2);
            List<ak> f11 = m0Var.f(context2);
            String[] l11 = s1.l(context2, strArr, f11);
            boolean z12 = bundle2.getBoolean(ch$b.SANDBOX.f809a, false);
            Bundle bundle3 = Bundle.EMPTY;
            if (bundle2 == bundle3) {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            bundle4.putBoolean(ch$b.CHECK_API_KEY.f809a, false);
            bundle4.putBoolean(ch$b.RETURN_CODE.f809a, true);
            bundle4.putString(ch$a.REGION.f807a, com.amazon.identity.auth.device.api.authorization.a.b(context).getStringValue());
            bundle4.putString(ch$b.CLIENT_ID.f809a, str4);
            bundle4.putString(ch$b.SDK_VERSION.f809a, "LWAAndroidSDK3.0.1");
            try {
                bundle4.putBundle(ch$b.EXTRA_URL_PARAMS.f809a, r(bundle4));
                if (!z12 && (o1.e(context) || f11 == null || f11.size() == 0)) {
                    bundle3 = p(context2, l11, bundle4);
                }
                if (!bundle3.containsKey("code") || TextUtils.isEmpty(bundle3.getString("code"))) {
                    if (bundle3.containsKey("AUTH_ERROR_EXECEPTION") || bundle3.containsKey(ch$b.AUTHORIZE.f809a) || bundle3.containsKey(ch$b.CAUSE_ID.f809a)) {
                        bundle3.setClassLoader(context.getClassLoader());
                        if (bundle3.containsKey(ch$b.CAUSE_ID.f809a)) {
                            gVar2.b(bundle3);
                        } else if (bundle3.containsKey("AUTH_ERROR_EXECEPTION")) {
                            gVar2.d(AuthError.U3(bundle3));
                        } else {
                            p.g(context);
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(ch$b.AUTHORIZE.f809a, "authorized via service");
                            gVar2.a(bundle5);
                        }
                    } else {
                        q.t(context).a();
                        new Handler(Looper.getMainLooper()).post(new a(z11, z12, authorizeRequest, context, str2, l11, gVar, bundle4, a11));
                    }
                } else if (bundle4.getBoolean(ch$b.GET_AUTH_CODE.f809a, false)) {
                    s1.j(bundle3.getString("code"), str4, str3, gVar2);
                } else {
                    t(context, str, this.f12654c.b(), bundle3, bundle4, gVar);
                    o1.d(context2, true);
                }
            } catch (AuthError e11) {
                gVar2.d(e11);
            }
        } else {
            k1.h(f12652d, "authorize started on main thread");
            throw new IllegalStateException("authorize started on main thread");
        }
    }
}
