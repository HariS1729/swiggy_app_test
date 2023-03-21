package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

class CompositeGeneratedAdaptersObserver implements o {

    /* renamed from: a  reason: collision with root package name */
    private final i[] f10615a;

    CompositeGeneratedAdaptersObserver(i[] iVarArr) {
        this.f10615a = iVarArr;
    }

    public void b(r rVar, Lifecycle.Event event) {
        x xVar = new x();
        for (i a11 : this.f10615a) {
            a11.a(rVar, event, false, xVar);
        }
        for (i a12 : this.f10615a) {
            a12.a(rVar, event, true, xVar);
        }
    }
}
