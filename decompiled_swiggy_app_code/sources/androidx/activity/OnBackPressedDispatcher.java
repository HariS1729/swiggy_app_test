package androidx.activity;

import android.annotation.SuppressLint;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f1387a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayDeque<e> f1388b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private androidx.core.util.a<Boolean> f1389c;

    /* renamed from: d  reason: collision with root package name */
    private OnBackInvokedCallback f1390d;

    /* renamed from: e  reason: collision with root package name */
    private OnBackInvokedDispatcher f1391e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1392f = false;

    private class LifecycleOnBackPressedCancellable implements o, a {

        /* renamed from: a  reason: collision with root package name */
        private final Lifecycle f1393a;

        /* renamed from: b  reason: collision with root package name */
        private final e f1394b;

        /* renamed from: c  reason: collision with root package name */
        private a f1395c;

        LifecycleOnBackPressedCancellable(Lifecycle lifecycle, e eVar) {
            this.f1393a = lifecycle;
            this.f1394b = eVar;
            lifecycle.a(this);
        }

        public void b(r rVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.f1395c = OnBackPressedDispatcher.this.c(this.f1394b);
            } else if (event == Lifecycle.Event.ON_STOP) {
                a aVar = this.f1395c;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f1393a.c(this);
            this.f1394b.e(this);
            a aVar = this.f1395c;
            if (aVar != null) {
                aVar.cancel();
                this.f1395c = null;
            }
        }
    }

    static class a {
        static OnBackInvokedCallback a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new h(runnable);
        }

        static void b(Object obj, int i11, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i11, (OnBackInvokedCallback) obj2);
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final e f1397a;

        b(e eVar) {
            this.f1397a = eVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f1388b.remove(this.f1397a);
            this.f1397a.e(this);
            if (androidx.core.os.a.d()) {
                this.f1397a.g((androidx.core.util.a<Boolean>) null);
                OnBackPressedDispatcher.this.h();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f1387a = runnable;
        if (androidx.core.os.a.d()) {
            this.f1389c = new f(this);
            this.f1390d = a.a(new g(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(Boolean bool) {
        if (androidx.core.os.a.d()) {
            h();
        }
    }

    @SuppressLint({"LambdaLast"})
    public void b(r rVar, e eVar) {
        Lifecycle lifecycle = rVar.getLifecycle();
        if (lifecycle.b() != Lifecycle.State.DESTROYED) {
            eVar.a(new LifecycleOnBackPressedCancellable(lifecycle, eVar));
            if (androidx.core.os.a.d()) {
                h();
                eVar.g(this.f1389c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public a c(e eVar) {
        this.f1388b.add(eVar);
        b bVar = new b(eVar);
        eVar.a(bVar);
        if (androidx.core.os.a.d()) {
            h();
            eVar.g(this.f1389c);
        }
        return bVar;
    }

    public boolean d() {
        Iterator<e> descendingIterator = this.f1388b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().c()) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        Iterator<e> descendingIterator = this.f1388b.descendingIterator();
        while (descendingIterator.hasNext()) {
            e next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f1387a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void g(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.f1391e = onBackInvokedDispatcher;
        h();
    }

    /* access modifiers changed from: package-private */
    public void h() {
        boolean d11 = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1391e;
        if (onBackInvokedDispatcher == null) {
            return;
        }
        if (d11 && !this.f1392f) {
            a.b(onBackInvokedDispatcher, 0, this.f1390d);
            this.f1392f = true;
        } else if (!d11 && this.f1392f) {
            a.c(onBackInvokedDispatcher, this.f1390d);
            this.f1392f = false;
        }
    }
}
