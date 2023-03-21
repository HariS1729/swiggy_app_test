package amazonpay.silentpay;

import amazonpay.silentpay.APayError;
import amazonpay.silentpay.ProcessChargeResponse;
import amazonpay.silentpay.e;
import amazonpay.silentpay.i;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.api.authorization.AuthCancellation;
import com.amazon.identity.auth.device.api.authorization.AuthorizeRequest;
import com.amazon.identity.auth.device.api.authorization.c;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@Instrumented
public final class APayActivity extends Activity implements TraceFieldInterface {

    /* renamed from: a  reason: collision with root package name */
    private g8.a f1110a;

    /* renamed from: b  reason: collision with root package name */
    private PendingIntent f1111b;

    /* renamed from: c  reason: collision with root package name */
    private PendingIntent f1112c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1113d = false;

    /* renamed from: e  reason: collision with root package name */
    private String f1114e;

    /* renamed from: f  reason: collision with root package name */
    public Trace f1115f;

    private final class b extends com.amazon.identity.auth.device.api.authorization.b {
        private b() {
        }

        /* renamed from: d */
        public void c(AuthError authError) {
            j.g("APayActivity", "Error during authorization", authError);
            n.d(i.a.AUTHORIZE_FAILED);
            APayActivity.this.f(APayError.ErrorType.AUTH_ERROR, authError);
            APayActivity.this.finish();
        }

        /* renamed from: j */
        public void g(AuthCancellation authCancellation) {
            j.a("APayActivity", "Authorization was cancelled ");
            n.d(i.a.AUTHORIZE_CANCELLED);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putSerializable("AUTH_STATUS", APayAuthorizationResult$Status.FAILURE);
            intent.putExtras(bundle);
            APayActivity.this.k(intent);
            APayActivity.this.finish();
        }

        /* renamed from: k */
        public void onSuccess(c cVar) {
            j.a("APayActivity", "Authorization was successful");
            n.d(i.a.AUTHORIZE_SUCCESS);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putSerializable("AUTH_STATUS", APayAuthorizationResult$Status.SUCCESS);
            intent.putExtras(bundle);
            APayActivity.this.k(intent);
            APayActivity.this.finish();
        }
    }

    private ProgressBar a(List<Pair<Integer, Integer>> list) {
        ProgressBar progressBar = new ProgressBar(this, (AttributeSet) null, 16842871);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!list.isEmpty()) {
            for (Pair next : list) {
                if (next.second != null) {
                    layoutParams.addRule(((Integer) next.first).intValue(), ((Integer) next.second).intValue());
                } else {
                    layoutParams.addRule(((Integer) next.first).intValue());
                }
            }
        }
        progressBar.setLayoutParams(layoutParams);
        return progressBar;
    }

    private synchronized RelativeLayout b() {
        RelativeLayout relativeLayout;
        relativeLayout = new RelativeLayout(this);
        TextView c11 = c(a.f1156b.b(), Integer.valueOf(a.f1156b.e()), Float.valueOf(a.f1156b.i()));
        c11.setGravity(17);
        c11.setId(1);
        relativeLayout.addView(c11);
        relativeLayout.addView(a(Arrays.asList(new Pair[]{new Pair(14, (Object) null), new Pair(12, (Object) null), new Pair(3, Integer.valueOf(c11.getId()))})));
        return relativeLayout;
    }

    private TextView c(String str, Integer num, Float f11) {
        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        textView.setLayoutParams(layoutParams);
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
        if (f11 != null) {
            textView.setTextSize(f11.floatValue());
        }
        textView.setText(str);
        return textView;
    }

    /* access modifiers changed from: private */
    public void f(APayError.ErrorType errorType, Exception exc) {
        j.a("APayActivity", "handle error called");
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        try {
            bundle.putString(errorType.name(), (String) null);
            if (exc.getMessage() != null) {
                bundle.putString("ERROR_MESSAGE", exc.getMessage());
            }
            if (exc.getCause() != null) {
                bundle.putSerializable("ERROR_CAUSE", exc.getCause());
            }
            if (errorType == APayError.ErrorType.AUTH_ERROR && ((AuthError) exc).W3() != null) {
                bundle.putSerializable("AUTH_ERROR_TYPE", ((AuthError) exc).W3());
            }
            intent.putExtras(bundle);
            k(intent);
            finish();
        } catch (Exception e11) {
            j.e("APayActivity", "Exception during error serialization", e11);
            bundle.putString(APayError.ErrorType.AUTH_ERROR.name(), (String) null);
            if (exc.getMessage() != null) {
                bundle.putString("ERROR_MESSAGE", exc.getMessage());
            }
            intent.putExtras(bundle);
            k(intent);
            finish();
        }
    }

    private void h(Intent intent) {
        j.a("APayActivity", "handleOperationCancelled called");
        PendingIntent pendingIntent = this.f1112c;
        if (pendingIntent != null) {
            try {
                pendingIntent.send(this, 0, intent);
            } catch (PendingIntent.CanceledException e11) {
                j.g("APayActivity", "Unable to start cancelIntent", e11);
                finish();
            }
        } else {
            setResult(0, intent);
        }
    }

    private void i(Bundle bundle) {
        if (bundle != null) {
            this.f1111b = (PendingIntent) bundle.getParcelable("COMPLETION_INTENT");
            this.f1112c = (PendingIntent) bundle.getParcelable("CANCEL_INTENT");
            this.f1113d = bundle.getBoolean("HAS_OPERATION_STARTED", false);
            if (bundle.containsKey("OPERATION")) {
                a.f1157c = (e.a) bundle.getSerializable("OPERATION");
                a.f1156b = d.a(this);
            }
            if (bundle.containsKey("PAY_URL")) {
                this.f1114e = bundle.getString("PAY_URL");
            }
            if (bundle.containsKey("CHARGE_REQUEST_IDS")) {
                a.f1159e = (HashSet) bundle.getSerializable("CHARGE_REQUEST_IDS");
            }
        }
    }

    /* access modifiers changed from: private */
    public void k(Intent intent) {
        j.a("APayActivity", "handleOperationCompleted called");
        if (this.f1111b != null) {
            try {
                n.c(a.f1157c);
                this.f1111b.send(this, -1, intent);
            } catch (PendingIntent.CanceledException e11) {
                j.g("APayActivity", "Unable to start completionIntent", e11);
                finish();
            }
        } else {
            n.c(a.f1157c);
            setResult(-1, intent);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Activity activity, Intent intent, o.a aVar) {
        j.a("APayActivity", "init authorize called");
        g8.a f11 = g8.a.f(activity, intent, aVar);
        this.f1110a = f11;
        f11.o(new b());
        AuthorizeRequest b11 = new AuthorizeRequest.a(this.f1110a).a(a.f1156b.u()).c(a.f1156b.w()).b();
        com.amazon.identity.auth.device.api.authorization.a.e(this, a.f1156b.t());
        com.amazon.identity.auth.device.api.authorization.a.a(b11);
    }

    /* access modifiers changed from: package-private */
    public void j(Activity activity, Intent intent, o.a aVar) {
        j.a("APayActivity", "init charge called");
        this.f1110a = g8.a.f(activity, intent, aVar);
        try {
            j8.a.a(this).b(this.f1110a, this.f1114e);
        } catch (AuthError e11) {
            n.d(i.a.AUTHORIZE_FAILED);
            f(APayError.ErrorType.AUTH_ERROR, e11);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TraceMachine.startTracing("APayActivity");
        try {
            TraceMachine.enterMethod(this.f1115f, "APayActivity#onCreate", (ArrayList<String>) null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod((Trace) null, "APayActivity#onCreate", (ArrayList<String>) null);
        }
        super.onCreate(bundle);
        if (bundle != null) {
            j.a("APayActivity", "Low memory flow triggered");
            i(bundle);
        } else {
            j.a("APayActivity", "Normal memory flow triggered");
            i(getIntent().getExtras());
        }
        try {
            setContentView(b());
        } catch (Exception e11) {
            j.g("APayActivity", "Exception while setting up layout", e11);
            n.d(i.a.LAYOUT_ERROR);
            f(APayError.ErrorType.APAY_ERROR, e11);
        }
        if (!this.f1113d) {
            try {
                if (a.f1156b.y()) {
                    j.a("APayActivity", "proceeding in custom tab");
                    n.d(i.a.PROCEEDING_IN_CUSTOM_TAB);
                    if (a.f1157c != e.a.AUTHORIZE) {
                        if (a.f1157c != e.a.GET_AUTHORIZATION_INTENT) {
                            if (a.f1157c == e.a.PROCESS_CHARGE) {
                                j(this, getIntent(), a.f1155a);
                            }
                        }
                    }
                    g(this, getIntent(), a.f1155a);
                } else {
                    j.a("APayActivity", "proceeding in browser");
                    n.d(i.a.PROCEEDING_IN_BROWSER);
                    if (a.f1157c != e.a.AUTHORIZE) {
                        if (a.f1157c != e.a.GET_AUTHORIZATION_INTENT) {
                            if (a.f1157c == e.a.PROCESS_CHARGE) {
                                j(this, getIntent(), a.f1155a);
                            }
                        }
                    }
                    g(this, getIntent(), (o.a) null);
                }
            } catch (Exception e12) {
                j.g("APayActivity", "Error while initializing activity", e12);
                n.d(i.a.APAY_ACTIVITY_ERROR);
                f(APayError.ErrorType.APAY_ERROR, e12);
            }
        }
        TraceMachine.exitMethod();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        j.a("APayActivity", "on destroy called");
        this.f1113d = false;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getExtras() != null && intent.getExtras().containsKey("lowMemoryCondition")) {
            j.d("APayActivity", "Low memory flow");
            try {
                l.b(getApplicationContext(), "MEMORY_STATE", 0, "LOW_MEMORY");
            } catch (IOException e11) {
                j.f("APayActivity", "unable to save memory state");
                f(APayError.ErrorType.APAY_ERROR, e11);
            }
        }
        if (intent.getData() != null) {
            j.a("APayActivity", "in on new intent with data:" + String.valueOf(intent.getData().toString()));
            String c11 = ProcessChargeResponse.c(intent.getData());
            j.a("APayActivity", String.format("Received request id = %s", new Object[]{String.valueOf(c11)}));
            Set<String> set = a.f1159e;
            if (set == null || !set.contains(c11)) {
                j.f("APayActivity", "The response does not correspond to the request");
                n.d(i.a.INVALID_REQUEST_ID);
                f(APayError.ErrorType.INVALID_RESPONSE, new InvalidParameterException("The response does not correspond to the request"));
            } else {
                j.a("APayActivity", "request id validation successful");
                a.f1159e.remove(c11);
            }
            k(intent);
            finish();
        }
        this.f1113d = false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f1113d) {
            j.a("APayActivity", "resume existing operation");
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            if (a.f1157c == e.a.AUTHORIZE) {
                bundle.putSerializable("AUTH_STATUS", APayAuthorizationResult$Status.CANCELLED);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("PROCESS_CHARGE_STATUS", ProcessChargeResponse.Status.CANCELLED);
                    bundle.putString("PROCESS_CHARGE_RESPONSE", JSONObjectInstrumentation.toString(jSONObject));
                } catch (JSONException e11) {
                    j.f("APayActivity", "Unable to pass cancel status to merchant activity");
                    f(APayError.ErrorType.APAY_ERROR, e11);
                }
            }
            intent.putExtras(bundle);
            h(intent);
            finish();
        } else if (this.f1110a != null) {
            j.a("APayActivity", "sending redirect info to auth sdk");
            this.f1110a.l();
            this.f1113d = true;
        } else {
            j.f("APayActivity", "Unable to continue with authorization. Returning.");
            f(APayError.ErrorType.LOW_MEMORY, new RuntimeException("insufficient memory to complete authorize operation"));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        j.a("APayActivity", "onSaveInstantState called");
        bundle.putBoolean("HAS_OPERATION_STARTED", this.f1113d);
        bundle.putParcelable("COMPLETION_INTENT", this.f1111b);
        bundle.putParcelable("CANCEL_INTENT", this.f1112c);
        bundle.putSerializable("OPERATION", a.f1157c);
        String str = this.f1114e;
        if (str != null) {
            bundle.putSerializable("PAY_URL", str);
        }
        Set<String> set = a.f1159e;
        if (set != null && !set.isEmpty()) {
            bundle.putSerializable("CHARGE_REQUEST_IDS", (HashSet) a.f1159e);
        }
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
}
