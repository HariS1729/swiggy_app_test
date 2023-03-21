package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends a {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void j(ConstraintLayout constraintLayout) {
        i(constraintLayout);
    }

    /* access modifiers changed from: protected */
    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.f8771e = false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
    }

    public void r(ConstraintLayout constraintLayout) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f8749v0.q1(0);
        bVar.f8749v0.R0(0);
    }

    public void setElevation(float f11) {
        super.setElevation(f11);
        h();
    }

    public void setVisibility(int i11) {
        super.setVisibility(i11);
        h();
    }
}
