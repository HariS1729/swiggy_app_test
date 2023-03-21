package w4;

import bolts.UnobservedTaskException;
import w4.e;

/* compiled from: UnobservedErrorNotifier */
class g {

    /* renamed from: a  reason: collision with root package name */
    private e<?> f17497a;

    public g(e<?> eVar) {
        this.f17497a = eVar;
    }

    public void a() {
        this.f17497a = null;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        e.d k;
        try {
            e<?> eVar = this.f17497a;
            if (!(eVar == null || (k = e.k()) == null)) {
                k.a(eVar, new UnobservedTaskException(eVar.i()));
            }
        } finally {
            super.finalize();
        }
    }
}
