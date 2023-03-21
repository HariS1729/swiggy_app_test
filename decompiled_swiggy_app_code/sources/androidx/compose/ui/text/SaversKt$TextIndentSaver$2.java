package androidx.compose.ui.text;

import a2.j;
import d2.r;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import m0.c;

/* compiled from: Savers.kt */
final class SaversKt$TextIndentSaver$2 extends Lambda implements l<Object, j> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$TextIndentSaver$2 f7515a = new SaversKt$TextIndentSaver$2();

    SaversKt$TextIndentSaver$2() {
        super(1);
    }

    /* renamed from: a */
    public final j invoke(Object obj) {
        r rVar;
        p.j(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        r.a aVar = r.f14022b;
        c<r, Object> j = SaversKt.j(aVar);
        Boolean bool = Boolean.FALSE;
        r rVar2 = null;
        if (!p.e(obj2, bool) && obj2 != null) {
            rVar = j.a(obj2);
        } else {
            rVar = null;
        }
        p.g(rVar);
        long k = rVar.k();
        Object obj3 = list.get(1);
        c<r, Object> j11 = SaversKt.j(aVar);
        if (!p.e(obj3, bool) && obj3 != null) {
            rVar2 = j11.a(obj3);
        }
        p.g(rVar2);
        return new j(k, rVar2.k(), (i) null);
    }
}
