package n5;

import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.newrelic.agent.android.harvest.type.HarvestErrorCodes;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;

public class b {
    static Matrix A = new Matrix();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f15845a = "co.hyperverge.hvcamera.magicfilter.camera.a";
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static Camera f15846b;

    /* renamed from: c  reason: collision with root package name */
    private static int f15847c = J();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f15848d = false;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f15849e = false;

    /* renamed from: f  reason: collision with root package name */
    private static Camera.Parameters f15850f;

    /* renamed from: g  reason: collision with root package name */
    private static int f15851g;

    /* renamed from: h  reason: collision with root package name */
    private static float f15852h;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f15853i = true;
    private static String j;
    /* access modifiers changed from: private */
    public static int k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static byte[][] f15854l = new byte[5][];

    /* renamed from: m  reason: collision with root package name */
    private static byte[][] f15855m = new byte[5][];
    /* access modifiers changed from: private */
    public static int n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static Camera.ShutterCallback f15856o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static Camera.PictureCallback f15857p;
    public static boolean q = false;

    /* renamed from: r  reason: collision with root package name */
    private static ScheduledExecutorService f15858r;

    /* renamed from: s  reason: collision with root package name */
    private static boolean f15859s;
    private static boolean t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static List<String> f15860u = new ArrayList();
    /* access modifiers changed from: private */
    public static List<String> v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    private static final List<String> f15861w;

    /* renamed from: x  reason: collision with root package name */
    private static final List<String> f15862x;

    /* renamed from: y  reason: collision with root package name */
    static String f15863y;

    /* renamed from: z  reason: collision with root package name */
    private static List<String> f15864z;

    static class a implements Camera.FaceDetectionListener {
        a() {
        }

        public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
        }
    }

    @Instrumented
    /* renamed from: n5.b$b  reason: collision with other inner class name */
    static class C0151b implements Camera.PreviewCallback {
        C0151b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00aa A[Catch:{ Exception -> 0x00ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00e5 A[Catch:{ Exception -> 0x00ff }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPreviewFrame(byte[] r24, android.hardware.Camera r25) {
            /*
                r23 = this;
                r7 = r24
                java.lang.System.currentTimeMillis()
                if (r7 != 0) goto L_0x0009
                goto L_0x0106
            L_0x0009:
                android.hardware.Camera$Size r0 = n5.b.N()     // Catch:{ Exception -> 0x00ff }
                int r15 = r0.width     // Catch:{ Exception -> 0x00ff }
                android.hardware.Camera$Size r0 = n5.b.N()     // Catch:{ Exception -> 0x00ff }
                int r14 = r0.height     // Catch:{ Exception -> 0x00ff }
                int r0 = n5.b.n     // Catch:{ Exception -> 0x00ff }
                int r0 = r0 + 45
                r13 = 90
                int r0 = r0 / r13
                int r0 = r0 * 90
                int r12 = r0 % 360
                boolean r0 = n5.a.g()     // Catch:{ Exception -> 0x00ff }
                if (r0 == 0) goto L_0x0030
                int r0 = 270 - r12
                int r0 = r0 + 360
                int r0 = r0 % 360
            L_0x002e:
                r11 = r0
                goto L_0x0035
            L_0x0030:
                int r0 = r12 + 90
                int r0 = r0 % 360
                goto L_0x002e
            L_0x0035:
                boolean r0 = n5.b.q     // Catch:{ Exception -> 0x00ff }
                if (r0 == 0) goto L_0x00a3
                h5.a r0 = h5.b.f14799f     // Catch:{ Exception -> 0x0096 }
                r0.z()     // Catch:{ Exception -> 0x0096 }
                r0 = 0
                n5.b.q(r0)     // Catch:{ Exception -> 0x0096 }
                n5.b.q = r0     // Catch:{ Exception -> 0x0096 }
                java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0096 }
                r8.<init>()     // Catch:{ Exception -> 0x0096 }
                android.graphics.YuvImage r9 = new android.graphics.YuvImage     // Catch:{ Exception -> 0x0096 }
                r3 = 17
                r6 = 0
                r1 = r9
                r2 = r24
                r4 = r15
                r5 = r14
                r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0096 }
                android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ Exception -> 0x0096 }
                r1.<init>(r0, r0, r15, r14)     // Catch:{ Exception -> 0x0096 }
                r9.compressToJpeg(r1, r13, r8)     // Catch:{ Exception -> 0x0096 }
                byte[] r1 = r8.toByteArray()     // Catch:{ Exception -> 0x0096 }
                int r2 = r1.length     // Catch:{ Exception -> 0x0096 }
                android.graphics.Bitmap r8 = com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation.decodeByteArray(r1, r0, r2)     // Catch:{ Exception -> 0x0096 }
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0096 }
                r0.<init>()     // Catch:{ Exception -> 0x0096 }
                android.graphics.Matrix r1 = new android.graphics.Matrix     // Catch:{ Exception -> 0x0096 }
                r1.<init>()     // Catch:{ Exception -> 0x0096 }
                float r2 = (float) r11     // Catch:{ Exception -> 0x0096 }
                r1.postRotate(r2)     // Catch:{ Exception -> 0x0096 }
                r9 = 0
                r10 = 0
                r2 = 0
                r3 = r11
                r11 = r15
                r4 = r12
                r12 = r14
                r5 = 90
                r13 = r1
                r1 = r14
                r14 = r2
                android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0094 }
                android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0094 }
                r2.compress(r6, r5, r0)     // Catch:{ Exception -> 0x0094 }
                h5.a r2 = h5.b.f14799f     // Catch:{ Exception -> 0x0094 }
                byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x0094 }
                r2.u(r0)     // Catch:{ Exception -> 0x0094 }
                goto L_0x00a8
            L_0x0094:
                r0 = move-exception
                goto L_0x009c
            L_0x0096:
                r0 = move-exception
                r3 = r11
                r4 = r12
                r1 = r14
                r5 = 90
            L_0x009c:
                java.lang.String unused = n5.b.f15845a     // Catch:{ Exception -> 0x00ff }
                r0.getMessage()     // Catch:{ Exception -> 0x00ff }
                goto L_0x00a8
            L_0x00a3:
                r3 = r11
                r4 = r12
                r1 = r14
                r5 = 90
            L_0x00a8:
                if (r3 == r5) goto L_0x00b1
                r0 = 270(0x10e, float:3.78E-43)
                if (r3 != r0) goto L_0x00af
                goto L_0x00b1
            L_0x00af:
                r14 = r1
                goto L_0x00bd
            L_0x00b1:
                android.hardware.Camera$Size r0 = n5.b.N()     // Catch:{ Exception -> 0x00ff }
                int r15 = r0.height     // Catch:{ Exception -> 0x00ff }
                android.hardware.Camera$Size r0 = n5.b.N()     // Catch:{ Exception -> 0x00ff }
                int r14 = r0.width     // Catch:{ Exception -> 0x00ff }
            L_0x00bd:
                int r0 = n5.b.k     // Catch:{ Exception -> 0x00ff }
                int r0 = r0 + 1
                int r0 = r0 % 5
                int unused = n5.b.k = r0     // Catch:{ Exception -> 0x00ff }
                android.hardware.Camera$Size r0 = n5.b.N()     // Catch:{ Exception -> 0x00ff }
                int r0 = r0.width     // Catch:{ Exception -> 0x00ff }
                android.hardware.Camera$Size r1 = n5.b.N()     // Catch:{ Exception -> 0x00ff }
                int r1 = r1.height     // Catch:{ Exception -> 0x00ff }
                byte[][] r2 = n5.b.f15854l     // Catch:{ Exception -> 0x00ff }
                int r5 = n5.b.k     // Catch:{ Exception -> 0x00ff }
                r2 = r2[r5]     // Catch:{ Exception -> 0x00ff }
                n5.a.k(r7, r0, r1, r3, r2)     // Catch:{ Exception -> 0x00ff }
                h5.a r16 = h5.b.f14799f     // Catch:{ Exception -> 0x00ff }
                if (r16 == 0) goto L_0x0106
                byte[][] r0 = n5.b.f15854l     // Catch:{ Exception -> 0x00ff }
                int r1 = n5.b.k     // Catch:{ Exception -> 0x00ff }
                r17 = r0[r1]     // Catch:{ Exception -> 0x00ff }
                byte[] r22 = o5.c.a(r7, r14, r15, r3)     // Catch:{ Exception -> 0x00ff }
                r18 = r15
                r19 = r14
                r20 = r4
                r21 = r3
                r16.s(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x00ff }
                goto L_0x0106
            L_0x00ff:
                r0 = move-exception
                java.lang.String unused = n5.b.f15845a
                r0.getMessage()
            L_0x0106:
                n5.b.p(r24)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.b.C0151b.onPreviewFrame(byte[], android.hardware.Camera):void");
        }
    }

    static class c implements Runnable {
        c() {
        }

        public void run() {
            List A = b.f15860u;
            String str = Build.MODEL;
            if (!A.contains(str) && !b.v.contains(str)) {
                b.f15846b.cancelAutoFocus();
            }
            b.b();
        }
    }

    static class d implements Camera.AutoFocusCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScheduledFuture f15865a;

        d(ScheduledFuture scheduledFuture) {
            this.f15865a = scheduledFuture;
        }

        public void onAutoFocus(boolean z11, Camera camera) {
            if (this.f15865a.cancel(false)) {
                b.b();
            }
        }
    }

    static class e implements Runnable {

        class a implements Runnable {
            a(e eVar) {
            }

            public void run() {
                b.f15846b.takePicture(b.f15856o, (Camera.PictureCallback) null, b.f15857p);
            }
        }

        e() {
        }

        public void run() {
            if (a.h()) {
                h5.b.f14799f.A();
                new Handler(Looper.getMainLooper()).postDelayed(new a(this), 500);
                return;
            }
            try {
                b.f15846b.takePicture(b.f15856o, (Camera.PictureCallback) null, b.f15857p);
            } catch (Exception e11) {
                String unused = b.f15845a;
                e11.getMessage();
                try {
                    h5.b.f14799f.t();
                } catch (Exception e12) {
                    String unused2 = b.f15845a;
                    e12.getMessage();
                }
            }
        }
    }

    static class f implements Runnable {
        f() {
        }

        public void run() {
            try {
                String str = b.f15863y;
                if (str == null) {
                    h5.b.f14799f.n();
                    return;
                }
                char c11 = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 3551) {
                    if (hashCode != 109935) {
                        if (hashCode != 3005871) {
                            if (hashCode == 110547964) {
                                if (str.equals("torch")) {
                                    c11 = 2;
                                }
                            }
                        } else if (str.equals("auto")) {
                            c11 = 1;
                        }
                    } else if (str.equals(PDPrintFieldAttributeObject.CHECKED_STATE_OFF)) {
                        c11 = 0;
                    }
                } else if (str.equals(PDPrintFieldAttributeObject.CHECKED_STATE_ON)) {
                    c11 = 3;
                }
                if (c11 == 0) {
                    h5.b.f14799f.o();
                } else if (c11 == 1) {
                    h5.b.f14799f.m();
                } else if (c11 == 2) {
                    h5.b.f14799f.q();
                } else if (c11 == 3) {
                    h5.b.f14799f.p();
                }
            } catch (Exception e11) {
                String unused = b.f15845a;
                e11.getMessage();
            }
        }
    }

    static {
        f15860u.add("SM-J200G");
        f15860u.add("SM-J120G");
        f15860u.add("SM-T285");
        v.add("LLD-AL10");
        v.add("vivo 1814");
        ArrayList arrayList = new ArrayList();
        f15861w = arrayList;
        arrayList.add(PDPrintFieldAttributeObject.CHECKED_STATE_OFF);
        arrayList.add(PDPrintFieldAttributeObject.CHECKED_STATE_ON);
        arrayList.add("torch");
        ArrayList arrayList2 = new ArrayList();
        f15862x = arrayList2;
        arrayList2.add(PDPrintFieldAttributeObject.CHECKED_STATE_OFF);
        arrayList2.add("torch");
    }

    public static void F() {
        R();
        V();
    }

    public static Camera.Size G() {
        return h5.c.a(f15846b, h5.b.getmRatioWidth(), h5.b.getmRatioHeight(), h5.b.f14799f.f(), h5.b.f14799f.i());
    }

    public static Camera H() {
        return f15846b;
    }

    public static Camera.CameraInfo I() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(f15847c, cameraInfo);
        return cameraInfo;
    }

    static int J() {
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i11 = 0; i11 < Camera.getNumberOfCameras(); i11++) {
                Camera.getCameraInfo(i11, cameraInfo);
                if (cameraInfo.facing == 1) {
                    return i11;
                }
            }
        } catch (Exception e11) {
            e11.getMessage();
        }
        return 0;
    }

    public static boolean K() {
        return f15859s;
    }

    public static int L() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(f15847c, cameraInfo);
        return cameraInfo.orientation;
    }

    private static Camera.PreviewCallback M() {
        k = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            f15854l[i11] = new byte[(N().width * N().height)];
        }
        return new C0151b();
    }

    public static Camera.Size N() {
        if (!f15853i) {
            return f15846b.getParameters().getPreviewSize();
        }
        return null;
    }

    public static boolean O() {
        try {
            return I().facing == 1;
        } catch (Exception e11) {
            e11.getMessage();
            return false;
        }
    }

    public static boolean P() {
        return f15853i;
    }

    public static void Q() {
        String str;
        try {
            List<String> list = f15864z;
            if (list != null && (str = f15863y) != null) {
                int indexOf = list.indexOf(str);
                String str2 = f15864z.get(indexOf == f15864z.size() + -1 ? 0 : indexOf + 1);
                f15863y = str2;
                o(str2);
            }
        } catch (Exception e11) {
            e11.getMessage();
        }
    }

    public static boolean R() {
        try {
            h5.b.f14799f.z();
        } catch (Exception e11) {
            e11.getMessage();
        } catch (Throwable unused) {
            f15853i = true;
            f15846b = null;
        }
        f15846b.getParameters();
        f15853i = false;
        Camera camera = f15846b;
        if (camera == null) {
            try {
                f15846b = Camera.open(f15847c);
                f15853i = false;
                h5.b.e();
                T();
                List<String> supportedFlashModes = f15846b.getParameters().getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String next : supportedFlashModes) {
                        if (f15861w.contains(next)) {
                            arrayList.add(next);
                        }
                    }
                    f15864z = arrayList;
                } else {
                    f15864z = null;
                }
                f15863y = f15846b.getParameters().getFlashMode();
                c();
                if (a.f()) {
                    f15846b.setFaceDetectionListener(new a());
                    if (f15846b.getParameters().getMaxNumDetectedFaces() > 0 && !f15848d) {
                        try {
                            f15848d = true;
                            f15846b.startFaceDetection();
                        } catch (RuntimeException e12) {
                            e12.getMessage();
                        }
                    }
                }
                Camera.Parameters parameters = f15846b.getParameters();
                f15850f = parameters;
                f15849e = parameters.isZoomSupported();
                f15851g = f15850f.getMaxZoom();
                f15852h = 1.0f;
                h5.b.f14799f.C(f15851g);
                if (a.i()) {
                    for (int i11 = 0; i11 < 5; i11++) {
                        f15855m[i11] = new byte[(((N().width * N().height) * ImageFormat.getBitsPerPixel(17)) / 8)];
                        p(f15855m[i11]);
                    }
                    m(M());
                }
                return true;
            } catch (RuntimeException e13) {
                if (!TextUtils.isEmpty(e13.getMessage())) {
                    e13.getMessage();
                }
                return false;
            }
        } else {
            try {
                Camera.Parameters parameters2 = camera.getParameters();
                f15850f = parameters2;
                f15849e = parameters2.isZoomSupported();
                f15851g = f15850f.getMaxZoom();
                h5.b.f14799f.C(f15851g);
                return false;
            } catch (Throwable unused2) {
                f15853i = true;
                f15846b = null;
                return R();
            }
        }
    }

    public static void S() {
        if (f15846b != null) {
            if (f15848d && a.f()) {
                try {
                    f15848d = false;
                    f15846b.stopFaceDetection();
                } catch (RuntimeException e11) {
                    e11.getMessage();
                }
            }
            f15850f = null;
            try {
                f15846b.setPreviewCallback((Camera.PreviewCallback) null);
            } catch (Exception e12) {
                e12.getMessage();
            }
            try {
                f15846b.stopPreview();
            } catch (Exception e13) {
                e13.getMessage();
            }
            try {
                f15846b.release();
            } catch (Exception e14) {
                e14.getMessage();
            }
            f15846b = null;
            f15853i = true;
        }
    }

    private static void T() {
        Camera.Parameters parameters = f15846b.getParameters();
        Camera.Size e11 = h5.c.e(f15846b, h5.b.getmRatioWidth(), h5.b.getmRatioHeight(), h5.b.f14799f.g());
        parameters.setPreviewSize(e11.width, e11.height);
        Camera.Size a11 = h5.c.a(f15846b, h5.b.getmRatioWidth(), h5.b.getmRatioHeight(), h5.b.f14799f.f(), h5.b.f14799f.i());
        parameters.setPictureSize(a11.width, a11.height);
        h5.b.f14799f.w(a11.width, a11.height);
        h5.c.f14809a = -1;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes.contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
            j = "continuous-picture";
        } else if (supportedFocusModes.contains("auto")) {
            parameters.setFocusMode("auto");
            j = "auto";
        }
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        if (iArr[0] == iArr[1]) {
            Iterator<int[]> it2 = parameters.getSupportedPreviewFpsRange().iterator();
            while (true) {
                if (it2.hasNext()) {
                    int[] next = it2.next();
                    if (next[0] != next[1]) {
                        parameters.setPreviewFpsRange(next[0], next[1]);
                        break;
                    }
                }
            }
        }
        try {
            if (t) {
                parameters.setAntibanding(PDPrintFieldAttributeObject.CHECKED_STATE_OFF);
            }
        } catch (Exception e12) {
            e12.getMessage();
        }
        if (parameters.isAutoExposureLockSupported()) {
            parameters.setAutoExposureLock(false);
        }
        try {
            f15846b.cancelAutoFocus();
            f15846b.setParameters(parameters);
        } catch (Exception e13) {
            e13.getMessage();
        }
    }

    public static void U() {
        Camera camera = f15846b;
        if (camera != null) {
            f15852h = (float) (camera.getParameters().getZoom() + 1);
        }
    }

    public static void V() {
        Camera camera = f15846b;
        if (camera != null) {
            camera.startPreview();
            f15846b.cancelAutoFocus();
        }
    }

    public static void a() {
        S();
        if (f15847c == 0) {
            f15847c = 1;
        } else {
            f15847c = 0;
        }
        R();
        V();
    }

    public static void b() {
        if (f15846b != null) {
            new Handler(Looper.getMainLooper()).post(new e());
        }
    }

    private static void c() {
        new Handler(Looper.getMainLooper()).post(new f());
    }

    private static Rect f(float f11, float f12) {
        if (O()) {
            f11 = 1.0f - f11;
        }
        int i11 = ((int) ((f11 - 0.5f) * 2000.0f)) - 100;
        int i12 = i11 + OS2WindowsMetricsTable.WEIGHT_CLASS_ULTRA_LIGHT;
        int i13 = ((int) ((f12 - 0.5f) * 2000.0f)) - 100;
        int i14 = i13 + OS2WindowsMetricsTable.WEIGHT_CLASS_ULTRA_LIGHT;
        int r11 = r(i11);
        int r12 = r(i12);
        int r13 = r(i13);
        int r14 = r(i14);
        A.reset();
        A.postRotate(90.0f);
        Matrix matrix = A;
        matrix.invert(matrix);
        RectF rectF = new RectF((float) r11, (float) r13, (float) r12, (float) r14);
        A.mapRect(rectF);
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004b A[Catch:{ Exception -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0049 A[Catch:{ Exception -> 0x0058 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(double r8) {
        /*
            android.hardware.Camera r0 = f15846b     // Catch:{ Exception -> 0x0058 }
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ Exception -> 0x0058 }
            float r1 = r0.getExposureCompensationStep()     // Catch:{ Exception -> 0x0058 }
            int r2 = r0.getExposureCompensation()     // Catch:{ Exception -> 0x0058 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x0058 }
            int r3 = r0.getMaxExposureCompensation()     // Catch:{ Exception -> 0x0058 }
            int r4 = r0.getMinExposureCompensation()     // Catch:{ Exception -> 0x0058 }
            float r5 = r2 * r1
            float r8 = (float) r8     // Catch:{ Exception -> 0x0058 }
            float r5 = r5 + r8
            float r5 = r5 / r1
            double r8 = (double) r5     // Catch:{ Exception -> 0x0058 }
            double r8 = java.lang.Math.ceil(r8)     // Catch:{ Exception -> 0x0058 }
            int r8 = (int) r8     // Catch:{ Exception -> 0x0058 }
            float r9 = (float) r8     // Catch:{ Exception -> 0x0058 }
            float r1 = r9 - r2
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0037
            int r8 = java.lang.Math.round(r2)     // Catch:{ Exception -> 0x0058 }
            float r1 = r1 / r5
            int r9 = java.lang.Math.round(r1)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0046
        L_0x0037:
            float r9 = r2 - r9
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0047
            int r8 = java.lang.Math.round(r2)     // Catch:{ Exception -> 0x0058 }
            float r1 = r1 / r5
            int r9 = java.lang.Math.round(r1)     // Catch:{ Exception -> 0x0058 }
        L_0x0046:
            int r8 = r8 + r9
        L_0x0047:
            if (r8 >= r4) goto L_0x004b
            r3 = r4
            goto L_0x004f
        L_0x004b:
            if (r8 <= r3) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r3 = r8
        L_0x004f:
            r0.setExposureCompensation(r3)     // Catch:{ Exception -> 0x0058 }
            android.hardware.Camera r8 = f15846b     // Catch:{ Exception -> 0x0058 }
            r8.setParameters(r0)     // Catch:{ Exception -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r8 = move-exception
            r8.getMessage()
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.b.g(double):void");
    }

    public static void h(float f11) {
        if (f15849e) {
            x((int) f11);
        }
    }

    public static void i(float f11, float f12, Camera.AutoFocusCallback autoFocusCallback) {
        if (f15846b != null) {
            Rect f13 = f(f11, f12);
            Camera.Parameters parameters = null;
            try {
                f15846b.cancelAutoFocus();
                parameters = f15846b.getParameters();
            } catch (Exception e11) {
                e11.getMessage();
            }
            if (parameters != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Camera.Area(f13, 1000));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new Camera.Area(f13, OS2WindowsMetricsTable.WEIGHT_CLASS_NORMAL));
                if (parameters.getMaxNumFocusAreas() > 0) {
                    parameters.setFocusMode("auto");
                    parameters.setFocusAreas(arrayList);
                }
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    parameters.setMeteringAreas(arrayList2);
                }
                try {
                    f15846b.setParameters(parameters);
                    f15846b.autoFocus(autoFocusCallback);
                } catch (Exception e12) {
                    e12.getMessage();
                }
            }
        }
    }

    public static void j(Point point) {
        int i11 = point.x;
    }

    public static void k(SurfaceTexture surfaceTexture) {
        try {
            f15846b.setPreviewTexture(surfaceTexture);
            f15846b.startPreview();
            v(0);
        } catch (Exception e11) {
            e11.getMessage();
        }
    }

    public static void l(Camera.AutoFocusCallback autoFocusCallback) {
        Camera.Parameters parameters;
        try {
            Camera camera = f15846b;
            if (camera != null) {
                try {
                    camera.cancelAutoFocus();
                    parameters = f15846b.getParameters();
                } catch (Throwable th2) {
                    th2.getMessage();
                    parameters = null;
                }
                if (parameters != null) {
                    if (parameters.getMaxNumMeteringAreas() > 0) {
                        parameters.setMeteringAreas((List) null);
                    }
                    if (parameters.getMaxNumFocusAreas() > 0) {
                        parameters.setFocusAreas((List) null);
                    }
                    String str = j;
                    if (str != null) {
                        parameters.setFocusMode(str);
                    }
                    try {
                        f15846b.cancelAutoFocus();
                        f15846b.setParameters(parameters);
                    } catch (Exception e11) {
                        e11.getMessage();
                    }
                }
            }
        } catch (Exception e12) {
            e12.getMessage();
        }
    }

    public static void m(Camera.PreviewCallback previewCallback) {
        f15846b.setPreviewCallbackWithBuffer(previewCallback);
    }

    public static void n(Camera.ShutterCallback shutterCallback, Camera.PictureCallback pictureCallback, Camera.PictureCallback pictureCallback2) {
        try {
            Camera.Parameters parameters = f15846b.getParameters();
            f15856o = shutterCallback;
            f15857p = pictureCallback2;
            if (parameters.getMaxNumFocusAreas() <= 0 || f15847c != 0) {
                b();
                return;
            }
            f15846b.cancelAutoFocus();
            ScheduledFuture<?> schedule = f15858r.schedule(new c(), 1000, TimeUnit.MILLISECONDS);
            if (!v.contains(Build.MODEL)) {
                f15846b.autoFocus(new d(schedule));
            }
        } catch (Exception unused) {
            b();
        }
    }

    public static void o(String str) {
        try {
            f15863y = str;
            Camera.Parameters parameters = f15846b.getParameters();
            parameters.setFlashMode(str);
            f15846b.setParameters(parameters);
            c();
        } catch (Exception e11) {
            e11.getMessage();
        }
    }

    public static void p(byte[] bArr) {
        f15846b.addCallbackBuffer(bArr);
    }

    static /* synthetic */ boolean q(boolean z11) {
        return z11;
    }

    private static int r(int i11) {
        if (i11 > 1000) {
            return 1000;
        }
        return i11 < -1000 ? HarvestErrorCodes.NSURLErrorBadURL : i11;
    }

    public static void t(boolean z11) {
        f15858r = Executors.newScheduledThreadPool(1);
        if (z11) {
            f15847c = J();
        } else {
            f15847c = 0;
        }
    }

    public static void v(int i11) {
        n = i11 % 360;
        try {
            Camera camera = f15846b;
            if (camera != null && !f15853i) {
                h5.c.b(f15847c, camera, i11 % 360);
            }
        } catch (Exception e11) {
            e11.getMessage();
        }
    }

    public static void w(boolean z11) {
        f15859s = z11;
    }

    private static void x(int i11) {
        Camera camera;
        if (f15849e && (camera = f15846b) != null) {
            float f11 = (float) i11;
            try {
                f15852h = f11;
                if (f11 <= ((float) f15851g)) {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setZoom((int) f15852h);
                    f15846b.setParameters(parameters);
                }
            } catch (Exception e11) {
                e11.getMessage();
            }
        }
    }

    public static void y(boolean z11) {
        t = z11;
    }
}
