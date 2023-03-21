package androidx.compose.ui.text;

import a2.h;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Savers.kt */
final class SaversKt$TextGeometricTransformSaver$2 extends Lambda implements l<Object, h> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$TextGeometricTransformSaver$2 f7513a = new SaversKt$TextGeometricTransformSaver$2();

    SaversKt$TextGeometricTransformSaver$2() {
        super(1);
    }

    /* renamed from: a */
    public final h invoke(Object obj) {
        p.j(obj, "it");
        List list = (List) obj;
        return new h(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }
}
