package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import defpackage.p1;
import defpackage.q1;
import java.util.ArrayList;

class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements b.a {
    c A;
    private b B;
    final f C = new f();
    int D;
    d k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f1853l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1854m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1855o;

    /* renamed from: p  reason: collision with root package name */
    private int f1856p;
    private int q;

    /* renamed from: r  reason: collision with root package name */
    private int f1857r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1858s;
    private boolean t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1859u;
    private boolean v;

    /* renamed from: w  reason: collision with root package name */
    private int f1860w;

    /* renamed from: x  reason: collision with root package name */
    private final SparseBooleanArray f1861x = new SparseBooleanArray();

    /* renamed from: y  reason: collision with root package name */
    e f1862y;

    /* renamed from: z  reason: collision with root package name */
    a f1863z;

    @SuppressLint({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f1864a;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f1864a);
        }

        SavedState(Parcel parcel) {
            this.f1864a = parcel.readInt();
        }
    }

    private class a extends i {
        public a(Context context, m mVar, View view) {
            super(context, mVar, view, false, R.attr.actionOverflowMenuStyle);
            if (!((g) mVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.k;
                f(view2 == null ? (View) ActionMenuPresenter.this.f1691i : view2);
            }
            j(ActionMenuPresenter.this.C);
        }

        /* access modifiers changed from: protected */
        public void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f1863z = null;
            actionMenuPresenter.D = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        public q1.f a() {
            a aVar = ActionMenuPresenter.this.f1863z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    private class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private e f1867a;

        public c(e eVar) {
            this.f1867a = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f1685c != null) {
                ActionMenuPresenter.this.f1685c.d();
            }
            View view = (View) ActionMenuPresenter.this.f1691i;
            if (!(view == null || view.getWindowToken() == null || !this.f1867a.m())) {
                ActionMenuPresenter.this.f1862y = this.f1867a;
            }
            ActionMenuPresenter.this.A = null;
        }
    }

    private class d extends AppCompatImageView implements ActionMenuView.a {

        class a extends a0 {
            final /* synthetic */ ActionMenuPresenter j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.j = actionMenuPresenter;
            }

            public q1.f b() {
                e eVar = ActionMenuPresenter.this.f1862y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            public boolean c() {
                ActionMenuPresenter.this.M();
                return true;
            }

            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.A != null) {
                    return false;
                }
                actionMenuPresenter.D();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            q0.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.M();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i11, int i12, int i13, int i14) {
            boolean frame = super.setFrame(i11, i12, i13, i14);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    private class e extends i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z11) {
            super(context, eVar, view, z11, R.attr.actionOverflowMenuStyle);
            h(8388613);
            j(ActionMenuPresenter.this.C);
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (ActionMenuPresenter.this.f1685c != null) {
                ActionMenuPresenter.this.f1685c.close();
            }
            ActionMenuPresenter.this.f1862y = null;
            super.e();
        }
    }

    private class f implements j.a {
        f() {
        }

        public void c(androidx.appcompat.view.menu.e eVar, boolean z11) {
            if (eVar instanceof m) {
                eVar.F().e(false);
            }
            j.a o11 = ActionMenuPresenter.this.o();
            if (o11 != null) {
                o11.c(eVar, z11);
            }
        }

        public boolean d(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ActionMenuPresenter.this.f1685c) {
                return false;
            }
            ActionMenuPresenter.this.D = ((m) eVar).getItem().getItemId();
            j.a o11 = ActionMenuPresenter.this.o();
            if (o11 != null) {
                return o11.d(eVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
    }

    private View B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1691i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        return D() | E();
    }

    public Drawable C() {
        d dVar = this.k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1854m) {
            return this.f1853l;
        }
        return null;
    }

    public boolean D() {
        k kVar;
        c cVar = this.A;
        if (cVar == null || (kVar = this.f1691i) == null) {
            e eVar = this.f1862y;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) kVar).removeCallbacks(cVar);
        this.A = null;
        return true;
    }

    public boolean E() {
        a aVar = this.f1863z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean F() {
        return this.A != null || G();
    }

    public boolean G() {
        e eVar = this.f1862y;
        return eVar != null && eVar.d();
    }

    public void H(Configuration configuration) {
        if (!this.f1858s) {
            this.f1857r = p1.b.b(this.f1684b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f1685c;
        if (eVar != null) {
            eVar.M(true);
        }
    }

    public void I(boolean z11) {
        this.v = z11;
    }

    public void J(ActionMenuView actionMenuView) {
        this.f1691i = actionMenuView;
        actionMenuView.a(this.f1685c);
    }

    public void K(Drawable drawable) {
        d dVar = this.k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1854m = true;
        this.f1853l = drawable;
    }

    public void L(boolean z11) {
        this.n = z11;
        this.f1855o = true;
    }

    public boolean M() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.n || G() || (eVar = this.f1685c) == null || this.f1691i == null || this.A != null || eVar.B().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f1684b, this.f1685c, this.k, true));
        this.A = cVar;
        ((View) this.f1691i).post(cVar);
        return true;
    }

    public void b(g gVar, k.a aVar) {
        aVar.e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1691i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    public void c(androidx.appcompat.view.menu.e eVar, boolean z11) {
        A();
        super.c(eVar, z11);
    }

    public Parcelable e() {
        SavedState savedState = new SavedState();
        savedState.f1864a = this.D;
        return savedState;
    }

    public void f(boolean z11) {
        k kVar;
        super.f(z11);
        ((View) this.f1691i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f1685c;
        boolean z12 = false;
        if (eVar != null) {
            ArrayList<g> u11 = eVar.u();
            int size = u11.size();
            for (int i11 = 0; i11 < size; i11++) {
                androidx.core.view.b a11 = u11.get(i11).a();
                if (a11 != null) {
                    a11.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f1685c;
        ArrayList<g> B2 = eVar2 != null ? eVar2.B() : null;
        if (this.n && B2 != null) {
            int size2 = B2.size();
            if (size2 == 1) {
                z12 = !B2.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z12 = true;
            }
        }
        if (z12) {
            if (this.k == null) {
                this.k = new d(this.f1683a);
            }
            ViewGroup viewGroup = (ViewGroup) this.k.getParent();
            if (viewGroup != this.f1691i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1691i;
                actionMenuView.addView(this.k, actionMenuView.F());
            }
        } else {
            d dVar = this.k;
            if (dVar != null && dVar.getParent() == (kVar = this.f1691i)) {
                ((ViewGroup) kVar).removeView(this.k);
            }
        }
        ((ActionMenuView) this.f1691i).setOverflowReserved(this.n);
    }

    public boolean g() {
        int i11;
        ArrayList<g> arrayList;
        int i12;
        int i13;
        int i14;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.e eVar = actionMenuPresenter.f1685c;
        View view = null;
        int i15 = 0;
        if (eVar != null) {
            arrayList = eVar.G();
            i11 = arrayList.size();
        } else {
            arrayList = null;
            i11 = 0;
        }
        int i16 = actionMenuPresenter.f1857r;
        int i17 = actionMenuPresenter.q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f1691i;
        boolean z11 = false;
        int i18 = 0;
        int i19 = 0;
        for (int i21 = 0; i21 < i11; i21++) {
            g gVar = arrayList.get(i21);
            if (gVar.o()) {
                i18++;
            } else if (gVar.n()) {
                i19++;
            } else {
                z11 = true;
            }
            if (actionMenuPresenter.v && gVar.isActionViewExpanded()) {
                i16 = 0;
            }
        }
        if (actionMenuPresenter.n && (z11 || i19 + i18 > i16)) {
            i16--;
        }
        int i22 = i16 - i18;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f1861x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.t) {
            int i23 = actionMenuPresenter.f1860w;
            i12 = i17 / i23;
            i13 = i23 + ((i17 % i23) / i12);
        } else {
            i13 = 0;
            i12 = 0;
        }
        int i24 = 0;
        int i25 = 0;
        while (i24 < i11) {
            g gVar2 = arrayList.get(i24);
            if (gVar2.o()) {
                View p11 = actionMenuPresenter.p(gVar2, view, viewGroup);
                if (actionMenuPresenter.t) {
                    i12 -= ActionMenuView.L(p11, i13, i12, makeMeasureSpec, i15);
                } else {
                    p11.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = p11.getMeasuredWidth();
                i17 -= measuredWidth;
                if (i25 == 0) {
                    i25 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                i14 = i11;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i22 > 0 || z12) && i17 > 0 && (!actionMenuPresenter.t || i12 > 0);
                boolean z14 = z13;
                i14 = i11;
                if (z13) {
                    View p12 = actionMenuPresenter.p(gVar2, (View) null, viewGroup);
                    if (actionMenuPresenter.t) {
                        int L = ActionMenuView.L(p12, i13, i12, makeMeasureSpec, 0);
                        i12 -= L;
                        if (L == 0) {
                            z14 = false;
                        }
                    } else {
                        p12.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = p12.getMeasuredWidth();
                    i17 -= measuredWidth2;
                    if (i25 == 0) {
                        i25 = measuredWidth2;
                    }
                    z13 = z15 & (!actionMenuPresenter.t ? i17 + i25 > 0 : i17 >= 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    int i26 = 0;
                    while (i26 < i24) {
                        g gVar3 = arrayList.get(i26);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i22++;
                            }
                            gVar3.u(false);
                        }
                        i26++;
                    }
                }
                if (z13) {
                    i22--;
                }
                gVar2.u(z13);
            } else {
                i14 = i11;
                gVar2.u(false);
                i24++;
                view = null;
                actionMenuPresenter = this;
                i11 = i14;
                i15 = 0;
            }
            i24++;
            view = null;
            actionMenuPresenter = this;
            i11 = i14;
            i15 = 0;
        }
        return true;
    }

    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        p1.b b11 = p1.b.b(context);
        if (!this.f1855o) {
            this.n = b11.h();
        }
        if (!this.f1859u) {
            this.f1856p = b11.c();
        }
        if (!this.f1858s) {
            this.f1857r = b11.d();
        }
        int i11 = this.f1856p;
        if (this.n) {
            if (this.k == null) {
                d dVar = new d(this.f1683a);
                this.k = dVar;
                if (this.f1854m) {
                    dVar.setImageDrawable(this.f1853l);
                    this.f1853l = null;
                    this.f1854m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i11 -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = i11;
        this.f1860w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void l(Parcelable parcelable) {
        int i11;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i11 = ((SavedState) parcelable).f1864a) > 0 && (findItem = this.f1685c.findItem(i11)) != null) {
            m((m) findItem.getSubMenu());
        }
    }

    public boolean m(m mVar) {
        boolean z11 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        m mVar2 = mVar;
        while (mVar2.i0() != this.f1685c) {
            mVar2 = (m) mVar2.i0();
        }
        View B2 = B(mVar2.getItem());
        if (B2 == null) {
            return false;
        }
        this.D = mVar.getItem().getItemId();
        int size = mVar.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i11);
            if (item.isVisible() && item.getIcon() != null) {
                z11 = true;
                break;
            }
            i11++;
        }
        a aVar = new a(this.f1684b, mVar, B2);
        this.f1863z = aVar;
        aVar.g(z11);
        this.f1863z.k();
        super.m(mVar);
        return true;
    }

    public boolean n(ViewGroup viewGroup, int i11) {
        if (viewGroup.getChildAt(i11) == this.k) {
            return false;
        }
        return super.n(viewGroup, i11);
    }

    public View p(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.p(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    public k q(ViewGroup viewGroup) {
        k kVar = this.f1691i;
        k q11 = super.q(viewGroup);
        if (kVar != q11) {
            ((ActionMenuView) q11).setPresenter(this);
        }
        return q11;
    }

    public boolean s(int i11, g gVar) {
        return gVar.l();
    }
}
