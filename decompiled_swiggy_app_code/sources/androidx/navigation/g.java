package androidx.navigation;

import android.os.Bundle;

/* compiled from: NavArgument */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final u f10899a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10900b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10901c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f10902d;

    /* compiled from: NavArgument */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private u<?> f10903a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f10904b = false;

        /* renamed from: c  reason: collision with root package name */
        private Object f10905c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10906d = false;

        public g a() {
            if (this.f10903a == null) {
                this.f10903a = u.e(this.f10905c);
            }
            return new g(this.f10903a, this.f10904b, this.f10905c, this.f10906d);
        }

        public a b(Object obj) {
            this.f10905c = obj;
            this.f10906d = true;
            return this;
        }

        public a c(boolean z11) {
            this.f10904b = z11;
            return this;
        }

        public a d(u<?> uVar) {
            this.f10903a = uVar;
            return this;
        }
    }

    g(u<?> uVar, boolean z11, Object obj, boolean z12) {
        if (!uVar.f() && z11) {
            throw new IllegalArgumentException(uVar.c() + " does not allow nullable values");
        } else if (z11 || !z12 || obj != null) {
            this.f10899a = uVar;
            this.f10900b = z11;
            this.f10902d = obj;
            this.f10901c = z12;
        } else {
            throw new IllegalArgumentException("Argument with type " + uVar.c() + " has null value but is not nullable.");
        }
    }

    public Object a() {
        return this.f10902d;
    }

    public u<?> b() {
        return this.f10899a;
    }

    public boolean c() {
        return this.f10901c;
    }

    public boolean d() {
        return this.f10900b;
    }

    /* access modifiers changed from: package-private */
    public void e(String str, Bundle bundle) {
        if (this.f10901c) {
            this.f10899a.i(bundle, str, this.f10902d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f10900b != gVar.f10900b || this.f10901c != gVar.f10901c || !this.f10899a.equals(gVar.f10899a)) {
            return false;
        }
        Object obj2 = this.f10902d;
        if (obj2 != null) {
            return obj2.equals(gVar.f10902d);
        }
        if (gVar.f10902d == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean f(String str, Bundle bundle) {
        if (!this.f10900b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f10899a.b(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = ((((this.f10899a.hashCode() * 31) + (this.f10900b ? 1 : 0)) * 31) + (this.f10901c ? 1 : 0)) * 31;
        Object obj = this.f10902d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
