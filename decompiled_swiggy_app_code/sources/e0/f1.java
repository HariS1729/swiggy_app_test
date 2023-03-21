package e0;

import kotlin.jvm.internal.p;

/* compiled from: ValueHolders.kt */
public final class f1<T> implements d1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f14171a;

    public f1(T t) {
        this.f14171a = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && p.e(getValue(), ((f1) obj).getValue());
    }

    public T getValue() {
        return this.f14171a;
    }

    public int hashCode() {
        if (getValue() == null) {
            return 0;
        }
        return getValue().hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + getValue() + ')';
    }
}
