package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.a;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import m2.b;

public class Barrier extends a {
    private int j;
    private int k;

    /* renamed from: l  reason: collision with root package name */
    private a f8683l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void x(ConstraintWidget constraintWidget, int i11, boolean z11) {
        this.k = i11;
        if (z11) {
            int i12 = this.j;
            if (i12 == 5) {
                this.k = 1;
            } else if (i12 == 6) {
                this.k = 0;
            }
        } else {
            int i13 = this.j;
            if (i13 == 5) {
                this.k = 0;
            } else if (i13 == 6) {
                this.k = 1;
            }
        }
        if (constraintWidget instanceof a) {
            ((a) constraintWidget).G1(this.k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f8683l.A1();
    }

    public int getMargin() {
        return this.f8683l.C1();
    }

    public int getType() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.f8683l = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f8683l.F1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.f8683l.H1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f8770d = this.f8683l;
        w();
    }

    public void p(c.a aVar, b bVar, ConstraintLayout.b bVar2, SparseArray<ConstraintWidget> sparseArray) {
        super.p(aVar, bVar, bVar2, sparseArray);
        if (bVar instanceof a) {
            a aVar2 = (a) bVar;
            x(aVar2, aVar.f8805e.f8835h0, ((d) bVar.N()).V1());
            aVar2.F1(aVar.f8805e.f8848p0);
            aVar2.H1(aVar.f8805e.f8837i0);
        }
    }

    public void q(ConstraintWidget constraintWidget, boolean z11) {
        x(constraintWidget, this.j, z11);
    }

    public void setAllowsGoneWidget(boolean z11) {
        this.f8683l.F1(z11);
    }

    public void setDpMargin(int i11) {
        a aVar = this.f8683l;
        aVar.H1((int) ((((float) i11) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i11) {
        this.f8683l.H1(i11);
    }

    public void setType(int i11) {
        this.j = i11;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
