package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.view.a0;
import androidx.customview.view.AbsSavedState;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import defpackage.p1;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;

public class SearchView extends LinearLayoutCompat implements p1.d {
    static final n D0 = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    private Rect A;
    private final AdapterView.OnItemClickListener A0;
    private int[] B;
    private final AdapterView.OnItemSelectedListener B0;
    private int[] C;
    private TextWatcher C0;
    private final ImageView D;
    private final Drawable E;
    private final int F;
    private final int G;
    private final Intent H;
    private final Intent I;
    private final CharSequence K;
    private l L;
    private k M;
    View.OnFocusChangeListener N;
    private m O;
    private View.OnClickListener P;
    private boolean Q;
    private boolean R;
    t2.a S;
    private boolean T;
    private CharSequence U;
    private boolean V;
    private boolean W;

    /* renamed from: c0  reason: collision with root package name */
    private int f1952c0;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f1953n0;

    /* renamed from: o0  reason: collision with root package name */
    private CharSequence f1954o0;

    /* renamed from: p  reason: collision with root package name */
    final SearchAutoComplete f1955p;

    /* renamed from: p0  reason: collision with root package name */
    private CharSequence f1956p0;
    private final View q;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f1957q0;

    /* renamed from: r  reason: collision with root package name */
    private final View f1958r;

    /* renamed from: r0  reason: collision with root package name */
    private int f1959r0;

    /* renamed from: s  reason: collision with root package name */
    private final View f1960s;

    /* renamed from: s0  reason: collision with root package name */
    SearchableInfo f1961s0;
    final ImageView t;

    /* renamed from: t0  reason: collision with root package name */
    private Bundle f1962t0;

    /* renamed from: u  reason: collision with root package name */
    final ImageView f1963u;

    /* renamed from: u0  reason: collision with root package name */
    private final Runnable f1964u0;
    final ImageView v;

    /* renamed from: v0  reason: collision with root package name */
    private Runnable f1965v0;

    /* renamed from: w  reason: collision with root package name */
    final ImageView f1966w;

    /* renamed from: w0  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1967w0;

    /* renamed from: x  reason: collision with root package name */
    private final View f1968x;

    /* renamed from: x0  reason: collision with root package name */
    private final View.OnClickListener f1969x0;

    /* renamed from: y  reason: collision with root package name */
    private o f1970y;

    /* renamed from: y0  reason: collision with root package name */
    View.OnKeyListener f1971y0;

    /* renamed from: z  reason: collision with root package name */
    private Rect f1972z;

    /* renamed from: z0  reason: collision with root package name */
    private final TextView.OnEditorActionListener f1973z0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f1974c;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1974c + "}";
        }

        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeValue(Boolean.valueOf(this.f1974c));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1974c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends c {

        /* renamed from: d  reason: collision with root package name */
        private int f1975d;

        /* renamed from: e  reason: collision with root package name */
        private SearchView f1976e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1977f;

        /* renamed from: g  reason: collision with root package name */
        final Runnable f1978g;

        class a implements Runnable {
            a() {
            }

            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i11 = configuration.screenWidthDp;
            int i12 = configuration.screenHeightDp;
            if (i11 >= 960 && i12 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i11 < 600) {
                return (i11 < 640 || i12 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.D0.c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.f1977f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1977f = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1975d <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1977f) {
                removeCallbacks(this.f1978g);
                post(this.f1978g);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z11, int i11, Rect rect) {
            super.onFocusChanged(z11, i11, rect);
            this.f1976e.Z();
        }

        public boolean onKeyPreIme(int i11, KeyEvent keyEvent) {
            if (i11 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1976e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i11, keyEvent);
        }

        public void onWindowFocusChanged(boolean z11) {
            super.onWindowFocusChanged(z11);
            if (z11 && this.f1976e.hasFocus() && getVisibility() == 0) {
                this.f1977f = true;
                if (SearchView.M(getContext())) {
                    a();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z11) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z11) {
                this.f1977f = false;
                removeCallbacks(this.f1978g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1977f = false;
                removeCallbacks(this.f1978g);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1977f = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1976e = searchView;
        }

        public void setThreshold(int i11) {
            super.setThreshold(i11);
            this.f1975d = i11;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            this.f1978g = new a();
            this.f1975d = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            t2.a aVar = SearchView.this.S;
            if (aVar instanceof i0) {
                aVar.a((Cursor) null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        public void onFocusChange(View view, boolean z11) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z11);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.t) {
                searchView.V();
            } else if (view == searchView.v) {
                searchView.R();
            } else if (view == searchView.f1963u) {
                searchView.W();
            } else if (view == searchView.f1966w) {
                searchView.a0();
            } else if (view == searchView.f1955p) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        public boolean onKey(View view, int i11, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1961s0 == null) {
                return false;
            }
            if (searchView.f1955p.isPopupShowing() && SearchView.this.f1955p.getListSelection() != -1) {
                return SearchView.this.X(view, i11, keyEvent);
            }
            if (SearchView.this.f1955p.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i11 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, (String) null, searchView2.f1955p.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j) {
            SearchView.this.S(i11, 0, (String) null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j) {
            SearchView.this.T(i11);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i11);

        boolean b(int i11);
    }

    private static class n {

        /* renamed from: a  reason: collision with root package name */
        private Method f1990a = null;

        /* renamed from: b  reason: collision with root package name */
        private Method f1991b = null;

        /* renamed from: c  reason: collision with root package name */
        private Method f1992c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() {
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1990a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1991b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1992c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1991b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1990a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1992c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    private static class o extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f1993a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f1994b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final Rect f1995c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final Rect f1996d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private final int f1997e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1998f;

        public o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1997e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f1993a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1994b.set(rect);
            this.f1996d.set(rect);
            Rect rect3 = this.f1996d;
            int i11 = this.f1997e;
            rect3.inset(-i11, -i11);
            this.f1995c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f1998f
                r7.f1998f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f1998f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f1996d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f1994b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f1998f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.f1995c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.f1993a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f1993a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.f1995c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.f1993a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.o.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i11, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1956p0);
        if (str3 != null) {
            intent.putExtra(ECommerceParamNames.QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1962t0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i11 != 0) {
            intent.putExtra("action_key", i11);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1961s0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i11, String str) {
        int i12;
        Uri uri;
        String o11;
        try {
            String o12 = i0.o(cursor, "suggest_intent_action");
            if (o12 == null) {
                o12 = this.f1961s0.getSuggestIntentAction();
            }
            if (o12 == null) {
                o12 = "android.intent.action.SEARCH";
            }
            String str2 = o12;
            String o13 = i0.o(cursor, "suggest_intent_data");
            if (o13 == null) {
                o13 = this.f1961s0.getSuggestIntentData();
            }
            if (!(o13 == null || (o11 = i0.o(cursor, "suggest_intent_data_id")) == null)) {
                o13 = o13 + "/" + Uri.encode(o11);
            }
            if (o13 == null) {
                uri = null;
            } else {
                uri = Uri.parse(o13);
            }
            return C(str2, uri, i0.o(cursor, "suggest_intent_extra_data"), i0.o(cursor, "suggest_intent_query"), i11, str);
        } catch (RuntimeException e11) {
            try {
                i12 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i12 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i12 + " returned exception.", e11);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1962t0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i11 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i11 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i11);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    private void G() {
        this.f1955p.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.C);
        int[] iArr = this.B;
        int i11 = iArr[1];
        int[] iArr2 = this.C;
        int i12 = i11 - iArr2[1];
        int i13 = iArr[0] - iArr2[0];
        rect.set(i13, i12, view.getWidth() + i13, view.getHeight() + i12);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.Q || this.E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1955p.getTextSize()) * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f1961s0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1961s0.getVoiceSearchLaunchWebSearch()) {
            intent = this.H;
        } else if (this.f1961s0.getVoiceSearchLaunchRecognizer()) {
            intent = this.I;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, PDButton.FLAG_PUSHBUTTON) == null) {
            return false;
        }
        return true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.T || this.f1953n0) && !L();
    }

    private void O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e11) {
                Log.e("SearchView", "Failed launch activity: " + intent, e11);
            }
        }
    }

    private boolean Q(int i11, int i12, String str) {
        Cursor b11 = this.S.b();
        if (b11 == null || !b11.moveToPosition(i11)) {
            return false;
        }
        O(D(b11, i12, str));
        return true;
    }

    private void b0() {
        post(this.f1964u0);
    }

    private void c0(int i11) {
        Editable text = this.f1955p.getText();
        Cursor b11 = this.S.b();
        if (b11 != null) {
            if (b11.moveToPosition(i11)) {
                CharSequence c11 = this.S.c(b11);
                if (c11 != null) {
                    setQuery(c11);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private void e0() {
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f1955p.getText());
        int i11 = 0;
        if (!z12 && (!this.Q || this.f1957q0)) {
            z11 = false;
        }
        ImageView imageView = this.v;
        if (!z11) {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        Drawable drawable = this.v.getDrawable();
        if (drawable != null) {
            drawable.setState(z12 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1955p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void h0() {
        this.f1955p.setThreshold(this.f1961s0.getSuggestThreshold());
        this.f1955p.setImeOptions(this.f1961s0.getImeOptions());
        int inputType = this.f1961s0.getInputType();
        int i11 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1961s0.getSuggestAuthority() != null) {
                inputType = inputType | PDButton.FLAG_PUSHBUTTON | 524288;
            }
        }
        this.f1955p.setInputType(inputType);
        t2.a aVar = this.S;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.f1961s0.getSuggestAuthority() != null) {
            i0 i0Var = new i0(getContext(), this, this.f1961s0, this.f1967w0);
            this.S = i0Var;
            this.f1955p.setAdapter(i0Var);
            i0 i0Var2 = (i0) this.S;
            if (this.V) {
                i11 = 2;
            }
            i0Var2.x(i11);
        }
    }

    private void i0() {
        this.f1960s.setVisibility((!N() || !(this.f1963u.getVisibility() == 0 || this.f1966w.getVisibility() == 0)) ? 8 : 0);
    }

    private void j0(boolean z11) {
        this.f1963u.setVisibility((!this.T || !N() || !hasFocus() || (!z11 && this.f1953n0)) ? 8 : 0);
    }

    private void k0(boolean z11) {
        this.R = z11;
        int i11 = 0;
        int i12 = z11 ? 0 : 8;
        boolean z12 = !TextUtils.isEmpty(this.f1955p.getText());
        this.t.setVisibility(i12);
        j0(z12);
        this.q.setVisibility(z11 ? 8 : 0);
        if (this.D.getDrawable() == null || this.Q) {
            i11 = 8;
        }
        this.D.setVisibility(i11);
        e0();
        l0(!z12);
        i0();
    }

    private void l0(boolean z11) {
        int i11 = 8;
        if (this.f1953n0 && !L() && z11) {
            this.f1963u.setVisibility(8);
            i11 = 0;
        }
        this.f1966w.setVisibility(i11);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1955p.setText(charSequence);
        this.f1955p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    public void B() {
        int i11;
        if (this.f1968x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1958r.getPaddingLeft();
            Rect rect = new Rect();
            boolean b11 = u0.b(this);
            int dimensionPixelSize = this.Q ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
            this.f1955p.getDropDownBackground().getPadding(rect);
            if (b11) {
                i11 = -rect.left;
            } else {
                i11 = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f1955p.setDropDownHorizontalOffset(i11);
            this.f1955p.setDropDownWidth((((this.f1968x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1955p.refreshAutoCompleteResults();
            return;
        }
        n nVar = D0;
        nVar.b(this.f1955p);
        nVar.a(this.f1955p);
    }

    public boolean L() {
        return this.R;
    }

    /* access modifiers changed from: package-private */
    public void P(int i11, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i11, str));
    }

    /* access modifiers changed from: package-private */
    public void R() {
        if (!TextUtils.isEmpty(this.f1955p.getText())) {
            this.f1955p.setText("");
            this.f1955p.requestFocus();
            this.f1955p.setImeVisibility(true);
        } else if (this.Q) {
            k kVar = this.M;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                k0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean S(int i11, int i12, String str) {
        m mVar = this.O;
        if (mVar != null && mVar.b(i11)) {
            return false;
        }
        Q(i11, 0, (String) null);
        this.f1955p.setImeVisibility(false);
        G();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean T(int i11) {
        m mVar = this.O;
        if (mVar != null && mVar.a(i11)) {
            return false;
        }
        c0(i11);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void V() {
        k0(false);
        this.f1955p.requestFocus();
        this.f1955p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void W() {
        Editable text = this.f1955p.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            l lVar = this.L;
            if (lVar == null || !lVar.b(text.toString())) {
                if (this.f1961s0 != null) {
                    P(0, (String) null, text.toString());
                }
                this.f1955p.setImeVisibility(false);
                G();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean X(View view, int i11, KeyEvent keyEvent) {
        int i12;
        if (this.f1961s0 != null && this.S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i11 == 66 || i11 == 84 || i11 == 61) {
                return S(this.f1955p.getListSelection(), 0, (String) null);
            }
            if (i11 == 21 || i11 == 22) {
                if (i11 == 21) {
                    i12 = 0;
                } else {
                    i12 = this.f1955p.length();
                }
                this.f1955p.setSelection(i12);
                this.f1955p.setListSelection(0);
                this.f1955p.clearListSelection();
                this.f1955p.a();
                return true;
            } else if (i11 == 19) {
                this.f1955p.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void Y(CharSequence charSequence) {
        Editable text = this.f1955p.getText();
        this.f1956p0 = text;
        boolean z11 = !TextUtils.isEmpty(text);
        j0(z11);
        l0(!z11);
        e0();
        i0();
        if (this.L != null && !TextUtils.equals(charSequence, this.f1954o0)) {
            this.L.a(charSequence.toString());
        }
        this.f1954o0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        k0(L());
        b0();
        if (this.f1955p.hasFocus()) {
            H();
        }
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        SearchableInfo searchableInfo = this.f1961s0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(F(this.H, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(E(this.I, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public void b() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f1955p.setImeOptions(this.f1959r0);
        this.f1957q0 = false;
    }

    public void clearFocus() {
        this.W = true;
        super.clearFocus();
        this.f1955p.clearFocus();
        this.f1955p.setImeVisibility(false);
        this.W = false;
    }

    public void d() {
        if (!this.f1957q0) {
            this.f1957q0 = true;
            int imeOptions = this.f1955p.getImeOptions();
            this.f1959r0 = imeOptions;
            this.f1955p.setImeOptions(imeOptions | PDButton.FLAG_RADIOS_IN_UNISON);
            this.f1955p.setText("");
            setIconified(false);
        }
    }

    public void d0(CharSequence charSequence, boolean z11) {
        this.f1955p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1955p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1956p0 = charSequence;
        }
        if (z11 && !TextUtils.isEmpty(charSequence)) {
            W();
        }
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        int[] iArr = this.f1955p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1958r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1960s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1955p.getImeOptions();
    }

    public int getInputType() {
        return this.f1955p.getInputType();
    }

    public int getMaxWidth() {
        return this.f1952c0;
    }

    public CharSequence getQuery() {
        return this.f1955p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1961s0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.K;
        }
        return getContext().getText(this.f1961s0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.F;
    }

    public t2.a getSuggestionsAdapter() {
        return this.S;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1964u0);
        post(this.f1965v0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            I(this.f1955p, this.f1972z);
            Rect rect = this.A;
            Rect rect2 = this.f1972z;
            rect.set(rect2.left, 0, rect2.right, i14 - i12);
            o oVar = this.f1970y;
            if (oVar == null) {
                o oVar2 = new o(this.A, this.f1972z, this.f1955p);
                this.f1970y = oVar2;
                setTouchDelegate(oVar2);
                return;
            }
            oVar.a(this.A, this.f1972z);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        int i13;
        if (L()) {
            super.onMeasure(i11, i12);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            int i14 = this.f1952c0;
            size = i14 > 0 ? Math.min(i14, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1952c0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i13 = this.f1952c0) > 0) {
            size = Math.min(i13, size);
        }
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        k0(savedState.f1974c);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1974c = L();
        return savedState;
    }

    public void onWindowFocusChanged(boolean z11) {
        super.onWindowFocusChanged(z11);
        b0();
    }

    public boolean requestFocus(int i11, Rect rect) {
        if (this.W || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i11, rect);
        }
        boolean requestFocus = this.f1955p.requestFocus(i11, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1962t0 = bundle;
    }

    public void setIconified(boolean z11) {
        if (z11) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z11) {
        if (this.Q != z11) {
            this.Q = z11;
            k0(z11);
            g0();
        }
    }

    public void setImeOptions(int i11) {
        this.f1955p.setImeOptions(i11);
    }

    public void setInputType(int i11) {
        this.f1955p.setInputType(i11);
    }

    public void setMaxWidth(int i11) {
        this.f1952c0 = i11;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.M = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.L = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.O = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.U = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z11) {
        this.V = z11;
        t2.a aVar = this.S;
        if (aVar instanceof i0) {
            ((i0) aVar).x(z11 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1961s0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K2 = K();
        this.f1953n0 = K2;
        if (K2) {
            this.f1955p.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z11) {
        this.T = z11;
        k0(L());
    }

    public void setSuggestionsAdapter(t2.a aVar) {
        this.S = aVar;
        this.f1955p.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1972z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f1964u0 = new b();
        this.f1965v0 = new c();
        this.f1967w0 = new WeakHashMap<>();
        f fVar = new f();
        this.f1969x0 = fVar;
        this.f1971y0 = new g();
        h hVar = new h();
        this.f1973z0 = hVar;
        i iVar = new i();
        this.A0 = iVar;
        j jVar = new j();
        this.B0 = jVar;
        this.C0 = new a();
        o0 v11 = o0.v(context, attributeSet, R.styleable.SearchView, i11, 0);
        LayoutInflater.from(context).inflate(v11.n(R.styleable.SearchView_layout, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1955p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f1958r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f1960s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1963u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1966w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.D = imageView5;
        a0.A0(findViewById, v11.g(R.styleable.SearchView_queryBackground));
        a0.A0(findViewById2, v11.g(R.styleable.SearchView_submitBackground));
        int i12 = R.styleable.SearchView_searchIcon;
        imageView.setImageDrawable(v11.g(i12));
        imageView2.setImageDrawable(v11.g(R.styleable.SearchView_goIcon));
        imageView3.setImageDrawable(v11.g(R.styleable.SearchView_closeIcon));
        imageView4.setImageDrawable(v11.g(R.styleable.SearchView_voiceIcon));
        imageView5.setImageDrawable(v11.g(i12));
        this.E = v11.g(R.styleable.SearchView_searchHintIcon);
        q0.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.F = v11.n(R.styleable.SearchView_suggestionRowLayout, R.layout.abc_search_dropdown_item_icons_2line);
        this.G = v11.n(R.styleable.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.C0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1971y0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v11.a(R.styleable.SearchView_iconifiedByDefault, true));
        int f11 = v11.f(R.styleable.SearchView_android_maxWidth, -1);
        if (f11 != -1) {
            setMaxWidth(f11);
        }
        this.K = v11.p(R.styleable.SearchView_defaultQueryHint);
        this.U = v11.p(R.styleable.SearchView_queryHint);
        int k11 = v11.k(R.styleable.SearchView_android_imeOptions, -1);
        if (k11 != -1) {
            setImeOptions(k11);
        }
        int k12 = v11.k(R.styleable.SearchView_android_inputType, -1);
        if (k12 != -1) {
            setInputType(k12);
        }
        setFocusable(v11.a(R.styleable.SearchView_android_focusable, true));
        v11.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1968x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.Q);
        g0();
    }
}
