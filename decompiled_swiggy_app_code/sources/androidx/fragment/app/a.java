package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.s;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: BackStackRecord */
final class a extends s implements FragmentManager.k, FragmentManager.o {
    final FragmentManager t;

    /* renamed from: u  reason: collision with root package name */
    boolean f10411u;
    int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a(FragmentManager fragmentManager) {
        super(fragmentManager.u0(), fragmentManager.x0() != null ? fragmentManager.x0().f().getClassLoader() : null);
        this.v = -1;
        this.t = fragmentManager;
    }

    private static boolean M(s.a aVar) {
        Fragment fragment = aVar.f10530b;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    public s C(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.C(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void D(int i11) {
        if (this.f10522i) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i11);
            }
            int size = this.f10516c.size();
            for (int i12 = 0; i12 < size; i12++) {
                s.a aVar = this.f10516c.get(i12);
                Fragment fragment = aVar.f10530b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i11;
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f10530b + " to " + aVar.f10530b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int E(boolean z11) {
        if (!this.f10411u) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new x("FragmentManager"));
                F("  ", printWriter);
                printWriter.close();
            }
            this.f10411u = true;
            if (this.f10522i) {
                this.v = this.t.k();
            } else {
                this.v = -1;
            }
            this.t.a0(this, z11);
            return this.v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void F(String str, PrintWriter printWriter) {
        G(str, printWriter, true);
    }

    public void G(String str, PrintWriter printWriter, boolean z11) {
        String str2;
        if (z11) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f10411u);
            if (this.f10521h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f10521h));
            }
            if (!(this.f10517d == 0 && this.f10518e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10517d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f10518e));
            }
            if (!(this.f10519f == 0 && this.f10520g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10519f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f10520g));
            }
            if (!(this.f10523l == 0 && this.f10524m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f10523l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f10524m);
            }
            if (!(this.n == 0 && this.f10525o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f10525o);
            }
        }
        if (!this.f10516c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f10516c.size();
            for (int i11 = 0; i11 < size; i11++) {
                s.a aVar = this.f10516c.get(i11);
                switch (aVar.f10529a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f10529a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f10530b);
                if (z11) {
                    if (!(aVar.f10531c == 0 && aVar.f10532d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f10531c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f10532d));
                    }
                    if (aVar.f10533e != 0 || aVar.f10534f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f10533e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f10534f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        int size = this.f10516c.size();
        for (int i11 = 0; i11 < size; i11++) {
            s.a aVar = this.f10516c.get(i11);
            Fragment fragment = aVar.f10530b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f10521h);
                fragment.setSharedElementNames(this.f10526p, this.q);
            }
            switch (aVar.f10529a) {
                case 1:
                    fragment.setAnimations(aVar.f10531c, aVar.f10532d, aVar.f10533e, aVar.f10534f);
                    this.t.t1(fragment, false);
                    this.t.g(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f10531c, aVar.f10532d, aVar.f10533e, aVar.f10534f);
                    this.t.k1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f10531c, aVar.f10532d, aVar.f10533e, aVar.f10534f);
                    this.t.G0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f10531c, aVar.f10532d, aVar.f10533e, aVar.f10534f);
                    this.t.t1(fragment, false);
                    this.t.z1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f10531c, aVar.f10532d, aVar.f10533e, aVar.f10534f);
                    this.t.z(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f10531c, aVar.f10532d, aVar.f10533e, aVar.f10534f);
                    this.t.t1(fragment, false);
                    this.t.m(fragment);
                    break;
                case 8:
                    this.t.x1(fragment);
                    break;
                case 9:
                    this.t.x1((Fragment) null);
                    break;
                case 10:
                    this.t.w1(fragment, aVar.f10536h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f10529a);
            }
            if (!this.f10527r && aVar.f10529a != 1 && fragment != null && !FragmentManager.P) {
                this.t.T0(fragment);
            }
        }
        if (!this.f10527r && !FragmentManager.P) {
            FragmentManager fragmentManager = this.t;
            fragmentManager.U0(fragmentManager.q, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void I(boolean z11) {
        for (int size = this.f10516c.size() - 1; size >= 0; size--) {
            s.a aVar = this.f10516c.get(size);
            Fragment fragment = aVar.f10530b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.p1(this.f10521h));
                fragment.setSharedElementNames(this.q, this.f10526p);
            }
            switch (aVar.f10529a) {
                case 1:
                    fragment.setAnimations(aVar.f10531c, aVar.f10532d, aVar.f10533e, aVar.f10534f);
                    this.t.t1(fragment, true);
                    this.t.k1(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.f10531c, aVar.f10532d, aVar.f10533e, aVar.f10534f);
                    this.t.g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f10531c, aVar.f10532d, aVar.f10533e, aVar.f10534f);
                    this.t.z1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f10531c, aVar.f10532d, aVar.f10533e, aVar.f10534f);
                    this.t.t1(fragment, true);
                    this.t.G0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f10531c, aVar.f10532d, aVar.f10533e, aVar.f10534f);
                    this.t.m(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f10531c, aVar.f10532d, aVar.f10533e, aVar.f10534f);
                    this.t.t1(fragment, true);
                    this.t.z(fragment);
                    break;
                case 8:
                    this.t.x1((Fragment) null);
                    break;
                case 9:
                    this.t.x1(fragment);
                    break;
                case 10:
                    this.t.w1(fragment, aVar.f10535g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f10529a);
            }
            if (!this.f10527r && aVar.f10529a != 3 && fragment != null && !FragmentManager.P) {
                this.t.T0(fragment);
            }
        }
        if (!this.f10527r && z11 && !FragmentManager.P) {
            FragmentManager fragmentManager = this.t;
            fragmentManager.U0(fragmentManager.q, true);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment J(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i11 = 0;
        while (i11 < this.f10516c.size()) {
            s.a aVar = this.f10516c.get(i11);
            int i12 = aVar.f10529a;
            if (i12 != 1) {
                if (i12 == 2) {
                    Fragment fragment3 = aVar.f10530b;
                    int i13 = fragment3.mContainerId;
                    boolean z11 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.mContainerId == i13) {
                            if (fragment4 == fragment3) {
                                z11 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f10516c.add(i11, new s.a(9, fragment4));
                                    i11++;
                                    fragment2 = null;
                                }
                                s.a aVar2 = new s.a(3, fragment4);
                                aVar2.f10531c = aVar.f10531c;
                                aVar2.f10533e = aVar.f10533e;
                                aVar2.f10532d = aVar.f10532d;
                                aVar2.f10534f = aVar.f10534f;
                                this.f10516c.add(i11, aVar2);
                                arrayList2.remove(fragment4);
                                i11++;
                            }
                        }
                    }
                    if (z11) {
                        this.f10516c.remove(i11);
                        i11--;
                    } else {
                        aVar.f10529a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i12 == 3 || i12 == 6) {
                    arrayList2.remove(aVar.f10530b);
                    Fragment fragment5 = aVar.f10530b;
                    if (fragment5 == fragment2) {
                        this.f10516c.add(i11, new s.a(9, fragment5));
                        i11++;
                        fragment2 = null;
                    }
                } else if (i12 != 7) {
                    if (i12 == 8) {
                        this.f10516c.add(i11, new s.a(9, fragment2));
                        i11++;
                        fragment2 = aVar.f10530b;
                    }
                }
                i11++;
            }
            arrayList2.add(aVar.f10530b);
            i11++;
        }
        return fragment2;
    }

    /* access modifiers changed from: package-private */
    public boolean K(int i11) {
        int size = this.f10516c.size();
        for (int i12 = 0; i12 < size; i12++) {
            Fragment fragment = this.f10516c.get(i12).f10530b;
            int i13 = fragment != null ? fragment.mContainerId : 0;
            if (i13 != 0 && i13 == i11) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean L(ArrayList<a> arrayList, int i11, int i12) {
        if (i12 == i11) {
            return false;
        }
        int size = this.f10516c.size();
        int i13 = -1;
        for (int i14 = 0; i14 < size; i14++) {
            Fragment fragment = this.f10516c.get(i14).f10530b;
            int i15 = fragment != null ? fragment.mContainerId : 0;
            if (!(i15 == 0 || i15 == i13)) {
                for (int i16 = i11; i16 < i12; i16++) {
                    a aVar = arrayList.get(i16);
                    int size2 = aVar.f10516c.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        Fragment fragment2 = aVar.f10516c.get(i17).f10530b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i15) {
                            return true;
                        }
                    }
                }
                i13 = i15;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean N() {
        for (int i11 = 0; i11 < this.f10516c.size(); i11++) {
            if (M(this.f10516c.get(i11))) {
                return true;
            }
        }
        return false;
    }

    public void O() {
        if (this.f10528s != null) {
            for (int i11 = 0; i11 < this.f10528s.size(); i11++) {
                this.f10528s.get(i11).run();
            }
            this.f10528s = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void P(Fragment.k kVar) {
        for (int i11 = 0; i11 < this.f10516c.size(); i11++) {
            s.a aVar = this.f10516c.get(i11);
            if (M(aVar)) {
                aVar.f10530b.setOnStartEnterTransitionListener(kVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment Q(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f10516c.size() - 1; size >= 0; size--) {
            s.a aVar = this.f10516c.get(size);
            int i11 = aVar.f10529a;
            if (i11 != 1) {
                if (i11 != 3) {
                    switch (i11) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f10530b;
                            break;
                        case 10:
                            aVar.f10536h = aVar.f10535g;
                            break;
                    }
                }
                arrayList.add(aVar.f10530b);
            }
            arrayList.remove(aVar.f10530b);
        }
        return fragment;
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f10522i) {
            return true;
        }
        this.t.e(this);
        return true;
    }

    public String getName() {
        return this.k;
    }

    public int j() {
        return E(false);
    }

    public int k() {
        return E(true);
    }

    public void l() {
        o();
        this.t.d0(this, false);
    }

    public void m() {
        o();
        this.t.d0(this, true);
    }

    public s n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.n(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void p(int i11, Fragment fragment, String str, int i12) {
        super.p(i11, fragment, str, i12);
        fragment.mFragmentManager = this.t;
    }

    public s q(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.q(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public boolean r() {
        return this.f10516c.isEmpty();
    }

    public s s(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.s(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb2.append(" #");
            sb2.append(this.v);
        }
        if (this.k != null) {
            sb2.append(" ");
            sb2.append(this.k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public s y(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager != this.t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.t);
        } else if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        } else if (state != Lifecycle.State.DESTROYED) {
            return super.y(fragment, state);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public s z(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.t) {
            return super.z(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }
}
