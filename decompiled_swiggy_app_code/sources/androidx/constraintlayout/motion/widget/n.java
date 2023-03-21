package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;

/* compiled from: MotionHelper */
public class n extends a implements MotionLayout.j {
    private boolean j;
    private boolean k;

    /* renamed from: l  reason: collision with root package name */
    private float f8569l;

    /* renamed from: m  reason: collision with root package name */
    protected View[] f8570m;

    public void A(MotionLayout motionLayout) {
    }

    public void B(Canvas canvas) {
    }

    public void C(Canvas canvas) {
    }

    public void D(MotionLayout motionLayout, HashMap<View, m> hashMap) {
    }

    public void E(View view, float f11) {
    }

    public void a(MotionLayout motionLayout, int i11, int i12, float f11) {
    }

    public void b(MotionLayout motionLayout, int i11) {
    }

    public void c(MotionLayout motionLayout, int i11, int i12) {
    }

    public void d(MotionLayout motionLayout, int i11, boolean z11, float f11) {
    }

    public float getProgress() {
        return this.f8569l;
    }

    /* access modifiers changed from: protected */
    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.MotionHelper_onShow) {
                    this.j = obtainStyledAttributes.getBoolean(index, this.j);
                } else if (index == R.styleable.MotionHelper_onHide) {
                    this.k = obtainStyledAttributes.getBoolean(index, this.k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f11) {
        this.f8569l = f11;
        int i11 = 0;
        if (this.f8768b > 0) {
            this.f8570m = n((ConstraintLayout) getParent());
            while (i11 < this.f8768b) {
                E(this.f8570m[i11], f11);
                i11++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i11 < childCount) {
            View childAt = viewGroup.getChildAt(i11);
            if (!(childAt instanceof n)) {
                E(childAt, f11);
            }
            i11++;
        }
    }

    public boolean x() {
        return false;
    }

    public boolean y() {
        return this.k;
    }

    public boolean z() {
        return this.j;
    }
}
