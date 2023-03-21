package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller */
public class l extends RecyclerView.z {

    /* renamed from: i  reason: collision with root package name */
    protected final LinearInterpolator f11446i = new LinearInterpolator();
    protected final DecelerateInterpolator j = new DecelerateInterpolator();
    protected PointF k;

    /* renamed from: l  reason: collision with root package name */
    private final DisplayMetrics f11447l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11448m = false;
    private float n;

    /* renamed from: o  reason: collision with root package name */
    protected int f11449o = 0;

    /* renamed from: p  reason: collision with root package name */
    protected int f11450p = 0;

    public l(Context context) {
        this.f11447l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f11448m) {
            this.n = v(this.f11447l);
            this.f11448m = true;
        }
        return this.n;
    }

    private int y(int i11, int i12) {
        int i13 = i11 - i12;
        if (i11 * i13 <= 0) {
            return 0;
        }
        return i13;
    }

    /* access modifiers changed from: protected */
    public int B() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f11 = pointF.y;
            if (f11 != 0.0f) {
                return f11 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void C(RecyclerView.z.a aVar) {
        PointF a11 = a(f());
        if (a11 == null || (a11.x == 0.0f && a11.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a11);
        this.k = a11;
        this.f11449o = (int) (a11.x * 10000.0f);
        this.f11450p = (int) (a11.y * 10000.0f);
        aVar.d((int) (((float) this.f11449o) * 1.2f), (int) (((float) this.f11450p) * 1.2f), (int) (((float) x(10000)) * 1.2f), this.f11446i);
    }

    /* access modifiers changed from: protected */
    public void l(int i11, int i12, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f11449o = y(this.f11449o, i11);
        int y11 = y(this.f11450p, i12);
        this.f11450p = y11;
        if (this.f11449o == 0 && y11 == 0) {
            C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public void n() {
        this.f11450p = 0;
        this.f11449o = 0;
        this.k = null;
    }

    /* access modifiers changed from: protected */
    public void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        int t = t(view, z());
        int u11 = u(view, B());
        int w11 = w((int) Math.sqrt((double) ((t * t) + (u11 * u11))));
        if (w11 > 0) {
            aVar.d(-t, -u11, w11, this.j);
        }
    }

    public int s(int i11, int i12, int i13, int i14, int i15) {
        if (i15 == -1) {
            return i13 - i11;
        }
        if (i15 == 0) {
            int i16 = i13 - i11;
            if (i16 > 0) {
                return i16;
            }
            int i17 = i14 - i12;
            if (i17 < 0) {
                return i17;
            }
            return 0;
        } else if (i15 == 1) {
            return i14 - i12;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int t(View view, int i11) {
        RecyclerView.o e11 = e();
        if (e11 == null || !e11.m()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e11.b0(view) - pVar.leftMargin, e11.e0(view) + pVar.rightMargin, e11.getPaddingLeft(), e11.v0() - e11.getPaddingRight(), i11);
    }

    public int u(View view, int i11) {
        RecyclerView.o e11 = e();
        if (e11 == null || !e11.l()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e11.f0(view) - pVar.topMargin, e11.Z(view) + pVar.bottomMargin, e11.getPaddingTop(), e11.h0() - e11.getPaddingBottom(), i11);
    }

    /* access modifiers changed from: protected */
    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    public int w(int i11) {
        return (int) Math.ceil(((double) x(i11)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    public int x(int i11) {
        return (int) Math.ceil((double) (((float) Math.abs(i11)) * A()));
    }

    /* access modifiers changed from: protected */
    public int z() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f11 = pointF.x;
            if (f11 != 0.0f) {
                return f11 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
