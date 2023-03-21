package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import m0.d;
import w1.e;
import w1.f;

/* compiled from: Savers.kt */
final class SaversKt$LocaleListSaver$1 extends Lambda implements p<d, f, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$LocaleListSaver$1 f7498a = new SaversKt$LocaleListSaver$1();

    SaversKt$LocaleListSaver$1() {
        super(2);
    }

    /* renamed from: a */
    public final Object invoke(d dVar, f fVar) {
        kotlin.jvm.internal.p.j(dVar, "$this$Saver");
        kotlin.jvm.internal.p.j(fVar, "it");
        List<e> f11 = fVar.f();
        ArrayList arrayList = new ArrayList(f11.size());
        int size = f11.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(SaversKt.t(f11.get(i11), SaversKt.p(e.f17446b), dVar));
        }
        return arrayList;
    }
}
