package l1;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import bp0.k;
import kotlin.jvm.internal.p;
import lp0.a;
import t0.h;

/* compiled from: TextActionModeCallback.android.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a<k> f15436a;

    /* renamed from: b  reason: collision with root package name */
    private h f15437b;

    /* renamed from: c  reason: collision with root package name */
    private a<k> f15438c;

    /* renamed from: d  reason: collision with root package name */
    private a<k> f15439d;

    /* renamed from: e  reason: collision with root package name */
    private a<k> f15440e;

    /* renamed from: f  reason: collision with root package name */
    private a<k> f15441f;

    public c(a<k> aVar, h hVar, a<k> aVar2, a<k> aVar3, a<k> aVar4, a<k> aVar5) {
        p.j(hVar, "rect");
        this.f15436a = aVar;
        this.f15437b = hVar;
        this.f15438c = aVar2;
        this.f15439d = aVar3;
        this.f15440e = aVar4;
        this.f15441f = aVar5;
    }

    private final void b(Menu menu, MenuItemOption menuItemOption, a<k> aVar) {
        if (aVar != null && menu.findItem(menuItemOption.getId()) == null) {
            a(menu, menuItemOption);
        } else if (aVar == null && menu.findItem(menuItemOption.getId()) != null) {
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void a(Menu menu, MenuItemOption menuItemOption) {
        p.j(menu, "menu");
        p.j(menuItemOption, "item");
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    public final h c() {
        return this.f15437b;
    }

    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        p.g(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            a<k> aVar = this.f15438c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            a<k> aVar2 = this.f15439d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            a<k> aVar3 = this.f15440e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId != MenuItemOption.SelectAll.getId()) {
            return false;
        } else {
            a<k> aVar4 = this.f15441f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (actionMode != null) {
            if (this.f15438c != null) {
                a(menu, MenuItemOption.Copy);
            }
            if (this.f15439d != null) {
                a(menu, MenuItemOption.Paste);
            }
            if (this.f15440e != null) {
                a(menu, MenuItemOption.Cut);
            }
            if (this.f15441f == null) {
                return true;
            }
            a(menu, MenuItemOption.SelectAll);
            return true;
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public final void f() {
        a<k> aVar = this.f15436a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean g(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        m(menu);
        return true;
    }

    public final void h(a<k> aVar) {
        this.f15438c = aVar;
    }

    public final void i(a<k> aVar) {
        this.f15440e = aVar;
    }

    public final void j(a<k> aVar) {
        this.f15439d = aVar;
    }

    public final void k(a<k> aVar) {
        this.f15441f = aVar;
    }

    public final void l(h hVar) {
        p.j(hVar, "<set-?>");
        this.f15437b = hVar;
    }

    public final void m(Menu menu) {
        p.j(menu, "menu");
        b(menu, MenuItemOption.Copy, this.f15438c);
        b(menu, MenuItemOption.Paste, this.f15439d);
        b(menu, MenuItemOption.Cut, this.f15440e);
        b(menu, MenuItemOption.SelectAll, this.f15441f);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c(lp0.a r6, t0.h r7, lp0.a r8, lp0.a r9, lp0.a r10, lp0.a r11, int r12, kotlin.jvm.internal.i r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x0012
            t0.h$a r6 = t0.h.f16667e
            t0.h r7 = r6.a()
        L_0x0012:
            r1 = r7
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0019
            r2 = r0
            goto L_0x001a
        L_0x0019:
            r2 = r8
        L_0x001a:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0020
            r3 = r0
            goto L_0x0021
        L_0x0020:
            r3 = r9
        L_0x0021:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0027
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r10
        L_0x0028:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002e
            r12 = r0
            goto L_0x002f
        L_0x002e:
            r12 = r11
        L_0x002f:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.c.<init>(lp0.a, t0.h, lp0.a, lp0.a, lp0.a, lp0.a, int, kotlin.jvm.internal.i):void");
    }
}
