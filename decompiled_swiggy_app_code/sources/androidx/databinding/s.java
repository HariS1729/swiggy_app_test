package androidx.databinding;

import androidx.lifecycle.r;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: WeakListener */
class s<T> extends WeakReference<ViewDataBinding> {

    /* renamed from: a  reason: collision with root package name */
    private final o<T> f9743a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f9744b;

    /* renamed from: c  reason: collision with root package name */
    private T f9745c;

    public s(ViewDataBinding viewDataBinding, int i11, o<T> oVar, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f9744b = i11;
        this.f9743a = oVar;
    }

    /* access modifiers changed from: protected */
    public ViewDataBinding a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            e();
        }
        return viewDataBinding;
    }

    public T b() {
        return this.f9745c;
    }

    public void c(r rVar) {
        this.f9743a.b(rVar);
    }

    public void d(T t) {
        e();
        this.f9745c = t;
        if (t != null) {
            this.f9743a.d(t);
        }
    }

    public boolean e() {
        boolean z11;
        T t = this.f9745c;
        if (t != null) {
            this.f9743a.c(t);
            z11 = true;
        } else {
            z11 = false;
        }
        this.f9745c = null;
        return z11;
    }
}
