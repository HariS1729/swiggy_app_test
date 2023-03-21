package m2;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.g;
import androidx.constraintlayout.core.widgets.analyzer.m;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: HelperWidget */
public class b extends ConstraintWidget implements a {
    public ConstraintWidget[] V0 = new ConstraintWidget[4];
    public int W0 = 0;

    public void a(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i11 = this.W0 + 1;
            ConstraintWidget[] constraintWidgetArr = this.V0;
            if (i11 > constraintWidgetArr.length) {
                this.V0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.V0;
            int i12 = this.W0;
            constraintWidgetArr2[i12] = constraintWidget;
            this.W0 = i12 + 1;
        }
    }

    public void b() {
        this.W0 = 0;
        Arrays.fill(this.V0, (Object) null);
    }

    public void c(d dVar) {
    }

    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.n(constraintWidget, hashMap);
        b bVar = (b) constraintWidget;
        this.W0 = 0;
        int i11 = bVar.W0;
        for (int i12 = 0; i12 < i11; i12++) {
            a(hashMap.get(bVar.V0[i12]));
        }
    }

    public void x1(ArrayList<m> arrayList, int i11, m mVar) {
        for (int i12 = 0; i12 < this.W0; i12++) {
            mVar.a(this.V0[i12]);
        }
        for (int i13 = 0; i13 < this.W0; i13++) {
            g.a(this.V0[i13], i11, arrayList, mVar);
        }
    }

    public int y1(int i11) {
        int i12;
        int i13;
        for (int i14 = 0; i14 < this.W0; i14++) {
            ConstraintWidget constraintWidget = this.V0[i14];
            if (i11 == 0 && (i13 = constraintWidget.S0) != -1) {
                return i13;
            }
            if (i11 == 1 && (i12 = constraintWidget.T0) != -1) {
                return i12;
            }
        }
        return -1;
    }
}
