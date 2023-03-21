package androidx.activity;

import androidx.core.util.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1402a;

    /* renamed from: b  reason: collision with root package name */
    private CopyOnWriteArrayList<a> f1403b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private a<Boolean> f1404c;

    public e(boolean z11) {
        this.f1402a = z11;
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f1403b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f1402a;
    }

    public final void d() {
        Iterator<a> it2 = this.f1403b.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f1403b.remove(aVar);
    }

    public final void f(boolean z11) {
        this.f1402a = z11;
        a<Boolean> aVar = this.f1404c;
        if (aVar != null) {
            aVar.accept(Boolean.valueOf(z11));
        }
    }

    /* access modifiers changed from: package-private */
    public void g(a<Boolean> aVar) {
        this.f1404c = aVar;
    }
}
