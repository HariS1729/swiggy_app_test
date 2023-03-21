package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList */
public class h1 extends AbstractList<String> implements a0, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a0 f10033a;

    /* compiled from: UnmodifiableLazyStringList */
    class a implements ListIterator<String> {

        /* renamed from: a  reason: collision with root package name */
        ListIterator<String> f10034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f10035b;

        a(int i11) {
            this.f10035b = i11;
            this.f10034a = h1.this.f10033a.listIterator(i11);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public String next() {
            return this.f10034a.next();
        }

        /* renamed from: c */
        public String previous() {
            return this.f10034a.previous();
        }

        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f10034a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f10034a.hasPrevious();
        }

        public int nextIndex() {
            return this.f10034a.nextIndex();
        }

        public int previousIndex() {
            return this.f10034a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList */
    class b implements Iterator<String> {

        /* renamed from: a  reason: collision with root package name */
        Iterator<String> f10037a;

        b() {
            this.f10037a = h1.this.f10033a.iterator();
        }

        /* renamed from: b */
        public String next() {
            return this.f10037a.next();
        }

        public boolean hasNext() {
            return this.f10037a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public h1(a0 a0Var) {
        this.f10033a = a0Var;
    }

    /* renamed from: c */
    public String get(int i11) {
        return (String) this.f10033a.get(i11);
    }

    public Object getRaw(int i11) {
        return this.f10033a.getRaw(i11);
    }

    public List<?> getUnderlyingElements() {
        return this.f10033a.getUnderlyingElements();
    }

    public a0 getUnmodifiableView() {
        return this;
    }

    public Iterator<String> iterator() {
        return new b();
    }

    public ListIterator<String> listIterator(int i11) {
        return new a(i11);
    }

    public int size() {
        return this.f10033a.size();
    }

    public void w(ByteString byteString) {
        throw new UnsupportedOperationException();
    }
}
