package androidx.databinding;

import androidx.collection.a;
import androidx.databinding.n;
import java.util.Collection;

/* compiled from: ObservableArrayMap */
public class l<K, V> extends a<K, V> implements n<K, V> {
    private transient j k;

    private void w(Object obj) {
        j jVar = this.k;
        if (jVar != null) {
            jVar.g(this, 0, obj);
        }
    }

    public void c(n.a<? extends n<K, V>, K, V> aVar) {
        if (this.k == null) {
            this.k = new j();
        }
        this.k.b(aVar);
    }

    public void clear() {
        if (!isEmpty()) {
            super.clear();
            w((Object) null);
        }
    }

    public void i(n.a<? extends n<K, V>, K, V> aVar) {
        j jVar = this.k;
        if (jVar != null) {
            jVar.l(aVar);
        }
    }

    public V o(int i11) {
        Object m11 = m(i11);
        V o11 = super.o(i11);
        if (o11 != null) {
            w(m11);
        }
        return o11;
    }

    public V p(int i11, V v) {
        Object m11 = m(i11);
        V p11 = super.p(i11, v);
        w(m11);
        return p11;
    }

    public V put(K k11, V v) {
        super.put(k11, v);
        w(k11);
        return v;
    }

    public boolean t(Collection<?> collection) {
        boolean z11 = false;
        for (Object h11 : collection) {
            int h12 = h(h11);
            if (h12 >= 0) {
                z11 = true;
                o(h12);
            }
        }
        return z11;
    }

    public boolean u(Collection<?> collection) {
        boolean z11 = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(m(size))) {
                o(size);
                z11 = true;
            }
        }
        return z11;
    }
}
