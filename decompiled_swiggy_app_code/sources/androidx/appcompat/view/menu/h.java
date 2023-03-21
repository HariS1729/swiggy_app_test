package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import defpackage.q1;

/* compiled from: MenuPopup */
abstract class h implements q1.f, j, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    private Rect f1783a;

    h() {
    }

    protected static d A(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (d) listAdapter;
    }

    protected static int q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = listAdapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i14, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i11) {
                return i11;
            }
            if (measuredWidth > i12) {
                i12 = measuredWidth;
            }
        }
        return i12;
    }

    protected static boolean z(e eVar) {
        int size = eVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = eVar.getItem(i11);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public boolean d(e eVar, g gVar) {
        return false;
    }

    public int getId() {
        return 0;
    }

    public boolean h(e eVar, g gVar) {
        return false;
    }

    public void i(Context context, e eVar) {
    }

    public abstract void n(e eVar);

    /* access modifiers changed from: protected */
    public boolean o() {
        return true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        A(listAdapter).f1732a.O((MenuItem) listAdapter.getItem(i11), this, o() ? 0 : 4);
    }

    public Rect p() {
        return this.f1783a;
    }

    public abstract void r(View view);

    public void s(Rect rect) {
        this.f1783a = rect;
    }

    public abstract void t(boolean z11);

    public abstract void u(int i11);

    public abstract void v(int i11);

    public abstract void w(PopupWindow.OnDismissListener onDismissListener);

    public abstract void x(boolean z11);

    public abstract void y(int i11);
}
