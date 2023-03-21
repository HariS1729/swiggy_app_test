package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper */
public class r extends v {

    /* renamed from: d  reason: collision with root package name */
    private q f11460d;

    /* renamed from: e  reason: collision with root package name */
    private q f11461e;

    /* compiled from: PagerSnapHelper */
    class a extends l {
        a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            r rVar = r.this;
            int[] c11 = rVar.c(rVar.f11466a.getLayoutManager(), view);
            int i11 = c11[0];
            int i12 = c11[1];
            int w11 = w(Math.max(Math.abs(i11), Math.abs(i12)));
            if (w11 > 0) {
                aVar.d(i11, i12, w11, this.j);
            }
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        public int x(int i11) {
            return Math.min(100, super.x(i11));
        }
    }

    private int m(View view, q qVar) {
        return (qVar.g(view) + (qVar.e(view) / 2)) - (qVar.m() + (qVar.n() / 2));
    }

    private View n(RecyclerView.o oVar, q qVar) {
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

    private q o(RecyclerView.o oVar) {
        q qVar = this.f11461e;
        if (qVar == null || qVar.f11457a != oVar) {
            this.f11461e = q.a(oVar);
        }
        return this.f11461e;
    }

    private q p(RecyclerView.o oVar) {
        if (oVar.l()) {
            return q(oVar);
        }
        if (oVar.m()) {
            return o(oVar);
        }
        return null;
    }

    private q q(RecyclerView.o oVar) {
        q qVar = this.f11460d;
        if (qVar == null || qVar.f11457a != oVar) {
            this.f11460d = q.c(oVar);
        }
        return this.f11460d;
    }

    private boolean r(RecyclerView.o oVar, int i11, int i12) {
        return oVar.m() ? i11 > 0 : i12 > 0;
    }

    private boolean s(RecyclerView.o oVar) {
        PointF a11;
        int j02 = oVar.j0();
        if (!(oVar instanceof RecyclerView.z.b) || (a11 = ((RecyclerView.z.b) oVar).a(j02 - 1)) == null) {
            return false;
        }
        if (a11.x < 0.0f || a11.y < 0.0f) {
            return true;
        }
        return false;
    }

    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.m()) {
            iArr[0] = m(view, o(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.l()) {
            iArr[1] = m(view, q(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    public RecyclerView.z e(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.z.b)) {
            return null;
        }
        return new a(this.f11466a.getContext());
    }

    public View h(RecyclerView.o oVar) {
        if (oVar.l()) {
            return n(oVar, q(oVar));
        }
        if (oVar.m()) {
            return n(oVar, o(oVar));
        }
        return null;
    }

    public int i(RecyclerView.o oVar, int i11, int i12) {
        q p11;
        int j02 = oVar.j0();
        if (j02 == 0 || (p11 = p(oVar)) == null) {
            return -1;
        }
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        int U = oVar.U();
        View view = null;
        View view2 = null;
        for (int i15 = 0; i15 < U; i15++) {
            View T = oVar.T(i15);
            if (T != null) {
                int m11 = m(T, p11);
                if (m11 <= 0 && m11 > i13) {
                    view2 = T;
                    i13 = m11;
                }
                if (m11 >= 0 && m11 < i14) {
                    view = T;
                    i14 = m11;
                }
            }
        }
        boolean r11 = r(oVar, i11, i12);
        if (r11 && view != null) {
            return oVar.o0(view);
        }
        if (!r11 && view2 != null) {
            return oVar.o0(view2);
        }
        if (r11) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int o02 = oVar.o0(view) + (s(oVar) == r11 ? -1 : 1);
        if (o02 < 0 || o02 >= j02) {
            return -1;
        }
        return o02;
    }
}
