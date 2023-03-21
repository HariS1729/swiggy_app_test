package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSnapHelper */
public class m extends v {

    /* renamed from: d  reason: collision with root package name */
    private q f11451d;

    /* renamed from: e  reason: collision with root package name */
    private q f11452e;

    private float m(RecyclerView.o oVar, q qVar) {
        int max;
        int U = oVar.U();
        if (U == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        for (int i13 = 0; i13 < U; i13++) {
            View T = oVar.T(i13);
            int o02 = oVar.o0(T);
            if (o02 != -1) {
                if (o02 < i11) {
                    view = T;
                    i11 = o02;
                }
                if (o02 > i12) {
                    view2 = T;
                    i12 = o02;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(qVar.d(view), qVar.d(view2)) - Math.min(qVar.g(view), qVar.g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i12 - i11) + 1));
    }

    private int n(View view, q qVar) {
        return (qVar.g(view) + (qVar.e(view) / 2)) - (qVar.m() + (qVar.n() / 2));
    }

    private int o(RecyclerView.o oVar, q qVar, int i11, int i12) {
        int[] d11 = d(i11, i12);
        float m11 = m(oVar, qVar);
        if (m11 <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(d11[0]) > Math.abs(d11[1]) ? d11[0] : d11[1])) / m11);
    }

    private View p(RecyclerView.o oVar, q qVar) {
        int U = oVar.U();
        View view = null;
        if (U == 0) {
            return null;
        }
        int m11 = qVar.m() + (qVar.n() / 2);
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < U; i12++) {
            View T = oVar.T(i12);
            int abs = Math.abs((qVar.g(T) + (qVar.e(T) / 2)) - m11);
            if (abs < i11) {
                view = T;
                i11 = abs;
            }
        }
        return view;
    }

    private q q(RecyclerView.o oVar) {
        q qVar = this.f11452e;
        if (qVar == null || qVar.f11457a != oVar) {
            this.f11452e = q.a(oVar);
        }
        return this.f11452e;
    }

    private q r(RecyclerView.o oVar) {
        q qVar = this.f11451d;
        if (qVar == null || qVar.f11457a != oVar) {
            this.f11451d = q.c(oVar);
        }
        return this.f11451d;
    }

    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.m()) {
            iArr[0] = n(view, q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.l()) {
            iArr[1] = n(view, r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View h(RecyclerView.o oVar) {
        if (oVar.l()) {
            return p(oVar, r(oVar));
        }
        if (oVar.m()) {
            return p(oVar, q(oVar));
        }
        return null;
    }

    public int i(RecyclerView.o oVar, int i11, int i12) {
        int j02;
        View h11;
        int o02;
        int i13;
        PointF a11;
        int i14;
        int i15;
        if (!(oVar instanceof RecyclerView.z.b) || (j02 = oVar.j0()) == 0 || (h11 = h(oVar)) == null || (o02 = oVar.o0(h11)) == -1 || (a11 = ((RecyclerView.z.b) oVar).a(i13)) == null) {
            return -1;
        }
        int i16 = 0;
        if (oVar.m()) {
            i14 = o(oVar, q(oVar), i11, 0);
            if (a11.x < 0.0f) {
                i14 = -i14;
            }
        } else {
            i14 = 0;
        }
        if (oVar.l()) {
            i15 = o(oVar, r(oVar), 0, i12);
            if (a11.y < 0.0f) {
                i15 = -i15;
            }
        } else {
            i15 = 0;
        }
        if (oVar.l()) {
            i14 = i15;
        }
        if (i14 == 0) {
            return -1;
        }
        int i17 = o02 + i14;
        if (i17 >= 0) {
            i16 = i17;
        }
        return i16 >= j02 ? j02 - 1 : i16;
    }
}
