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
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import n5.c;
import o5.g;
import o5.j;

@Instrumented
public class b extends c {
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static final String f15079u = b.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final j5.a f15080m = new j5.a();
    /* access modifiers changed from: private */
    public SurfaceTexture n;

    /* renamed from: o  reason: collision with root package name */
    private float[] f15081o = new float[16];

    /* renamed from: p  reason: collision with root package name */
    private final g f15082p = new g(this);
    /* access modifiers changed from: private */
    public SurfaceTexture.OnFrameAvailableListener q = new C0137b();

    /* renamed from: r  reason: collision with root package name */
    g.a f15083r = new d(this);

    /* renamed from: s  reason: collision with root package name */
    private h f15084s = new h(this, (a) null);
    private c.i t = new e(this);

    class a implements Runnable {
        a(b bVar) {
        }

        public void run() {
            h5.a aVar = h5.b.f14799f;
            if (aVar != null) {
                aVar.r();
            }
        }
    }

    /* renamed from: i5.b$b  reason: collision with other inner class name */
    class C0137b implements SurfaceTexture.OnFrameAvailableListener {
        C0137b() {
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            b.this.f15111b.requestRender();
        }
    }

    class c implements Runnable {
        c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x007d A[Catch:{ Exception -> 0x00b3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                i5.b r0 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                int r1 = r0.f15112c     // Catch:{ Exception -> 0x00b3 }
                r2 = -1
                if (r1 != r2) goto L_0x002a
                int r1 = o5.f.a()     // Catch:{ Exception -> 0x00b3 }
                r0.f15112c = r1     // Catch:{ Exception -> 0x00b3 }
                i5.b r0 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture     // Catch:{ Exception -> 0x00b3 }
                i5.b r2 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                int r2 = r2.f15112c     // Catch:{ Exception -> 0x00b3 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x00b3 }
                android.graphics.SurfaceTexture unused = r0.n = r1     // Catch:{ Exception -> 0x00b3 }
                i5.b r0 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                android.graphics.SurfaceTexture r0 = r0.n     // Catch:{ Exception -> 0x00b3 }
                i5.b r1 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                android.graphics.SurfaceTexture$OnFrameAvailableListener r1 = r1.q     // Catch:{ Exception -> 0x00b3 }
                r0.setOnFrameAvailableListener(r1)     // Catch:{ Exception -> 0x00b3 }
            L_0x002a:
                android.util.Size r0 = n5.c.h()     // Catch:{ Exception -> 0x00b3 }
                if (r0 != 0) goto L_0x0031
                return
            L_0x0031:
                int r1 = n5.c.g()     // Catch:{ Exception -> 0x00b3 }
                r2 = 90
                if (r1 == r2) goto L_0x004f
                r2 = 270(0x10e, float:3.78E-43)
                if (r1 != r2) goto L_0x003e
                goto L_0x004f
            L_0x003e:
                i5.b r1 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                int r2 = r0.getWidth()     // Catch:{ Exception -> 0x00b3 }
                r1.f15118i = r2     // Catch:{ Exception -> 0x00b3 }
                i5.b r1 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                int r0 = r0.getHeight()     // Catch:{ Exception -> 0x00b3 }
                r1.j = r0     // Catch:{ Exception -> 0x00b3 }
                goto L_0x005f
            L_0x004f:
                i5.b r1 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                int r2 = r0.getHeight()     // Catch:{ Exception -> 0x00b3 }
                r1.f15118i = r2     // Catch:{ Exception -> 0x00b3 }
                i5.b r1 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                int r0 = r0.getWidth()     // Catch:{ Exception -> 0x00b3 }
                r1.j = r0     // Catch:{ Exception -> 0x00b3 }
            L_0x005f:
                i5.b r0 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                j5.a r0 = r0.f15080m     // Catch:{ Exception -> 0x00b3 }
                i5.b r1 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                int r2 = r1.f15118i     // Catch:{ Exception -> 0x00b3 }
                int r1 = r1.j     // Catch:{ Exception -> 0x00b3 }
                r0.g(r2, r1)     // Catch:{ Exception -> 0x00b3 }
                i5.b r0 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                android.graphics.SurfaceTexture r0 = r0.n     // Catch:{ Exception -> 0x00b3 }
                n5.c.I(r0)     // Catch:{ Exception -> 0x00b3 }
                boolean r0 = n5.a.b()     // Catch:{ Exception -> 0x00b3 }
                if (r0 == 0) goto L_0x00c4
                android.util.Size r0 = n5.c.e()     // Catch:{ Exception -> 0x00b3 }
                i5.b r1 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                java.nio.IntBuffer r1 = r1.k     // Catch:{ Exception -> 0x00b3 }
                if (r1 == 0) goto L_0x008a
                r1.clear()     // Catch:{ Exception -> 0x00b3 }
            L_0x008a:
                i5.b r1 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                java.nio.IntBuffer r1 = r1.k     // Catch:{ Exception -> 0x00b3 }
                if (r1 == 0) goto L_0x00a0
                int r1 = r1.capacity()     // Catch:{ Exception -> 0x00b3 }
                int r2 = r0.getHeight()     // Catch:{ Exception -> 0x00b3 }
                int r3 = r0.getWidth()     // Catch:{ Exception -> 0x00b3 }
                int r2 = r2 * r3
                if (r1 >= r2) goto L_0x00c4
            L_0x00a0:
                i5.b r1 = i5.b.this     // Catch:{ Exception -> 0x00b3 }
                int r2 = r0.getHeight()     // Catch:{ Exception -> 0x00b3 }
                int r0 = r0.getWidth()     // Catch:{ Exception -> 0x00b3 }
                int r2 = r2 * r0
                java.nio.IntBuffer r0 = java.nio.IntBuffer.allocate(r2)     // Catch:{ Exception -> 0x00b3 }
                r1.k = r0     // Catch:{ Exception -> 0x00b3 }
                goto L_0x00c4
            L_0x00b3:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x00c4
                java.lang.String unused = i5.b.f15079u
                r0.getMessage()
            L_0x00c4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.b.c.run():void");
        }
    }

    class d implements g.a {
        d(b bVar) {
        }

        public void a(String str) {
            h5.a aVar = h5.b.f14799f;
            if (aVar != null) {
                aVar.v(new File(str));
            }
        }
    }

    class e implements c.i {
        e(b bVar) {
        }

        public void a(byte[] bArr, int i11, int i12, int i13, int i14, byte[] bArr2) {
            h5.b.f14799f.s(bArr, i11, i12, i13, i14, bArr2);
        }

        public void b(byte[] bArr) {
            h5.b.f14799f.u(bArr);
        }
    }

    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bitmap f15087a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f15088b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f15089c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f15090d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ File f15091e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f15092f;

        f(Bitmap bitmap, boolean z11, boolean z12, boolean z13, File file, int i11) {
            this.f15087a = bitmap;
            this.f15088b = z11;
            this.f15089c = z12;
            this.f15090d = z13;
            this.f15091e = file;
            this.f15092f = i11;
        }

        public void run() {
            int i11;
            int i12;
            int width = this.f15087a.getWidth();
            int height = this.f15087a.getHeight();
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
            b.this.f15110a.g(width, height);
            b bVar = b.this;
            bVar.f15110a.d(bVar.f15118i, bVar.j);
            if (this.f15088b) {
                i11 = o5.f.b(this.f15087a, -1, true);
            } else {
                i11 = b.this.f15112c;
            }
            int i13 = i11;
            b.this.f15110a.b(i13, this.f15089c, this.f15090d);
            IntBuffer intBuffer = b.this.k;
            if (intBuffer != null) {
                intBuffer.clear();
            }
            IntBuffer intBuffer2 = b.this.k;
            if (intBuffer2 == null || intBuffer2.capacity() < height * width) {
                b.this.k = IntBuffer.allocate(height * width);
            }
            GLES20.glReadPixels(0, 0, width, height, 6408, 5121, b.this.k);
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(b.this.k.array()));
            if (this.f15088b) {
                i12 = 1;
                GLES20.glDeleteTextures(1, new int[]{i13}, 0);
            } else {
                i12 = 1;
            }
            GLES20.glDeleteFramebuffers(i12, iArr, 0);
            GLES20.glDeleteTextures(i12, iArr2, 0);
            b bVar2 = b.this;
            GLES20.glViewport(0, 0, bVar2.f15116g, bVar2.f15117h);
            b bVar3 = b.this;
            bVar3.f15110a.g(bVar3.f15118i, bVar3.j);
            b.this.m(createBitmap, this.f15091e, this.f15092f);
        }
    }

    private static class g extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f15094a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final Handler f15095b;

        /* renamed from: c  reason: collision with root package name */
        WeakReference<b> f15096c;

        /* renamed from: d  reason: collision with root package name */
        private Runnable f15097d = new a();

        /* renamed from: e  reason: collision with root package name */
        private Runnable f15098e = new C0138b();

        /* renamed from: f  reason: collision with root package name */
        private Runnable f15099f = new c();
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public Runnable f15100g;

        class a implements Runnable {
            a() {
            }

            public void run() {
                g.this.f15095b.removeCallbacksAndMessages((Object) null);
                ((b) g.this.f15096c.get()).f15111b.removeCallbacks((Runnable) null);
                n5.c.d();
            }
        }

        /* renamed from: i5.b$g$b  reason: collision with other inner class name */
        class C0138b implements Runnable {
            C0138b() {
            }

            public void run() {
                b bVar = (b) g.this.f15096c.get();
                g.this.f15095b.removeCallbacksAndMessages((Object) null);
                if (bVar != null) {
                    n5.c.m();
                    bVar.l(n5.c.g(), true, false);
                    g.this.f15095b.post(g.this.f15100g);
                }
            }
        }

        class c implements Runnable {
            c() {
            }

            public void run() {
                b bVar = (b) g.this.f15096c.get();
                g.this.f15095b.removeCallbacksAndMessages((Object) null);
                if (bVar != null) {
                    try {
                        bVar.f15111b.removeCallbacks((Runnable) null);
                        n5.c.d();
                        n5.c.q();
                        n5.c.m();
                        bVar.l(n5.c.g(), true, false);
                        g.this.f15095b.post(g.this.f15100g);
                        h5.b.f14799f.j();
                    } catch (Exception e11) {
                        String unused = b.f15079u;
                        e11.getMessage();
                    }
                }
            }
        }

        class d implements Runnable {
            d() {
            }

            public void run() {
                g.this.f15095b.removeCallbacksAndMessages((Object) null);
                ((b) g.this.f15096c.get()).f15111b.removeCallbacks((Runnable) null);
                n5.c.d();
                n5.c.m();
                g.this.f15095b.post(g.this.f15100g);
            }
        }

        class e implements Runnable {
            e() {
            }

            public void run() {
                b bVar = (b) g.this.f15096c.get();
                bVar.u();
                bVar.c(c.f15109l);
                bVar.f15111b.requestLayout();
                h5.b.d();
            }
        }

        public g(b bVar) {
            super("CameraHandler");
            new d();
            this.f15100g = new e();
            this.f15096c = new WeakReference<>(bVar);
            start();
            this.f15094a = new Handler(getLooper());
            this.f15095b = new Handler(Looper.getMainLooper());
        }

        public void b() {
            this.f15094a.removeCallbacksAndMessages((Object) null);
            this.f15094a.post(this.f15097d);
        }

        public void d() {
            this.f15094a.removeCallbacksAndMessages((Object) null);
            this.f15094a.post(this.f15098e);
        }

        public void e() {
            this.f15094a.removeCallbacksAndMessages((Object) null);
            this.f15094a.post(this.f15099f);
        }
    }

    @Instrumented
    private class h implements Camera.PictureCallback {

        /* renamed from: a  reason: collision with root package name */
        public File f15106a;

        /* renamed from: b  reason: collision with root package name */
        b f15107b;

        private h() {
        }

        public void a(b bVar) {
            this.f15107b = bVar;
        }

        public void b(File file) {
            this.f15106a = file;
        }

        public void onPictureTaken(byte[] bArr, Camera camera) {
            if (this.f15106a == null) {
                String unused = b.f15079u;
                return;
            }
            h5.b.f14799f.x();
            o5.h hVar = new o5.h(this.f15106a, bArr, this.f15107b);
            Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
            Boolean[] boolArr = new Boolean[2];
            boolArr[0] = Boolean.valueOf(b.this.f15110a != null);
            boolArr[1] = Boolean.valueOf(n5.a.g());
            AsyncTaskInstrumentation.executeOnExecutor(hVar, executor, boolArr);
        }

        /* synthetic */ h(b bVar, a aVar) {
            this();
        }
    }

    public b(GLSurfaceView gLSurfaceView) {
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
    public void u() {
        this.f15111b.removeCallbacks((Runnable) null);
        this.f15111b.queueEvent(new c());
        n5.c.K(this.t);
    }

    public void a() {
        this.f15082p.e();
    }

    public void b(float f11, float f12, Camera.AutoFocusCallback autoFocusCallback) {
        n5.c.E(f11, f12, autoFocusCallback);
    }

    public void c(int i11) {
        super.c(i11);
    }

    public void d(Bitmap bitmap, File file, boolean z11, boolean z12, int i11) {
        if (this.f15110a == null || c.f15109l == 0) {
            AsyncTaskInstrumentation.executeOnExecutor(new o5.g(file, this.f15083r, i11), AsyncTask.THREAD_POOL_EXECUTOR, bitmap);
            return;
        }
        n(bitmap, true, z11, z12, file, i11);
    }

    public void e(File file, g.a aVar, Camera.ShutterCallback shutterCallback) {
        n5.c.K(this.t);
        this.f15084s.b(file);
        this.f15084s.a(this);
        n5.c.r();
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
        this.f15080m.d(this.f15116g, this.f15117h);
        if (this.f15110a != null) {
            this.f15080m.q(this.f15118i, this.j);
        } else {
            this.f15080m.r();
        }
    }

    public void h() {
        super.h();
        this.f15082p.b();
    }

    public void i() {
        super.i();
        this.f15082p.d();
    }

    /* access modifiers changed from: protected */
    public void m(Bitmap bitmap, File file, int i11) {
        AsyncTaskInstrumentation.executeOnExecutor(new o5.g(file, this.f15083r, i11), AsyncTask.THREAD_POOL_EXECUTOR, bitmap);
    }

    /* access modifiers changed from: protected */
    public void n(Bitmap bitmap, boolean z11, boolean z12, boolean z13, File file, int i11) {
        this.f15111b.queueEvent(new f(bitmap, z11, z12, z13, file, i11));
    }

    public void onDrawFrame(GL10 gl10) {
        if (this.n != null) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            try {
                this.n.updateTexImage();
            } catch (Exception e11) {
                e11.getMessage();
            }
            this.n.getTransformMatrix(this.f15081o);
            this.f15080m.p(this.f15081o);
            int i11 = this.f15112c;
            if (this.f15110a == null) {
                this.f15080m.a(i11, this.f15113d, this.f15114e);
                return;
            }
            this.f15110a.a(this.f15080m.o(i11), this.f15113d, this.f15114e);
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
        GLES20.glViewport(0, 0, i11, i12);
        this.f15116g = i11;
        this.f15117h = i12;
        g();
        new Handler(Looper.getMainLooper()).post(new a(this));
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glDisable(3024);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glEnable(2884);
        GLES20.glEnable(2929);
        this.f15080m.f();
        c(c.f15109l);
    }
}
