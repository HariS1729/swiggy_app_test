package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import m.b;

/* compiled from: MediatorLiveData */
public class w<T> extends y<T> {

    /* renamed from: l  reason: collision with root package name */
    private b<LiveData<?>, a<?>> f10785l = new b<>();

    /* compiled from: MediatorLiveData */
    private static class a<V> implements z<V> {

        /* renamed from: a  reason: collision with root package name */
        final LiveData<V> f10786a;

        /* renamed from: b  reason: collision with root package name */
        final z<? super V> f10787b;

        /* renamed from: c  reason: collision with root package name */
        int f10788c = -1;

        a(LiveData<V> liveData, z<? super V> zVar) {
            this.f10786a = liveData;
            this.f10787b = zVar;
        }

        public void a(V v) {
            if (this.f10788c != this.f10786a.g()) {
                this.f10788c = this.f10786a.g();
                this.f10787b.a(v);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f10786a.k(this);
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f10786a.o(this);
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it2 = this.f10785l.iterator();
        while (it2.hasNext()) {
            ((a) it2.next().getValue()).b();
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it2 = this.f10785l.iterator();
        while (it2.hasNext()) {
            ((a) it2.next().getValue()).c();
        }
    }

    public <S> void r(LiveData<S> liveData, z<? super S> zVar) {
        a aVar = new a(liveData, zVar);
        a i11 = this.f10785l.i(liveData, aVar);
        if (i11 != null && i11.f10787b != zVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (i11 == null && h()) {
            aVar.b();
        }
    }
}
