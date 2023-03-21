package androidx.databinding;

import java.io.Serializable;

public class ObservableField<T> extends b implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private T f9682b;

    public ObservableField(T t) {
        this.f9682b = t;
    }

    public T g() {
        return this.f9682b;
    }

    public void j(T t) {
        if (t != this.f9682b) {
            this.f9682b = t;
            d();
        }
    }

    public ObservableField() {
    }

    public ObservableField(k... kVarArr) {
        super(kVarArr);
    }
}
