package g3;

import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.p;
import kp0.a;
import lp0.l;

/* compiled from: InitializerViewModelFactory.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<e<?>> f14732a = new ArrayList();

    public final <T extends j0> void a(sp0.c<T> cVar, l<? super a, ? extends T> lVar) {
        p.j(cVar, "clazz");
        p.j(lVar, "initializer");
        this.f14732a.add(new e(a.a(cVar), lVar));
    }

    public final l0.b b() {
        Object[] array = this.f14732a.toArray(new e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        e[] eVarArr = (e[]) array;
        return new b((e[]) Arrays.copyOf(eVarArr, eVarArr.length));
    }
}
