package androidx.compose.runtime;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;

/* compiled from: Composer.kt */
final class Updater$init$1 extends Lambda implements p<T, k, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<T, k> f6119a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Updater$init$1(l<? super T, k> lVar) {
        super(2);
        this.f6119a = lVar;
    }

    public final void a(T t, k kVar) {
        kotlin.jvm.internal.p.j(kVar, "it");
        this.f6119a.invoke(t);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a(obj, (k) obj2);
        return k.f22762a;
    }
}
