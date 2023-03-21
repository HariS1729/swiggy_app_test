package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow */
public class d0 extends b0 implements c0 {
    private static Method L;
    private c0 K;

    /* compiled from: MenuPopupWindow */
    public static class a extends y {

        /* renamed from: o  reason: collision with root package name */
        final int f2112o;

        /* renamed from: p  reason: collision with root package name */
        final int f2113p;
        private c0 q;

        /* renamed from: r  reason: collision with root package name */
        private MenuItem f2114r;

        public a(Context context, boolean z11) {
            super(context, z11);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f2112o = 21;
                this.f2113p = 22;
                return;
            }
            this.f2112o = 22;
            this.f2113p = 21;
        }

        public /* bridge */ /* synthetic */ int d(int i11, int i12, int i13, int i14, int i15) {
            return super.d(i11, i12, i13, i14, i15);
        }

        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i11) {
            return super.e(motionEvent, i11);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i11;
            d dVar;
            int pointToPosition;
            int i12;
            if (this.q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i11 = headerViewListAdapter.getHeadersCount();
                    dVar = (d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i11 = 0;
                    dVar = (d) adapter;
                }
                g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i12 = pointToPosition - i11) >= 0 && i12 < dVar.getCount()) {
                    gVar = dVar.getItem(i12);
                }
                MenuItem menuItem = this.f2114r;
                if (menuItem != gVar) {
                    e b11 = dVar.b();
                    if (menuItem != null) {
                        this.q.i(b11, menuItem);
                    }
                    this.f2114r = gVar;
                    if (gVar != null) {
                        this.q.d(b11, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i11, KeyEvent keyEvent) {
            d dVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i11 == this.f2112o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i11 != this.f2113p) {
                return super.onKeyDown(i11, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    dVar = (d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    dVar = (d) adapter;
                }
                dVar.b().e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(c0 c0Var) {
            this.q = c0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                L = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public d0(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
    }

    public void Q(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.F.setEnterTransition((Transition) obj);
        }
    }

    public void R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.F.setExitTransition((Transition) obj);
        }
    }

    public void S(c0 c0Var) {
        this.K = c0Var;
    }

    public void T(boolean z11) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = L;
            if (method != null) {
                try {
                    method.invoke(this.F, new Object[]{Boolean.valueOf(z11)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.F.setTouchModal(z11);
        }
    }

    public void d(e eVar, MenuItem menuItem) {
        c0 c0Var = this.K;
        if (c0Var != null) {
            c0Var.d(eVar, menuItem);
        }
    }

    public void i(e eVar, MenuItem menuItem) {
        c0 c0Var = this.K;
        if (c0Var != null) {
            c0Var.i(eVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    public y r(Context context, boolean z11) {
        a aVar = new a(context, z11);
        aVar.setHoverListener(this);
        return aVar;
    }
}
