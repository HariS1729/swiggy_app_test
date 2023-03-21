package androidx.lifecycle;

import androidx.lifecycle.l0;
import g3.a;
import kotlin.jvm.internal.p;

/* compiled from: ViewModelProvider.kt */
public final /* synthetic */ class m0 {
    static {
        l0.b.a aVar = l0.b.f10761a;
    }

    public static j0 a(l0.b bVar, Class cls) {
        p.j(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static j0 b(l0.b bVar, Class cls, a aVar) {
        p.j(cls, "modelClass");
        p.j(aVar, "extras");
        return bVar.a(cls);
    }
}
