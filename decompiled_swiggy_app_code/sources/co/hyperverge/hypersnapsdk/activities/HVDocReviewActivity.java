package co.hyperverge.hypersnapsdk.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.h;
import androidx.core.widget.ContentLoadingProgressBar;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.c.p;
import co.hyperverge.hypersnapsdk.objects.HVBaseConfig;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import in.swiggy.android.tejas.feature.menu.MenuConstants;
import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import w5.g;
import w5.n;
import z5.c;
import z5.f;

@SuppressLint({"LogNotTimber"})
public class HVDocReviewActivity extends u {
    private final ExecutorService A = Executors.newSingleThreadExecutor();

    /* renamed from: e  reason: collision with root package name */
    private final p f13180e = new p();

    /* renamed from: f  reason: collision with root package name */
    private final p f13181f = new p();

    /* renamed from: g  reason: collision with root package name */
    private final String f13182g = getClass().getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    private ImageView f13183h;

    /* renamed from: i  reason: collision with root package name */
    private FloatingActionButton f13184i;
    private FloatingActionButton j;
    private CardView k;

    /* renamed from: l  reason: collision with root package name */
    private ContentLoadingProgressBar f13185l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f13186m;
    private TextView n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f13187o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f13188p;
    private TextView q;

    /* renamed from: r  reason: collision with root package name */
    private TextView f13189r;

    /* renamed from: s  reason: collision with root package name */
    private String f13190s = "";
    private String t = "";

    /* renamed from: u  reason: collision with root package name */
    private int f13191u;
    private int v;

    /* renamed from: w  reason: collision with root package name */
    private float f13192w;

    /* renamed from: x  reason: collision with root package name */
    private double f13193x;

    /* renamed from: y  reason: collision with root package name */
    private HVDocConfig f13194y;

    /* renamed from: z  reason: collision with root package name */
    private String f13195z;

    /* access modifiers changed from: private */
    public /* synthetic */ void I1(Bitmap bitmap) {
        O1(false);
        P1(bitmap);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K1(View view) {
        if (n.w().m() != null) {
            n.w().m().c(this.f13181f.c().longValue());
        }
        V1();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L1(File file) {
        runOnUiThread(new h(this, c.a(file)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M1(List list) {
        O1(false);
        R1(list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N1(AtomicInteger atomicInteger, List list, View view) {
        int i11 = atomicInteger.get();
        boolean z11 = false;
        if (i11 > 0) {
            i11 = atomicInteger.decrementAndGet();
            P1((Bitmap) list.get(i11));
            this.f13189r.setText(String.format(getString(R.string.hv_pdf_page_count), new Object[]{Integer.valueOf(i11 + 1), Integer.valueOf(list.size())}));
        }
        this.f13184i.setEnabled(i11 != 0 && list.size() > 1);
        FloatingActionButton floatingActionButton = this.j;
        if (i11 != list.size() - 1 && list.size() > 1) {
            z11 = true;
        }
        floatingActionButton.setEnabled(z11);
    }

    private void O1(boolean z11) {
        int i11 = 0;
        this.f13185l.setVisibility(z11 ? 0 : 8);
        this.q.setVisibility(z11 ? 4 : 0);
        TextView textView = this.f13188p;
        if (z11) {
            i11 = 4;
        }
        textView.setVisibility(i11);
    }

    private void P1(Bitmap bitmap) {
        if (bitmap != null) {
            this.f13183h.setImageBitmap(bitmap);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q1(View view) {
        if (n.w().m() != null) {
            n.w().m().k(this.f13181f.c().longValue());
        }
        Z1();
    }

    private void R1(List<Bitmap> list) {
        if (list.size() != 0) {
            AtomicInteger atomicInteger = new AtomicInteger(0);
            if (list.size() > 1) {
                this.k.setVisibility(0);
            }
            P1(list.get(atomicInteger.get()));
            this.f13189r.setText(String.format(getString(R.string.hv_pdf_page_count), new Object[]{Integer.valueOf(atomicInteger.get() + 1), Integer.valueOf(list.size())}));
            this.f13184i.setOnClickListener(new d(this, atomicInteger, list));
            this.j.setOnClickListener(new c(this, atomicInteger, list));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void T1(AtomicInteger atomicInteger, List list, View view) {
        int i11 = atomicInteger.get();
        boolean z11 = true;
        if (i11 < list.size() - 1) {
            i11 = atomicInteger.incrementAndGet();
            P1((Bitmap) list.get(i11));
            this.f13189r.setText(String.format(getString(R.string.hv_pdf_page_count), new Object[]{Integer.valueOf(i11 + 1), Integer.valueOf(list.size())}));
        }
        this.f13184i.setEnabled(i11 != 0 && list.size() > 1);
        FloatingActionButton floatingActionButton = this.j;
        if (i11 == list.size() - 1 || list.size() <= 1) {
            z11 = false;
        }
        floatingActionButton.setEnabled(z11);
    }

    private void W1() {
        this.f13183h = (ImageView) findViewById(R.id.review_image);
        this.f13186m = (TextView) findViewById(R.id.desc_text);
        this.n = (TextView) findViewById(R.id.title_text);
        this.f13187o = (TextView) findViewById(R.id.tvSubtitle);
        this.f13188p = (TextView) findViewById(R.id.confirm_button);
        this.q = (TextView) findViewById(R.id.retake_button);
        this.k = (CardView) findViewById(R.id.cvPdfPageSwitcher);
        this.f13184i = (FloatingActionButton) findViewById(R.id.fabPrevious);
        this.j = (FloatingActionButton) findViewById(R.id.fabNext);
        this.f13189r = (TextView) findViewById(R.id.tvPage);
        this.f13185l = (ContentLoadingProgressBar) findViewById(R.id.clProgressBar);
        this.f13188p.setOnClickListener(new b(this));
        this.q.setOnClickListener(new a(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void X1() {
        try {
            Bitmap d11 = g.d(this.f13190s);
            if (d11 != null) {
                Bitmap c11 = f.c(this, d11, this.f13193x, this.f13192w, f.b(this, 10.0f), this.f13194y.isShouldSetPadding());
                d11.recycle();
                runOnUiThread(new f(this, c11));
            }
        } catch (Exception e11) {
            Log.e(this.f13182g, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    @SuppressLint({"LogNotTimber"})
    private void a2() {
        try {
            if (this.f13194y.getReviewScreenTitleTypeface() > 0) {
                this.n.setTypeface(h.g(getApplicationContext(), this.f13194y.getReviewScreenTitleTypeface()));
            }
            if (this.f13194y.getReviewScreenDescTypeface() > 0) {
                this.f13186m.setTypeface(h.g(getApplicationContext(), this.f13194y.getReviewScreenDescTypeface()));
            }
            if (this.f13194y.getReviewScreenConfirmButtonTypeface() > 0) {
                this.f13188p.setTypeface(h.g(getApplicationContext(), this.f13194y.getReviewScreenConfirmButtonTypeface()));
            }
            if (this.f13194y.getReviewScreenRetakeButtonTypeface() > 0) {
                this.q.setTypeface(h.g(getApplicationContext(), this.f13194y.getReviewScreenRetakeButtonTypeface()));
            }
        } catch (Exception e11) {
            Log.e(this.f13182g, e11.getMessage());
            if (n.w().m() != null) {
                n.w().m().r0(new HVError(2, e11.getMessage()));
            }
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void U1() {
        try {
            String docReviewTitle = this.f13194y.getDocReviewTitle();
            if (!TextUtils.isEmpty(docReviewTitle)) {
                this.n.setText(docReviewTitle);
            }
            String docReviewDescription = this.f13194y.getDocReviewDescription();
            if (!TextUtils.isEmpty(docReviewDescription)) {
                this.f13186m.setText(docReviewDescription);
            }
            String docReviewSubtitle = this.f13194y.getDocReviewSubtitle();
            this.f13187o.setText(docReviewSubtitle);
            this.f13187o.setVisibility(TextUtils.isEmpty(docReviewSubtitle) ? 8 : 0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13186m.getLayoutParams();
            int b11 = f.b(this, 40.0f);
            if (this.f13192w < 1.0f) {
                layoutParams.setMargins(b11, f.b(this, 60.0f), b11, 0);
            } else {
                layoutParams.setMargins(b11, f.b(this, 6.0f), b11, 0);
            }
            this.f13186m.requestLayout();
        } catch (Exception e11) {
            Log.e(this.f13182g, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void V1() {
        Intent intent = new Intent();
        intent.putExtra("imageUri", this.f13190s);
        if (this.f13194y.isShouldReadQR()) {
            intent.putExtra("qrCodeCroppedImageUri", this.t);
        }
        setResult(7, intent);
        finish();
    }

    public void Y1() {
        File file = new File(this.f13190s);
        if (Objects.equals(z5.g.m(file.getPath()), "pdf")) {
            O1(true);
            this.A.submit(new g(this, file));
            return;
        }
        this.k.setVisibility(8);
        O1(true);
        this.A.submit(new e(this));
    }

    public void Z1() {
        if (n.w().m() != null) {
            n.w().m().a0();
        }
        setResult(6);
        finish();
    }

    /* access modifiers changed from: package-private */
    public HVBaseConfig h1() {
        return this.f13194y;
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13180e.d();
        setContentView(R.layout.hv_activity_doc_review);
        Intent intent = getIntent();
        this.f13190s = intent.getStringExtra("imageUri");
        this.f13193x = intent.getDoubleExtra("extraPadding", 0.0d);
        this.f13192w = intent.getFloatExtra(MenuConstants.MENU_ICON_ASPECT_RATIO, 0.0f);
        this.f13194y = (HVDocConfig) intent.getSerializableExtra(HVDocConfig.KEY);
        this.f13191u = intent.getIntExtra("viewWidth", 0);
        this.v = intent.getIntExtra("viewHeight", 0);
        if (this.f13194y.isShouldReadQR()) {
            this.t = intent.getStringExtra("qrCodeCroppedImageUri");
        }
        if (intent.hasExtra("retryMessage")) {
            this.f13195z = intent.getStringExtra("retryMessage");
        }
        W1();
        if (bundle != null) {
            if (n.w().m() != null) {
                n.w().m().r0(new HVError(2, "savedInstanceState is not null"));
            }
            finish();
        }
        if (n.w().m() != null) {
            n.w().m().v();
        }
        a2();
        l1(this.f13194y, (View) null);
        try {
            JSONObject customUIStrings = this.f13194y.getCustomUIStrings();
            if (customUIStrings != null) {
                if (customUIStrings.has("docReviewRetakeButton") && !customUIStrings.getString("docReviewRetakeButton").trim().isEmpty()) {
                    this.q.setText(customUIStrings.getString("docReviewRetakeButton"));
                }
                if (customUIStrings.has("docReviewContinueButton") && !customUIStrings.getString("docReviewContinueButton").trim().isEmpty()) {
                    this.f13188p.setText(customUIStrings.getString("docReviewContinueButton"));
                }
            }
            if (n.w().m() != null) {
                n.w().m().d(this.f13180e.c().longValue());
                n.w().m().l();
                this.f13181f.d();
            }
        } catch (Exception e11) {
            Log.e(this.f13182g, e11.getMessage());
            if (n.w().m() != null) {
                n.w().m().r0(new HVError(2, e11.getMessage()));
            }
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
        Y1();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        U1();
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
        setResult(5);
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
