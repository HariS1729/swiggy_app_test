package androidx.compose.ui.text;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import p1.a0;
import p1.b0;

/* compiled from: Savers.kt */
final class SaversKt$TextRangeSaver$2 extends Lambda implements l<Object, a0> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$TextRangeSaver$2 f7517a = new SaversKt$TextRangeSaver$2();

    SaversKt$TextRangeSaver$2() {
        super(1);
    }

    /* renamed from: a */
    public final a0 invoke(Object obj) {
        p.j(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num = null;
        Integer num2 = obj2 != null ? (Integer) obj2 : null;
        p.g(num2);
        int intValue = num2.intValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            num = (Integer) obj3;
        }
        p.g(num);
        return a0.b(b0.b(intValue, num.intValue()));
    }
}
