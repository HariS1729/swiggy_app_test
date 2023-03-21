package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import b0.k;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import m0.d;

/* compiled from: BasicText.kt */
final class BasicTextKt$selectionIdSaver$1 extends Lambda implements p<d, Long, Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f4293a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicTextKt$selectionIdSaver$1(k kVar) {
        super(2);
        this.f4293a = kVar;
    }

    public final Long a(d dVar, long j) {
        kotlin.jvm.internal.p.j(dVar, "$this$Saver");
        if (SelectionRegistrarKt.b(this.f4293a, j)) {
            return Long.valueOf(j);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((d) obj, ((Number) obj2).longValue());
    }
}
