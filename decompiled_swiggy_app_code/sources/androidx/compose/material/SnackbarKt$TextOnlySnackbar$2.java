package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import d2.b;
import i1.e0;
import i1.i;
import i1.j;
import i1.r;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: Snackbar.kt */
final class SnackbarKt$TextOnlySnackbar$2 implements t {

    /* renamed from: a  reason: collision with root package name */
    public static final SnackbarKt$TextOnlySnackbar$2 f5412a = new SnackbarKt$TextOnlySnackbar$2();

    SnackbarKt$TextOnlySnackbar$2() {
    }

    public int a(j jVar, List<? extends i> list, int i11) {
        return t.a.a(this, jVar, list, i11);
    }

    public int b(j jVar, List<? extends i> list, int i11) {
        return t.a.c(this, jVar, list, i11);
    }

    public int c(j jVar, List<? extends i> list, int i11) {
        return t.a.d(this, jVar, list, i11);
    }

    public final u d(w wVar, List<? extends r> list, long j) {
        float f11;
        p.j(wVar, "$this$Layout");
        p.j(list, "measurables");
        boolean z11 = false;
        if (list.size() == 1) {
            e0 N = ((r) s.W(list)).N(j);
            int A = N.A(AlignmentLineKt.a());
            int A2 = N.A(AlignmentLineKt.b());
            if (A != Integer.MIN_VALUE) {
                if (A2 != Integer.MIN_VALUE) {
                    z11 = true;
                }
                if (z11) {
                    if (A == A2) {
                        f11 = SnackbarKt.f5360h;
                    } else {
                        f11 = SnackbarKt.f5361i;
                    }
                    int max = Math.max(wVar.j0(f11), N.e0());
                    return v.b(wVar, b.n(j), max, (Map) null, new SnackbarKt$TextOnlySnackbar$2$measure$4(max, N), 4, (Object) null);
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
            throw new IllegalArgumentException("No baselines for text".toString());
        }
        throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
    }

    public int e(j jVar, List<? extends i> list, int i11) {
        return t.a.b(this, jVar, list, i11);
    }
}
