package i5;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.newrelic.agent.android.instrumentation.AsyncTaskInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import o5.g;
import o5.j;

@Instrumented
public class a extends c {
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static final String f15052u = a.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final j5.a f15053m = new j5.a();
    /* access modifiers changed from: private */
    public SurfaceTexture n;

    /* renamed from: o  reason: collision with root package name */
    private float[] f15054o = new float[16];
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f15055p;
    private final f q = new f(this);
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public SurfaceTexture.OnFrameAvailableListener f15056r = new b();

    /* renamed from: s  reason: collision with root package name */
    g.a f15057s = new d(this);
    private g t = new g(this, (C0135a) null);

    /* renamed from: i5.a$a  reason: collision with other inner class name */
    class C0135a implements Runnable {
        C0135a(a aVar) {
        }

        public void run() {
            h5.a aVar = h5.b.f14799f;
            if (aVar != null) {
                aVar.r();
            }
        }
    }

    class b implements SurfaceTexture.OnFrameAvailableListener {
        b() {
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            a.this.f15111b.requestRender();
        }
    }

    class c implements Runnable {
        c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0071 A[Catch:{ Exception -> 0x009f }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                i5.a r0 = i5.a.this     // Catch:{ Exception -> 0x009f }
                int r1 = r0.f15112c     // Catch:{ Exception -> 0x009f }
                r2 = -1
                if (r1 != r2) goto L_0x002a
                int r1 = o5.f.a()     // Catch:{ Exception -> 0x009f }
                r0.f15112c = r1     // Catch:{ Exception -> 0x009f }
                i5.a r0 = i5.a.this     // Catch:{ Exception -> 0x009f }
                android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture     // Catch:{ Exception -> 0x009f }
                i5.a r2 = i5.a.this     // Catch:{ Exception -> 0x009f }
                int r2 = r2.f15112c     // Catch:{ Exception -> 0x009f }
                r1.<init>(r2)     // Catch:{ Exception -> 0x009f }
                android.graphics.SurfaceTexture unused = r0.n = r1     // Catch:{ Exception -> 0x009f }
                i5.a r0 = i5.a.this     // Catch:{ Exception -> 0x009f }
                android.graphics.SurfaceTexture r0 = r0.n     // Catch:{ Exception -> 0x009f }
                i5.a r1 = i5.a.this     // Catch:{ Exception -> 0x009f }
                android.graphics.SurfaceTexture$OnFrameAvailableListener r1 = r1.f15056r     // Catch:{ Exception -> 0x009f }
                r0.setOnFrameAvailableListener(r1)     // Catch:{ Exception -> 0x009f }
            L_0x002a:
                android.hardware.Camera$Size r0 = n5.b.N()     // Catch:{ Exception -> 0x009f }
                if (r0 != 0) goto L_0x0031
                return
            L_0x0031:
                int r1 = n5.b.L()     // Catch:{ Exception -> 0x009f }
                r2 = 90
                if (r1 == r2) goto L_0x0049
                r2 = 270(0x10e, float:3.78E-43)
                if (r1 != r2) goto L_0x003e
                goto L_0x0049
            L_0x003e:
                i5.a r1 = i5.a.this     // Catch:{ Exception -> 0x009f }
                int r2 = r0.width     // Catch:{ Exception -> 0x009f }
                r1.f15118i = r2     // Catch:{ Exception -> 0x009f }
                int r0 = r0.height     // Catch:{ Exception -> 0x009f }
                r1.j = r0     // Catch:{ Exception -> 0x009f }
                goto L_0x0053
            L_0x0049:
                i5.a r1 = i5.a.this     // Catch:{ Exception -> 0x009f }
                int r2 = r0.height     // Catch:{ Exception -> 0x009f }
                r1.f15118i = r2     // Catch:{ Exception -> 0x009f }
                int r0 = r0.width     // Catch:{ Exception -> 0x009f }
                r1.j = r0     // Catch:{ Exception -> 0x009f }
            L_0x0053:
                i5.a r0 = i5.a.this     // Catch:{ Exception -> 0x009f }
                j5.a r0 = r0.f15053m     // Catch:{ Exception -> 0x009f }
                i5.a r1 = i5.a.this     // Catch:{ Exception -> 0x009f }
                int r2 = r1.f15118i     // Catch:{ Exception -> 0x009f }
                int r1 = r1.j     // Catch:{ Exception -> 0x009f }
                r0.g(r2, r1)     // Catch:{ Exception -> 0x009f }
                i5.a r0 = i5.a.this     // Catch:{ Exception -> 0x009f }
                android.graphics.SurfaceTexture r0 = r0.n     // Catch:{ Exception -> 0x009f }
                n5.b.k(r0)     // Catch:{ Exception -> 0x009f }
                boolean r0 = n5.a.b()     // Catch:{ Exception -> 0x009f }
                if (r0 == 0) goto L_0x00b0
                android.hardware.Camera$Size r0 = n5.b.G()     // Catch:{ Exception -> 0x009f }
                i5.a r1 = i5.a.this     // Catch:{ Exception -> 0x009f }
                java.nio.IntBuffer r1 = r1.k     // Catch:{ Exception -> 0x009f }
                if (r1 == 0) goto L_0x007e
                r1.clear()     // Catch:{ Exception -> 0x009f }
            L_0x007e:
                i5.a r1 = i5.a.this     // Catch:{ Exception -> 0x009f }
                java.nio.IntBuffer r1 = r1.k     // Catch:{ Exception -> 0x009f }
                if (r1 == 0) goto L_0x0090
                int r1 = r1.capacity()     // Catch:{ Exception -> 0x009f }
                int r2 = r0.height     // Catch:{ Exception -> 0x009f }
                int r3 = r0.width     // Catch:{ Exception -> 0x009f }
                int r2 = r2 * r3
                if (r1 >= r2) goto L_0x00b0
            L_0x0090:
                i5.a r1 = i5.a.this     // Catch:{ Exception -> 0x009f }
                int r2 = r0.height     // Catch:{ Exception -> 0x009f }
                int r0 = r0.width     // Catch:{ Exception -> 0x009f }
                int r2 = r2 * r0
                java.nio.IntBuffer r0 = java.nio.IntBuffer.allocate(r2)     // Catch:{ Exception -> 0x009f }
                r1.k = r0     // Catch:{ Exception -> 0x009f }
                goto L_0x00b0
            L_0x009f:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x00b0
                java.lang.String unused = i5.a.f15052u
                r0.getMessage()
            L_0x00b0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.a.c.run():void");
        }
    }

    class d implements g.a {
        d(a aVar) {
        }

        public void a(String str) {
            h5.a aVar = h5.b.f14799f;
            if (aVar != null) {
                aVar.v(new File(str));
            }
        }
    }

    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bitmap f15060a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f15061b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f15062c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f15063d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ File f15064e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f15065f;

        e(Bitmap bitmap, boolean z11, boolean z12, boolean z13, File file, int i11) {
            this.f15060a = bitmap;
            this.f15061b = z11;
            this.f15062c = z12;
            this.f15063d = z13;
            this.f15064e = file;
            this.f15065f = i11;
        }

        public void run() {
            int i11;
            int i12;
            int width = this.f15060a.getWidth();
            int height = this.f15060a.getHeight();
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            GLES20.glGenTextures(1, iArr2, 0);
            GLES20.glBindTexture(3553, iArr2[0]);
            GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, (Buffer) null);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, iArr[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
            GLES20.glViewport(0, 0, width, height);
            a.this.f15110a.g(width, height);
            a aVar = a.this;
            aVar.f15110a.d(aVar.f15118i, aVar.j);
            if (this.f15061b) {
                i11 = o5.f.b(this.f15060a, -1, true);
            } else {
                i11 = a.this.f15112c;
            }
            int i13 = i11;
            a.this.f15110a.b(i13, this.f15062c, this.f15063d);
            IntBuffer intBuffer = a.this.k;
            if (intBuffer != null) {
                intBuffer.clear();
            }
            IntBuffer intBuffer2 = a.this.k;
            if (intBuffer2 == null || intBuffer2.capacity() < height * width) {
                a.this.k = IntBuffer.allocate(height * width);
            }
            GLES20.glReadPixels(0, 0, width, height, 6408, 5121, a.this.k);
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(a.this.k.array()));
            if (n5.b.H() != null) {
                i12 = 1;
                a.this.l(n5.b.L(), true, false);
            } else {
                i12 = 1;
            }
            if (this.f15061b) {
                int[] iArr3 = new int[i12];
                iArr3[0] = i13;
                GLES20.glDeleteTextures(i12, iArr3, 0);
            }
            GLES20.glDeleteFramebuffers(i12, iArr, 0);
            GLES20.glDeleteTextures(i12, iArr2, 0);
            a aVar2 = a.this;
            GLES20.glViewport(0, 0, aVar2.f15116g, aVar2.f15117h);
            a aVar3 = a.this;
            aVar3.f15110a.g(aVar3.f15118i, aVar3.j);
            a.this.m(createBitmap, this.f15064e, this.f15065f);
        }
    }

    private static class f extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f15067a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final Handler f15068b;

        /* renamed from: c  reason: collision with root package name */
        WeakReference<a> f15069c;

        /* renamed from: d  reason: collision with root package name */
        private Runnable f15070d = new C0136a();

        /* renamed from: e  reason: collision with root package name */
        private Runnable f15071e = new b();

        /* renamed from: f  reason: collision with root package name */
        private Runnable f15072f = new c();
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public Runnable f15073g;

        /* renamed from: i5.a$f$a  reason: collision with other inner class name */
        class C0136a implements Runnable {
            C0136a() {
            }

            public void run() {
                try {
                    f.this.f15068b.removeCallbacksAndMessages((Object) null);
                    ((a) f.this.f15069c.get()).f15111b.removeCallbacks((Runnable) null);
                    n5.b.S();
                } catch (Exception e11) {
                    String unused = a.f15052u;
                    e11.getMessage();
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            public void run() {
                a aVar = (a) f.this.f15069c.get();
                f.this.f15068b.removeCallbacksAndMessages((Object) null);
                if (aVar != null) {
                    try {
                        n5.b.R();
                        if (n5.b.H() != null) {
                            boolean g11 = n5.a.g();
                            aVar.l(n5.b.L(), g11, !g11);
                            f.this.f15068b.post(f.this.f15073g);
                        }
                    } catch (Exception e11) {
                        String unused = a.f15052u;
                        e11.getMessage();
                    }
                }
            }
        }

        class c implements Runnable {
            c() {
            }

            public void run() {
                a aVar = (a) f.this.f15069c.get();
                f.this.f15068b.removeCallbacksAndMessages((Object) null);
                if (aVar != null) {
                    try {
                        aVar.f15111b.removeCallbacks((Runnable) null);
                        n5.b.S();
                        n5.b.a();
                        f.this.f15068b.post(f.this.f15073g);
                        h5.b.f14799f.j();
                    } catch (Exception e11) {
                        String unused = a.f15052u;
                        e11.getMessage();
                    }
                }
            }
        }

        class d implements Runnable {
            d() {
            }

            public void run() {
                try {
                    f.this.f15068b.removeCallbacksAndMessages((Object) null);
                    ((a) f.this.f15069c.get()).f15111b.removeCallbacks((Runnable) null);
                    n5.b.S();
                    n5.b.F();
                    f.this.f15068b.post(f.this.f15073g);
                } catch (Exception e11) {
                    String unused = a.f15052u;
                    e11.getMessage();
                }
            }
        }

        class e implements Runnable {
            e() {
            }

            public void run() {
                try {
                    a aVar = (a) f.this.f15069c.get();
                    aVar.v();
                    if (aVar.f15055p) {
                        aVar.c(c.f15109l);
                    }
                    aVar.f15111b.requestLayout();
                    h5.b.d();
                } catch (Exception e11) {
                    String unused = a.f15052u;
                    e11.getMessage();
                }
            }
        }

        public f(a aVar) {
            super("CameraHandler");
            new d();
            this.f15073g = new e();
            this.f15069c = new WeakReference<>(aVar);
            start();
            this.f15067a = new Handler(getLooper());
            this.f15068b = new Handler(Looper.getMainLooper());
        }

        public void b() {
            this.f15067a.removeCallbacksAndMessages((Object) null);
            this.f15067a.post(this.f15070d);
        }

        public void d() {
            this.f15067a.removeCallbacksAndMessages((Object) null);
            this.f15067a.post(this.f15071e);
        }

        public void e() {
            this.f15067a.removeCallbacksAndMessages((Object) null);
            this.f15067a.post(this.f15072f);
        }
    }

    private class g implements Camera.PictureCallback {
        private g(a aVar) {
        }

        public void a(a aVar) {
        }

        public void b(File file) {
        }

        public void onPictureTaken(byte[] bArr, Camera camera) {
            try {
                if (h5.b.f14799f != null) {
                    n5.b.V();
                    h5.b.f14799f.x();
                    h5.b.f14799f.u(bArr);
                }
            } catch (Exception e11) {
                String unused = a.f15052u;
                e11.getMessage();
            }
        }

        /* synthetic */ g(a aVar, C0135a aVar2) {
            this(aVar);
        }
    }

    public a(GLSurfaceView gLSurfaceView) {
        super(gLSurfaceView);
        c.f15109l = 0;
    }

    /* access modifiers changed from: private */
    public void l(int i11, boolean z11, boolean z12) {
        float[] b11 = j.b(co.hyperverge.hvcamera.magicfilter.utils.f.a(i11), z11, z12);
        this.f15114e.clear();
        this.f15114e.put(b11).position(0);
    }

    public static void p(Buffer buffer) {
        if (buffer.isDirect()) {
            try {
                if (!buffer.getClass().getName().equals("java.nio.DirectByteBuffer")) {
                    Field declaredField = buffer.getClass().getDeclaredField("att");
                    declaredField.setAccessible(true);
                    buffer = (Buffer) declaredField.get(buffer);
                }
                Method method = buffer.getClass().getMethod("cleaner", new Class[0]);
                method.setAccessible(true);
                Object invoke = method.invoke(buffer, new Object[0]);
                Method method2 = invoke.getClass().getMethod("clean", new Class[0]);
                method2.setAccessible(true);
                method2.invoke(invoke, new Object[0]);
            } catch (Exception e11) {
                throw new RuntimeException("Could not destroy direct buffer " + buffer, e11);
            }
        }
    }

    /* access modifiers changed from: private */
    public void v() {
        this.f15111b.removeCallbacks((Runnable) null);
        this.f15111b.queueEvent(new c());
    }

    public void a() {
        this.q.e();
    }

    public void b(float f11, float f12, Camera.AutoFocusCallback autoFocusCallback) {
        n5.b.i(f11, f12, autoFocusCallback);
    }

    public void d(Bitmap bitmap, File file, boolean z11, boolean z12, int i11) {
        if (this.f15110a == null || c.f15109l == 0) {
            AsyncTaskInstrumentation.executeOnExecutor(new o5.g(file, this.f15057s, i11), AsyncTask.THREAD_POOL_EXECUTOR, bitmap);
            return;
        }
        n(bitmap, true, z11, z12, file, i11);
    }

    public void e(File file, g.a aVar, Camera.ShutterCallback shutterCallback) {
        this.t.b(file);
        this.t.a(this);
        n5.b.n(shutterCallback, (Camera.PictureCallback) null, this.t);
    }

    public void f() {
        IntBuffer intBuffer = this.k;
        if (intBuffer != null) {
            p(intBuffer);
            this.k = null;
        }
        super.f();
    }

    /* access modifiers changed from: protected */
    public void g() {
        super.g();
        this.f15053m.d(this.f15116g, this.f15117h);
        if (this.f15110a != null) {
            this.f15053m.q(this.f15118i, this.j);
        } else {
            this.f15053m.r();
        }
    }

    public void h() {
        super.h();
        this.q.b();
    }

    public void i() {
        super.i();
        this.q.d();
    }

    /* access modifiers changed from: protected */
    public void m(Bitmap bitmap, File file, int i11) {
        AsyncTaskInstrumentation.executeOnExecutor(new o5.g(file, this.f15057s, i11), AsyncTask.THREAD_POOL_EXECUTOR, bitmap);
    }

    /* access modifiers changed from: protected */
    public void n(Bitmap bitmap, boolean z11, boolean z12, boolean z13, File file, int i11) {
        this.f15111b.queueEvent(new e(bitmap, z11, z12, z13, file, i11));
    }

    public void onDrawFrame(GL10 gl10) {
        if (this.n != null && n5.b.H() != null) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            try {
                this.n.updateTexImage();
            } catch (Exception e11) {
                e11.getMessage();
            }
            this.n.getTransformMatrix(this.f15054o);
            this.f15053m.p(this.f15054o);
            int i11 = this.f15112c;
            if (this.f15110a == null) {
                this.f15053m.a(i11, this.f15113d, this.f15114e);
                return;
            }
            this.f15110a.a(this.f15053m.o(i11), this.f15113d, this.f15114e);
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
        GLES20.glViewport(0, 0, i11, i12);
        this.f15116g = i11;
        this.f15117h = i12;
        g();
        new Handler(Looper.getMainLooper()).post(new C0135a(this));
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glDisable(3024);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glEnable(2884);
        GLES20.glEnable(2929);
        this.f15053m.f();
        c(c.f15109l);
        this.f15055p = true;
    }
}
