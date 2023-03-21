package androidx.compose.ui.platform;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.o;
import n1.q;

/* compiled from: TestTag.kt */
final class TestTagKt$testTag$1 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f7174a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TestTagKt$testTag$1(String str) {
        super(1);
        this.f7174a = str;
    }

    public final void a(q qVar) {
        p.j(qVar, "$this$semantics");
        o.N(qVar, this.f7174a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}
