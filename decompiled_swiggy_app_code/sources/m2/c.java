package m2;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* compiled from: WidgetContainer */
public class c extends ConstraintWidget {
    public ArrayList<ConstraintWidget> V0 = new ArrayList<>();

    public c() {
    }

    public void A1() {
        this.V0.clear();
    }

    public void B0(androidx.constraintlayout.core.c cVar) {
        super.B0(cVar);
        int size = this.V0.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.V0.get(i11).B0(cVar);
        }
    }

    public void a(ConstraintWidget constraintWidget) {
        this.V0.add(constraintWidget);
        if (constraintWidget.N() != null) {
            ((c) constraintWidget.N()).z1(constraintWidget);
        }
        constraintWidget.i1(this);
    }

    public void x0() {
        this.V0.clear();
        super.x0();
    }

    public ArrayList<ConstraintWidget> x1() {
        return this.V0;
    }

    public void y1() {
        ArrayList<ConstraintWidget> arrayList = this.V0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ConstraintWidget constraintWidget = this.V0.get(i11);
                if (constraintWidget instanceof c) {
                    ((c) constraintWidget).y1();
                }
            }
        }
    }

    public void z1(ConstraintWidget constraintWidget) {
        this.V0.remove(constraintWidget);
        constraintWidget.x0();
    }

    public c(int i11, int i12) {
        super(i11, i12);
    }
}
