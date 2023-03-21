package co.hyperverge.hypersnapsdk.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.c.p;
import co.hyperverge.hypersnapsdk.objects.HVBaseConfig;
import w5.n;

public class HVFaceInstructionActivity extends u {
    private static final String n = "co.hyperverge.hypersnapsdk.activities.HVFaceInstructionActivity";

    /* renamed from: e  reason: collision with root package name */
    private final p f13263e = new p();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final p f13264f = new p();

    /* renamed from: g  reason: collision with root package name */
    TextView f13265g;

    /* renamed from: h  reason: collision with root package name */
    TextView f13266h;

    /* renamed from: i  reason: collision with root package name */
    TextView f13267i;
    TextView j;
    TextView k;

    /* renamed from: l  reason: collision with root package name */
    TextView f13268l;

    /* renamed from: m  reason: collision with root package name */
    TextView f13269m;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            if (n.w().m() != null) {
                n.w().m().D(HVFaceInstructionActivity.this.f13264f.c().longValue());
            }
            HVFaceInstructionActivity.this.B1();
        }
    }

    private void A1() {
        this.f13265g = (TextView) findViewById(R.id.proceed_button);
        this.f13266h = (TextView) findViewById(R.id.title_text);
        this.f13267i = (TextView) findViewById(R.id.face_top1);
        this.j = (TextView) findViewById(R.id.face_top2);
        this.k = (TextView) findViewById(R.id.bright_light);
        this.f13268l = (TextView) findViewById(R.id.no_glasses);
        this.f13269m = (TextView) findViewById(R.id.no_hat);
        this.f13265g.setOnClickListener(new a());
    }

    public void B1() {
        setResult(2);
        finish();
    }

    /* access modifiers changed from: package-private */
    public HVBaseConfig h1() {
        return null;
    }

    public void onBackPressed() {
        setResult(3);
        finish();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x028d A[Catch:{ JSONException -> 0x02b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b7 A[SYNTHETIC, Splitter:B:25:0x00b7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r2 = "faceInstructionsProceedBackCam"
            java.lang.String r3 = "faceInstructionsProceed"
            java.lang.String r4 = "faceInstructionsNoGlasses"
            java.lang.String r5 = "faceInstructionsNoHat"
            java.lang.String r6 = "faceInstructionsBrightLight"
            java.lang.String r7 = "faceInstructionsTop2"
            java.lang.String r8 = "faceInstructionsTop1"
            java.lang.String r9 = "faceInstructionsTitle"
            java.lang.String r10 = "faceInstructionsProceedBackCamTypeFace"
            java.lang.String r11 = "faceInstructionsNoGlassesTypeFace"
            java.lang.String r12 = "faceInstructionsNoHatTypeFace"
            java.lang.String r13 = "faceInstructionsBrightLightTypeFace"
            java.lang.String r14 = "faceInstructionsTop2TypeFace"
            java.lang.String r15 = "faceInstructionsTop1TypeFace"
            r16 = r3
            java.lang.String r3 = "faceInstructionsTitleTypeFace"
            super.onCreate(r21)
            co.hyperverge.hypersnapsdk.c.p r0 = r1.f13263e
            r0.d()
            int r0 = co.hyperverge.hypersnapsdk.R.layout.hv_activity_face_instruction
            r1.setContentView((int) r0)
            r20.A1()
            r17 = r2
            r2 = 2
            if (r21 == 0) goto L_0x005c
            w5.n r0 = w5.n.w()
            q5.b r0 = r0.m()
            if (r0 == 0) goto L_0x0056
            co.hyperverge.hypersnapsdk.objects.HVError r0 = new co.hyperverge.hypersnapsdk.objects.HVError
            r18 = r4
            java.lang.String r4 = "savedInstance is not null"
            r0.<init>(r2, r4)
            w5.n r4 = w5.n.w()
            q5.b r4 = r4.m()
            r4.Y(r0)
            goto L_0x0058
        L_0x0056:
            r18 = r4
        L_0x0058:
            r20.finish()
            goto L_0x005e
        L_0x005c:
            r18 = r4
        L_0x005e:
            android.content.Intent r0 = r20.getIntent()
            r4 = 0
            java.lang.String r2 = "shouldUseBackCam"
            boolean r2 = r0.getBooleanExtra(r2, r4)
            android.content.Intent r0 = r20.getIntent()     // Catch:{ JSONException -> 0x0086 }
            android.os.Bundle r0 = r0.getExtras()     // Catch:{ JSONException -> 0x0086 }
            if (r0 == 0) goto L_0x0083
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0086 }
            r19 = r2
            java.lang.String r2 = "customUIStrings"
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0081 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0081 }
            goto L_0x00b5
        L_0x0081:
            r0 = move-exception
            goto L_0x0089
        L_0x0083:
            r19 = r2
            goto L_0x00b4
        L_0x0086:
            r0 = move-exception
            r19 = r2
        L_0x0089:
            java.lang.String r2 = n
            java.lang.String r4 = r0.getMessage()
            java.util.Objects.requireNonNull(r4)
            android.util.Log.e(r2, r4)
            w5.n r2 = w5.n.w()
            q5.b r2 = r2.m()
            if (r2 == 0) goto L_0x00b4
            co.hyperverge.hypersnapsdk.objects.HVError r2 = new co.hyperverge.hypersnapsdk.objects.HVError
            java.lang.String r0 = r0.getMessage()
            r4 = 2
            r2.<init>(r4, r0)
            w5.n r0 = w5.n.w()
            q5.b r0 = r0.m()
            r0.Y(r2)
        L_0x00b4:
            r4 = 0
        L_0x00b5:
            if (r4 == 0) goto L_0x0283
            boolean r0 = r4.has(r3)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x00d4
            int r0 = r4.getInt(r3)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 <= 0) goto L_0x00d4
            android.widget.TextView r0 = r1.f13266h     // Catch:{ JSONException -> 0x02b3 }
            android.content.Context r2 = r20.getApplicationContext()     // Catch:{ JSONException -> 0x02b3 }
            int r3 = r4.getInt(r3)     // Catch:{ JSONException -> 0x02b3 }
            android.graphics.Typeface r2 = androidx.core.content.res.h.g(r2, r3)     // Catch:{ JSONException -> 0x02b3 }
            r0.setTypeface(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x00d4:
            boolean r0 = r4.has(r15)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x00f1
            int r0 = r4.getInt(r15)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 <= 0) goto L_0x00f1
            android.widget.TextView r0 = r1.f13267i     // Catch:{ JSONException -> 0x02b3 }
            android.content.Context r2 = r20.getApplicationContext()     // Catch:{ JSONException -> 0x02b3 }
            int r3 = r4.getInt(r15)     // Catch:{ JSONException -> 0x02b3 }
            android.graphics.Typeface r2 = androidx.core.content.res.h.g(r2, r3)     // Catch:{ JSONException -> 0x02b3 }
            r0.setTypeface(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x00f1:
            boolean r0 = r4.has(r14)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x010e
            int r0 = r4.getInt(r14)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 <= 0) goto L_0x010e
            android.widget.TextView r0 = r1.j     // Catch:{ JSONException -> 0x02b3 }
            android.content.Context r2 = r20.getApplicationContext()     // Catch:{ JSONException -> 0x02b3 }
            int r3 = r4.getInt(r14)     // Catch:{ JSONException -> 0x02b3 }
            android.graphics.Typeface r2 = androidx.core.content.res.h.g(r2, r3)     // Catch:{ JSONException -> 0x02b3 }
            r0.setTypeface(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x010e:
            boolean r0 = r4.has(r13)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x012b
            int r0 = r4.getInt(r13)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 <= 0) goto L_0x012b
            android.widget.TextView r0 = r1.k     // Catch:{ JSONException -> 0x02b3 }
            android.content.Context r2 = r20.getApplicationContext()     // Catch:{ JSONException -> 0x02b3 }
            int r3 = r4.getInt(r13)     // Catch:{ JSONException -> 0x02b3 }
            android.graphics.Typeface r2 = androidx.core.content.res.h.g(r2, r3)     // Catch:{ JSONException -> 0x02b3 }
            r0.setTypeface(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x012b:
            boolean r0 = r4.has(r12)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x0148
            int r0 = r4.getInt(r12)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 <= 0) goto L_0x0148
            android.widget.TextView r0 = r1.f13269m     // Catch:{ JSONException -> 0x02b3 }
            android.content.Context r2 = r20.getApplicationContext()     // Catch:{ JSONException -> 0x02b3 }
            int r3 = r4.getInt(r12)     // Catch:{ JSONException -> 0x02b3 }
            android.graphics.Typeface r2 = androidx.core.content.res.h.g(r2, r3)     // Catch:{ JSONException -> 0x02b3 }
            r0.setTypeface(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x0148:
            boolean r0 = r4.has(r11)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x0165
            int r0 = r4.getInt(r11)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 <= 0) goto L_0x0165
            android.widget.TextView r0 = r1.f13268l     // Catch:{ JSONException -> 0x02b3 }
            android.content.Context r2 = r20.getApplicationContext()     // Catch:{ JSONException -> 0x02b3 }
            int r3 = r4.getInt(r11)     // Catch:{ JSONException -> 0x02b3 }
            android.graphics.Typeface r2 = androidx.core.content.res.h.g(r2, r3)     // Catch:{ JSONException -> 0x02b3 }
            r0.setTypeface(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x0165:
            boolean r0 = r4.has(r10)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x0182
            int r0 = r4.getInt(r10)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 <= 0) goto L_0x0182
            android.widget.TextView r0 = r1.f13265g     // Catch:{ JSONException -> 0x02b3 }
            android.content.Context r2 = r20.getApplicationContext()     // Catch:{ JSONException -> 0x02b3 }
            int r3 = r4.getInt(r10)     // Catch:{ JSONException -> 0x02b3 }
            android.graphics.Typeface r2 = androidx.core.content.res.h.g(r2, r3)     // Catch:{ JSONException -> 0x02b3 }
            r0.setTypeface(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x0182:
            boolean r0 = r4.has(r9)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x019f
            java.lang.String r0 = r4.getString(r9)     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x02b3 }
            boolean r0 = r0.isEmpty()     // Catch:{ JSONException -> 0x02b3 }
            if (r0 != 0) goto L_0x019f
            android.widget.TextView r0 = r1.f13266h     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r2 = r4.getString(r9)     // Catch:{ JSONException -> 0x02b3 }
            r0.setText(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x019f:
            boolean r0 = r4.has(r8)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x01bc
            java.lang.String r0 = r4.getString(r8)     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x02b3 }
            boolean r0 = r0.isEmpty()     // Catch:{ JSONException -> 0x02b3 }
            if (r0 != 0) goto L_0x01bc
            android.widget.TextView r0 = r1.f13267i     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r2 = r4.getString(r8)     // Catch:{ JSONException -> 0x02b3 }
            r0.setText(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x01bc:
            boolean r0 = r4.has(r7)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x01d9
            java.lang.String r0 = r4.getString(r7)     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x02b3 }
            boolean r0 = r0.isEmpty()     // Catch:{ JSONException -> 0x02b3 }
            if (r0 != 0) goto L_0x01d9
            android.widget.TextView r0 = r1.j     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r2 = r4.getString(r7)     // Catch:{ JSONException -> 0x02b3 }
            r0.setText(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x01d9:
            boolean r0 = r4.has(r6)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x01f6
            java.lang.String r0 = r4.getString(r6)     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x02b3 }
            boolean r0 = r0.isEmpty()     // Catch:{ JSONException -> 0x02b3 }
            if (r0 != 0) goto L_0x01f6
            android.widget.TextView r0 = r1.k     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r2 = r4.getString(r6)     // Catch:{ JSONException -> 0x02b3 }
            r0.setText(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x01f6:
            boolean r0 = r4.has(r5)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x0213
            java.lang.String r0 = r4.getString(r5)     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x02b3 }
            boolean r0 = r0.isEmpty()     // Catch:{ JSONException -> 0x02b3 }
            if (r0 != 0) goto L_0x0213
            android.widget.TextView r0 = r1.f13269m     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r2 = r4.getString(r5)     // Catch:{ JSONException -> 0x02b3 }
            r0.setText(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x0213:
            r2 = r18
            boolean r0 = r4.has(r2)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x0232
            java.lang.String r0 = r4.getString(r2)     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x02b3 }
            boolean r0 = r0.isEmpty()     // Catch:{ JSONException -> 0x02b3 }
            if (r0 != 0) goto L_0x0232
            android.widget.TextView r0 = r1.f13268l     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r2 = r4.getString(r2)     // Catch:{ JSONException -> 0x02b3 }
            r0.setText(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x0232:
            if (r19 == 0) goto L_0x0264
            r2 = r17
            boolean r0 = r4.has(r2)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x0254
            java.lang.String r0 = r4.getString(r2)     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x02b3 }
            boolean r0 = r0.isEmpty()     // Catch:{ JSONException -> 0x02b3 }
            if (r0 != 0) goto L_0x0254
            android.widget.TextView r0 = r1.f13265g     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r2 = r4.getString(r2)     // Catch:{ JSONException -> 0x02b3 }
            r0.setText(r2)     // Catch:{ JSONException -> 0x02b3 }
            goto L_0x0283
        L_0x0254:
            android.widget.TextView r0 = r1.f13265g     // Catch:{ JSONException -> 0x02b3 }
            android.content.res.Resources r2 = r20.getResources()     // Catch:{ JSONException -> 0x02b3 }
            int r3 = co.hyperverge.hypersnapsdk.R.string.faceInstructionsProceedBackCam     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r2 = r2.getString(r3)     // Catch:{ JSONException -> 0x02b3 }
            r0.setText(r2)     // Catch:{ JSONException -> 0x02b3 }
            goto L_0x0283
        L_0x0264:
            r2 = r16
            boolean r0 = r4.has(r2)     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x0283
            java.lang.String r0 = r4.getString(r2)     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x02b3 }
            boolean r0 = r0.isEmpty()     // Catch:{ JSONException -> 0x02b3 }
            if (r0 != 0) goto L_0x0283
            android.widget.TextView r0 = r1.f13265g     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r2 = r4.getString(r2)     // Catch:{ JSONException -> 0x02b3 }
            r0.setText(r2)     // Catch:{ JSONException -> 0x02b3 }
        L_0x0283:
            w5.n r0 = w5.n.w()     // Catch:{ JSONException -> 0x02b3 }
            q5.b r0 = r0.m()     // Catch:{ JSONException -> 0x02b3 }
            if (r0 == 0) goto L_0x02dc
            co.hyperverge.hypersnapsdk.c.p r0 = r1.f13263e     // Catch:{ JSONException -> 0x02b3 }
            java.lang.Long r0 = r0.c()     // Catch:{ JSONException -> 0x02b3 }
            long r2 = r0.longValue()     // Catch:{ JSONException -> 0x02b3 }
            w5.n r0 = w5.n.w()     // Catch:{ JSONException -> 0x02b3 }
            q5.b r0 = r0.m()     // Catch:{ JSONException -> 0x02b3 }
            r0.K(r2)     // Catch:{ JSONException -> 0x02b3 }
            w5.n r0 = w5.n.w()     // Catch:{ JSONException -> 0x02b3 }
            q5.b r0 = r0.m()     // Catch:{ JSONException -> 0x02b3 }
            r0.a()     // Catch:{ JSONException -> 0x02b3 }
            co.hyperverge.hypersnapsdk.c.p r0 = r1.f13264f     // Catch:{ JSONException -> 0x02b3 }
            r0.d()     // Catch:{ JSONException -> 0x02b3 }
            goto L_0x02dc
        L_0x02b3:
            r0 = move-exception
            java.lang.String r2 = n
            java.lang.String r3 = r0.getMessage()
            android.util.Log.e(r2, r3)
            w5.n r2 = w5.n.w()
            q5.b r2 = r2.m()
            if (r2 == 0) goto L_0x02dc
            co.hyperverge.hypersnapsdk.objects.HVError r2 = new co.hyperverge.hypersnapsdk.objects.HVError
            java.lang.String r0 = r0.getMessage()
            r3 = 2
            r2.<init>(r3, r0)
            w5.n r0 = w5.n.w()
            q5.b r0 = r0.m()
            r0.Y(r2)
        L_0x02dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.hypersnapsdk.activities.HVFaceInstructionActivity.onCreate(android.os.Bundle):void");
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
