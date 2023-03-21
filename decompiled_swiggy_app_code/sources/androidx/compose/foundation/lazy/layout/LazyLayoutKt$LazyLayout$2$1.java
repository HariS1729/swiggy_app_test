package androidx.compose.foundation.lazy.layout;

import d2.b;
import i1.j0;
import i1.u;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import x.e;
import x.f;

/* compiled from: LazyLayout.kt */
final class LazyLayoutKt$LazyLayout$2$1 extends Lambda implements p<j0, b, u> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LazyLayoutItemContentFactory f4121a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<e, b, u> f4122b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyLayoutKt$LazyLayout$2$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, p<? super e, ? super b, ? extends u> pVar) {
        super(2);
        this.f4121a = lazyLayoutItemContentFactory;
        this.f4122b = pVar;
    }

    public final u a(j0 j0Var, long j) {
        kotlin.jvm.internal.p.j(j0Var, "$this$null");
        this.f4121a.e(j0Var, j);
        return this.f4122b.invoke(new f(this.f4121a, j0Var), b.b(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((j0) obj, ((b) obj2).t());
    }
}
