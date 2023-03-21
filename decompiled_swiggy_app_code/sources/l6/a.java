package l6;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;
import z5.f;

/* compiled from: CircularProgressBar */
public class a extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f15542a;

    /* renamed from: b  reason: collision with root package name */
    private int f15543b;

    /* renamed from: c  reason: collision with root package name */
    private final float f15544c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public float f15545d;

    /* renamed from: e  reason: collision with root package name */
    private float f15546e;

    /* renamed from: f  reason: collision with root package name */
    private int f15547f;

    /* renamed from: g  reason: collision with root package name */
    private int f15548g;

    /* renamed from: h  reason: collision with root package name */
    private int f15549h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15550i;
    private boolean j;
    private int k;

    /* renamed from: l  reason: collision with root package name */
    private int f15551l;

    /* renamed from: m  reason: collision with root package name */
    private int f15552m;
    private final Paint n;

    /* renamed from: o  reason: collision with root package name */
    private final Paint f15553o;

    /* renamed from: l6.a$a  reason: collision with other inner class name */
    /* compiled from: CircularProgressBar */
    class C0145a implements ValueAnimator.AnimatorUpdateListener {
        C0145a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float unused = a.this.f15545d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.invalidate();
        }
    }

    public a(Context context) {
        this(context, (AttributeSet) null);
    }

    private float a(int i11) {
        return (this.f15546e / ((float) this.f15549h)) * ((float) i11);
    }

    private int c(float f11) {
        return (int) ((f11 * ((float) this.f15549h)) / this.f15546e);
    }

    private void d() {
        this.f15542a = getWidth();
        this.f15543b = getHeight();
    }

    private void e(Canvas canvas) {
        float f11 = (float) (((double) this.f15547f) / 2.0d);
        float diameter = ((float) getDiameter()) - f11;
        RectF rectF = new RectF(f11, f11, diameter, diameter);
        this.n.setColor(this.k);
        this.n.setStrokeWidth((float) this.f15547f);
        this.n.setAntiAlias(true);
        this.n.setStrokeCap(this.j ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        this.n.setStyle(Paint.Style.STROKE);
        this.f15553o.setColor(this.f15552m);
        this.f15553o.setStrokeWidth((float) this.f15547f);
        this.f15553o.setAntiAlias(true);
        this.f15553o.setStrokeCap(this.j ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        this.f15553o.setStyle(Paint.Style.STROKE);
        canvas.drawOval(rectF, this.f15553o);
        canvas.drawArc(rectF, -90.0f, this.f15545d, false, this.n);
    }

    private void f(Canvas canvas) {
        this.n.setTextSize(((float) Math.min(this.f15542a, this.f15543b)) / 5.0f);
        this.n.setTextAlign(Paint.Align.CENTER);
        this.n.setStrokeWidth(0.0f);
        this.n.setColor(this.f15551l);
        canvas.drawText(c(this.f15545d) + "%", (float) (canvas.getWidth() / 2), (float) ((int) (((float) (canvas.getHeight() / 2)) - ((this.n.descent() + this.n.ascent()) / 2.0f))), this.n);
    }

    public int getDiameter() {
        return (int) ((float) (Math.min(f.h(), f.a()) - f.i(getContext())));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
        e(canvas);
        if (this.f15550i) {
            f(canvas);
        }
    }

    public void setBackgroundColor(int i11) {
        this.f15552m = i11;
        invalidate();
    }

    public void setMaxProgress(int i11) {
        this.f15545d = a(i11);
    }

    public void setProgress(int i11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f15545d, a(i11)});
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration((long) this.f15548g);
        ofFloat.addUpdateListener(new C0145a());
        ofFloat.start();
    }

    public void setProgressColor(int i11) {
        this.k = i11;
        invalidate();
    }

    public void setProgressWidth(int i11) {
        this.f15547f = i11;
        invalidate();
    }

    public void setTextColor(int i11) {
        this.f15551l = i11;
        invalidate();
    }

    public void setmStrokeWidth(int i11) {
        this.f15547f = i11;
        invalidate();
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15544c = -90.0f;
        this.f15545d = 0.0f;
        this.f15546e = 360.0f;
        this.f15547f = 20;
        this.f15548g = OS2WindowsMetricsTable.WEIGHT_CLASS_NORMAL;
        this.f15549h = 100;
        this.f15550i = false;
        this.j = false;
        this.k = -16777216;
        this.f15551l = -16777216;
        this.f15552m = -16777216;
        this.n = new Paint(1);
        this.f15553o = new Paint(1);
    }
}
