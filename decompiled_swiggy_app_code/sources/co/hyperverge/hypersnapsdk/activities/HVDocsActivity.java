package co.hyperverge.hypersnapsdk.activities;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.c.p;
import co.hyperverge.hypersnapsdk.listeners.DocCaptureCompletionHandler;
import co.hyperverge.hypersnapsdk.objects.HVBaseConfig;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HyperSnapParams$Region;
import com.google.android.exoplayer2.ExoPlayer;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.AsyncTaskInstrumentation;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import com.xiaomi.mipush.sdk.Constants;
import h5.b;
import h6.a;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.feature.menu.MenuConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import w5.n;
import w5.o;
import z5.d;

@Instrumented
@SuppressLint({"ClickableViewAccessibility", "LogNotTimber"})
public class HVDocsActivity extends u implements View.OnClickListener {
    /* access modifiers changed from: private */
    public static final String H0 = HVDocsActivity.class.getCanonicalName();
    public static String I0 = "DocumentActivity";
    /* access modifiers changed from: private */
    public static DocCaptureCompletionHandler J0;
    final float[] A;
    private float A0;
    private final float B;
    /* access modifiers changed from: private */
    public AtomicBoolean B0;
    private final boolean C;
    /* access modifiers changed from: private */
    public int C0;
    FrameLayout D;
    private int D0;
    FrameLayout E;
    private final h5.a E0;
    h5.b F;
    private float F0;
    View G;
    private float G0;
    View H;
    /* access modifiers changed from: private */
    public co.hyperverge.hypersnapsdk.objects.e I;
    private final Animation.AnimationListener K;
    private ConstraintLayout L;
    ImageView M;
    ImageView N;
    TextView O;
    TextView P;
    l6.b Q;
    l6.d R;
    File S;
    File T;
    boolean U;
    SensorManager V;
    z5.d W;

    /* renamed from: c0  reason: collision with root package name */
    SensorEventListener f13196c0;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public HVDocConfig.Document f13197e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public HVDocConfig f13198f;

    /* renamed from: g  reason: collision with root package name */
    private final p f13199g = new p();

    /* renamed from: h  reason: collision with root package name */
    private final p f13200h = new p();

    /* renamed from: i  reason: collision with root package name */
    private final p f13201i = new p();
    private final p j = new p();
    /* access modifiers changed from: private */
    public final p k = new p();

    /* renamed from: l  reason: collision with root package name */
    private final p f13202l = new p();

    /* renamed from: m  reason: collision with root package name */
    private final p f13203m = new p();
    /* access modifiers changed from: private */
    public HVError n;

    /* renamed from: n0  reason: collision with root package name */
    String f13204n0;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final k6.a f13205o = new k6.a();

    /* renamed from: o0  reason: collision with root package name */
    String f13206o0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f13207p = false;

    /* renamed from: p0  reason: collision with root package name */
    String f13208p0;
    private final Handler q = new Handler();

    /* renamed from: q0  reason: collision with root package name */
    double f13209q0;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public String f13210r = "";
    /* access modifiers changed from: private */

    /* renamed from: r0  reason: collision with root package name */
    public String f13211r0;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public Location f13212s;
    /* access modifiers changed from: private */

    /* renamed from: s0  reason: collision with root package name */
    public String f13213s0;
    final float[][] t;
    /* access modifiers changed from: private */

    /* renamed from: t0  reason: collision with root package name */
    public String f13214t0;

    /* renamed from: u  reason: collision with root package name */
    final float[][] f13215u;
    /* access modifiers changed from: private */

    /* renamed from: u0  reason: collision with root package name */
    public File f13216u0;
    final float[][] v;
    /* access modifiers changed from: private */

    /* renamed from: v0  reason: collision with root package name */
    public File f13217v0;

    /* renamed from: w  reason: collision with root package name */
    final float[][] f13218w;
    /* access modifiers changed from: private */

    /* renamed from: w0  reason: collision with root package name */
    public int f13219w0;

    /* renamed from: x  reason: collision with root package name */
    final float[] f13220x;
    /* access modifiers changed from: private */

    /* renamed from: x0  reason: collision with root package name */
    public int f13221x0;

    /* renamed from: y  reason: collision with root package name */
    final float[] f13222y;

    /* renamed from: y0  reason: collision with root package name */
    private float f13223y0;

    /* renamed from: z  reason: collision with root package name */
    final float[] f13224z;

    /* renamed from: z0  reason: collision with root package name */
    private float f13225z0;

    class a implements Animation.AnimationListener {
        a() {
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class b implements Animation.AnimationListener {
        b() {
        }

        public void onAnimationEnd(Animation animation) {
            HVDocsActivity.this.G.setVisibility(8);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            HVDocsActivity.this.G.setVisibility(0);
        }
    }

    @Instrumented
    class c extends h5.a {

        class a implements k {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ w5.d f13229a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ProgressDialog f13230b;

            a(w5.d dVar, ProgressDialog progressDialog) {
                this.f13229a = dVar;
                this.f13230b = progressDialog;
            }

            public void a(String str, Bitmap bitmap) {
                String str2;
                c.this.v(new File(str));
                HVDocsActivity.this.B0.set(true);
                if (bitmap == null || !new File(str).exists()) {
                    HVDocsActivity.this.e3();
                    HVDocsActivity.this.a2(new HVError(2, "Error while capturing the document"), new co.hyperverge.hypersnapsdk.objects.b((JSONObject) null, (JSONObject) null, (String) null, HVDocsActivity.this.f13206o0));
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    if (HVDocsActivity.this.f13198f.isShouldExportPDF()) {
                        HVDocsActivity hVDocsActivity = HVDocsActivity.this;
                        hVDocsActivity.f13204n0 = w5.k.a(bitmap, HVDocsActivity.this.T.getPath() + "/hv_" + System.currentTimeMillis() + ".pdf");
                        jSONObject.put("pdfUri", HVDocsActivity.this.f13204n0);
                    }
                    if (HVDocsActivity.this.f13198f.getOcrHeaders() == null || !HVDocsActivity.this.f13198f.getOcrHeaders().has("transactionId")) {
                        str2 = o.r();
                    } else {
                        str2 = HVDocsActivity.this.f13198f.getOcrHeaders().getString("transactionId");
                    }
                    String str3 = str2;
                    if (n.w().z().g()) {
                        new h6.c().a(new C0109a(str, str3, jSONObject));
                        return;
                    }
                    c cVar = c.this;
                    cVar.E(str, HVDocsActivity.this.f13213s0, str3, (co.hyperverge.hypersnapsdk.objects.e) null, this.f13229a, this.f13230b, jSONObject);
                } catch (Exception e11) {
                    Log.e(HVDocsActivity.H0, e11.getMessage());
                    if (n.w().s() != null) {
                        n.w().s().a(e11);
                    }
                }
            }

            /* renamed from: co.hyperverge.hypersnapsdk.activities.HVDocsActivity$c$a$a  reason: collision with other inner class name */
            class C0109a implements a.C0128a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f13232a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f13233b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ JSONObject f13234c;

                C0109a(String str, String str2, JSONObject jSONObject) {
                    this.f13232a = str;
                    this.f13233b = str2;
                    this.f13234c = jSONObject;
                }

                public void a(co.hyperverge.hypersnapsdk.objects.e eVar) {
                    co.hyperverge.hypersnapsdk.objects.e unused = HVDocsActivity.this.I = eVar;
                    c cVar = c.this;
                    String str = this.f13232a;
                    String j32 = HVDocsActivity.this.f13213s0;
                    String str2 = this.f13233b;
                    a aVar = a.this;
                    cVar.E(str, j32, str2, eVar, aVar.f13229a, aVar.f13230b, this.f13234c);
                }

                public void a() {
                    c cVar = c.this;
                    String str = this.f13232a;
                    String j32 = HVDocsActivity.this.f13213s0;
                    String str2 = this.f13233b;
                    a aVar = a.this;
                    cVar.E(str, j32, str2, (co.hyperverge.hypersnapsdk.objects.e) null, aVar.f13229a, aVar.f13230b, this.f13234c);
                }
            }
        }

        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ float f13236a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ float f13237b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f13238c;

            b(float f11, float f12, boolean z11) {
                this.f13236a = f11;
                this.f13237b = f12;
                this.f13238c = z11;
            }

            public void run() {
                float f11 = this.f13236a;
                if (f11 > 0.0f || this.f13237b > 0.0f) {
                    HVDocsActivity hVDocsActivity = HVDocsActivity.this;
                    hVDocsActivity.Q.c(f11 * ((float) hVDocsActivity.f13219w0), this.f13237b * ((float) HVDocsActivity.this.f13221x0), this.f13238c);
                    return;
                }
                HVDocsActivity hVDocsActivity2 = HVDocsActivity.this;
                hVDocsActivity2.Q.c((float) (hVDocsActivity2.f13219w0 / 2), (float) (HVDocsActivity.this.f13221x0 / 2), this.f13238c);
            }
        }

        /* renamed from: co.hyperverge.hypersnapsdk.activities.HVDocsActivity$c$c  reason: collision with other inner class name */
        class C0110c implements Runnable {
            C0110c() {
            }

            public void run() {
                HVDocsActivity.this.L2();
            }
        }

        c() {
        }

        /* access modifiers changed from: private */
        public void E(String str, String str2, String str3, co.hyperverge.hypersnapsdk.objects.e eVar, w5.d dVar, ProgressDialog progressDialog, JSONObject jSONObject) {
            if (HVDocsActivity.this.f13198f.isShouldReadQR()) {
                Bitmap decodeFile = BitmapFactoryInstrumentation.decodeFile(str);
                HVDocsActivity hVDocsActivity = HVDocsActivity.this;
                String unused = hVDocsActivity.f13210r = hVDocsActivity.f13205o.a(decodeFile);
                JSONObject ocrParams = HVDocsActivity.this.f13198f.getOcrParams();
                try {
                    ocrParams.put("qrString", HVDocsActivity.this.f13210r);
                    HVDocsActivity.this.f13198f.ocrParams = JSONObjectInstrumentation.toString(ocrParams);
                } catch (Exception e11) {
                    String y22 = HVDocsActivity.H0;
                    Log.e(y22, "onPictureReady:- JSON Exception :" + e11.getMessage());
                }
                decodeFile.recycle();
            }
            dVar.c(str, str3, eVar);
            if (progressDialog.isShowing()) {
                progressDialog.cancel();
            }
            if (HVDocsActivity.this.f13198f.shouldShowReviewScreen()) {
                HVDocsActivity.this.d3(str, str2);
            } else if (HVDocsActivity.this.f13198f.isShouldDoOCR()) {
                HVDocsActivity.this.J2(str, str2);
            } else {
                HVDocsActivity.this.e3();
                HVDocsActivity.this.a2((HVError) null, new co.hyperverge.hypersnapsdk.objects.b(jSONObject, new JSONObject(), str, HVDocsActivity.this.f13206o0));
            }
        }

        public void A() {
        }

        public void B(float f11, float f12, boolean z11) {
            new Handler(Looper.getMainLooper()).post(new b(f11, f12, z11));
        }

        public void C(int i11) {
        }

        public void F() {
            long longValue = HVDocsActivity.this.k.c().longValue();
            if (n.w().m() != null) {
                n.w().m().b(HVDocsActivity.this.f13198f, longValue);
            }
        }

        public void a() {
            new Handler(Looper.getMainLooper()).post(new C0110c());
        }

        public int b() {
            return 1;
        }

        public File c() {
            return new File(HVDocsActivity.this.f13211r0).getParentFile();
        }

        public String d() {
            return "IS_" + System.currentTimeMillis() + ".jpg";
        }

        public float f() {
            return 2.0f;
        }

        public float g() {
            return 2.0f;
        }

        public String h() {
            return null;
        }

        public boolean i() {
            return HVDocsActivity.this.f13198f.isShouldReadQR();
        }

        public void j() {
        }

        public void k(int i11) {
        }

        public void l(int i11, String str) {
        }

        public void m() {
            HVDocsActivity.this.f13198f.isShouldShowFlashIcon();
        }

        public void n() {
        }

        public void o() {
            try {
                if (HVDocsActivity.this.f13198f.isShouldShowFlashIcon()) {
                    HVDocsActivity.this.M.setVisibility(0);
                    HVDocsActivity.this.M.setImageResource(R.drawable.ic_torch_off_svg);
                }
            } catch (Exception e11) {
                Log.e(HVDocsActivity.H0, e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }

        public void p() {
            try {
                if (HVDocsActivity.this.f13198f.isShouldShowFlashIcon()) {
                    HVDocsActivity.this.M.setVisibility(0);
                    HVDocsActivity.this.M.setImageResource(R.drawable.ic_torch_on_svg);
                    if (!n5.a.d(HVDocsActivity.this)) {
                        HVDocsActivity.this.F.h();
                    }
                }
            } catch (Exception e11) {
                Log.e(HVDocsActivity.H0, e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }

        public void q() {
        }

        public void r() {
            HVDocsActivity.this.b2(true);
        }

        public void s(byte[] bArr, int i11, int i12, int i13, int i14, byte[] bArr2) {
        }

        public void t() {
            HVDocsActivity.this.B0.set(true);
            HVError unused = HVDocsActivity.this.n = new HVError(2, "failure logged in document onPictureFailed()");
            long longValue = HVDocsActivity.this.k.c().longValue();
            if (n.w().m() != null) {
                n.w().m().U(HVDocsActivity.this.n, HVDocsActivity.this.f13198f, longValue);
            }
        }

        public void u(byte[] bArr) {
            F();
            w5.d dVar = new w5.d();
            dVar.d(bArr, HVDocsActivity.this.f13211r0, HVDocsActivity.this.f13212s);
            ProgressDialog progressDialog = new ProgressDialog(HVDocsActivity.this);
            progressDialog.setMessage(w5.l.f17583c);
            progressDialog.setCancelable(false);
            progressDialog.show();
            HVDocsActivity hVDocsActivity = HVDocsActivity.this;
            AsyncTaskInstrumentation.executeOnExecutor(new l(bArr, hVDocsActivity, new a(dVar, progressDialog)), AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }

        public void v(File file) {
            long longValue = HVDocsActivity.this.k.c().longValue();
            if (n.w().m() != null) {
                n.w().m().G(HVDocsActivity.this.f13198f, file.getAbsolutePath(), longValue);
            }
        }

        public void w(int i11, int i12) {
        }

        public void x() {
        }

        public void y(int i11, int i12) {
            int unused = HVDocsActivity.this.f13221x0 = i12;
            int unused2 = HVDocsActivity.this.f13219w0 = i11;
            HVDocsActivity.this.B2();
            HVDocsActivity.this.E2();
            HVDocsActivity.this.e2();
        }

        public void z() {
        }
    }

    class d implements b6.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f13241a;

        d(Context context) {
            this.f13241a = context;
        }

        public void a(Location location) {
            if (location != null) {
                HVDocsActivity hVDocsActivity = HVDocsActivity.this;
                if (hVDocsActivity.N != null) {
                    hVDocsActivity.H2();
                }
                Location unused = HVDocsActivity.this.f13212s = location;
                return;
            }
            Location unused2 = HVDocsActivity.this.f13212s = i6.a.d(this.f13241a).a();
            if (HVDocsActivity.this.f13212s != null) {
                HVDocsActivity hVDocsActivity2 = HVDocsActivity.this;
                if (hVDocsActivity2.N != null) {
                    hVDocsActivity2.H2();
                }
            }
        }
    }

    class e implements DialogInterface.OnClickListener {
        e() {
        }

        public void onClick(DialogInterface dialogInterface, int i11) {
            HVDocsActivity.this.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1001);
        }
    }

    class f implements DialogInterface.OnClickListener {
        f() {
        }

        public void onClick(DialogInterface dialogInterface, int i11) {
            HVDocsActivity.J0.f(new HVError(33, "GPS access denied by user"), (co.hyperverge.hypersnapsdk.objects.b) null);
            HVDocsActivity.this.finish();
        }
    }

    class g implements SensorEventListener {
        g() {
        }

        public void onAccuracyChanged(Sensor sensor, int i11) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            try {
                int type = sensorEvent.sensor.getType();
                if (type == 1) {
                    HVDocsActivity.this.v[0] = (float[]) sensorEvent.values.clone();
                } else if (type == 2) {
                    HVDocsActivity.this.f13218w[0] = (float[]) sensorEvent.values.clone();
                }
                HVDocsActivity hVDocsActivity = HVDocsActivity.this;
                float[][] fArr = hVDocsActivity.f13218w;
                if (fArr[0] != null) {
                    float[][] fArr2 = hVDocsActivity.v;
                    if (fArr2[0] != null) {
                        float[][] fArr3 = hVDocsActivity.t;
                        fArr3[0] = new float[9];
                        float[][] fArr4 = hVDocsActivity.f13215u;
                        fArr4[0] = new float[9];
                        SensorManager.getRotationMatrix(fArr3[0], fArr4[0], fArr2[0], fArr[0]);
                        HVDocsActivity hVDocsActivity2 = HVDocsActivity.this;
                        SensorManager.getOrientation(hVDocsActivity2.t[0], hVDocsActivity2.f13220x);
                        HVDocsActivity hVDocsActivity3 = HVDocsActivity.this;
                        float[] fArr5 = hVDocsActivity3.f13222y;
                        float[] fArr6 = hVDocsActivity3.f13220x;
                        fArr5[0] = fArr6[0] * 57.29578f;
                        float[] fArr7 = hVDocsActivity3.f13224z;
                        fArr7[0] = fArr6[1] * 57.29578f;
                        hVDocsActivity3.A[0] = fArr6[2] * 57.29578f;
                        hVDocsActivity3.f13218w[0] = null;
                        hVDocsActivity3.v[0] = null;
                        if (fArr7[0] < ((float) hVDocsActivity3.f13198f.getAllowedTiltPitch())) {
                            HVDocsActivity hVDocsActivity4 = HVDocsActivity.this;
                            if (hVDocsActivity4.f13224z[0] > ((float) (hVDocsActivity4.f13198f.getAllowedTiltPitch() * -1))) {
                                HVDocsActivity hVDocsActivity5 = HVDocsActivity.this;
                                if (hVDocsActivity5.A[0] < ((float) hVDocsActivity5.f13198f.getAllowedTiltRoll())) {
                                    HVDocsActivity hVDocsActivity6 = HVDocsActivity.this;
                                    if (hVDocsActivity6.A[0] > ((float) (hVDocsActivity6.f13198f.getAllowedTiltRoll() * -1))) {
                                        HVDocsActivity.this.N.setImageResource(R.drawable.ic_camera_button_svg);
                                        HVDocsActivity hVDocsActivity7 = HVDocsActivity.this;
                                        hVDocsActivity7.U = false;
                                        hVDocsActivity7.Z2();
                                        return;
                                    }
                                }
                            }
                        }
                        HVDocsActivity.this.N.setImageResource(R.drawable.camera_disabled);
                        androidx.core.widget.g.c(HVDocsActivity.this.N, (ColorStateList) null);
                        HVDocsActivity hVDocsActivity8 = HVDocsActivity.this;
                        hVDocsActivity8.U = true;
                        hVDocsActivity8.Z2();
                    }
                }
            } catch (Exception e11) {
                Log.e(HVDocsActivity.H0, e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }
    }

    class h implements Runnable {
        h() {
        }

        public void run() {
            if (n.w().E()) {
                HVDocsActivity hVDocsActivity = HVDocsActivity.this;
                hVDocsActivity.l1(hVDocsActivity.f13198f, (View) null);
            }
        }
    }

    class i implements b.a {
        i() {
        }

        public void a() {
            HVDocsActivity.this.E.getWidth();
            HVDocsActivity.this.E.getHeight();
            HVDocsActivity hVDocsActivity = HVDocsActivity.this;
            hVDocsActivity.Q.c((float) (hVDocsActivity.f13219w0 / 2), (float) (HVDocsActivity.this.f13221x0 / 2), false);
        }
    }

    class j implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f13248a;

        j() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!HVDocsActivity.this.f13198f.isShouldAllowPhoneTilt() && HVDocsActivity.this.U) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f13248a = HVDocsActivity.this.B0.get();
                if (HVDocsActivity.this.B0.get()) {
                    HVDocsActivity.this.k3();
                }
            } else if (action == 1 && this.f13248a) {
                HVDocsActivity.this.m3();
            }
            return false;
        }
    }

    private interface k {
        void a(String str, Bitmap bitmap);
    }

    @Instrumented
    private class l extends AsyncTask implements TraceFieldInterface {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f13250a;

        /* renamed from: b  reason: collision with root package name */
        Context f13251b;

        /* renamed from: c  reason: collision with root package name */
        k f13252c;

        /* renamed from: d  reason: collision with root package name */
        private Bitmap f13253d;

        /* renamed from: f  reason: collision with root package name */
        public Trace f13255f;

        public l(byte[] bArr, Context context, k kVar) {
            this.f13250a = bArr;
            this.f13251b = context;
            this.f13252c = kVar;
        }

        public void _nr_setTrace(Trace trace) {
            try {
                this.f13255f = trace;
            } catch (Exception unused) {
            }
        }

        public Bitmap a(Bitmap bitmap) {
            try {
                double width = (double) (HVDocsActivity.this.f13198f.padding * ((float) bitmap.getWidth()) * HVDocsActivity.this.f13197e.getAspectRatio());
                int unused = HVDocsActivity.this.N2();
                int unused2 = HVDocsActivity.this.P2();
                if (!HVDocsActivity.this.f13198f.isShouldSetPadding() || HVDocsActivity.this.f13197e.getAspectRatio() > 1.0f) {
                    width = 0.0d;
                }
                HVDocsActivity.this.f13209q0 = width;
                int height = (int) (((double) ((int) (((float) bitmap.getHeight()) * ((((float) HVDocsActivity.this.P2()) + ((float) HVDocsActivity.this.C0)) / ((float) HVDocsActivity.this.f13221x0))))) - width);
                if (height < 0) {
                    height = 0;
                }
                int height2 = (int) (((double) (((int) (((float) bitmap.getHeight()) * ((((float) HVDocsActivity.this.N2()) + ((float) HVDocsActivity.this.C0)) / ((float) HVDocsActivity.this.f13221x0)))) - height)) + width);
                if (height2 > bitmap.getHeight()) {
                    height2 = bitmap.getHeight();
                }
                if (height + height2 > bitmap.getHeight()) {
                    height = (int) (((float) bitmap.getHeight()) * ((((float) HVDocsActivity.this.P2()) + ((float) HVDocsActivity.this.C0)) / ((float) HVDocsActivity.this.f13221x0)));
                    height2 = ((int) (((float) bitmap.getHeight()) * ((((float) HVDocsActivity.this.N2()) + ((float) HVDocsActivity.this.C0)) / ((float) HVDocsActivity.this.f13221x0)))) - height;
                    HVDocsActivity.this.f13198f.setShouldAddPadding(false);
                }
                return Bitmap.createBitmap(bitmap, 0, height, bitmap.getWidth(), height2);
            } catch (OutOfMemoryError e11) {
                Log.e(HVDocsActivity.H0, e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
                return null;
            } catch (Exception e12) {
                Log.e(HVDocsActivity.H0, e12.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e12);
                }
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public Void b(Void... voidArr) {
            Bitmap c11;
            FileOutputStream fileOutputStream;
            int b11 = o5.a.b(this.f13250a);
            try {
                byte[] bArr = this.f13250a;
                Bitmap g11 = w5.g.g(BitmapFactoryInstrumentation.decodeByteArray(bArr, 0, bArr.length), b11);
                if (g11 == null) {
                    return null;
                }
                Bitmap a11 = a(g11);
                File unused = HVDocsActivity.this.f13217v0 = new File(HVDocsActivity.this.f13214t0);
                FileOutputStream fileOutputStream2 = new FileOutputStream(HVDocsActivity.this.f13217v0);
                a11.compress(Bitmap.CompressFormat.JPEG, z5.g.f18075b, fileOutputStream2);
                fileOutputStream2.close();
                if (HVDocsActivity.this.f13198f.isShouldReadQR()) {
                    c11 = z5.g.c(a11);
                    File unused2 = HVDocsActivity.this.f13216u0 = new File(HVDocsActivity.this.f13213s0);
                    try {
                        fileOutputStream = new FileOutputStream(HVDocsActivity.this.f13216u0);
                        c11.compress(Bitmap.CompressFormat.JPEG, z5.g.f18075b, fileOutputStream);
                        fileOutputStream.close();
                    } catch (Exception e11) {
                        Log.e(HVDocsActivity.H0, e11.getMessage());
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    c11.recycle();
                }
                this.f13253d = z5.g.j(a11);
                a11.recycle();
                if (this.f13253d == null) {
                    return null;
                }
                HVDocsActivity.this.S = new File(HVDocsActivity.this.f13211r0);
                FileOutputStream fileOutputStream3 = new FileOutputStream(HVDocsActivity.this.S);
                this.f13253d.compress(Bitmap.CompressFormat.JPEG, z5.g.f18075b, fileOutputStream3);
                fileOutputStream3.close();
                return null;
                throw th;
            } catch (Exception e12) {
                Log.e(HVDocsActivity.H0, e12.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e12);
                }
            } catch (OutOfMemoryError e13) {
                Log.e(HVDocsActivity.H0, e13.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e13);
                }
            } catch (Throwable th3) {
                c11.recycle();
                throw th3;
            }
        }

        /* access modifiers changed from: protected */
        public void c(Void voidR) {
            this.f13252c.a(HVDocsActivity.this.f13211r0, this.f13253d);
            super.onPostExecute(voidR);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            try {
                TraceMachine.enterMethod(this.f13255f, "HVDocsActivity$l#doInBackground", (ArrayList<String>) null);
            } catch (NoSuchFieldError unused) {
                TraceMachine.enterMethod((Trace) null, "HVDocsActivity$l#doInBackground", (ArrayList<String>) null);
            }
            Void b11 = b((Void[]) objArr);
            TraceMachine.exitMethod();
            return b11;
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            try {
                TraceMachine.enterMethod(this.f13255f, "HVDocsActivity$l#onPostExecute", (ArrayList<String>) null);
            } catch (NoSuchFieldError unused) {
                TraceMachine.enterMethod((Trace) null, "HVDocsActivity$l#onPostExecute", (ArrayList<String>) null);
            }
            c((Void) obj);
            TraceMachine.exitMethod();
        }
    }

    public HVDocsActivity() {
        Class<float> cls = float.class;
        this.t = (float[][]) Array.newInstance(cls, new int[]{1, 1});
        this.f13215u = (float[][]) Array.newInstance(cls, new int[]{1, 1});
        this.v = new float[][]{new float[3]};
        this.f13218w = new float[][]{new float[3]};
        this.f13220x = new float[3];
        this.f13222y = new float[1];
        this.f13224z = new float[1];
        this.A = new float[1];
        this.B = 0.03f;
        this.C = false;
        this.K = new b();
        this.U = false;
        this.C0 = 50;
        this.D0 = 35;
        this.E0 = new c();
    }

    /* access modifiers changed from: private */
    public void B2() {
        if (this.Q.getParent() != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
            layoutParams.height = this.f13221x0;
            layoutParams.width = this.f13219w0;
            this.Q.setX(this.F.getX());
            this.Q.setY(this.F.getY());
            this.Q.requestLayout();
        }
        this.E.requestLayout();
    }

    /* access modifiers changed from: private */
    public void E2() {
        if (this.R.getParent() != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
            int i11 = this.f13219w0;
            int N2 = N2() - P2();
            layoutParams.height = N2;
            layoutParams.width = i11;
            int P2 = P2() + this.C0;
            N2();
            this.R.setX((float) 0);
            this.R.setY((float) P2);
            this.R.a(new RectF(0.0f, 0.0f, (float) i11, (float) N2), 0.02f);
            this.R.requestLayout();
        }
        this.E.requestLayout();
    }

    private void F2() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.llTopBar);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.height = this.D0;
        linearLayout.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = ((ImageView) findViewById(R.id.camera_cross)).getLayoutParams();
        int i11 = this.D0;
        layoutParams2.height = i11;
        layoutParams2.width = i11;
        ViewGroup.LayoutParams layoutParams3 = ((ImageView) findViewById(R.id.camera_flash)).getLayoutParams();
        int i12 = this.D0;
        layoutParams3.height = i12;
        layoutParams3.width = i12;
    }

    private void G1() {
        if (this.B0.get()) {
            this.B0.set(false);
            try {
                this.k.d();
                h5.b bVar = this.F;
                if (bVar != null) {
                    bVar.j(0.5f, 0.5f, (Camera.AutoFocusCallback) null);
                    this.F.m((String) null);
                    return;
                }
                this.n = new HVError(2, "camerView is null");
                long longValue = this.k.c().longValue();
                if (n.w().m() != null) {
                    n.w().m().U(this.n, this.f13198f, longValue);
                }
            } catch (Exception e11) {
                Log.e(H0, e11.getMessage());
                this.n = new HVError(2, e11.getMessage());
                long longValue2 = this.k.c().longValue();
                if (n.w().m() != null) {
                    n.w().m().U(this.n, this.f13198f, longValue2);
                }
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void H2() {
        if (!this.f13198f.isShouldReadQR() || this.f13207p) {
            androidx.core.widget.g.c(this.N, ColorStateList.valueOf(getResources().getColor(R.color.camera_button_color)));
            this.N.setImageResource(R.drawable.ic_camera_button_svg);
            this.N.setClickable(true);
            return;
        }
        this.q.postDelayed(new m(this), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    private void I1() {
        this.f13199g.d();
        this.L.setVisibility(0);
        l1(this.f13198f, this.L);
        this.L.findViewById(R.id.ivClose).setOnClickListener(new i(this));
        this.L.findViewById(R.id.btnUploadDoc).setOnClickListener(new j(this));
        this.L.findViewById(R.id.btnCaptureDoc).setOnClickListener(new k(this));
        n.w().a(getApplicationContext()).e(this.f13199g.c().longValue());
        n.w().a(getApplicationContext()).k();
        this.f13200h.d();
        this.f13201i.d();
    }

    private void K1() {
        c.a aVar = new c.a(this);
        aVar.setTitle("GPS Switched Off");
        aVar.e("Please enable GPS to continue");
        aVar.b(false);
        aVar.i("Open settings", new e());
        aVar.f("Cancel", new f());
        aVar.l();
    }

    private void L1() {
        this.L.setVisibility(8);
        try {
            this.W = new z5.d();
            if (this.f13198f.isShouldShowInstructionPage()) {
                c3();
            } else {
                o2();
            }
        } catch (Exception e11) {
            Log.e(H0, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
            Y2(new HVError(2, getResources().getString(R.string.internal_error)));
        }
    }

    /* access modifiers changed from: private */
    public void L2() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.6f, 0.0f);
        alphaAnimation.setDuration(300);
        alphaAnimation.setInterpolator(new DecelerateInterpolator(2.0f));
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(this.K);
        this.G.startAnimation(alphaAnimation);
    }

    private void M1() {
        try {
            V2();
            A2();
            l1(this.f13198f, (View) null);
            this.B0 = new AtomicBoolean(true);
            try {
                if (!this.f13198f.isShouldAllowPhoneTilt()) {
                    X2();
                    SensorManager sensorManager = this.V;
                    sensorManager.registerListener(this.f13196c0, sensorManager.getDefaultSensor(1), 3);
                    SensorManager sensorManager2 = this.V;
                    sensorManager2.registerListener(this.f13196c0, sensorManager2.getDefaultSensor(2), 3);
                }
            } catch (Exception e11) {
                Log.e(H0, e11.getMessage());
                if (n.w().m() != null) {
                    n.w().m().b0(new HVError(2, e11.getMessage()));
                }
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
            if (n.w().m() != null) {
                long longValue = this.j.c().longValue();
                n.w().m().X(this.f13198f);
                n.w().m().w(longValue);
                n.w().m().F();
                this.f13203m.d();
            }
        } catch (Exception e12) {
            Log.e(H0, e12.getMessage());
            if (n.w().m() != null) {
                n.w().m().b0(new HVError(2, e12.getMessage()));
            }
            if (n.w().s() != null) {
                n.w().s().a(e12);
            }
            Y2(new HVError(2, getResources().getString(R.string.internal_error)));
        }
    }

    private void N1() {
        if (n.w().m() != null) {
            n.w().m().Z(this.f13198f);
        }
        e3();
        a2(new HVError(3, getString(R.string.operation_cancelled)), new co.hyperverge.hypersnapsdk.objects.b(new JSONObject(), (JSONObject) null, (String) null, this.f13206o0));
    }

    /* access modifiers changed from: private */
    public int N2() {
        int aspectRatio = ((int) (((float) this.f13221x0) + (this.f13197e.getAspectRatio() * ((float) this.f13219w0)))) / 2;
        int i11 = (int) (this.f13223y0 * 0.4f);
        int i12 = aspectRatio + i11;
        int i13 = this.f13221x0;
        return i12 >= i13 ? i13 - i11 : aspectRatio;
    }

    /* access modifiers changed from: private */
    public int P2() {
        int aspectRatio = ((int) (((float) this.f13221x0) - (this.f13197e.getAspectRatio() * ((float) this.f13219w0)))) / 2;
        if (aspectRatio < 0) {
            return 20;
        }
        return aspectRatio;
    }

    private String T2() throws JSONException {
        if (this.f13198f.getOcrHeaders() == null || !this.f13198f.getOcrHeaders().has("transactionId")) {
            return o.r();
        }
        return this.f13198f.getOcrHeaders().getString("transactionId");
    }

    private void V2() {
        this.f13205o.b(getApplicationContext(), 6416);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void W1(ProgressDialog progressDialog, String str, boolean z11, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, HVError hVError) {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.cancel();
            View view = this.H;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        this.f13206o0 = str3;
        this.f13208p0 = str2;
        if (z11) {
            b3(str, str2);
            return;
        }
        e3();
        n.w().m();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        co.hyperverge.hypersnapsdk.objects.b bVar = new co.hyperverge.hypersnapsdk.objects.b(d2(jSONObject, str), jSONObject2, str, this.f13206o0);
        bVar.setRetakeMessage(this.f13208p0);
        HVDocConfig hVDocConfig = this.f13198f;
        bVar.setAttemptsCount(o.a(hVDocConfig.ocrEndpoint, hVDocConfig.getSuffixForDocument()));
        a2(hVError, bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void X1(View view) {
        n.w().a(getApplicationContext()).f();
        onBackPressed();
    }

    private void X2() {
        try {
            this.V = (SensorManager) getSystemService("sensor");
            this.f13196c0 = new g();
        } catch (Exception e11) {
            Log.e(H0, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    private void Y1(FrameLayout frameLayout) {
        l6.b bVar = new l6.b(this);
        this.Q = bVar;
        frameLayout.addView(bVar, -1);
        frameLayout.setOnTouchListener(new l(this));
    }

    public static void a3(Context context, HVDocConfig hVDocConfig, DocCaptureCompletionHandler docCaptureCompletionHandler) {
        if (docCaptureCompletionHandler != null) {
            J0 = docCaptureCompletionHandler;
            if (context == null) {
                J0.f(new HVError(6, "Context object is null"), (co.hyperverge.hypersnapsdk.objects.b) null);
                return;
            }
            p5.a t11 = p5.a.t();
            co.hyperverge.hypersnapsdk.objects.d s11 = t11.s();
            if (!t11.w() || ((s11.getAppId() != null && s11.getAppId().isEmpty()) || (s11.getAppKey() != null && s11.getAppKey().isEmpty()))) {
                J0.f(new HVError(11, context.getResources().getString(R.string.initialised_error)), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else if (s11.getHyperSnapRegion() == HyperSnapParams$Region.ASIA_PACIFIC && !p5.a.y()) {
                J0.f(new HVError(11, context.getResources().getString(R.string.user_session_not_created_error)), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else if (hVDocConfig == null) {
                J0.f(new HVError(6, context.getResources().getString(R.string.document_config_error)), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else {
                Intent intent = new Intent(context, HVDocsActivity.class);
                if (hVDocConfig.isShouldReadQR() && n.w().u().get("read-doc-qr") != null) {
                    hVDocConfig.setShouldReadQR(n.w().u().get("read-doc-qr").booleanValue());
                }
                intent.putExtra(HVDocConfig.KEY, hVDocConfig);
                context.startActivity(intent);
            }
        }
    }

    /* access modifiers changed from: private */
    public void b2(boolean z11) {
        if (z5.g.o(this) || g3()) {
            this.D0 = (int) getResources().getDimension(R.dimen.margin_doc_top_bar_height_nav);
        } else {
            this.D0 = (int) getResources().getDimension(R.dimen.margin_doc_top_bar_height_no_nav);
        }
        F2();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.cameraContainer);
        if (g3()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.setMargins(z5.f.b(this, 10.0f), (int) ((((float) (((double) this.f13225z0) - ((((double) this.A0) * 4.0d) / 3.0d))) / 2.0f) * this.f13223y0), z5.f.b(this, 10.0f), 0);
            layoutParams.height = -2;
            frameLayout.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.f13198f.getDocument() == HVDocConfig.Document.A4) {
                layoutParams2.setMargins(z5.f.b(this, 45.0f), this.D0 + 75, z5.f.b(this, 45.0f), 0);
            } else {
                layoutParams2.setMargins(z5.f.b(this, 10.0f), this.D0, z5.f.b(this, 10.0f), 0);
            }
            layoutParams2.height = -2;
            frameLayout.setLayoutParams(layoutParams2);
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.overlay1);
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.overlay2);
        int P2 = P2();
        N2();
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
        layoutParams3.height = P2 + this.C0;
        frameLayout2.setLayoutParams(layoutParams3);
        frameLayout3.setVisibility(0);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
        layoutParams4.setMargins(0, N2() + this.C0, 0, 0);
        frameLayout3.setLayoutParams(layoutParams4);
        if (z11) {
            q2(this.D);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean c2(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F0 = motionEvent.getX();
            this.G0 = motionEvent.getY();
        } else if (actionMasked == 1 && Math.abs(motionEvent.getX() - this.F0) < 20.0f && Math.abs(motionEvent.getY() - this.G0) < 20.0f) {
            this.Q.c(motionEvent.getX(), motionEvent.getY(), false);
            this.F.j(motionEvent.getX() / ((float) this.f13219w0), motionEvent.getY() / ((float) this.f13221x0), (Camera.AutoFocusCallback) null);
        }
        return true;
    }

    private boolean g3() {
        return ((double) this.f13225z0) <= (((double) this.A0) * 4.0d) / 3.0d;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i3() {
        this.f13207p = true;
        androidx.core.widget.g.c(this.N, ColorStateList.valueOf(getResources().getColor(R.color.camera_button_color)));
        this.N.setImageResource(R.drawable.ic_camera_button_svg);
        this.N.setClickable(true);
    }

    private void j2(Context context) {
        if (i6.a.d(this).f()) {
            i6.a.d(context).g();
            i6.a.d(context).e(new d(context));
            return;
        }
        K1();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k2(View view) {
        n.w().a(getApplicationContext()).q(this.f13200h.c().longValue());
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "application/pdf"});
        startActivityForResult(intent, 1000);
    }

    /* access modifiers changed from: private */
    public void k3() {
        ImageView imageView = this.N;
        imageView.clearAnimation();
        imageView.clearAnimation();
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(150);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setFillAfter(true);
        imageView.startAnimation(scaleAnimation);
        this.N.startAnimation(scaleAnimation);
    }

    private void l2(FrameLayout frameLayout) {
        l6.d dVar = new l6.d(this);
        this.R = dVar;
        frameLayout.addView(dVar, -1);
    }

    /* access modifiers changed from: private */
    public void m3() {
        ImageView imageView = this.N;
        imageView.clearAnimation();
        this.N.clearAnimation();
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(150);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setAnimationListener(new a());
        this.N.startAnimation(scaleAnimation);
        imageView.startAnimation(scaleAnimation);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n2(View view) {
        n.w().a(getApplicationContext()).H(this.f13201i.c().longValue());
        L1();
    }

    private void o3() {
        androidx.core.widget.g.c(this.N, (ColorStateList) null);
        this.N.setImageResource(R.drawable.camera_disabled);
        this.N.setClickable(false);
        this.f13207p = false;
        H2();
    }

    private void p3() {
        q1();
    }

    private static void q2(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private void q3() {
        try {
            this.f13199g.d();
            this.f13201i.d();
            this.f13200h.d();
            this.j.d();
            this.k.d();
            this.f13202l.d();
            this.f13203m.d();
        } catch (Exception e11) {
            Log.e(H0, e11.getMessage());
        }
    }

    public void A2() {
        ImageView imageView = (ImageView) findViewById(R.id.camera_bubble);
        this.N = imageView;
        imageView.setImageResource(R.drawable.camera_disabled);
        int i11 = 0;
        this.N.setClickable(false);
        if (!p5.a.t().s().isShouldUseLocation()) {
            H2();
        } else if (this.f13212s != null) {
            H2();
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.camera_flash);
        this.M = imageView2;
        imageView2.setImageResource(R.drawable.ic_torch_off_svg);
        this.H = findViewById(R.id.black_overlay);
        new Handler(Looper.getMainLooper()).postDelayed(new h(), 100);
        if (!this.f13198f.isShouldShowFlashIcon()) {
            this.M.setVisibility(4);
        }
        this.G.setVisibility(8);
        this.C0 = this.f13197e.getAspectRatio() > 1.0f ? 0 : z5.f.b(this, 50.0f);
        this.D = (FrameLayout) findViewById(R.id.camera_preview);
        this.E = (FrameLayout) findViewById(R.id.cameraContainer);
        n5.a.n(n.w().u());
        n5.a.p(false);
        try {
            h5.b g11 = h5.b.g(this, this.E0, false);
            this.F = g11;
            g11.f();
            this.E.addView(this.F, 0);
            FrameLayout frameLayout = (FrameLayout) this.F.getParent();
            this.F.setSensorCallback(new i());
            Y1(this.E);
            l2(this.E);
            ImageView imageView3 = (ImageView) findViewById(R.id.camera_cross);
            imageView3.setImageResource(R.drawable.ic_camera_cross);
            imageView3.setOnClickListener(this);
            this.O = (TextView) findViewById(R.id.tv_hint);
            try {
                if (this.f13198f.getHintTypeface() > 0) {
                    this.O.setTypeface(androidx.core.content.res.h.g(getApplicationContext(), this.f13198f.getHintTypeface()));
                }
                String docCaptureSubText = this.f13198f.getDocCaptureSubText();
                if (!TextUtils.isEmpty(docCaptureSubText)) {
                    this.O.setText(docCaptureSubText);
                }
                this.P = (TextView) findViewById(R.id.tv_step);
                if (this.f13198f.getDescTypeface() > 0) {
                    this.P.setTypeface(androidx.core.content.res.h.g(getApplicationContext(), this.f13198f.getDescTypeface()));
                }
                if (this.f13198f.getDocCaptureDescription() != null && !this.f13198f.getDocCaptureDescription().isEmpty()) {
                    this.P.setText(this.f13198f.getDocCaptureDescription());
                }
            } catch (Exception e11) {
                Log.e(H0, e11.getMessage());
                if (n.w().m() != null) {
                    n.w().m().b0(new HVError(2, e11.getMessage()));
                }
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
            n5.a.l(true);
            n5.a.n(n.w().u());
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            n5.a.q(point);
            float f11 = getResources().getDisplayMetrics().density;
            this.f13223y0 = f11;
            this.f13225z0 = ((float) displayMetrics.heightPixels) / f11;
            this.A0 = ((float) displayMetrics.widthPixels) / f11;
            if (z5.g.o(this) || g3()) {
                ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
                Resources resources = getResources();
                int i12 = R.dimen.resource_camera_size;
                layoutParams.width = (int) resources.getDimension(i12);
                layoutParams.height = (int) getResources().getDimension(i12);
                this.N.requestLayout();
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.N.getLayoutParams();
                Resources resources2 = getResources();
                int i13 = R.dimen.margin_doc_button_nav;
                layoutParams2.width = (int) resources2.getDimension(i13);
                layoutParams2.height = (int) getResources().getDimension(i13);
                this.N.requestLayout();
            }
            b2(false);
            B2();
            e2();
            E2();
            String capturePageTitleText = this.f13198f.getCapturePageTitleText();
            TextView textView = (TextView) findViewById(R.id.title_text);
            if (!TextUtils.isEmpty(capturePageTitleText)) {
                textView.setText(capturePageTitleText);
            }
            if (this.f13198f.getTitleTypeface() > 0) {
                textView.setTypeface(androidx.core.content.res.h.g(getApplicationContext(), this.f13198f.getTitleTypeface()));
            }
            TextView textView2 = (TextView) findViewById(R.id.tvSubtitle);
            String capturePageSubtitleText = this.f13198f.getCapturePageSubtitleText();
            textView2.setText(capturePageSubtitleText);
            if (TextUtils.isEmpty(capturePageSubtitleText)) {
                i11 = 8;
            }
            textView2.setVisibility(i11);
            if (this.f13198f.getSubtitleTypeface() > 0) {
                textView2.setTypeface(androidx.core.content.res.h.g(getApplicationContext(), this.f13198f.getSubtitleTypeface()));
            }
            this.N.setOnClickListener(this);
            this.M.setOnClickListener(this);
            this.N.setOnTouchListener(new j());
            h5.b bVar = this.F;
            if (bVar != null) {
                bVar.onResume();
            } else if (n.w().m() != null) {
                n.w().m().b0(new HVError(2, "CameraView is null"));
            }
        } catch (Exception e12) {
            Log.e(H0, e12.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e12);
            }
            HVError hVError = new HVError(5, getResources().getString(R.string.camera_error));
            if (n.w().m() != null) {
                n.w().m().b0(hVError);
            }
            Y2(hVError);
        }
    }

    public void J2(String str, String str2) {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(w5.l.f17583c);
        progressDialog.show();
        View view = this.H;
        if (view != null) {
            view.setVisibility(0);
        }
        w5.c.e().c(this, str, str2, this.f13198f, new o(this, progressDialog, str));
    }

    public void Y2(HVError hVError) {
        DocCaptureCompletionHandler docCaptureCompletionHandler = J0;
        if (docCaptureCompletionHandler != null) {
            docCaptureCompletionHandler.f(hVError, (co.hyperverge.hypersnapsdk.objects.b) null);
        }
        w5.c.b();
        finish();
    }

    public void Z2() {
        if (this.U) {
            this.P.setText(getResources().getString(R.string.docCaptureTilt));
            this.P.setTextColor(getResources().getColor(R.color.text_red));
            return;
        }
        this.P.setTextColor(getResources().getColor(R.color.content_text_color));
        if (this.f13198f.getDocCaptureDescription() == null || this.f13198f.getDocCaptureDescription().isEmpty()) {
            this.P.setText(getResources().getString(R.string.docCaptureDescription));
        } else {
            this.P.setText(this.f13198f.getDocCaptureDescription());
        }
    }

    public void b3(String str, String str2) {
        try {
            Intent intent = new Intent(this, HVRetakeActivity.class);
            intent.putExtra("imageUri", str);
            intent.putExtra(MenuConstants.MENU_ICON_ASPECT_RATIO, this.f13197e.getAspectRatio());
            intent.putExtra(PaymentConstants.Category.CONFIG, this.f13198f);
            intent.putExtra("setPadding", this.f13198f.isShouldSetPadding());
            intent.putExtra("retryMessage", str2);
            intent.putExtra("extraPadding", this.f13209q0);
            intent.putExtra("viewWidth", this.R.getWidth());
            intent.putExtra("viewHeight", this.R.getHeight());
            startActivityForResult(intent, 1);
        } catch (Exception e11) {
            Log.e(H0, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void c3() {
        try {
            Intent intent = new Intent(this, HVDocInstructionActivity.class);
            JSONObject customUIStrings = this.f13198f.getCustomUIStrings();
            intent.putExtra("customUIStrings", !(customUIStrings instanceof JSONObject) ? customUIStrings.toString() : JSONObjectInstrumentation.toString(customUIStrings));
            startActivityForResult(intent, 1);
        } catch (NoClassDefFoundError e11) {
            Log.e(H0, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
            J0.f(new HVError(31, getResources().getString(R.string.instructions_error)), (co.hyperverge.hypersnapsdk.objects.b) null);
            finish();
        } catch (Exception e12) {
            Log.e(H0, e12.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e12);
            }
        }
    }

    public JSONObject d2(JSONObject jSONObject, String str) {
        String str2;
        try {
            if (this.f13198f.isShouldExportPDF() && (str2 = this.f13204n0) != null) {
                jSONObject.put("pdfUri", str2);
            }
        } catch (JSONException e11) {
            Log.e(H0, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
        return jSONObject;
    }

    public void d3(String str, String str2) {
        try {
            Intent intent = new Intent(this, HVDocReviewActivity.class);
            intent.putExtra("imageUri", str);
            if (this.f13198f.isShouldReadQR() && !z5.e.a(str2) && new File(str2).exists()) {
                intent.putExtra("qrCodeCroppedImageUri", str2);
            }
            intent.putExtra(MenuConstants.MENU_ICON_ASPECT_RATIO, this.f13197e.getAspectRatio());
            intent.putExtra(HVDocConfig.KEY, this.f13198f);
            intent.putExtra("extraPadding", this.f13209q0);
            l6.d dVar = this.R;
            if (dVar != null) {
                intent.putExtra("viewWidth", dVar.getWidth());
                intent.putExtra("viewHeight", this.R.getHeight());
            }
            startActivityForResult(intent, 1);
        } catch (Exception e11) {
            Log.e(H0, e11.getMessage());
            if (n.w().m() != null) {
                n.w().m().r0(new HVError(2, e11.getMessage()));
            }
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void e2() {
        f2();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
        layoutParams.setMargins(0, N2() - (this.f13197e.getAspectRatio() < 1.0f ? -((int) getResources().getDimension(R.dimen.margin_doc_status_negative)) : (int) getResources().getDimension(R.dimen.margin_doc_status_top)), 0, 0);
        this.O.setLayoutParams(layoutParams);
        this.O.requestLayout();
        this.E.requestLayout();
    }

    public void e3() {
        h5.b bVar = this.F;
        if (bVar != null) {
            bVar.setSensorCallback((b.a) null);
            this.F.i();
            this.F.onPause();
            this.f13212s = null;
        }
    }

    public void f2() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
        if (this.f13197e.getAspectRatio() < 1.0f) {
            layoutParams.setMargins(z5.f.b(this, 30.0f), z5.f.b(this, 60.0f), z5.f.b(this, 30.0f), 0);
        }
        this.P.requestLayout();
    }

    /* access modifiers changed from: package-private */
    public HVBaseConfig h1() {
        return this.f13198f;
    }

    public void o2() {
        this.f13202l.d();
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"android.permission.CAMERA"}));
        this.W.a(this, arrayList);
        if (this.W.b(this, arrayList).f18071b.isEmpty()) {
            if (n.w().m() != null) {
                n.w().m().g(this.f13202l.c().longValue());
            }
            p3();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        Objects.toString(intent);
        q3();
        if (i11 == 1001) {
            try {
                j2(this);
            } catch (NoClassDefFoundError unused) {
                Log.e(H0, "gms excluded");
            }
        }
        if (i11 == 1000 && i12 == -1 && intent != null) {
            File e11 = z5.g.e(getContentResolver(), intent.getData(), new File(getFilesDir(), "hv"));
            if (e11 == null || !e11.exists()) {
                a2(new HVError(6, "Selected file invalid or corrupt"), (co.hyperverge.hypersnapsdk.objects.b) null);
            } else {
                String path = e11.getPath();
                JSONObject jSONObject = new JSONObject();
                String m11 = z5.g.m(path);
                if (m11 != null && !m11.equals("pdf")) {
                    try {
                        w5.d dVar = new w5.d();
                        dVar.b(e11, this.f13212s);
                        if (this.f13198f.isShouldExportPDF()) {
                            Bitmap decodeFile = BitmapFactoryInstrumentation.decodeFile(path);
                            String a11 = w5.k.a(decodeFile, this.T.getPath() + "/hv_" + System.currentTimeMillis() + ".pdf");
                            this.f13204n0 = a11;
                            jSONObject.put("pdfUri", a11);
                        }
                        dVar.c(path, T2(), this.I);
                    } catch (Exception e12) {
                        Log.e(H0, e12.getMessage());
                        if (n.w().s() != null) {
                            n.w().s().a(e12);
                        }
                    }
                }
                if (this.f13198f.shouldShowReviewScreen()) {
                    d3(path, (String) null);
                } else if (this.f13198f.isShouldDoOCR()) {
                    J2(path, (String) null);
                } else {
                    a2((HVError) null, new co.hyperverge.hypersnapsdk.objects.b(d2(jSONObject, path), new JSONObject(), path, this.f13206o0));
                }
            }
        }
        if (i12 == 6) {
            o3();
        } else if (i12 == 7) {
            String stringExtra = intent.getStringExtra("imageUri");
            String stringExtra2 = this.f13198f.isShouldReadQR() ? intent.getStringExtra("qrCodeCroppedImageUri") : null;
            if (this.f13198f.isShouldDoOCR()) {
                J2(stringExtra, stringExtra2);
            } else {
                a2((HVError) null, new co.hyperverge.hypersnapsdk.objects.b(d2(new JSONObject(), stringExtra), new JSONObject(), stringExtra, this.f13206o0));
            }
        } else if (i12 == 10) {
            o2();
        } else if (i12 == 11) {
            r1();
        }
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.camera_cross) {
            if (n.w().m() != null) {
                n.w().m().h();
            }
            v1();
        } else if (id2 == R.id.camera_bubble) {
            if (n.w().m() != null) {
                n.w().m().B(this.f13203m.c().longValue());
            }
            if (this.f13198f.isShouldAllowPhoneTilt() || !this.U) {
                G1();
            }
        } else if (id2 == R.id.camera_flash) {
            if (n.w().m() != null) {
                n.w().m().O();
            }
            this.F.h();
        } else if (id2 == R.id.camera_preview) {
            this.F.c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(R.layout.hv_activity_doc_capture);
        } catch (Exception e11) {
            Log.e(H0, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
            Y2(new HVError(2, getResources().getString(R.string.internal_error)));
        }
        if (n.w().m() != null) {
            n.w().m().l0(this.f13198f);
        }
        if (p5.a.t().s().isShouldUseLocation()) {
            try {
                j2(this);
            } catch (NoClassDefFoundError unused) {
                Log.e(H0, "gms excluded");
            }
        }
        if (bundle != null) {
            finish();
        }
        HVDocConfig hVDocConfig = (HVDocConfig) getIntent().getSerializableExtra(HVDocConfig.KEY);
        this.f13198f = hVDocConfig;
        this.f13197e = hVDocConfig.getDocument();
        View findViewById = findViewById(R.id.v_flash);
        this.G = findViewById;
        findViewById.setVisibility(0);
        File file = new File(getFilesDir(), "hv");
        this.T = file;
        if (!file.exists()) {
            this.T.mkdirs();
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f13211r0 = this.T.getPath() + "/" + currentTimeMillis + ".jpg";
        this.f13213s0 = this.T.getPath() + "/HIGH_RES_CROPPED_" + currentTimeMillis + ".jpg";
        this.f13214t0 = this.T.getPath() + "/HIGH_RES_FULL_" + currentTimeMillis + ".jpg";
        this.L = (ConstraintLayout) findViewById(R.id.layoutDocPicker);
        if (this.f13198f.isDocumentUploadEnabled()) {
            I1();
        } else {
            L1();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (!this.f13198f.isShouldAllowPhoneTilt()) {
                this.V.unregisterListener(this.f13196c0);
                w5.c.b();
            }
        } catch (Exception e11) {
            Log.e(H0, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        h5.b bVar = this.F;
        if (bVar != null) {
            bVar.onPause();
        }
    }

    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        d.a b11 = this.W.b(this, new ArrayList(Arrays.asList(new String[]{"android.permission.CAMERA"})));
        if (!b11.f18071b.isEmpty()) {
            String join = TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, b11.f18071b);
            HVError hVError = new HVError(4, "Following Permissions not granted by user: " + join);
            if (n.w().m() != null) {
                n.w().m().r(hVError, this.f13202l.c().longValue());
            }
            J0.f(hVError, (co.hyperverge.hypersnapsdk.objects.b) null);
            finish();
            return;
        }
        if (n.w().m() != null) {
            n.w().m().g(this.f13202l.c().longValue());
        }
        p3();
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        h5.b bVar = this.F;
        if (bVar != null) {
            bVar.onResume();
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
        if (!this.f13198f.isDocumentUploadEnabled() || this.L.getVisibility() == 0) {
            N1();
            return;
        }
        e3();
        I1();
    }

    /* access modifiers changed from: package-private */
    public boolean s1() {
        if (this.f13198f.isDocumentUploadEnabled()) {
            return this.f13198f.shouldShowCloseAlert() && this.L.getVisibility() == 0;
        }
        return this.f13198f.shouldShowCloseAlert();
    }

    /* renamed from: u2 */
    public void a2(HVError hVError, co.hyperverge.hypersnapsdk.objects.b bVar) {
        try {
            if (n5.a.e()) {
                DocCaptureCompletionHandler docCaptureCompletionHandler = J0;
                if (docCaptureCompletionHandler != null) {
                    docCaptureCompletionHandler.f(hVError, bVar);
                }
                w5.c.b();
                finish();
                return;
            }
            new Handler().postDelayed(new n(this, hVError, bVar), 20);
        } catch (Exception e11) {
            Log.e(H0, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public /* bridge */ /* synthetic */ void v1() {
        super.v1();
    }

    public void w1() {
        M1();
    }

    public /* bridge */ /* synthetic */ Context x1(Context context) {
        return super.x1(context);
    }
}
