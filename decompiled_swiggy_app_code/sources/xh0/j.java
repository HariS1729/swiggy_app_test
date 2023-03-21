package xh0;

import androidx.databinding.ObservableBoolean;
import sm0.d;

/* compiled from: LynxFragmentLoader.kt */
public final class j implements a {

    /* renamed from: a  reason: collision with root package name */
    private final d f20001a;

    /* renamed from: b  reason: collision with root package name */
    private final ObservableBoolean f20002b = new ObservableBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private boolean f20003c;

    public j(d dVar) {
        this.f20001a = dVar;
    }

    public void a(boolean z11) {
        this.f20003c = z11;
    }

    public ObservableBoolean b() {
        return this.f20002b;
    }

    public void c(boolean z11) {
        if (z11) {
            if (!e()) {
                d dVar = this.f20001a;
                if (dVar != null) {
                    dVar.c();
                    return;
                }
                return;
            }
            b().j(true);
        } else if (!e()) {
            d dVar2 = this.f20001a;
            if (dVar2 != null) {
                dVar2.b();
            }
        } else {
            b().j(false);
        }
    }

    public d d() {
        return this.f20001a;
    }

    public boolean e() {
        return this.f20003c;
    }
}
