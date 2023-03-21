package dk0;

import android.animation.ObjectAnimator;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import in.swiggy.android.commonsui.view.CommonTextView;
import in.swiggy.android.commonsui.view.SwiggyEditTextView;
import in.swiggy.android.track.R;
import java.util.Objects;
import kotlin.jvm.internal.p;
import wt.f;

/* compiled from: TrackOrderBindingAdapters.kt */
public final class a {

    /* renamed from: dk0.a$a  reason: collision with other inner class name */
    /* compiled from: TrackOrderBindingAdapters.kt */
    public static final class C0257a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f20102a;

        C0257a(View view) {
            this.f20102a = view;
        }

        public void onAnimationEnd(Animation animation) {
            p.j(animation, "animation");
            super.onAnimationEnd(animation);
            this.f20102a.setVisibility(8);
        }

        public void onAnimationStart(Animation animation) {
            p.j(animation, "animation");
            super.onAnimationStart(animation);
            this.f20102a.setVisibility(0);
        }
    }

    /* compiled from: TrackOrderBindingAdapters.kt */
    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f20103a;

        b(View view) {
            this.f20103a = view;
        }

        public void onAnimationStart(Animation animation) {
            p.j(animation, "animation");
            super.onAnimationStart(animation);
            this.f20103a.setVisibility(0);
        }
    }

    public static final void a(TextView textView, boolean z11, int i11) {
        p.j(textView, "textView");
        if (z11) {
            CharSequence text = textView.getText();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append('#');
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
            spannableStringBuilder.setSpan(new ImageSpan(textView.getContext(), i11, 1), text.length(), text.length() + 1, 33);
            textView.setText(spannableStringBuilder);
        }
    }

    public static final void b(TextView textView, boolean z11, int i11) {
        p.j(textView, "textView");
        if (z11) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(textView.getText()));
            spannableStringBuilder.append("   ");
            spannableStringBuilder.setSpan(new ImageSpan(textView.getContext(), i11, 1), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            textView.setText(spannableStringBuilder);
        }
    }

    public static final void c(ProgressBar progressBar, int i11) {
        p.j(progressBar, "progressBar");
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", new int[]{progressBar.getProgress(), i11});
        ofInt.setDuration(500);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    public static final void d(SwiggyEditTextView swiggyEditTextView, boolean z11) {
        p.j(swiggyEditTextView, "editText");
        if (z11) {
            swiggyEditTextView.clearFocus();
        }
    }

    public static final void e(RecyclerView recyclerView, boolean z11) {
        p.j(recyclerView, "view");
        if (z11) {
            recyclerView.getRecycledViewPool().k(R.layout.layout_track_horizontal_carousal, 0);
        }
    }

    public static final void f(Guideline guideline, float f11) {
        p.j(guideline, "guideline");
        ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f8712a = (int) f11;
        guideline.setLayoutParams(bVar);
    }

    public static final void g(Guideline guideline, float f11) {
        p.j(guideline, "guideline");
        ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f8714b = (int) f11;
        guideline.setLayoutParams(bVar);
    }

    public static final void h(AppCompatImageView appCompatImageView, Integer num) {
        p.j(appCompatImageView, "view");
        if (num != null) {
            appCompatImageView.setColorFilter(num.intValue());
        }
    }

    public static final void i(TextSwitcher textSwitcher, Spannable spannable) {
        p.j(textSwitcher, "view");
        if (!(spannable == null || o.A(spannable))) {
            textSwitcher.setCurrentText(spannable);
        }
    }

    public static final void j(TextSwitcher textSwitcher, String str) {
        p.j(textSwitcher, "view");
        if (!(str == null || o.A(str))) {
            textSwitcher.setCurrentText(str);
        }
    }

    public static final void k(View view, float f11) {
        p.j(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) f11;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void l(LottieAnimationView lottieAnimationView, int i11) {
        p.j(lottieAnimationView, "lottieAnimView");
        if (i11 > 0) {
            lottieAnimationView.setAnimation(i11);
        }
    }

    public static final void m(CommonTextView commonTextView, int i11) {
        p.j(commonTextView, "commonTextView");
        if (i11 == 1) {
            commonTextView.setTextAppearance(commonTextView.getContext(), R.style.TextCondensedBold9spCandy90Caps);
            commonTextView.setBackgroundDrawable(androidx.core.content.a.f(commonTextView.getContext(), R.drawable.transparent_rectangle_with_candyblue90_border));
        } else if (i11 == 2) {
            commonTextView.setTextAppearance(commonTextView.getContext(), R.style.TextCondensedBold9spWhite100Caps);
            commonTextView.setBackgroundDrawable(androidx.core.content.a.f(commonTextView.getContext(), R.color.candy_blue90));
        } else if (i11 == 3) {
            commonTextView.setTextAppearance(commonTextView.getContext(), R.style.TextCondensedBold9spBlackGrape50Caps);
            commonTextView.setBackgroundDrawable(androidx.core.content.a.f(commonTextView.getContext(), R.drawable.transparent_rectangle_with_blackgrape30_border));
        } else if (i11 == 4) {
            commonTextView.setTextAppearance(commonTextView.getContext(), R.style.TextCondensedBold9spWhite100Caps);
            commonTextView.setBackgroundDrawable(androidx.core.content.a.f(commonTextView.getContext(), R.color.track_on_time_bg));
        }
    }

    public static final void n(View view, boolean z11) {
        p.j(view, "view");
        if (z11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.4f});
            ofFloat.setRepeatCount(-1);
            ofFloat.setDuration(800);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.setRepeatMode(2);
            ofFloat.setAutoCancel(true);
            ofFloat.start();
            return;
        }
        view.animate().cancel();
        view.setAlpha(1.0f);
    }

    public static final void o(TextSwitcher textSwitcher, Spannable spannable) {
        p.j(textSwitcher, "view");
        if (!(spannable == null || o.A(spannable))) {
            textSwitcher.setText(spannable);
        }
    }

    public static final void p(TextSwitcher textSwitcher, String str) {
        p.j(textSwitcher, "view");
        if (!(str == null || o.A(str))) {
            textSwitcher.setText(str);
        }
    }

    public static final void q(View view, boolean z11) {
        Animation loadAnimation;
        p.j(view, "view");
        if (z11 && (loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_down)) != null) {
            loadAnimation.setAnimationListener(new C0257a(view));
            view.startAnimation(loadAnimation);
        }
    }

    public static final void r(View view, boolean z11) {
        Animation loadAnimation;
        p.j(view, "view");
        if (z11 && (loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_up_delivered)) != null) {
            loadAnimation.setAnimationListener(new b(view));
            view.startAnimation(loadAnimation);
        }
    }
}
