package androidx.compose.ui.semantics;

import kotlin.jvm.internal.i;
import lp0.p;
import n1.q;
import sp0.j;

/* compiled from: SemanticsProperties.kt */
public final class SemanticsPropertyKey<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f7460a;

    /* renamed from: b  reason: collision with root package name */
    private final p<T, T, T> f7461b;

    public SemanticsPropertyKey(String str, p<? super T, ? super T, ? extends T> pVar) {
        kotlin.jvm.internal.p.j(str, "name");
        kotlin.jvm.internal.p.j(pVar, "mergePolicy");
        this.f7460a = str;
        this.f7461b = pVar;
    }

    public final String a() {
        return this.f7460a;
    }

    public final T b(T t, T t11) {
        return this.f7461b.invoke(t, t11);
    }

    public final void c(q qVar, j<?> jVar, T t) {
        kotlin.jvm.internal.p.j(qVar, "thisRef");
        kotlin.jvm.internal.p.j(jVar, "property");
        qVar.a(this, t);
    }

    public String toString() {
        return "SemanticsPropertyKey: " + this.f7460a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SemanticsPropertyKey(String str, p pVar, int i11, i iVar) {
        this(str, (i11 & 2) != 0 ? AnonymousClass1.f7462a : pVar);
    }
}
