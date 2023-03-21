package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import m.b;

/* compiled from: LifecycleRegistry */
public class t extends Lifecycle {

    /* renamed from: b  reason: collision with root package name */
    private m.a<q, a> f10773b;

    /* renamed from: c  reason: collision with root package name */
    private Lifecycle.State f10774c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<r> f10775d;

    /* renamed from: e  reason: collision with root package name */
    private int f10776e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10777f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10778g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<Lifecycle.State> f10779h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f10780i;

    /* compiled from: LifecycleRegistry */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        Lifecycle.State f10781a;

        /* renamed from: b  reason: collision with root package name */
        o f10782b;

        a(q qVar, Lifecycle.State state) {
            this.f10782b = v.f(qVar);
            this.f10781a = state;
        }

        /* access modifiers changed from: package-private */
        public void a(r rVar, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            this.f10781a = t.k(this.f10781a, targetState);
            this.f10782b.b(rVar, event);
            this.f10781a = targetState;
        }
    }

    public t(r rVar) {
        this(rVar, true);
    }

    private void d(r rVar) {
        Iterator<Map.Entry<q, a>> descendingIterator = this.f10773b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f10778g) {
            Map.Entry next = descendingIterator.next();
            a aVar = (a) next.getValue();
            while (aVar.f10781a.compareTo(this.f10774c) > 0 && !this.f10778g && this.f10773b.contains((q) next.getKey())) {
                Lifecycle.Event downFrom = Lifecycle.Event.downFrom(aVar.f10781a);
                if (downFrom != null) {
                    n(downFrom.getTargetState());
                    aVar.a(rVar, downFrom);
                    m();
                } else {
                    throw new IllegalStateException("no event down from " + aVar.f10781a);
                }
            }
        }
    }

    private Lifecycle.State e(q qVar) {
        Map.Entry<q, a> l11 = this.f10773b.l(qVar);
        Lifecycle.State state = null;
        Lifecycle.State state2 = l11 != null ? l11.getValue().f10781a : null;
        if (!this.f10779h.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.f10779h;
            state = arrayList.get(arrayList.size() - 1);
        }
        return k(k(this.f10774c, state2), state);
    }

    @SuppressLint({"RestrictedApi"})
    private void f(String str) {
        if (this.f10780i && !l.a.e().b()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    private void g(r rVar) {
        b<K, V>.d f11 = this.f10773b.f();
        while (f11.hasNext() && !this.f10778g) {
            Map.Entry entry = (Map.Entry) f11.next();
            a aVar = (a) entry.getValue();
            while (aVar.f10781a.compareTo(this.f10774c) < 0 && !this.f10778g && this.f10773b.contains((q) entry.getKey())) {
                n(aVar.f10781a);
                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar.f10781a);
                if (upFrom != null) {
                    aVar.a(rVar, upFrom);
                    m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f10781a);
                }
            }
        }
    }

    private boolean i() {
        if (this.f10773b.size() == 0) {
            return true;
        }
        Lifecycle.State state = this.f10773b.c().getValue().f10781a;
        Lifecycle.State state2 = this.f10773b.g().getValue().f10781a;
        if (state == state2 && this.f10774c == state2) {
            return true;
        }
        return false;
    }

    static Lifecycle.State k(Lifecycle.State state, Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    private void l(Lifecycle.State state) {
        Lifecycle.State state2 = this.f10774c;
        if (state2 != state) {
            if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
                throw new IllegalStateException("no event down from " + this.f10774c);
            }
            this.f10774c = state;
            if (this.f10777f || this.f10776e != 0) {
                this.f10778g = true;
                return;
            }
            this.f10777f = true;
            p();
            this.f10777f = false;
            if (this.f10774c == Lifecycle.State.DESTROYED) {
                this.f10773b = new m.a<>();
            }
        }
    }

    private void m() {
        ArrayList<Lifecycle.State> arrayList = this.f10779h;
        arrayList.remove(arrayList.size() - 1);
    }

    private void n(Lifecycle.State state) {
        this.f10779h.add(state);
    }

    private void p() {
        r rVar = (r) this.f10775d.get();
        if (rVar != null) {
            while (!i()) {
                this.f10778g = false;
                if (this.f10774c.compareTo(this.f10773b.c().getValue().f10781a) < 0) {
                    d(rVar);
                }
                Map.Entry<q, a> g11 = this.f10773b.g();
                if (!this.f10778g && g11 != null && this.f10774c.compareTo(g11.getValue().f10781a) > 0) {
                    g(rVar);
                }
            }
            this.f10778g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    public void a(q qVar) {
        r rVar;
        f("addObserver");
        Lifecycle.State state = this.f10774c;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        a aVar = new a(qVar, state2);
        if (this.f10773b.i(qVar, aVar) == null && (rVar = (r) this.f10775d.get()) != null) {
            boolean z11 = this.f10776e != 0 || this.f10777f;
            Lifecycle.State e11 = e(qVar);
            this.f10776e++;
            while (aVar.f10781a.compareTo(e11) < 0 && this.f10773b.contains(qVar)) {
                n(aVar.f10781a);
                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar.f10781a);
                if (upFrom != null) {
                    aVar.a(rVar, upFrom);
                    m();
                    e11 = e(qVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f10781a);
                }
            }
            if (!z11) {
                p();
            }
            this.f10776e--;
        }
    }

    public Lifecycle.State b() {
        return this.f10774c;
    }

    public void c(q qVar) {
        f("removeObserver");
        this.f10773b.k(qVar);
    }

    public void h(Lifecycle.Event event) {
        f("handleLifecycleEvent");
        l(event.getTargetState());
    }

    @Deprecated
    public void j(Lifecycle.State state) {
        f("markState");
        o(state);
    }

    public void o(Lifecycle.State state) {
        f("setCurrentState");
        l(state);
    }

    private t(r rVar, boolean z11) {
        this.f10773b = new m.a<>();
        this.f10776e = 0;
        this.f10777f = false;
        this.f10778g = false;
        this.f10779h = new ArrayList<>();
        this.f10775d = new WeakReference<>(rVar);
        this.f10774c = Lifecycle.State.INITIALIZED;
        this.f10780i = z11;
    }
}
