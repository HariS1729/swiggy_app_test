package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.afollestad.materialdialogs.LayoutMode;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import in.juspay.hyper.constants.LogCategory;
import kotlin.TypeCastException;
import kotlin.jvm.internal.p;
import m7.a;
import q7.c;
import q7.e;
import q7.f;

/* compiled from: DialogLayout.kt */
public final class DialogLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f13748a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13749b;

    /* renamed from: c  reason: collision with root package name */
    private float[] f13750c = new float[0];

    /* renamed from: d  reason: collision with root package name */
    private Paint f13751d;

    /* renamed from: e  reason: collision with root package name */
    private final int f13752e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13753f;

    /* renamed from: g  reason: collision with root package name */
    public MaterialDialog f13754g;

    /* renamed from: h  reason: collision with root package name */
    public DialogTitleLayout f13755h;

    /* renamed from: i  reason: collision with root package name */
    public DialogContentLayout f13756i;
    private DialogActionButtonLayout j;
    private LayoutMode k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f13757l;

    /* renamed from: m  reason: collision with root package name */
    private int f13758m;
    private final Path n;

    /* renamed from: o  reason: collision with root package name */
    private final RectF f13759o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.k(context, LogCategory.CONTEXT);
        e eVar = e.f16390a;
        this.f13752e = eVar.c(this, R.dimen.md_dialog_frame_margin_vertical);
        this.f13753f = eVar.c(this, R.dimen.md_dialog_frame_margin_vertical_less);
        this.k = LayoutMode.WRAP_CONTENT;
        this.f13757l = true;
        this.f13758m = -1;
        this.n = new Path();
        this.f13759o = new RectF();
    }

    private final void b(Canvas canvas, int i11, float f11, float f12, float f13, float f14, float f15) {
        canvas.drawRect(f12, f14, f13, f15, g(i11, f11));
    }

    private final void c(Canvas canvas, int i11, float f11, float f12) {
        f(canvas, i11, 0.0f, (float) getMeasuredWidth(), f11, f12);
    }

    static /* synthetic */ void d(DialogLayout dialogLayout, Canvas canvas, int i11, float f11, float f12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f11 = (float) dialogLayout.getMeasuredHeight();
        }
        if ((i12 & 4) != 0) {
            f12 = f11;
        }
        dialogLayout.c(canvas, i11, f11, f12);
    }

    private final void f(Canvas canvas, int i11, float f11, float f12, float f13, float f14) {
        canvas.drawLine(f11, f13, f12, f14, h(this, i11, 0.0f, 2, (Object) null));
    }

    private final Paint g(int i11, float f11) {
        if (this.f13751d == null) {
            Paint paint = new Paint();
            paint.setStrokeWidth(c.a(this, 1));
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            this.f13751d = paint;
        }
        Paint paint2 = this.f13751d;
        if (paint2 == null) {
            p.v();
        }
        paint2.setColor(i11);
        setAlpha(f11);
        return paint2;
    }

    static /* synthetic */ Paint h(DialogLayout dialogLayout, int i11, float f11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f11 = 1.0f;
        }
        return dialogLayout.g(i11, f11);
    }

    private final void i(Canvas canvas, int i11, float f11, float f12) {
        f(canvas, i11, f11, f12, 0.0f, (float) getMeasuredHeight());
    }

    static /* synthetic */ void j(DialogLayout dialogLayout, Canvas canvas, int i11, float f11, float f12, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f12 = f11;
        }
        dialogLayout.i(canvas, i11, f11, f12);
    }

    public final void a(MaterialDialog materialDialog) {
        p.k(materialDialog, "dialog");
        DialogTitleLayout dialogTitleLayout = this.f13755h;
        if (dialogTitleLayout == null) {
            p.B("titleLayout");
        }
        dialogTitleLayout.setDialog(materialDialog);
        DialogActionButtonLayout dialogActionButtonLayout = this.j;
        if (dialogActionButtonLayout != null) {
            dialogActionButtonLayout.setDialog(materialDialog);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        p.k(canvas, "canvas");
        if (!(this.f13750c.length == 0)) {
            canvas.clipPath(this.n);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z11, boolean z12) {
        DialogTitleLayout dialogTitleLayout = this.f13755h;
        if (dialogTitleLayout == null) {
            p.B("titleLayout");
        }
        dialogTitleLayout.setDrawDivider(z11);
        DialogActionButtonLayout dialogActionButtonLayout = this.j;
        if (dialogActionButtonLayout != null) {
            dialogActionButtonLayout.setDrawDivider(z12);
        }
    }

    public final DialogActionButtonLayout getButtonsLayout() {
        return this.j;
    }

    public final DialogContentLayout getContentLayout() {
        DialogContentLayout dialogContentLayout = this.f13756i;
        if (dialogContentLayout == null) {
            p.B("contentLayout");
        }
        return dialogContentLayout;
    }

    public final float[] getCornerRadii() {
        return this.f13750c;
    }

    public final boolean getDebugMode() {
        return this.f13749b;
    }

    public final MaterialDialog getDialog() {
        MaterialDialog materialDialog = this.f13754g;
        if (materialDialog == null) {
            p.B("dialog");
        }
        return materialDialog;
    }

    public final int getFrameMarginVertical$core() {
        return this.f13752e;
    }

    public final int getFrameMarginVerticalLess$core() {
        return this.f13753f;
    }

    public final LayoutMode getLayoutMode() {
        return this.k;
    }

    public final int getMaxHeight() {
        return this.f13748a;
    }

    public final DialogTitleLayout getTitleLayout() {
        DialogTitleLayout dialogTitleLayout = this.f13755h;
        if (dialogTitleLayout == null) {
            p.B("titleLayout");
        }
        return dialogTitleLayout;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            this.f13758m = e.f16390a.d((WindowManager) systemService).b().intValue();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f11;
        p.k(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f13749b) {
            Canvas canvas2 = canvas;
            j(this, canvas2, -16776961, c.a(this, 24), 0.0f, 4, (Object) null);
            d(this, canvas2, -16776961, c.a(this, 24), 0.0f, 4, (Object) null);
            j(this, canvas, -16776961, ((float) getMeasuredWidth()) - c.a(this, 24), 0.0f, 4, (Object) null);
            DialogTitleLayout dialogTitleLayout = this.f13755h;
            if (dialogTitleLayout == null) {
                p.B("titleLayout");
            }
            if (f.e(dialogTitleLayout)) {
                DialogTitleLayout dialogTitleLayout2 = this.f13755h;
                if (dialogTitleLayout2 == null) {
                    p.B("titleLayout");
                }
                d(this, canvas, -65536, (float) dialogTitleLayout2.getBottom(), 0.0f, 4, (Object) null);
            }
            DialogContentLayout dialogContentLayout = this.f13756i;
            if (dialogContentLayout == null) {
                p.B("contentLayout");
            }
            if (f.e(dialogContentLayout)) {
                DialogContentLayout dialogContentLayout2 = this.f13756i;
                if (dialogContentLayout2 == null) {
                    p.B("contentLayout");
                }
                d(this, canvas, -256, (float) dialogContentLayout2.getTop(), 0.0f, 4, (Object) null);
            }
            if (a.a(this.j)) {
                if (f.d(this)) {
                    f11 = c.a(this, 8);
                } else {
                    f11 = ((float) getMeasuredWidth()) - c.a(this, 8);
                }
                j(this, canvas, -16711681, f11, 0.0f, 4, (Object) null);
                DialogActionButtonLayout dialogActionButtonLayout = this.j;
                if (dialogActionButtonLayout == null || !dialogActionButtonLayout.getStackButtons$core()) {
                    DialogActionButtonLayout dialogActionButtonLayout2 = this.j;
                    if (dialogActionButtonLayout2 != null) {
                        if (dialogActionButtonLayout2 == null) {
                            p.v();
                        }
                        for (DialogActionButton dialogActionButton : dialogActionButtonLayout2.getVisibleButtons()) {
                            DialogActionButtonLayout dialogActionButtonLayout3 = this.j;
                            if (dialogActionButtonLayout3 == null) {
                                p.v();
                            }
                            float top = ((float) dialogActionButtonLayout3.getTop()) + ((float) dialogActionButton.getTop()) + c.a(this, 8);
                            DialogActionButtonLayout dialogActionButtonLayout4 = this.j;
                            if (dialogActionButtonLayout4 == null) {
                                p.v();
                            }
                            b(canvas, -16711681, 0.4f, ((float) dialogActionButton.getLeft()) + c.a(this, 4), ((float) dialogActionButton.getRight()) - c.a(this, 4), top, ((float) dialogActionButtonLayout4.getBottom()) - c.a(this, 8));
                        }
                        DialogActionButtonLayout dialogActionButtonLayout5 = this.j;
                        if (dialogActionButtonLayout5 == null) {
                            p.v();
                        }
                        d(this, canvas, -65281, (float) dialogActionButtonLayout5.getTop(), 0.0f, 4, (Object) null);
                        float measuredHeight = ((float) getMeasuredHeight()) - (c.a(this, 52) - c.a(this, 8));
                        float measuredHeight2 = ((float) getMeasuredHeight()) - c.a(this, 8);
                        Canvas canvas3 = canvas;
                        d(this, canvas3, -65536, measuredHeight, 0.0f, 4, (Object) null);
                        d(this, canvas3, -65536, measuredHeight2, 0.0f, 4, (Object) null);
                        d(this, canvas3, -16776961, measuredHeight - c.a(this, 8), 0.0f, 4, (Object) null);
                        return;
                    }
                    return;
                }
                DialogActionButtonLayout dialogActionButtonLayout6 = this.j;
                if (dialogActionButtonLayout6 == null) {
                    p.v();
                }
                float top2 = ((float) dialogActionButtonLayout6.getTop()) + c.a(this, 8);
                DialogActionButtonLayout dialogActionButtonLayout7 = this.j;
                if (dialogActionButtonLayout7 == null) {
                    p.v();
                }
                float f12 = top2;
                for (DialogActionButton left : dialogActionButtonLayout7.getVisibleButtons()) {
                    float a11 = f12 + c.a(this, 36);
                    b(canvas, -16711681, 0.4f, (float) left.getLeft(), ((float) getMeasuredWidth()) - c.a(this, 8), f12, a11);
                    f12 = a11 + c.a(this, 16);
                }
                DialogActionButtonLayout dialogActionButtonLayout8 = this.j;
                if (dialogActionButtonLayout8 == null) {
                    p.v();
                }
                d(this, canvas, -16776961, (float) dialogActionButtonLayout8.getTop(), 0.0f, 4, (Object) null);
                DialogActionButtonLayout dialogActionButtonLayout9 = this.j;
                if (dialogActionButtonLayout9 == null) {
                    p.v();
                }
                float top3 = ((float) dialogActionButtonLayout9.getTop()) + c.a(this, 8);
                float measuredHeight3 = ((float) getMeasuredHeight()) - c.a(this, 8);
                Canvas canvas4 = canvas;
                d(this, canvas4, -65536, top3, 0.0f, 4, (Object) null);
                d(this, canvas4, -65536, measuredHeight3, 0.0f, 4, (Object) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_title_layout);
        p.f(findViewById, "findViewById(R.id.md_title_layout)");
        this.f13755h = (DialogTitleLayout) findViewById;
        View findViewById2 = findViewById(R.id.md_content_layout);
        p.f(findViewById2, "findViewById(R.id.md_content_layout)");
        this.f13756i = (DialogContentLayout) findViewById2;
        this.j = (DialogActionButtonLayout) findViewById(R.id.md_button_layout);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int measuredWidth = getMeasuredWidth();
        DialogTitleLayout dialogTitleLayout = this.f13755h;
        if (dialogTitleLayout == null) {
            p.B("titleLayout");
        }
        int measuredHeight = dialogTitleLayout.getMeasuredHeight();
        DialogTitleLayout dialogTitleLayout2 = this.f13755h;
        if (dialogTitleLayout2 == null) {
            p.B("titleLayout");
        }
        dialogTitleLayout2.layout(0, 0, measuredWidth, measuredHeight);
        if (this.f13757l) {
            int measuredHeight2 = getMeasuredHeight();
            DialogActionButtonLayout dialogActionButtonLayout = this.j;
            i15 = measuredHeight2 - (dialogActionButtonLayout != null ? dialogActionButtonLayout.getMeasuredHeight() : 0);
            if (a.a(this.j)) {
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight3 = getMeasuredHeight();
                DialogActionButtonLayout dialogActionButtonLayout2 = this.j;
                if (dialogActionButtonLayout2 == null) {
                    p.v();
                }
                dialogActionButtonLayout2.layout(0, i15, measuredWidth2, measuredHeight3);
            }
        } else {
            i15 = getMeasuredHeight();
        }
        int measuredWidth3 = getMeasuredWidth();
        DialogContentLayout dialogContentLayout = this.f13756i;
        if (dialogContentLayout == null) {
            p.B("contentLayout");
        }
        dialogContentLayout.layout(0, measuredHeight, measuredWidth3, i15);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int i13 = this.f13748a;
        if (1 <= i13 && size2 > i13) {
            size2 = i13;
        }
        DialogTitleLayout dialogTitleLayout = this.f13755h;
        if (dialogTitleLayout == null) {
            p.B("titleLayout");
        }
        boolean z11 = false;
        dialogTitleLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (a.a(this.j)) {
            DialogActionButtonLayout dialogActionButtonLayout = this.j;
            if (dialogActionButtonLayout == null) {
                p.v();
            }
            dialogActionButtonLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        DialogTitleLayout dialogTitleLayout2 = this.f13755h;
        if (dialogTitleLayout2 == null) {
            p.B("titleLayout");
        }
        int measuredHeight = dialogTitleLayout2.getMeasuredHeight();
        DialogActionButtonLayout dialogActionButtonLayout2 = this.j;
        int measuredHeight2 = size2 - (measuredHeight + (dialogActionButtonLayout2 != null ? dialogActionButtonLayout2.getMeasuredHeight() : 0));
        DialogContentLayout dialogContentLayout = this.f13756i;
        if (dialogContentLayout == null) {
            p.B("contentLayout");
        }
        dialogContentLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2, Integer.MIN_VALUE));
        if (this.k == LayoutMode.WRAP_CONTENT) {
            DialogTitleLayout dialogTitleLayout3 = this.f13755h;
            if (dialogTitleLayout3 == null) {
                p.B("titleLayout");
            }
            int measuredHeight3 = dialogTitleLayout3.getMeasuredHeight();
            DialogContentLayout dialogContentLayout2 = this.f13756i;
            if (dialogContentLayout2 == null) {
                p.B("contentLayout");
            }
            int measuredHeight4 = measuredHeight3 + dialogContentLayout2.getMeasuredHeight();
            DialogActionButtonLayout dialogActionButtonLayout3 = this.j;
            setMeasuredDimension(size, measuredHeight4 + (dialogActionButtonLayout3 != null ? dialogActionButtonLayout3.getMeasuredHeight() : 0));
        } else {
            setMeasuredDimension(size, this.f13758m);
        }
        if (this.f13750c.length == 0) {
            z11 = true;
        }
        if (!z11) {
            RectF rectF = this.f13759o;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = (float) getMeasuredWidth();
            rectF.bottom = (float) getMeasuredHeight();
            this.n.addRoundRect(this.f13759o, this.f13750c, Path.Direction.CW);
        }
    }

    public final void setButtonsLayout(DialogActionButtonLayout dialogActionButtonLayout) {
        this.j = dialogActionButtonLayout;
    }

    public final void setContentLayout(DialogContentLayout dialogContentLayout) {
        p.k(dialogContentLayout, "<set-?>");
        this.f13756i = dialogContentLayout;
    }

    public final void setCornerRadii(float[] fArr) {
        p.k(fArr, "value");
        this.f13750c = fArr;
        if (!this.n.isEmpty()) {
            this.n.reset();
        }
        invalidate();
    }

    public final void setDebugMode(boolean z11) {
        this.f13749b = z11;
        setWillNotDraw(!z11);
    }

    public final void setDialog(MaterialDialog materialDialog) {
        p.k(materialDialog, "<set-?>");
        this.f13754g = materialDialog;
    }

    public final void setLayoutMode(LayoutMode layoutMode) {
        p.k(layoutMode, "<set-?>");
        this.k = layoutMode;
    }

    public final void setMaxHeight(int i11) {
        this.f13748a = i11;
    }

    public final void setTitleLayout(DialogTitleLayout dialogTitleLayout) {
        p.k(dialogTitleLayout, "<set-?>");
        this.f13755h = dialogTitleLayout;
    }
}
