package androidx.compose.foundation.text;

import d2.b;
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

/* compiled from: CoreText.kt */
final class CoreTextKt$InlineChildren$1$2 implements t {

    /* renamed from: a  reason: collision with root package name */
    public static final CoreTextKt$InlineChildren$1$2 f4450a = new CoreTextKt$InlineChildren$1$2();

    CoreTextKt$InlineChildren$1$2() {
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
        p.j(list, "children");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((r) list.get(i11)).N(j));
        }
        return v.b(wVar, b.n(j), b.m(j), (Map) null, new CoreTextKt$InlineChildren$1$2$measure$1(arrayList), 4, (Object) null);
    }

    public /* synthetic */ int e(j jVar, List list, int i11) {
        return s.b(this, jVar, list, i11);
    }
}
