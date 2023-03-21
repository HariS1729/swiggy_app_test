package androidx.compose.ui.layout;

import kotlin.jvm.internal.FunctionReferenceImpl;
import lp0.p;
import np0.a;

/* compiled from: AlignmentLine.kt */
/* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends FunctionReferenceImpl implements p<Integer, Integer, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final AlignmentLineKt$FirstBaseline$1 f6717a = new AlignmentLineKt$FirstBaseline$1();

    AlignmentLineKt$FirstBaseline$1() {
        super(2, a.class, "min", "min(II)I", 1);
    }

    public final Integer h(int i11, int i12) {
        return Integer.valueOf(Math.min(i11, i12));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return h(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
