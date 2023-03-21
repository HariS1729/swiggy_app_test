package androidx.databinding;

import androidx.databinding.k;

/* compiled from: BaseObservable */
public class a implements k {

    /* renamed from: a  reason: collision with root package name */
    private transient q f9716a;

    public void d() {
        synchronized (this) {
            q qVar = this.f9716a;
            if (qVar != null) {
                qVar.g(this, 0, null);
            }
        }
    }

    public void e(int i11) {
        synchronized (this) {
            q qVar = this.f9716a;
            if (qVar != null) {
                qVar.g(this, i11, null);
            }
        }
    }

    public void h(k.a aVar) {
        synchronized (this) {
            if (this.f9716a == null) {
                this.f9716a = new q();
            }
        }
        this.f9716a.b(aVar);
    }

    public void j0(k.a aVar) {
        synchronized (this) {
            q qVar = this.f9716a;
            if (qVar != null) {
                qVar.l(aVar);
            }
        }
    }
}
