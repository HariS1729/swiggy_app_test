package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper */
class t {
    static int a(RecyclerView.a0 a0Var, q qVar, View view, View view2, RecyclerView.o oVar, boolean z11) {
        if (oVar.U() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z11) {
            return Math.abs(oVar.o0(view) - oVar.o0(view2)) + 1;
        }
        return Math.min(qVar.n(), qVar.d(view2) - qVar.g(view));
    }

    static int b(RecyclerView.a0 a0Var, q qVar, View view, View view2, RecyclerView.o oVar, boolean z11, boolean z12) {
        int i11;
        if (oVar.U() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oVar.o0(view), oVar.o0(view2));
        int max = Math.max(oVar.o0(view), oVar.o0(view2));
        if (z12) {
            i11 = Math.max(0, (a0Var.b() - max) - 1);
        } else {
            i11 = Math.max(0, min);
        }
        if (!z11) {
            return i11;
        }
        return Math.round((((float) i11) * (((float) Math.abs(qVar.d(view2) - qVar.g(view))) / ((float) (Math.abs(oVar.o0(view) - oVar.o0(view2)) + 1)))) + ((float) (qVar.m() - qVar.g(view))));
    }

    static int c(RecyclerView.a0 a0Var, q qVar, View view, View view2, RecyclerView.o oVar, boolean z11) {
        if (oVar.U() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z11) {
            return a0Var.b();
        }
        return (int) ((((float) (qVar.d(view2) - qVar.g(view))) / ((float) (Math.abs(oVar.o0(view) - oVar.o0(view2)) + 1))) * ((float) a0Var.b()));
    }
}
