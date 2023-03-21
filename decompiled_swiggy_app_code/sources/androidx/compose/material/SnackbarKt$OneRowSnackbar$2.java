package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
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
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p;

/* compiled from: Snackbar.kt */
final class SnackbarKt$OneRowSnackbar$2 implements t {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5365a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f5366b;

    SnackbarKt$OneRowSnackbar$2(String str, String str2) {
        this.f5365a = str;
        this.f5366b = str2;
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
        int i11;
        int i12;
        int i13;
        w wVar2 = wVar;
        p.j(wVar2, "$this$Layout");
        p.j(list, "measurables");
        String str = this.f5365a;
        for (r rVar : list) {
            if (p.e(LayoutIdKt.a(rVar), str)) {
                e0 N = rVar.N(j);
                int d11 = l.d((b.n(j) - N.A0()) - wVar2.j0(SnackbarKt.f5358f), b.p(j));
                String str2 = this.f5366b;
                for (r rVar2 : list) {
                    if (p.e(LayoutIdKt.a(rVar2), str2)) {
                        e0 N2 = rVar2.N(b.e(j, 0, d11, 0, 0, 9, (Object) null));
                        int A = N2.A(AlignmentLineKt.a());
                        boolean z11 = true;
                        int i14 = 0;
                        if (A != Integer.MIN_VALUE) {
                            int A2 = N2.A(AlignmentLineKt.b());
                            if (A2 != Integer.MIN_VALUE) {
                                if (A != A2) {
                                    z11 = false;
                                }
                                int n = b.n(j) - N.A0();
                                if (z11) {
                                    int max = Math.max(wVar2.j0(SnackbarKt.f5360h), N.e0());
                                    int e02 = (max - N2.e0()) / 2;
                                    int A3 = N.A(AlignmentLineKt.a());
                                    if (A3 != Integer.MIN_VALUE) {
                                        i14 = (A + e02) - A3;
                                    }
                                    i13 = max;
                                    i11 = i14;
                                    i12 = e02;
                                } else {
                                    int j02 = wVar2.j0(SnackbarKt.f5353a) - A;
                                    i13 = Math.max(wVar2.j0(SnackbarKt.f5361i), N2.e0() + j02);
                                    i12 = j02;
                                    i11 = (i13 - N.e0()) / 2;
                                }
                                return v.b(wVar, b.n(j), i13, (Map) null, new SnackbarKt$OneRowSnackbar$2$measure$4(N2, i12, N, n, i11), 4, (Object) null);
                            }
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        throw new IllegalArgumentException("No baselines for text".toString());
                    }
                    long j11 = j;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int e(j jVar, List<? extends i> list, int i11) {
        return t.a.b(this, jVar, list, i11);
    }
}
