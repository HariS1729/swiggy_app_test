package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

class SingleGeneratedAdapterObserver implements o {

    /* renamed from: a  reason: collision with root package name */
    private final i f10698a;

    SingleGeneratedAdapterObserver(i iVar) {
        this.f10698a = iVar;
    }

    public void b(r rVar, Lifecycle.Event event) {
        this.f10698a.a(rVar, event, false, (x) null);
        this.f10698a.a(rVar, event, true, (x) null);
    }
}
