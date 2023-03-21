package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import java.util.List;

/* compiled from: ListAdapter */
public abstract class n<T, VH extends RecyclerView.d0> extends RecyclerView.Adapter<VH> {

    /* renamed from: a  reason: collision with root package name */
    final d<T> f11453a;

    /* renamed from: b  reason: collision with root package name */
    private final d.b<T> f11454b;

    /* compiled from: ListAdapter */
    class a implements d.b<T> {
        a() {
        }

        public void a(List<T> list, List<T> list2) {
            n.this.b(list, list2);
        }
    }

    protected n(h.f<T> fVar) {
        a aVar = new a();
        this.f11454b = aVar;
        d<T> dVar = new d<>(new b(this), new c.a(fVar).a());
        this.f11453a = dVar;
        dVar.a(aVar);
    }

    /* access modifiers changed from: protected */
    public T a(int i11) {
        return this.f11453a.b().get(i11);
    }

    public void b(List<T> list, List<T> list2) {
    }

    public void f(List<T> list) {
        this.f11453a.e(list);
    }

    public int getItemCount() {
        return this.f11453a.b().size();
    }
}
