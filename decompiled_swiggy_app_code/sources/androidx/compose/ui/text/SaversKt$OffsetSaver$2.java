package androidx.compose.ui.text;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import t0.f;
import t0.g;

/* compiled from: Savers.kt */
final class SaversKt$OffsetSaver$2 extends Lambda implements l<Object, f> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$OffsetSaver$2 f7503a = new SaversKt$OffsetSaver$2();

    SaversKt$OffsetSaver$2() {
        super(1);
    }

    /* renamed from: a */
    public final f invoke(Object obj) {
        p.j(obj, "it");
        if (p.e(obj, Boolean.FALSE)) {
            return f.d(f.f16662b.b());
        }
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f11 = null;
        Float f12 = obj2 != null ? (Float) obj2 : null;
        p.g(f12);
        float floatValue = f12.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            f11 = (Float) obj3;
        }
        p.g(f11);
        return f.d(g.a(floatValue, f11.floatValue()));
    }
}
