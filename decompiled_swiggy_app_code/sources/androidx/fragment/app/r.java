package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: FragmentStore */
class r {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Fragment> f10511a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, q> f10512b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private m f10513c;

    r() {
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.f10511a.contains(fragment)) {
            synchronized (this.f10511a) {
                this.f10511a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f10512b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.f10512b.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    public void d(int i11) {
        for (q next : this.f10512b.values()) {
            if (next != null) {
                next.u(i11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f10512b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (q next : this.f10512b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment k = next.k();
                    printWriter.println(k);
                    k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(SafeJsonPrimitive.NULL_STRING);
                }
            }
        }
        int size = this.f10511a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i11 = 0; i11 < size; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f10511a.get(i11).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment f(String str) {
        q qVar = this.f10512b.get(str);
        if (qVar != null) {
            return qVar.k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment g(int i11) {
        for (int size = this.f10511a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f10511a.get(size);
            if (fragment != null && fragment.mFragmentId == i11) {
                return fragment;
            }
        }
        for (q next : this.f10512b.values()) {
            if (next != null) {
                Fragment k = next.k();
                if (k.mFragmentId == i11) {
                    return k;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f10511a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f10511a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (q next : this.f10512b.values()) {
            if (next != null) {
                Fragment k = next.k();
                if (str.equals(k.mTag)) {
                    return k;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment findFragmentByWho;
        for (q next : this.f10512b.values()) {
            if (next != null && (findFragmentByWho = next.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f10511a.indexOf(fragment);
        for (int i11 = indexOf - 1; i11 >= 0; i11--) {
            Fragment fragment2 = this.f10511a.get(i11);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f10511a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f10511a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<q> k() {
        ArrayList arrayList = new ArrayList();
        for (q next : this.f10512b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (q next : this.f10512b.values()) {
            if (next != null) {
                arrayList.add(next.k());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public q m(String str) {
        return this.f10512b.get(str);
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> n() {
        ArrayList arrayList;
        if (this.f10511a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f10511a) {
            arrayList = new ArrayList(this.f10511a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public m o() {
        return this.f10513c;
    }

    /* access modifiers changed from: package-private */
    public void p(q qVar) {
        Fragment k = qVar.k();
        if (!c(k.mWho)) {
            this.f10512b.put(k.mWho, qVar);
            if (k.mRetainInstanceChangedWhileDetached) {
                if (k.mRetainInstance) {
                    this.f10513c.k1(k);
                } else {
                    this.f10513c.s1(k);
                }
                k.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(q qVar) {
        Fragment k = qVar.k();
        if (k.mRetainInstance) {
            this.f10513c.s1(k);
        }
        if (this.f10512b.put(k.mWho, (Object) null) != null && FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k);
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        Iterator<Fragment> it2 = this.f10511a.iterator();
        while (it2.hasNext()) {
            q qVar = this.f10512b.get(it2.next().mWho);
            if (qVar != null) {
                qVar.m();
            }
        }
        for (q next : this.f10512b.values()) {
            if (next != null) {
                next.m();
                Fragment k = next.k();
                if (k.mRemoving && !k.isInBackStack()) {
                    q(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(Fragment fragment) {
        synchronized (this.f10511a) {
            this.f10511a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.f10512b.clear();
    }

    /* access modifiers changed from: package-private */
    public void u(List<String> list) {
        this.f10511a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f11 = f(next);
                if (f11 != null) {
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f11);
                    }
                    a(f11);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<FragmentState> v() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f10512b.size());
        for (q next : this.f10512b.values()) {
            if (next != null) {
                Fragment k = next.k();
                FragmentState s11 = next.s();
                arrayList.add(s11);
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k + ": " + s11.f10389m);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> w() {
        synchronized (this.f10511a) {
            if (this.f10511a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f10511a.size());
            Iterator<Fragment> it2 = this.f10511a.iterator();
            while (it2.hasNext()) {
                Fragment next = it2.next();
                arrayList.add(next.mWho);
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    public void x(m mVar) {
        this.f10513c = mVar;
    }
}
