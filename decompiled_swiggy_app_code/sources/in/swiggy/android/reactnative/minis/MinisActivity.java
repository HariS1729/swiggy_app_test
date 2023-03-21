package in.swiggy.android.reactnative.minis;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import cg0.n;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import com.facebook.soloader.SoLoader;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import dagger.android.support.DaggerAppCompatActivity;
import in.swiggy.android.dls.R;
import java.util.ArrayList;
import java.util.HashMap;
import jz.c;
import kotlin.jvm.internal.i;
import se.m;
import se.p;
import se0.d;
import se0.g;
import se0.h;

/* compiled from: MinisActivity.kt */
public final class MinisActivity extends DaggerAppCompatActivity implements com.facebook.react.modules.core.b, e {
    public static final a n = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static boolean f18498o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static boolean f18499p;

    /* renamed from: c  reason: collision with root package name */
    private p f18500c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public se.i f18501d;

    /* renamed from: e  reason: collision with root package name */
    private f f18502e;

    /* renamed from: f  reason: collision with root package name */
    public og0.a f18503f;

    /* renamed from: g  reason: collision with root package name */
    public n f18504g;

    /* renamed from: h  reason: collision with root package name */
    public us.f f18505h;

    /* renamed from: i  reason: collision with root package name */
    public c f18506i;
    public SharedPreferences j;
    public ef0.e k;

    /* renamed from: l  reason: collision with root package name */
    private eo0.a f18507l = new eo0.a();

    /* renamed from: m  reason: collision with root package name */
    private Long f18508m = Long.valueOf(System.currentTimeMillis());

    /* compiled from: MinisActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final boolean a() {
            return MinisActivity.f18499p;
        }

        public final boolean b() {
            return MinisActivity.f18498o;
        }

        public final void c(boolean z11) {
            MinisActivity.f18498o = z11;
        }
    }

    /* compiled from: GeneralUtils.kt */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f18509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MinisActivity f18510b;

        public b(Object obj, MinisActivity minisActivity) {
            this.f18509a = obj;
            this.f18510b = minisActivity;
        }

        public final void run() {
            se.i iVar = (se.i) this.f18509a;
            se.i b12 = this.f18510b.f18501d;
            if (b12 != null) {
                b12.Q();
            }
        }
    }

    private final void g1() {
        f18498o = true;
        us.f fVar = this.f18505h;
        if (fVar != null) {
            fVar.Y(this);
        }
    }

    private final Bundle h1() {
        og0.a aVar = this.f18503f;
        HashMap<String, String> a11 = aVar == null ? null : aVar.a();
        if (a11 != null) {
            return h.a(a11);
        }
        return new Bundle();
    }

    private final Bundle j1() {
        return h.c(h.b(this.k));
    }

    private final void k1(String str) {
        this.f18500c = new p(this);
        ArrayList<m> a11 = new se.f(getApplication()).a();
        kotlin.jvm.internal.p.i(a11, "PackageList(application).packages");
        a11.add(new g(this.f18504g, this.f18505h, this.f18506i, this.j, this.k, this.f18507l, this.f18508m));
        a11.add(new com.microsoft.codepush.react.a("ZrK-KyAjQKIuewBwqIPkwOLb_lmaidVYKMx4B", getApplicationContext(), false));
        this.f18501d = se.i.u().d(getApplication()).f(this).e("index.android.bundle").j("index").a(a11).h(com.microsoft.codepush.react.a.i()).k(false).g(LifecycleState.RESUMED).b();
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle.putBundle("swiggyHeaders", h1());
        bundle.putBundle("swiggyUser", j1());
        bundle.putBundle("buildConfig", bundle2);
        bundle.putString("url", str);
        p pVar = this.f18500c;
        if (pVar != null) {
            pVar.o(this.f18501d, "Minis", bundle);
        }
        setContentView((View) this.f18500c);
    }

    private final void l1() {
        com.facebook.react.views.text.h c11 = com.facebook.react.views.text.h.c();
        c11.a(this, "BasisGrotesquePro-Regular", R.font.basis_grotesque_pro_regular);
        c11.a(this, "BasisGrotesquePro-Bold", R.font.basis_grotesque_pro_bold);
        c11.a(this, "BasisGrotesquePro-Black", R.font.basis_grotesque_pro_black);
        c11.a(this, "BasisGrotesquePro-Medium", R.font.basis_grotesque_pro_medium);
        c11.a(this, "ProximaNova-Bold", in.swiggy.android.commonsui.ui.R.font.proxima_nova_bold);
        c11.a(this, "ProximaNova-Extrabold", in.swiggy.android.commonsui.ui.R.font.proxima_nova_extra_bold);
        c11.a(this, "ProximaNovaA-Black", in.swiggy.android.commonsui.ui.R.font.proxima_nova_a_black);
    }

    private final void m1() {
        us.f fVar = this.f18505h;
        if (fVar != null) {
            fVar.j0(this);
        }
        f18498o = false;
        f18499p = false;
    }

    public static final void n1(boolean z11) {
        n.c(z11);
    }

    @TargetApi(23)
    public void S0(String[] strArr, int i11, f fVar) {
        kotlin.jvm.internal.p.j(strArr, "permissions");
        kotlin.jvm.internal.p.j(fVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f18502e = fVar;
        requestPermissions(strArr, i11);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        se.i iVar = this.f18501d;
        if (iVar != null) {
            iVar.P(this, i11, i12, intent);
        }
    }

    public void onBackPressed() {
        se.i iVar = this.f18501d;
        if (iVar == null) {
            super.onBackPressed();
        } else if (iVar != null) {
            new Handler(Looper.getMainLooper()).post(new b(iVar, this));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate((Bundle) null);
        l1();
        d.g(d.f19868a, this, false, true, false, 10, (Object) null);
        SoLoader.g(this, false);
        k1(getIntent().getStringExtra("url"));
        g1();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m1();
        se.i iVar = this.f18501d;
        if (iVar != null) {
            iVar.S(this);
        }
        p pVar = this.f18500c;
        if (pVar != null) {
            pVar.q();
        }
        this.f18507l.dispose();
    }

    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        se.i iVar;
        kotlin.jvm.internal.p.j(keyEvent, "event");
        if (i11 != 82 || (iVar = this.f18501d) == null) {
            return super.onKeyUp(i11, keyEvent);
        }
        if (iVar == null) {
            return true;
        }
        iVar.i0();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        se.i iVar = this.f18501d;
        if (iVar != null) {
            iVar.U(this);
        }
    }

    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.p.j(strArr, "permissions");
        kotlin.jvm.internal.p.j(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        f fVar = this.f18502e;
        if (fVar != null) {
            fVar.onRequestPermissionsResult(i11, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        se.i iVar = this.f18501d;
        if (iVar != null) {
            iVar.W(this, this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f18500c == null) {
            k1(getIntent().getStringExtra("url"));
        }
    }

    public void z() {
        super.onBackPressed();
    }
}
