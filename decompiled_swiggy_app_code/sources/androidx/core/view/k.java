package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f9523a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f9524b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<m, a> f9525c = new HashMap();

    /* compiled from: MenuHostHelper */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final Lifecycle f9526a;

        /* renamed from: b  reason: collision with root package name */
        private o f9527b;

        a(Lifecycle lifecycle, o oVar) {
            this.f9526a = lifecycle;
            this.f9527b = oVar;
            lifecycle.a(oVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f9526a.c(this.f9527b);
            this.f9527b = null;
        }
    }

    public k(Runnable runnable) {
        this.f9523a = runnable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(m mVar, r rVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            l(mVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(Lifecycle.State state, m mVar, r rVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.upTo(state)) {
            c(mVar);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            l(mVar);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            this.f9524b.remove(mVar);
            this.f9523a.run();
        }
    }

    public void c(m mVar) {
        this.f9524b.add(mVar);
        this.f9523a.run();
    }

    public void d(m mVar, r rVar) {
        c(mVar);
        Lifecycle lifecycle = rVar.getLifecycle();
        a remove = this.f9525c.remove(mVar);
        if (remove != null) {
            remove.a();
        }
        this.f9525c.put(mVar, new a(lifecycle, new i(this, mVar)));
    }

    @SuppressLint({"LambdaLast"})
    public void e(m mVar, r rVar, Lifecycle.State state) {
        Lifecycle lifecycle = rVar.getLifecycle();
        a remove = this.f9525c.remove(mVar);
        if (remove != null) {
            remove.a();
        }
        this.f9525c.put(mVar, new a(lifecycle, new j(this, state, mVar)));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator<m> it2 = this.f9524b.iterator();
        while (it2.hasNext()) {
            it2.next().a(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator<m> it2 = this.f9524b.iterator();
        while (it2.hasNext()) {
            it2.next().b(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator<m> it2 = this.f9524b.iterator();
        while (it2.hasNext()) {
            if (it2.next().d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator<m> it2 = this.f9524b.iterator();
        while (it2.hasNext()) {
            it2.next().c(menu);
        }
    }

    public void l(m mVar) {
        this.f9524b.remove(mVar);
        a remove = this.f9525c.remove(mVar);
        if (remove != null) {
            remove.a();
        }
        this.f9523a.run();
    }
}
