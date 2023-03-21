package co.hyperverge.hypersnapsdk.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import co.hyperverge.hypersnapsdk.R;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

public class RippleBackground extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f13340a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public float f13341b;

    /* renamed from: c  reason: collision with root package name */
    private float f13342c;

    /* renamed from: d  reason: collision with root package name */
    private int f13343d;

    /* renamed from: e  reason: collision with root package name */
    private int f13344e;

    /* renamed from: f  reason: collision with root package name */
    private int f13345f;

    /* renamed from: g  reason: collision with root package name */
    private float f13346g;

    /* renamed from: h  reason: collision with root package name */
    private int f13347h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Paint f13348i;
    private boolean j = false;
    private AnimatorSet k;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<Animator> f13349l;

    /* renamed from: m  reason: collision with root package name */
    private RelativeLayout.LayoutParams f13350m;
    private ArrayList<a> n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    Handler f13351o = new Handler();

    private class a extends View {
        public a(Context context) {
            super(context);
            setVisibility(4);
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            float min = (float) (Math.min(getWidth(), getHeight()) / 2);
            canvas.drawCircle(min, min, min - RippleBackground.this.f13341b, RippleBackground.this.f13348i);
        }
    }

    public RippleBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    private void b(Context context, AttributeSet attributeSet) {
        if (!isInEditMode()) {
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RippleBackground);
                this.f13340a = obtainStyledAttributes.getColor(R.styleable.RippleBackground_rb_color, getResources().getColor(R.color.ripple_color));
                this.f13341b = obtainStyledAttributes.getDimension(R.styleable.RippleBackground_rb_strokeWidth, getResources().getDimension(R.dimen.rippleStrokeWidth));
                this.f13342c = obtainStyledAttributes.getDimension(R.styleable.RippleBackground_rb_radius, getResources().getDimension(R.dimen.rippleRadius));
                this.f13343d = obtainStyledAttributes.getInt(R.styleable.RippleBackground_rb_duration, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                this.f13344e = obtainStyledAttributes.getInt(R.styleable.RippleBackground_rb_rippleAmount, 6);
                this.f13346g = obtainStyledAttributes.getFloat(R.styleable.RippleBackground_rb_scale, 6.0f);
                this.f13347h = obtainStyledAttributes.getInt(R.styleable.RippleBackground_rb_type, 0);
                obtainStyledAttributes.recycle();
                this.f13345f = this.f13343d / this.f13344e;
                Paint paint = new Paint();
                this.f13348i = paint;
                paint.setAntiAlias(true);
                if (this.f13347h == 0) {
                    this.f13341b = 0.0f;
                    this.f13348i.setStyle(Paint.Style.FILL);
                } else {
                    this.f13348i.setStyle(Paint.Style.STROKE);
                }
                this.f13348i.setColor(this.f13340a);
                int i11 = (int) ((this.f13342c + this.f13341b) * 2.0f);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
                this.f13350m = layoutParams;
                layoutParams.addRule(13, -1);
                AnimatorSet animatorSet = new AnimatorSet();
                this.k = animatorSet;
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                this.f13349l = new ArrayList<>();
                for (int i12 = 0; i12 < this.f13344e; i12++) {
                    a aVar = new a(getContext());
                    addView(aVar, this.f13350m);
                    this.n.add(aVar);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar, "ScaleX", new float[]{1.0f, this.f13346g});
                    ofFloat.setStartDelay((long) (this.f13345f * i12));
                    ofFloat.setDuration((long) this.f13343d);
                    this.f13349l.add(ofFloat);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar, "ScaleY", new float[]{1.0f, this.f13346g});
                    ofFloat2.setStartDelay((long) (this.f13345f * i12));
                    ofFloat2.setDuration((long) this.f13343d);
                    this.f13349l.add(ofFloat2);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aVar, "Alpha", new float[]{1.0f, 0.0f});
                    ofFloat3.setStartDelay((long) (this.f13345f * i12));
                    ofFloat3.setDuration((long) this.f13343d);
                    this.f13349l.add(ofFloat3);
                }
                this.k.playTogether(this.f13349l);
                return;
            }
            throw new IllegalArgumentException("Attributes should be provided to this view,");
        }
    }
}
