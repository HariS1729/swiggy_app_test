package q0;

import bp0.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AutofillTree.kt */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, h> f16281a = new LinkedHashMap();

    public final Map<Integer, h> a() {
        return this.f16281a;
    }

    public final k b(int i11, String str) {
        l<String, k> c11;
        p.j(str, "value");
        h hVar = this.f16281a.get(Integer.valueOf(i11));
        if (hVar == null || (c11 = hVar.c()) == null) {
            return null;
        }
        c11.invoke(str);
        return k.f22762a;
    }
}
