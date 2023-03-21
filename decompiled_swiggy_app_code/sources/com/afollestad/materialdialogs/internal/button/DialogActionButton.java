package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.afollestad.materialdialogs.R;
import i7.d;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import q7.e;
import q7.f;

/* compiled from: DialogActionButton.kt */
public final class DialogActionButton extends AppCompatButton {

    /* renamed from: f  reason: collision with root package name */
    public static final a f13731f = new a((i) null);

    /* renamed from: c  reason: collision with root package name */
    private int f13732c;

    /* renamed from: d  reason: collision with root package name */
    private int f13733d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f13734e;

    /* compiled from: DialogActionButton.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.k(context, LogCategory.CONTEXT);
        setClickable(true);
        setFocusable(true);
    }

    public final void a(Context context, Context context2, boolean z11) {
        int i11;
        int j;
        p.k(context, "baseContext");
        p.k(context2, "appContext");
        e eVar = e.f16390a;
        boolean z12 = true;
        if (eVar.o(context2, R.attr.md_button_casing, 1) != 1) {
            z12 = false;
        }
        setSupportAllCaps(z12);
        boolean b11 = d.b(context2);
        this.f13732c = e.j(eVar, context2, (Integer) null, Integer.valueOf(R.attr.md_color_button_text), new DialogActionButton$update$1(context2), 2, (Object) null);
        if (b11) {
            i11 = R.color.md_disabled_text_light_theme;
        } else {
            i11 = R.color.md_disabled_text_dark_theme;
        }
        this.f13733d = e.j(eVar, context, Integer.valueOf(i11), (Integer) null, (lp0.a) null, 12, (Object) null);
        Integer num = this.f13734e;
        setTextColor(num != null ? num.intValue() : this.f13732c);
        Drawable m11 = e.m(eVar, context, (Integer) null, Integer.valueOf(R.attr.md_button_selector), (Drawable) null, 10, (Object) null);
        if ((m11 instanceof RippleDrawable) && (j = e.j(eVar, context, (Integer) null, Integer.valueOf(R.attr.md_ripple_color), new DialogActionButton$update$2(context2), 2, (Object) null)) != 0) {
            ((RippleDrawable) m11).setColor(ColorStateList.valueOf(j));
        }
        setBackground(m11);
        if (z11) {
            f.f(this);
        } else {
            setGravity(17);
        }
        setEnabled(isEnabled());
    }

    public void setEnabled(boolean z11) {
        int i11;
        super.setEnabled(z11);
        if (z11) {
            Integer num = this.f13734e;
            i11 = num != null ? num.intValue() : this.f13732c;
        } else {
            i11 = this.f13733d;
        }
        setTextColor(i11);
    }
}
