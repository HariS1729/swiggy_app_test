package x5;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.res.h;
import androidx.core.widget.g;
import androidx.fragment.app.Fragment;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.activities.HVFaceActivity;
import co.hyperverge.hypersnapsdk.c.p;
import co.hyperverge.hypersnapsdk.listeners.FaceCaptureCompletionHandler;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import h5.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import w5.j;
import w5.l;
import w5.n;
import z5.f;

@Instrumented
/* compiled from: TextureFragment */
public class i extends Fragment implements b, TraceFieldInterface {
    TextView A;
    TextView B;
    TextView C;
    TextView D;
    View E;
    SeekBar F;
    ProgressDialog G;
    a H;
    l6.a I;
    l6.c K;
    l6.b L;
    boolean M;
    /* access modifiers changed from: private */
    public int N;
    /* access modifiers changed from: private */
    public int O;
    JSONObject P;
    HVFaceConfig Q;
    int R;
    ProgressDialog S;
    boolean T = false;
    private final String U = "moveCloser";
    private final String V = "faceCaptureMultipleFaces";
    private final String W = "faceCaptureActivity";

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<Bitmap> f17669a = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public co.hyperverge.hypersnapsdk.f.c<byte[]> f17670b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public File f17671c;

    /* renamed from: c0  reason: collision with root package name */
    private final String f17672c0 = "faceCaptureFaceFound";
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f17673d = "";
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f17674e = false;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f17675f = false;

    /* renamed from: g  reason: collision with root package name */
    private e5.d f17676g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f17677h = Executors.newSingleThreadExecutor();

    /* renamed from: i  reason: collision with root package name */
    private final FaceCaptureCompletionHandler f17678i = y5.a.a().d();
    /* access modifiers changed from: private */
    public boolean j = false;
    /* access modifiers changed from: private */
    public boolean k = true;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public byte[] f17679l;

    /* renamed from: m  reason: collision with root package name */
    l6.e f17680m;
    /* access modifiers changed from: private */
    public long n;

    /* renamed from: n0  reason: collision with root package name */
    private final String f17681n0 = "faceCaptureFaceNotFound";
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final p f17682o = new p();

    /* renamed from: o0  reason: collision with root package name */
    private final String f17683o0 = "faceCaptureMoveAway";
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final p f17684p = new p();

    /* renamed from: p0  reason: collision with root package name */
    View.OnTouchListener f17685p0 = new a();
    private final p q = new p();
    /* access modifiers changed from: private */

    /* renamed from: q0  reason: collision with root package name */
    public final h5.a f17686q0 = new b();
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public HVError f17687r;

    /* renamed from: r0  reason: collision with root package name */
    private float f17688r0;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public HVError f17689s;

    /* renamed from: s0  reason: collision with root package name */
    private float f17690s0;
    private final int t = 50;

    /* renamed from: t0  reason: collision with root package name */
    public Trace f17691t0;

    /* renamed from: u  reason: collision with root package name */
    private final int f17692u = 50;
    FrameLayout v;

    /* renamed from: w  reason: collision with root package name */
    ImageView f17693w;

    /* renamed from: x  reason: collision with root package name */
    ImageView f17694x;

    /* renamed from: y  reason: collision with root package name */
    ImageView f17695y;

    /* renamed from: z  reason: collision with root package name */
    h5.b f17696z;

    /* compiled from: TextureFragment */
    class a implements View.OnTouchListener {

        /* renamed from: x5.i$a$a  reason: collision with other inner class name */
        /* compiled from: TextureFragment */
        class C0210a implements Animation.AnimationListener {
            C0210a() {
            }

            public void onAnimationEnd(Animation animation) {
                i.this.D1();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        a() {
        }

        private void a() {
            ImageView imageView = i.this.f17693w;
            imageView.clearAnimation();
            imageView.clearAnimation();
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(150);
            scaleAnimation.setInterpolator(new AccelerateInterpolator());
            scaleAnimation.setFillAfter(true);
            imageView.startAnimation(scaleAnimation);
            i.this.f17693w.startAnimation(scaleAnimation);
        }

        private void b() {
            ImageView imageView = i.this.f17693w;
            imageView.clearAnimation();
            i.this.f17693w.clearAnimation();
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(150);
            scaleAnimation.setInterpolator(new AccelerateInterpolator());
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setAnimationListener(new C0210a());
            i.this.f17693w.startAnimation(scaleAnimation);
            imageView.startAnimation(scaleAnimation);
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                a();
                return false;
            } else if (action != 1) {
                return false;
            } else {
                b();
                return false;
            }
        }
    }

    /* compiled from: TextureFragment */
    class b extends h5.a {

        /* compiled from: TextureFragment */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Handler f17700a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ byte[] f17701b;

            a(Handler handler, byte[] bArr) {
                this.f17700a = handler;
                this.f17701b = bArr;
            }

            public void run() {
                if (!i.this.f17675f) {
                    this.f17700a.postDelayed(this, 100);
                    return;
                }
                i.this.H.a(false);
                if (i.this.f17674e) {
                    i iVar = i.this;
                    long unused = iVar.n = iVar.f17684p.b();
                }
                i iVar2 = i.this;
                iVar2.H.d(this.f17701b, iVar2.f17679l, b.this.c().getAbsolutePath(), b.this.d(), i.this.f17673d);
                this.f17700a.removeCallbacks(this);
            }
        }

        b() {
        }

        private String F() {
            File file = new File(i.this.f17686q0.c() + File.separator + "hv_dummy_video.mp4");
            try {
                file.createNewFile();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            return file.getAbsolutePath();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void G(float f11, float f12, boolean z11) {
            if (f11 > 0.0f || f12 > 0.0f) {
                i iVar = i.this;
                iVar.L.c(f11 * ((float) iVar.N), f12 * ((float) i.this.O), z11);
                return;
            }
            i iVar2 = i.this;
            iVar2.L.c((float) (iVar2.N / 2), (float) (i.this.O / 2), z11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void H() {
            i iVar = i.this;
            if (iVar.L != null) {
                int i11 = iVar.Q.getShouldUseBackCamera() ? 0 : 8;
                i.this.L.setVisibility(i11);
                if (i.this.Q.isShouldUseZoom()) {
                    i.this.F.setVisibility(i11);
                }
            }
        }

        public void A() {
        }

        public void B(float f11, float f12, boolean z11) {
            if (i.this.L != null) {
                new Handler(Looper.getMainLooper()).post(new k(this, f11, f12, z11));
            }
        }

        public void C(int i11) {
            if (n5.a.d(i.this.getActivity())) {
                i.this.F.setMax(i11 * 2);
            } else {
                i.this.F.setMax(i11);
            }
            i.this.F.setProgress(0);
        }

        public void I() {
            long longValue = i.this.f17682o.c().longValue();
            if (n.w().m() != null) {
                n.w().m().p0(i.this.Q, longValue);
            }
        }

        public void a() {
        }

        public int b() {
            return 1;
        }

        public File c() {
            File file;
            Exception e11;
            try {
                file = new File(i.this.requireActivity().getFilesDir(), "hv");
                try {
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                } catch (Exception e12) {
                    e11 = e12;
                    Log.e("TextureFragment", "getPhotoDirectory exception: " + e11.getMessage());
                    return file;
                }
            } catch (Exception e13) {
                e11 = e13;
                file = null;
                Log.e("TextureFragment", "getPhotoDirectory exception: " + e11.getMessage());
                return file;
            }
            return file;
        }

        public String d() {
            return "FD_" + System.currentTimeMillis() + ".jpg";
        }

        public float f() {
            return 1.3f;
        }

        public float g() {
            return 0.3f;
        }

        public String h() {
            return "FD_" + System.currentTimeMillis() + ".mp4";
        }

        public boolean i() {
            return false;
        }

        public void j() {
            ProgressDialog progressDialog = i.this.S;
            if (progressDialog != null && progressDialog.isShowing()) {
                i.this.S.dismiss();
                i.this.S = null;
            }
            i iVar = i.this;
            boolean unused = iVar.k = !iVar.k;
            a6.a.a().b(new j(this));
        }

        public void k(int i11) {
        }

        public void l(int i11, String str) {
        }

        public void m() {
        }

        public void n() {
        }

        public void o() {
            if (i.this.Q.isUseFlash()) {
                i.this.f17696z.h();
            }
        }

        public void p() {
        }

        public void q() {
        }

        public void r() {
        }

        public void s(byte[] bArr, int i11, int i12, int i13, int i14, byte[] bArr2) {
            byte[] bArr3 = bArr2;
            i.this.H.a(new c6.b(i11, i12, f.h(), i.this.f17680m.getDiameter() + f.b(i.this.requireActivity(), 80.0f), (long) bArr3.length, i13, i14, bArr, !i.this.Q.getShouldUseBackCamera(), false));
            byte[] unused = i.this.f17679l = bArr3;
            if (i.this.Q.isShouldRecordVideo() && !i.this.j) {
                i.this.f17670b.add(bArr3);
                i.this.f17670b.size();
            }
        }

        public void t() {
            i iVar = i.this;
            iVar.M = true;
            HVError unused = iVar.f17687r = new HVError(2, "failure logged in selfie onPictureFailed()");
            long longValue = i.this.f17682o.c().longValue();
            if (n.w().m() != null) {
                n.w().m().t(i.this.f17687r, i.this.Q, longValue);
            }
            boolean unused2 = i.this.j = false;
        }

        public void u(byte[] bArr) {
            I();
            if (i.this.Q.isShouldRecordVideo()) {
                i.this.H.a(true);
                Handler handler = new Handler(Looper.getMainLooper());
                handler.postDelayed(new a(handler, bArr), 100);
                return;
            }
            i iVar = i.this;
            iVar.H.d(bArr, iVar.f17679l, c().getAbsolutePath(), d(), F());
        }

        public void v(File file) {
            long longValue = i.this.f17682o.c().longValue();
            if (n.w().m() != null) {
                n.w().m().f(i.this.Q, file.getAbsolutePath(), longValue);
            }
            boolean unused = i.this.j = false;
        }

        public void w(int i11, int i12) {
            j.n().o(i11, i12);
        }

        public void x() {
            try {
                h5.b bVar = i.this.f17696z;
                if (bVar != null) {
                    bVar.l();
                }
            } catch (Exception e11) {
                Log.e("TextureFragment", e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }

        public void y(int i11, int i12) {
            int unused = i.this.O = i12;
            int unused2 = i.this.N = i11;
            i.this.B1();
        }

        public void z() {
        }
    }

    /* compiled from: TextureFragment */
    class c implements e5.f {
        c() {
        }

        public void a(File file) {
            i iVar = i.this;
            String unused = iVar.f17673d = Uri.parse(iVar.f17671c.toString()).toString();
            boolean unused2 = i.this.f17675f = true;
            boolean unused3 = i.this.f17674e = true;
        }

        public void b(Throwable th2) {
            boolean unused = i.this.f17675f = true;
            boolean unused2 = i.this.f17674e = false;
            i iVar = i.this;
            HVError unused3 = iVar.f17689s = new HVError(2, "Video encoding unsuccessful : " + th2.getMessage());
            i.this.f17689s.getErrorMessage();
            long b11 = i.this.f17684p.b();
            if (n.w().m() != null) {
                n.w().m().i(i.this.f17689s, b11);
            }
        }
    }

    /* compiled from: TextureFragment */
    class d implements SeekBar.OnSeekBarChangeListener {
        d() {
        }

        public void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
            if (n5.a.d(i.this.getActivity())) {
                n5.a.s(((float) i11) / 2.0f);
                return;
            }
            n5.a.s((float) i11);
            i.this.R = i11;
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* compiled from: TextureFragment */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProgressDialog f17705a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f17706b;

        e(ProgressDialog progressDialog, View view) {
            this.f17705a = progressDialog;
            this.f17706b = view;
        }

        public void run() {
            if (n.w().E()) {
                this.f17705a.dismiss();
                i.this.m1(this.f17706b);
            }
        }
    }

    private void A1() {
        try {
            l6.a aVar = new l6.a(getActivity());
            this.I = aVar;
            aVar.setId(R.id.hv_circular_bar);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.I.getDiameter(), this.I.getDiameter());
            layoutParams.gravity = 1;
            layoutParams.topMargin = f.k(getActivity());
            this.I.setLayoutParams(layoutParams);
            this.v.addView(this.I);
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    /* access modifiers changed from: private */
    public void B1() {
        if (this.Q.getShouldUseBackCamera()) {
            if (this.L.getParent() != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.L.getLayoutParams();
                layoutParams.height = this.O;
                layoutParams.width = this.N;
                this.L.setX(this.f17696z.getX());
                this.L.setY(this.f17696z.getY());
                this.L.requestLayout();
            }
            this.f17680m.requestLayout();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void C0(FrameLayout frameLayout) {
        l6.b bVar = new l6.b(getActivity());
        this.L = bVar;
        frameLayout.addView(bVar);
        frameLayout.setOnTouchListener(new f(this));
    }

    private void E1() {
        File F1 = F1();
        this.f17671c = F1;
        if (F1 == null) {
            HVError hVError = new HVError(2, "could not create media video file");
            this.f17689s = hVError;
            hVError.getErrorMessage();
            long b11 = this.f17684p.b();
            if (n.w().m() != null) {
                n.w().m().i(this.f17689s, b11);
                return;
            }
            return;
        }
        this.f17676g = new e5.d(getActivity().getApplicationContext(), this.f17671c);
        this.f17676g.b(new e5.e(this.f17671c, 480, 640, "video/avc", 1, (float) this.Q.getFps(), ((int) this.Q.getBitrateM()) * 1000000, new e5.c(this.f17671c.getAbsolutePath(), (float) this.Q.getFps()), 10));
        this.f17676g.c(new c());
        this.f17677h.execute(new h(this));
    }

    private File F1() {
        File c11 = this.f17686q0.c();
        if (c11 == null) {
            return null;
        }
        return new File(c11.getPath() + File.separator + this.f17686q0.h());
    }

    private void G1() {
        try {
            n5.a.p(n.w().C());
            n5.a.l(true);
            n5.a.n(n.w().u());
            if (this.Q.isShouldUseEnhancedCameraFeatures()) {
                n5.a.r(true);
            }
            this.f17680m = new l6.e(requireActivity());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f17680m.getDiameter(), this.f17680m.getDiameter());
            layoutParams.gravity = 1;
            layoutParams.topMargin = f.k(requireActivity());
            this.f17680m.setLayoutParams(layoutParams);
            this.v.addView(this.f17680m);
            this.K = new l6.c(getActivity());
            this.N = this.f17680m.getDiameter();
            this.O = this.f17680m.getDiameter();
            h5.b g11 = h5.b.g(requireActivity(), this.f17686q0, true ^ this.Q.getShouldUseBackCamera());
            this.f17696z = g11;
            g11.f();
            Display defaultDisplay = requireActivity().getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            n5.a.q(point);
            this.f17696z.setLayoutParams(new FrameLayout.LayoutParams(this.f17680m.getDiameter(), this.f17680m.getDiameter()));
            this.f17696z.setSensorCallback(new g(this));
            n5.a.t();
            this.f17680m.addView(this.f17696z);
            C0(this.f17680m);
            B1();
            if (this.L != null) {
                this.L.setVisibility(this.Q.getShouldUseBackCamera() ? 0 : 8);
            }
            this.f17680m.addView(this.K);
            h5.b bVar = this.f17696z;
            if (bVar != null) {
                bVar.onResume();
            }
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    private void I1() {
        try {
            this.I.setBackgroundColor(getResources().getColor(R.color.progress_grey));
            this.I.setProgressColor(getResources().getColor(R.color.face_capture_circle_failure));
            this.I.setMaxProgress(100);
            if (!n.w().C()) {
                this.I.setmStrokeWidth(10);
            }
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean J0(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f17688r0 = motionEvent.getX();
            this.f17690s0 = motionEvent.getY();
        } else if (actionMasked == 1 && Math.abs(motionEvent.getX() - this.f17688r0) < 20.0f && Math.abs(motionEvent.getY() - this.f17690s0) < 20.0f) {
            this.L.c(motionEvent.getX(), motionEvent.getY(), false);
            this.f17696z.j(motionEvent.getX() / ((float) this.N), motionEvent.getY() / ((float) this.O), (Camera.AutoFocusCallback) null);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K1() {
        Iterator<byte[]> it2 = this.f17670b.iterator();
        while (it2.hasNext()) {
            byte[] next = it2.next();
            this.f17669a.add(BitmapFactoryInstrumentation.decodeByteArray(next, 0, next.length));
        }
        this.f17676g.a(new ArrayList(this.f17669a), (Integer) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L1() {
        this.f17680m.getWidth();
        this.f17680m.getHeight();
        l6.b bVar = this.L;
        if (bVar != null) {
            bVar.c((float) (this.N / 2), (float) (this.O / 2), false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b1(View view) {
        if (n.w().m() != null) {
            n.w().m().a(this.q.c().longValue());
        }
        D1();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f1(View view) {
        if (n.w().m() != null) {
            n.w().m().y();
        }
        n0();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j1(View view) {
        if (n.w().m() != null) {
            n.w().m().j();
        }
        ((HVFaceActivity) requireActivity()).v1();
    }

    private void m0() {
        try {
            if (this.Q.getTitleTypeface() > 0) {
                this.B.setTypeface(h.g(requireActivity().getApplicationContext(), this.Q.getTitleTypeface()));
            }
            if (this.Q.getSubtitleTypeface() > 0) {
                this.C.setTypeface(h.g(requireActivity().getApplicationContext(), this.Q.getSubtitleTypeface()));
            }
            if (this.Q.getTitleTypeface() > 0) {
                this.A.setTypeface(h.g(requireActivity().getApplicationContext(), this.Q.getTitleTypeface()));
            }
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    /* access modifiers changed from: private */
    public void m1(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.llBranding);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.llTrustLogos);
        int i11 = 0;
        boolean z11 = n.w() != null && n.w().G();
        boolean shouldShowTrustLogos = this.Q.shouldShowTrustLogos();
        linearLayout.setVisibility(z11 ? 0 : 8);
        if (!shouldShowTrustLogos) {
            i11 = 8;
        }
        linearLayout2.setVisibility(i11);
    }

    private void v1() {
        try {
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.view_overlay, (ViewGroup) null);
            this.E = inflate;
            this.v.addView(inflate);
            this.E.setVisibility(8);
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    private void x1() {
        try {
            G1();
            A1();
            v1();
            this.P = this.Q.getCustomUIStrings();
            String faceCaptureTitle = this.Q.getFaceCaptureTitle();
            if (!TextUtils.isEmpty(faceCaptureTitle)) {
                this.B.setText(faceCaptureTitle);
            }
            String faceCaptureSubtitle = this.Q.getFaceCaptureSubtitle();
            this.C.setText(faceCaptureSubtitle);
            this.C.setVisibility(!TextUtils.isEmpty(faceCaptureSubtitle) ? 0 : 8);
            if (!this.Q.isShouldUseFlip()) {
                this.f17694x.setVisibility(4);
            }
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void B0(View view) {
        this.v = (FrameLayout) view.findViewById(R.id.parent_container);
        this.A = (TextView) view.findViewById(R.id.statusString);
        this.f17693w = (ImageView) view.findViewById(R.id.camera_icon);
        this.B = (TextView) view.findViewById(R.id.title_text);
        this.C = (TextView) view.findViewById(R.id.tvSubtitle);
        this.f17694x = (ImageView) view.findViewById(R.id.camera_flip);
        this.f17695y = (ImageView) view.findViewById(R.id.close_gesture);
        this.D = (TextView) view.findViewById(R.id.debug_text);
        m0();
        this.f17693w.setOnClickListener(new d(this));
        this.f17694x.setOnClickListener(new c(this));
        this.f17695y.setOnClickListener(new e(this));
        try {
            this.F = (SeekBar) view.findViewById(R.id.hv_zoom_seek_bar);
            HVFaceConfig hVFaceConfig = this.Q;
            if (hVFaceConfig == null || !hVFaceConfig.isShouldUseZoom()) {
                this.F.setVisibility(8);
                ProgressDialog progressDialog = new ProgressDialog(getContext());
                progressDialog.setMessage(l.f17583c);
                progressDialog.setCancelable(false);
                progressDialog.show();
                new Handler(Looper.getMainLooper()).postDelayed(new e(progressDialog, view), 100);
            }
            if (f.l(getActivity())) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.F.getLayoutParams();
                layoutParams.setMargins(f.b(getActivity(), 45.0f), 0, f.b(getActivity(), 45.0f), f.b(getActivity(), 5.0f));
                this.F.setLayoutParams(layoutParams);
                this.F.requestLayout();
            }
            Drawable progressDrawable = this.F.getProgressDrawable();
            Resources resources = getResources();
            int i11 = R.color.seekbar_color;
            progressDrawable.setColorFilter(resources.getColor(i11), PorterDuff.Mode.MULTIPLY);
            this.F.getThumb().setColorFilter(getResources().getColor(i11), PorterDuff.Mode.SRC_ATOP);
            this.F.setOnSeekBarChangeListener(new d());
            ProgressDialog progressDialog2 = new ProgressDialog(getContext());
            progressDialog2.setMessage(l.f17583c);
            progressDialog2.setCancelable(false);
            progressDialog2.show();
            new Handler(Looper.getMainLooper()).postDelayed(new e(progressDialog2, view), 100);
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage() != null ? e11.getMessage() : "Exception in loading the zoom seekbar");
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void D1() {
        try {
            if (this.H.b() && this.M) {
                this.f17682o.d();
                this.M = false;
                if (this.f17696z != null) {
                    this.j = true;
                    if (this.Q.isShouldRecordVideo()) {
                        this.f17684p.d();
                        E1();
                    }
                    this.f17696z.m((String) null);
                    return;
                }
                this.f17687r = new HVError(2, "camerView is null");
                long longValue = this.f17682o.c().longValue();
                if (n.w().m() != null) {
                    n.w().m().t(this.f17687r, this.Q, longValue);
                }
            }
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage());
            this.f17687r = new HVError(2, e11.getMessage());
            long longValue2 = this.f17682o.c().longValue();
            if (n.w().m() != null) {
                n.w().m().t(this.f17687r, this.Q, longValue2);
            }
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void E0(HVFaceConfig hVFaceConfig) {
        this.Q = hVFaceConfig;
        if (hVFaceConfig.isShouldRecordVideo()) {
            j0();
        }
    }

    public void G0(a aVar) {
        this.H = aVar;
    }

    public void M1() {
        this.H.c();
    }

    public void N1() {
        this.q.d();
        this.f17682o.d();
    }

    public void O1() {
        this.f17669a = new ArrayList<>();
        this.f17670b = new co.hyperverge.hypersnapsdk.f.c<>(this.Q.getNumberOfFrames());
        this.f17673d = "";
        this.f17674e = false;
        this.f17675f = false;
    }

    public void a() {
        try {
            h5.b bVar = this.f17696z;
            if (bVar != null) {
                bVar.onPause();
            }
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void b() {
        if (getActivity() != null && isAdded()) {
            try {
                this.I.setProgressColor(getResources().getColor(R.color.face_capture_circle_failure));
                JSONObject jSONObject = this.P;
                if (jSONObject == null || !jSONObject.has("faceCaptureMoveAway") || this.P.getString("faceCaptureMoveAway").trim().isEmpty()) {
                    this.A.setText(l.f17585e);
                } else {
                    this.A.setText(this.P.getString("faceCaptureMoveAway"));
                }
                this.f17693w.setImageResource(R.drawable.camera_disabled);
                g.c(this.f17693w, (ColorStateList) null);
            } catch (Exception e11) {
                Log.e("TextureFragment", e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }
    }

    public Context c() {
        return getActivity();
    }

    public void d() {
        try {
            h5.b bVar = this.f17696z;
            if (bVar != null) {
                bVar.setSensorCallback((b.a) null);
                this.f17696z.i();
                this.f17696z.onPause();
            }
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public float e() {
        return h() + ((float) (this.f17680m.getHeight() / 2));
    }

    public void f() {
        if (getActivity() != null && isAdded()) {
            try {
                this.T = false;
                this.I.setProgressColor(getResources().getColor(R.color.face_capture_circle_failure));
                JSONObject jSONObject = this.P;
                if (jSONObject == null || !jSONObject.has("faceCaptureFaceNotFound") || this.P.getString("faceCaptureFaceNotFound").trim().isEmpty()) {
                    this.A.setText(l.f17581a);
                } else {
                    this.A.setText(this.P.getString("faceCaptureFaceNotFound"));
                }
                this.f17693w.setOnTouchListener((View.OnTouchListener) null);
                this.f17693w.setClickable(false);
                this.f17693w.setImageResource(R.drawable.camera_disabled);
                g.c(this.f17693w, (ColorStateList) null);
            } catch (Exception e11) {
                Log.e("TextureFragment", TextUtils.isEmpty(e11.getMessage()) ? "" : e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }
    }

    public long g() {
        return this.n;
    }

    public float h() {
        int[] iArr = new int[2];
        this.f17680m.getLocationOnScreen(iArr);
        return (float) iArr[1];
    }

    public void i() {
        if (getActivity() != null && isAdded()) {
            try {
                this.T = true;
                if (n.w().C()) {
                    this.I.setProgressColor(getResources().getColor(R.color.face_capture_circle_success));
                } else {
                    this.I.setProgressColor(getResources().getColor(R.color.camera_button_color));
                }
                JSONObject jSONObject = this.P;
                if (jSONObject == null || !jSONObject.has("faceCaptureFaceFound") || this.P.getString("faceCaptureFaceFound").trim().isEmpty()) {
                    this.A.setText(l.f17582b);
                } else {
                    this.A.setText(this.P.getString("faceCaptureFaceFound"));
                }
                this.f17693w.setOnTouchListener(this.f17685p0);
                this.f17693w.setClickable(true);
                this.f17693w.setImageResource(R.drawable.ic_camera_button_svg);
                g.c(this.f17693w, ColorStateList.valueOf(getResources().getColor(R.color.camera_button_color)));
            } catch (Exception e11) {
                Log.e("TextureFragment", TextUtils.isEmpty(e11.getMessage()) ? "" : e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }
    }

    public void j0() {
        this.f17670b = new co.hyperverge.hypersnapsdk.f.c<>(this.Q.getNumberOfFrames());
        this.Q.getNumberOfFrames();
        this.Q.getBitrateM();
        this.Q.getFps();
    }

    public int k() {
        return this.f17680m.getDiameter() / 2;
    }

    public void l() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public void n0() {
        try {
            ProgressDialog progressDialog = this.S;
            if (progressDialog == null || !progressDialog.isShowing()) {
                if (this.S == null) {
                    this.S = new ProgressDialog(getActivity());
                }
                HVFaceConfig hVFaceConfig = this.Q;
                hVFaceConfig.setShouldUseBackCamera(!hVFaceConfig.getShouldUseBackCamera());
                this.S.setCancelable(false);
                this.S.setMessage("Please wait...");
                this.S.show();
                this.f17696z.k();
            }
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void o() {
        if (getActivity() != null && isAdded()) {
            try {
                this.I.setProgressColor(getResources().getColor(R.color.face_capture_circle_failure));
                JSONObject jSONObject = this.P;
                if (jSONObject == null || !jSONObject.has("faceCaptureMultipleFaces") || this.P.getString("faceCaptureMultipleFaces").trim().isEmpty()) {
                    this.A.setText(a(R.string.faceCaptureMultipleFaces));
                } else {
                    this.A.setText(this.P.getString("faceCaptureMultipleFaces"));
                }
                this.f17693w.setImageResource(R.drawable.camera_disabled);
                g.c(this.f17693w, (ColorStateList) null);
            } catch (Exception e11) {
                Log.e("TextureFragment", e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        try {
            a aVar = this.H;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        N1();
        HVFaceConfig hVFaceConfig = this.Q;
        if (hVFaceConfig != null && hVFaceConfig.isShouldRecordVideo()) {
            O1();
        }
        if (i12 == 20) {
            this.H.c();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            TraceMachine.enterMethod(this.f17691t0, "c#onCreateView", (ArrayList<String>) null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod((Trace) null, "c#onCreateView", (ArrayList<String>) null);
        }
        this.q.d();
        View inflate = layoutInflater.inflate(R.layout.hv_fragment_texture_view, viewGroup, false);
        B0(inflate);
        try {
            if (n.w().C()) {
                this.f17693w.setImageResource(R.drawable.camera_disabled);
            } else {
                this.f17693w.setImageResource(R.drawable.ic_camera_button_svg);
            }
            x1();
            I1();
            m1(inflate);
            this.M = true;
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
        TraceMachine.exitMethod();
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onPause() {
        super.onPause();
        try {
            h5.b bVar = this.f17696z;
            if (bVar != null) {
                bVar.onPause();
            }
        } catch (Exception e11) {
            Log.e("TextureFragment", e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
        ProgressDialog progressDialog = this.G;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.G.cancel();
        }
        if (n.w().C()) {
            f();
            this.H.c(false);
        }
    }

    public void onResume() {
        super.onResume();
        f.g(getActivity(), 255);
        if (!n.w().C()) {
            i();
        }
        if (isAdded()) {
            try {
                h5.b bVar = this.f17696z;
                if (bVar != null) {
                    bVar.onResume();
                }
            } catch (Exception e11) {
                Log.e("TextureFragment", e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }
    }

    public void a(boolean z11) {
        if (z11) {
            try {
                this.E.setVisibility(0);
                this.G = new ProgressDialog(getActivity());
                try {
                    JSONObject jSONObject = this.P;
                    if (jSONObject == null || !jSONObject.has("faceCaptureActivity") || this.P.getString("faceCaptureActivity").trim().isEmpty()) {
                        this.G.setMessage(l.f17583c);
                    } else {
                        this.G.setMessage(this.P.getString("faceCaptureActivity"));
                    }
                } catch (Exception e11) {
                    Log.e("TextureFragment", e11.getMessage());
                    if (n.w().s() != null) {
                        n.w().s().a(e11);
                    }
                }
                this.G.setCancelable(false);
                this.G.show();
            } catch (Exception e12) {
                Log.e("TextureFragment", e12.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e12);
                }
            }
        } else {
            this.E.setVisibility(8);
            ProgressDialog progressDialog = this.G;
            if (progressDialog != null) {
                this.M = true;
                progressDialog.cancel();
                this.G = null;
            }
        }
    }

    public String a(int i11) {
        return getResources().getString(i11);
    }

    public void a(String str) {
        if (str != null) {
            this.f17686q0.v(new File(str));
        }
    }
}
