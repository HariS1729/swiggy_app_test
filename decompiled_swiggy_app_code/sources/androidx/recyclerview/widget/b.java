package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterListUpdateCallback */
public final class b implements o {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView.Adapter f11297a;

    public b(RecyclerView.Adapter adapter) {
        this.f11297a = adapter;
    }

    public void a(int i11, int i12, Object obj) {
        this.f11297a.notifyItemRangeChanged(i11, i12, obj);
    }

    public void b(int i11, int i12) {
        this.f11297a.notifyItemRangeInserted(i11, i12);
    }

    public void c(int i11, int i12) {
        this.f11297a.notifyItemRangeRemoved(i11, i12);
    }

    public void d(int i11, int i12) {
        this.f11297a.notifyItemMoved(i11, i12);
    }
}
