package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.R;
import androidx.core.view.accessibility.f;
import com.truecaller.android.sdk.TruecallerSdkScope;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;

/* compiled from: AccessibilityNodeInfoCompat */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static int f9452d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f9453a;

    /* renamed from: b  reason: collision with root package name */
    public int f9454b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f9455c = -1;

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;

        /* renamed from: e  reason: collision with root package name */
        public static final a f9456e = new a(1, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f9457f = new a(2, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f9458g = new a(4, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f9459h = new a(8, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f9460i = new a(16, (CharSequence) null);
        public static final a j = new a(32, (CharSequence) null);
        public static final a k = new a(64, (CharSequence) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f9461l = new a(128, (CharSequence) null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f9462m;
        public static final a n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f9463o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f9464p;
        public static final a q = new a(4096, (CharSequence) null);

        /* renamed from: r  reason: collision with root package name */
        public static final a f9465r = new a(8192, (CharSequence) null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f9466s = new a(16384, (CharSequence) null);
        public static final a t = new a(32768, (CharSequence) null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f9467u = new a(PDButton.FLAG_PUSHBUTTON, (CharSequence) null);
        public static final a v = new a((int) PDChoice.FLAG_COMBO, (CharSequence) null, (Class<? extends f.a>) f.g.class);

        /* renamed from: w  reason: collision with root package name */
        public static final a f9468w = new a(262144, (CharSequence) null);

        /* renamed from: x  reason: collision with root package name */
        public static final a f9469x = new a(524288, (CharSequence) null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f9470y = new a(1048576, (CharSequence) null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f9471z = new a(2097152, (CharSequence) null, (Class<? extends f.a>) f.h.class);

        /* renamed from: a  reason: collision with root package name */
        final Object f9472a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9473b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<? extends f.a> f9474c;

        /* renamed from: d  reason: collision with root package name */
        protected final f f9475d;

        static {
            Class<f.c> cls = f.c.class;
            Class<f.b> cls2 = f.b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            f9462m = new a(256, (CharSequence) null, (Class<? extends f.a>) cls2);
            n = new a((int) TruecallerSdkScope.FOOTER_TYPE_MANUALLY, (CharSequence) null, (Class<? extends f.a>) cls2);
            f9463o = new a(1024, (CharSequence) null, (Class<? extends f.a>) cls);
            f9464p = new a(2048, (CharSequence) null, (Class<? extends f.a>) cls);
            int i11 = Build.VERSION.SDK_INT;
            A = new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            B = new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (f) null, f.e.class);
            C = new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            D = new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            E = new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            F = new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            G = new a(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            H = new a(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            I = new a(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            J = new a(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            K = new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            L = new a(i11 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (f) null, f.C0048f.class);
            M = new a(i11 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (f) null, f.d.class);
            N = new a(i11 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            O = new a(i11 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            P = new a(i11 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            if (i11 >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            Q = new a(accessibilityAction, 16908372, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        }

        public a(int i11, CharSequence charSequence) {
            this((Object) null, i11, charSequence, (f) null, (Class<? extends f.a>) null);
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a((Object) null, this.f9473b, charSequence, fVar, this.f9474c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f9472a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f9472a).getLabel();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                androidx.core.view.accessibility.f r0 = r4.f9475d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends androidx.core.view.accessibility.f$a> r2 = r4.f9474c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                androidx.core.view.accessibility.f$a r1 = (androidx.core.view.accessibility.f.a) r1     // Catch:{ Exception -> 0x0020 }
                r1.a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends androidx.core.view.accessibility.f$a> r1 = r4.f9474c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                androidx.core.view.accessibility.f r6 = r4.f9475d
                boolean r5 = r6.a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.c.a.d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f9472a;
            if (obj2 == null) {
                if (aVar.f9472a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f9472a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f9472a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i11, CharSequence charSequence, f fVar) {
            this((Object) null, i11, charSequence, fVar, (Class<? extends f.a>) null);
        }

        a(Object obj) {
            this(obj, 0, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        }

        private a(int i11, CharSequence charSequence, Class<? extends f.a> cls) {
            this((Object) null, i11, charSequence, (f) null, cls);
        }

        a(Object obj, int i11, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f9473b = i11;
            this.f9475d = fVar;
            if (obj == null) {
                this.f9472a = new AccessibilityNodeInfo.AccessibilityAction(i11, charSequence);
            } else {
                this.f9472a = obj;
            }
            this.f9474c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f9476a;

        b(Object obj) {
            this.f9476a = obj;
        }

        public static b a(int i11, int i12, boolean z11, int i13) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i11, i12, z11, i13));
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$c  reason: collision with other inner class name */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0047c {

        /* renamed from: a  reason: collision with root package name */
        final Object f9477a;

        C0047c(Object obj) {
            this.f9477a = obj;
        }

        public static C0047c a(int i11, int i12, int i13, int i14, boolean z11) {
            return new C0047c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i11, i12, i13, i14, z11));
        }

        public static C0047c b(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
            return new C0047c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i11, i12, i13, i14, z11, z12));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final Object f9478a;

        d(Object obj) {
            this.f9478a = obj;
        }

        public static d a(int i11, float f11, float f12, float f13) {
            return new d(AccessibilityNodeInfo.RangeInfo.obtain(i11, f11, f12, f13));
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f9453a = accessibilityNodeInfo;
    }

    private boolean A() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int B(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i11).get())) {
                    return sparseArray.keyAt(i11);
                }
            }
        }
        int i12 = f9452d;
        f9452d = i12 + 1;
        return i12;
    }

    public static c O0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    public static c P() {
        return O0(AccessibilityNodeInfo.obtain());
    }

    public static c Q(View view) {
        return O0(AccessibilityNodeInfo.obtain(view));
    }

    public static c R(c cVar) {
        return O0(AccessibilityNodeInfo.obtain(cVar.f9453a));
    }

    private void V(View view) {
        SparseArray<WeakReference<ClickableSpan>> w11 = w(view);
        if (w11 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < w11.size(); i11++) {
                if (w11.valueAt(i11).get() == null) {
                    arrayList.add(Integer.valueOf(i11));
                }
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                w11.remove(((Integer) arrayList.get(i12)).intValue());
            }
        }
    }

    private void X(int i11, boolean z11) {
        Bundle s11 = s();
        if (s11 != null) {
            int i12 = s11.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i11);
            if (!z11) {
                i11 = 0;
            }
            s11.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i11 | i12);
        }
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i11) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i11));
    }

    private void g() {
        this.f9453a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f9453a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f9453a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f9453a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> h(String str) {
        ArrayList<Integer> integerArrayList = this.f9453a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f9453a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String j(int i11) {
        if (i11 == 1) {
            return "ACTION_FOCUS";
        }
        if (i11 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i11) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case TruecallerSdkScope.FOOTER_TYPE_MANUALLY /*512*/:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case PDButton.FLAG_PUSHBUTTON /*65536*/:
                return "ACTION_CUT";
            case PDChoice.FLAG_COMBO /*131072*/:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i11) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i11) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    private boolean l(int i11) {
        Bundle s11 = s();
        if (s11 != null && (s11.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i11) == i11) {
            return true;
        }
        return false;
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> u(View view) {
        SparseArray<WeakReference<ClickableSpan>> w11 = w(view);
        if (w11 != null) {
            return w11;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> w(View view) {
        return (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
    }

    public void A0(CharSequence charSequence) {
        this.f9453a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void B0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9453a.setScreenReaderFocusable(z11);
        } else {
            X(1, z11);
        }
    }

    public boolean C() {
        return this.f9453a.isAccessibilityFocused();
    }

    public void C0(boolean z11) {
        this.f9453a.setScrollable(z11);
    }

    public boolean D() {
        return this.f9453a.isCheckable();
    }

    public void D0(boolean z11) {
        this.f9453a.setSelected(z11);
    }

    public boolean E() {
        return this.f9453a.isChecked();
    }

    public void E0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9453a.setShowingHintText(z11);
        } else {
            X(4, z11);
        }
    }

    public boolean F() {
        return this.f9453a.isClickable();
    }

    public void F0(View view) {
        this.f9455c = -1;
        this.f9453a.setSource(view);
    }

    public boolean G() {
        return this.f9453a.isEnabled();
    }

    public void G0(View view, int i11) {
        this.f9455c = i11;
        this.f9453a.setSource(view, i11);
    }

    public boolean H() {
        return this.f9453a.isFocusable();
    }

    public void H0(CharSequence charSequence) {
        if (androidx.core.os.a.b()) {
            this.f9453a.setStateDescription(charSequence);
        } else {
            this.f9453a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean I() {
        return this.f9453a.isFocused();
    }

    public void I0(CharSequence charSequence) {
        this.f9453a.setText(charSequence);
    }

    public boolean J() {
        return this.f9453a.isLongClickable();
    }

    public void J0(int i11, int i12) {
        this.f9453a.setTextSelection(i11, i12);
    }

    public boolean K() {
        return this.f9453a.isPassword();
    }

    public void K0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f9453a.setTraversalAfter(view);
        }
    }

    public boolean L() {
        return this.f9453a.isScrollable();
    }

    public void L0(String str) {
        this.f9453a.setViewIdResourceName(str);
    }

    public boolean M() {
        return this.f9453a.isSelected();
    }

    public void M0(boolean z11) {
        this.f9453a.setVisibleToUser(z11);
    }

    public boolean N() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f9453a.isShowingHintText();
        }
        return l(4);
    }

    public AccessibilityNodeInfo N0() {
        return this.f9453a;
    }

    public boolean O() {
        return this.f9453a.isVisibleToUser();
    }

    public boolean S(int i11, Bundle bundle) {
        return this.f9453a.performAction(i11, bundle);
    }

    public void T() {
        this.f9453a.recycle();
    }

    public boolean U(a aVar) {
        return this.f9453a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f9472a);
    }

    public void W(boolean z11) {
        this.f9453a.setAccessibilityFocused(z11);
    }

    @Deprecated
    public void Y(Rect rect) {
        this.f9453a.setBoundsInParent(rect);
    }

    public void Z(Rect rect) {
        this.f9453a.setBoundsInScreen(rect);
    }

    public void a(int i11) {
        this.f9453a.addAction(i11);
    }

    public void a0(boolean z11) {
        this.f9453a.setCheckable(z11);
    }

    public void b(a aVar) {
        this.f9453a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f9472a);
    }

    public void b0(boolean z11) {
        this.f9453a.setChecked(z11);
    }

    public void c(View view) {
        this.f9453a.addChild(view);
    }

    public void c0(CharSequence charSequence) {
        this.f9453a.setClassName(charSequence);
    }

    public void d(View view, int i11) {
        this.f9453a.addChild(view, i11);
    }

    public void d0(boolean z11) {
        this.f9453a.setClickable(z11);
    }

    public void e0(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9453a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f9476a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9453a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f9453a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f9453a)) {
            return false;
        }
        return this.f9455c == cVar.f9455c && this.f9454b == cVar.f9454b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            V(view);
            ClickableSpan[] q = q(charSequence);
            if (q != null && q.length > 0) {
                s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> u11 = u(view);
                for (int i11 = 0; i11 < q.length; i11++) {
                    int B = B(q[i11], u11);
                    u11.put(B, new WeakReference(q[i11]));
                    e(q[i11], (Spanned) charSequence, B);
                }
            }
        }
    }

    public void f0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9453a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C0047c) obj).f9477a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    public void g0(CharSequence charSequence) {
        this.f9453a.setContentDescription(charSequence);
    }

    public void h0(boolean z11) {
        this.f9453a.setContentInvalid(z11);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9453a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<a> i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f9453a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new a(actionList.get(i11)));
        }
        return arrayList;
    }

    public void i0(boolean z11) {
        this.f9453a.setDismissable(z11);
    }

    public void j0(boolean z11) {
        this.f9453a.setEditable(z11);
    }

    public int k() {
        return this.f9453a.getActions();
    }

    public void k0(boolean z11) {
        this.f9453a.setEnabled(z11);
    }

    public void l0(CharSequence charSequence) {
        this.f9453a.setError(charSequence);
    }

    @Deprecated
    public void m(Rect rect) {
        this.f9453a.getBoundsInParent(rect);
    }

    public void m0(boolean z11) {
        this.f9453a.setFocusable(z11);
    }

    public void n(Rect rect) {
        this.f9453a.getBoundsInScreen(rect);
    }

    public void n0(boolean z11) {
        this.f9453a.setFocused(z11);
    }

    public int o() {
        return this.f9453a.getChildCount();
    }

    public void o0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9453a.setHeading(z11);
        } else {
            X(2, z11);
        }
    }

    public CharSequence p() {
        return this.f9453a.getClassName();
    }

    public void p0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9453a.setHintText(charSequence);
        } else {
            this.f9453a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void q0(int i11) {
        this.f9453a.setLiveRegion(i11);
    }

    public CharSequence r() {
        return this.f9453a.getContentDescription();
    }

    public void r0(boolean z11) {
        this.f9453a.setLongClickable(z11);
    }

    public Bundle s() {
        return this.f9453a.getExtras();
    }

    public void s0(int i11) {
        this.f9453a.setMaxTextLength(i11);
    }

    public int t() {
        return this.f9453a.getMovementGranularities();
    }

    public void t0(int i11) {
        this.f9453a.setMovementGranularities(i11);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(v());
        sb2.append("; className: ");
        sb2.append(p());
        sb2.append("; text: ");
        sb2.append(y());
        sb2.append("; contentDescription: ");
        sb2.append(r());
        sb2.append("; viewId: ");
        sb2.append(z());
        sb2.append("; checkable: ");
        sb2.append(D());
        sb2.append("; checked: ");
        sb2.append(E());
        sb2.append("; focusable: ");
        sb2.append(H());
        sb2.append("; focused: ");
        sb2.append(I());
        sb2.append("; selected: ");
        sb2.append(M());
        sb2.append("; clickable: ");
        sb2.append(F());
        sb2.append("; longClickable: ");
        sb2.append(J());
        sb2.append("; enabled: ");
        sb2.append(G());
        sb2.append("; password: ");
        sb2.append(K());
        sb2.append("; scrollable: " + L());
        sb2.append("; [");
        List<a> i11 = i();
        for (int i12 = 0; i12 < i11.size(); i12++) {
            a aVar = i11.get(i12);
            String j = j(aVar.b());
            if (j.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                j = aVar.c().toString();
            }
            sb2.append(j);
            if (i12 != i11.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void u0(CharSequence charSequence) {
        this.f9453a.setPackageName(charSequence);
    }

    public CharSequence v() {
        return this.f9453a.getPackageName();
    }

    public void v0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9453a.setPaneTitle(charSequence);
        } else {
            this.f9453a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void w0(View view) {
        this.f9454b = -1;
        this.f9453a.setParent(view);
    }

    public CharSequence x() {
        if (androidx.core.os.a.b()) {
            return this.f9453a.getStateDescription();
        }
        return this.f9453a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void x0(View view, int i11) {
        this.f9454b = i11;
        this.f9453a.setParent(view, i11);
    }

    public CharSequence y() {
        if (!A()) {
            return this.f9453a.getText();
        }
        List<Integer> h11 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> h12 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> h13 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> h14 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f9453a.getText(), 0, this.f9453a.getText().length()));
        for (int i11 = 0; i11 < h11.size(); i11++) {
            spannableString.setSpan(new a(h14.get(i11).intValue(), this, s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h11.get(i11).intValue(), h12.get(i11).intValue(), h13.get(i11).intValue());
        }
        return spannableString;
    }

    public void y0(boolean z11) {
        this.f9453a.setPassword(z11);
    }

    public String z() {
        return this.f9453a.getViewIdResourceName();
    }

    public void z0(d dVar) {
        this.f9453a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f9478a);
    }
}
