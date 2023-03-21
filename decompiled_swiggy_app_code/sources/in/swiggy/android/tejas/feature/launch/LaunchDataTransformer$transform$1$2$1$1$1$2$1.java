package in.swiggy.android.tejas.feature.launch;

import in.swiggy.android.tejas.feature.launch.model.consumable.Disposition;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: LaunchDataTransformer.kt */
final class LaunchDataTransformer$transform$1$2$1$1$1$2$1 extends Lambda implements q<Integer, String, int[], Boolean> {
    final /* synthetic */ ArrayList<Disposition> $consumableDispositions;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LaunchDataTransformer$transform$1$2$1$1$1$2$1(ArrayList<Disposition> arrayList) {
        super(3);
        this.$consumableDispositions = arrayList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).intValue(), (String) obj2, (int[]) obj3);
    }

    public final Boolean invoke(int i11, String str, int[] iArr) {
        p.j(str, "value");
        p.j(iArr, "possibleRatings");
        return Boolean.valueOf(this.$consumableDispositions.add(new Disposition(i11, str, iArr)));
    }
}
