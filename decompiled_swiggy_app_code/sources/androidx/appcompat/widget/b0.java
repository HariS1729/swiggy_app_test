package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.core.view.a0;
import androidx.core.widget.j;
import com.reactnativecommunity.webview.RNCWebViewManager;
import defpackage.q1;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow */
public class b0 implements q1.f {
    private static Method G;
    private static Method H;
    private static Method I;
    private Runnable A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* renamed from: a  reason: collision with root package name */
    private Context f2076a;

    /* renamed from: b  reason: collision with root package name */
    private ListAdapter f2077b;

    /* renamed from: c  reason: collision with root package name */
    y f2078c;

    /* renamed from: d  reason: collision with root package name */
    private int f2079d;

    /* renamed from: e  reason: collision with root package name */
    private int f2080e;

    /* renamed from: f  reason: collision with root package name */
    private int f2081f;

    /* renamed from: g  reason: collision with root package name */
    private int f2082g;

    /* renamed from: h  reason: collision with root package name */
    private int f2083h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2084i;
    private boolean j;
    private boolean k;

    /* renamed from: l  reason: collision with root package name */
    private int f2085l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2086m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    int f2087o;

    /* renamed from: p  reason: collision with root package name */
    private View f2088p;
    private int q;

    /* renamed from: r  reason: collision with root package name */
    private DataSetObserver f2089r;

    /* renamed from: s  reason: collision with root package name */
    private View f2090s;
    private Drawable t;

    /* renamed from: u  reason: collision with root package name */
    private AdapterView.OnItemClickListener f2091u;
    private AdapterView.OnItemSelectedListener v;

    /* renamed from: w  reason: collision with root package name */
    final g f2092w;

    /* renamed from: x  reason: collision with root package name */
    private final f f2093x;

    /* renamed from: y  reason: collision with root package name */
    private final e f2094y;

    /* renamed from: z  reason: collision with root package name */
    private final c f2095z;

    /* compiled from: ListPopupWindow */
    class a implements Runnable {
        a() {
        }

        public void run() {
            View s11 = b0.this.s();
            if (s11 != null && s11.getWindowToken() != null) {
                b0.this.a();
            }
        }
    }

    /* compiled from: ListPopupWindow */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j) {
            y yVar;
            if (i11 != -1 && (yVar = b0.this.f2078c) != null) {
                yVar.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: ListPopupWindow */
    private class c implements Runnable {
        c() {
        }

        public void run() {
            b0.this.q();
        }
    }

    /* compiled from: ListPopupWindow */
    private class d extends DataSetObserver {
        d() {
        }

        public void onChanged() {
            if (b0.this.b()) {
                b0.this.a();
            }
        }

        public void onInvalidated() {
            b0.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow */
    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i11) {
            if (i11 == 1 && !b0.this.z() && b0.this.F.getContentView() != null) {
                b0 b0Var = b0.this;
                b0Var.B.removeCallbacks(b0Var.f2092w);
                b0.this.f2092w.run();
            }
        }
    }

    /* compiled from: ListPopupWindow */
    private class f implements View.OnTouchListener {
        f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = b0.this.F) != null && popupWindow.isShowing() && x11 >= 0 && x11 < b0.this.F.getWidth() && y11 >= 0 && y11 < b0.this.F.getHeight()) {
                b0 b0Var = b0.this;
                b0Var.B.postDelayed(b0Var.f2092w, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                b0 b0Var2 = b0.this;
                b0Var2.B.removeCallbacks(b0Var2.f2092w);
                return false;
            }
        }
    }

    /* compiled from: ListPopupWindow */
    private class g implements Runnable {
        g() {
        }

        public void run() {
            y yVar = b0.this.f2078c;
            if (yVar != null && a0.Z(yVar) && b0.this.f2078c.getCount() > b0.this.f2078c.getChildCount()) {
                int childCount = b0.this.f2078c.getChildCount();
                b0 b0Var = b0.this;
                if (childCount <= b0Var.f2087o) {
                    b0Var.F.setInputMethodMode(2);
                    b0.this.a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                G = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                H = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public b0(Context context) {
        this(context, (AttributeSet) null, R.attr.listPopupWindowStyle);
    }

    private void B() {
        View view = this.f2088p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2088p);
            }
        }
    }

    private void M(boolean z11) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = G;
            if (method != null) {
                try {
                    method.invoke(this.F, new Object[]{Boolean.valueOf(z11)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.F.setIsClippedToScreen(z11);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int p() {
        /*
            r12 = this;
            androidx.appcompat.widget.y r0 = r12.f2078c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00bf
            android.content.Context r0 = r12.f2076a
            androidx.appcompat.widget.b0$a r5 = new androidx.appcompat.widget.b0$a
            r5.<init>()
            r12.A = r5
            boolean r5 = r12.E
            r5 = r5 ^ r3
            androidx.appcompat.widget.y r5 = r12.r(r0, r5)
            r12.f2078c = r5
            android.graphics.drawable.Drawable r6 = r12.t
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.y r5 = r12.f2078c
            android.widget.ListAdapter r6 = r12.f2077b
            r5.setAdapter(r6)
            androidx.appcompat.widget.y r5 = r12.f2078c
            android.widget.AdapterView$OnItemClickListener r6 = r12.f2091u
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.y r5 = r12.f2078c
            r5.setFocusable(r3)
            androidx.appcompat.widget.y r5 = r12.f2078c
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.y r5 = r12.f2078c
            androidx.appcompat.widget.b0$b r6 = new androidx.appcompat.widget.b0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.y r5 = r12.f2078c
            androidx.appcompat.widget.b0$e r6 = r12.f2094y
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.v
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.y r6 = r12.f2078c
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.y r5 = r12.f2078c
            android.view.View r6 = r12.f2088p
            if (r6 == 0) goto L_0x00b8
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.q
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.q
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f2080e
            if (r0 < 0) goto L_0x009c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009e
        L_0x009c:
            r0 = 0
            r5 = 0
        L_0x009e:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            android.widget.PopupWindow r6 = r12.F
            r6.setContentView(r5)
            goto L_0x00dd
        L_0x00bf:
            android.widget.PopupWindow r0 = r12.F
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f2088p
            if (r0 == 0) goto L_0x00dc
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            android.widget.PopupWindow r5 = r12.F
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f9
            android.graphics.Rect r6 = r12.C
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.C
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f2084i
            if (r7 != 0) goto L_0x00ff
            int r6 = -r6
            r12.f2082g = r6
            goto L_0x00ff
        L_0x00f9:
            android.graphics.Rect r5 = r12.C
            r5.setEmpty()
            r5 = 0
        L_0x00ff:
            android.widget.PopupWindow r6 = r12.F
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r3 = 0
        L_0x010a:
            android.view.View r4 = r12.s()
            int r6 = r12.f2082g
            int r3 = r12.t(r4, r6, r3)
            boolean r4 = r12.f2086m
            if (r4 != 0) goto L_0x017b
            int r4 = r12.f2079d
            if (r4 != r2) goto L_0x011d
            goto L_0x017b
        L_0x011d:
            int r4 = r12.f2080e
            r6 = -2
            if (r4 == r6) goto L_0x0144
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x015c
        L_0x012b:
            android.content.Context r2 = r12.f2076a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.C
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x015c
        L_0x0144:
            android.content.Context r2 = r12.f2076a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.C
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x015c:
            r7 = r1
            androidx.appcompat.widget.y r6 = r12.f2078c
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0179
            androidx.appcompat.widget.y r2 = r12.f2078c
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.y r3 = r12.f2078c
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0179:
            int r1 = r1 + r0
            return r1
        L_0x017b:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b0.p():int");
    }

    private int t(View view, int i11, boolean z11) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.F.getMaxAvailableHeight(view, i11, z11);
        }
        Method method = H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.F, new Object[]{view, Integer.valueOf(i11), Boolean.valueOf(z11)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.F.getMaxAvailableHeight(view, i11);
    }

    public boolean A() {
        return this.E;
    }

    public void C(View view) {
        this.f2090s = view;
    }

    public void D(int i11) {
        this.F.setAnimationStyle(i11);
    }

    public void E(int i11) {
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            this.f2080e = rect.left + rect.right + i11;
            return;
        }
        P(i11);
    }

    public void F(int i11) {
        this.f2085l = i11;
    }

    public void G(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void H(int i11) {
        this.F.setInputMethodMode(i11);
    }

    public void I(boolean z11) {
        this.E = z11;
        this.F.setFocusable(z11);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f2091u = onItemClickListener;
    }

    public void L(boolean z11) {
        this.k = true;
        this.j = z11;
    }

    public void N(int i11) {
        this.q = i11;
    }

    public void O(int i11) {
        y yVar = this.f2078c;
        if (b() && yVar != null) {
            yVar.setListSelectionHidden(false);
            yVar.setSelection(i11);
            if (yVar.getChoiceMode() != 0) {
                yVar.setItemChecked(i11, true);
            }
        }
    }

    public void P(int i11) {
        this.f2080e = i11;
    }

    public void a() {
        int p11 = p();
        boolean z11 = z();
        j.b(this.F, this.f2083h);
        boolean z12 = true;
        if (!this.F.isShowing()) {
            int i11 = this.f2080e;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = s().getWidth();
            }
            int i12 = this.f2079d;
            if (i12 == -1) {
                p11 = -1;
            } else if (i12 != -2) {
                p11 = i12;
            }
            this.F.setWidth(i11);
            this.F.setHeight(p11);
            M(true);
            this.F.setOutsideTouchable(!this.n && !this.f2086m);
            this.F.setTouchInterceptor(this.f2093x);
            if (this.k) {
                j.a(this.F, this.j);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = I;
                if (method != null) {
                    try {
                        method.invoke(this.F, new Object[]{this.D});
                    } catch (Exception e11) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e11);
                    }
                }
            } else {
                this.F.setEpicenterBounds(this.D);
            }
            j.c(this.F, s(), this.f2081f, this.f2082g, this.f2085l);
            this.f2078c.setSelection(-1);
            if (!this.E || this.f2078c.isInTouchMode()) {
                q();
            }
            if (!this.E) {
                this.B.post(this.f2095z);
            }
        } else if (a0.Z(s())) {
            int i13 = this.f2080e;
            if (i13 == -1) {
                i13 = -1;
            } else if (i13 == -2) {
                i13 = s().getWidth();
            }
            int i14 = this.f2079d;
            if (i14 == -1) {
                if (!z11) {
                    p11 = -1;
                }
                if (z11) {
                    this.F.setWidth(this.f2080e == -1 ? -1 : 0);
                    this.F.setHeight(0);
                } else {
                    this.F.setWidth(this.f2080e == -1 ? -1 : 0);
                    this.F.setHeight(-1);
                }
            } else if (i14 != -2) {
                p11 = i14;
            }
            PopupWindow popupWindow = this.F;
            if (this.n || this.f2086m) {
                z12 = false;
            }
            popupWindow.setOutsideTouchable(z12);
            this.F.update(s(), this.f2081f, this.f2082g, i13 < 0 ? -1 : i13, p11 < 0 ? -1 : p11);
        }
    }

    public boolean b() {
        return this.F.isShowing();
    }

    public void c(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void dismiss() {
        this.F.dismiss();
        B();
        this.F.setContentView((View) null);
        this.f2078c = null;
        this.B.removeCallbacks(this.f2092w);
    }

    public void e(int i11) {
        this.f2082g = i11;
        this.f2084i = true;
    }

    public Drawable getBackground() {
        return this.F.getBackground();
    }

    public int h() {
        if (!this.f2084i) {
            return 0;
        }
        return this.f2082g;
    }

    public ListView j() {
        return this.f2078c;
    }

    public int k() {
        return this.f2081f;
    }

    public void l(int i11) {
        this.f2081f = i11;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2089r;
        if (dataSetObserver == null) {
            this.f2089r = new d();
        } else {
            ListAdapter listAdapter2 = this.f2077b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2077b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2089r);
        }
        y yVar = this.f2078c;
        if (yVar != null) {
            yVar.setAdapter(this.f2077b);
        }
    }

    public void q() {
        y yVar = this.f2078c;
        if (yVar != null) {
            yVar.setListSelectionHidden(true);
            yVar.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public y r(Context context, boolean z11) {
        return new y(context, z11);
    }

    public View s() {
        return this.f2090s;
    }

    public Object u() {
        if (!b()) {
            return null;
        }
        return this.f2078c.getSelectedItem();
    }

    public long v() {
        if (!b()) {
            return Long.MIN_VALUE;
        }
        return this.f2078c.getSelectedItemId();
    }

    public int w() {
        if (!b()) {
            return -1;
        }
        return this.f2078c.getSelectedItemPosition();
    }

    public View x() {
        if (!b()) {
            return null;
        }
        return this.f2078c.getSelectedView();
    }

    public int y() {
        return this.f2080e;
    }

    public boolean z() {
        return this.F.getInputMethodMode() == 2;
    }

    public b0(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public b0(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f2079d = -2;
        this.f2080e = -2;
        this.f2083h = RNCWebViewManager.COMMAND_CLEAR_HISTORY;
        this.f2085l = 0;
        this.f2086m = false;
        this.n = false;
        this.f2087o = Integer.MAX_VALUE;
        this.q = 0;
        this.f2092w = new g();
        this.f2093x = new f();
        this.f2094y = new e();
        this.f2095z = new c();
        this.C = new Rect();
        this.f2076a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPopupWindow, i11, i12);
        this.f2081f = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f2082g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2084i = true;
        }
        obtainStyledAttributes.recycle();
        l lVar = new l(context, attributeSet, i11, i12);
        this.F = lVar;
        lVar.setInputMethodMode(1);
    }
}
