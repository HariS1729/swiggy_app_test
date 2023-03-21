package co.hyperverge.hypersnapsdk.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.c;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.c.p;
import co.hyperverge.hypersnapsdk.listeners.FaceCaptureCompletionHandler;
import co.hyperverge.hypersnapsdk.objects.HVBaseConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams$Region;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;
import w5.n;
import x5.i;
import z5.d;

@Instrumented
public class HVFaceActivity extends u {
    private static final String j = "co.hyperverge.hypersnapsdk.activities.HVFaceActivity";

    /* renamed from: e  reason: collision with root package name */
    d f13256e;

    /* renamed from: f  reason: collision with root package name */
    i f13257f;

    /* renamed from: g  reason: collision with root package name */
    HVFaceConfig f13258g;

    /* renamed from: h  reason: collision with root package name */
    private final p f13259h = new p();

    /* renamed from: i  reason: collision with root package name */
    private final p f13260i = new p();

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        public void onClick(DialogInterface dialogInterface, int i11) {
            HVFaceActivity.this.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1001);
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        public void onClick(DialogInterface dialogInterface, int i11) {
            y5.a.a().d().f(new HVError(33, "GPS access denied by user"), (co.hyperverge.hypersnapsdk.objects.b) null);
            HVFaceActivity.this.finish();
        }
    }

    private void B1() {
        try {
            this.f13257f = new i();
            x5.p pVar = new x5.p();
            pVar.x(this.f13257f);
            this.f13257f.G0(pVar);
            pVar.r(this.f13258g.getMode());
            pVar.t(this.f13258g.getClientID());
            pVar.s(this.f13258g);
            this.f13257f.E0(this.f13258g);
            getSupportFragmentManager().n().t(R.id.texture_container, this.f13257f).j();
            if (n.w().m() != null) {
                long longValue = this.f13260i.c().longValue();
                n.w().m().E(this.f13258g);
                n.w().m().q0(longValue);
                n.w().m().J();
            }
        } catch (Exception e11) {
            Log.e(j, e11.getMessage());
            if (n.w().m() != null) {
                n.w().m().o0(new HVError(2, e11.getMessage()));
            }
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    private void C1() {
        if (i6.a.d(this).f()) {
            i6.a.d(this).a();
            i6.a.d(this).g();
            return;
        }
        F1();
    }

    private void D1() {
        try {
            this.f13259h.d();
            this.f13260i.d();
            i iVar = this.f13257f;
            if (iVar != null) {
                iVar.N1();
            }
        } catch (Exception e11) {
            Log.e(j, e11.getMessage());
        }
    }

    private void E1() {
        try {
            y5.a.a().d().f(new HVError(3, getResources().getString(R.string.operation_cancelled)), (co.hyperverge.hypersnapsdk.objects.b) null);
        } catch (Exception e11) {
            Log.e(j, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    private void F1() {
        c.a aVar = new c.a(this);
        aVar.setTitle("GPS Switched Off");
        aVar.e("Please enable GPS to continue");
        aVar.b(false);
        aVar.i("Open settings", new a());
        aVar.f("Cancel", new b());
        aVar.l();
    }

    public static void G1(Context context, HVFaceConfig hVFaceConfig, FaceCaptureCompletionHandler faceCaptureCompletionHandler) {
        if (faceCaptureCompletionHandler != null) {
            y5.a.a().b(faceCaptureCompletionHandler);
            if (context == null) {
                faceCaptureCompletionHandler.f(new HVError(6, "Context object is null"), (co.hyperverge.hypersnapsdk.objects.b) null);
                return;
            }
            p5.a t = p5.a.t();
            co.hyperverge.hypersnapsdk.objects.d s11 = t.s();
            if (!t.w() || ((s11.getAppId() != null && s11.getAppId().isEmpty()) || (s11.getAppKey() != null && s11.getAppKey().isEmpty()))) {
                faceCaptureCompletionHandler.f(new HVError(11, context.getResources().getString(R.string.initialised_error)), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else if (s11.getHyperSnapRegion() == HyperSnapParams$Region.ASIA_PACIFIC && !p5.a.y()) {
                faceCaptureCompletionHandler.f(new HVError(11, context.getResources().getString(R.string.user_session_not_created_error)), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else if (n.w().D()) {
                q5.b a11 = n.w().a(context);
                Resources resources = context.getResources();
                int i11 = R.string.npd_misisng;
                a11.a(resources.getString(i11));
                faceCaptureCompletionHandler.f(new HVError(2, context.getResources().getString(i11)), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else if (hVFaceConfig == null) {
                faceCaptureCompletionHandler.f(new HVError(6, context.getResources().getString(R.string.face_config_error)), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else {
                Intent intent = new Intent(context, HVFaceActivity.class);
                intent.putExtra("hvFaceConfig", hVFaceConfig);
                context.startActivity(intent);
            }
        }
    }

    private void z1(String str) {
        try {
            y5.a.a().d().f(new HVError(4, str), (co.hyperverge.hypersnapsdk.objects.b) null);
            finish();
        } catch (Exception e11) {
            Log.e(j, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void A1() {
        this.f13259h.d();
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"android.permission.CAMERA"}));
        this.f13256e.a(this, arrayList);
        if (this.f13256e.b(this, arrayList).f18071b.isEmpty()) {
            n.w().a(getApplicationContext()).g(this.f13259h.c().longValue());
            I1();
        }
    }

    public void I1() {
        q1();
    }

    public void K1() {
        try {
            Intent intent = new Intent(this, HVFaceInstructionActivity.class);
            JSONObject customUIStrings = this.f13258g.getCustomUIStrings();
            intent.putExtra("customUIStrings", !(customUIStrings instanceof JSONObject) ? customUIStrings.toString() : JSONObjectInstrumentation.toString(customUIStrings));
            intent.putExtra("shouldUseBackCam", this.f13258g.getShouldUseBackCamera());
            startActivityForResult(intent, 1);
        } catch (Exception | NoClassDefFoundError e11) {
            Log.e(j, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
            y5.a.a().d().f(new HVError(31, getResources().getString(R.string.instructions_error)), (co.hyperverge.hypersnapsdk.objects.b) null);
            finish();
        }
    }

    /* access modifiers changed from: package-private */
    public HVBaseConfig h1() {
        return this.f13258g;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i11, int i12, Intent intent) {
        i iVar;
        super.onActivityResult(i11, i12, intent);
        D1();
        HVFaceConfig hVFaceConfig = this.f13258g;
        if (!(hVFaceConfig == null || !hVFaceConfig.isShouldRecordVideo() || (iVar = this.f13257f) == null)) {
            iVar.O1();
        }
        if (i11 == 1001) {
            try {
                C1();
            } catch (NoClassDefFoundError unused) {
                Log.e(j, "gms excluded");
            }
        }
        if (i12 == 2) {
            A1();
        } else if (i12 == 3) {
            E1();
            finish();
        }
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hv_activity_face_capture);
        if (bundle != null) {
            finish();
        }
        this.f13256e = new d();
        HVFaceConfig hVFaceConfig = (HVFaceConfig) getIntent().getSerializableExtra("hvFaceConfig");
        this.f13258g = hVFaceConfig;
        HVFaceConfig.setFaceConfigInstance(hVFaceConfig);
        if (n.w().m() != null) {
            n.w().m().L(this.f13258g);
        }
        if (this.f13258g.isShouldShowInstructionPage()) {
            K1();
            return;
        }
        this.f13260i.d();
        if (p5.a.t().s().isShouldUseLocation()) {
            try {
                C1();
            } catch (NoClassDefFoundError unused) {
                Log.e(j, "gms excluded");
            }
        }
        A1();
    }

    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        d.a b11 = this.f13256e.b(this, new ArrayList(Arrays.asList(new String[]{"android.permission.CAMERA"})));
        if (b11.f18071b.isEmpty()) {
            if (n.w().m() != null) {
                n.w().m().g(this.f13259h.c().longValue());
            }
            I1();
        } else {
            String join = TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, b11.f18071b);
            z1("Following Permissions not granted by user: " + join);
            HVError hVError = new HVError(4, "Following Permissions not granted by user: " + join);
            if (n.w().m() != null) {
                n.w().m().r(hVError, this.f13259h.c().longValue());
            }
            finish();
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public /* bridge */ /* synthetic */ boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }

    public /* bridge */ /* synthetic */ void q1() {
        super.n1();
    }

    /* access modifiers changed from: package-private */
    public void r1() {
        try {
            i iVar = this.f13257f;
            if (iVar != null) {
                iVar.M1();
            }
        } catch (Exception e11) {
            Log.e(j, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s1() {
        return this.f13258g.shouldShowCloseAlert();
    }

    public /* bridge */ /* synthetic */ void v1() {
        super.v1();
    }

    public void w1() {
        B1();
    }

    public /* bridge */ /* synthetic */ Context x1(Context context) {
        return super.x1(context);
    }
}
