package androidx.databinding;

import androidx.databinding.m;
import java.util.ArrayList;
import java.util.Collection;

public class ObservableArrayList<T> extends ArrayList<T> implements m<T> {

    /* renamed from: a  reason: collision with root package name */
    private transient i f9679a = new i();

    private void b(int i11, int i12) {
        i iVar = this.f9679a;
        if (iVar != null) {
            iVar.r(this, i11, i12);
        }
    }

    private void c(int i11, int i12) {
        i iVar = this.f9679a;
        if (iVar != null) {
            iVar.s(this, i11, i12);
        }
    }

    public void A(m.a aVar) {
        i iVar = this.f9679a;
        if (iVar != null) {
            iVar.l(aVar);
        }
    }

    public boolean add(T t) {
        super.add(t);
        b(size() - 1, 1);
        return true;
    }

    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            b(size, size() - size);
        }
        return addAll;
    }

    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            c(0, size);
        }
    }

    public T remove(int i11) {
        T remove = super.remove(i11);
        c(i11, 1);
        return remove;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i11, int i12) {
        super.removeRange(i11, i12);
        c(i11, i12 - i11);
    }

    public T set(int i11, T t) {
        T t11 = super.set(i11, t);
        i iVar = this.f9679a;
        if (iVar != null) {
            iVar.q(this, i11, 1);
        }
        return t11;
    }

    public void y(m.a aVar) {
        if (this.f9679a == null) {
            this.f9679a = new i();
        }
        this.f9679a.b(aVar);
    }

    public void add(int i11, T t) {
        super.add(i11, t);
        b(i11, 1);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean addAll(int i11, Collection<? extends T> collection) {
        boolean addAll = super.addAll(i11, collection);
        if (addAll) {
            b(i11, collection.size());
        }
        return addAll;
    }
}
