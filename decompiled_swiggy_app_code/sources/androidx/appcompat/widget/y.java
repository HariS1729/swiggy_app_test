package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;
import androidx.core.view.h0;
import androidx.core.widget.h;
import g.c;
import java.lang.reflect.Field;

/* compiled from: DropDownListView */
class y extends ListView {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f2312a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private int f2313b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f2314c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f2315d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f2316e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f2317f;

    /* renamed from: g  reason: collision with root package name */
    private Field f2318g;

    /* renamed from: h  reason: collision with root package name */
    private a f2319h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2320i;
    private boolean j;
    private boolean k;

    /* renamed from: l  reason: collision with root package name */
    private h0 f2321l;

    /* renamed from: m  reason: collision with root package name */
    private h f2322m;
    b n;

    /* compiled from: DropDownListView */
    private static class a extends c {

        /* renamed from: b  reason: collision with root package name */
        private boolean f2323b = true;

        a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z11) {
            this.f2323b = z11;
        }

        public void draw(Canvas canvas) {
            if (this.f2323b) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f11, float f12) {
            if (this.f2323b) {
                super.setHotspot(f11, f12);
            }
        }

        public void setHotspotBounds(int i11, int i12, int i13, int i14) {
            if (this.f2323b) {
                super.setHotspotBounds(i11, i12, i13, i14);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f2323b) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z11, boolean z12) {
            if (this.f2323b) {
                return super.setVisible(z11, z12);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView */
    private class b implements Runnable {
        b() {
        }

        public void a() {
            y yVar = y.this;
            yVar.n = null;
            yVar.removeCallbacks(this);
        }

        public void b() {
            y.this.post(this);
        }

        public void run() {
            y yVar = y.this;
            yVar.n = null;
            yVar.drawableStateChanged();
        }
    }

    y(Context context, boolean z11) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.j = z11;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f2318g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e11) {
            e11.printStackTrace();
        }
    }

    private void a() {
        this.k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f2317f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        h0 h0Var = this.f2321l;
        if (h0Var != null) {
            h0Var.c();
            this.f2321l = null;
        }
    }

    private void b(View view, int i11) {
        performItemClick(view, i11, getItemIdAtPosition(i11));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (!this.f2312a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f2312a);
            selector.draw(canvas);
        }
    }

    private void f(int i11, View view) {
        Rect rect = this.f2312a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f2313b;
        rect.top -= this.f2314c;
        rect.right += this.f2315d;
        rect.bottom += this.f2316e;
        try {
            boolean z11 = this.f2318g.getBoolean(this);
            if (view.isEnabled() != z11) {
                this.f2318g.set(this, Boolean.valueOf(!z11));
                if (i11 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
        }
    }

    private void g(int i11, View view) {
        Drawable selector = getSelector();
        boolean z11 = true;
        boolean z12 = (selector == null || i11 == -1) ? false : true;
        if (z12) {
            selector.setVisible(false, false);
        }
        f(i11, view);
        if (z12) {
            Rect rect = this.f2312a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z11 = false;
            }
            selector.setVisible(z11, false);
            androidx.core.graphics.drawable.a.k(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i11, View view, float f11, float f12) {
        g(i11, view);
        Drawable selector = getSelector();
        if (selector != null && i11 != -1) {
            androidx.core.graphics.drawable.a.k(selector, f11, f12);
        }
    }

    private void i(View view, int i11, float f11, float f12) {
        View childAt;
        this.k = true;
        drawableHotspotChanged(f11, f12);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i12 = this.f2317f;
        if (!(i12 == -1 || (childAt = getChildAt(i12 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f2317f = i11;
        view.drawableHotspotChanged(f11 - ((float) view.getLeft()), f12 - ((float) view.getTop()));
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i11, view, f11, f12);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return this.k;
    }

    private void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z11) {
        a aVar = this.f2319h;
        if (aVar != null) {
            aVar.c(z11);
        }
    }

    public int d(int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i17 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        while (i18 < count) {
            int itemViewType = adapter.getItemViewType(i18);
            if (itemViewType != i19) {
                view = null;
                i19 = itemViewType;
            }
            view = adapter.getView(i18, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i22 = layoutParams.height;
            if (i22 > 0) {
                i16 = View.MeasureSpec.makeMeasureSpec(i22, 1073741824);
            } else {
                i16 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i11, i16);
            view.forceLayout();
            if (i18 > 0) {
                i17 += dividerHeight;
            }
            i17 += view.getMeasuredHeight();
            if (i17 >= i14) {
                return (i15 < 0 || i18 <= i15 || i21 <= 0 || i17 == i14) ? i14 : i21;
            }
            if (i15 >= 0 && i18 >= i15) {
                i21 = i17;
            }
            i18++;
        }
        return i17;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.h r9 = r7.f2322m
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.h r9 = new androidx.core.widget.h
            r9.<init>(r7)
            r7.f2322m = r9
        L_0x005a:
            androidx.core.widget.h r9 = r7.f2322m
            r9.m(r2)
            androidx.core.widget.h r9 = r7.f2322m
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.h r8 = r7.f2322m
            if (r8 == 0) goto L_0x006c
            r8.m(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.j || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.j || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.j && this.f2320i) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.n == null) {
            b bVar = new b();
            this.n = bVar;
            bVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2317f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.n;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z11) {
        this.f2320i = z11;
    }

    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f2319h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2313b = rect.left;
        this.f2314c = rect.top;
        this.f2315d = rect.right;
        this.f2316e = rect.bottom;
    }
}
