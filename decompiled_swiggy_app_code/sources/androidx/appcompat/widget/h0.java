package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.LinearLayoutCompat;
import defpackage.p1;

/* compiled from: ScrollingTabContainerView */
public class h0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final Interpolator j = new DecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    Runnable f2154a;

    /* renamed from: b  reason: collision with root package name */
    private c f2155b;

    /* renamed from: c  reason: collision with root package name */
    LinearLayoutCompat f2156c;

    /* renamed from: d  reason: collision with root package name */
    private Spinner f2157d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2158e;

    /* renamed from: f  reason: collision with root package name */
    int f2159f;

    /* renamed from: g  reason: collision with root package name */
    int f2160g;

    /* renamed from: h  reason: collision with root package name */
    private int f2161h;

    /* renamed from: i  reason: collision with root package name */
    private int f2162i;

    /* compiled from: ScrollingTabContainerView */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f2163a;

        a(View view) {
            this.f2163a = view;
        }

        public void run() {
            h0.this.smoothScrollTo(this.f2163a.getLeft() - ((h0.this.getWidth() - this.f2163a.getWidth()) / 2), 0);
            h0.this.f2154a = null;
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class b extends BaseAdapter {
        b() {
        }

        public int getCount() {
            return h0.this.f2156c.getChildCount();
        }

        public Object getItem(int i11) {
            return ((d) h0.this.f2156c.getChildAt(i11)).b();
        }

        public long getItemId(int i11) {
            return (long) i11;
        }

        public View getView(int i11, View view, ViewGroup viewGroup) {
            if (view == null) {
                return h0.this.c((a.c) getItem(i11), true);
            }
            ((d) view).a((a.c) getItem(i11));
            return view;
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = h0.this.f2156c.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = h0.this.f2156c.getChildAt(i11);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView */
    private class d extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f2167a;

        /* renamed from: b  reason: collision with root package name */
        private a.c f2168b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f2169c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f2170d;

        /* renamed from: e  reason: collision with root package name */
        private View f2171e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(android.content.Context r6, androidx.appcompat.app.a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.h0.this = r5
                int r5 = androidx.appcompat.R.attr.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f2167a = r1
                r4.f2168b = r7
                androidx.appcompat.widget.o0 r5 = androidx.appcompat.widget.o0.v(r6, r0, r1, r5, r3)
                boolean r6 = r5.s(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.g(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.w()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.d.<init>(androidx.appcompat.widget.h0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f2168b = cVar;
            c();
        }

        public a.c b() {
            return this.f2168b;
        }

        public void c() {
            a.c cVar = this.f2168b;
            View b11 = cVar.b();
            CharSequence charSequence = null;
            if (b11 != null) {
                ViewParent parent = b11.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b11);
                    }
                    addView(b11);
                }
                this.f2171e = b11;
                TextView textView = this.f2169c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2170d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2170d.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f2171e;
            if (view != null) {
                removeView(view);
                this.f2171e = null;
            }
            Drawable c11 = cVar.c();
            CharSequence d11 = cVar.d();
            if (c11 != null) {
                if (this.f2170d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f2170d = appCompatImageView;
                }
                this.f2170d.setImageDrawable(c11);
                this.f2170d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f2170d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f2170d.setImageDrawable((Drawable) null);
                }
            }
            boolean z11 = !TextUtils.isEmpty(d11);
            if (z11) {
                if (this.f2169c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f2169c = appCompatTextView;
                }
                this.f2169c.setText(d11);
                this.f2169c.setVisibility(0);
            } else {
                TextView textView2 = this.f2169c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f2169c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f2170d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z11) {
                charSequence = cVar.a();
            }
            q0.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i11, int i12) {
            int i13;
            super.onMeasure(i11, i12);
            if (h0.this.f2159f > 0 && getMeasuredWidth() > (i13 = h0.this.f2159f)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
            }
        }

        public void setSelected(boolean z11) {
            boolean z12 = isSelected() != z11;
            super.setSelected(z11);
            if (z12 && z11) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, R.attr.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private boolean d() {
        Spinner spinner = this.f2157d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (!d()) {
            if (this.f2157d == null) {
                this.f2157d = b();
            }
            removeView(this.f2156c);
            addView(this.f2157d, new ViewGroup.LayoutParams(-2, -1));
            if (this.f2157d.getAdapter() == null) {
                this.f2157d.setAdapter(new b());
            }
            Runnable runnable = this.f2154a;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f2154a = null;
            }
            this.f2157d.setSelection(this.f2162i);
        }
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f2157d);
        addView(this.f2156c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f2157d.getSelectedItemPosition());
        return false;
    }

    public void a(int i11) {
        View childAt = this.f2156c.getChildAt(i11);
        Runnable runnable = this.f2154a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f2154a = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    public d c(a.c cVar, boolean z11) {
        d dVar = new d(getContext(), cVar, z11);
        if (z11) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2161h));
        } else {
            dVar.setFocusable(true);
            if (this.f2155b == null) {
                this.f2155b = new c();
            }
            dVar.setOnClickListener(this.f2155b);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2154a;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p1.b b11 = p1.b.b(getContext());
        setContentHeight(b11.f());
        this.f2160g = b11.e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2154a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
        ((d) view).b().e();
    }

    public void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        boolean z11 = true;
        boolean z12 = mode == 1073741824;
        setFillViewport(z12);
        int childCount = this.f2156c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f2159f = -1;
        } else {
            if (childCount > 2) {
                this.f2159f = (int) (((float) View.MeasureSpec.getSize(i11)) * 0.4f);
            } else {
                this.f2159f = View.MeasureSpec.getSize(i11) / 2;
            }
            this.f2159f = Math.min(this.f2159f, this.f2160g);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2161h, 1073741824);
        if (z12 || !this.f2158e) {
            z11 = false;
        }
        if (z11) {
            this.f2156c.measure(0, makeMeasureSpec);
            if (this.f2156c.getMeasuredWidth() > View.MeasureSpec.getSize(i11)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i11, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z12 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f2162i);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z11) {
        this.f2158e = z11;
    }

    public void setContentHeight(int i11) {
        this.f2161h = i11;
        requestLayout();
    }

    public void setTabSelected(int i11) {
        this.f2162i = i11;
        int childCount = this.f2156c.getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = this.f2156c.getChildAt(i12);
            boolean z11 = i12 == i11;
            childAt.setSelected(z11);
            if (z11) {
                a(i11);
            }
            i12++;
        }
        Spinner spinner = this.f2157d;
        if (spinner != null && i11 >= 0) {
            spinner.setSelection(i11);
        }
    }
}
