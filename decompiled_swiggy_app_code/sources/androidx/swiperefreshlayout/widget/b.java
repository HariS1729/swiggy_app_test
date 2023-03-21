package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.g;

/* compiled from: CircularProgressDrawable */
public class b extends Drawable implements Animatable {

    /* renamed from: g  reason: collision with root package name */
    private static final Interpolator f11757g = new LinearInterpolator();

    /* renamed from: h  reason: collision with root package name */
    private static final Interpolator f11758h = new f3.b();

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f11759i = {-16777216};

    /* renamed from: a  reason: collision with root package name */
    private final c f11760a;

    /* renamed from: b  reason: collision with root package name */
    private float f11761b;

    /* renamed from: c  reason: collision with root package name */
    private Resources f11762c;

    /* renamed from: d  reason: collision with root package name */
    private Animator f11763d;

    /* renamed from: e  reason: collision with root package name */
    float f11764e;

    /* renamed from: f  reason: collision with root package name */
    boolean f11765f;

    /* compiled from: CircularProgressDrawable */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11766a;

        a(c cVar) {
            this.f11766a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f11766a);
            b.this.b(floatValue, this.f11766a, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b  reason: collision with other inner class name */
    /* compiled from: CircularProgressDrawable */
    class C0085b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11768a;

        C0085b(c cVar) {
            this.f11768a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f11768a, true);
            this.f11768a.A();
            this.f11768a.l();
            b bVar = b.this;
            if (bVar.f11765f) {
                bVar.f11765f = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f11768a.x(false);
                return;
            }
            bVar.f11764e += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            b.this.f11764e = 0.0f;
        }
    }

    /* compiled from: CircularProgressDrawable */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final RectF f11770a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f11771b;

        /* renamed from: c  reason: collision with root package name */
        final Paint f11772c;

        /* renamed from: d  reason: collision with root package name */
        final Paint f11773d;

        /* renamed from: e  reason: collision with root package name */
        float f11774e;

        /* renamed from: f  reason: collision with root package name */
        float f11775f;

        /* renamed from: g  reason: collision with root package name */
        float f11776g;

        /* renamed from: h  reason: collision with root package name */
        float f11777h;

        /* renamed from: i  reason: collision with root package name */
        int[] f11778i;
        int j;
        float k;

        /* renamed from: l  reason: collision with root package name */
        float f11779l;

        /* renamed from: m  reason: collision with root package name */
        float f11780m;
        boolean n;

        /* renamed from: o  reason: collision with root package name */
        Path f11781o;

        /* renamed from: p  reason: collision with root package name */
        float f11782p;
        float q;

        /* renamed from: r  reason: collision with root package name */
        int f11783r;

        /* renamed from: s  reason: collision with root package name */
        int f11784s;
        int t;

        /* renamed from: u  reason: collision with root package name */
        int f11785u;

        c() {
            Paint paint = new Paint();
            this.f11771b = paint;
            Paint paint2 = new Paint();
            this.f11772c = paint2;
            Paint paint3 = new Paint();
            this.f11773d = paint3;
            this.f11774e = 0.0f;
            this.f11775f = 0.0f;
            this.f11776g = 0.0f;
            this.f11777h = 5.0f;
            this.f11782p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* access modifiers changed from: package-private */
        public void A() {
            this.k = this.f11774e;
            this.f11779l = this.f11775f;
            this.f11780m = this.f11776g;
        }

        /* access modifiers changed from: package-private */
        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f11770a;
            float f11 = this.q;
            float f12 = (this.f11777h / 2.0f) + f11;
            if (f11 <= 0.0f) {
                f12 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f11783r) * this.f11782p) / 2.0f, this.f11777h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f12, ((float) rect.centerY()) - f12, ((float) rect.centerX()) + f12, ((float) rect.centerY()) + f12);
            float f13 = this.f11774e;
            float f14 = this.f11776g;
            float f15 = (f13 + f14) * 360.0f;
            float f16 = ((this.f11775f + f14) * 360.0f) - f15;
            this.f11771b.setColor(this.f11785u);
            this.f11771b.setAlpha(this.t);
            float f17 = this.f11777h / 2.0f;
            rectF.inset(f17, f17);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f11773d);
            float f18 = -f17;
            rectF.inset(f18, f18);
            canvas.drawArc(rectF, f15, f16, false, this.f11771b);
            b(canvas, f15, f16, rectF);
        }

        /* access modifiers changed from: package-private */
        public void b(Canvas canvas, float f11, float f12, RectF rectF) {
            if (this.n) {
                Path path = this.f11781o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f11781o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f11781o.moveTo(0.0f, 0.0f);
                this.f11781o.lineTo(((float) this.f11783r) * this.f11782p, 0.0f);
                Path path3 = this.f11781o;
                float f13 = this.f11782p;
                path3.lineTo((((float) this.f11783r) * f13) / 2.0f, ((float) this.f11784s) * f13);
                this.f11781o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f11783r) * this.f11782p) / 2.0f), rectF.centerY() + (this.f11777h / 2.0f));
                this.f11781o.close();
                this.f11772c.setColor(this.f11785u);
                this.f11772c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f11 + f12, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f11781o, this.f11772c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return this.t;
        }

        /* access modifiers changed from: package-private */
        public float d() {
            return this.f11775f;
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.f11778i[f()];
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return (this.j + 1) % this.f11778i.length;
        }

        /* access modifiers changed from: package-private */
        public float g() {
            return this.f11774e;
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.f11778i[this.j];
        }

        /* access modifiers changed from: package-private */
        public float i() {
            return this.f11779l;
        }

        /* access modifiers changed from: package-private */
        public float j() {
            return this.f11780m;
        }

        /* access modifiers changed from: package-private */
        public float k() {
            return this.k;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            t(f());
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.k = 0.0f;
            this.f11779l = 0.0f;
            this.f11780m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        /* access modifiers changed from: package-private */
        public void n(int i11) {
            this.t = i11;
        }

        /* access modifiers changed from: package-private */
        public void o(float f11, float f12) {
            this.f11783r = (int) f11;
            this.f11784s = (int) f12;
        }

        /* access modifiers changed from: package-private */
        public void p(float f11) {
            if (f11 != this.f11782p) {
                this.f11782p = f11;
            }
        }

        /* access modifiers changed from: package-private */
        public void q(float f11) {
            this.q = f11;
        }

        /* access modifiers changed from: package-private */
        public void r(int i11) {
            this.f11785u = i11;
        }

        /* access modifiers changed from: package-private */
        public void s(ColorFilter colorFilter) {
            this.f11771b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        public void t(int i11) {
            this.j = i11;
            this.f11785u = this.f11778i[i11];
        }

        /* access modifiers changed from: package-private */
        public void u(int[] iArr) {
            this.f11778i = iArr;
            t(0);
        }

        /* access modifiers changed from: package-private */
        public void v(float f11) {
            this.f11775f = f11;
        }

        /* access modifiers changed from: package-private */
        public void w(float f11) {
            this.f11776g = f11;
        }

        /* access modifiers changed from: package-private */
        public void x(boolean z11) {
            if (this.n != z11) {
                this.n = z11;
            }
        }

        /* access modifiers changed from: package-private */
        public void y(float f11) {
            this.f11774e = f11;
        }

        /* access modifiers changed from: package-private */
        public void z(float f11) {
            this.f11777h = f11;
            this.f11771b.setStrokeWidth(f11);
        }
    }

    public b(Context context) {
        this.f11762c = ((Context) g.g(context)).getResources();
        c cVar = new c();
        this.f11760a = cVar;
        cVar.u(f11759i);
        k(2.5f);
        m();
    }

    private void a(float f11, c cVar) {
        n(f11, cVar);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f11));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((((float) (Math.floor((double) (cVar.j() / 0.8f)) + 1.0d)) - cVar.j()) * f11));
    }

    private int c(float f11, int i11, int i12) {
        int i13 = (i11 >> 24) & 255;
        int i14 = (i11 >> 16) & 255;
        int i15 = (i11 >> 8) & 255;
        int i16 = i11 & 255;
        return ((i13 + ((int) (((float) (((i12 >> 24) & 255) - i13)) * f11))) << 24) | ((i14 + ((int) (((float) (((i12 >> 16) & 255) - i14)) * f11))) << 16) | ((i15 + ((int) (((float) (((i12 >> 8) & 255) - i15)) * f11))) << 8) | (i16 + ((int) (f11 * ((float) ((i12 & 255) - i16)))));
    }

    private void h(float f11) {
        this.f11761b = f11;
    }

    private void i(float f11, float f12, float f13, float f14) {
        c cVar = this.f11760a;
        float f15 = this.f11762c.getDisplayMetrics().density;
        cVar.z(f12 * f15);
        cVar.q(f11 * f15);
        cVar.t(0);
        cVar.o(f13 * f15, f14 * f15);
    }

    private void m() {
        c cVar = this.f11760a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f11757g);
        ofFloat.addListener(new C0085b(cVar));
        this.f11763d = ofFloat;
    }

    /* access modifiers changed from: package-private */
    public void b(float f11, c cVar, boolean z11) {
        float f12;
        float f13;
        if (this.f11765f) {
            a(f11, cVar);
        } else if (f11 != 1.0f || z11) {
            float j = cVar.j();
            if (f11 < 0.5f) {
                f12 = cVar.k();
                f13 = (f11758h.getInterpolation(f11 / 0.5f) * 0.79f) + 0.01f + f12;
            } else {
                float k = cVar.k() + 0.79f;
                float f14 = k;
                f12 = k - (((1.0f - f11758h.getInterpolation((f11 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f13 = f14;
            }
            cVar.y(f12);
            cVar.v(f13);
            cVar.w(j + (0.20999998f * f11));
            h((f11 + this.f11764e) * 216.0f);
        }
    }

    public void d(boolean z11) {
        this.f11760a.x(z11);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f11761b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f11760a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f11) {
        this.f11760a.p(f11);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f11760a.u(iArr);
        this.f11760a.t(0);
        invalidateSelf();
    }

    public void g(float f11) {
        this.f11760a.w(f11);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f11760a.c();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f11763d.isRunning();
    }

    public void j(float f11, float f12) {
        this.f11760a.y(f11);
        this.f11760a.v(f12);
        invalidateSelf();
    }

    public void k(float f11) {
        this.f11760a.z(f11);
        invalidateSelf();
    }

    public void l(int i11) {
        if (i11 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void n(float f11, c cVar) {
        if (f11 > 0.75f) {
            cVar.r(c((f11 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    public void setAlpha(int i11) {
        this.f11760a.n(i11);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f11760a.s(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f11763d.cancel();
        this.f11760a.A();
        if (this.f11760a.d() != this.f11760a.g()) {
            this.f11765f = true;
            this.f11763d.setDuration(666);
            this.f11763d.start();
            return;
        }
        this.f11760a.t(0);
        this.f11760a.m();
        this.f11763d.setDuration(1332);
        this.f11763d.start();
    }

    public void stop() {
        this.f11763d.cancel();
        h(0.0f);
        this.f11760a.x(false);
        this.f11760a.t(0);
        this.f11760a.m();
        invalidateSelf();
    }
}
