package arrow.typeclasses;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: ContinuationUtils.kt */
final class ContinuationUtilsKt$completionField$2 extends Lambda implements a<Field> {

    /* renamed from: a  reason: collision with root package name */
    public static final ContinuationUtilsKt$completionField$2 f12490a = new ContinuationUtilsKt$completionField$2();

    ContinuationUtilsKt$completionField$2() {
        super(0);
    }

    /* renamed from: a */
    public final Field invoke() {
        Field declaredField = ContinuationUtilsKt.d().getDeclaredField("completion");
        declaredField.setAccessible(true);
        return declaredField;
    }
}
