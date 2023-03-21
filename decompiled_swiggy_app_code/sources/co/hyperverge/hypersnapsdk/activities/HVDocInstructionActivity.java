package co.hyperverge.hypersnapsdk.activities;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.res.h;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.c.p;
import co.hyperverge.hypersnapsdk.objects.HVBaseConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import org.json.JSONException;
import org.json.JSONObject;
import w5.n;

public class HVDocInstructionActivity extends u {

    /* renamed from: l  reason: collision with root package name */
    private static final String f13173l = "co.hyperverge.hypersnapsdk.activities.HVDocInstructionActivity";

    /* renamed from: e  reason: collision with root package name */
    private final p f13174e = new p();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final p f13175f = new p();

    /* renamed from: g  reason: collision with root package name */
    TextView f13176g;

    /* renamed from: h  reason: collision with root package name */
    TextView f13177h;

    /* renamed from: i  reason: collision with root package name */
    TextView f13178i;
    TextView j;
    TextView k;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            if (n.w().m() != null) {
                n.w().m().c0(HVDocInstructionActivity.this.f13175f.c().longValue());
            }
            HVDocInstructionActivity.this.B1();
        }
    }

    private void A1() {
        this.f13176g = (TextView) findViewById(R.id.title_text);
        this.f13177h = (TextView) findViewById(R.id.doc_instruction_1);
        this.f13178i = (TextView) findViewById(R.id.doc_instruction_2);
        this.j = (TextView) findViewById(R.id.doc_instruction_3);
        TextView textView = (TextView) findViewById(R.id.proceed_button);
        this.k = textView;
        textView.setOnClickListener(new a());
    }

    public void B1() {
        setResult(10);
        finish();
    }

    /* access modifiers changed from: package-private */
    public HVBaseConfig h1() {
        return null;
    }

    public void onBackPressed() {
        setResult(11);
        finish();
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13174e.d();
        setContentView(R.layout.hv_activity_doc_instruction);
        A1();
        if (bundle != null) {
            if (n.w().m() != null) {
                n.w().m().T(new HVError(2, "savedInstance is not null"));
            }
            finish();
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(getIntent().getStringExtra("customUIStrings"));
        } catch (JSONException e11) {
            if (n.w().m() != null) {
                n.w().m().T(new HVError(2, e11.getMessage()));
            }
            Log.e(f13173l, e11.getMessage());
        }
        if (jSONObject != null) {
            try {
                if (jSONObject.has("docInstructionsTitleTypeFace") && jSONObject.getInt("docInstructionsTitleTypeFace") > 0) {
                    this.f13176g.setTypeface(h.g(getApplicationContext(), jSONObject.getInt("docInstructionsTitleTypeFace")));
                }
                if (jSONObject.has("docInstructions1TypeFace") && jSONObject.getInt("docInstructions1TypeFace") > 0) {
                    this.f13177h.setTypeface(h.g(getApplicationContext(), jSONObject.getInt("docInstructions1TypeFace")));
                }
                if (jSONObject.has("docInstructions2TypeFace") && jSONObject.getInt("docInstructions2TypeFace") > 0) {
                    this.f13178i.setTypeface(h.g(getApplicationContext(), jSONObject.getInt("docInstructions2TypeFace")));
                }
                if (jSONObject.has("docInstructions3TypeFace") && jSONObject.getInt("docInstructions3TypeFace") > 0) {
                    this.j.setTypeface(h.g(getApplicationContext(), jSONObject.getInt("docInstructions3TypeFace")));
                }
                if (jSONObject.has("docInstructionsProceedTypeFace") && jSONObject.getInt("docInstructionsProceedTypeFace") > 0) {
                    this.k.setTypeface(h.g(getApplicationContext(), jSONObject.getInt("docInstructionsProceedTypeFace")));
                }
                if (jSONObject.has("docInstructionsTitle") && !jSONObject.getString("docInstructionsTitle").trim().isEmpty()) {
                    this.f13176g.setText(jSONObject.getString("docInstructionsTitle"));
                }
                if (jSONObject.has("docInstructions1") && !jSONObject.getString("docInstructions1").trim().isEmpty()) {
                    this.f13177h.setText(jSONObject.getString("docInstructions1"));
                }
                if (jSONObject.has("docInstructions2") && !jSONObject.getString("docInstructions2").trim().isEmpty()) {
                    this.f13178i.setText(jSONObject.getString("docInstructions2"));
                }
                if (jSONObject.has("docInstructions3") && !jSONObject.getString("docInstructions3").trim().isEmpty()) {
                    this.j.setText(jSONObject.getString("docInstructions3"));
                }
                if (jSONObject.has("docInstructionsProceed") && !jSONObject.getString("docInstructionsProceed").trim().isEmpty()) {
                    this.k.setText(jSONObject.getString("docInstructionsProceed"));
                }
            } catch (Exception e12) {
                Log.e(f13173l, e12.getMessage());
                if (n.w().m() != null) {
                    n.w().m().T(new HVError(2, e12.getMessage()));
                    return;
                }
                return;
            }
        }
        if (n.w().m() != null) {
            n.w().m().z(this.f13174e.c().longValue());
            n.w().m().h0();
            this.f13175f.d();
        }
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
    }

    /* access modifiers changed from: package-private */
    public boolean s1() {
        return false;
    }

    public /* bridge */ /* synthetic */ void v1() {
        super.v1();
    }

    public void w1() {
    }

    public /* bridge */ /* synthetic */ Context x1(Context context) {
        return super.x1(context);
    }
}
