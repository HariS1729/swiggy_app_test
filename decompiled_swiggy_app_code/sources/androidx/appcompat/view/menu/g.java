package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.k;
import androidx.core.view.b;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import p2.b;

/* compiled from: MenuItemImpl */
public final class g implements b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private boolean D = false;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f1762a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1763b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1764c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1765d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f1766e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f1767f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f1768g;

    /* renamed from: h  reason: collision with root package name */
    private char f1769h;

    /* renamed from: i  reason: collision with root package name */
    private int f1770i = 4096;
    private char j;
    private int k = 4096;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f1771l;

    /* renamed from: m  reason: collision with root package name */
    private int f1772m = 0;
    e n;

    /* renamed from: o  reason: collision with root package name */
    private m f1773o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f1774p;
    private MenuItem.OnMenuItemClickListener q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f1775r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f1776s;
    private ColorStateList t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f1777u = null;
    private boolean v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1778w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1779x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f1780y = 16;

    /* renamed from: z  reason: collision with root package name */
    private int f1781z;

    /* compiled from: MenuItemImpl */
    class a implements b.C0050b {
        a() {
        }

        public void onActionProviderVisibilityChanged(boolean z11) {
            g gVar = g.this;
            gVar.n.L(gVar);
        }
    }

    g(e eVar, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15) {
        this.n = eVar;
        this.f1762a = i12;
        this.f1763b = i11;
        this.f1764c = i13;
        this.f1765d = i14;
        this.f1766e = charSequence;
        this.f1781z = i15;
    }

    private static void d(StringBuilder sb2, int i11, int i12, String str) {
        if ((i11 & i12) == i12) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f1779x && (this.v || this.f1778w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.v) {
                androidx.core.graphics.drawable.a.o(drawable, this.t);
            }
            if (this.f1778w) {
                androidx.core.graphics.drawable.a.p(drawable, this.f1777u);
            }
            this.f1779x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.n.J() && g() != 0;
    }

    public boolean B() {
        return (this.f1781z & 4) == 4;
    }

    public androidx.core.view.b a() {
        return this.B;
    }

    public p2.b b(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.n.M(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public void c() {
        this.n.K(this);
    }

    public boolean collapseActionView() {
        if ((this.f1781z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f1765d;
    }

    /* access modifiers changed from: package-private */
    public char g() {
        return this.n.I() ? this.j : this.f1769h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View d11 = bVar.d(this);
        this.A = d11;
        return d11;
    }

    public int getAlphabeticModifiers() {
        return this.k;
    }

    public char getAlphabeticShortcut() {
        return this.j;
    }

    public CharSequence getContentDescription() {
        return this.f1775r;
    }

    public int getGroupId() {
        return this.f1763b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1771l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f1772m == 0) {
            return null;
        }
        Drawable b11 = f.a.b(this.n.w(), this.f1772m);
        this.f1772m = 0;
        this.f1771l = b11;
        return e(b11);
    }

    public ColorStateList getIconTintList() {
        return this.t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1777u;
    }

    public Intent getIntent() {
        return this.f1768g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1762a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    public int getNumericModifiers() {
        return this.f1770i;
    }

    public char getNumericShortcut() {
        return this.f1769h;
    }

    public int getOrder() {
        return this.f1764c;
    }

    public SubMenu getSubMenu() {
        return this.f1773o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1766e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1767f;
        return charSequence != null ? charSequence : this.f1766e;
    }

    public CharSequence getTooltipText() {
        return this.f1776s;
    }

    /* access modifiers changed from: package-private */
    public String h() {
        char g11 = g();
        if (g11 == 0) {
            return "";
        }
        Resources resources = this.n.w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.n.w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
        }
        int i11 = this.n.I() ? this.k : this.f1770i;
        d(sb2, i11, PDButton.FLAG_PUSHBUTTON, resources.getString(R.string.abc_menu_meta_shortcut_label));
        d(sb2, i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
        d(sb2, i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
        d(sb2, i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
        d(sb2, i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
        d(sb2, i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
        if (g11 == 8) {
            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
        } else if (g11 == 10) {
            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
        } else if (g11 != ' ') {
            sb2.append(g11);
        } else {
            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
        }
        return sb2.toString();
    }

    public boolean hasSubMenu() {
        return this.f1773o != null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence i(k.a aVar) {
        if (aVar == null || !aVar.c()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.D;
    }

    public boolean isCheckable() {
        return (this.f1780y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1780y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1780y & 16) != 0;
    }

    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        if (bVar == null || !bVar.g()) {
            if ((this.f1780y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f1780y & 8) != 0 || !this.B.b()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f1781z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.d(this);
        }
        if (this.A != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f1774p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1768g != null) {
            try {
                this.n.w().startActivity(this.f1768g);
                return true;
            } catch (ActivityNotFoundException e11) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e11);
            }
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null || !bVar.e()) {
            return false;
        }
        return true;
    }

    public boolean l() {
        return (this.f1780y & 32) == 32;
    }

    public boolean m() {
        return (this.f1780y & 4) != 0;
    }

    public boolean n() {
        return (this.f1781z & 1) == 1;
    }

    public boolean o() {
        return (this.f1781z & 2) == 2;
    }

    /* renamed from: p */
    public p2.b setActionView(int i11) {
        Context w11 = this.n.w();
        setActionView(LayoutInflater.from(w11).inflate(i11, new LinearLayout(w11), false));
        return this;
    }

    /* renamed from: q */
    public p2.b setActionView(View view) {
        int i11;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i11 = this.f1762a) > 0) {
            view.setId(i11);
        }
        this.n.K(this);
        return this;
    }

    public void r(boolean z11) {
        this.D = z11;
        this.n.M(false);
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z11) {
        int i11 = this.f1780y;
        int i12 = (z11 ? 2 : 0) | (i11 & -3);
        this.f1780y = i12;
        if (i11 != i12) {
            this.n.M(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c11) {
        if (this.j == c11) {
            return this;
        }
        this.j = Character.toLowerCase(c11);
        this.n.M(false);
        return this;
    }

    public MenuItem setCheckable(boolean z11) {
        int i11 = this.f1780y;
        boolean z12 = z11 | (i11 & true);
        this.f1780y = z12 ? 1 : 0;
        if (i11 != z12) {
            this.n.M(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z11) {
        if ((this.f1780y & 4) != 0) {
            this.n.X(this);
        } else {
            s(z11);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z11) {
        if (z11) {
            this.f1780y |= 16;
        } else {
            this.f1780y &= -17;
        }
        this.n.M(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1772m = 0;
        this.f1771l = drawable;
        this.f1779x = true;
        this.n.M(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.f1779x = true;
        this.n.M(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1777u = mode;
        this.f1778w = true;
        this.f1779x = true;
        this.n.M(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1768g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c11) {
        if (this.f1769h == c11) {
            return this;
        }
        this.f1769h = c11;
        this.n.M(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c11, char c12) {
        this.f1769h = c11;
        this.j = Character.toLowerCase(c12);
        this.n.M(false);
        return this;
    }

    public void setShowAsAction(int i11) {
        int i12 = i11 & 3;
        if (i12 == 0 || i12 == 1 || i12 == 2) {
            this.f1781z = i11;
            this.n.K(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1766e = charSequence;
        this.n.M(false);
        m mVar = this.f1773o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1767f = charSequence;
        this.n.M(false);
        return this;
    }

    public MenuItem setVisible(boolean z11) {
        if (y(z11)) {
            this.n.L(this);
        }
        return this;
    }

    public void t(boolean z11) {
        this.f1780y = (z11 ? 4 : 0) | (this.f1780y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f1766e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z11) {
        if (z11) {
            this.f1780y |= 32;
        } else {
            this.f1780y &= -33;
        }
    }

    /* access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    /* renamed from: w */
    public p2.b setShowAsActionFlags(int i11) {
        setShowAsAction(i11);
        return this;
    }

    public void x(m mVar) {
        this.f1773o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    public boolean y(boolean z11) {
        int i11 = this.f1780y;
        int i12 = (z11 ? 0 : 8) | (i11 & -9);
        this.f1780y = i12;
        if (i11 != i12) {
            return true;
        }
        return false;
    }

    public boolean z() {
        return this.n.C();
    }

    public p2.b setContentDescription(CharSequence charSequence) {
        this.f1775r = charSequence;
        this.n.M(false);
        return this;
    }

    public p2.b setTooltipText(CharSequence charSequence) {
        this.f1776s = charSequence;
        this.n.M(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c11, int i11) {
        if (this.j == c11 && this.k == i11) {
            return this;
        }
        this.j = Character.toLowerCase(c11);
        this.k = KeyEvent.normalizeMetaState(i11);
        this.n.M(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c11, int i11) {
        if (this.f1769h == c11 && this.f1770i == i11) {
            return this;
        }
        this.f1769h = c11;
        this.f1770i = KeyEvent.normalizeMetaState(i11);
        this.n.M(false);
        return this;
    }

    public MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.f1769h = c11;
        this.f1770i = KeyEvent.normalizeMetaState(i11);
        this.j = Character.toLowerCase(c12);
        this.k = KeyEvent.normalizeMetaState(i12);
        this.n.M(false);
        return this;
    }

    public MenuItem setIcon(int i11) {
        this.f1771l = null;
        this.f1772m = i11;
        this.f1779x = true;
        this.n.M(false);
        return this;
    }

    public MenuItem setTitle(int i11) {
        return setTitle((CharSequence) this.n.w().getString(i11));
    }
}
