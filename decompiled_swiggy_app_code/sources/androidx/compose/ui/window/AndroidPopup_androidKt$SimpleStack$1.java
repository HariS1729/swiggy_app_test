package androidx.compose.ui.window;

import i1.e0;
import i1.j;
import i1.r;
import i1.s;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: AndroidPopup.android.kt */
public final class AndroidPopup_androidKt$SimpleStack$1 implements t {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidPopup_androidKt$SimpleStack$1 f7828a = new AndroidPopup_androidKt$SimpleStack$1();

    public /* synthetic */ int a(j jVar, List list, int i11) {
        return s.a(this, jVar, list, i11);
    }

    public /* synthetic */ int b(j jVar, List list, int i11) {
        return s.c(this, jVar, list, i11);
    }

    public /* synthetic */ int c(j jVar, List list, int i11) {
        return s.d(this, jVar, list, i11);
    }

    public final u d(w wVar, List<? extends r> list, long j) {
        int i11;
        int i12;
        p.j(wVar, "$this$Layout");
        p.j(list, "measurables");
        int size = list.size();
        if (size != 0) {
            int i13 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    arrayList.add(((r) list.get(i14)).N(j));
                }
                int l11 = k.l(arrayList);
                if (l11 >= 0) {
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        e0 e0Var = (e0) arrayList.get(i13);
                        i15 = Math.max(i15, e0Var.A0());
                        i16 = Math.max(i16, e0Var.e0());
                        if (i13 == l11) {
                            break;
                        }
                        i13++;
                    }
                    i12 = i15;
                    i11 = i16;
                } else {
                    i12 = 0;
                    i11 = 0;
                }
                return v.b(wVar, i12, i11, (Map) null, new AndroidPopup_androidKt$SimpleStack$1$measure$3(arrayList), 4, (Object) null);
            }
            e0 N = ((r) list.get(0)).N(j);
            return v.b(wVar, N.A0(), N.e0(), (Map) null, new AndroidPopup_androidKt$SimpleStack$1$measure$2(N), 4, (Object) null);
        }
        return v.b(wVar, 0, 0, (Map) null, AndroidPopup_androidKt$SimpleStack$1$measure$1.f7829a, 4, (Object) null);
    }

    public /* synthetic */ int e(j jVar, List list, int i11) {
        return s.b(this, jVar, list, i11);
    }
}
