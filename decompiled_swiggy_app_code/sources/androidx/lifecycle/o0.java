package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ViewModelStore */
public class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, j0> f10772a = new HashMap<>();

    public final void a() {
        for (j0 f12 : this.f10772a.values()) {
            f12.f1();
        }
        this.f10772a.clear();
    }

    /* access modifiers changed from: package-private */
    public final j0 b(String str) {
        return this.f10772a.get(str);
    }

    /* access modifiers changed from: package-private */
    public Set<String> c() {
        return new HashSet(this.f10772a.keySet());
    }

    /* access modifiers changed from: package-private */
    public final void d(String str, j0 j0Var) {
        j0 put = this.f10772a.put(str, j0Var);
        if (put != null) {
            put.i1();
        }
    }
}
