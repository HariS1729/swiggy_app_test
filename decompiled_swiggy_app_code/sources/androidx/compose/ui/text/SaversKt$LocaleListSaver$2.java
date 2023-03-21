package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import m0.c;
import w1.e;
import w1.f;

/* compiled from: Savers.kt */
final class SaversKt$LocaleListSaver$2 extends Lambda implements l<Object, f> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$LocaleListSaver$2 f7499a = new SaversKt$LocaleListSaver$2();

    SaversKt$LocaleListSaver$2() {
        super(1);
    }

    /* renamed from: a */
    public final f invoke(Object obj) {
        p.j(obj, "it");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj2 = list.get(i11);
            c<e, Object> p11 = SaversKt.p(e.f17446b);
            e eVar = null;
            if (!p.e(obj2, Boolean.FALSE) && obj2 != null) {
                eVar = p11.a(obj2);
            }
            p.g(eVar);
            arrayList.add(eVar);
        }
        return new f(arrayList);
    }
}
