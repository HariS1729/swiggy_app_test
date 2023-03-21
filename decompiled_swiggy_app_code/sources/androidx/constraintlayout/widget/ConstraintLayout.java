package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.i;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.internal.http2.Http2Connection;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: x  reason: collision with root package name */
    private static g f8693x;

    /* renamed from: a  reason: collision with root package name */
    SparseArray<View> f8694a = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<a> f8695b = new ArrayList<>(4);
    /* access modifiers changed from: protected */

    /* renamed from: c  reason: collision with root package name */
    public d f8696c = new d();

    /* renamed from: d  reason: collision with root package name */
    private int f8697d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f8698e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f8699f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    private int f8700g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f8701h = true;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f8702i = 257;
    private c j = null;
    protected b k = null;

    /* renamed from: l  reason: collision with root package name */
    private int f8703l = -1;

    /* renamed from: m  reason: collision with root package name */
    private HashMap<String, Integer> f8704m = new HashMap<>();
    private int n = -1;

    /* renamed from: o  reason: collision with root package name */
    private int f8705o = -1;

    /* renamed from: p  reason: collision with root package name */
    int f8706p = -1;
    int q = -1;

    /* renamed from: r  reason: collision with root package name */
    int f8707r = 0;

    /* renamed from: s  reason: collision with root package name */
    int f8708s = 0;
    private SparseArray<ConstraintWidget> t = new SparseArray<>();

    /* renamed from: u  reason: collision with root package name */
    c f8709u = new c(this);
    private int v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f8710w = 0;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8711a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8711a = r0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8711a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8711a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8711a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<clinit>():void");
        }
    }

    class c implements b.C0027b {

        /* renamed from: a  reason: collision with root package name */
        ConstraintLayout f8756a;

        /* renamed from: b  reason: collision with root package name */
        int f8757b;

        /* renamed from: c  reason: collision with root package name */
        int f8758c;

        /* renamed from: d  reason: collision with root package name */
        int f8759d;

        /* renamed from: e  reason: collision with root package name */
        int f8760e;

        /* renamed from: f  reason: collision with root package name */
        int f8761f;

        /* renamed from: g  reason: collision with root package name */
        int f8762g;

        public c(ConstraintLayout constraintLayout) {
            this.f8756a = constraintLayout;
        }

        private boolean d(int i11, int i12, int i13) {
            if (i11 == i12) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i11);
            View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i13 == size) {
                return true;
            }
            return false;
        }

        public final void a() {
            int childCount = this.f8756a.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f8756a.getChildAt(i11);
                if (childAt instanceof f) {
                    ((f) childAt).a(this.f8756a);
                }
            }
            int size = this.f8756a.f8695b.size();
            if (size > 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    ((a) this.f8756a.f8695b.get(i12)).s(this.f8756a);
                }
            }
        }

        @SuppressLint({"WrongCall"})
        public final void b(ConstraintWidget constraintWidget, b.a aVar) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            ConstraintWidget constraintWidget2 = constraintWidget;
            b.a aVar2 = aVar;
            if (constraintWidget2 != null) {
                if (constraintWidget.Z() == 8 && !constraintWidget.n0()) {
                    aVar2.f8246e = 0;
                    aVar2.f8247f = 0;
                    aVar2.f8248g = 0;
                } else if (constraintWidget.N() != null) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar2.f8242a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar2.f8243b;
                    int i18 = aVar2.f8244c;
                    int i19 = aVar2.f8245d;
                    int i21 = this.f8757b + this.f8758c;
                    int i22 = this.f8759d;
                    View view = (View) constraintWidget.u();
                    int[] iArr = a.f8711a;
                    int i23 = iArr[dimensionBehaviour.ordinal()];
                    if (i23 == 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                    } else if (i23 == 2) {
                        i11 = ViewGroup.getChildMeasureSpec(this.f8761f, i22, -2);
                    } else if (i23 == 3) {
                        i11 = ViewGroup.getChildMeasureSpec(this.f8761f, i22 + constraintWidget.D(), -1);
                    } else if (i23 != 4) {
                        i11 = 0;
                    } else {
                        i11 = ViewGroup.getChildMeasureSpec(this.f8761f, i22, -2);
                        boolean z11 = constraintWidget2.f8206w == 1;
                        int i24 = aVar2.j;
                        if (i24 == b.a.f8240l || i24 == b.a.f8241m) {
                            if (aVar2.j == b.a.f8241m || !z11 || (z11 && (view.getMeasuredHeight() == constraintWidget.z())) || (view instanceof f) || constraintWidget.r0()) {
                                i11 = View.MeasureSpec.makeMeasureSpec(constraintWidget.a0(), 1073741824);
                            }
                        }
                    }
                    int i25 = iArr[dimensionBehaviour2.ordinal()];
                    if (i25 == 1) {
                        i12 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                    } else if (i25 == 2) {
                        i12 = ViewGroup.getChildMeasureSpec(this.f8762g, i21, -2);
                    } else if (i25 == 3) {
                        i12 = ViewGroup.getChildMeasureSpec(this.f8762g, i21 + constraintWidget.Y(), -1);
                    } else if (i25 != 4) {
                        i12 = 0;
                    } else {
                        i12 = ViewGroup.getChildMeasureSpec(this.f8762g, i21, -2);
                        boolean z12 = constraintWidget2.f8208x == 1;
                        int i26 = aVar2.j;
                        if (i26 == b.a.f8240l || i26 == b.a.f8241m) {
                            if (aVar2.j == b.a.f8241m || !z12 || (z12 && (view.getMeasuredWidth() == constraintWidget.a0())) || (view instanceof f) || constraintWidget.s0()) {
                                i12 = View.MeasureSpec.makeMeasureSpec(constraintWidget.z(), 1073741824);
                            }
                        }
                    }
                    d dVar = (d) constraintWidget.N();
                    if (dVar != null && g.b(ConstraintLayout.this.f8702i, 256) && view.getMeasuredWidth() == constraintWidget.a0() && view.getMeasuredWidth() < dVar.a0() && view.getMeasuredHeight() == constraintWidget.z() && view.getMeasuredHeight() < dVar.z() && view.getBaseline() == constraintWidget.r() && !constraintWidget.q0()) {
                        if (d(constraintWidget.E(), i11, constraintWidget.a0()) && d(constraintWidget.F(), i12, constraintWidget.z())) {
                            aVar2.f8246e = constraintWidget.a0();
                            aVar2.f8247f = constraintWidget.z();
                            aVar2.f8248g = constraintWidget.r();
                            return;
                        }
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z13 = dimensionBehaviour == dimensionBehaviour3;
                    boolean z14 = dimensionBehaviour2 == dimensionBehaviour3;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                    boolean z15 = dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED;
                    boolean z16 = dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED;
                    boolean z17 = z13 && constraintWidget2.f8179f0 > 0.0f;
                    boolean z18 = z14 && constraintWidget2.f8179f0 > 0.0f;
                    if (view != null) {
                        b bVar = (b) view.getLayoutParams();
                        int i27 = aVar2.j;
                        if (i27 == b.a.f8240l || i27 == b.a.f8241m || !z13 || constraintWidget2.f8206w != 0 || !z14 || constraintWidget2.f8208x != 0) {
                            if (!(view instanceof i) || !(constraintWidget2 instanceof i)) {
                                view.measure(i11, i12);
                            } else {
                                ((i) view).x((i) constraintWidget2, i11, i12);
                            }
                            constraintWidget2.b1(i11, i12);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i14 = view.getBaseline();
                            int i28 = constraintWidget2.f8212z;
                            i13 = i28 > 0 ? Math.max(i28, measuredWidth) : measuredWidth;
                            int i29 = constraintWidget2.A;
                            if (i29 > 0) {
                                i13 = Math.min(i29, i13);
                            }
                            int i31 = constraintWidget2.C;
                            if (i31 > 0) {
                                i15 = Math.max(i31, measuredHeight);
                                i17 = i11;
                            } else {
                                i17 = i11;
                                i15 = measuredHeight;
                            }
                            int i32 = constraintWidget2.D;
                            if (i32 > 0) {
                                i15 = Math.min(i32, i15);
                            }
                            if (!g.b(ConstraintLayout.this.f8702i, 1)) {
                                if (z17 && z15) {
                                    i13 = (int) ((((float) i15) * constraintWidget2.f8179f0) + 0.5f);
                                } else if (z18 && z16) {
                                    i15 = (int) ((((float) i13) / constraintWidget2.f8179f0) + 0.5f);
                                }
                            }
                            if (!(measuredWidth == i13 && measuredHeight == i15)) {
                                int makeMeasureSpec = measuredWidth != i13 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : i17;
                                if (measuredHeight != i15) {
                                    i12 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                                }
                                view.measure(makeMeasureSpec, i12);
                                constraintWidget2.b1(makeMeasureSpec, i12);
                                i13 = view.getMeasuredWidth();
                                i15 = view.getMeasuredHeight();
                                i14 = view.getBaseline();
                            }
                            i16 = -1;
                        } else {
                            i16 = -1;
                            i15 = 0;
                            i14 = 0;
                            i13 = 0;
                        }
                        boolean z19 = i14 != i16;
                        aVar2.f8250i = (i13 == aVar2.f8244c && i15 == aVar2.f8245d) ? false : true;
                        if (bVar.f8725g0) {
                            z19 = true;
                        }
                        if (!(!z19 || i14 == -1 || constraintWidget.r() == i14)) {
                            aVar2.f8250i = true;
                        }
                        aVar2.f8246e = i13;
                        aVar2.f8247f = i15;
                        aVar2.f8249h = z19;
                        aVar2.f8248g = i14;
                    }
                }
            }
        }

        public void c(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f8757b = i13;
            this.f8758c = i14;
            this.f8759d = i15;
            this.f8760e = i16;
            this.f8761f = i11;
            this.f8762g = i12;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w(attributeSet, 0, 0);
    }

    private void C() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ConstraintWidget v11 = v(getChildAt(i11));
            if (v11 != null) {
                v11.x0();
            }
        }
        if (isInEditMode) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    D(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    t(childAt.getId()).I0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f8703l != -1) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getId() == this.f8703l && (childAt2 instanceof d)) {
                    this.j = ((d) childAt2).getConstraintSet();
                }
            }
        }
        c cVar = this.j;
        if (cVar != null) {
            cVar.k(this, true);
        }
        this.f8696c.A1();
        int size = this.f8695b.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                this.f8695b.get(i14).v(this);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt3 = getChildAt(i15);
            if (childAt3 instanceof f) {
                ((f) childAt3).b(this);
            }
        }
        this.t.clear();
        this.t.put(0, this.f8696c);
        this.t.put(getId(), this.f8696c);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt4 = getChildAt(i16);
            this.t.put(childAt4.getId(), v(childAt4));
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt5 = getChildAt(i17);
            ConstraintWidget v12 = v(childAt5);
            if (v12 != null) {
                this.f8696c.a(v12);
                p(isInEditMode, childAt5, v12, (b) childAt5.getLayoutParams(), this.t);
            }
        }
    }

    private void F(ConstraintWidget constraintWidget, b bVar, SparseArray<ConstraintWidget> sparseArray, int i11, ConstraintAnchor.Type type) {
        View view = this.f8694a.get(i11);
        ConstraintWidget constraintWidget2 = sparseArray.get(i11);
        if (constraintWidget2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.f8725g0 = true;
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
            if (type == type2) {
                b bVar2 = (b) view.getLayoutParams();
                bVar2.f8725g0 = true;
                bVar2.f8749v0.Q0(true);
            }
            constraintWidget.q(type2).b(constraintWidget2.q(type), bVar.D, bVar.C, true);
            constraintWidget.Q0(true);
            constraintWidget.q(ConstraintAnchor.Type.TOP).q();
            constraintWidget.q(ConstraintAnchor.Type.BOTTOM).q();
        }
    }

    private boolean G() {
        int childCount = getChildCount();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            } else if (getChildAt(i11).isLayoutRequested()) {
                z11 = true;
                break;
            } else {
                i11++;
            }
        }
        if (z11) {
            C();
        }
        return z11;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static g getSharedValues() {
        if (f8693x == null) {
            f8693x = new g();
        }
        return f8693x;
    }

    private final ConstraintWidget t(int i11) {
        if (i11 == 0) {
            return this.f8696c;
        }
        View view = this.f8694a.get(i11);
        if (view == null && (view = findViewById(i11)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f8696c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f8749v0;
    }

    private void w(AttributeSet attributeSet, int i11, int i12) {
        this.f8696c.H0(this);
        this.f8696c.b2(this.f8709u);
        this.f8694a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout, i11, i12);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.f8697d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8697d);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.f8698e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8698e);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.f8699f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8699f);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.f8700g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8700g);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f8702i = obtainStyledAttributes.getInt(index, this.f8702i);
                } else if (index == R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            z(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar = new c();
                        this.j = cVar;
                        cVar.F(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.f8703l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f8696c.c2(this.f8702i);
    }

    private void y() {
        this.f8701h = true;
        this.n = -1;
        this.f8705o = -1;
        this.f8706p = -1;
        this.q = -1;
        this.f8707r = 0;
        this.f8708s = 0;
    }

    /* access modifiers changed from: protected */
    public void A(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        c cVar = this.f8709u;
        int i15 = cVar.f8760e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i13 + cVar.f8759d, i11, 0);
        int min = Math.min(this.f8699f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f8700g, ViewGroup.resolveSizeAndState(i14 + i15, i12, 0) & 16777215);
        if (z11) {
            min |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z12) {
            min2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(min, min2);
        this.n = min;
        this.f8705o = min2;
    }

    /* access modifiers changed from: protected */
    public void B(d dVar, int i11, int i12, int i13) {
        int i14;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i15 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f8709u.c(i12, i13, max, max2, paddingWidth, i15);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 > 0 || max4 > 0) {
            i14 = x() ? max4 : max3;
        } else {
            i14 = Math.max(0, getPaddingLeft());
        }
        int i16 = size - paddingWidth;
        int i17 = size2 - i15;
        E(dVar, mode, i16, mode2, i17);
        dVar.X1(i11, mode, i16, mode2, i17, this.n, this.f8705o, i14, max);
    }

    public void D(int i11, Object obj, Object obj2) {
        if (i11 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f8704m == null) {
                this.f8704m = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f8704m.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    public void E(d dVar, int i11, int i12, int i13, int i14) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        c cVar = this.f8709u;
        int i15 = cVar.f8760e;
        int i16 = cVar.f8759d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i11 != Integer.MIN_VALUE) {
            if (i11 == 0) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i12 = Math.max(0, this.f8697d);
                }
            } else if (i11 != 1073741824) {
                dimensionBehaviour = dimensionBehaviour2;
            } else {
                i12 = Math.min(this.f8699f - i16, i12);
                dimensionBehaviour = dimensionBehaviour2;
            }
            i12 = 0;
        } else {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i12 = Math.max(0, this.f8697d);
            }
        }
        if (i13 != Integer.MIN_VALUE) {
            if (i13 == 0) {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i14 = Math.max(0, this.f8698e);
                }
            } else if (i13 == 1073741824) {
                i14 = Math.min(this.f8700g - i15, i14);
            }
            i14 = 0;
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.f8698e);
            }
        }
        if (!(i12 == dVar.a0() && i14 == dVar.z())) {
            dVar.T1();
        }
        dVar.s1(0);
        dVar.t1(0);
        dVar.d1(this.f8699f - i16);
        dVar.c1(this.f8700g - i15);
        dVar.g1(0);
        dVar.f1(0);
        dVar.V0(dimensionBehaviour);
        dVar.q1(i12);
        dVar.m1(dimensionBehaviour2);
        dVar.R0(i14);
        dVar.g1(this.f8697d - i16);
        dVar.f1(this.f8698e - i15);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<a> arrayList = this.f8695b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                this.f8695b.get(i11).t(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i13 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i14 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f11 = (float) i13;
                        float f12 = (float) (i13 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f13 = (float) i14;
                        float f14 = f11;
                        float f15 = f11;
                        float f16 = f13;
                        Paint paint2 = paint;
                        float f17 = f12;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f14, f16, f17, f13, paint3);
                        float parseInt4 = (float) (i14 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f18 = f12;
                        float f19 = parseInt4;
                        canvas2.drawLine(f18, f16, f17, f19, paint3);
                        float f21 = parseInt4;
                        float f22 = f15;
                        canvas2.drawLine(f18, f21, f22, f19, paint3);
                        float f23 = f15;
                        canvas2.drawLine(f23, f21, f22, f13, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f24 = f12;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f23, f13, f24, parseInt4, paint6);
                        canvas2.drawLine(f23, parseInt4, f24, f13, paint6);
                    }
                }
            }
        }
    }

    public void forceLayout() {
        y();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f8700g;
    }

    public int getMaxWidth() {
        return this.f8699f;
    }

    public int getMinHeight() {
        return this.f8698e;
    }

    public int getMinWidth() {
        return this.f8697d;
    }

    public int getOptimizationLevel() {
        return this.f8696c.P1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f8696c.f8193o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f8696c.f8193o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f8696c.f8193o = "parent";
            }
        }
        if (this.f8696c.v() == null) {
            d dVar = this.f8696c;
            dVar.I0(dVar.f8193o);
            Log.v("ConstraintLayout", " setDebugName " + this.f8696c.v());
        }
        Iterator<ConstraintWidget> it2 = this.f8696c.x1().iterator();
        while (it2.hasNext()) {
            ConstraintWidget next = it2.next();
            View view = (View) next.u();
            if (view != null) {
                if (next.f8193o == null && (id2 = view.getId()) != -1) {
                    next.f8193o = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.v() == null) {
                    next.I0(next.f8193o);
                    Log.v("ConstraintLayout", " setDebugName " + next.v());
                }
            }
        }
        this.f8696c.R(sb2);
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            b bVar = (b) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = bVar.f8749v0;
            if ((childAt.getVisibility() != 8 || bVar.f8727h0 || bVar.f8729i0 || bVar.f8731k0 || isInEditMode) && !bVar.f8730j0) {
                int b02 = constraintWidget.b0();
                int c02 = constraintWidget.c0();
                int a02 = constraintWidget.a0() + b02;
                int z12 = constraintWidget.z() + c02;
                childAt.layout(b02, c02, a02, z12);
                if ((childAt instanceof f) && (content = ((f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(b02, c02, a02, z12);
                }
            }
        }
        int size = this.f8695b.size();
        if (size > 0) {
            for (int i16 = 0; i16 < size; i16++) {
                this.f8695b.get(i16).r(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        if (this.v == i11) {
            int i13 = this.f8710w;
        }
        if (!this.f8701h) {
            int childCount = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    break;
                } else if (getChildAt(i14).isLayoutRequested()) {
                    this.f8701h = true;
                    break;
                } else {
                    i14++;
                }
            }
        }
        boolean z11 = this.f8701h;
        this.v = i11;
        this.f8710w = i12;
        this.f8696c.e2(x());
        if (this.f8701h) {
            this.f8701h = false;
            if (G()) {
                this.f8696c.g2();
            }
        }
        B(this.f8696c, this.f8702i, i11, i12);
        A(i11, i12, this.f8696c.a0(), this.f8696c.z(), this.f8696c.W1(), this.f8696c.U1());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget v11 = v(view);
        if ((view instanceof Guideline) && !(v11 instanceof f)) {
            b bVar = (b) view.getLayoutParams();
            f fVar = new f();
            bVar.f8749v0 = fVar;
            bVar.f8727h0 = true;
            fVar.G1(bVar.Z);
        }
        if (view instanceof a) {
            a aVar = (a) view;
            aVar.w();
            ((b) view.getLayoutParams()).f8729i0 = true;
            if (!this.f8695b.contains(aVar)) {
                this.f8695b.add(aVar);
            }
        }
        this.f8694a.put(view.getId(), view);
        this.f8701h = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f8694a.remove(view.getId());
        this.f8696c.z1(v(view));
        this.f8695b.remove(view);
        this.f8701h = true;
    }

    /* access modifiers changed from: protected */
    public void p(boolean z11, View view, ConstraintWidget constraintWidget, b bVar, SparseArray<ConstraintWidget> sparseArray) {
        int i11;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        View view2 = view;
        ConstraintWidget constraintWidget6 = constraintWidget;
        b bVar2 = bVar;
        SparseArray<ConstraintWidget> sparseArray2 = sparseArray;
        bVar.b();
        bVar2.f8751w0 = false;
        constraintWidget6.p1(view.getVisibility());
        if (bVar2.f8730j0) {
            constraintWidget6.Z0(true);
            constraintWidget6.p1(8);
        }
        constraintWidget6.H0(view2);
        if (view2 instanceof a) {
            ((a) view2).q(constraintWidget6, this.f8696c.V1());
        }
        if (bVar2.f8727h0) {
            f fVar = (f) constraintWidget6;
            int i12 = bVar2.f8745s0;
            int i13 = bVar2.f8746t0;
            float f11 = bVar2.f8748u0;
            if (f11 != -1.0f) {
                fVar.F1(f11);
            } else if (i12 != -1) {
                fVar.D1(i12);
            } else if (i13 != -1) {
                fVar.E1(i13);
            }
        } else {
            int i14 = bVar2.f8733l0;
            int i15 = bVar2.f8735m0;
            int i16 = bVar2.f8736n0;
            int i17 = bVar2.f8738o0;
            int i18 = bVar2.f8740p0;
            int i19 = bVar2.f8741q0;
            float f12 = bVar2.f8743r0;
            int i21 = bVar2.f8739p;
            if (i21 != -1) {
                ConstraintWidget constraintWidget7 = sparseArray2.get(i21);
                if (constraintWidget7 != null) {
                    constraintWidget6.m(constraintWidget7, bVar2.f8742r, bVar2.q);
                }
            } else {
                if (i14 != -1) {
                    ConstraintWidget constraintWidget8 = sparseArray2.get(i14);
                    if (constraintWidget8 != null) {
                        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                        constraintWidget.i0(type, constraintWidget8, type, bVar2.leftMargin, i18);
                    }
                } else if (!(i15 == -1 || (constraintWidget5 = sparseArray2.get(i15)) == null)) {
                    constraintWidget.i0(ConstraintAnchor.Type.LEFT, constraintWidget5, ConstraintAnchor.Type.RIGHT, bVar2.leftMargin, i18);
                }
                if (i16 != -1) {
                    ConstraintWidget constraintWidget9 = sparseArray2.get(i16);
                    if (constraintWidget9 != null) {
                        constraintWidget.i0(ConstraintAnchor.Type.RIGHT, constraintWidget9, ConstraintAnchor.Type.LEFT, bVar2.rightMargin, i19);
                    }
                } else if (!(i17 == -1 || (constraintWidget4 = sparseArray2.get(i17)) == null)) {
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                    constraintWidget.i0(type2, constraintWidget4, type2, bVar2.rightMargin, i19);
                }
                int i22 = bVar2.f8728i;
                if (i22 != -1) {
                    ConstraintWidget constraintWidget10 = sparseArray2.get(i22);
                    if (constraintWidget10 != null) {
                        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
                        constraintWidget.i0(type3, constraintWidget10, type3, bVar2.topMargin, bVar2.f8752x);
                    }
                } else {
                    int i23 = bVar2.j;
                    if (!(i23 == -1 || (constraintWidget3 = sparseArray2.get(i23)) == null)) {
                        constraintWidget.i0(ConstraintAnchor.Type.TOP, constraintWidget3, ConstraintAnchor.Type.BOTTOM, bVar2.topMargin, bVar2.f8752x);
                    }
                }
                int i24 = bVar2.k;
                if (i24 != -1) {
                    ConstraintWidget constraintWidget11 = sparseArray2.get(i24);
                    if (constraintWidget11 != null) {
                        constraintWidget.i0(ConstraintAnchor.Type.BOTTOM, constraintWidget11, ConstraintAnchor.Type.TOP, bVar2.bottomMargin, bVar2.f8754z);
                    }
                } else {
                    int i25 = bVar2.f8732l;
                    if (!(i25 == -1 || (constraintWidget2 = sparseArray2.get(i25)) == null)) {
                        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                        constraintWidget.i0(type4, constraintWidget2, type4, bVar2.bottomMargin, bVar2.f8754z);
                    }
                }
                int i26 = bVar2.f8734m;
                if (i26 != -1) {
                    F(constraintWidget, bVar, sparseArray, i26, ConstraintAnchor.Type.BASELINE);
                } else {
                    int i27 = bVar2.n;
                    if (i27 != -1) {
                        F(constraintWidget, bVar, sparseArray, i27, ConstraintAnchor.Type.TOP);
                    } else {
                        int i28 = bVar2.f8737o;
                        if (i28 != -1) {
                            F(constraintWidget, bVar, sparseArray, i28, ConstraintAnchor.Type.BOTTOM);
                        }
                    }
                }
                if (f12 >= 0.0f) {
                    constraintWidget6.S0(f12);
                }
                float f13 = bVar2.H;
                if (f13 >= 0.0f) {
                    constraintWidget6.j1(f13);
                }
            }
            if (z11 && !((i11 = bVar2.X) == -1 && bVar2.Y == -1)) {
                constraintWidget6.h1(i11, bVar2.Y);
            }
            if (bVar2.f8721e0) {
                constraintWidget6.V0(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget6.q1(bVar2.width);
                if (bVar2.width == -2) {
                    constraintWidget6.V0(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            } else if (bVar2.width == -1) {
                if (bVar2.f8713a0) {
                    constraintWidget6.V0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget6.V0(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget6.q(ConstraintAnchor.Type.LEFT).f8164g = bVar2.leftMargin;
                constraintWidget6.q(ConstraintAnchor.Type.RIGHT).f8164g = bVar2.rightMargin;
            } else {
                constraintWidget6.V0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget6.q1(0);
            }
            if (bVar2.f8723f0) {
                constraintWidget6.m1(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget6.R0(bVar2.height);
                if (bVar2.height == -2) {
                    constraintWidget6.m1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            } else if (bVar2.height == -1) {
                if (bVar2.f8715b0) {
                    constraintWidget6.m1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget6.m1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget6.q(ConstraintAnchor.Type.TOP).f8164g = bVar2.topMargin;
                constraintWidget6.q(ConstraintAnchor.Type.BOTTOM).f8164g = bVar2.bottomMargin;
            } else {
                constraintWidget6.m1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget6.R0(0);
            }
            constraintWidget6.J0(bVar2.I);
            constraintWidget6.X0(bVar2.L);
            constraintWidget6.o1(bVar2.M);
            constraintWidget6.T0(bVar2.N);
            constraintWidget6.k1(bVar2.O);
            constraintWidget6.r1(bVar2.f8719d0);
            constraintWidget6.W0(bVar2.P, bVar2.R, bVar2.T, bVar2.V);
            constraintWidget6.n1(bVar2.Q, bVar2.S, bVar2.U, bVar2.W);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    /* renamed from: r */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public void requestLayout() {
        y();
        super.requestLayout();
    }

    public Object s(int i11, Object obj) {
        if (i11 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f8704m;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f8704m.get(str);
    }

    public void setConstraintSet(c cVar) {
        this.j = cVar;
    }

    public void setId(int i11) {
        this.f8694a.remove(getId());
        super.setId(i11);
        this.f8694a.put(getId(), this);
    }

    public void setMaxHeight(int i11) {
        if (i11 != this.f8700g) {
            this.f8700g = i11;
            requestLayout();
        }
    }

    public void setMaxWidth(int i11) {
        if (i11 != this.f8699f) {
            this.f8699f = i11;
            requestLayout();
        }
    }

    public void setMinHeight(int i11) {
        if (i11 != this.f8698e) {
            this.f8698e = i11;
            requestLayout();
        }
    }

    public void setMinWidth(int i11) {
        if (i11 != this.f8697d) {
            this.f8697d = i11;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(e eVar) {
        b bVar = this.k;
        if (bVar != null) {
            bVar.c(eVar);
        }
    }

    public void setOptimizationLevel(int i11) {
        this.f8702i = i11;
        this.f8696c.c2(i11);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public View u(int i11) {
        return this.f8694a.get(i11);
    }

    public final ConstraintWidget v(View view) {
        if (view == this) {
            return this.f8696c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f8749v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f8749v0;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean x() {
        if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void z(int i11) {
        this.k = new b(getContext(), this, i11);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        w(attributeSet, i11, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A = Integer.MIN_VALUE;
        public int B = Integer.MIN_VALUE;
        public int C = Integer.MIN_VALUE;
        public int D = 0;
        boolean E = true;
        boolean F = true;
        public float G = 0.5f;
        public float H = 0.5f;
        public String I = null;
        float J = 0.0f;
        int K = 1;
        public float L = -1.0f;
        public float M = -1.0f;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public int Q = 0;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public float V = 1.0f;
        public float W = 1.0f;
        public int X = -1;
        public int Y = -1;
        public int Z = -1;

        /* renamed from: a  reason: collision with root package name */
        public int f8712a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f8713a0 = false;

        /* renamed from: b  reason: collision with root package name */
        public int f8714b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f8715b0 = false;

        /* renamed from: c  reason: collision with root package name */
        public float f8716c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public String f8717c0 = null;

        /* renamed from: d  reason: collision with root package name */
        public boolean f8718d = true;

        /* renamed from: d0  reason: collision with root package name */
        public int f8719d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f8720e = -1;

        /* renamed from: e0  reason: collision with root package name */
        boolean f8721e0 = true;

        /* renamed from: f  reason: collision with root package name */
        public int f8722f = -1;

        /* renamed from: f0  reason: collision with root package name */
        boolean f8723f0 = true;

        /* renamed from: g  reason: collision with root package name */
        public int f8724g = -1;

        /* renamed from: g0  reason: collision with root package name */
        boolean f8725g0 = false;

        /* renamed from: h  reason: collision with root package name */
        public int f8726h = -1;

        /* renamed from: h0  reason: collision with root package name */
        boolean f8727h0 = false;

        /* renamed from: i  reason: collision with root package name */
        public int f8728i = -1;

        /* renamed from: i0  reason: collision with root package name */
        boolean f8729i0 = false;
        public int j = -1;

        /* renamed from: j0  reason: collision with root package name */
        boolean f8730j0 = false;
        public int k = -1;

        /* renamed from: k0  reason: collision with root package name */
        boolean f8731k0 = false;

        /* renamed from: l  reason: collision with root package name */
        public int f8732l = -1;

        /* renamed from: l0  reason: collision with root package name */
        int f8733l0 = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f8734m = -1;

        /* renamed from: m0  reason: collision with root package name */
        int f8735m0 = -1;
        public int n = -1;

        /* renamed from: n0  reason: collision with root package name */
        int f8736n0 = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f8737o = -1;

        /* renamed from: o0  reason: collision with root package name */
        int f8738o0 = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f8739p = -1;

        /* renamed from: p0  reason: collision with root package name */
        int f8740p0 = Integer.MIN_VALUE;
        public int q = 0;

        /* renamed from: q0  reason: collision with root package name */
        int f8741q0 = Integer.MIN_VALUE;

        /* renamed from: r  reason: collision with root package name */
        public float f8742r = 0.0f;

        /* renamed from: r0  reason: collision with root package name */
        float f8743r0 = 0.5f;

        /* renamed from: s  reason: collision with root package name */
        public int f8744s = -1;

        /* renamed from: s0  reason: collision with root package name */
        int f8745s0;
        public int t = -1;

        /* renamed from: t0  reason: collision with root package name */
        int f8746t0;

        /* renamed from: u  reason: collision with root package name */
        public int f8747u = -1;

        /* renamed from: u0  reason: collision with root package name */
        float f8748u0;
        public int v = -1;

        /* renamed from: v0  reason: collision with root package name */
        ConstraintWidget f8749v0 = new ConstraintWidget();

        /* renamed from: w  reason: collision with root package name */
        public int f8750w = Integer.MIN_VALUE;

        /* renamed from: w0  reason: collision with root package name */
        public boolean f8751w0 = false;

        /* renamed from: x  reason: collision with root package name */
        public int f8752x = Integer.MIN_VALUE;

        /* renamed from: y  reason: collision with root package name */
        public int f8753y = Integer.MIN_VALUE;

        /* renamed from: z  reason: collision with root package name */
        public int f8754z = Integer.MIN_VALUE;

        private static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f8755a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f8755a = sparseIntArray;
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = a.f8755a.get(index);
                switch (i12) {
                    case 1:
                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f8739p);
                        this.f8739p = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f8739p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f11 = obtainStyledAttributes.getFloat(index, this.f8742r) % 360.0f;
                        this.f8742r = f11;
                        if (f11 >= 0.0f) {
                            break;
                        } else {
                            this.f8742r = (360.0f - f11) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f8712a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8712a);
                        break;
                    case 6:
                        this.f8714b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8714b);
                        break;
                    case 7:
                        this.f8716c = obtainStyledAttributes.getFloat(index, this.f8716c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f8720e);
                        this.f8720e = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f8720e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f8722f);
                        this.f8722f = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f8722f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f8724g);
                        this.f8724g = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f8724g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f8726h);
                        this.f8726h = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f8726h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f8728i);
                        this.f8728i = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f8728i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f8732l);
                        this.f8732l = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f8732l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f8734m);
                        this.f8734m = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f8734m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f8744s);
                        this.f8744s = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f8744s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f8747u);
                        this.f8747u = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f8747u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f8750w = obtainStyledAttributes.getDimensionPixelSize(index, this.f8750w);
                        break;
                    case 22:
                        this.f8752x = obtainStyledAttributes.getDimensionPixelSize(index, this.f8752x);
                        break;
                    case 23:
                        this.f8753y = obtainStyledAttributes.getDimensionPixelSize(index, this.f8753y);
                        break;
                    case 24:
                        this.f8754z = obtainStyledAttributes.getDimensionPixelSize(index, this.f8754z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.f8713a0 = obtainStyledAttributes.getBoolean(index, this.f8713a0);
                        break;
                    case 28:
                        this.f8715b0 = obtainStyledAttributes.getBoolean(index, this.f8715b0);
                        break;
                    case 29:
                        this.G = obtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = obtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.P = i13;
                        if (i13 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i14 = obtainStyledAttributes.getInt(index, 0);
                        this.Q = i14;
                        if (i14 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.R) != -2) {
                                break;
                            } else {
                                this.R = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.T) != -2) {
                                break;
                            } else {
                                this.T = -2;
                                break;
                            }
                        }
                    case 35:
                        this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.S) != -2) {
                                break;
                            } else {
                                this.S = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.U) != -2) {
                                break;
                            } else {
                                this.U = -2;
                                break;
                            }
                        }
                    case 38:
                        this.W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                c.K(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = obtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = obtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f8717c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f8737o);
                                this.f8737o = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f8737o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i12) {
                                    case 64:
                                        c.I(this, obtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        c.I(this, obtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f8719d0 = obtainStyledAttributes.getInt(index, this.f8719d0);
                                        break;
                                    case 67:
                                        this.f8718d = obtainStyledAttributes.getBoolean(index, this.f8718d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            b();
        }

        public String a() {
            return this.f8717c0;
        }

        public void b() {
            this.f8727h0 = false;
            this.f8721e0 = true;
            this.f8723f0 = true;
            int i11 = this.width;
            if (i11 == -2 && this.f8713a0) {
                this.f8721e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i12 = this.height;
            if (i12 == -2 && this.f8715b0) {
                this.f8723f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f8721e0 = false;
                if (i11 == 0 && this.P == 1) {
                    this.width = -2;
                    this.f8713a0 = true;
                }
            }
            if (i12 == 0 || i12 == -1) {
                this.f8723f0 = false;
                if (i12 == 0 && this.Q == 1) {
                    this.height = -2;
                    this.f8715b0 = true;
                }
            }
            if (this.f8716c != -1.0f || this.f8712a != -1 || this.f8714b != -1) {
                this.f8727h0 = true;
                this.f8721e0 = true;
                this.f8723f0 = true;
                if (!(this.f8749v0 instanceof f)) {
                    this.f8749v0 = new f();
                }
                ((f) this.f8749v0).G1(this.Z);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = 1
                goto L_0x0012
            L_0x0011:
                r11 = 0
            L_0x0012:
                r4 = -1
                r10.f8736n0 = r4
                r10.f8738o0 = r4
                r10.f8733l0 = r4
                r10.f8735m0 = r4
                int r5 = r10.f8750w
                r10.f8740p0 = r5
                int r5 = r10.f8753y
                r10.f8741q0 = r5
                float r5 = r10.G
                r10.f8743r0 = r5
                int r6 = r10.f8712a
                r10.f8745s0 = r6
                int r7 = r10.f8714b
                r10.f8746t0 = r7
                float r8 = r10.f8716c
                r10.f8748u0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0094
                int r11 = r10.f8744s
                if (r11 == r4) goto L_0x003f
                r10.f8736n0 = r11
            L_0x003d:
                r2 = 1
                goto L_0x0046
            L_0x003f:
                int r11 = r10.t
                if (r11 == r4) goto L_0x0046
                r10.f8738o0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f8747u
                if (r11 == r4) goto L_0x004d
                r10.f8735m0 = r11
                r2 = 1
            L_0x004d:
                int r11 = r10.v
                if (r11 == r4) goto L_0x0054
                r10.f8733l0 = r11
                r2 = 1
            L_0x0054:
                int r11 = r10.A
                if (r11 == r9) goto L_0x005a
                r10.f8741q0 = r11
            L_0x005a:
                int r11 = r10.B
                if (r11 == r9) goto L_0x0060
                r10.f8740p0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f8743r0 = r2
            L_0x0068:
                boolean r2 = r10.f8727h0
                if (r2 == 0) goto L_0x00b8
                int r2 = r10.Z
                if (r2 != r3) goto L_0x00b8
                boolean r2 = r10.f8718d
                if (r2 == 0) goto L_0x00b8
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f8748u0 = r11
                r10.f8745s0 = r4
                r10.f8746t0 = r4
                goto L_0x00b8
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f8746t0 = r6
                r10.f8745s0 = r4
                r10.f8748u0 = r2
                goto L_0x00b8
            L_0x008b:
                if (r7 == r4) goto L_0x00b8
                r10.f8745s0 = r7
                r10.f8746t0 = r4
                r10.f8748u0 = r2
                goto L_0x00b8
            L_0x0094:
                int r11 = r10.f8744s
                if (r11 == r4) goto L_0x009a
                r10.f8735m0 = r11
            L_0x009a:
                int r11 = r10.t
                if (r11 == r4) goto L_0x00a0
                r10.f8733l0 = r11
            L_0x00a0:
                int r11 = r10.f8747u
                if (r11 == r4) goto L_0x00a6
                r10.f8736n0 = r11
            L_0x00a6:
                int r11 = r10.v
                if (r11 == r4) goto L_0x00ac
                r10.f8738o0 = r11
            L_0x00ac:
                int r11 = r10.A
                if (r11 == r9) goto L_0x00b2
                r10.f8740p0 = r11
            L_0x00b2:
                int r11 = r10.B
                if (r11 == r9) goto L_0x00b8
                r10.f8741q0 = r11
            L_0x00b8:
                int r11 = r10.f8747u
                if (r11 != r4) goto L_0x0102
                int r11 = r10.v
                if (r11 != r4) goto L_0x0102
                int r11 = r10.t
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f8744s
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f8724g
                if (r11 == r4) goto L_0x00d7
                r10.f8736n0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
                goto L_0x00e5
            L_0x00d7:
                int r11 = r10.f8726h
                if (r11 == r4) goto L_0x00e5
                r10.f8738o0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
            L_0x00e5:
                int r11 = r10.f8720e
                if (r11 == r4) goto L_0x00f4
                r10.f8733l0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
                goto L_0x0102
            L_0x00f4:
                int r11 = r10.f8722f
                if (r11 == r4) goto L_0x0102
                r10.f8735m0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i11, int i12) {
            super(i11, i12);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
