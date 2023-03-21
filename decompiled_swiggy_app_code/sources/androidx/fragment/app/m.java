package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel */
final class m extends j0 {
    private static final l0.b k = new a();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, Fragment> f10492d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, m> f10493e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, o0> f10494f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final boolean f10495g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10496h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10497i = false;
    private boolean j = false;

    /* compiled from: FragmentManagerViewModel */
    class a implements l0.b {
        a() {
        }

        public <T extends j0> T a(Class<T> cls) {
            return new m(true);
        }

        public /* synthetic */ j0 b(Class cls, g3.a aVar) {
            return m0.b(this, cls, aVar);
        }
    }

    m(boolean z11) {
        this.f10495g = z11;
    }

    static m o1(o0 o0Var) {
        return (m) new l0(o0Var, k).a(m.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f10492d.equals(mVar.f10492d) || !this.f10493e.equals(mVar.f10493e) || !this.f10494f.equals(mVar.f10494f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f10492d.hashCode() * 31) + this.f10493e.hashCode()) * 31) + this.f10494f.hashCode();
    }

    /* access modifiers changed from: protected */
    public void i1() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f10496h = true;
    }

    /* access modifiers changed from: package-private */
    public void k1(Fragment fragment) {
        if (this.j) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f10492d.containsKey(fragment.mWho)) {
            this.f10492d.put(fragment.mWho, fragment);
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l1(Fragment fragment) {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m mVar = this.f10493e.get(fragment.mWho);
        if (mVar != null) {
            mVar.i1();
            this.f10493e.remove(fragment.mWho);
        }
        o0 o0Var = this.f10494f.get(fragment.mWho);
        if (o0Var != null) {
            o0Var.a();
            this.f10494f.remove(fragment.mWho);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment m1(String str) {
        return this.f10492d.get(str);
    }

    /* access modifiers changed from: package-private */
    public m n1(Fragment fragment) {
        m mVar = this.f10493e.get(fragment.mWho);
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this.f10495g);
        this.f10493e.put(fragment.mWho, mVar2);
        return mVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection<Fragment> p1() {
        return new ArrayList(this.f10492d.values());
    }

    /* access modifiers changed from: package-private */
    public o0 q1(Fragment fragment) {
        o0 o0Var = this.f10494f.get(fragment.mWho);
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0Var2 = new o0();
        this.f10494f.put(fragment.mWho, o0Var2);
        return o0Var2;
    }

    /* access modifiers changed from: package-private */
    public boolean r1() {
        return this.f10496h;
    }

    /* access modifiers changed from: package-private */
    public void s1(Fragment fragment) {
        if (!this.j) {
            if ((this.f10492d.remove(fragment.mWho) != null) && FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    /* access modifiers changed from: package-private */
    public void t1(boolean z11) {
        this.j = z11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it2 = this.f10492d.values().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it3 = this.f10493e.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it4 = this.f10494f.keySet().iterator();
        while (it4.hasNext()) {
            sb2.append(it4.next());
            if (it4.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean u1(Fragment fragment) {
        if (!this.f10492d.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.f10495g) {
            return this.f10496h;
        }
        return !this.f10497i;
    }
}
