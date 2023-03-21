package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    Context f1721a;

    /* renamed from: b  reason: collision with root package name */
    LayoutInflater f1722b;

    /* renamed from: c  reason: collision with root package name */
    e f1723c;

    /* renamed from: d  reason: collision with root package name */
    ExpandedMenuView f1724d;

    /* renamed from: e  reason: collision with root package name */
    int f1725e;

    /* renamed from: f  reason: collision with root package name */
    int f1726f;

    /* renamed from: g  reason: collision with root package name */
    int f1727g;

    /* renamed from: h  reason: collision with root package name */
    private j.a f1728h;

    /* renamed from: i  reason: collision with root package name */
    a f1729i;
    private int j;

    /* compiled from: ListMenuPresenter */
    private class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private int f1730a = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            g x11 = c.this.f1723c.x();
            if (x11 != null) {
                ArrayList<g> B = c.this.f1723c.B();
                int size = B.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (B.get(i11) == x11) {
                        this.f1730a = i11;
                        return;
                    }
                }
            }
            this.f1730a = -1;
        }

        /* renamed from: b */
        public g getItem(int i11) {
            ArrayList<g> B = c.this.f1723c.B();
            int i12 = i11 + c.this.f1725e;
            int i13 = this.f1730a;
            if (i13 >= 0 && i12 >= i13) {
                i12++;
            }
            return B.get(i12);
        }

        public int getCount() {
            int size = c.this.f1723c.B().size() - c.this.f1725e;
            return this.f1730a < 0 ? size : size - 1;
        }

        public long getItemId(int i11) {
            return (long) i11;
        }

        public View getView(int i11, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f1722b.inflate(cVar.f1727g, viewGroup, false);
            }
            ((k.a) view).e(getItem(i11), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i11) {
        this(i11, 0);
        this.f1721a = context;
        this.f1722b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f1729i == null) {
            this.f1729i = new a();
        }
        return this.f1729i;
    }

    public k b(ViewGroup viewGroup) {
        if (this.f1724d == null) {
            this.f1724d = (ExpandedMenuView) this.f1722b.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1729i == null) {
                this.f1729i = new a();
            }
            this.f1724d.setAdapter(this.f1729i);
            this.f1724d.setOnItemClickListener(this);
        }
        return this.f1724d;
    }

    public void c(e eVar, boolean z11) {
        j.a aVar = this.f1728h;
        if (aVar != null) {
            aVar.c(eVar, z11);
        }
    }

    public boolean d(e eVar, g gVar) {
        return false;
    }

    public Parcelable e() {
        if (this.f1724d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    public void f(boolean z11) {
        a aVar = this.f1729i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean g() {
        return false;
    }

    public int getId() {
        return this.j;
    }

    public boolean h(e eVar, g gVar) {
        return false;
    }

    public void i(Context context, e eVar) {
        if (this.f1726f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1726f);
            this.f1721a = contextThemeWrapper;
            this.f1722b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1721a != null) {
            this.f1721a = context;
            if (this.f1722b == null) {
                this.f1722b = LayoutInflater.from(context);
            }
        }
        this.f1723c = eVar;
        a aVar = this.f1729i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void j(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1724d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void k(j.a aVar) {
        this.f1728h = aVar;
    }

    public void l(Parcelable parcelable) {
        j((Bundle) parcelable);
    }

    public boolean m(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).b((IBinder) null);
        j.a aVar = this.f1728h;
        if (aVar == null) {
            return true;
        }
        aVar.d(mVar);
        return true;
    }

    public void n(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f1724d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
        this.f1723c.O(this.f1729i.getItem(i11), this, 0);
    }

    public c(int i11, int i12) {
        this.f1727g = i11;
        this.f1726f = i12;
    }
}
