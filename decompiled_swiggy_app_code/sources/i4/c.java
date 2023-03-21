package i4;

import j4.d;
import java.util.ArrayList;
import java.util.List;
import l4.p;

/* compiled from: ConstraintController */
public abstract class c<T> implements h4.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f15046a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private T f15047b;

    /* renamed from: c  reason: collision with root package name */
    private d<T> f15048c;

    /* renamed from: d  reason: collision with root package name */
    private a f15049d;

    /* compiled from: ConstraintController */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    c(d<T> dVar) {
        this.f15048c = dVar;
    }

    private void h(a aVar, T t) {
        if (!this.f15046a.isEmpty() && aVar != null) {
            if (t == null || c(t)) {
                aVar.b(this.f15046a);
            } else {
                aVar.a(this.f15046a);
            }
        }
    }

    public void a(T t) {
        this.f15047b = t;
        h(this.f15049d, t);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean b(p pVar);

    /* access modifiers changed from: package-private */
    public abstract boolean c(T t);

    public boolean d(String str) {
        T t = this.f15047b;
        return t != null && c(t) && this.f15046a.contains(str);
    }

    public void e(Iterable<p> iterable) {
        this.f15046a.clear();
        for (p next : iterable) {
            if (b(next)) {
                this.f15046a.add(next.f15493a);
            }
        }
        if (this.f15046a.isEmpty()) {
            this.f15048c.c(this);
        } else {
            this.f15048c.a(this);
        }
        h(this.f15049d, this.f15047b);
    }

    public void f() {
        if (!this.f15046a.isEmpty()) {
            this.f15046a.clear();
            this.f15048c.c(this);
        }
    }

    public void g(a aVar) {
        if (this.f15049d != aVar) {
            this.f15049d = aVar;
            h(aVar, this.f15047b);
        }
    }
}
