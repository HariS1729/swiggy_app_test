package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b;

@Deprecated
class ReflectiveGenericLifecycleObserver implements o {

    /* renamed from: a  reason: collision with root package name */
    private final Object f10667a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a f10668b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f10667a = obj;
        this.f10668b = b.f10709c.c(obj.getClass());
    }

    public void b(r rVar, Lifecycle.Event event) {
        this.f10668b.a(rVar, event, this.f10667a);
    }
}
