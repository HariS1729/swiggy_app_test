package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter */
public abstract class a implements j {

    /* renamed from: a  reason: collision with root package name */
    protected Context f1683a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f1684b;

    /* renamed from: c  reason: collision with root package name */
    protected e f1685c;

    /* renamed from: d  reason: collision with root package name */
    protected LayoutInflater f1686d;

    /* renamed from: e  reason: collision with root package name */
    protected LayoutInflater f1687e;

    /* renamed from: f  reason: collision with root package name */
    private j.a f1688f;

    /* renamed from: g  reason: collision with root package name */
    private int f1689g;

    /* renamed from: h  reason: collision with root package name */
    private int f1690h;

    /* renamed from: i  reason: collision with root package name */
    protected k f1691i;
    private int j;

    public a(Context context, int i11, int i12) {
        this.f1683a = context;
        this.f1686d = LayoutInflater.from(context);
        this.f1689g = i11;
        this.f1690h = i12;
    }

    /* access modifiers changed from: protected */
    public void a(View view, int i11) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1691i).addView(view, i11);
    }

    public abstract void b(g gVar, k.a aVar);

    public void c(e eVar, boolean z11) {
        j.a aVar = this.f1688f;
        if (aVar != null) {
            aVar.c(eVar, z11);
        }
    }

    public boolean d(e eVar, g gVar) {
        return false;
    }

    public void f(boolean z11) {
        ViewGroup viewGroup = (ViewGroup) this.f1691i;
        if (viewGroup != null) {
            e eVar = this.f1685c;
            int i11 = 0;
            if (eVar != null) {
                eVar.t();
                ArrayList<g> G = this.f1685c.G();
                int size = G.size();
                int i12 = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    g gVar = G.get(i13);
                    if (s(i12, gVar)) {
                        View childAt = viewGroup.getChildAt(i12);
                        g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View p11 = p(gVar, childAt, viewGroup);
                        if (gVar != itemData) {
                            p11.setPressed(false);
                            p11.jumpDrawablesToCurrentState();
                        }
                        if (p11 != childAt) {
                            a(p11, i12);
                        }
                        i12++;
                    }
                }
                i11 = i12;
            }
            while (i11 < viewGroup.getChildCount()) {
                if (!n(viewGroup, i11)) {
                    i11++;
                }
            }
        }
    }

    public int getId() {
        return this.j;
    }

    public boolean h(e eVar, g gVar) {
        return false;
    }

    public void i(Context context, e eVar) {
        this.f1684b = context;
        this.f1687e = LayoutInflater.from(context);
        this.f1685c = eVar;
    }

    public k.a j(ViewGroup viewGroup) {
        return (k.a) this.f1686d.inflate(this.f1690h, viewGroup, false);
    }

    public void k(j.a aVar) {
        this.f1688f = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m(androidx.appcompat.view.menu.m r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.j$a r0 = r1.f1688f
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.e r2 = r1.f1685c
        L_0x0009:
            boolean r2 = r0.d(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.a.m(androidx.appcompat.view.menu.m):boolean");
    }

    /* access modifiers changed from: protected */
    public boolean n(ViewGroup viewGroup, int i11) {
        viewGroup.removeViewAt(i11);
        return true;
    }

    public j.a o() {
        return this.f1688f;
    }

    public View p(g gVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        if (view instanceof k.a) {
            aVar = (k.a) view;
        } else {
            aVar = j(viewGroup);
        }
        b(gVar, aVar);
        return (View) aVar;
    }

    public k q(ViewGroup viewGroup) {
        if (this.f1691i == null) {
            k kVar = (k) this.f1686d.inflate(this.f1689g, viewGroup, false);
            this.f1691i = kVar;
            kVar.a(this.f1685c);
            f(true);
        }
        return this.f1691i;
    }

    public void r(int i11) {
        this.j = i11;
    }

    public abstract boolean s(int i11, g gVar);
}
