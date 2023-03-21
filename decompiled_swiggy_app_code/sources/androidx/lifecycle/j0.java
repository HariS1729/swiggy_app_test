package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: ViewModel */
public abstract class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f10748a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Set<Closeable> f10749b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f10750c = false;

    private static void g1(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void f1() {
        this.f10750c = true;
        Map<String, Object> map = this.f10748a;
        if (map != null) {
            synchronized (map) {
                for (Object g12 : this.f10748a.values()) {
                    g1(g12);
                }
            }
        }
        Set<Closeable> set = this.f10749b;
        if (set != null) {
            synchronized (set) {
                for (Closeable g13 : this.f10749b) {
                    g1(g13);
                }
            }
        }
        i1();
    }

    /* access modifiers changed from: package-private */
    public <T> T h1(String str) {
        T t;
        Map<String, Object> map = this.f10748a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f10748a.get(str);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    public void i1() {
    }

    /* access modifiers changed from: package-private */
    public <T> T j1(String str, T t) {
        T t11;
        synchronized (this.f10748a) {
            t11 = this.f10748a.get(str);
            if (t11 == null) {
                this.f10748a.put(str, t);
            }
        }
        if (t11 != null) {
            t = t11;
        }
        if (this.f10750c) {
            g1(t);
        }
        return t;
    }
}
