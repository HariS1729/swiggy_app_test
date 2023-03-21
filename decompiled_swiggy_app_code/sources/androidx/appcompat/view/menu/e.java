package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.c0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;

/* compiled from: MenuBuilder */
public class e implements p2.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f1738a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f1739b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1740c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1741d;

    /* renamed from: e  reason: collision with root package name */
    private a f1742e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<g> f1743f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<g> f1744g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1745h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<g> f1746i;
    private ArrayList<g> j;
    private boolean k;

    /* renamed from: l  reason: collision with root package name */
    private int f1747l = 0;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f1748m;
    CharSequence n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f1749o;

    /* renamed from: p  reason: collision with root package name */
    View f1750p;
    private boolean q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1751r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1752s = false;
    private boolean t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1753u = false;
    private ArrayList<g> v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f1754w = new CopyOnWriteArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    private g f1755x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f1756y = false;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1757z;

    /* compiled from: MenuBuilder */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* compiled from: MenuBuilder */
    public interface b {
        boolean f(g gVar);
    }

    public e(Context context) {
        this.f1738a = context;
        this.f1739b = context.getResources();
        this.f1743f = new ArrayList<>();
        this.f1744g = new ArrayList<>();
        this.f1745h = true;
        this.f1746i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = true;
        f0(true);
    }

    private static int D(int i11) {
        int i12 = (-65536 & i11) >> 16;
        if (i12 >= 0) {
            int[] iArr = A;
            if (i12 < iArr.length) {
                return (i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i12] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void P(int i11, boolean z11) {
        if (i11 >= 0 && i11 < this.f1743f.size()) {
            this.f1743f.remove(i11);
            if (z11) {
                M(true);
            }
        }
    }

    private void a0(int i11, CharSequence charSequence, int i12, Drawable drawable, View view) {
        Resources E = E();
        if (view != null) {
            this.f1750p = view;
            this.n = null;
            this.f1749o = null;
        } else {
            if (i11 > 0) {
                this.n = E.getText(i11);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (i12 > 0) {
                this.f1749o = androidx.core.content.a.f(w(), i12);
            } else if (drawable != null) {
                this.f1749o = drawable;
            }
            this.f1750p = null;
        }
        M(false);
    }

    private void f0(boolean z11) {
        boolean z12 = true;
        if (!z11 || this.f1739b.getConfiguration().keyboard == 1 || !c0.f(ViewConfiguration.get(this.f1738a), this.f1738a)) {
            z12 = false;
        }
        this.f1741d = z12;
    }

    private g g(int i11, int i12, int i13, int i14, CharSequence charSequence, int i15) {
        return new g(this, i11, i12, i13, i14, charSequence, i15);
    }

    private void i(boolean z11) {
        if (!this.f1754w.isEmpty()) {
            h0();
            Iterator<WeakReference<j>> it2 = this.f1754w.iterator();
            while (it2.hasNext()) {
                WeakReference next = it2.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f1754w.remove(next);
                } else {
                    jVar.f(z11);
                }
            }
            g0();
        }
    }

    private void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f1754w.isEmpty()) {
            Iterator<WeakReference<j>> it2 = this.f1754w.iterator();
            while (it2.hasNext()) {
                WeakReference next = it2.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f1754w.remove(next);
                } else {
                    int id2 = jVar.getId();
                    if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                        jVar.l(parcelable);
                    }
                }
            }
        }
    }

    private void k(Bundle bundle) {
        Parcelable e11;
        if (!this.f1754w.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<j>> it2 = this.f1754w.iterator();
            while (it2.hasNext()) {
                WeakReference next = it2.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f1754w.remove(next);
                } else {
                    int id2 = jVar.getId();
                    if (id2 > 0 && (e11 = jVar.e()) != null) {
                        sparseArray.put(id2, e11);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    private boolean l(m mVar, j jVar) {
        boolean z11 = false;
        if (this.f1754w.isEmpty()) {
            return false;
        }
        if (jVar != null) {
            z11 = jVar.m(mVar);
        }
        Iterator<WeakReference<j>> it2 = this.f1754w.iterator();
        while (it2.hasNext()) {
            WeakReference next = it2.next();
            j jVar2 = (j) next.get();
            if (jVar2 == null) {
                this.f1754w.remove(next);
            } else if (!z11) {
                z11 = jVar2.m(mVar);
            }
        }
        return z11;
    }

    private static int p(ArrayList<g> arrayList, int i11) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i11) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.f1750p;
    }

    public ArrayList<g> B() {
        t();
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public Resources E() {
        return this.f1739b;
    }

    public e F() {
        return this;
    }

    public ArrayList<g> G() {
        if (!this.f1745h) {
            return this.f1744g;
        }
        this.f1744g.clear();
        int size = this.f1743f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f1743f.get(i11);
            if (gVar.isVisible()) {
                this.f1744g.add(gVar);
            }
        }
        this.f1745h = false;
        this.k = true;
        return this.f1744g;
    }

    public boolean H() {
        return this.f1756y;
    }

    /* access modifiers changed from: package-private */
    public boolean I() {
        return this.f1740c;
    }

    public boolean J() {
        return this.f1741d;
    }

    /* access modifiers changed from: package-private */
    public void K(g gVar) {
        this.k = true;
        M(true);
    }

    /* access modifiers changed from: package-private */
    public void L(g gVar) {
        this.f1745h = true;
        M(true);
    }

    public void M(boolean z11) {
        if (!this.q) {
            if (z11) {
                this.f1745h = true;
                this.k = true;
            }
            i(z11);
            return;
        }
        this.f1751r = true;
        if (z11) {
            this.f1752s = true;
        }
    }

    public boolean N(MenuItem menuItem, int i11) {
        return O(menuItem, (j) null, i11);
    }

    public boolean O(MenuItem menuItem, j jVar, int i11) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k11 = gVar.k();
        androidx.core.view.b a11 = gVar.a();
        boolean z11 = a11 != null && a11.a();
        if (gVar.j()) {
            k11 |= gVar.expandActionView();
            if (k11) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z11) {
            if ((i11 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new m(w(), this, gVar));
            }
            m mVar = (m) gVar.getSubMenu();
            if (z11) {
                a11.f(mVar);
            }
            k11 |= l(mVar, jVar);
            if (!k11) {
                e(true);
            }
        } else if ((i11 & 1) == 0) {
            e(true);
        }
        return k11;
    }

    public void Q(j jVar) {
        Iterator<WeakReference<j>> it2 = this.f1754w.iterator();
        while (it2.hasNext()) {
            WeakReference next = it2.next();
            j jVar2 = (j) next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f1754w.remove(next);
            }
        }
    }

    public void R(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(v());
            int size = size();
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = getItem(i11);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((m) item.getSubMenu()).R(bundle);
                }
            }
            int i12 = bundle.getInt("android:menu:expandedactionview");
            if (i12 > 0 && (findItem = findItem(i12)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void S(Bundle bundle) {
        j(bundle);
    }

    public void T(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(a aVar) {
        this.f1742e = aVar;
    }

    public e W(int i11) {
        this.f1747l = i11;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1743f.size();
        h0();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f1743f.get(i11);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        g0();
    }

    /* access modifiers changed from: protected */
    public e Y(int i11) {
        a0(0, (CharSequence) null, i11, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public e Z(Drawable drawable) {
        a0(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i11, int i12, int i13, CharSequence charSequence) {
        int D = D(i13);
        g g11 = g(i11, i12, i13, D, charSequence, this.f1747l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1748m;
        if (contextMenuInfo != null) {
            g11.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f1743f;
        arrayList.add(p(arrayList, D), g11);
        M(true);
        return g11;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        int i15;
        PackageManager packageManager = this.f1738a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i14 & 1) == 0) {
            removeGroup(i11);
        }
        for (int i16 = 0; i16 < size; i16++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i17 < 0 ? intent : intentArr[i17]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i11, i12, i13, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f1738a);
    }

    /* access modifiers changed from: protected */
    public e b0(int i11) {
        a0(i11, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public void c(j jVar, Context context) {
        this.f1754w.add(new WeakReference(jVar));
        jVar.i(context, this);
        this.k = true;
    }

    /* access modifiers changed from: protected */
    public e c0(CharSequence charSequence) {
        a0(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public void clear() {
        g gVar = this.f1755x;
        if (gVar != null) {
            f(gVar);
        }
        this.f1743f.clear();
        M(true);
    }

    public void clearHeader() {
        this.f1749o = null;
        this.n = null;
        this.f1750p = null;
        M(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f1742e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public e d0(View view) {
        a0(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final void e(boolean z11) {
        if (!this.f1753u) {
            this.f1753u = true;
            Iterator<WeakReference<j>> it2 = this.f1754w.iterator();
            while (it2.hasNext()) {
                WeakReference next = it2.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f1754w.remove(next);
                } else {
                    jVar.c(this, z11);
                }
            }
            this.f1753u = false;
        }
    }

    public void e0(boolean z11) {
        this.f1757z = z11;
    }

    public boolean f(g gVar) {
        boolean z11 = false;
        if (!this.f1754w.isEmpty() && this.f1755x == gVar) {
            h0();
            Iterator<WeakReference<j>> it2 = this.f1754w.iterator();
            while (it2.hasNext()) {
                WeakReference next = it2.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f1754w.remove(next);
                } else {
                    z11 = jVar.h(this, gVar);
                    if (z11) {
                        break;
                    }
                }
            }
            g0();
            if (z11) {
                this.f1755x = null;
            }
        }
        return z11;
    }

    public MenuItem findItem(int i11) {
        MenuItem findItem;
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = this.f1743f.get(i12);
            if (gVar.getItemId() == i11) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i11)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public void g0() {
        this.q = false;
        if (this.f1751r) {
            this.f1751r = false;
            M(this.f1752s);
        }
    }

    public MenuItem getItem(int i11) {
        return this.f1743f.get(i11);
    }

    /* access modifiers changed from: package-private */
    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f1742e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public void h0() {
        if (!this.q) {
            this.q = true;
            this.f1751r = false;
            this.f1752s = false;
        }
    }

    public boolean hasVisibleItems() {
        if (this.f1757z) {
            return true;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f1743f.get(i11).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        return r(i11, keyEvent) != null;
    }

    public boolean m(g gVar) {
        boolean z11 = false;
        if (this.f1754w.isEmpty()) {
            return false;
        }
        h0();
        Iterator<WeakReference<j>> it2 = this.f1754w.iterator();
        while (it2.hasNext()) {
            WeakReference next = it2.next();
            j jVar = (j) next.get();
            if (jVar == null) {
                this.f1754w.remove(next);
            } else {
                z11 = jVar.d(this, gVar);
                if (z11) {
                    break;
                }
            }
        }
        g0();
        if (z11) {
            this.f1755x = gVar;
        }
        return z11;
    }

    public int n(int i11) {
        return o(i11, 0);
    }

    public int o(int i11, int i12) {
        int size = size();
        if (i12 < 0) {
            i12 = 0;
        }
        while (i12 < size) {
            if (this.f1743f.get(i12).getGroupId() == i11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i11, int i12) {
        return N(findItem(i11), i12);
    }

    public boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        g r11 = r(i11, keyEvent);
        boolean N = r11 != null ? N(r11, i12) : false;
        if ((i12 & 2) != 0) {
            e(true);
        }
        return N;
    }

    public int q(int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f1743f.get(i12).getItemId() == i11) {
                return i12;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public g r(int i11, KeyEvent keyEvent) {
        char c11;
        ArrayList<g> arrayList = this.v;
        arrayList.clear();
        s(arrayList, i11, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean I = I();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = arrayList.get(i12);
            if (I) {
                c11 = gVar.getAlphabeticShortcut();
            } else {
                c11 = gVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c11 == cArr[0] && (metaState & 2) == 0) || ((c11 == cArr[2] && (metaState & 2) != 0) || (I && c11 == 8 && i11 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    public void removeGroup(int i11) {
        int n11 = n(i11);
        if (n11 >= 0) {
            int size = this.f1743f.size() - n11;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= size || this.f1743f.get(n11).getGroupId() != i11) {
                    M(true);
                } else {
                    P(n11, false);
                    i12 = i13;
                }
            }
            M(true);
        }
    }

    public void removeItem(int i11) {
        P(q(i11), true);
    }

    /* access modifiers changed from: package-private */
    public void s(List<g> list, int i11, KeyEvent keyEvent) {
        boolean I = I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i11 == 67) {
            int size = this.f1743f.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = this.f1743f.get(i12);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).s(list, i11, keyEvent);
                }
                char alphabeticShortcut = I ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((I ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (I && alphabeticShortcut == 8 && i11 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void setGroupCheckable(int i11, boolean z11, boolean z12) {
        int size = this.f1743f.size();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = this.f1743f.get(i12);
            if (gVar.getGroupId() == i11) {
                gVar.t(z12);
                gVar.setCheckable(z11);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z11) {
        this.f1756y = z11;
    }

    public void setGroupEnabled(int i11, boolean z11) {
        int size = this.f1743f.size();
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = this.f1743f.get(i12);
            if (gVar.getGroupId() == i11) {
                gVar.setEnabled(z11);
            }
        }
    }

    public void setGroupVisible(int i11, boolean z11) {
        int size = this.f1743f.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            g gVar = this.f1743f.get(i12);
            if (gVar.getGroupId() == i11 && gVar.y(z11)) {
                z12 = true;
            }
        }
        if (z12) {
            M(true);
        }
    }

    public void setQwertyMode(boolean z11) {
        this.f1740c = z11;
        M(false);
    }

    public int size() {
        return this.f1743f.size();
    }

    public void t() {
        ArrayList<g> G = G();
        if (this.k) {
            Iterator<WeakReference<j>> it2 = this.f1754w.iterator();
            boolean z11 = false;
            while (it2.hasNext()) {
                WeakReference next = it2.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f1754w.remove(next);
                } else {
                    z11 |= jVar.g();
                }
            }
            if (z11) {
                this.f1746i.clear();
                this.j.clear();
                int size = G.size();
                for (int i11 = 0; i11 < size; i11++) {
                    g gVar = G.get(i11);
                    if (gVar.l()) {
                        this.f1746i.add(gVar);
                    } else {
                        this.j.add(gVar);
                    }
                }
            } else {
                this.f1746i.clear();
                this.j.clear();
                this.j.addAll(G());
            }
            this.k = false;
        }
    }

    public ArrayList<g> u() {
        t();
        return this.f1746i;
    }

    /* access modifiers changed from: protected */
    public String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f1738a;
    }

    public g x() {
        return this.f1755x;
    }

    public Drawable y() {
        return this.f1749o;
    }

    public CharSequence z() {
        return this.n;
    }

    public MenuItem add(int i11) {
        return a(0, 0, 0, this.f1739b.getString(i11));
    }

    public SubMenu addSubMenu(int i11) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1739b.getString(i11));
    }

    public MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return a(i11, i12, i13, charSequence);
    }

    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        g gVar = (g) a(i11, i12, i13, charSequence);
        m mVar = new m(this.f1738a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    public MenuItem add(int i11, int i12, int i13, int i14) {
        return a(i11, i12, i13, this.f1739b.getString(i14));
    }

    public SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return addSubMenu(i11, i12, i13, (CharSequence) this.f1739b.getString(i14));
    }
}
