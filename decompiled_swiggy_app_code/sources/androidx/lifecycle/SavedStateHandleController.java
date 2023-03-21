package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import n3.b;

final class SavedStateHandleController implements o {

    /* renamed from: a  reason: collision with root package name */
    private final String f10686a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10687b = false;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f10688c;

    SavedStateHandleController(String str, d0 d0Var) {
        this.f10686a = str;
        this.f10688c = d0Var;
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar, Lifecycle lifecycle) {
        if (!this.f10687b) {
            this.f10687b = true;
            lifecycle.a(this);
            bVar.h(this.f10686a, this.f10688c.d());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public void b(r rVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f10687b = false;
            rVar.getLifecycle().c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public d0 c() {
        return this.f10688c;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f10687b;
    }
}
