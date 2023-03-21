package androidx.compose.ui.text;

import d2.r;
import d2.s;
import d2.t;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Savers.kt */
final class SaversKt$TextUnitSaver$2 extends Lambda implements l<Object, r> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$TextUnitSaver$2 f7519a = new SaversKt$TextUnitSaver$2();

    SaversKt$TextUnitSaver$2() {
        super(1);
    }

    /* renamed from: a */
    public final r invoke(Object obj) {
        p.j(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        t tVar = null;
        Float f11 = obj2 != null ? (Float) obj2 : null;
        p.g(f11);
        float floatValue = f11.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            tVar = (t) obj3;
        }
        p.g(tVar);
        return r.b(s.a(floatValue, tVar.j()));
    }
}
