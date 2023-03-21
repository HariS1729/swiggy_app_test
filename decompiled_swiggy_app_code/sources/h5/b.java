package h5;

import android.content.Context;
import android.hardware.Camera;
import android.opengl.GLSurfaceView;
import android.view.OrientationEventListener;
import android.view.SurfaceHolder;
import android.view.View;
import java.io.File;
import o5.g;

public class b extends GLSurfaceView {

    /* renamed from: f  reason: collision with root package name */
    public static a f14799f = null;

    /* renamed from: g  reason: collision with root package name */
    private static b f14800g = null;

    /* renamed from: h  reason: collision with root package name */
    private static int f14801h = 3;

    /* renamed from: i  reason: collision with root package name */
    private static int f14802i = 4;
    /* access modifiers changed from: private */
    public static final String j = b.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public i5.c f14803a;

    /* renamed from: b  reason: collision with root package name */
    private d f14804b;

    /* renamed from: c  reason: collision with root package name */
    private m5.a f14805c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14806d = false;

    /* renamed from: e  reason: collision with root package name */
    Camera.ShutterCallback f14807e = new c(this);

    public interface a {
        void a();
    }

    /* renamed from: h5.b$b  reason: collision with other inner class name */
    class C0127b implements Runnable {
        C0127b() {
        }

        public void run() {
            if (b.this.f14803a != null) {
                b.this.f14803a.f();
            }
        }
    }

    class c implements Camera.ShutterCallback {
        c(b bVar) {
        }

        public void onShutter() {
            try {
                a aVar = b.f14799f;
                if (aVar != null) {
                    aVar.a();
                }
            } catch (Exception e11) {
                String unused = b.j;
                e11.getMessage();
            }
        }
    }

    private class d extends OrientationEventListener {
        public d(b bVar, Context context) {
            super(context);
            disable();
        }

        public void disable() {
            super.disable();
        }

        public void enable() {
            super.enable();
        }

        public void onOrientationChanged(int i11) {
            if (i11 == -1) {
                i11 = 0;
            }
            try {
                n5.a.o(i11);
            } catch (Throwable th2) {
                String unused = b.j;
                th2.getMessage();
            }
        }
    }

    private b(Context context, a aVar, boolean z11) {
        super(context);
        f14799f = aVar;
        aVar.k(Camera.getNumberOfCameras());
        n5.a.c(context, z11);
        this.f14805c = new m5.a(context, 9);
        if (!n5.a.d(context)) {
            this.f14803a = new i5.a(this);
        } else {
            this.f14803a = new i5.b(this);
        }
        e();
        d dVar = new d(this, context);
        this.f14804b = dVar;
        dVar.enable();
    }

    public static void d() {
        b bVar = f14800g;
        if (bVar != null) {
            bVar.requestLayout();
        }
    }

    public static void e() {
        if (f14799f.b() == 1) {
            f14801h = 3;
            f14802i = 4;
        } else if (f14799f.b() == 2) {
            f14801h = 9;
            f14802i = 16;
        }
    }

    public static b g(Context context, a aVar, boolean z11) {
        b bVar = new b(context, aVar, z11);
        f14800g = bVar;
        return bVar;
    }

    public static int getAspectRatio() {
        return f14802i == 4 ? 1 : 2;
    }

    public static int getmRatioHeight() {
        return f14802i;
    }

    public static int getmRatioWidth() {
        return f14801h;
    }

    public void c() {
    }

    public void f() {
        this.f14804b.disable();
        this.f14806d = true;
        n5.a.o(0);
    }

    public a getCamHost() {
        return f14799f;
    }

    public void h() {
        n5.a.j();
    }

    public void i() {
        f14800g = null;
        f14799f = null;
        queueEvent(new C0127b());
    }

    public void j(float f11, float f12, Camera.AutoFocusCallback autoFocusCallback) {
        this.f14803a.b(f11, f12, autoFocusCallback);
        this.f14805c.l();
    }

    public void k() {
        this.f14803a.a();
    }

    public void l() {
        this.f14805c.c();
    }

    public void m(String str) {
        this.f14805c.j();
        a aVar = f14799f;
        if (aVar == null) {
            return;
        }
        if (str == null) {
            this.f14803a.e(aVar.e(), (g.a) null, this.f14807e);
        } else {
            this.f14803a.e(new File(str), (g.a) null, this.f14807e);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        int i13;
        super.onMeasure(i11, i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int i14 = f14801h;
        if (i14 == 0 || (i13 = f14802i) == 0) {
            setMeasuredDimension(size, size2);
            a aVar = f14799f;
            if (aVar != null) {
                aVar.y(size, size2);
                return;
            }
            return;
        }
        setMeasuredDimension(size, (i13 * size) / i14);
        a aVar2 = f14799f;
        if (aVar2 != null) {
            aVar2.y(size, (f14802i * size) / f14801h);
        }
    }

    public void onPause() {
        i5.c cVar = this.f14803a;
        if (cVar != null) {
            cVar.h();
        }
        removeCallbacks((Runnable) null);
        this.f14804b.disable();
        this.f14805c.j();
    }

    public void onResume() {
        super.onResume();
        if (!this.f14806d) {
            this.f14804b.enable();
        }
        this.f14805c.c();
        i5.c cVar = this.f14803a;
        if (cVar != null) {
            cVar.i();
        }
    }

    public void setCamHost(a aVar) {
        f14799f = aVar;
    }

    public void setFilter(int i11) {
        this.f14803a.c(i11);
        f14799f.l(i11, l5.a.b(getContext(), i11));
    }

    public void setSensorCallback(a aVar) {
        this.f14805c.e(aVar);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        this.f14803a.f();
    }
}
