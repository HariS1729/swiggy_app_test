package rb0;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.mvvm.view.bottomsheet.CustomBottomSheetBehaviour;

/* compiled from: CustomBaseBottomSheetDialog */
public class c extends g {

    /* renamed from: s  reason: collision with root package name */
    private static final String f16505s = c.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private boolean f16506c = false;

    /* renamed from: d  reason: collision with root package name */
    private CustomBottomSheetBehaviour<FrameLayout> f16507d;

    /* renamed from: e  reason: collision with root package name */
    private int f16508e;

    /* renamed from: f  reason: collision with root package name */
    boolean f16509f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16510g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f16511h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16512i;
    /* access modifiers changed from: private */
    public boolean j;
    /* access modifiers changed from: private */
    public e k;

    /* renamed from: l  reason: collision with root package name */
    private d f16513l;

    /* renamed from: m  reason: collision with root package name */
    private FrameLayout f16514m = null;
    private int n = -1;

    /* renamed from: o  reason: collision with root package name */
    private boolean f16515o = false;

    /* renamed from: p  reason: collision with root package name */
    private int f16516p = -1;
    private boolean q = false;

    /* renamed from: r  reason: collision with root package name */
    private BottomSheetBehavior.f f16517r = new C0181c();

    /* compiled from: CustomBaseBottomSheetDialog */
    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            if (c.this.j) {
                c cVar = c.this;
                if (cVar.f16509f && cVar.isShowing() && c.this.t()) {
                    if (c.this.j() != null) {
                        try {
                            c.this.j().a();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    c.this.cancel();
                }
            }
        }
    }

    /* compiled from: CustomBaseBottomSheetDialog */
    class b extends androidx.core.view.a {
        b() {
        }

        public void g(View view, androidx.core.view.accessibility.c cVar) {
            super.g(view, cVar);
            if (c.this.f16509f) {
                cVar.a(1048576);
                cVar.i0(true);
                return;
            }
            cVar.i0(false);
        }

        public boolean j(View view, int i11, Bundle bundle) {
            if (i11 == 1048576) {
                c cVar = c.this;
                if (cVar.f16509f) {
                    cVar.cancel();
                    return true;
                }
            }
            return super.j(view, i11, bundle);
        }
    }

    /* renamed from: rb0.c$c  reason: collision with other inner class name */
    /* compiled from: CustomBaseBottomSheetDialog */
    class C0181c extends BottomSheetBehavior.f {
        C0181c() {
        }

        public void onSlide(View view, float f11) {
        }

        public void onStateChanged(View view, int i11) {
            if (i11 == 5) {
                c.this.cancel();
            }
            if (c.this.k == null) {
                return;
            }
            if (i11 != 3) {
                c.this.k.c(i11);
            } else if (view.getHeight() >= c.this.i() - c.this.k()) {
                c.this.k.c(i11);
            }
        }
    }

    /* compiled from: CustomBaseBottomSheetDialog */
    public interface d {
        void a() throws Exception;
    }

    /* compiled from: CustomBaseBottomSheetDialog */
    public interface e {
        void c(int i11);
    }

    public c(Context context, int i11, boolean z11, boolean z12, boolean z13) {
        super(context, b(context, i11));
        Window window;
        d(1);
        if (z12 && (window = getWindow()) != null) {
            window.setDimAmount(0.0f);
        }
        this.f16512i = z11;
        this.j = z13;
    }

    private static int b(Context context, int i11) {
        if (i11 != 0) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
            return typedValue.resourceId;
        }
        return R.style.Theme_Design_Light_BottomSheetDialog;
    }

    /* access modifiers changed from: private */
    public int i() {
        try {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity == null) {
                return 0;
            }
            Display defaultDisplay = ownerActivity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            return point.y;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public int k() {
        int i11 = 0;
        try {
            int identifier = getContext().getResources().getIdentifier("status_bar_height", "dimen", LogSubCategory.LifeCycle.ANDROID);
            if (identifier > 0) {
                i11 = getContext().getResources().getDimensionPixelSize(identifier);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return i11 + 20;
    }

    private View u(int i11, View view, ViewGroup.LayoutParams layoutParams) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) View.inflate(getContext(), in.swiggy.android.mvvm.R.layout.custom_bottomsheet_layout, (ViewGroup) null);
        if (i11 != 0 && view == null) {
            view = getLayoutInflater().inflate(i11, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) coordinatorLayout.findViewById(in.swiggy.android.mvvm.R.id.design_bottom_sheet);
        this.f16514m = frameLayout;
        CustomBottomSheetBehaviour<FrameLayout> E0 = CustomBottomSheetBehaviour.E0(frameLayout);
        this.f16507d = E0;
        E0.I0(this.f16512i);
        this.f16507d.g0(this.f16517r);
        this.f16507d.m0(this.f16509f);
        this.f16507d.q0(this.f16515o);
        this.f16507d.H0(this.q);
        int i12 = this.n;
        if (i12 >= 0) {
            this.f16507d.n0(i12);
        }
        if (this.f16508e > 0) {
            this.f16514m.getLayoutParams().height = this.f16508e;
        } else {
            this.f16514m.getLayoutParams().height = -2;
        }
        int i13 = this.f16516p;
        if (i13 >= 0) {
            this.f16507d.G0(i13);
        }
        if (layoutParams == null) {
            this.f16514m.addView(view);
        } else {
            this.f16514m.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(in.swiggy.android.mvvm.R.id.touch_outside).setOnClickListener(new a());
        a0.w0(this.f16514m, new b());
        return coordinatorLayout;
    }

    public d j() {
        return this.f16513l;
    }

    public void l(boolean z11) {
        CustomBottomSheetBehaviour<FrameLayout> customBottomSheetBehaviour;
        this.f16506c = z11;
        if (z11 && (customBottomSheetBehaviour = this.f16507d) != null) {
            customBottomSheetBehaviour.r0(3);
        }
    }

    public void m(int i11) {
        this.f16508e = i11;
        FrameLayout frameLayout = this.f16514m;
        if (frameLayout != null && frameLayout.getLayoutParams() != null) {
            if (this.f16508e > 0) {
                this.f16514m.getLayoutParams().height = this.f16508e;
                return;
            }
            this.f16514m.getLayoutParams().height = -2;
        }
    }

    public void n(int i11) {
        this.f16516p = i11;
    }

    public void o(d dVar) {
        this.f16513l = dVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        CustomBottomSheetBehaviour<FrameLayout> customBottomSheetBehaviour;
        super.onStart();
        if (this.f16506c && (customBottomSheetBehaviour = this.f16507d) != null) {
            customBottomSheetBehaviour.r0(3);
        }
    }

    public void p(boolean z11) {
        this.f16515o = z11;
        CustomBottomSheetBehaviour<FrameLayout> customBottomSheetBehaviour = this.f16507d;
        if (customBottomSheetBehaviour != null) {
            customBottomSheetBehaviour.q0(z11);
        }
    }

    public void q(e eVar) {
        this.k = eVar;
    }

    public void r(boolean z11) {
        this.q = z11;
    }

    public void s(boolean z11) {
        this.f16512i = z11;
        CustomBottomSheetBehaviour<FrameLayout> customBottomSheetBehaviour = this.f16507d;
        if (customBottomSheetBehaviour != null) {
            customBottomSheetBehaviour.I0(z11);
        }
    }

    public void setCancelable(boolean z11) {
        super.setCancelable(z11);
        if (this.f16509f != z11) {
            this.f16509f = z11;
            CustomBottomSheetBehaviour<FrameLayout> customBottomSheetBehaviour = this.f16507d;
            if (customBottomSheetBehaviour != null) {
                customBottomSheetBehaviour.m0(z11);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z11) {
        super.setCanceledOnTouchOutside(z11);
        if (z11 && !this.f16509f) {
            this.f16509f = true;
        }
        this.f16510g = z11;
        this.f16511h = true;
    }

    public void setContentView(int i11) {
        super.setContentView(u(i11, (View) null, (ViewGroup.LayoutParams) null));
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        if (!this.f16511h) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f16510g = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f16511h = true;
        }
        return this.f16510g;
    }

    public void setContentView(View view) {
        super.setContentView(u(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(u(0, view, layoutParams));
    }
}
