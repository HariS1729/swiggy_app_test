package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import m0.d;
import p1.b;

/* compiled from: Savers.kt */
final class SaversKt$AnnotationRangeListSaver$1 extends Lambda implements p<d, List<? extends b.C0163b<? extends Object>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$AnnotationRangeListSaver$1 f7486a = new SaversKt$AnnotationRangeListSaver$1();

    SaversKt$AnnotationRangeListSaver$1() {
        super(2);
    }

    /* renamed from: a */
    public final Object invoke(d dVar, List<? extends b.C0163b<? extends Object>> list) {
        kotlin.jvm.internal.p.j(dVar, "$this$Saver");
        kotlin.jvm.internal.p.j(list, "it");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(SaversKt.t((b.C0163b) list.get(i11), SaversKt.f7472c, dVar));
        }
        return arrayList;
    }
}
