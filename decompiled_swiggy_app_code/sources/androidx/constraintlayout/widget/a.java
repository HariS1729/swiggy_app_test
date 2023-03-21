package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.c;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.HashMap;
import m2.b;

/* compiled from: ConstraintHelper */
public abstract class a extends View {

    /* renamed from: a  reason: collision with root package name */
    protected int[] f8767a = new int[32];

    /* renamed from: b  reason: collision with root package name */
    protected int f8768b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f8769c;

    /* renamed from: d  reason: collision with root package name */
    protected m2.a f8770d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f8771e = false;

    /* renamed from: f  reason: collision with root package name */
    protected String f8772f;

    /* renamed from: g  reason: collision with root package name */
    protected String f8773g;

    /* renamed from: h  reason: collision with root package name */
    private View[] f8774h = null;

    /* renamed from: i  reason: collision with root package name */
    protected HashMap<Integer, String> f8775i = new HashMap<>();

    public a(Context context) {
        super(context);
        this.f8769c = context;
        o((AttributeSet) null);
    }

    private void e(String str) {
        if (str != null && str.length() != 0 && this.f8769c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int m11 = m(trim);
            if (m11 != 0) {
                this.f8775i.put(Integer.valueOf(m11), trim);
                f(m11);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void f(int i11) {
        if (i11 != getId()) {
            int i12 = this.f8768b + 1;
            int[] iArr = this.f8767a;
            if (i12 > iArr.length) {
                this.f8767a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f8767a;
            int i13 = this.f8768b;
            iArr2[i13] = i11;
            this.f8768b = i13 + 1;
        }
    }

    private void g(String str) {
        if (str != null && str.length() != 0 && this.f8769c != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = constraintLayout.getChildAt(i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f8717c0)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        f(childAt.getId());
                    }
                }
            }
        }
    }

    private int[] k(View view, String str) {
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        for (String trim : split) {
            int m11 = m(trim.trim());
            if (m11 != 0) {
                iArr[i11] = m11;
                i11++;
            }
        }
        return i11 != split.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private int l(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f8769c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int m(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i11 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object s11 = constraintLayout.s(0, str);
            if (s11 instanceof Integer) {
                i11 = ((Integer) s11).intValue();
            }
        }
        if (i11 == 0 && constraintLayout != null) {
            i11 = l(constraintLayout, str);
        }
        if (i11 == 0) {
            try {
                i11 = R.id.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i11 == 0 ? this.f8769c.getResources().getIdentifier(str, DistributedTracing.NR_ID_ATTRIBUTE, this.f8769c.getPackageName()) : i11;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f8767a, this.f8768b);
    }

    /* access modifiers changed from: protected */
    public void h() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            i((ConstraintLayout) parent);
        }
    }

    /* access modifiers changed from: protected */
    public void i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i11 = 0; i11 < this.f8768b; i11++) {
            View u11 = constraintLayout.u(this.f8767a[i11]);
            if (u11 != null) {
                u11.setVisibility(visibility);
                if (elevation > 0.0f) {
                    u11.setTranslationZ(u11.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void j(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    public View[] n(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f8774h;
        if (viewArr == null || viewArr.length != this.f8768b) {
            this.f8774h = new View[this.f8768b];
        }
        for (int i11 = 0; i11 < this.f8768b; i11++) {
            this.f8774h[i11] = constraintLayout.u(this.f8767a[i11]);
        }
        return this.f8774h;
    }

    /* access modifiers changed from: protected */
    public void o(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f8772f = string;
                    setIds(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f8773g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f8772f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f8773g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        if (this.f8771e) {
            super.onMeasure(i11, i12);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(c.a aVar, b bVar, ConstraintLayout.b bVar2, SparseArray<ConstraintWidget> sparseArray) {
        c.b bVar3 = aVar.f8805e;
        int[] iArr = bVar3.f8839k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar3.f8841l0;
            if (str != null) {
                if (str.length() > 0) {
                    c.b bVar4 = aVar.f8805e;
                    bVar4.f8839k0 = k(this, bVar4.f8841l0);
                } else {
                    aVar.f8805e.f8839k0 = null;
                }
            }
        }
        if (bVar != null) {
            bVar.b();
            if (aVar.f8805e.f8839k0 != null) {
                int i11 = 0;
                while (true) {
                    int[] iArr2 = aVar.f8805e.f8839k0;
                    if (i11 < iArr2.length) {
                        ConstraintWidget constraintWidget = sparseArray.get(iArr2[i11]);
                        if (constraintWidget != null) {
                            bVar.a(constraintWidget);
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void q(ConstraintWidget constraintWidget, boolean z11) {
    }

    public void r(ConstraintLayout constraintLayout) {
    }

    public void s(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f8772f = str;
        if (str != null) {
            int i11 = 0;
            this.f8768b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i11);
                if (indexOf == -1) {
                    e(str.substring(i11));
                    return;
                } else {
                    e(str.substring(i11, indexOf));
                    i11 = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f8773g = str;
        if (str != null) {
            int i11 = 0;
            this.f8768b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i11);
                if (indexOf == -1) {
                    g(str.substring(i11));
                    return;
                } else {
                    g(str.substring(i11, indexOf));
                    i11 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f8772f = null;
        this.f8768b = 0;
        for (int f11 : iArr) {
            f(f11);
        }
    }

    public void setTag(int i11, Object obj) {
        super.setTag(i11, obj);
        if (obj == null && this.f8772f == null) {
            f(i11);
        }
    }

    public void t(ConstraintLayout constraintLayout) {
    }

    public void u(d dVar, m2.a aVar, SparseArray<ConstraintWidget> sparseArray) {
        aVar.b();
        for (int i11 = 0; i11 < this.f8768b; i11++) {
            aVar.a(sparseArray.get(this.f8767a[i11]));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.f8775i.get(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f8772f
            r5.setIds(r0)
        L_0x000b:
            m2.a r0 = r5.f8770d
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.b()
            r0 = 0
        L_0x0014:
            int r1 = r5.f8768b
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f8767a
            r1 = r1[r0]
            android.view.View r2 = r6.u(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f8775i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.l(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f8767a
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f8775i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.u(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            m2.a r1 = r5.f8770d
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.v(r2)
            r1.a(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            m2.a r0 = r5.f8770d
            androidx.constraintlayout.core.widgets.d r6 = r6.f8696c
            r0.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.v(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public void w() {
        if (this.f8770d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).f8749v0 = (ConstraintWidget) this.f8770d;
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8769c = context;
        o(attributeSet);
    }
}
