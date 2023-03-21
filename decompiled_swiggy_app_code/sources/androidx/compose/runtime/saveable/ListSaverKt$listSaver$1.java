package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import m0.d;

/* compiled from: ListSaver.kt */
final class ListSaverKt$listSaver$1 extends Lambda implements p<d, Original, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<d, Original, List<Saveable>> f6179a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListSaverKt$listSaver$1(p<? super d, ? super Original, ? extends List<? extends Saveable>> pVar) {
        super(2);
        this.f6179a = pVar;
    }

    /* renamed from: a */
    public final Object invoke(d dVar, Original original) {
        kotlin.jvm.internal.p.j(dVar, "$this$Saver");
        List invoke = this.f6179a.invoke(dVar, original);
        int size = invoke.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = invoke.get(i11);
            if (obj == null || dVar.a(obj)) {
                i11++;
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        if (!invoke.isEmpty()) {
            return new ArrayList(invoke);
        }
        return null;
    }
}
