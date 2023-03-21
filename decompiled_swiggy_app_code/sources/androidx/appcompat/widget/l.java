package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.core.widget.j;

/* compiled from: AppCompatPopupWindow */
class l extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f2204b = false;

    /* renamed from: a  reason: collision with root package name */
    private boolean f2205a;

    public l(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        a(context, attributeSet, i11, i12);
    }

    private void a(Context context, AttributeSet attributeSet, int i11, int i12) {
        o0 v = o0.v(context, attributeSet, R.styleable.PopupWindow, i11, i12);
        int i13 = R.styleable.PopupWindow_overlapAnchor;
        if (v.s(i13)) {
            b(v.a(i13, false));
        }
        setBackgroundDrawable(v.g(R.styleable.PopupWindow_android_popupBackground));
        v.w();
    }

    private void b(boolean z11) {
        if (f2204b) {
            this.f2205a = z11;
        } else {
            j.a(this, z11);
        }
    }

    public void showAsDropDown(View view, int i11, int i12) {
        if (f2204b && this.f2205a) {
            i12 -= view.getHeight();
        }
        super.showAsDropDown(view, i11, i12);
    }

    public void update(View view, int i11, int i12, int i13, int i14) {
        if (f2204b && this.f2205a) {
            i12 -= view.getHeight();
        }
        super.update(view, i11, i12, i13, i14);
    }

    public void showAsDropDown(View view, int i11, int i12, int i13) {
        if (f2204b && this.f2205a) {
            i12 -= view.getHeight();
        }
        super.showAsDropDown(view, i11, i12, i13);
    }
}
