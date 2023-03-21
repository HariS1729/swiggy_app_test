package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* compiled from: VirtualLayout */
public abstract class i extends a {
    private boolean j;
    private boolean k;

    /* access modifiers changed from: protected */
    public void j(ConstraintLayout constraintLayout) {
        i(constraintLayout);
    }

    /* access modifiers changed from: protected */
    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.j = true;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j || this.k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i11 = 0; i11 < this.f8768b; i11++) {
                    View u11 = constraintLayout.u(this.f8767a[i11]);
                    if (u11 != null) {
                        if (this.j) {
                            u11.setVisibility(visibility);
                        }
                        if (this.k && elevation > 0.0f) {
                            u11.setTranslationZ(u11.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f11) {
        super.setElevation(f11);
        h();
    }

    public void setVisibility(int i11) {
        super.setVisibility(i11);
        h();
    }

    public void x(androidx.constraintlayout.core.widgets.i iVar, int i11, int i12) {
    }
}
