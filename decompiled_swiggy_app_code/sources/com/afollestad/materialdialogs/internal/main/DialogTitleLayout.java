package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.afollestad.materialdialogs.R;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;
import q7.e;
import q7.f;

/* compiled from: DialogTitleLayout.kt */
public final class DialogTitleLayout extends a {

    /* renamed from: e  reason: collision with root package name */
    private final int f13762e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13763f;

    /* renamed from: g  reason: collision with root package name */
    private final int f13764g;

    /* renamed from: h  reason: collision with root package name */
    private final int f13765h;

    /* renamed from: i  reason: collision with root package name */
    private final int f13766i;
    public ImageView j;
    public TextView k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.k(context, LogCategory.CONTEXT);
        e eVar = e.f16390a;
        this.f13762e = eVar.c(this, R.dimen.md_dialog_frame_margin_vertical);
        this.f13763f = eVar.c(this, R.dimen.md_dialog_title_layout_margin_bottom);
        this.f13764g = eVar.c(this, R.dimen.md_dialog_frame_margin_horizontal);
        this.f13765h = eVar.c(this, R.dimen.md_icon_margin);
        this.f13766i = eVar.c(this, R.dimen.md_icon_size);
    }

    public final boolean b() {
        ImageView imageView = this.j;
        if (imageView == null) {
            p.B("iconView");
        }
        if (f.c(imageView)) {
            TextView textView = this.k;
            if (textView == null) {
                p.B("titleView");
            }
            if (f.c(textView)) {
                return true;
            }
        }
        return false;
    }

    public final ImageView getIconView$core() {
        ImageView imageView = this.j;
        if (imageView == null) {
            p.B("iconView");
        }
        return imageView;
    }

    public final TextView getTitleView$core() {
        TextView textView = this.k;
        if (textView == null) {
            p.B("titleView");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        p.k(canvas, "canvas");
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, ((float) getMeasuredHeight()) - ((float) getDividerHeight()), (float) getMeasuredWidth(), (float) getMeasuredHeight(), a());
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_icon_title);
        p.f(findViewById, "findViewById(R.id.md_icon_title)");
        this.j = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.md_text_title);
        p.f(findViewById2, "findViewById(R.id.md_text_title)");
        this.k = (TextView) findViewById2;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        if (!b()) {
            int i19 = this.f13762e;
            int measuredHeight = getMeasuredHeight() - this.f13763f;
            int i21 = measuredHeight - ((measuredHeight - i19) / 2);
            TextView textView = this.k;
            if (textView == null) {
                p.B("titleView");
            }
            int measuredHeight2 = textView.getMeasuredHeight() / 2;
            int i22 = i21 - measuredHeight2;
            int i23 = measuredHeight2 + i21;
            e eVar = e.f16390a;
            TextView textView2 = this.k;
            if (textView2 == null) {
                p.B("titleView");
            }
            int a11 = i23 + eVar.a(textView2);
            if (f.d(this)) {
                i15 = getMeasuredWidth() - this.f13764g;
                TextView textView3 = this.k;
                if (textView3 == null) {
                    p.B("titleView");
                }
                i16 = i15 - textView3.getMeasuredWidth();
            } else {
                i16 = this.f13764g;
                TextView textView4 = this.k;
                if (textView4 == null) {
                    p.B("titleView");
                }
                i15 = textView4.getMeasuredWidth() + i16;
            }
            ImageView imageView = this.j;
            if (imageView == null) {
                p.B("iconView");
            }
            if (f.e(imageView)) {
                ImageView imageView2 = this.j;
                if (imageView2 == null) {
                    p.B("iconView");
                }
                int measuredHeight3 = imageView2.getMeasuredHeight() / 2;
                int i24 = i21 - measuredHeight3;
                int i25 = i21 + measuredHeight3;
                if (f.d(this)) {
                    ImageView imageView3 = this.j;
                    if (imageView3 == null) {
                        p.B("iconView");
                    }
                    i16 = i15 - imageView3.getMeasuredWidth();
                    i18 = i16 - this.f13765h;
                    TextView textView5 = this.k;
                    if (textView5 == null) {
                        p.B("titleView");
                    }
                    i17 = i18 - textView5.getMeasuredWidth();
                } else {
                    ImageView imageView4 = this.j;
                    if (imageView4 == null) {
                        p.B("iconView");
                    }
                    i15 = imageView4.getMeasuredWidth() + i16;
                    int i26 = this.f13765h + i15;
                    TextView textView6 = this.k;
                    if (textView6 == null) {
                        p.B("titleView");
                    }
                    int measuredWidth = textView6.getMeasuredWidth() + i26;
                    i17 = i26;
                    i18 = measuredWidth;
                }
                ImageView imageView5 = this.j;
                if (imageView5 == null) {
                    p.B("iconView");
                }
                imageView5.layout(i16, i24, i15, i25);
                i15 = i18;
                i16 = i17;
            }
            TextView textView7 = this.k;
            if (textView7 == null) {
                p.B("titleView");
            }
            textView7.layout(i16, i22, i15, a11);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        int i13 = 0;
        if (b()) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i11);
        int i14 = size - (this.f13764g * 2);
        ImageView imageView = this.j;
        if (imageView == null) {
            p.B("iconView");
        }
        if (f.e(imageView)) {
            ImageView imageView2 = this.j;
            if (imageView2 == null) {
                p.B("iconView");
            }
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(this.f13766i, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f13766i, 1073741824));
            ImageView imageView3 = this.j;
            if (imageView3 == null) {
                p.B("iconView");
            }
            i14 -= imageView3.getMeasuredWidth() + this.f13765h;
        }
        TextView textView = this.k;
        if (textView == null) {
            p.B("titleView");
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        ImageView imageView4 = this.j;
        if (imageView4 == null) {
            p.B("iconView");
        }
        if (f.e(imageView4)) {
            ImageView imageView5 = this.j;
            if (imageView5 == null) {
                p.B("iconView");
            }
            i13 = imageView5.getMeasuredHeight();
        }
        TextView textView2 = this.k;
        if (textView2 == null) {
            p.B("titleView");
        }
        setMeasuredDimension(size, l.d(i13, textView2.getMeasuredHeight()) + this.f13762e + this.f13763f);
    }

    public final void setIconView$core(ImageView imageView) {
        p.k(imageView, "<set-?>");
        this.j = imageView;
    }

    public final void setTitleView$core(TextView textView) {
        p.k(textView, "<set-?>");
        this.k = textView;
    }
}
