package androidx.compose.ui.text;

import a2.d;
import a2.f;
import a2.j;
import d2.r;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import m0.c;
import p1.m;

/* compiled from: Savers.kt */
final class SaversKt$ParagraphStyleSaver$2 extends Lambda implements l<Object, m> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$ParagraphStyleSaver$2 f7505a = new SaversKt$ParagraphStyleSaver$2();

    SaversKt$ParagraphStyleSaver$2() {
        super(1);
    }

    /* renamed from: a */
    public final m invoke(Object obj) {
        r rVar;
        j jVar;
        p.j(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        d dVar = obj2 != null ? (d) obj2 : null;
        Object obj3 = list.get(1);
        f fVar = obj3 != null ? (f) obj3 : null;
        Object obj4 = list.get(2);
        c<r, Object> j = SaversKt.j(r.f14022b);
        Boolean bool = Boolean.FALSE;
        if (!p.e(obj4, bool) && obj4 != null) {
            rVar = j.a(obj4);
        } else {
            rVar = null;
        }
        p.g(rVar);
        long k = rVar.k();
        Object obj5 = list.get(3);
        c<j, Object> i11 = SaversKt.i(j.f940c);
        if (!p.e(obj5, bool) && obj5 != null) {
            jVar = i11.a(obj5);
        } else {
            jVar = null;
        }
        return new m(dVar, fVar, k, jVar, (i) null);
    }
}
