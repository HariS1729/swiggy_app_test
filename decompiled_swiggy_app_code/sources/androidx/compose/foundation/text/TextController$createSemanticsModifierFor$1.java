package androidx.compose.foundation.text;

import bp0.k;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.o;
import n1.q;
import p1.b;
import p1.y;

/* compiled from: CoreText.kt */
final class TextController$createSemanticsModifierFor$1 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f4511a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TextController f4512b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextController$createSemanticsModifierFor$1(b bVar, TextController textController) {
        super(1);
        this.f4511a = bVar;
        this.f4512b = textController;
    }

    public final void a(q qVar) {
        p.j(qVar, "$this$semantics");
        o.P(qVar, this.f4511a);
        final TextController textController = this.f4512b;
        o.k(qVar, (String) null, new l<List<y>, Boolean>() {
            /* renamed from: a */
            public final Boolean invoke(List<y> list) {
                boolean z11;
                p.j(list, "it");
                if (textController.k().c() != null) {
                    y c11 = textController.k().c();
                    p.g(c11);
                    list.add(c11);
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        }, 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}
