package n5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.WindowManager;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class c {
    /* access modifiers changed from: private */
    public static ImageReader A = null;
    /* access modifiers changed from: private */
    public static CameraCaptureSession B = null;
    /* access modifiers changed from: private */
    public static CaptureRequest C = null;
    /* access modifiers changed from: private */
    public static Surface D = null;
    /* access modifiers changed from: private */
    public static int E = 0;
    private static HandlerThread F = null;
    /* access modifiers changed from: private */
    public static List<Integer> G = null;
    private static boolean H = false;
    /* access modifiers changed from: private */
    public static int I = 0;
    /* access modifiers changed from: private */
    public static int J = 0;
    /* access modifiers changed from: private */
    public static byte[][] K = new byte[5][];
    /* access modifiers changed from: private */
    public static boolean L = false;
    /* access modifiers changed from: private */
    public static CameraCaptureSession.CaptureCallback M = new b();
    private static CameraCaptureSession.CaptureCallback N = new C0152c();
    private static final SparseIntArray O;
    private static final List<Integer> P;
    private static final List<Integer> Q;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f15866a = "co.hyperverge.hvcamera.magicfilter.camera.b";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f15867b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String f15868c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Context f15869d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f15870e = false;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static int f15871f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static int f15872g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static float f15873h = -1.0f;

    /* renamed from: i  reason: collision with root package name */
    private static Rect f15874i;
    /* access modifiers changed from: private */
    public static i j;
    private static CameraManager k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static Semaphore f15875l = new Semaphore(1);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static CameraDevice f15876m;
    /* access modifiers changed from: private */
    public static int n = -1;

    /* renamed from: o  reason: collision with root package name */
    private static boolean f15877o = false;

    /* renamed from: p  reason: collision with root package name */
    private static final CameraDevice.StateCallback f15878p = new a();
    /* access modifiers changed from: private */
    public static float[] q = {-1.0f, -1.0f};
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static int f15879r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static Size f15880s;
    private static Size t;

    /* renamed from: u  reason: collision with root package name */
    private static boolean f15881u = false;
    private static float v;

    /* renamed from: w  reason: collision with root package name */
    private static float f15882w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public static Handler f15883x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public static CaptureRequest.Builder f15884y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static ImageReader f15885z;

    static class a extends CameraDevice.StateCallback {
        a() {
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            c.f15875l.release();
            cameraDevice.close();
            CameraDevice unused = c.f15876m = null;
        }

        public void onError(CameraDevice cameraDevice, int i11) {
            c.f15875l.release();
            cameraDevice.close();
            CameraDevice unused = c.f15876m = null;
        }

        public void onOpened(CameraDevice cameraDevice) {
            c.f15875l.release();
            CameraDevice unused = c.f15876m = cameraDevice;
        }
    }

    static class b extends CameraCaptureSession.CaptureCallback {
        b() {
        }

        private void a(CaptureResult captureResult) {
            int k02 = c.f15879r;
            if (k02 == 0) {
                try {
                    float unused = c.f15873h = (float) ((Integer) captureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue();
                } catch (Exception e11) {
                    String unused2 = c.f15866a;
                    e11.getMessage();
                }
                try {
                    int intValue = ((Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE)).intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue != 4) {
                                        boolean unused3 = c.L = false;
                                        return;
                                    }
                                }
                            }
                            if (!c.L) {
                                h5.b.f14799f.B(c.q[0], c.q[1], true);
                            }
                            boolean unused4 = c.L = true;
                            return;
                        }
                        h5.b.f14799f.B(c.q[0], c.q[1], false);
                        boolean unused5 = c.L = false;
                        return;
                    }
                    boolean unused6 = c.L = false;
                } catch (Exception unused7) {
                }
            } else if (k02 == 1) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    int unused8 = c.f15879r = 4;
                    c.c();
                } else if (4 == num.intValue() || 5 == num.intValue()) {
                    if (4 == num.intValue()) {
                        h5.b.f14799f.B(c.q[0], c.q[1], true);
                    } else {
                        h5.b.f14799f.B(c.q[0], c.q[1], false);
                    }
                    boolean unused9 = c.L = false;
                    Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num2 == null || num2.intValue() == 2) {
                        int unused10 = c.f15879r = 4;
                        c.c();
                        return;
                    }
                    c.n();
                } else if (num.intValue() == 3 || num.intValue() == 1) {
                    h5.b.f14799f.B(c.q[0], c.q[1], false);
                } else {
                    int unused11 = c.f15879r = 4;
                    h5.b.f14799f.B(c.q[0], c.q[1], true);
                    c.c();
                }
            } else if (k02 == 2) {
                Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num3 == null || num3.intValue() == 5 || num3.intValue() == 4 || num3.intValue() == 2) {
                    int unused12 = c.f15879r = 3;
                }
            } else if (k02 == 3) {
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num4 == null || num4.intValue() != 5) {
                    int unused13 = c.f15879r = 4;
                    c.c();
                }
            }
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            a(totalCaptureResult);
            try {
                h5.b.f14799f.x();
            } catch (Exception e11) {
                String unused = c.f15866a;
                e11.getMessage();
            }
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            a(captureResult);
        }
    }

    /* renamed from: n5.c$c  reason: collision with other inner class name */
    static class C0152c extends CameraCaptureSession.CaptureCallback {
        C0152c() {
        }

        private void a(CaptureResult captureResult) {
            int unused = c.f15879r = 1;
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            a(totalCaptureResult);
        }
    }

    static class d implements ImageReader.OnImageAvailableListener {
        d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00f5 A[Catch:{ IllegalArgumentException -> 0x011a }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onImageAvailable(android.media.ImageReader r12) {
            /*
                r11 = this;
                android.media.Image r12 = r12.acquireLatestImage()     // Catch:{ Exception -> 0x0122 }
                int r0 = n5.c.f15871f     // Catch:{ Exception -> 0x0122 }
                int r0 = r0 + 45
                r1 = 90
                int r0 = r0 / r1
                int r0 = r0 * 90
                int r0 = r0 % 360
                int r2 = n5.c.E     // Catch:{ Exception -> 0x0122 }
                r3 = 270(0x10e, float:3.78E-43)
                int r2 = r2 - r3
                int r0 = r0 + r2
                boolean r2 = n5.a.g()     // Catch:{ Exception -> 0x0122 }
                if (r2 == 0) goto L_0x003c
                java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0122 }
                java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x0122 }
                java.lang.String r4 = "rk3399-all"
                boolean r2 = r2.contains(r4)     // Catch:{ Exception -> 0x0122 }
                if (r2 == 0) goto L_0x0035
                int r2 = 90 - r0
                int r2 = r2 + 360
                int r2 = r2 % 360
            L_0x0033:
                r9 = r2
                goto L_0x0056
            L_0x0035:
                int r2 = 270 - r0
                int r2 = r2 + 360
                int r2 = r2 % 360
                goto L_0x0033
            L_0x003c:
                java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0122 }
                java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x0122 }
                java.lang.String r4 = "comio x1"
                boolean r2 = r2.contains(r4)     // Catch:{ Exception -> 0x0122 }
                if (r2 == 0) goto L_0x004f
                int r2 = r0 + 90
                int r2 = r2 % 360
                goto L_0x0033
            L_0x004f:
                int r2 = 270 - r0
                int r2 = r2 + 360
                int r2 = r2 % 360
                goto L_0x0033
            L_0x0056:
                java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0122 }
                r2.<init>()     // Catch:{ Exception -> 0x0122 }
                android.media.Image$Plane[] r4 = r12.getPlanes()     // Catch:{ Exception -> 0x0122 }
                r5 = 0
                r4 = r4[r5]     // Catch:{ Exception -> 0x0122 }
                java.nio.ByteBuffer r4 = r4.getBuffer()     // Catch:{ Exception -> 0x0122 }
                int r5 = r4.remaining()     // Catch:{ Exception -> 0x0122 }
                byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0122 }
                r4.get(r5)     // Catch:{ Exception -> 0x0122 }
                android.media.Image$Plane[] r4 = r12.getPlanes()     // Catch:{ Exception -> 0x0122 }
                r6 = 1
                r4 = r4[r6]     // Catch:{ Exception -> 0x0122 }
                java.nio.ByteBuffer r4 = r4.getBuffer()     // Catch:{ Exception -> 0x0122 }
                int r7 = r4.remaining()     // Catch:{ Exception -> 0x0122 }
                byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x0122 }
                r4.get(r7)     // Catch:{ Exception -> 0x0122 }
                android.media.Image$Plane[] r4 = r12.getPlanes()     // Catch:{ Exception -> 0x0122 }
                r8 = 2
                r4 = r4[r8]     // Catch:{ Exception -> 0x0122 }
                java.nio.ByteBuffer r4 = r4.getBuffer()     // Catch:{ Exception -> 0x0122 }
                int r8 = r4.remaining()     // Catch:{ Exception -> 0x0122 }
                byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x0122 }
                r4.get(r8)     // Catch:{ Exception -> 0x0122 }
                r2.write(r5)     // Catch:{ Exception -> 0x0122 }
                r2.write(r8)     // Catch:{ Exception -> 0x0122 }
                r2.write(r7)     // Catch:{ Exception -> 0x0122 }
                r12.close()     // Catch:{ Exception -> 0x0122 }
                java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0122 }
                int r12 = n5.c.I     // Catch:{ Exception -> 0x0122 }
                int r12 = r12 + r6
                int r12 = r12 % 3
                int unused = n5.c.I = r12     // Catch:{ Exception -> 0x0122 }
                android.util.Size r12 = n5.c.h()     // Catch:{ Exception -> 0x0122 }
                int r12 = r12.getWidth()     // Catch:{ Exception -> 0x0122 }
                android.util.Size r4 = n5.c.h()     // Catch:{ Exception -> 0x0122 }
                int r4 = r4.getHeight()     // Catch:{ Exception -> 0x0122 }
                if (r9 == r1) goto L_0x00c7
                if (r9 != r3) goto L_0x00c5
                goto L_0x00c7
            L_0x00c5:
                r7 = r4
                goto L_0x00d8
            L_0x00c7:
                android.util.Size r12 = n5.c.h()     // Catch:{ Exception -> 0x0122 }
                int r12 = r12.getHeight()     // Catch:{ Exception -> 0x0122 }
                android.util.Size r1 = n5.c.h()     // Catch:{ Exception -> 0x0122 }
                int r1 = r1.getWidth()     // Catch:{ Exception -> 0x0122 }
                r7 = r1
            L_0x00d8:
                int r1 = n5.c.J     // Catch:{ IllegalArgumentException -> 0x011a }
                int r1 = r1 + r6
                int r1 = r1 % 5
                int unused = n5.c.J = r1     // Catch:{ IllegalArgumentException -> 0x011a }
                byte[][] r1 = n5.c.K     // Catch:{ IllegalArgumentException -> 0x011a }
                int r4 = n5.c.J     // Catch:{ IllegalArgumentException -> 0x011a }
                r1 = r1[r4]     // Catch:{ IllegalArgumentException -> 0x011a }
                n5.a.k(r5, r7, r12, r9, r1)     // Catch:{ IllegalArgumentException -> 0x011a }
                n5.c$i r1 = n5.c.j     // Catch:{ IllegalArgumentException -> 0x011a }
                if (r1 == 0) goto L_0x0129
                n5.c$i r4 = n5.c.j     // Catch:{ IllegalArgumentException -> 0x011a }
                byte[][] r1 = n5.c.K     // Catch:{ IllegalArgumentException -> 0x011a }
                int r5 = n5.c.J     // Catch:{ IllegalArgumentException -> 0x011a }
                r5 = r1[r5]     // Catch:{ IllegalArgumentException -> 0x011a }
                int r0 = r0 + 360
                int r1 = n5.c.E     // Catch:{ IllegalArgumentException -> 0x011a }
                int r1 = r1 - r3
                int r0 = r0 + r1
                int r8 = r0 % 360
                byte[] r0 = r2.toByteArray()     // Catch:{ IllegalArgumentException -> 0x011a }
                byte[] r10 = o5.c.a(r0, r7, r12, r9)     // Catch:{ IllegalArgumentException -> 0x011a }
                r6 = r12
                r4.a(r5, r6, r7, r8, r9, r10)     // Catch:{ IllegalArgumentException -> 0x011a }
                goto L_0x0129
            L_0x011a:
                r12 = move-exception
                java.lang.String unused = n5.c.f15866a     // Catch:{ Exception -> 0x0122 }
                r12.getMessage()     // Catch:{ Exception -> 0x0122 }
                goto L_0x0129
            L_0x0122:
                r12 = move-exception
                java.lang.String unused = n5.c.f15866a
                r12.getMessage()
            L_0x0129:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.c.d.onImageAvailable(android.media.ImageReader):void");
        }
    }

    static class e implements ImageReader.OnImageAvailableListener {
        e() {
        }

        public void onImageAvailable(ImageReader imageReader) {
            try {
                Image acquireLatestImage = imageReader.acquireLatestImage();
                ByteBuffer buffer = acquireLatestImage.getPlanes()[0].getBuffer();
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                if (c.j != null) {
                    c.j.b(bArr);
                }
                acquireLatestImage.close();
            } catch (Exception e11) {
                String unused = c.f15866a;
                e11.getMessage();
            }
        }
    }

    static class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f15886a;

        class a extends CameraCaptureSession.StateCallback {
            a(f fVar) {
            }

            public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            }

            public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                if (c.f15876m != null) {
                    CameraCaptureSession unused = c.B = cameraCaptureSession;
                    try {
                        c.f15884y.set(CaptureRequest.CONTROL_AF_MODE, 4);
                        c.f15884y.set(CaptureRequest.CONTROL_MODE, 1);
                        if (a.f()) {
                            c.f15884y.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
                        }
                        if (c.n == 1) {
                            c.f15884y.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                            c.f15884y.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                        } else {
                            c.f15884y.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                            c.f15884y.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                        }
                        c.V(c.f15884y);
                        CaptureRequest unused2 = c.C = c.f15884y.build();
                        c.B.setRepeatingRequest(c.C, c.M, c.f15883x);
                    } catch (CameraAccessException e11) {
                        String unused3 = c.f15866a;
                        e11.getMessage();
                    }
                }
            }
        }

        f(SurfaceTexture surfaceTexture) {
            this.f15886a = surfaceTexture;
        }

        public void run() {
            List list;
            if (c.f15876m != null) {
                try {
                    if (this.f15886a != null) {
                        Surface unused = c.D = new Surface(this.f15886a);
                        this.f15886a.setDefaultBufferSize(c.f15880s.getWidth(), c.f15880s.getHeight());
                        CaptureRequest.Builder unused2 = c.f15884y = c.f15876m.createCaptureRequest(1);
                        c.f15884y.addTarget(c.D);
                        if (a.i()) {
                            c.f15884y.addTarget(c.A.getSurface());
                        }
                        int unused3 = c.f15879r = 0;
                        if (a.i()) {
                            list = Arrays.asList(new Surface[]{c.D, c.f15885z.getSurface(), c.A.getSurface()});
                        } else {
                            list = Arrays.asList(new Surface[]{c.D, c.f15885z.getSurface()});
                        }
                        c.f15876m.createCaptureSession(list, new a(this), (Handler) null);
                    }
                } catch (CameraAccessException e11) {
                    String unused4 = c.f15866a;
                    e11.getMessage();
                } catch (IllegalStateException e12) {
                    String unused5 = c.f15866a;
                    e12.getMessage();
                } catch (Exception e13) {
                    String unused6 = c.f15866a;
                    e13.getMessage();
                }
            }
        }
    }

    static class g extends CameraCaptureSession.CaptureCallback {
        g() {
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            c.s();
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j11) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j11);
            h5.b.f14799f.a();
        }
    }

    static class h implements Runnable {
        h() {
        }

        public void run() {
            if (c.f15872g <= 0 || (c.G != null && c.G.size() == 1 && ((Integer) c.G.get(0)).intValue() == 1)) {
                h5.b.f14799f.n();
                return;
            }
            try {
                int r02 = c.f15872g;
                if (r02 == 1) {
                    h5.b.f14799f.o();
                } else if (r02 == 2) {
                    h5.b.f14799f.m();
                } else if (r02 == 3) {
                    h5.b.f14799f.p();
                }
            } catch (Exception e11) {
                String unused = c.f15866a;
                e11.getMessage();
            }
        }
    }

    public interface i {
        void a(byte[] bArr, int i11, int i12, int i13, int i14, byte[] bArr2);

        void b(byte[] bArr);
    }

    static {
        new Matrix();
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
        ArrayList arrayList = new ArrayList();
        P = arrayList;
        arrayList.add(3);
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        Q = arrayList2;
        arrayList2.add(3);
        arrayList2.add(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0066 A[Catch:{ Exception -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0064 A[Catch:{ Exception -> 0x0087 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void D(double r7) {
        /*
            android.hardware.camera2.CameraManager r0 = k     // Catch:{ Exception -> 0x0087 }
            java.lang.String r1 = f15868c     // Catch:{ Exception -> 0x0087 }
            android.hardware.camera2.CameraCharacteristics r0 = r0.getCameraCharacteristics(r1)     // Catch:{ Exception -> 0x0087 }
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE     // Catch:{ Exception -> 0x0087 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x0087 }
            android.util.Range r1 = (android.util.Range) r1     // Catch:{ Exception -> 0x0087 }
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP     // Catch:{ Exception -> 0x0087 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0087 }
            android.util.Rational r0 = (android.util.Rational) r0     // Catch:{ Exception -> 0x0087 }
            float r0 = r0.floatValue()     // Catch:{ Exception -> 0x0087 }
            float r2 = f15873h     // Catch:{ Exception -> 0x0087 }
            java.lang.Comparable r3 = r1.getUpper()     // Catch:{ Exception -> 0x0087 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0087 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0087 }
            java.lang.Comparable r1 = r1.getLower()     // Catch:{ Exception -> 0x0087 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0087 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0087 }
            float r4 = r2 * r0
            float r7 = (float) r7     // Catch:{ Exception -> 0x0087 }
            float r4 = r4 + r7
            float r4 = r4 / r0
            double r7 = (double) r4     // Catch:{ Exception -> 0x0087 }
            double r7 = java.lang.Math.ceil(r7)     // Catch:{ Exception -> 0x0087 }
            int r7 = (int) r7     // Catch:{ Exception -> 0x0087 }
            float r8 = (float) r7     // Catch:{ Exception -> 0x0087 }
            float r0 = r8 - r2
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0052
            int r7 = java.lang.Math.round(r2)     // Catch:{ Exception -> 0x0087 }
            float r0 = r0 / r4
            int r8 = java.lang.Math.round(r0)     // Catch:{ Exception -> 0x0087 }
            goto L_0x0061
        L_0x0052:
            float r8 = r2 - r8
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0062
            int r7 = java.lang.Math.round(r2)     // Catch:{ Exception -> 0x0087 }
            float r0 = r0 / r4
            int r8 = java.lang.Math.round(r0)     // Catch:{ Exception -> 0x0087 }
        L_0x0061:
            int r7 = r7 + r8
        L_0x0062:
            if (r7 >= r1) goto L_0x0066
            r3 = r1
            goto L_0x006a
        L_0x0066:
            if (r7 <= r3) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r3 = r7
        L_0x006a:
            android.hardware.camera2.CameraDevice r7 = f15876m     // Catch:{ Exception -> 0x0087 }
            r8 = 2
            android.hardware.camera2.CaptureRequest$Builder r7 = r7.createCaptureRequest(r8)     // Catch:{ Exception -> 0x0087 }
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION     // Catch:{ Exception -> 0x0087 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0087 }
            r7.set(r8, r0)     // Catch:{ Exception -> 0x0087 }
            android.hardware.camera2.CameraCaptureSession r8 = B     // Catch:{ Exception -> 0x0087 }
            android.hardware.camera2.CaptureRequest r7 = r7.build()     // Catch:{ Exception -> 0x0087 }
            r0 = 0
            android.os.Handler r1 = f15883x     // Catch:{ Exception -> 0x0087 }
            r8.capture(r7, r0, r1)     // Catch:{ Exception -> 0x0087 }
            return
        L_0x0087:
            r7 = move-exception
            r7.getMessage()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.c.D(double):void");
    }

    public static void E(float f11, float f12, Camera.AutoFocusCallback autoFocusCallback) {
        if (f15868c != null) {
            b();
            float[] fArr = q;
            fArr[0] = f11;
            fArr[1] = f12;
            if (f15870e) {
                f11 = 1.0f - f11;
            }
            MeteringRectangle[] f13 = o5.b.f(f11, f12, f15874i, E);
            MeteringRectangle[] e11 = o5.b.e(f11, f12, f15874i, E);
            try {
                CameraCharacteristics cameraCharacteristics = k.getCameraCharacteristics(f15868c);
                if (((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) {
                    f15884y.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    f15884y.set(CaptureRequest.CONTROL_AF_REGIONS, f13);
                }
                if (((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) {
                    f15884y.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    f15884y.set(CaptureRequest.CONTROL_AE_REGIONS, e11);
                }
                f15884y.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                if (Build.VERSION.SDK_INT >= 23) {
                    f15884y.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
                }
                B.capture(f15884y.build(), M, f15883x);
                f15884y.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                f15884y.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                B.capture(f15884y.build(), M, f15883x);
                f15884y.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                f15884y.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                B.setRepeatingRequest(f15884y.build(), M, f15883x);
            } catch (Exception e12) {
                e12.getMessage();
            }
        }
    }

    public static void F(Context context) {
        f15869d = context;
    }

    public static void G(Context context, boolean z11) {
        F(context);
        f15877o = false;
        k = (CameraManager) f15869d.getSystemService("camera");
        f15870e = z11;
        f15872g = 1;
    }

    public static void H(Point point) {
        int i11 = point.x;
    }

    public static void I(SurfaceTexture surfaceTexture) {
        f15883x.post(new f(surfaceTexture));
    }

    public static void J(Object obj) {
        try {
            float[] fArr = q;
            fArr[0] = -1.0f;
            fArr[1] = -1.0f;
            CameraCharacteristics cameraCharacteristics = k.getCameraCharacteristics(f15868c);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) {
                f15884y.set(CaptureRequest.CONTROL_AF_REGIONS, (Object) null);
            }
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) {
                f15884y.set(CaptureRequest.CONTROL_AE_REGIONS, (Object) null);
            }
            f15884y.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            B.capture(f15884y.build(), M, f15883x);
            f15884y.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            f15884y.set(CaptureRequest.CONTROL_AF_MODE, 4);
            CaptureRequest build = f15884y.build();
            C = build;
            B.setRepeatingRequest(build, M, f15883x);
        } catch (Exception e11) {
            e11.getMessage();
        }
    }

    public static void K(i iVar) {
        j = iVar;
    }

    private static void L(int[] iArr) {
        if (iArr != null) {
            ArrayList arrayList = new ArrayList();
            for (int valueOf : iArr) {
                Integer valueOf2 = Integer.valueOf(valueOf);
                if (f15867b) {
                    if (P.contains(valueOf2)) {
                        arrayList.add(valueOf2);
                    }
                } else if (Q.contains(valueOf2)) {
                    arrayList.add(valueOf2);
                }
            }
            G = arrayList;
            if (arrayList.size() > 0) {
                f15872g = G.get(0).intValue();
            } else {
                f15872g = -1;
            }
        } else {
            G = null;
            f15872g = -1;
        }
    }

    public static Rect O(float f11) {
        try {
            return o5.b.c(k.getCameraCharacteristics(f15868c), f11, v);
        } catch (CameraAccessException e11) {
            e11.getMessage();
            return new Rect(0, 0, 0, 0);
        }
    }

    public static void R(boolean z11) {
        f15867b = z11;
    }

    public static void U(float f11) {
        if (f15881u) {
            Z(f11);
        }
    }

    /* access modifiers changed from: private */
    public static void V(CaptureRequest.Builder builder) {
        List<Integer> list = G;
        if (list != null && list.contains(Integer.valueOf(f15872g))) {
            try {
                int i11 = f15872g;
                if (i11 == 1) {
                    builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    builder.set(CaptureRequest.FLASH_MODE, 0);
                } else if (i11 == 2) {
                    builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    } else {
                        builder.set(CaptureRequest.FLASH_MODE, 4);
                    }
                } else if (f15867b) {
                    builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    builder.set(CaptureRequest.FLASH_MODE, 2);
                } else {
                    builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    builder.set(CaptureRequest.FLASH_MODE, 2);
                }
            } catch (Exception e11) {
                e11.getMessage();
            }
        }
    }

    public static void W(boolean z11) {
        H = z11;
    }

    private static String Y(int i11) {
        try {
            for (String str : k.getCameraIdList()) {
                Integer num = (Integer) k.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == i11) {
                    return str;
                }
            }
            return null;
        } catch (Exception e11) {
            e11.getMessage();
            return null;
        }
    }

    private static void Z(float f11) {
        if (f15881u && f15868c != null && f11 > 0.0f) {
            try {
                float f12 = v;
                if (f11 <= f12) {
                    f15882w = f11;
                    if (f11 <= f12) {
                        f15874i = O(f11);
                        f15884y.set(CaptureRequest.SCALER_CROP_REGION, O(f15882w));
                        CaptureRequest build = f15884y.build();
                        C = build;
                        try {
                            B.setRepeatingRequest(build, M, f15883x);
                        } catch (CameraAccessException e11) {
                            e11.getMessage();
                        }
                    }
                }
            } catch (Exception e12) {
                e12.getMessage();
            }
        }
    }

    private static void b() {
    }

    public static void b0(int i11) {
        f15872g = i11;
        V(f15884y);
        CaptureRequest build = f15884y.build();
        C = build;
        try {
            B.setRepeatingRequest(build, M, f15883x);
        } catch (Exception e11) {
            e11.getMessage();
        }
        t();
    }

    /* access modifiers changed from: private */
    public static void c() {
        try {
            if (f15869d != null) {
                CameraDevice cameraDevice = f15876m;
                if (cameraDevice != null) {
                    CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(2);
                    createCaptureRequest.addTarget(f15885z.getSurface());
                    createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
                    createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    if (f15884y.get(CaptureRequest.CONTROL_AE_REGIONS) != null) {
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_REGIONS;
                        createCaptureRequest.set(key, f15884y.get(key));
                    }
                    if (f15884y.get(CaptureRequest.CONTROL_AF_REGIONS) != null) {
                        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_REGIONS;
                        createCaptureRequest.set(key2, f15884y.get(key2));
                    }
                    if (a.f()) {
                        createCaptureRequest.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
                    }
                    try {
                        if (H) {
                            createCaptureRequest.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, 0);
                        }
                    } catch (Exception e11) {
                        e11.getMessage();
                    }
                    V(createCaptureRequest);
                    CameraCharacteristics cameraCharacteristics = k.getCameraCharacteristics(f15868c);
                    if (f15874i != null) {
                        createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, f15874i);
                    }
                    createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(w(cameraCharacteristics, f15871f)));
                    g gVar = new g();
                    B.stopRepeating();
                    B.capture(createCaptureRequest.build(), gVar, (Handler) null);
                }
            }
        } catch (Exception e12) {
            e12.getMessage();
        }
    }

    public static void c0(int i11) {
        f15871f = i11 % 360;
    }

    public static void d() {
        try {
            if (f15879r != 0) {
                c();
            }
            f15875l.acquire();
            CameraCaptureSession cameraCaptureSession = B;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                B = null;
            }
            CameraDevice cameraDevice = f15876m;
            if (cameraDevice != null) {
                cameraDevice.close();
                f15876m = null;
            }
            ImageReader imageReader = f15885z;
            if (imageReader != null) {
                imageReader.close();
                f15885z = null;
            }
            ImageReader imageReader2 = A;
            if (imageReader2 != null) {
                imageReader2.close();
                A = null;
            }
            p();
            f15875l.release();
            f15877o = true;
        } catch (InterruptedException e11) {
            throw new RuntimeException("Interrupted while trying to lock camera closing.", e11);
        } catch (Throwable th2) {
            f15875l.release();
            f15877o = true;
            throw th2;
        }
    }

    public static Size e() {
        return t;
    }

    public static boolean f() {
        return f15867b;
    }

    public static int g() {
        ((WindowManager) f15869d.getSystemService("window")).getDefaultDisplay().getRotation();
        return (!Build.MODEL.toLowerCase().contains("comio x1") || f15870e) ? 180 : 0;
    }

    public static Size h() {
        return f15880s;
    }

    public static boolean i() {
        return f15870e;
    }

    public static boolean j() {
        return f15877o;
    }

    private static void k() {
        try {
            f15884y.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            f15879r = 1;
            B.capture(f15884y.build(), N, f15883x);
            h5.a aVar = h5.b.f14799f;
            float[] fArr = q;
            aVar.B(fArr[0], fArr[1], false);
        } catch (Exception e11) {
            e11.getMessage();
        }
    }

    public static void l() {
        List<Integer> list = G;
        if (list != null && list.contains(Integer.valueOf(f15872g))) {
            int indexOf = G.indexOf(Integer.valueOf(f15872g));
            int intValue = G.get(indexOf == G.size() + -1 ? 0 : indexOf + 1).intValue();
            f15872g = intValue;
            b0(intValue);
        }
    }

    @SuppressLint({"MissingPermission"})
    public static void m() {
        if (f15870e) {
            f15868c = Y(0);
        }
        if (f15868c == null || !f15870e) {
            f15868c = Y(1);
        }
        o();
        try {
            if (f15875l.tryAcquire(2500, TimeUnit.MILLISECONDS)) {
                k.openCamera(f15868c, f15878p, f15883x);
                CameraCharacteristics cameraCharacteristics = k.getCameraCharacteristics(f15868c);
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                h5.b.e();
                L((int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES));
                float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
                v = floatValue;
                if (floatValue > 1.0f) {
                    f15881u = true;
                }
                f15882w = 1.0f;
                f15874i = O(1.0f);
                t();
                float[] fArr = q;
                fArr[0] = -1.0f;
                fArr[1] = -1.0f;
                int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
                if (iArr != null) {
                    n = -1;
                    int length = iArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        } else if (iArr[i11] == 1) {
                            n = 1;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
                h5.b.f14799f.b();
                f15880s = o5.d.a(streamConfigurationMap, h5.b.getmRatioWidth(), h5.b.getmRatioHeight(), h5.b.f14799f.g());
                t = o5.d.b(streamConfigurationMap, h5.b.getmRatioWidth(), h5.b.getmRatioHeight(), h5.b.f14799f.f(), h5.b.f14799f.i());
                h5.b.f14799f.w(t.getWidth(), t.getHeight());
                f15885z = ImageReader.newInstance(t.getWidth(), t.getHeight(), 256, 2);
                if (a.i()) {
                    A = ImageReader.newInstance(f15880s.getWidth(), f15880s.getHeight(), 35, 5);
                    for (int i12 = 0; i12 < 5; i12++) {
                        K[i12] = new byte[(h().getWidth() * h().getHeight())];
                    }
                    A.setOnImageAvailableListener(new d(), f15883x);
                }
                f15885z.setOnImageAvailableListener(new e(), f15883x);
                E = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                w(cameraCharacteristics, f15871f);
                return;
            }
            throw new RuntimeException("Time out waiting to lock camera opening.");
        } catch (CameraAccessException e11) {
            e11.getMessage();
        } catch (InterruptedException e12) {
            throw new RuntimeException("Interrupted while trying to lock camera opening.", e12);
        } catch (RuntimeException unused) {
            m();
        } catch (Exception e13) {
            e13.getMessage();
        }
    }

    /* access modifiers changed from: private */
    public static void n() {
        try {
            V(f15884y);
            f15884y.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            f15879r = 2;
            B.capture(f15884y.build(), M, f15883x);
        } catch (CameraAccessException e11) {
            e11.getMessage();
        }
    }

    private static void o() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        F = handlerThread;
        handlerThread.start();
        f15883x = new Handler(F.getLooper());
    }

    private static void p() {
        try {
            F.quitSafely();
            try {
                F.join();
                F = null;
                f15883x = null;
            } catch (InterruptedException e11) {
                e11.getMessage();
            }
        } catch (Exception e12) {
            e12.getMessage();
        }
    }

    public static void q() {
        f15870e = !f15870e;
    }

    public static void r() {
        k();
    }

    /* access modifiers changed from: private */
    public static void s() {
        try {
            f15884y.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            B.capture(f15884y.build(), M, f15883x);
            f15879r = 0;
            B.setRepeatingRequest(C, M, f15883x);
        } catch (Exception e11) {
            e11.getMessage();
        }
    }

    private static void t() {
        new Handler(Looper.getMainLooper()).post(new h());
    }

    private static int w(CameraCharacteristics cameraCharacteristics, int i11) {
        boolean z11 = false;
        if (i11 == -1) {
            return 0;
        }
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        int i12 = ((i11 + 45) / 90) * 90;
        if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            z11 = true;
        }
        if (z11) {
            i12 = -i12;
        }
        return ((intValue + i12) + 360) % 360;
    }
}
