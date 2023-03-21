package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.R;
import androidx.appcompat.app.c;
import androidx.core.view.a0;
import defpackage.q1;

public class AppCompatSpinner extends Spinner {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f1900i = {16843505};

    /* renamed from: a  reason: collision with root package name */
    private final d f1901a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1902b;

    /* renamed from: c  reason: collision with root package name */
    private a0 f1903c;

    /* renamed from: d  reason: collision with root package name */
    private SpinnerAdapter f1904d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1905e;

    /* renamed from: f  reason: collision with root package name */
    private f f1906f;

    /* renamed from: g  reason: collision with root package name */
    int f1907g;

    /* renamed from: h  reason: collision with root package name */
    final Rect f1908h;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        boolean f1909a;

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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeByte(this.f1909a ? (byte) 1 : 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1909a = parcel.readByte() != 0;
        }
    }

    class a extends a0 {
        final /* synthetic */ e j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.j = eVar;
        }

        public q1.f b() {
            return this.j;
        }

        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().b()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().b()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    class c implements f, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.app.c f1911a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f1912b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f1913c;

        c() {
        }

        public boolean b() {
            androidx.appcompat.app.c cVar = this.f1911a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        public void c(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f1911a;
            if (cVar != null) {
                cVar.dismiss();
                this.f1911a = null;
            }
        }

        public void e(int i11) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void f(int i11) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void g(int i11, int i12) {
            if (this.f1912b != null) {
                c.a aVar = new c.a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f1913c;
                if (charSequence != null) {
                    aVar.setTitle(charSequence);
                }
                androidx.appcompat.app.c create = aVar.j(this.f1912b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
                this.f1911a = create;
                ListView f11 = create.f();
                f11.setTextDirection(i11);
                f11.setTextAlignment(i12);
                this.f1911a.show();
            }
        }

        public Drawable getBackground() {
            return null;
        }

        public int h() {
            return 0;
        }

        public int k() {
            return 0;
        }

        public void l(int i11) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public CharSequence m() {
            return this.f1913c;
        }

        public void n(CharSequence charSequence) {
            this.f1913c = charSequence;
        }

        public void o(ListAdapter listAdapter) {
            this.f1912b = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i11) {
            AppCompatSpinner.this.setSelection(i11);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i11, this.f1912b.getItemId(i11));
            }
            dismiss();
        }
    }

    private static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private SpinnerAdapter f1915a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f1916b;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1915a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1916b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof k0) {
                k0 k0Var = (k0) spinnerAdapter;
                if (k0Var.getDropDownViewTheme() == null) {
                    k0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1916b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1915a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1915a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i11, view, viewGroup);
        }

        public Object getItem(int i11) {
            SpinnerAdapter spinnerAdapter = this.f1915a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i11);
        }

        public long getItemId(int i11) {
            SpinnerAdapter spinnerAdapter = this.f1915a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i11);
        }

        public int getItemViewType(int i11) {
            return 0;
        }

        public View getView(int i11, View view, ViewGroup viewGroup) {
            return getDropDownView(i11, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1915a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i11) {
            ListAdapter listAdapter = this.f1916b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i11);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1915a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1915a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class e extends b0 implements f {
        private CharSequence K;
        ListAdapter L;
        private final Rect M = new Rect();
        private int N;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f1917a;

            a(AppCompatSpinner appCompatSpinner) {
                this.f1917a = appCompatSpinner;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j) {
                AppCompatSpinner.this.setSelection(i11);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    AppCompatSpinner.this.performItemClick(view, i11, eVar.L.getItemId(i11));
                }
                e.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.T(AppCompatSpinner.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.R();
                e.super.a();
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1920a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1920a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1920a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            C(AppCompatSpinner.this);
            I(true);
            N(0);
            K(new a(AppCompatSpinner.this));
        }

        /* access modifiers changed from: package-private */
        public void R() {
            int i11;
            int i12;
            Drawable background = getBackground();
            int i13 = 0;
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.f1908h);
                if (u0.b(AppCompatSpinner.this)) {
                    i12 = AppCompatSpinner.this.f1908h.right;
                } else {
                    i12 = -AppCompatSpinner.this.f1908h.left;
                }
                i13 = i12;
            } else {
                Rect rect = AppCompatSpinner.this.f1908h;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i14 = appCompatSpinner.f1907g;
            if (i14 == -2) {
                int a11 = appCompatSpinner.a((SpinnerAdapter) this.L, getBackground());
                int i15 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1908h;
                int i16 = (i15 - rect2.left) - rect2.right;
                if (a11 > i16) {
                    a11 = i16;
                }
                E(Math.max(a11, (width - paddingLeft) - paddingRight));
            } else if (i14 == -1) {
                E((width - paddingLeft) - paddingRight);
            } else {
                E(i14);
            }
            if (u0.b(AppCompatSpinner.this)) {
                i11 = i13 + (((width - paddingRight) - y()) - S());
            } else {
                i11 = i13 + paddingLeft + S();
            }
            l(i11);
        }

        public int S() {
            return this.N;
        }

        /* access modifiers changed from: package-private */
        public boolean T(View view) {
            return a0.Z(view) && view.getGlobalVisibleRect(this.M);
        }

        public void f(int i11) {
            this.N = i11;
        }

        public void g(int i11, int i12) {
            ViewTreeObserver viewTreeObserver;
            boolean b11 = b();
            R();
            H(2);
            super.a();
            ListView j = j();
            j.setChoiceMode(1);
            j.setTextDirection(i11);
            j.setTextAlignment(i12);
            O(AppCompatSpinner.this.getSelectedItemPosition());
            if (!b11 && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                J(new c(bVar));
            }
        }

        public CharSequence m() {
            return this.K;
        }

        public void n(CharSequence charSequence) {
            this.K = charSequence;
        }

        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.L = listAdapter;
        }
    }

    interface f {
        boolean b();

        void c(Drawable drawable);

        void dismiss();

        void e(int i11);

        void f(int i11);

        void g(int i11, int i12);

        Drawable getBackground();

        int h();

        int k();

        void l(int i11);

        CharSequence m();

        void n(CharSequence charSequence);

        void o(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, int i11) {
        this(context, (AttributeSet) null, R.attr.spinnerStyle, i11);
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i11 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i12 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = Math.max(i12, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i12;
        }
        drawable.getPadding(this.f1908h);
        Rect rect = this.f1908h;
        return i12 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f1906f.g(getTextDirection(), getTextAlignment());
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1901a;
        if (dVar != null) {
            dVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        f fVar = this.f1906f;
        if (fVar != null) {
            return fVar.k();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        f fVar = this.f1906f;
        if (fVar != null) {
            return fVar.h();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f1906f != null) {
            return this.f1907g;
        }
        return super.getDropDownWidth();
    }

    /* access modifiers changed from: package-private */
    public final f getInternalPopup() {
        return this.f1906f;
    }

    public Drawable getPopupBackground() {
        f fVar = this.f1906f;
        if (fVar != null) {
            return fVar.getBackground();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f1902b;
    }

    public CharSequence getPrompt() {
        f fVar = this.f1906f;
        return fVar != null ? fVar.m() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1901a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1901a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f1906f;
        if (fVar != null && fVar.b()) {
            this.f1906f.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f1906f != null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f1909a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.f1906f;
        savedState.f1909a = fVar != null && fVar.b();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a0 a0Var = this.f1903c;
        if (a0Var == null || !a0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        f fVar = this.f1906f;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.b()) {
            return true;
        }
        b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1901a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f1901a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    public void setDropDownHorizontalOffset(int i11) {
        f fVar = this.f1906f;
        if (fVar != null) {
            fVar.f(i11);
            this.f1906f.l(i11);
            return;
        }
        super.setDropDownHorizontalOffset(i11);
    }

    public void setDropDownVerticalOffset(int i11) {
        f fVar = this.f1906f;
        if (fVar != null) {
            fVar.e(i11);
        } else {
            super.setDropDownVerticalOffset(i11);
        }
    }

    public void setDropDownWidth(int i11) {
        if (this.f1906f != null) {
            this.f1907g = i11;
        } else {
            super.setDropDownWidth(i11);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f1906f;
        if (fVar != null) {
            fVar.c(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i11) {
        setPopupBackgroundDrawable(f.a.b(getPopupContext(), i11));
    }

    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f1906f;
        if (fVar != null) {
            fVar.n(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f1901a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1901a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1905e) {
            this.f1904d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1906f != null) {
            Context context = this.f1902b;
            if (context == null) {
                context = getContext();
            }
            this.f1906f.o(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, attributeSet, i11, i12, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1908h = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.j0.a(r6, r0)
            int[] r0 = androidx.appcompat.R.styleable.Spinner
            r1 = 0
            androidx.appcompat.widget.o0 r0 = androidx.appcompat.widget.o0.v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r6)
            r6.f1901a = r2
            if (r11 == 0) goto L_0x0029
            p1$e r2 = new p1$e
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.f1902b = r2
            goto L_0x003b
        L_0x0029:
            int r11 = androidx.appcompat.R.styleable.Spinner_popupTheme
            int r11 = r0.n(r11, r1)
            if (r11 == 0) goto L_0x0039
            p1$e r2 = new p1$e
            r2.<init>((android.content.Context) r7, (int) r11)
            r6.f1902b = r2
            goto L_0x003b
        L_0x0039:
            r6.f1902b = r7
        L_0x003b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006b
            int[] r11 = f1900i     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0053 }
            if (r3 == 0) goto L_0x004f
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0053 }
        L_0x004f:
            r11.recycle()
            goto L_0x006b
        L_0x0053:
            r3 = move-exception
            goto L_0x0059
        L_0x0055:
            r7 = move-exception
            goto L_0x0065
        L_0x0057:
            r3 = move-exception
            r11 = r2
        L_0x0059:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x006b
            goto L_0x004f
        L_0x0063:
            r7 = move-exception
            r2 = r11
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.recycle()
        L_0x006a:
            throw r7
        L_0x006b:
            r11 = 1
            if (r10 == 0) goto L_0x00a8
            if (r10 == r11) goto L_0x0071
            goto L_0x00b8
        L_0x0071:
            androidx.appcompat.widget.AppCompatSpinner$e r10 = new androidx.appcompat.widget.AppCompatSpinner$e
            android.content.Context r3 = r6.f1902b
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1902b
            int[] r4 = androidx.appcompat.R.styleable.Spinner
            androidx.appcompat.widget.o0 r1 = androidx.appcompat.widget.o0.v(r3, r8, r4, r9, r1)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.m(r3, r4)
            r6.f1907g = r3
            int r3 = androidx.appcompat.R.styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r10.c(r3)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r3 = r0.o(r3)
            r10.n(r3)
            r1.w()
            r6.f1906f = r10
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r6, r10)
            r6.f1903c = r1
            goto L_0x00b8
        L_0x00a8:
            androidx.appcompat.widget.AppCompatSpinner$c r10 = new androidx.appcompat.widget.AppCompatSpinner$c
            r10.<init>()
            r6.f1906f = r10
            int r1 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r1 = r0.o(r1)
            r10.n(r1)
        L_0x00b8:
            int r10 = androidx.appcompat.R.styleable.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.q(r10)
            if (r10 == 0) goto L_0x00d0
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d0:
            r0.w()
            r6.f1905e = r11
            android.widget.SpinnerAdapter r7 = r6.f1904d
            if (r7 == 0) goto L_0x00de
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f1904d = r2
        L_0x00de:
            androidx.appcompat.widget.d r7 = r6.f1901a
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
