package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: MenuAdapter */
public class d extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    e f1732a;

    /* renamed from: b  reason: collision with root package name */
    private int f1733b = -1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1734c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1735d;

    /* renamed from: e  reason: collision with root package name */
    private final LayoutInflater f1736e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1737f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z11, int i11) {
        this.f1735d = z11;
        this.f1736e = layoutInflater;
        this.f1732a = eVar;
        this.f1737f = i11;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        g x11 = this.f1732a.x();
        if (x11 != null) {
            ArrayList<g> B = this.f1732a.B();
            int size = B.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (B.get(i11) == x11) {
                    this.f1733b = i11;
                    return;
                }
            }
        }
        this.f1733b = -1;
    }

    public e b() {
        return this.f1732a;
    }

    /* renamed from: c */
    public g getItem(int i11) {
        ArrayList<g> B = this.f1735d ? this.f1732a.B() : this.f1732a.G();
        int i12 = this.f1733b;
        if (i12 >= 0 && i11 >= i12) {
            i11++;
        }
        return B.get(i11);
    }

    public void d(boolean z11) {
        this.f1734c = z11;
    }

    public int getCount() {
        ArrayList<g> B = this.f1735d ? this.f1732a.B() : this.f1732a.G();
        if (this.f1733b < 0) {
            return B.size();
        }
        return B.size() - 1;
    }

    public long getItemId(int i11) {
        return (long) i11;
    }

    public View getView(int i11, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1736e.inflate(this.f1737f, viewGroup, false);
        }
        int groupId = getItem(i11).getGroupId();
        int i12 = i11 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1732a.H() && groupId != (i12 >= 0 ? getItem(i12).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f1734c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i11), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
