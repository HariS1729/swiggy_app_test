package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a0;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    private final g f10514a;

    /* renamed from: b  reason: collision with root package name */
    private final ClassLoader f10515b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<a> f10516c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    int f10517d;

    /* renamed from: e  reason: collision with root package name */
    int f10518e;

    /* renamed from: f  reason: collision with root package name */
    int f10519f;

    /* renamed from: g  reason: collision with root package name */
    int f10520g;

    /* renamed from: h  reason: collision with root package name */
    int f10521h;

    /* renamed from: i  reason: collision with root package name */
    boolean f10522i;
    boolean j = true;
    String k;

    /* renamed from: l  reason: collision with root package name */
    int f10523l;

    /* renamed from: m  reason: collision with root package name */
    CharSequence f10524m;
    int n;

    /* renamed from: o  reason: collision with root package name */
    CharSequence f10525o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<String> f10526p;
    ArrayList<String> q;

    /* renamed from: r  reason: collision with root package name */
    boolean f10527r = false;

    /* renamed from: s  reason: collision with root package name */
    ArrayList<Runnable> f10528s;

    /* compiled from: FragmentTransaction */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f10529a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f10530b;

        /* renamed from: c  reason: collision with root package name */
        int f10531c;

        /* renamed from: d  reason: collision with root package name */
        int f10532d;

        /* renamed from: e  reason: collision with root package name */
        int f10533e;

        /* renamed from: f  reason: collision with root package name */
        int f10534f;

        /* renamed from: g  reason: collision with root package name */
        Lifecycle.State f10535g;

        /* renamed from: h  reason: collision with root package name */
        Lifecycle.State f10536h;

        a() {
        }

        a(int i11, Fragment fragment) {
            this.f10529a = i11;
            this.f10530b = fragment;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f10535g = state;
            this.f10536h = state;
        }

        a(int i11, Fragment fragment, Lifecycle.State state) {
            this.f10529a = i11;
            this.f10530b = fragment;
            this.f10535g = fragment.mMaxState;
            this.f10536h = state;
        }
    }

    s(g gVar, ClassLoader classLoader) {
        this.f10514a = gVar;
        this.f10515b = classLoader;
    }

    public s A(boolean z11) {
        this.f10527r = z11;
        return this;
    }

    public s B(int i11) {
        this.f10521h = i11;
        return this;
    }

    public s C(Fragment fragment) {
        f(new a(5, fragment));
        return this;
    }

    public s b(int i11, Fragment fragment) {
        p(i11, fragment, (String) null, 1);
        return this;
    }

    public s c(int i11, Fragment fragment, String str) {
        p(i11, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public s d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public s e(Fragment fragment, String str) {
        p(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void f(a aVar) {
        this.f10516c.add(aVar);
        aVar.f10531c = this.f10517d;
        aVar.f10532d = this.f10518e;
        aVar.f10533e = this.f10519f;
        aVar.f10534f = this.f10520g;
    }

    public s g(View view, String str) {
        if (t.C()) {
            String O = a0.O(view);
            if (O != null) {
                if (this.f10526p == null) {
                    this.f10526p = new ArrayList<>();
                    this.q = new ArrayList<>();
                } else if (this.q.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                } else if (this.f10526p.contains(O)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + O + "' has already been added to the transaction.");
                }
                this.f10526p.add(O);
                this.q.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    public s h(String str) {
        if (this.j) {
            this.f10522i = true;
            this.k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public s i(Fragment fragment) {
        f(new a(7, fragment));
        return this;
    }

    public abstract int j();

    public abstract int k();

    public abstract void l();

    public abstract void m();

    public s n(Fragment fragment) {
        f(new a(6, fragment));
        return this;
    }

    public s o() {
        if (!this.f10522i) {
            this.j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public void p(int i11, Fragment fragment, String str, int i12) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 == null || str.equals(str2)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i11 != 0) {
            if (i11 != -1) {
                int i13 = fragment.mFragmentId;
                if (i13 == 0 || i13 == i11) {
                    fragment.mFragmentId = i11;
                    fragment.mContainerId = i11;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i11);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        f(new a(i12, fragment));
    }

    public s q(Fragment fragment) {
        f(new a(4, fragment));
        return this;
    }

    public abstract boolean r();

    public s s(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public s t(int i11, Fragment fragment) {
        return u(i11, fragment, (String) null);
    }

    public s u(int i11, Fragment fragment, String str) {
        if (i11 != 0) {
            p(i11, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public s v(Runnable runnable) {
        o();
        if (this.f10528s == null) {
            this.f10528s = new ArrayList<>();
        }
        this.f10528s.add(runnable);
        return this;
    }

    public s w(int i11, int i12) {
        return x(i11, i12, 0, 0);
    }

    public s x(int i11, int i12, int i13, int i14) {
        this.f10517d = i11;
        this.f10518e = i12;
        this.f10519f = i13;
        this.f10520g = i14;
        return this;
    }

    public s y(Fragment fragment, Lifecycle.State state) {
        f(new a(10, fragment, state));
        return this;
    }

    public s z(Fragment fragment) {
        f(new a(8, fragment));
        return this;
    }
}
