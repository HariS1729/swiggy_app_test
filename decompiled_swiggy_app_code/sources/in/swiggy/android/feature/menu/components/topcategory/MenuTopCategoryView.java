package in.swiggy.android.feature.menu.components.topcategory;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.R;
import in.swiggy.android.view.SwiggyTextView;
import iz.wy;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: MenuTopCategoryView.kt */
public final class MenuTopCategoryView extends RelativeLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final a f15238d = new a((i) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f15239e = 8;

    /* renamed from: f  reason: collision with root package name */
    private static final String f15240f = MenuTopCategoryView.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private int f15241a = 1;

    /* renamed from: b  reason: collision with root package name */
    private wy f15242b;

    /* renamed from: c  reason: collision with root package name */
    private float f15243c;

    /* compiled from: MenuTopCategoryView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: MenuTopCategoryView.kt */
    public static final class b extends gu.d {
        b() {
        }

        public void onAnimationCancel(Animator animator) {
            p.j(animator, "animation");
            animator.removeAllListeners();
        }
    }

    /* compiled from: MenuTopCategoryView.kt */
    public static final class c extends gu.d {
        c() {
        }

        public void onAnimationCancel(Animator animator) {
            p.j(animator, "animation");
            animator.removeAllListeners();
        }
    }

    /* compiled from: MenuTopCategoryView.kt */
    public static final class d extends gu.d {
        d() {
        }

        public void onAnimationCancel(Animator animator) {
            p.j(animator, "animation");
            animator.removeAllListeners();
        }
    }

    /* compiled from: MenuTopCategoryView.kt */
    public static final class e extends gu.d {
        e() {
        }

        public void onAnimationCancel(Animator animator) {
            p.j(animator, "animation");
            animator.removeAllListeners();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuTopCategoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.j(context, LogCategory.CONTEXT);
        f(context, attributeSet);
    }

    /* access modifiers changed from: private */
    public static final void d(SwiggyTextView swiggyTextView, ValueAnimator valueAnimator) {
        p.j(swiggyTextView, "$textView");
        p.j(valueAnimator, "animator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        swiggyTextView.setTextColor(((Integer) animatedValue).intValue());
    }

    /* access modifiers changed from: private */
    public static final void e(SwiggyTextView swiggyTextView, ValueAnimator valueAnimator) {
        p.j(swiggyTextView, "$textView");
        p.j(valueAnimator, "animator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        swiggyTextView.setTextColor(((Integer) animatedValue).intValue());
    }

    private final void f(Context context, AttributeSet attributeSet) {
        wy x02 = wy.x0(LayoutInflater.from(context), this, true);
        p.i(x02, "inflate(LayoutInflater.from(context), this, true)");
        this.f15242b = x02;
        this.f15243c = (float) getResources().getDimensionPixelSize(R.dimen.dimen_24dp);
    }

    public final void c(boolean z11) {
        if (z11) {
            wy wyVar = this.f15242b;
            wy wyVar2 = null;
            if (wyVar == null) {
                p.B("binding");
                wyVar = null;
            }
            FrameLayout frameLayout = wyVar.D;
            frameLayout.animate().cancel();
            frameLayout.setAlpha(1.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, "translationY", new float[]{this.f15243c, 0.0f});
            ofFloat.setDuration(300);
            ofFloat.setStartDelay(80);
            ofFloat.addListener(new b());
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, "translationY", new float[]{0.0f, -this.f15243c});
            ofFloat2.setDuration(200);
            ofFloat2.setStartDelay(300);
            ofFloat2.addListener(new c());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
            animatorSet.addListener(new d());
            animatorSet.start();
            wy wyVar3 = this.f15242b;
            if (wyVar3 == null) {
                p.B("binding");
            } else {
                wyVar2 = wyVar3;
            }
            SwiggyTextView swiggyTextView = wyVar2.B;
            swiggyTextView.animate().cancel();
            int c11 = androidx.core.content.a.c(swiggyTextView.getContext(), R.color.blackGrape100);
            int c12 = androidx.core.content.a.c(swiggyTextView.getContext(), R.color.white100);
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(c11), Integer.valueOf(c12)});
            ofObject.setDuration(200);
            ofObject.setStartDelay(200);
            ofObject.addUpdateListener(new l60.b(swiggyTextView));
            ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(c12), Integer.valueOf(c11)});
            ofObject2.setDuration(200);
            ofObject2.setStartDelay(300);
            ofObject2.addUpdateListener(new l60.a(swiggyTextView));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(new Animator[]{ofObject, ofObject2});
            animatorSet2.addListener(new e());
            animatorSet2.start();
        }
    }

    public final void setDlsTextColor(int i11) {
        wy wyVar = this.f15242b;
        if (wyVar == null) {
            p.B("binding");
            wyVar = null;
        }
        wyVar.B.setTextColor(i11);
    }

    public final void setDlsTextStyle(int i11) {
        wy wyVar = this.f15242b;
        wy wyVar2 = null;
        if (wyVar == null) {
            p.B("binding");
            wyVar = null;
        }
        wyVar.B.setTextAppearance(i11);
        wy wyVar3 = this.f15242b;
        if (wyVar3 == null) {
            p.B("binding");
        } else {
            wyVar2 = wyVar3;
        }
        wyVar2.C.setTextAppearance(i11);
    }

    public final void setMaxLine(int i11) {
        this.f15241a = i11;
        wy wyVar = this.f15242b;
        wy wyVar2 = null;
        if (wyVar == null) {
            p.B("binding");
            wyVar = null;
        }
        wyVar.B.setMaxLines(i11);
        wy wyVar3 = this.f15242b;
        if (wyVar3 == null) {
            p.B("binding");
            wyVar3 = null;
        }
        wyVar3.C.setMaxLines(i11);
        if (i11 == 1) {
            this.f15243c = (float) getResources().getDimensionPixelSize(R.dimen.dimen_24dp);
        } else {
            this.f15243c = (float) getResources().getDimensionPixelSize(R.dimen.dimen_48dp);
        }
        wy wyVar4 = this.f15242b;
        if (wyVar4 == null) {
            p.B("binding");
        } else {
            wyVar2 = wyVar4;
        }
        wyVar2.D.setTranslationY(this.f15243c);
    }

    public final void setText(String str) {
        p.j(str, "title");
        wy wyVar = this.f15242b;
        wy wyVar2 = null;
        if (wyVar == null) {
            p.B("binding");
            wyVar = null;
        }
        wyVar.B.setText(str);
        wy wyVar3 = this.f15242b;
        if (wyVar3 == null) {
            p.B("binding");
        } else {
            wyVar2 = wyVar3;
        }
        wyVar2.C.setText(str);
    }

    public final void setTextStyle(int i11) {
        wy wyVar = this.f15242b;
        if (wyVar == null) {
            p.B("binding");
            wyVar = null;
        }
        wyVar.B.setTextAppearance(i11);
    }
}
