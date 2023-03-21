package co.hyperverge.hypersnapsdk.activities;

import a6.a;
import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.c;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.objects.HVBaseConfig;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.pdfbox.pdmodel.common.PDPageLabelRange;
import w5.l;
import w5.n;

@Instrumented
/* compiled from: HVBaseActivity */
abstract class u extends AppCompatActivity implements TraceFieldInterface {

    /* renamed from: d  reason: collision with root package name */
    private static final String f13314d = "co.hyperverge.hypersnapsdk.activities.u";

    /* renamed from: a  reason: collision with root package name */
    a f13315a;

    /* renamed from: b  reason: collision with root package name */
    ProgressDialog f13316b = null;

    /* renamed from: c  reason: collision with root package name */
    public Trace f13317c;

    u() {
    }

    @TargetApi(24)
    private Context g1(Context context, Locale locale) {
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k1(DialogInterface dialogInterface, int i11) {
        r1();
    }

    private Context m1(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void o1(DialogInterface dialogInterface, int i11) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p1() {
        if (n.w() == null || n.w().E()) {
            ProgressDialog progressDialog = this.f13316b;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f13316b.dismiss();
            }
            w1();
            return;
        }
        if (!this.f13316b.isShowing()) {
            this.f13316b.show();
        }
        new Handler().postDelayed(new s(this), 100);
    }

    private void t1() {
        String str;
        HVBaseConfig h12 = h1();
        String str2 = null;
        if (h12 != null) {
            str2 = h12.getCloseAlertDialogTitle();
            str = h12.getCloseAlertDialogDesc();
        } else {
            str = null;
        }
        if (str2 == null) {
            str2 = getString(R.string.hv_close_alert_title);
        }
        if (str == null) {
            str = getString(R.string.hv_close_alert_desc);
        }
        c.a aVar = new c.a(this);
        aVar.setTitle(str2);
        aVar.e(str);
        aVar.b(false);
        aVar.setPositiveButton(R.string.hv_close_alert_positive_action, new q(this));
        aVar.setNegativeButton(R.string.hv_close_alert_negative_action, r.f13311a);
        aVar.l();
    }

    private void u1() {
        try {
            i6.a.d(this).h();
        } catch (NoClassDefFoundError unused) {
            Log.e(f13314d, "gms excluded");
        }
    }

    public void _nr_setTrace(Trace trace) {
        try {
            this.f13317c = trace;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract HVBaseConfig h1();

    /* access modifiers changed from: package-private */
    public Locale j1(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.getResources().getConfiguration().getLocales().get(0);
        }
        return context.getResources().getConfiguration().locale;
    }

    /* access modifiers changed from: protected */
    public void l1(HVBaseConfig hVBaseConfig, View view) {
        if (view == null) {
            view = findViewById(16908290).getRootView();
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.llBranding);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.llTrustLogos);
        int i11 = 0;
        boolean z11 = n.w() != null && n.w().G();
        boolean shouldShowTrustLogos = hVBaseConfig.shouldShowTrustLogos();
        linearLayout.setVisibility(z11 ? 0 : 8);
        if (!shouldShowTrustLogos) {
            i11 = 8;
        }
        linearLayout2.setVisibility(i11);
    }

    public void onBackPressed() {
        String name = getClass().getName();
        if (name.contains("HVFaceActivity")) {
            n.w().a(getApplicationContext()).A();
        }
        if (name.contains("HVDocsActivity")) {
            n.w().a(getApplicationContext()).i();
        }
        if (name.contains("HVDocReviewActivity")) {
            n.w().a(getApplicationContext()).u();
        }
        if (name.contains("HVRetakeActivity")) {
            String className = getCallingActivity().getClassName();
            if (className.contains("Face")) {
                n.w().a(getApplicationContext()).R();
            }
            if (className.contains("Doc")) {
                n.w().a(getApplicationContext()).d();
            }
        }
        v1();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TraceMachine.startTracing(PDPageLabelRange.STYLE_LETTERS_LOWER);
        try {
            TraceMachine.enterMethod(this.f13317c, "a#onCreate", (ArrayList<String>) null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod((Trace) null, "a#onCreate", (ArrayList<String>) null);
        }
        super.onCreate(bundle);
        l.b(this);
        this.f13315a = a.a();
        TraceMachine.exitMethod();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        u1();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        u1();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        x1(this);
        l.b(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        ApplicationStateMonitor.getInstance().activityStarted();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        ApplicationStateMonitor.getInstance().activityStopped();
    }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }

    /* renamed from: q1 */
    public void n1() {
        if (this.f13316b == null) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f13316b = progressDialog;
            progressDialog.setMessage(l.f17583c);
            this.f13316b.setCancelable(false);
        }
        this.f13315a.b(new t(this));
    }

    /* access modifiers changed from: package-private */
    public abstract void r1();

    /* access modifiers changed from: package-private */
    public abstract boolean s1();

    public void v1() {
        if (s1()) {
            t1();
        } else {
            r1();
        }
    }

    public abstract void w1();

    public Context x1(Context context) {
        Locale j12 = j1(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return g1(context, j12);
        }
        return m1(context, j12);
    }
}
