package androidx.compose.material;

import i1.i;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: TextField.kt */
final class TextFieldMeasurePolicy$minIntrinsicWidth$1 extends Lambda implements p<i, Integer, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldMeasurePolicy$minIntrinsicWidth$1 f5712a = new TextFieldMeasurePolicy$minIntrinsicWidth$1();

    TextFieldMeasurePolicy$minIntrinsicWidth$1() {
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
