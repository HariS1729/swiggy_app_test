package co.hyperverge.hypersnapsdk.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.res.h;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.c.p;
import co.hyperverge.hypersnapsdk.objects.HVBaseConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.feature.menu.MenuConstants;
import java.io.File;
import w5.g;
import w5.n;
import z5.f;

public class HVRetakeActivity extends u {

    /* renamed from: e  reason: collision with root package name */
    private final String f13271e = getClass().getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    ImageView f13272f;

    /* renamed from: g  reason: collision with root package name */
    TextView f13273g;

    /* renamed from: h  reason: collision with root package name */
    TextView f13274h;

    /* renamed from: i  reason: collision with root package name */
    TextView f13275i;
    TextView j;
    String k = "";

    /* renamed from: l  reason: collision with root package name */
    boolean f13276l = false;

    /* renamed from: m  reason: collision with root package name */
    boolean f13277m = false;
    int n;

    /* renamed from: o  reason: collision with root package name */
    float f13278o;

    /* renamed from: p  reason: collision with root package name */
    double f13279p;
    HVBaseConfig q;

    /* renamed from: r  reason: collision with root package name */
    String f13280r;

    /* renamed from: s  reason: collision with root package name */
    private p f13281s = new p();
    private p t = new p();

    /* renamed from: u  reason: collision with root package name */
    private String f13282u;

    private String A1(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void B1(View view) {
        long longValue = this.t.c().longValue();
        if (this.f13282u.contains("Face")) {
            n.w().a(getApplicationContext()).M(longValue);
        }
        if (this.f13282u.contains("Doc")) {
            n.w().a(getApplicationContext()).n0(longValue);
        }
        F1();
    }

    private void D1() {
        this.f13272f = (ImageView) findViewById(R.id.review_image);
        this.f13273g = (TextView) findViewById(R.id.desc_text);
        this.f13275i = (TextView) findViewById(R.id.title_text);
        this.j = (TextView) findViewById(R.id.retake_button);
        this.f13274h = (TextView) findViewById(R.id.doc_desc_text);
        this.j.setOnClickListener(new p(this));
    }

    private void G1() {
        try {
            if (this.q.getErrorReviewScreenTitleTypeface() > 0) {
                this.f13275i.setTypeface(h.g(getApplicationContext(), this.q.getErrorReviewScreenTitleTypeface()));
            }
            if (this.q.getErrorReviewScreenDescTypeface() > 0) {
                this.f13273g.setTypeface(h.g(getApplicationContext(), this.q.getErrorReviewScreenDescTypeface()));
                this.f13274h.setTypeface(h.g(getApplicationContext(), this.q.getErrorReviewScreenDescTypeface()));
            }
            if (this.q.getErroReviewScreenRetakeButtonTypeface() > 0) {
                this.j.setTypeface(h.g(getApplicationContext(), this.q.getErroReviewScreenRetakeButtonTypeface()));
            }
        } catch (Exception e11) {
            Log.e(this.f13271e, e11.getMessage());
            HVError hVError = new HVError(2, e11.getMessage());
            if (this.f13282u.contains("Face")) {
                n.w().a(getApplicationContext()).S(hVError);
            }
            if (this.f13282u.contains("Doc")) {
                n.w().a(getApplicationContext()).j0(hVError);
            }
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void C1() {
        try {
            if (this.q.getErrorReviewTitle() != null && !this.q.getErrorReviewTitle().isEmpty()) {
                this.f13275i.setText(this.q.getErrorReviewTitle());
            }
            if (this.q.getErrorReviewRetakeButton() != null && !this.q.getErrorReviewRetakeButton().isEmpty()) {
                this.j.setText(this.q.getErrorReviewRetakeButton());
            }
            if (this.f13280r == null) {
                return;
            }
            if (this.f13277m) {
                this.f13274h.setVisibility(4);
                this.f13273g.setText(A1(this.f13280r));
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13274h.getLayoutParams();
                layoutParams.setMargins(f.b(this, 40.0f), f.b(this, 30.0f), f.b(this, 40.0f), 0);
                this.f13274h.setLayoutParams(layoutParams);
                this.f13274h.requestLayout();
                return;
            }
            this.f13273g.setVisibility(8);
            this.f13274h.setText(A1(this.f13280r));
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f13274h.getLayoutParams();
            if (this.f13278o < 1.0f) {
                layoutParams2.setMargins(f.b(this, 40.0f), f.b(this, 60.0f), f.b(this, 40.0f), f.b(this, 80.0f));
            } else {
                layoutParams2.setMargins(f.b(this, 40.0f), f.b(this, 6.0f), f.b(this, 40.0f), f.b(this, 10.0f));
            }
            this.f13274h.setLayoutParams(layoutParams2);
            this.f13274h.requestLayout();
        } catch (Exception e11) {
            Log.e(this.f13271e, e11.getMessage());
            HVError hVError = new HVError(2, e11.getMessage());
            if (this.f13282u.contains("Face")) {
                n.w().a(getApplicationContext()).S(hVError);
            }
            if (this.f13282u.contains("Doc")) {
                n.w().a(getApplicationContext()).j0(hVError);
            }
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void E1() {
        Bitmap bitmap;
        try {
            Bitmap d11 = g.d(this.k);
            if (d11 != null) {
                new File(this.k);
                if (this.f13277m) {
                    bitmap = f.e(d11, Integer.valueOf(this.n));
                } else {
                    bitmap = f.c(this, d11, this.f13279p, this.f13278o, f.b(this, 10.0f), this.f13276l);
                    ((RelativeLayout.LayoutParams) this.f13272f.getLayoutParams()).addRule(13);
                }
                this.f13272f.getLayoutParams().height = -2;
                this.f13272f.getLayoutParams().width = -2;
                this.f13272f.setAdjustViewBounds(true);
                this.f13272f.requestLayout();
                this.f13272f.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f13272f.setImageBitmap(bitmap);
            }
        } catch (Exception e11) {
            Log.e(this.f13271e, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void F1() {
        if (n.w().m() != null) {
            n.w().m().a0();
        }
        setResult(21);
        finish();
    }

    /* access modifiers changed from: package-private */
    public HVBaseConfig h1() {
        return this.q;
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13281s.d();
        this.f13282u = getCallingActivity().getClassName();
        setContentView(R.layout.hv_activity_retake);
        D1();
        if (bundle != null) {
            finish();
        }
        if (n.w().m() != null) {
            n.w().m().v();
        }
        Intent intent = getIntent();
        this.k = intent.getStringExtra("imageUri");
        if (intent.hasExtra("extraPadding")) {
            this.f13279p = intent.getDoubleExtra("extraPadding", 0.0d);
        }
        if (intent.hasExtra("setPadding")) {
            this.f13276l = intent.getBooleanExtra("setPadding", false);
        }
        if (intent.hasExtra(MenuConstants.MENU_ICON_ASPECT_RATIO)) {
            this.f13278o = intent.getFloatExtra(MenuConstants.MENU_ICON_ASPECT_RATIO, 0.0f);
        }
        if (intent.hasExtra("face")) {
            this.f13277m = intent.getBooleanExtra("face", false);
            this.n = intent.getIntExtra("radius", 0);
        }
        this.q = (HVBaseConfig) intent.getSerializableExtra(PaymentConstants.Category.CONFIG);
        if (intent.hasExtra("retryMessage")) {
            this.f13280r = intent.getStringExtra("retryMessage");
        }
        G1();
        l1(this.q, (View) null);
        C1();
        long longValue = this.f13281s.c().longValue();
        if (this.f13282u.contains("Face")) {
            n.w().a(getApplicationContext()).k0(longValue);
            n.w().a(getApplicationContext()).n();
        }
        if (this.f13282u.contains("Doc")) {
            n.w().a(getApplicationContext()).g0(longValue);
            n.w().a(getApplicationContext()).e0();
        }
        this.t.d();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        E1();
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
        setResult(20);
        finish();
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
