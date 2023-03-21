package androidx.compose.foundation.layout;

import i1.i;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: RowColumnImpl.kt */
final class IntrinsicMeasureBlocks$VerticalMinWidth$1 extends Lambda implements q<List<? extends i>, Integer, Integer, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final IntrinsicMeasureBlocks$VerticalMinWidth$1 f3759a = new IntrinsicMeasureBlocks$VerticalMinWidth$1();

    IntrinsicMeasureBlocks$VerticalMinWidth$1() {
        super(3);
    }

    public final Integer a(List<? extends i> list, int i11, int i12) {
        p.j(list, "measurables");
        return Integer.valueOf(RowColumnImplKt.w(list, AnonymousClass1.f3760a, AnonymousClass2.f3761a, i11, i12, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }
}
