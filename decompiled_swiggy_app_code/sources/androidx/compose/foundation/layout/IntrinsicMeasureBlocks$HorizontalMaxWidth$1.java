package androidx.compose.foundation.layout;

import i1.i;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: RowColumnImpl.kt */
final class IntrinsicMeasureBlocks$HorizontalMaxWidth$1 extends Lambda implements q<List<? extends i>, Integer, Integer, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final IntrinsicMeasureBlocks$HorizontalMaxWidth$1 f3741a = new IntrinsicMeasureBlocks$HorizontalMaxWidth$1();

    IntrinsicMeasureBlocks$HorizontalMaxWidth$1() {
        super(3);
    }

    public final Integer a(List<? extends i> list, int i11, int i12) {
        p.j(list, "measurables");
        AnonymousClass1 r22 = AnonymousClass1.f3742a;
        AnonymousClass2 r32 = AnonymousClass2.f3743a;
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        return Integer.valueOf(RowColumnImplKt.w(list, r22, r32, i11, i12, layoutOrientation, layoutOrientation));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }
}
