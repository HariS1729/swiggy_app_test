package androidx.compose.ui.layout;

import kotlin.jvm.internal.FunctionReferenceImpl;
import lp0.p;
import np0.a;

/* compiled from: AlignmentLine.kt */
/* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements p<Integer, Integer, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final AlignmentLineKt$LastBaseline$1 f6718a = new AlignmentLineKt$LastBaseline$1();

    AlignmentLineKt$LastBaseline$1() {
        super(2, a.class, "max", "max(II)I", 1);
    }

    public final Integer h(int i11, int i12) {
        return Integer.valueOf(Math.max(i11, i12));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return h(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
