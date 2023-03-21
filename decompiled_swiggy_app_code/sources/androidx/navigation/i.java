package androidx.navigation;

import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: NavControllerViewModel */
class i extends j0 {

    /* renamed from: e  reason: collision with root package name */
    private static final l0.b f10917e = new a();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<UUID, o0> f10918d = new HashMap<>();

    /* compiled from: NavControllerViewModel */
    class a implements l0.b {
        a() {
        }

        public <T extends j0> T a(Class<T> cls) {
            return new i();
        }

        public /* synthetic */ j0 b(Class cls, g3.a aVar) {
            return m0.b(this, cls, aVar);
        }
    }

    i() {
    }

    static i l1(o0 o0Var) {
        return (i) new l0(o0Var, f10917e).a(i.class);
    }

    /* access modifiers changed from: protected */
    public void i1() {
        for (o0 a11 : this.f10918d.values()) {
            a11.a();
        }
        this.f10918d.clear();
    }

    /* access modifiers changed from: package-private */
    public void k1(UUID uuid) {
        o0 remove = this.f10918d.remove(uuid);
        if (remove != null) {
            remove.a();
        }
    }

    /* access modifiers changed from: package-private */
    public o0 m1(UUID uuid) {
        o0 o0Var = this.f10918d.get(uuid);
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0Var2 = new o0();
        this.f10918d.put(uuid, o0Var2);
        return o0Var2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator<UUID> it2 = this.f10918d.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
