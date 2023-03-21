package in.swiggy.android.supertooltips;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import in.swiggy.android.R;
import in.swiggy.android.supertooltips.ToolTip;
import java.util.ArrayList;

/* compiled from: ToolTipView */
public class a extends LinearLayout implements ViewTreeObserver.OnPreDrawListener, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f18753a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f18754b;

    /* renamed from: c  reason: collision with root package name */
    private ToolTip f18755c;

    /* renamed from: d  reason: collision with root package name */
    private View f18756d;

    /* renamed from: e  reason: collision with root package name */
    private View f18757e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f18758f;

    /* renamed from: g  reason: collision with root package name */
    private int f18759g;

    /* renamed from: h  reason: collision with root package name */
    private int f18760h;

    /* renamed from: i  reason: collision with root package name */
    private int f18761i;
    private c j;

    /* renamed from: in.swiggy.android.supertooltips.a$a  reason: collision with other inner class name */
    /* compiled from: ToolTipView */
    class C0227a extends ViewOutlineProvider {
        C0227a() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 0.0f);
        }
    }

    /* compiled from: ToolTipView */
    private class b extends AnimatorListenerAdapter {
        private b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            if (a.this.getParent() != null) {
                ((ViewManager) a.this.getParent()).removeView(a.this);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* synthetic */ b(a aVar, C0227a aVar2) {
            this();
        }
    }

    /* compiled from: ToolTipView */
    public interface c {
        void a(a aVar);
    }

    public a(Context context) {
        super(context);
        b();
    }

    private void a() {
        int[] iArr = new int[2];
        this.f18756d.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f18756d.getWindowVisibleDisplayFrame(rect);
        int[] iArr2 = new int[2];
        ((View) getParent()).getLocationOnScreen(iArr2);
        int height = this.f18756d.getHeight();
        this.f18760h = iArr[0] - iArr2[0];
        int i11 = iArr[1] - iArr2[1];
        this.f18759g = i11;
        int height2 = i11 - getHeight();
        int max = Math.max(0, this.f18759g + height);
        int i12 = this.f18760h;
        int i13 = this.f18761i;
        int i14 = i12 + i13;
        int i15 = rect.right;
        if (i14 > i15) {
            i12 = i15 - i13;
        }
        if (i12 < 0) {
            i12 = 32;
        }
        setX((float) iArr[0]);
        if (height2 < 0) {
            height2 = max;
        }
        if (this.f18755c.e()) {
            height2 = max + 32;
        }
        if (this.f18755c.a() == ToolTip.AnimationType.NONE) {
            setTranslationY((float) height2);
            setTranslationX((float) i12);
        } else {
            ArrayList arrayList = new ArrayList(5);
            if (this.f18755c.a() == ToolTip.AnimationType.FROM_MASTER_VIEW) {
                arrayList.add(ObjectAnimator.ofFloat(this, "translationY", new float[]{(((float) this.f18759g) + (((float) this.f18756d.getHeight()) / 2.0f)) - (((float) getHeight()) / 2.0f), (float) height2}));
                arrayList.add(ObjectAnimator.ofFloat(this, "translationX", new float[]{(((float) this.f18760h) + (((float) this.f18756d.getWidth()) / 2.0f)) - (((float) this.f18761i) / 2.0f), (float) i12}));
            } else if (this.f18755c.a() == ToolTip.AnimationType.FROM_TOP) {
                arrayList.add(ObjectAnimator.ofFloat(this, "translationY", new float[]{0.0f, (float) height2}));
            }
            arrayList.add(ObjectAnimator.ofFloat(this, "scaleX", new float[]{0.0f, 1.0f}));
            arrayList.add(ObjectAnimator.ofFloat(this, "scaleY", new float[]{0.0f, 1.0f}));
            arrayList.add(ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f}));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.start();
        }
        this.f18757e.setVisibility(0);
    }

    private void b() {
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.tooltip, this, true);
        this.f18753a = (ViewGroup) findViewById(R.id.tooltip_contentholder);
        this.f18754b = (TextView) findViewById(R.id.tooltip_contenttv);
        this.f18757e = findViewById(R.id.tooltipShadow);
        setOnClickListener(this);
        getViewTreeObserver().addOnPreDrawListener(this);
    }

    private void setContentView(View view) {
        this.f18753a.removeAllViews();
        this.f18753a.addView(view);
    }

    public void c() {
        if (this.f18755c.a() != ToolTip.AnimationType.NONE) {
            ArrayList arrayList = new ArrayList(5);
            if (this.f18755c.a() == ToolTip.AnimationType.FROM_MASTER_VIEW) {
                arrayList.add(ObjectAnimator.ofFloat(this, "translationY", new float[]{(float) ((int) getY()), (((float) this.f18759g) + (((float) this.f18756d.getHeight()) / 2.0f)) - (((float) getHeight()) / 2.0f)}));
                arrayList.add(ObjectAnimator.ofFloat(this, "translationX", new float[]{(float) ((int) getX()), (((float) this.f18760h) + (((float) this.f18756d.getWidth()) / 2.0f)) - (((float) this.f18761i) / 2.0f)}));
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this, "translationY", new float[]{getY(), 0.0f}));
            }
            arrayList.add(ObjectAnimator.ofFloat(this, "scaleX", new float[]{1.0f, 0.0f}));
            arrayList.add(ObjectAnimator.ofFloat(this, "scaleY", new float[]{1.0f, 0.0f}));
            arrayList.add(ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f}));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new b(this, (C0227a) null));
            animatorSet.start();
        } else if (getParent() != null) {
            ((ViewManager) getParent()).removeView(this);
        }
    }

    public void d(ToolTip toolTip, View view) {
        this.f18755c = toolTip;
        this.f18756d = view;
        if (toolTip.f() != null) {
            this.f18754b.setText(this.f18755c.f());
        } else if (this.f18755c.h() != 0) {
            this.f18754b.setText(this.f18755c.h());
        }
        if (this.f18755c.i() != null) {
            this.f18754b.setTypeface(this.f18755c.i());
        }
        if (this.f18755c.g() != 0) {
            this.f18754b.setTextColor(this.f18755c.g());
        }
        if (this.f18755c.c() != 0) {
            setColor(this.f18755c.c());
        }
        if (this.f18755c.d() != null) {
            setContentView(this.f18755c.d());
        }
        if (this.f18755c.b().intValue() != -1) {
            this.f18753a.setBackgroundResource(this.f18755c.b().intValue());
        }
        if (this.f18758f) {
            a();
        }
    }

    public float getX() {
        return super.getX();
    }

    public float getY() {
        return super.getY();
    }

    public void onClick(View view) {
        c();
        c cVar = this.j;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public boolean onPreDraw() {
        getViewTreeObserver().removeOnPreDrawListener(this);
        this.f18758f = true;
        this.f18761i = this.f18753a.getWidth() + ((ViewGroup.MarginLayoutParams) this.f18753a.getLayoutParams()).leftMargin + ((ViewGroup.MarginLayoutParams) this.f18753a.getLayoutParams()).rightMargin;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.width = this.f18761i;
        setLayoutParams(layoutParams);
        if (this.f18755c != null) {
            a();
            this.f18753a.setOutlineProvider(new C0227a());
        }
        return true;
    }

    public void setColor(int i11) {
        this.f18753a.setBackgroundColor(i11);
    }

    public void setOnToolTipViewClickedListener(c cVar) {
        this.j = cVar;
    }

    public void setX(float f11) {
        super.setX(f11);
    }

    public void setY(float f11) {
        super.setY(f11);
    }
}
