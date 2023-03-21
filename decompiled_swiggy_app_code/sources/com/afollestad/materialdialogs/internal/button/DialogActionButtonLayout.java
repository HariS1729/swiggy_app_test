package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.WhichButton;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import kotlin.TypeCastException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import q7.e;
import q7.f;

/* compiled from: DialogActionButtonLayout.kt */
public final class DialogActionButtonLayout extends com.afollestad.materialdialogs.internal.main.a {

    /* renamed from: m  reason: collision with root package name */
    public static final a f13737m = new a((i) null);

    /* renamed from: e  reason: collision with root package name */
    private final int f13738e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13739f;

    /* renamed from: g  reason: collision with root package name */
    private final int f13740g;

    /* renamed from: h  reason: collision with root package name */
    private final int f13741h;

    /* renamed from: i  reason: collision with root package name */
    private final int f13742i;
    private boolean j;
    public DialogActionButton[] k;

    /* renamed from: l  reason: collision with root package name */
    public AppCompatCheckBox f13743l;

    /* compiled from: DialogActionButtonLayout.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: DialogActionButtonLayout.kt */
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DialogActionButtonLayout f13744a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WhichButton f13745b;

        b(DialogActionButtonLayout dialogActionButtonLayout, WhichButton whichButton) {
            this.f13744a = dialogActionButtonLayout;
            this.f13745b = whichButton;
        }

        public final void onClick(View view) {
            this.f13744a.getDialog().k(this.f13745b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogActionButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.k(context, LogCategory.CONTEXT);
        e eVar = e.f16390a;
        this.f13738e = eVar.c(this, R.dimen.md_action_button_frame_padding) - eVar.c(this, R.dimen.md_action_button_inset_horizontal);
        this.f13739f = eVar.c(this, R.dimen.md_action_button_frame_padding_neutral);
        this.f13740g = eVar.c(this, R.dimen.md_action_button_frame_spec_height);
        this.f13741h = eVar.c(this, R.dimen.md_checkbox_prompt_margin_vertical);
        this.f13742i = eVar.c(this, R.dimen.md_checkbox_prompt_margin_horizontal);
    }

    private final int b() {
        if (getVisibleButtons().length == 0) {
            return 0;
        }
        if (!this.j) {
            return this.f13740g;
        }
        return this.f13740g * getVisibleButtons().length;
    }

    public final DialogActionButton[] getActionButtons() {
        DialogActionButton[] dialogActionButtonArr = this.k;
        if (dialogActionButtonArr == null) {
            p.B("actionButtons");
        }
        return dialogActionButtonArr;
    }

    public final AppCompatCheckBox getCheckBoxPrompt() {
        AppCompatCheckBox appCompatCheckBox = this.f13743l;
        if (appCompatCheckBox == null) {
            p.B("checkBoxPrompt");
        }
        return appCompatCheckBox;
    }

    public final boolean getStackButtons$core() {
        return this.j;
    }

    public final DialogActionButton[] getVisibleButtons() {
        DialogActionButton[] dialogActionButtonArr = this.k;
        if (dialogActionButtonArr == null) {
            p.B("actionButtons");
        }
        ArrayList arrayList = new ArrayList();
        for (DialogActionButton dialogActionButton : dialogActionButtonArr) {
            if (f.e(dialogActionButton)) {
                arrayList.add(dialogActionButton);
            }
        }
        Object[] array = arrayList.toArray(new DialogActionButton[0]);
        if (array != null) {
            return (DialogActionButton[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        p.k(canvas, "canvas");
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getDividerHeight(), a());
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_button_positive);
        p.f(findViewById, "findViewById(R.id.md_button_positive)");
        View findViewById2 = findViewById(R.id.md_button_negative);
        p.f(findViewById2, "findViewById(R.id.md_button_negative)");
        View findViewById3 = findViewById(R.id.md_button_neutral);
        p.f(findViewById3, "findViewById(R.id.md_button_neutral)");
        this.k = new DialogActionButton[]{(DialogActionButton) findViewById, (DialogActionButton) findViewById2, (DialogActionButton) findViewById3};
        View findViewById4 = findViewById(R.id.md_checkbox_prompt);
        p.f(findViewById4, "findViewById(R.id.md_checkbox_prompt)");
        this.f13743l = (AppCompatCheckBox) findViewById4;
        DialogActionButton[] dialogActionButtonArr = this.k;
        if (dialogActionButtonArr == null) {
            p.B("actionButtons");
        }
        int length = dialogActionButtonArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            dialogActionButtonArr[i11].setOnClickListener(new b(this, WhichButton.Companion.a(i11)));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        if (m7.a.a(this)) {
            AppCompatCheckBox appCompatCheckBox = this.f13743l;
            if (appCompatCheckBox == null) {
                p.B("checkBoxPrompt");
            }
            if (f.e(appCompatCheckBox)) {
                if (f.d(this)) {
                    i18 = getMeasuredWidth() - this.f13742i;
                    i17 = this.f13741h;
                    AppCompatCheckBox appCompatCheckBox2 = this.f13743l;
                    if (appCompatCheckBox2 == null) {
                        p.B("checkBoxPrompt");
                    }
                    i16 = i18 - appCompatCheckBox2.getMeasuredWidth();
                    AppCompatCheckBox appCompatCheckBox3 = this.f13743l;
                    if (appCompatCheckBox3 == null) {
                        p.B("checkBoxPrompt");
                    }
                    i15 = appCompatCheckBox3.getMeasuredHeight();
                } else {
                    i16 = this.f13742i;
                    i17 = this.f13741h;
                    AppCompatCheckBox appCompatCheckBox4 = this.f13743l;
                    if (appCompatCheckBox4 == null) {
                        p.B("checkBoxPrompt");
                    }
                    i18 = appCompatCheckBox4.getMeasuredWidth() + i16;
                    AppCompatCheckBox appCompatCheckBox5 = this.f13743l;
                    if (appCompatCheckBox5 == null) {
                        p.B("checkBoxPrompt");
                    }
                    i15 = appCompatCheckBox5.getMeasuredHeight();
                }
                int i19 = i15 + i17;
                AppCompatCheckBox appCompatCheckBox6 = this.f13743l;
                if (appCompatCheckBox6 == null) {
                    p.B("checkBoxPrompt");
                }
                appCompatCheckBox6.layout(i16, i17, i18, i19);
            }
            if (this.j) {
                int i21 = this.f13738e;
                int measuredWidth = getMeasuredWidth() - this.f13738e;
                int measuredHeight = getMeasuredHeight();
                for (DialogActionButton layout : ArraysKt___ArraysKt.b0(getVisibleButtons())) {
                    int i22 = measuredHeight - this.f13740g;
                    layout.layout(i21, i22, measuredWidth, measuredHeight);
                    measuredHeight = i22;
                }
                return;
            }
            int measuredHeight2 = getMeasuredHeight() - this.f13740g;
            int measuredHeight3 = getMeasuredHeight();
            if (f.d(this)) {
                DialogActionButton[] dialogActionButtonArr = this.k;
                if (dialogActionButtonArr == null) {
                    p.B("actionButtons");
                }
                if (f.e(dialogActionButtonArr[2])) {
                    DialogActionButton[] dialogActionButtonArr2 = this.k;
                    if (dialogActionButtonArr2 == null) {
                        p.B("actionButtons");
                    }
                    DialogActionButton dialogActionButton = dialogActionButtonArr2[2];
                    int measuredWidth2 = getMeasuredWidth() - this.f13739f;
                    dialogActionButton.layout(measuredWidth2 - dialogActionButton.getMeasuredWidth(), measuredHeight2, measuredWidth2, measuredHeight3);
                }
                int i23 = this.f13738e;
                DialogActionButton[] dialogActionButtonArr3 = this.k;
                if (dialogActionButtonArr3 == null) {
                    p.B("actionButtons");
                }
                if (f.e(dialogActionButtonArr3[0])) {
                    DialogActionButton[] dialogActionButtonArr4 = this.k;
                    if (dialogActionButtonArr4 == null) {
                        p.B("actionButtons");
                    }
                    DialogActionButton dialogActionButton2 = dialogActionButtonArr4[0];
                    int measuredWidth3 = dialogActionButton2.getMeasuredWidth() + i23;
                    dialogActionButton2.layout(i23, measuredHeight2, measuredWidth3, measuredHeight3);
                    i23 = measuredWidth3;
                }
                DialogActionButton[] dialogActionButtonArr5 = this.k;
                if (dialogActionButtonArr5 == null) {
                    p.B("actionButtons");
                }
                if (f.e(dialogActionButtonArr5[1])) {
                    DialogActionButton[] dialogActionButtonArr6 = this.k;
                    if (dialogActionButtonArr6 == null) {
                        p.B("actionButtons");
                    }
                    DialogActionButton dialogActionButton3 = dialogActionButtonArr6[1];
                    dialogActionButton3.layout(i23, measuredHeight2, dialogActionButton3.getMeasuredWidth() + i23, measuredHeight3);
                    return;
                }
                return;
            }
            DialogActionButton[] dialogActionButtonArr7 = this.k;
            if (dialogActionButtonArr7 == null) {
                p.B("actionButtons");
            }
            if (f.e(dialogActionButtonArr7[2])) {
                DialogActionButton[] dialogActionButtonArr8 = this.k;
                if (dialogActionButtonArr8 == null) {
                    p.B("actionButtons");
                }
                DialogActionButton dialogActionButton4 = dialogActionButtonArr8[2];
                int i24 = this.f13739f;
                dialogActionButton4.layout(i24, measuredHeight2, dialogActionButton4.getMeasuredWidth() + i24, measuredHeight3);
            }
            int measuredWidth4 = getMeasuredWidth() - this.f13738e;
            DialogActionButton[] dialogActionButtonArr9 = this.k;
            if (dialogActionButtonArr9 == null) {
                p.B("actionButtons");
            }
            if (f.e(dialogActionButtonArr9[0])) {
                DialogActionButton[] dialogActionButtonArr10 = this.k;
                if (dialogActionButtonArr10 == null) {
                    p.B("actionButtons");
                }
                DialogActionButton dialogActionButton5 = dialogActionButtonArr10[0];
                int measuredWidth5 = measuredWidth4 - dialogActionButton5.getMeasuredWidth();
                dialogActionButton5.layout(measuredWidth5, measuredHeight2, measuredWidth4, measuredHeight3);
                measuredWidth4 = measuredWidth5;
            }
            DialogActionButton[] dialogActionButtonArr11 = this.k;
            if (dialogActionButtonArr11 == null) {
                p.B("actionButtons");
            }
            if (f.e(dialogActionButtonArr11[1])) {
                DialogActionButton[] dialogActionButtonArr12 = this.k;
                if (dialogActionButtonArr12 == null) {
                    p.B("actionButtons");
                }
                DialogActionButton dialogActionButton6 = dialogActionButtonArr12[1];
                dialogActionButton6.layout(measuredWidth4 - dialogActionButton6.getMeasuredWidth(), measuredHeight2, measuredWidth4, measuredHeight3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        if (!m7.a.a(this)) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i11);
        AppCompatCheckBox appCompatCheckBox = this.f13743l;
        if (appCompatCheckBox == null) {
            p.B("checkBoxPrompt");
        }
        if (f.e(appCompatCheckBox)) {
            int i13 = size - (this.f13742i * 2);
            AppCompatCheckBox appCompatCheckBox2 = this.f13743l;
            if (appCompatCheckBox2 == null) {
                p.B("checkBoxPrompt");
            }
            appCompatCheckBox2.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        Context context = getDialog().getContext();
        p.f(context, "dialog.context");
        Context e11 = getDialog().e();
        for (DialogActionButton dialogActionButton : getVisibleButtons()) {
            dialogActionButton.a(context, e11, this.j);
            if (this.j) {
                dialogActionButton.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f13740g, 1073741824));
            } else {
                dialogActionButton.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(this.f13740g, 1073741824));
            }
        }
        if ((!(getVisibleButtons().length == 0)) && !this.j) {
            int i14 = 0;
            for (DialogActionButton measuredWidth : getVisibleButtons()) {
                i14 += measuredWidth.getMeasuredWidth();
            }
            if (i14 >= size && !this.j) {
                this.j = true;
                for (DialogActionButton dialogActionButton2 : getVisibleButtons()) {
                    dialogActionButton2.a(context, e11, true);
                    dialogActionButton2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f13740g, 1073741824));
                }
            }
        }
        int b11 = b();
        AppCompatCheckBox appCompatCheckBox3 = this.f13743l;
        if (appCompatCheckBox3 == null) {
            p.B("checkBoxPrompt");
        }
        if (f.e(appCompatCheckBox3)) {
            AppCompatCheckBox appCompatCheckBox4 = this.f13743l;
            if (appCompatCheckBox4 == null) {
                p.B("checkBoxPrompt");
            }
            b11 += appCompatCheckBox4.getMeasuredHeight() + (this.f13741h * 2);
        }
        setMeasuredDimension(size, b11);
    }

    public final void setActionButtons(DialogActionButton[] dialogActionButtonArr) {
        p.k(dialogActionButtonArr, "<set-?>");
        this.k = dialogActionButtonArr;
    }

    public final void setCheckBoxPrompt(AppCompatCheckBox appCompatCheckBox) {
        p.k(appCompatCheckBox, "<set-?>");
        this.f13743l = appCompatCheckBox;
    }

    public final void setStackButtons$core(boolean z11) {
        this.j = z11;
    }
}
