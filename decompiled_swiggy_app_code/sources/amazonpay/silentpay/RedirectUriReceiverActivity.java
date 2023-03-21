package amazonpay.silentpay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.util.ArrayList;

@Instrumented
public class RedirectUriReceiverActivity extends Activity implements TraceFieldInterface {

    /* renamed from: a  reason: collision with root package name */
    public Trace f1154a;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TraceMachine.startTracing("RedirectUriReceiverActivity");
        try {
            TraceMachine.enterMethod(this.f1154a, "RedirectUriReceiverActivity#onCreate", (ArrayList<String>) null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod((Trace) null, "RedirectUriReceiverActivity#onCreate", (ArrayList<String>) null);
        }
        super.onCreate(bundle);
        Intent intent = new Intent(this, APayActivity.class);
        intent.setData(getIntent().getData());
        intent.addFlags(603979776);
        finish();
        startActivity(intent);
        TraceMachine.exitMethod();
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
