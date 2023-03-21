package androidx.compose.material;

import i1.i;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1 extends Lambda implements p<i, Integer, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1 f5201a = new OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1();

    OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1() {
        super(2);
    }

    public final Integer a(i iVar, int i11) {
        kotlin.jvm.internal.p.j(iVar, "intrinsicMeasurable");
        return Integer.valueOf(iVar.J(i11));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((i) obj, ((Number) obj2).intValue());
    }
}
