package g3;

import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import kotlin.jvm.internal.p;

/* compiled from: InitializerViewModelFactory.kt */
public final class b implements l0.b {

    /* renamed from: b  reason: collision with root package name */
    private final e<?>[] f14731b;

    public b(e<?>... eVarArr) {
        p.j(eVarArr, "initializers");
        this.f14731b = eVarArr;
    }

    public /* synthetic */ j0 a(Class cls) {
        return m0.a(this, cls);
    }

    public <T extends j0> T b(Class<T> cls, a aVar) {
        p.j(cls, "modelClass");
        p.j(aVar, "extras");
        T t = null;
        for (e<?> eVar : this.f14731b) {
            if (p.e(eVar.a(), cls)) {
                T invoke = eVar.b().invoke(aVar);
                t = invoke instanceof j0 ? (j0) invoke : null;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
