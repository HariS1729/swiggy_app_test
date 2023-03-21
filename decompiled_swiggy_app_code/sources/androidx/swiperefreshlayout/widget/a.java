package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.a0;

/* compiled from: CircleImageView */
class a extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Animation.AnimationListener f11752a;

    /* renamed from: b  reason: collision with root package name */
    int f11753b;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a  reason: collision with other inner class name */
    /* compiled from: CircleImageView */
    private class C0084a extends OvalShape {

        /* renamed from: a  reason: collision with root package name */
        private RadialGradient f11754a;

        /* renamed from: b  reason: collision with root package name */
        private Paint f11755b = new Paint();

        C0084a(int i11) {
            a.this.f11753b = i11;
            b((int) rect().width());
        }

        private void b(int i11) {
            float f11 = (float) (i11 / 2);
            RadialGradient radialGradient = new RadialGradient(f11, f11, (float) a.this.f11753b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f11754a = radialGradient;
            this.f11755b.setShader(radialGradient);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = a.this.getWidth() / 2;
            float f11 = (float) width;
            float height = (float) (a.this.getHeight() / 2);
            canvas.drawCircle(f11, height, f11, this.f11755b);
            canvas.drawCircle(f11, height, (float) (width - a.this.f11753b), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f11, float f12) {
            super.onResize(f11, f12);
            b((int) f11);
        }
    }

    a(Context context, int i11) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f11 = getContext().getResources().getDisplayMetrics().density;
        int i12 = (int) (1.75f * f11);
        int i13 = (int) (0.0f * f11);
        this.f11753b = (int) (3.5f * f11);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            a0.E0(this, f11 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0084a(this.f11753b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f11753b, (float) i13, (float) i12, 503316480);
            int i14 = this.f11753b;
            setPadding(i14, i14, i14, i14);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i11);
        a0.A0(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f11752a = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f11752a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f11752a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f11753b * 2), getMeasuredHeight() + (this.f11753b * 2));
        }
    }

    public void setBackgroundColor(int i11) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i11);
        }
    }
}
