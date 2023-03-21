package i5;

import android.graphics.Bitmap;
import android.hardware.Camera;
import android.opengl.GLSurfaceView;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import o5.g;
import o5.h;
import o5.j;

public abstract class c implements GLSurfaceView.Renderer {

    /* renamed from: l  reason: collision with root package name */
    public static int f15109l = -1;

    /* renamed from: a  reason: collision with root package name */
    protected k5.a f15110a;

    /* renamed from: b  reason: collision with root package name */
    protected final GLSurfaceView f15111b;

    /* renamed from: c  reason: collision with root package name */
    protected int f15112c = -1;

    /* renamed from: d  reason: collision with root package name */
    protected final FloatBuffer f15113d;

    /* renamed from: e  reason: collision with root package name */
    protected final FloatBuffer f15114e;

    /* renamed from: f  reason: collision with root package name */
    protected h f15115f;

    /* renamed from: g  reason: collision with root package name */
    protected int f15116g;

    /* renamed from: h  reason: collision with root package name */
    protected int f15117h;

    /* renamed from: i  reason: collision with root package name */
    protected int f15118i;
    protected int j;
    IntBuffer k;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15119a;

        a(int i11) {
            this.f15119a = i11;
        }

        public void run() {
            k5.a aVar = c.this.f15110a;
            if (aVar != null) {
                aVar.c();
            }
            c cVar = c.this;
            cVar.f15110a = null;
            cVar.f15110a = new k5.a();
            c.f15109l = this.f15119a;
            k5.a aVar2 = c.this.f15110a;
            if (aVar2 != null) {
                aVar2.f();
            }
            c.this.g();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            c.this.f15110a.c();
        }
    }

    public c(GLSurfaceView gLSurfaceView) {
        this.f15111b = gLSurfaceView;
        this.f15110a = new k5.a();
        float[] fArr = j.f15951e;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15113d = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = j.f15947a;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f15114e = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setRenderer(this);
        gLSurfaceView.setRenderMode(0);
    }

    public abstract void a();

    public abstract void b(float f11, float f12, Camera.AutoFocusCallback autoFocusCallback);

    public void c(int i11) {
        this.f15111b.queueEvent(new a(i11));
        this.f15111b.requestRender();
    }

    public abstract void d(Bitmap bitmap, File file, boolean z11, boolean z12, int i11);

    public abstract void e(File file, g.a aVar, Camera.ShutterCallback shutterCallback);

    public void f() {
        this.f15111b.queueEvent(new b());
    }

    /* access modifiers changed from: protected */
    public void g() {
        k5.a aVar = this.f15110a;
        if (aVar != null) {
            aVar.d(this.f15116g, this.f15117h);
            this.f15110a.g(this.f15118i, this.j);
        }
    }

    public void h() {
        h hVar = this.f15115f;
        if (hVar != null) {
            hVar.cancel(true);
        }
    }

    public void i() {
    }
}
