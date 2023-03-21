package androidx.compose.foundation.text.selection;

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

/* compiled from: SimpleLayout.kt */
final class SimpleLayoutKt$SimpleLayout$1 implements t {

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleLayoutKt$SimpleLayout$1 f4731a = new SimpleLayoutKt$SimpleLayout$1();

    SimpleLayoutKt$SimpleLayout$1() {
    }

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
        p.j(wVar, "$this$Layout");
        p.j(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer num = 0;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((r) list.get(i11)).N(j));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i12 = 0; i12 < size2; i12++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((e0) arrayList.get(i12)).A0()));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i13 = 0; i13 < size3; i13++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((e0) arrayList.get(i13)).e0()));
        }
        return v.b(wVar, intValue, num.intValue(), (Map) null, new SimpleLayoutKt$SimpleLayout$1$measure$1(arrayList), 4, (Object) null);
    }

    public /* synthetic */ int e(j jVar, List list, int i11) {
        return s.b(this, jVar, list, i11);
    }
}
