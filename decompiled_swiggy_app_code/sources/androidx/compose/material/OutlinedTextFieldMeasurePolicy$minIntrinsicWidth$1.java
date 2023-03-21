package androidx.compose.material;

import i1.i;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1 extends Lambda implements p<i, Integer, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1 f5202a = new OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1();

    OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1() {
        super(2);
    }

    public final Integer a(i iVar, int i11) {
        kotlin.jvm.internal.p.j(iVar, "intrinsicMeasurable");
        return Integer.valueOf(iVar.K(i11));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((i) obj, ((Number) obj2).intValue());
    }
}
