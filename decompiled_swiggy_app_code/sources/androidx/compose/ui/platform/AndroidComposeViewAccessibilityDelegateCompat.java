package androidx.compose.ui.platform;

import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.ui.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.platform.accessibility.CollectionInfoKt;
import androidx.compose.ui.platform.b;
import androidx.compose.ui.platform.g;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.accessibility.c;
import bp0.k;
import com.truecaller.android.sdk.TruecallerSdkScope;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.channels.BufferOverflow;
import lp0.l;
import lp0.q;
import n1.e;
import n1.g;
import n1.j;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;
import p1.a0;
import p1.y;
import u1.i;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class AndroidComposeViewAccessibilityDelegateCompat extends androidx.core.view.a {
    public static final d A = new d((i) null);
    private static final int[] B = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: d  reason: collision with root package name */
    private final AndroidComposeView f6997d;

    /* renamed from: e  reason: collision with root package name */
    private int f6998e = Integer.MIN_VALUE;

    /* renamed from: f  reason: collision with root package name */
    private final AccessibilityManager f6999f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7000g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Handler f7001h;

    /* renamed from: i  reason: collision with root package name */
    private androidx.core.view.accessibility.d f7002i;
    private int j;
    private androidx.collection.h<androidx.collection.h<CharSequence>> k;

    /* renamed from: l  reason: collision with root package name */
    private androidx.collection.h<Map<CharSequence, Integer>> f7003l;

    /* renamed from: m  reason: collision with root package name */
    private int f7004m;
    private Integer n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.collection.b<LayoutNode> f7005o;

    /* renamed from: p  reason: collision with root package name */
    private final yp0.f<k> f7006p;
    private boolean q;

    /* renamed from: r  reason: collision with root package name */
    private f f7007r;

    /* renamed from: s  reason: collision with root package name */
    private Map<Integer, d1> f7008s;
    private androidx.collection.b<Integer> t;

    /* renamed from: u  reason: collision with root package name */
    private Map<Integer, g> f7009u;
    private g v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f7010w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final Runnable f7011x;

    /* renamed from: y  reason: collision with root package name */
    private final List<c1> f7012y;

    /* renamed from: z  reason: collision with root package name */
    private final l<c1, k> f7013z;

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f7014a;

        a(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
            this.f7014a = androidComposeViewAccessibilityDelegateCompat;
        }

        public void onViewAttachedToWindow(View view) {
            p.j(view, "view");
        }

        public void onViewDetachedFromWindow(View view) {
            p.j(view, "view");
            this.f7014a.f7001h.removeCallbacks(this.f7014a.f7011x);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f7015a = new b();

        private b() {
        }

        public static final void a(androidx.core.view.accessibility.c cVar, SemanticsNode semanticsNode) {
            n1.a aVar;
            p.j(cVar, "info");
            p.j(semanticsNode, "semanticsNode");
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode) && (aVar = (n1.a) SemanticsConfigurationKt.a(semanticsNode.s(), n1.i.f15789a.n())) != null) {
                cVar.b(new c.a(16908349, aVar.b()));
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f7022a = new c();

        private c() {
        }

        public static final void a(AccessibilityEvent accessibilityEvent, int i11, int i12) {
            p.j(accessibilityEvent, "event");
            accessibilityEvent.setScrollDeltaX(i11);
            accessibilityEvent.setScrollDeltaY(i12);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(i iVar) {
            this();
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public final class e extends AccessibilityNodeProvider {
        public e() {
        }

        public void addExtraDataToAccessibilityNodeInfo(int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            p.j(accessibilityNodeInfo, "info");
            p.j(str, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.w(i11, accessibilityNodeInfo, str, bundle);
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i11) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.D(i11);
        }

        public boolean performAction(int i11, int i12, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.T(i11, i12, bundle);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        private final SemanticsNode f7024a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7025b;

        /* renamed from: c  reason: collision with root package name */
        private final int f7026c;

        /* renamed from: d  reason: collision with root package name */
        private final int f7027d;

        /* renamed from: e  reason: collision with root package name */
        private final int f7028e;

        /* renamed from: f  reason: collision with root package name */
        private final long f7029f;

        public f(SemanticsNode semanticsNode, int i11, int i12, int i13, int i14, long j) {
            p.j(semanticsNode, "node");
            this.f7024a = semanticsNode;
            this.f7025b = i11;
            this.f7026c = i12;
            this.f7027d = i13;
            this.f7028e = i14;
            this.f7029f = j;
        }

        public final int a() {
            return this.f7025b;
        }

        public final int b() {
            return this.f7027d;
        }

        public final int c() {
            return this.f7026c;
        }

        public final SemanticsNode d() {
            return this.f7024a;
        }

        public final int e() {
            return this.f7028e;
        }

        public final long f() {
            return this.f7029f;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final j f7030a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<Integer> f7031b = new LinkedHashSet();

        public g(SemanticsNode semanticsNode, Map<Integer, d1> map) {
            p.j(semanticsNode, "semanticsNode");
            p.j(map, "currentSemanticsNodes");
            this.f7030a = semanticsNode.s();
            List<SemanticsNode> o11 = semanticsNode.o();
            int size = o11.size();
            for (int i11 = 0; i11 < size; i11++) {
                SemanticsNode semanticsNode2 = o11.get(i11);
                if (map.containsKey(Integer.valueOf(semanticsNode2.i()))) {
                    this.f7031b.add(Integer.valueOf(semanticsNode2.i()));
                }
            }
        }

        public final Set<Integer> a() {
            return this.f7031b;
        }

        public final j b() {
            return this.f7030a;
        }

        public final boolean c() {
            return this.f7030a.c(SemanticsProperties.f7428a.p());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7032a;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            f7032a = iArr;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        p.j(androidComposeView, "view");
        this.f6997d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f6999f = (AccessibilityManager) systemService;
        this.f7001h = new Handler(Looper.getMainLooper());
        this.f7002i = new androidx.core.view.accessibility.d(new e());
        this.j = Integer.MIN_VALUE;
        this.k = new androidx.collection.h<>();
        this.f7003l = new androidx.collection.h<>();
        this.f7004m = -1;
        this.f7005o = new androidx.collection.b<>();
        this.f7006p = yp0.i.b(-1, (BufferOverflow) null, (l) null, 6, (Object) null);
        this.q = true;
        this.f7008s = x.f();
        this.t = new androidx.collection.b<>();
        this.f7009u = new LinkedHashMap();
        this.v = new g(androidComposeView.getSemanticsOwner().a(), x.f());
        androidComposeView.addOnAttachStateChangeListener(new a(this));
        this.f7011x = new r(this);
        this.f7012y = new ArrayList();
        this.f7013z = new AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1(this);
    }

    private final void A() {
        k0(this.f6997d.getSemanticsOwner().a(), this.v);
        j0(I());
        t0();
    }

    private final boolean B(int i11) {
        if (!O(i11)) {
            return false;
        }
        this.j = Integer.MIN_VALUE;
        this.f6997d.invalidate();
        f0(this, i11, PDButton.FLAG_PUSHBUTTON, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [android.view.ViewParent] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = (r0 = r0.a()).getLifecycle();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.accessibility.AccessibilityNodeInfo D(int r11) {
        /*
            r10 = this;
            androidx.compose.ui.platform.AndroidComposeView r0 = r10.f6997d
            androidx.compose.ui.platform.AndroidComposeView$b r0 = r0.getViewTreeOwners()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.r r0 = r0.a()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.Lifecycle$State r0 = r0.b()
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r2) goto L_0x0020
            return r1
        L_0x0020:
            androidx.core.view.accessibility.c r0 = androidx.core.view.accessibility.c.P()
            java.lang.String r2 = "obtain()"
            kotlin.jvm.internal.p.i(r0, r2)
            java.util.Map r2 = r10.I()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.Object r2 = r2.get(r3)
            androidx.compose.ui.platform.d1 r2 = (androidx.compose.ui.platform.d1) r2
            if (r2 != 0) goto L_0x003d
            r0.T()
            return r1
        L_0x003d:
            androidx.compose.ui.semantics.SemanticsNode r3 = r2.b()
            r4 = -1
            if (r11 != r4) goto L_0x0055
            androidx.compose.ui.platform.AndroidComposeView r4 = r10.f6997d
            android.view.ViewParent r4 = androidx.core.view.a0.L(r4)
            boolean r5 = r4 instanceof android.view.View
            if (r5 == 0) goto L_0x0051
            r1 = r4
            android.view.View r1 = (android.view.View) r1
        L_0x0051:
            r0.w0(r1)
            goto L_0x007d
        L_0x0055:
            androidx.compose.ui.semantics.SemanticsNode r1 = r3.m()
            if (r1 == 0) goto L_0x00e2
            androidx.compose.ui.semantics.SemanticsNode r1 = r3.m()
            kotlin.jvm.internal.p.g(r1)
            int r1 = r1.i()
            androidx.compose.ui.platform.AndroidComposeView r5 = r10.f6997d
            n1.n r5 = r5.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r5 = r5.a()
            int r5 = r5.i()
            if (r1 != r5) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r4 = r1
        L_0x0078:
            androidx.compose.ui.platform.AndroidComposeView r1 = r10.f6997d
            r0.x0(r1, r4)
        L_0x007d:
            androidx.compose.ui.platform.AndroidComposeView r1 = r10.f6997d
            r0.G0(r1, r11)
            android.graphics.Rect r1 = r2.a()
            androidx.compose.ui.platform.AndroidComposeView r2 = r10.f6997d
            int r4 = r1.left
            float r4 = (float) r4
            int r5 = r1.top
            float r5 = (float) r5
            long r4 = t0.g.a(r4, r5)
            long r4 = r2.p(r4)
            androidx.compose.ui.platform.AndroidComposeView r2 = r10.f6997d
            int r6 = r1.right
            float r6 = (float) r6
            int r1 = r1.bottom
            float r1 = (float) r1
            long r6 = t0.g.a(r6, r1)
            long r1 = r2.p(r6)
            android.graphics.Rect r6 = new android.graphics.Rect
            float r7 = t0.f.m(r4)
            double r7 = (double) r7
            double r7 = java.lang.Math.floor(r7)
            float r7 = (float) r7
            int r7 = (int) r7
            float r4 = t0.f.n(r4)
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            float r5 = t0.f.m(r1)
            double r8 = (double) r5
            double r8 = java.lang.Math.ceil(r8)
            float r5 = (float) r8
            int r5 = (int) r5
            float r1 = t0.f.n(r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            r6.<init>(r7, r4, r5, r1)
            r0.Z(r6)
            r10.W(r11, r0, r3)
            android.view.accessibility.AccessibilityNodeInfo r11 = r0.N0()
            return r11
        L_0x00e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "semanticsNode "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " has null parent"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.D(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    private final AccessibilityEvent E(int i11, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent C = C(i11, 8192);
        if (num != null) {
            C.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            C.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            C.setItemCount(num3.intValue());
        }
        if (str != null) {
            C.getText().add(str);
        }
        return C;
    }

    private final int G(SemanticsNode semanticsNode) {
        j s11 = semanticsNode.s();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7428a;
        if (s11.c(semanticsProperties.c()) || !semanticsNode.s().c(semanticsProperties.y())) {
            return this.f7004m;
        }
        return a0.i(((a0) semanticsNode.s().g(semanticsProperties.y())).r());
    }

    private final int H(SemanticsNode semanticsNode) {
        j s11 = semanticsNode.s();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7428a;
        if (s11.c(semanticsProperties.c()) || !semanticsNode.s().c(semanticsProperties.y())) {
            return this.f7004m;
        }
        return a0.n(((a0) semanticsNode.s().g(semanticsProperties.y())).r());
    }

    private final Map<Integer, d1> I() {
        if (this.q) {
            this.f7008s = AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(this.f6997d.getSemanticsOwner());
            this.q = false;
        }
        return this.f7008s;
    }

    private final String J(SemanticsNode semanticsNode) {
        p1.b bVar;
        if (semanticsNode == null) {
            return null;
        }
        j s11 = semanticsNode.s();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7428a;
        if (s11.c(semanticsProperties.c())) {
            return p0.h.d((List) semanticsNode.s().g(semanticsProperties.c()), Constants.ACCEPT_TIME_SEPARATOR_SP, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(semanticsNode)) {
            p1.b L = L(semanticsNode.s());
            if (L != null) {
                return L.g();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties.x());
        if (list == null || (bVar = (p1.b) s.Y(list)) == null) {
            return null;
        }
        return bVar.g();
    }

    private final f K(SemanticsNode semanticsNode, int i11) {
        if (semanticsNode == null) {
            return null;
        }
        String J = J(semanticsNode);
        if (J == null || J.length() == 0) {
            return null;
        }
        if (i11 == 1) {
            b.a aVar = b.f7269d;
            Locale locale = this.f6997d.getContext().getResources().getConfiguration().locale;
            p.i(locale, "view.context.resources.configuration.locale");
            b a11 = aVar.a(locale);
            a11.e(J);
            return a11;
        } else if (i11 != 2) {
            if (i11 != 4) {
                if (i11 == 8) {
                    e a12 = e.f7299c.a();
                    a12.e(J);
                    return a12;
                } else if (i11 != 16) {
                    return null;
                }
            }
            j s11 = semanticsNode.s();
            n1.i iVar = n1.i.f15789a;
            if (!s11.c(iVar.g())) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            l lVar = (l) ((n1.a) semanticsNode.s().g(iVar.g())).a();
            if (!p.e(lVar != null ? (Boolean) lVar.invoke(arrayList) : null, Boolean.TRUE)) {
                return null;
            }
            y yVar = (y) arrayList.get(0);
            if (i11 == 4) {
                c a13 = c.f7274d.a();
                a13.j(J, yVar);
                return a13;
            }
            d a14 = d.f7288f.a();
            a14.j(J, yVar, semanticsNode);
            return a14;
        } else {
            g.a aVar2 = g.f7302d;
            Locale locale2 = this.f6997d.getContext().getResources().getConfiguration().locale;
            p.i(locale2, "view.context.resources.configuration.locale");
            g a15 = aVar2.a(locale2);
            a15.e(J);
            return a15;
        }
    }

    private final p1.b L(j jVar) {
        return (p1.b) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f7428a.e());
    }

    private final boolean N() {
        return this.f7000g || (this.f6999f.isEnabled() && this.f6999f.isTouchExplorationEnabled());
    }

    private final boolean O(int i11) {
        return this.j == i11;
    }

    private final boolean P(SemanticsNode semanticsNode) {
        j s11 = semanticsNode.s();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7428a;
        return !s11.c(semanticsProperties.c()) && semanticsNode.s().c(semanticsProperties.e());
    }

    private final void Q(LayoutNode layoutNode) {
        if (this.f7005o.add(layoutNode)) {
            this.f7006p.e(k.f22762a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r4v14, types: [java.lang.String] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0107 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean T(int r13, int r14, android.os.Bundle r15) {
        /*
            r12 = this;
            java.util.Map r0 = r12.I()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r0.get(r1)
            androidx.compose.ui.platform.d1 r0 = (androidx.compose.ui.platform.d1) r0
            r1 = 0
            if (r0 == 0) goto L_0x0565
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.b()
            if (r0 != 0) goto L_0x0019
            goto L_0x0565
        L_0x0019:
            r2 = 64
            if (r14 == r2) goto L_0x0560
            r2 = 128(0x80, float:1.794E-43)
            if (r14 == r2) goto L_0x055b
            r2 = 256(0x100, float:3.59E-43)
            r3 = 1
            if (r14 == r2) goto L_0x0544
            r4 = 512(0x200, float:7.175E-43)
            if (r14 == r4) goto L_0x0544
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r14 == r2) goto L_0x051f
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r14 == r2) goto L_0x04f3
            boolean r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(r0)
            if (r2 != 0) goto L_0x0039
            return r1
        L_0x0039:
            if (r14 == r3) goto L_0x04ce
            r2 = 2
            r4 = 0
            if (r14 == r2) goto L_0x04ad
            switch(r14) {
                case 16: goto L_0x047a;
                case 32: goto L_0x0455;
                case 4096: goto L_0x02bf;
                case 8192: goto L_0x02bf;
                case 32768: goto L_0x029a;
                case 65536: goto L_0x0275;
                case 262144: goto L_0x0250;
                case 524288: goto L_0x022b;
                case 1048576: goto L_0x0206;
                case 2097152: goto L_0x01ca;
                case 16908342: goto L_0x00cd;
                case 16908349: goto L_0x0095;
                default: goto L_0x0042;
            }
        L_0x0042:
            switch(r14) {
                case 16908344: goto L_0x02bf;
                case 16908345: goto L_0x02bf;
                case 16908346: goto L_0x02bf;
                case 16908347: goto L_0x02bf;
                default: goto L_0x0045;
            }
        L_0x0045:
            androidx.collection.h<androidx.collection.h<java.lang.CharSequence>> r15 = r12.k
            java.lang.Object r13 = r15.i(r13)
            androidx.collection.h r13 = (androidx.collection.h) r13
            if (r13 == 0) goto L_0x0094
            java.lang.Object r13 = r13.i(r14)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            if (r13 != 0) goto L_0x0058
            goto L_0x0094
        L_0x0058:
            n1.j r14 = r0.s()
            n1.i r15 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.c()
            java.lang.Object r14 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r14, r15)
            java.util.List r14 = (java.util.List) r14
            if (r14 != 0) goto L_0x006b
            return r1
        L_0x006b:
            int r15 = r14.size()
            r0 = 0
        L_0x0070:
            if (r0 >= r15) goto L_0x0094
            java.lang.Object r2 = r14.get(r0)
            n1.d r2 = (n1.d) r2
            java.lang.String r3 = r2.b()
            boolean r3 = kotlin.jvm.internal.p.e(r3, r13)
            if (r3 == 0) goto L_0x0091
            lp0.a r13 = r2.a()
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L_0x0091:
            int r0 = r0 + 1
            goto L_0x0070
        L_0x0094:
            return r1
        L_0x0095:
            if (r15 == 0) goto L_0x00cc
            java.lang.String r13 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r14 = r15.containsKey(r13)
            if (r14 != 0) goto L_0x00a0
            goto L_0x00cc
        L_0x00a0:
            n1.j r14 = r0.s()
            n1.i r0 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.n()
            java.lang.Object r14 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r14, r0)
            n1.a r14 = (n1.a) r14
            if (r14 == 0) goto L_0x00cc
            bp0.c r14 = r14.a()
            lp0.l r14 = (lp0.l) r14
            if (r14 == 0) goto L_0x00cc
            float r13 = r15.getFloat(r13)
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r13 = r14.invoke(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x00cc:
            return r1
        L_0x00cd:
            androidx.compose.ui.semantics.SemanticsNode r13 = r0.m()
            if (r13 == 0) goto L_0x00e6
            n1.j r14 = r13.h()
            if (r14 == 0) goto L_0x00e6
            n1.i r15 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.l()
            java.lang.Object r14 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r14, r15)
            n1.a r14 = (n1.a) r14
            goto L_0x00e7
        L_0x00e6:
            r14 = r4
        L_0x00e7:
            if (r13 == 0) goto L_0x0105
            if (r14 == 0) goto L_0x00ec
            goto L_0x0105
        L_0x00ec:
            androidx.compose.ui.semantics.SemanticsNode r13 = r13.m()
            if (r13 == 0) goto L_0x00e6
            n1.j r14 = r13.h()
            if (r14 == 0) goto L_0x00e6
            n1.i r15 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.l()
            java.lang.Object r14 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r14, r15)
            n1.a r14 = (n1.a) r14
            goto L_0x00e7
        L_0x0105:
            if (r13 != 0) goto L_0x0108
            return r1
        L_0x0108:
            i1.p r15 = r13.j()
            i1.m r15 = r15.d()
            t0.h r15 = i1.n.a(r15)
            i1.p r2 = r13.j()
            i1.m r2 = r2.d()
            i1.m r2 = r2.s()
            if (r2 == 0) goto L_0x0127
            long r4 = i1.n.e(r2)
            goto L_0x012d
        L_0x0127:
            t0.f$a r2 = t0.f.f16662b
            long r4 = r2.c()
        L_0x012d:
            t0.h r15 = r15.r(r4)
            long r4 = r0.n()
            long r6 = r0.q()
            long r6 = d2.q.b(r6)
            t0.h r2 = t0.i.b(r4, r6)
            n1.j r4 = r13.s()
            androidx.compose.ui.semantics.SemanticsProperties r5 = androidx.compose.ui.semantics.SemanticsProperties.f7428a
            androidx.compose.ui.semantics.SemanticsPropertyKey r6 = r5.i()
            java.lang.Object r4 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r4, r6)
            n1.h r4 = (n1.h) r4
            n1.j r13 = r13.s()
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r5.A()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r13, r5)
            n1.h r13 = (n1.h) r13
            float r5 = r2.i()
            float r6 = r15.i()
            float r5 = r5 - r6
            float r6 = r2.j()
            float r7 = r15.j()
            float r6 = r6 - r7
            float r5 = V(r5, r6)
            if (r4 == 0) goto L_0x017f
            boolean r4 = r4.b()
            if (r4 != r3) goto L_0x017f
            r4 = 1
            goto L_0x0180
        L_0x017f:
            r4 = 0
        L_0x0180:
            if (r4 == 0) goto L_0x0183
            float r5 = -r5
        L_0x0183:
            boolean r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.s(r0)
            if (r0 == 0) goto L_0x018a
            float r5 = -r5
        L_0x018a:
            float r0 = r2.l()
            float r4 = r15.l()
            float r0 = r0 - r4
            float r2 = r2.e()
            float r15 = r15.e()
            float r2 = r2 - r15
            float r15 = V(r0, r2)
            if (r13 == 0) goto L_0x01a9
            boolean r13 = r13.b()
            if (r13 != r3) goto L_0x01a9
            goto L_0x01aa
        L_0x01a9:
            r3 = 0
        L_0x01aa:
            if (r3 == 0) goto L_0x01ad
            float r15 = -r15
        L_0x01ad:
            if (r14 == 0) goto L_0x01c9
            bp0.c r13 = r14.a()
            lp0.p r13 = (lp0.p) r13
            if (r13 == 0) goto L_0x01c9
            java.lang.Float r14 = java.lang.Float.valueOf(r5)
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            java.lang.Object r13 = r13.invoke(r14, r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x01c9:
            return r1
        L_0x01ca:
            if (r15 == 0) goto L_0x01d2
            java.lang.String r13 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r4 = r15.getString(r13)
        L_0x01d2:
            n1.j r13 = r0.s()
            n1.i r14 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.p()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r13, r14)
            n1.a r13 = (n1.a) r13
            if (r13 == 0) goto L_0x0205
            bp0.c r13 = r13.a()
            lp0.l r13 = (lp0.l) r13
            if (r13 == 0) goto L_0x0205
            p1.b r14 = new p1.b
            if (r4 != 0) goto L_0x01f2
            java.lang.String r4 = ""
        L_0x01f2:
            r6 = r4
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r13 = r13.invoke(r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0205:
            return r1
        L_0x0206:
            n1.j r13 = r0.s()
            n1.i r14 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.e()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r13, r14)
            n1.a r13 = (n1.a) r13
            if (r13 == 0) goto L_0x022a
            bp0.c r13 = r13.a()
            lp0.a r13 = (lp0.a) r13
            if (r13 == 0) goto L_0x022a
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x022a:
            return r1
        L_0x022b:
            n1.j r13 = r0.s()
            n1.i r14 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.a()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r13, r14)
            n1.a r13 = (n1.a) r13
            if (r13 == 0) goto L_0x024f
            bp0.c r13 = r13.a()
            lp0.a r13 = (lp0.a) r13
            if (r13 == 0) goto L_0x024f
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x024f:
            return r1
        L_0x0250:
            n1.j r13 = r0.s()
            n1.i r14 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.f()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r13, r14)
            n1.a r13 = (n1.a) r13
            if (r13 == 0) goto L_0x0274
            bp0.c r13 = r13.a()
            lp0.a r13 = (lp0.a) r13
            if (r13 == 0) goto L_0x0274
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0274:
            return r1
        L_0x0275:
            n1.j r13 = r0.s()
            n1.i r14 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.d()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r13, r14)
            n1.a r13 = (n1.a) r13
            if (r13 == 0) goto L_0x0299
            bp0.c r13 = r13.a()
            lp0.a r13 = (lp0.a) r13
            if (r13 == 0) goto L_0x0299
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0299:
            return r1
        L_0x029a:
            n1.j r13 = r0.s()
            n1.i r14 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.j()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r13, r14)
            n1.a r13 = (n1.a) r13
            if (r13 == 0) goto L_0x02be
            bp0.c r13 = r13.a()
            lp0.a r13 = (lp0.a) r13
            if (r13 == 0) goto L_0x02be
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x02be:
            return r1
        L_0x02bf:
            r13 = 4096(0x1000, float:5.74E-42)
            if (r14 != r13) goto L_0x02c5
            r13 = 1
            goto L_0x02c6
        L_0x02c5:
            r13 = 0
        L_0x02c6:
            r15 = 8192(0x2000, float:1.14794E-41)
            if (r14 != r15) goto L_0x02cc
            r15 = 1
            goto L_0x02cd
        L_0x02cc:
            r15 = 0
        L_0x02cd:
            r2 = 16908345(0x1020039, float:2.387739E-38)
            if (r14 != r2) goto L_0x02d4
            r2 = 1
            goto L_0x02d5
        L_0x02d4:
            r2 = 0
        L_0x02d5:
            r4 = 16908347(0x102003b, float:2.3877394E-38)
            if (r14 != r4) goto L_0x02dc
            r4 = 1
            goto L_0x02dd
        L_0x02dc:
            r4 = 0
        L_0x02dd:
            r5 = 16908344(0x1020038, float:2.3877386E-38)
            if (r14 != r5) goto L_0x02e4
            r5 = 1
            goto L_0x02e5
        L_0x02e4:
            r5 = 0
        L_0x02e5:
            r6 = 16908346(0x102003a, float:2.3877392E-38)
            if (r14 != r6) goto L_0x02ec
            r14 = 1
            goto L_0x02ed
        L_0x02ec:
            r14 = 0
        L_0x02ed:
            if (r2 != 0) goto L_0x02f8
            if (r4 != 0) goto L_0x02f8
            if (r13 != 0) goto L_0x02f8
            if (r15 == 0) goto L_0x02f6
            goto L_0x02f8
        L_0x02f6:
            r6 = 0
            goto L_0x02f9
        L_0x02f8:
            r6 = 1
        L_0x02f9:
            if (r5 != 0) goto L_0x0304
            if (r14 != 0) goto L_0x0304
            if (r13 != 0) goto L_0x0304
            if (r15 == 0) goto L_0x0302
            goto L_0x0304
        L_0x0302:
            r14 = 0
            goto L_0x0305
        L_0x0304:
            r14 = 1
        L_0x0305:
            if (r13 != 0) goto L_0x0309
            if (r15 == 0) goto L_0x039e
        L_0x0309:
            n1.j r13 = r0.s()
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.ui.semantics.SemanticsProperties.f7428a
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.r()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r13, r7)
            n1.f r13 = (n1.f) r13
            n1.j r7 = r0.s()
            n1.i r8 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r8 = r8.n()
            java.lang.Object r7 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r7, r8)
            n1.a r7 = (n1.a) r7
            if (r13 == 0) goto L_0x039e
            if (r7 == 0) goto L_0x039e
            rp0.b r14 = r13.c()
            java.lang.Comparable r14 = r14.c()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            rp0.b r0 = r13.c()
            java.lang.Comparable r0 = r0.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r14 = rp0.l.c(r14, r0)
            rp0.b r0 = r13.c()
            java.lang.Comparable r0 = r0.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            rp0.b r2 = r13.c()
            java.lang.Comparable r2 = r2.c()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r0 = rp0.l.h(r0, r2)
            int r2 = r13.d()
            if (r2 <= 0) goto L_0x037a
            float r14 = r14 - r0
            int r0 = r13.d()
            int r0 = r0 + r3
            goto L_0x037d
        L_0x037a:
            float r14 = r14 - r0
            r0 = 20
        L_0x037d:
            float r0 = (float) r0
            float r14 = r14 / r0
            if (r15 == 0) goto L_0x0382
            float r14 = -r14
        L_0x0382:
            bp0.c r15 = r7.a()
            lp0.l r15 = (lp0.l) r15
            if (r15 == 0) goto L_0x039d
            float r13 = r13.b()
            float r13 = r13 + r14
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r13 = r15.invoke(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x039d:
            return r1
        L_0x039e:
            i1.p r13 = r0.j()
            i1.m r13 = r13.d()
            t0.h r13 = i1.n.a(r13)
            long r7 = r13.k()
            n1.j r13 = r0.s()
            n1.i r3 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r3.l()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r13, r3)
            n1.a r13 = (n1.a) r13
            if (r13 != 0) goto L_0x03c1
            return r1
        L_0x03c1:
            n1.j r3 = r0.s()
            androidx.compose.ui.semantics.SemanticsProperties r9 = androidx.compose.ui.semantics.SemanticsProperties.f7428a
            androidx.compose.ui.semantics.SemanticsPropertyKey r10 = r9.i()
            java.lang.Object r3 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r3, r10)
            n1.h r3 = (n1.h) r3
            r10 = 0
            if (r3 == 0) goto L_0x0412
            if (r6 == 0) goto L_0x0412
            float r6 = t0.l.i(r7)
            if (r2 != 0) goto L_0x03de
            if (r15 == 0) goto L_0x03df
        L_0x03de:
            float r6 = -r6
        L_0x03df:
            boolean r11 = r3.b()
            if (r11 == 0) goto L_0x03e6
            float r6 = -r6
        L_0x03e6:
            boolean r11 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.s(r0)
            if (r11 == 0) goto L_0x03f1
            if (r2 != 0) goto L_0x03f0
            if (r4 == 0) goto L_0x03f1
        L_0x03f0:
            float r6 = -r6
        L_0x03f1:
            boolean r2 = U(r3, r6)
            if (r2 == 0) goto L_0x0412
            bp0.c r13 = r13.a()
            lp0.p r13 = (lp0.p) r13
            if (r13 == 0) goto L_0x0411
            java.lang.Float r14 = java.lang.Float.valueOf(r6)
            java.lang.Float r15 = java.lang.Float.valueOf(r10)
            java.lang.Object r13 = r13.invoke(r14, r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0411:
            return r1
        L_0x0412:
            n1.j r0 = r0.s()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r9.A()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r2)
            n1.h r0 = (n1.h) r0
            if (r0 == 0) goto L_0x0454
            if (r14 == 0) goto L_0x0454
            float r14 = t0.l.g(r7)
            if (r5 != 0) goto L_0x042c
            if (r15 == 0) goto L_0x042d
        L_0x042c:
            float r14 = -r14
        L_0x042d:
            boolean r15 = r0.b()
            if (r15 == 0) goto L_0x0434
            float r14 = -r14
        L_0x0434:
            boolean r15 = U(r0, r14)
            if (r15 == 0) goto L_0x0454
            bp0.c r13 = r13.a()
            lp0.p r13 = (lp0.p) r13
            if (r13 == 0) goto L_0x0454
            java.lang.Float r15 = java.lang.Float.valueOf(r10)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            java.lang.Object r13 = r13.invoke(r15, r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0454:
            return r1
        L_0x0455:
            n1.j r13 = r0.s()
            n1.i r14 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.i()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r13, r14)
            n1.a r13 = (n1.a) r13
            if (r13 == 0) goto L_0x0479
            bp0.c r13 = r13.a()
            lp0.a r13 = (lp0.a) r13
            if (r13 == 0) goto L_0x0479
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0479:
            return r1
        L_0x047a:
            n1.j r14 = r0.s()
            n1.i r15 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.h()
            java.lang.Object r14 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r14, r15)
            n1.a r14 = (n1.a) r14
            if (r14 == 0) goto L_0x049b
            bp0.c r14 = r14.a()
            lp0.a r14 = (lp0.a) r14
            if (r14 == 0) goto L_0x049b
            java.lang.Object r14 = r14.invoke()
            r4 = r14
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L_0x049b:
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 12
            r11 = 0
            r5 = r12
            r6 = r13
            f0(r5, r6, r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x04ac
            boolean r1 = r4.booleanValue()
        L_0x04ac:
            return r1
        L_0x04ad:
            n1.j r13 = r0.s()
            androidx.compose.ui.semantics.SemanticsProperties r14 = androidx.compose.ui.semantics.SemanticsProperties.f7428a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.g()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r13, r14)
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            boolean r13 = kotlin.jvm.internal.p.e(r13, r14)
            if (r13 == 0) goto L_0x04cd
            androidx.compose.ui.platform.AndroidComposeView r13 = r12.f6997d
            s0.f r13 = r13.getFocusManager()
            s0.e.a(r13, r1, r3, r4)
            r1 = 1
        L_0x04cd:
            return r1
        L_0x04ce:
            n1.j r13 = r0.s()
            n1.i r14 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.k()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r13, r14)
            n1.a r13 = (n1.a) r13
            if (r13 == 0) goto L_0x04f2
            bp0.c r13 = r13.a()
            lp0.a r13 = (lp0.a) r13
            if (r13 == 0) goto L_0x04f2
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x04f2:
            return r1
        L_0x04f3:
            r13 = -1
            if (r15 == 0) goto L_0x04fd
            java.lang.String r14 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r14 = r15.getInt(r14, r13)
            goto L_0x04fe
        L_0x04fd:
            r14 = -1
        L_0x04fe:
            if (r15 == 0) goto L_0x0506
            java.lang.String r2 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r13 = r15.getInt(r2, r13)
        L_0x0506:
            boolean r13 = r12.m0(r0, r14, r13, r1)
            if (r13 == 0) goto L_0x051e
            int r14 = r0.i()
            int r1 = r12.c0(r14)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r12
            f0(r0, r1, r2, r3, r4, r5, r6)
        L_0x051e:
            return r13
        L_0x051f:
            n1.j r13 = r0.s()
            n1.i r14 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.b()
            java.lang.Object r13 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r13, r14)
            n1.a r13 = (n1.a) r13
            if (r13 == 0) goto L_0x0543
            bp0.c r13 = r13.a()
            lp0.a r13 = (lp0.a) r13
            if (r13 == 0) goto L_0x0543
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0543:
            return r1
        L_0x0544:
            if (r15 == 0) goto L_0x055a
            java.lang.String r13 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r13 = r15.getInt(r13)
            java.lang.String r4 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r15 = r15.getBoolean(r4)
            if (r14 != r2) goto L_0x0555
            r1 = 1
        L_0x0555:
            boolean r13 = r12.q0(r0, r13, r1, r15)
            return r13
        L_0x055a:
            return r1
        L_0x055b:
            boolean r13 = r12.B(r13)
            return r13
        L_0x0560:
            boolean r13 = r12.a0(r13)
            return r13
        L_0x0565:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.T(int, int, android.os.Bundle):boolean");
    }

    private static final boolean U(n1.h hVar, float f11) {
        return (f11 < 0.0f && hVar.c().invoke().floatValue() > 0.0f) || (f11 > 0.0f && hVar.c().invoke().floatValue() < hVar.a().invoke().floatValue());
    }

    private static final float V(float f11, float f12) {
        if (Math.signum(f11) == Math.signum(f12)) {
            return Math.abs(f11) < Math.abs(f12) ? f11 : f12;
        }
        return 0.0f;
    }

    private static final boolean X(n1.h hVar) {
        return (hVar.c().invoke().floatValue() > 0.0f && !hVar.b()) || (hVar.c().invoke().floatValue() < hVar.a().invoke().floatValue() && hVar.b());
    }

    private static final boolean Y(n1.h hVar) {
        return (hVar.c().invoke().floatValue() < hVar.a().invoke().floatValue() && !hVar.b()) || (hVar.c().invoke().floatValue() > 0.0f && hVar.b());
    }

    private final boolean Z(int i11, List<c1> list) {
        boolean z11;
        c1 m11 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m(list, i11);
        if (m11 != null) {
            z11 = false;
        } else {
            m11 = new c1(i11, this.f7012y, (Float) null, (Float) null, (n1.h) null, (n1.h) null);
            z11 = true;
        }
        this.f7012y.add(m11);
        return z11;
    }

    private final boolean a0(int i11) {
        if (!N() || O(i11)) {
            return false;
        }
        int i12 = this.j;
        if (i12 != Integer.MIN_VALUE) {
            f0(this, i12, PDButton.FLAG_PUSHBUTTON, (Integer) null, (List) null, 12, (Object) null);
        }
        this.j = i11;
        this.f6997d.invalidate();
        f0(this, i11, 32768, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    public static final void b0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        p.j(androidComposeViewAccessibilityDelegateCompat, "this$0");
        k1.p.a(androidComposeViewAccessibilityDelegateCompat.f6997d, false, 1, (Object) null);
        androidComposeViewAccessibilityDelegateCompat.A();
        androidComposeViewAccessibilityDelegateCompat.f7010w = false;
    }

    /* access modifiers changed from: private */
    public final int c0(int i11) {
        if (i11 == this.f6997d.getSemanticsOwner().a().i()) {
            return -1;
        }
        return i11;
    }

    /* access modifiers changed from: private */
    public final boolean d0(AccessibilityEvent accessibilityEvent) {
        if (!N()) {
            return false;
        }
        return this.f6997d.getParent().requestSendAccessibilityEvent(this.f6997d, accessibilityEvent);
    }

    private final boolean e0(int i11, int i12, Integer num, List<String> list) {
        if (i11 == Integer.MIN_VALUE || !N()) {
            return false;
        }
        AccessibilityEvent C = C(i11, i12);
        if (num != null) {
            C.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            C.setContentDescription(p0.h.d(list, Constants.ACCEPT_TIME_SEPARATOR_SP, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        }
        return d0(C);
    }

    static /* synthetic */ boolean f0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i11, int i12, Integer num, List list, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            num = null;
        }
        if ((i13 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.e0(i11, i12, num, list);
    }

    private final void g0(int i11, int i12, String str) {
        AccessibilityEvent C = C(c0(i11), 32);
        C.setContentChangeTypes(i12);
        if (str != null) {
            C.getText().add(str);
        }
        d0(C);
    }

    private final void h0(int i11) {
        f fVar = this.f7007r;
        if (fVar != null) {
            if (i11 == fVar.d().i()) {
                if (SystemClock.uptimeMillis() - fVar.f() <= 1000) {
                    AccessibilityEvent C = C(c0(fVar.d().i()), PDChoice.FLAG_COMBO);
                    C.setFromIndex(fVar.b());
                    C.setToIndex(fVar.e());
                    C.setAction(fVar.a());
                    C.setMovementGranularity(fVar.c());
                    C.getText().add(J(fVar.d()));
                    d0(C);
                }
            } else {
                return;
            }
        }
        this.f7007r = null;
    }

    /* access modifiers changed from: private */
    public final void i0(c1 c1Var) {
        if (c1Var.o0()) {
            this.f6997d.getSnapshotObserver().e(c1Var, this.f7013z, new AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1(c1Var, this));
        }
    }

    private final void k0(SemanticsNode semanticsNode, g gVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> o11 = semanticsNode.o();
        int size = o11.size();
        for (int i11 = 0; i11 < size; i11++) {
            SemanticsNode semanticsNode2 = o11.get(i11);
            if (I().containsKey(Integer.valueOf(semanticsNode2.i()))) {
                if (!gVar.a().contains(Integer.valueOf(semanticsNode2.i()))) {
                    Q(semanticsNode.k());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.i()));
            }
        }
        for (Integer intValue : gVar.a()) {
            if (!linkedHashSet.contains(Integer.valueOf(intValue.intValue()))) {
                Q(semanticsNode.k());
                return;
            }
        }
        List<SemanticsNode> o12 = semanticsNode.o();
        int size2 = o12.size();
        for (int i12 = 0; i12 < size2; i12++) {
            SemanticsNode semanticsNode3 = o12.get(i12);
            if (I().containsKey(Integer.valueOf(semanticsNode3.i()))) {
                g gVar2 = this.f7009u.get(Integer.valueOf(semanticsNode3.i()));
                p.g(gVar2);
                k0(semanticsNode3, gVar2);
            }
        }
    }

    private final void l0(LayoutNode layoutNode, androidx.collection.b<Integer> bVar) {
        LayoutNode d11;
        n1.k j11;
        if (layoutNode.L0() && !this.f6997d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            n1.k j12 = androidx.compose.ui.semantics.a.j(layoutNode);
            if (j12 == null) {
                LayoutNode d12 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsWrapper$1.f7038a);
                j12 = d12 != null ? androidx.compose.ui.semantics.a.j(d12) : null;
                if (j12 == null) {
                    return;
                }
            }
            if (!(j12.j().l() || (d11 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.f7037a)) == null || (j11 = androidx.compose.ui.semantics.a.j(d11)) == null)) {
                j12 = j11;
            }
            int id2 = ((n1.l) j12.c()).getId();
            if (bVar.add(Integer.valueOf(id2))) {
                f0(this, c0(id2), 2048, 1, (List) null, 8, (Object) null);
            }
        }
    }

    private final boolean m0(SemanticsNode semanticsNode, int i11, int i12, boolean z11) {
        String J;
        j s11 = semanticsNode.s();
        n1.i iVar = n1.i.f15789a;
        boolean z12 = false;
        if (s11.c(iVar.o()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode)) {
            q qVar = (q) ((n1.a) semanticsNode.s().g(iVar.o())).a();
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z11))).booleanValue();
            }
            return false;
        } else if ((i11 == i12 && i12 == this.f7004m) || (J = J(semanticsNode)) == null) {
            return false;
        } else {
            if (i11 < 0 || i11 != i12 || i12 > J.length()) {
                i11 = -1;
            }
            this.f7004m = i11;
            if (J.length() > 0) {
                z12 = true;
            }
            int c02 = c0(semanticsNode.i());
            Integer num = null;
            Integer valueOf = z12 ? Integer.valueOf(this.f7004m) : null;
            Integer valueOf2 = z12 ? Integer.valueOf(this.f7004m) : null;
            if (z12) {
                num = Integer.valueOf(J.length());
            }
            d0(E(c02, valueOf, valueOf2, num, J));
            h0(semanticsNode.i());
            return true;
        }
    }

    private final void n0(SemanticsNode semanticsNode, androidx.core.view.accessibility.c cVar) {
        j s11 = semanticsNode.s();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7428a;
        if (s11.c(semanticsProperties.f())) {
            cVar.h0(true);
            cVar.l0((CharSequence) SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties.f()));
        }
    }

    private final void o0(SemanticsNode semanticsNode, androidx.core.view.accessibility.c cVar) {
        p1.b bVar;
        i.b fontFamilyResolver = this.f6997d.getFontFamilyResolver();
        p1.b L = L(semanticsNode.s());
        SpannableString spannableString = null;
        SpannableString spannableString2 = (SpannableString) r0(L != null ? x1.a.b(L, this.f6997d.getDensity(), fontFamilyResolver) : null, 100000);
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.s(), SemanticsProperties.f7428a.x());
        if (!(list == null || (bVar = (p1.b) s.Y(list)) == null)) {
            spannableString = x1.a.b(bVar, this.f6997d.getDensity(), fontFamilyResolver);
        }
        SpannableString spannableString3 = (SpannableString) r0(spannableString, 100000);
        if (spannableString2 == null) {
            spannableString2 = spannableString3;
        }
        cVar.I0(spannableString2);
    }

    private final RectF p0(SemanticsNode semanticsNode, t0.h hVar) {
        if (semanticsNode == null) {
            return null;
        }
        t0.h r11 = hVar.r(semanticsNode.n());
        t0.h f11 = semanticsNode.f();
        t0.h o11 = r11.p(f11) ? r11.o(f11) : null;
        if (o11 == null) {
            return null;
        }
        long p11 = this.f6997d.p(t0.g.a(o11.i(), o11.l()));
        long p12 = this.f6997d.p(t0.g.a(o11.j(), o11.e()));
        return new RectF(t0.f.m(p11), t0.f.n(p11), t0.f.m(p12), t0.f.n(p12));
    }

    private final boolean q0(SemanticsNode semanticsNode, int i11, boolean z11, boolean z12) {
        f K;
        int i12;
        int i13;
        int i14 = semanticsNode.i();
        Integer num = this.n;
        if (num == null || i14 != num.intValue()) {
            this.f7004m = -1;
            this.n = Integer.valueOf(semanticsNode.i());
        }
        String J = J(semanticsNode);
        if ((J == null || J.length() == 0) || (K = K(semanticsNode, i11)) == null) {
            return false;
        }
        int G = G(semanticsNode);
        if (G == -1) {
            G = z11 ? 0 : J.length();
        }
        int[] a11 = z11 ? K.a(G) : K.b(G);
        if (a11 == null) {
            return false;
        }
        int i15 = a11[0];
        int i16 = a11[1];
        if (!z12 || !P(semanticsNode)) {
            i13 = z11 ? i16 : i15;
            i12 = i13;
        } else {
            i13 = H(semanticsNode);
            if (i13 == -1) {
                i13 = z11 ? i15 : i16;
            }
            i12 = z11 ? i16 : i15;
        }
        this.f7007r = new f(semanticsNode, z11 ? 256 : TruecallerSdkScope.FOOTER_TYPE_MANUALLY, i11, i15, i16, SystemClock.uptimeMillis());
        SemanticsNode semanticsNode2 = semanticsNode;
        m0(semanticsNode, i13, i12, true);
        return true;
    }

    private final <T extends CharSequence> T r0(T t11, int i11) {
        boolean z11 = true;
        if (i11 > 0) {
            if (!(t11 == null || t11.length() == 0)) {
                z11 = false;
            }
            if (z11 || t11.length() <= i11) {
                return t11;
            }
            int i12 = i11 - 1;
            if (Character.isHighSurrogate(t11.charAt(i12)) && Character.isLowSurrogate(t11.charAt(i11))) {
                i11 = i12;
            }
            return t11.subSequence(0, i11);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void s0(int i11) {
        int i12 = this.f6998e;
        if (i12 != i11) {
            this.f6998e = i11;
            f0(this, i11, 128, (Integer) null, (List) null, 12, (Object) null);
            f0(this, i12, 256, (Integer) null, (List) null, 12, (Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void t0() {
        /*
            r6 = this;
            androidx.collection.b<java.lang.Integer> r0 = r6.t
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005e
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.Map r2 = r6.I()
            java.lang.Object r2 = r2.get(r1)
            androidx.compose.ui.platform.d1 r2 = (androidx.compose.ui.platform.d1) r2
            r3 = 0
            if (r2 == 0) goto L_0x0024
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.b()
            goto L_0x0025
        L_0x0024:
            r2 = r3
        L_0x0025:
            if (r2 == 0) goto L_0x002d
            boolean r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.q(r2)
            if (r2 != 0) goto L_0x0006
        L_0x002d:
            androidx.collection.b<java.lang.Integer> r2 = r6.t
            r2.remove(r1)
            java.lang.String r2 = "id"
            kotlin.jvm.internal.p.i(r1, r2)
            int r2 = r1.intValue()
            r4 = 32
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g> r5 = r6.f7009u
            java.lang.Object r1 = r5.get(r1)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g r1 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.g) r1
            if (r1 == 0) goto L_0x005a
            n1.j r1 = r1.b()
            if (r1 == 0) goto L_0x005a
            androidx.compose.ui.semantics.SemanticsProperties r3 = androidx.compose.ui.semantics.SemanticsProperties.f7428a
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r3.p()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r3)
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L_0x005a:
            r6.g0(r2, r4, r3)
            goto L_0x0006
        L_0x005e:
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g> r0 = r6.f7009u
            r0.clear()
            java.util.Map r0 = r6.I()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x006f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.compose.ui.platform.d1 r2 = (androidx.compose.ui.platform.d1) r2
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.b()
            boolean r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.q(r2)
            if (r2 == 0) goto L_0x00c0
            androidx.collection.b<java.lang.Integer> r2 = r6.t
            java.lang.Object r3 = r1.getKey()
            boolean r2 = r2.add(r3)
            if (r2 == 0) goto L_0x00c0
            java.lang.Object r2 = r1.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 16
            java.lang.Object r4 = r1.getValue()
            androidx.compose.ui.platform.d1 r4 = (androidx.compose.ui.platform.d1) r4
            androidx.compose.ui.semantics.SemanticsNode r4 = r4.b()
            n1.j r4 = r4.s()
            androidx.compose.ui.semantics.SemanticsProperties r5 = androidx.compose.ui.semantics.SemanticsProperties.f7428a
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r5.p()
            java.lang.Object r4 = r4.g(r5)
            java.lang.String r4 = (java.lang.String) r4
            r6.g0(r2, r3, r4)
        L_0x00c0:
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g> r2 = r6.f7009u
            java.lang.Object r3 = r1.getKey()
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g r4 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.platform.d1 r1 = (androidx.compose.ui.platform.d1) r1
            androidx.compose.ui.semantics.SemanticsNode r1 = r1.b()
            java.util.Map r5 = r6.I()
            r4.<init>(r1, r5)
            r2.put(r3, r4)
            goto L_0x006f
        L_0x00dd:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g
            androidx.compose.ui.platform.AndroidComposeView r1 = r6.f6997d
            n1.n r1 = r1.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r1 = r1.a()
            java.util.Map r2 = r6.I()
            r0.<init>(r1, r2)
            r6.v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.t0():void");
    }

    /* access modifiers changed from: private */
    public final void w(int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode b11;
        String str2;
        d1 d1Var = I().get(Integer.valueOf(i11));
        if (d1Var != null && (b11 = d1Var.b()) != null) {
            String J = J(b11);
            j s11 = b11.s();
            n1.i iVar = n1.i.f15789a;
            if (!s11.c(iVar.g()) || bundle == null || !p.e(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                j s12 = b11.s();
                SemanticsProperties semanticsProperties = SemanticsProperties.f7428a;
                if (s12.c(semanticsProperties.w()) && bundle != null && p.e(str, "androidx.compose.ui.semantics.testTag") && (str2 = (String) SemanticsConfigurationKt.a(b11.s(), semanticsProperties.w())) != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i13 > 0 && i12 >= 0) {
                if (i12 < (J != null ? J.length() : Integer.MAX_VALUE)) {
                    ArrayList arrayList = new ArrayList();
                    l lVar = (l) ((n1.a) b11.s().g(iVar.g())).a();
                    if (p.e(lVar != null ? (Boolean) lVar.invoke(arrayList) : null, Boolean.TRUE)) {
                        y yVar = (y) arrayList.get(0);
                        ArrayList arrayList2 = new ArrayList();
                        for (int i14 = 0; i14 < i13; i14++) {
                            int i15 = i12 + i14;
                            if (i15 >= yVar.k().j().length()) {
                                arrayList2.add((Object) null);
                            } else {
                                arrayList2.add(p0(b11, yVar.c(i15)));
                            }
                        }
                        Bundle extras = accessibilityNodeInfo.getExtras();
                        Object[] array = arrayList2.toArray(new RectF[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        extras.putParcelableArray(str, (Parcelable[]) array);
                        return;
                    }
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
        }
    }

    public final AccessibilityEvent C(int i11, int i12) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i12);
        p.i(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f6997d.getContext().getPackageName());
        obtain.setSource(this.f6997d, i11);
        d1 d1Var = I().get(Integer.valueOf(i11));
        if (d1Var != null) {
            obtain.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.r(d1Var.b()));
        }
        return obtain;
    }

    public final boolean F(MotionEvent motionEvent) {
        p.j(motionEvent, "event");
        if (!N()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int M = M(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.f6997d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            s0(M);
            if (M == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        } else if (action != 10) {
            return false;
        } else {
            if (this.f6998e == Integer.MIN_VALUE) {
                return this.f6997d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            }
            s0(Integer.MIN_VALUE);
            return true;
        }
    }

    public final int M(float f11, float f12) {
        LayoutNode a11;
        n1.k kVar = null;
        k1.p.a(this.f6997d, false, 1, (Object) null);
        k1.c cVar = new k1.c();
        LayoutNode.G0(this.f6997d.getRoot(), t0.g.a(f11, f12), cVar, false, false, 12, (Object) null);
        n1.k kVar2 = (n1.k) s.i0(cVar);
        if (!(kVar2 == null || (a11 = kVar2.a()) == null)) {
            kVar = androidx.compose.ui.semantics.a.j(a11);
        }
        if (kVar == null) {
            return Integer.MIN_VALUE;
        }
        SemanticsNode semanticsNode = new SemanticsNode(kVar, false);
        LayoutNodeWrapper e11 = semanticsNode.e();
        if (semanticsNode.s().c(SemanticsProperties.f7428a.l()) || e11.C1() || this.f6997d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(kVar.a()) != null) {
            return Integer.MIN_VALUE;
        }
        return c0(((n1.l) kVar.c()).getId());
    }

    public final void R(LayoutNode layoutNode) {
        p.j(layoutNode, "layoutNode");
        this.q = true;
        if (N()) {
            Q(layoutNode);
        }
    }

    public final void S() {
        this.q = true;
        if (N() && !this.f7010w) {
            this.f7010w = true;
            this.f7001h.post(this.f7011x);
        }
    }

    public final void W(int i11, androidx.core.view.accessibility.c cVar, SemanticsNode semanticsNode) {
        LayoutNodeWrapper layoutNodeWrapper;
        c.a aVar;
        c.a aVar2;
        float f11;
        boolean z11;
        String str;
        String str2;
        p.j(cVar, "info");
        p.j(semanticsNode, "semanticsNode");
        cVar.c0("android.view.View");
        j s11 = semanticsNode.s();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7428a;
        n1.g gVar = (n1.g) SemanticsConfigurationKt.a(s11, semanticsProperties.s());
        String str3 = null;
        if (gVar != null) {
            int m11 = gVar.m();
            if (semanticsNode.t() || semanticsNode.o().isEmpty()) {
                g.a aVar3 = n1.g.f15778b;
                if (n1.g.j(gVar.m(), aVar3.f())) {
                    cVar.A0(this.f6997d.getContext().getResources().getString(R.string.tab));
                } else {
                    if (n1.g.j(m11, aVar3.a())) {
                        str2 = "android.widget.Button";
                    } else if (n1.g.j(m11, aVar3.b())) {
                        str2 = "android.widget.CheckBox";
                    } else if (n1.g.j(m11, aVar3.e())) {
                        str2 = "android.widget.Switch";
                    } else if (n1.g.j(m11, aVar3.d())) {
                        str2 = "android.widget.RadioButton";
                    } else {
                        str2 = n1.g.j(m11, aVar3.c()) ? "android.widget.ImageView" : null;
                    }
                    if (!n1.g.j(gVar.m(), aVar3.c())) {
                        cVar.c0(str2);
                    } else if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode.k(), AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$1$ancestor$1.f7033a) == null || semanticsNode.s().l()) {
                        cVar.c0(str2);
                    }
                }
            }
            k kVar = k.f22762a;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(semanticsNode)) {
            cVar.c0("android.widget.EditText");
        }
        if (semanticsNode.h().c(semanticsProperties.x())) {
            cVar.c0("android.widget.TextView");
        }
        cVar.u0(this.f6997d.getContext().getPackageName());
        List<SemanticsNode> p11 = semanticsNode.p();
        int size = p11.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            SemanticsNode semanticsNode2 = p11.get(i13);
            if (I().containsKey(Integer.valueOf(semanticsNode2.i()))) {
                AndroidViewHolder androidViewHolder = this.f6997d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.k());
                if (androidViewHolder != null) {
                    cVar.c(androidViewHolder);
                } else {
                    cVar.d(this.f6997d, semanticsNode2.i());
                }
            }
        }
        if (this.j == i11) {
            cVar.W(true);
            cVar.b(c.a.f9461l);
        } else {
            cVar.W(false);
            cVar.b(c.a.k);
        }
        o0(semanticsNode, cVar);
        n0(semanticsNode, cVar);
        j s12 = semanticsNode.s();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.f7428a;
        cVar.H0((CharSequence) SemanticsConfigurationKt.a(s12, semanticsProperties2.v()));
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties2.z());
        int i14 = 2;
        if (toggleableState != null) {
            cVar.a0(true);
            int i15 = h.f7032a[toggleableState.ordinal()];
            if (i15 == 1) {
                cVar.b0(true);
                if ((gVar == null ? false : n1.g.j(gVar.m(), n1.g.f15778b.e())) && cVar.x() == null) {
                    cVar.H0(this.f6997d.getContext().getResources().getString(R.string.f6321on));
                }
            } else if (i15 == 2) {
                cVar.b0(false);
                if ((gVar == null ? false : n1.g.j(gVar.m(), n1.g.f15778b.e())) && cVar.x() == null) {
                    cVar.H0(this.f6997d.getContext().getResources().getString(R.string.off));
                }
            } else if (i15 == 3 && cVar.x() == null) {
                cVar.H0(this.f6997d.getContext().getResources().getString(R.string.indeterminate));
            }
            k kVar2 = k.f22762a;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties2.u());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (gVar == null ? false : n1.g.j(gVar.m(), n1.g.f15778b.f())) {
                cVar.D0(booleanValue);
            } else {
                cVar.a0(true);
                cVar.b0(booleanValue);
                if (cVar.x() == null) {
                    if (booleanValue) {
                        str = this.f6997d.getContext().getResources().getString(R.string.selected);
                    } else {
                        str = this.f6997d.getContext().getResources().getString(R.string.not_selected);
                    }
                    cVar.H0(str);
                }
            }
            k kVar3 = k.f22762a;
        }
        if (!semanticsNode.s().l() || semanticsNode.o().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties2.c());
            cVar.g0(list != null ? (String) s.Y(list) : null);
        }
        if (semanticsNode.s().l()) {
            cVar.B0(true);
        }
        String str4 = (String) SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties2.w());
        if (str4 != null) {
            SemanticsNode semanticsNode3 = semanticsNode;
            while (true) {
                if (semanticsNode3 == null) {
                    z11 = false;
                    break;
                }
                j s13 = semanticsNode3.s();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.f7456a;
                if (s13.c(semanticsPropertiesAndroid.a())) {
                    z11 = ((Boolean) semanticsNode3.s().g(semanticsPropertiesAndroid.a())).booleanValue();
                    break;
                }
                semanticsNode3 = semanticsNode3.m();
            }
            if (z11) {
                cVar.L0(str4);
            }
        }
        j s14 = semanticsNode.s();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.f7428a;
        if (((k) SemanticsConfigurationKt.a(s14, semanticsProperties3.h())) != null) {
            cVar.o0(true);
            k kVar4 = k.f22762a;
        }
        cVar.y0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.r(semanticsNode));
        cVar.j0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(semanticsNode));
        cVar.k0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode));
        cVar.m0(semanticsNode.s().c(semanticsProperties3.g()));
        if (cVar.H()) {
            cVar.n0(((Boolean) semanticsNode.s().g(semanticsProperties3.g())).booleanValue());
            if (cVar.I()) {
                cVar.a(2);
            } else {
                cVar.a(1);
            }
        }
        if (semanticsNode.t()) {
            SemanticsNode m12 = semanticsNode.m();
            layoutNodeWrapper = m12 != null ? m12.e() : null;
        } else {
            layoutNodeWrapper = semanticsNode.e();
        }
        cVar.M0(!(layoutNodeWrapper != null ? layoutNodeWrapper.C1() : false) && SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties3.l()) == null);
        n1.e eVar = (n1.e) SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties3.o());
        if (eVar != null) {
            int i16 = eVar.i();
            e.a aVar4 = n1.e.f15769b;
            if (n1.e.f(i16, aVar4.b()) || !n1.e.f(i16, aVar4.a())) {
                i14 = 1;
            }
            cVar.q0(i14);
            k kVar5 = k.f22762a;
        }
        cVar.d0(false);
        j s15 = semanticsNode.s();
        n1.i iVar = n1.i.f15789a;
        n1.a aVar5 = (n1.a) SemanticsConfigurationKt.a(s15, iVar.h());
        if (aVar5 != null) {
            boolean e11 = p.e(SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties3.u()), Boolean.TRUE);
            cVar.d0(!e11);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode) && !e11) {
                cVar.b(new c.a(16, aVar5.b()));
            }
            k kVar6 = k.f22762a;
        }
        cVar.r0(false);
        n1.a aVar6 = (n1.a) SemanticsConfigurationKt.a(semanticsNode.s(), iVar.i());
        if (aVar6 != null) {
            cVar.r0(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode)) {
                cVar.b(new c.a(32, aVar6.b()));
            }
            k kVar7 = k.f22762a;
        }
        n1.a aVar7 = (n1.a) SemanticsConfigurationKt.a(semanticsNode.s(), iVar.b());
        if (aVar7 != null) {
            cVar.b(new c.a(16384, aVar7.b()));
            k kVar8 = k.f22762a;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode)) {
            n1.a aVar8 = (n1.a) SemanticsConfigurationKt.a(semanticsNode.s(), iVar.p());
            if (aVar8 != null) {
                cVar.b(new c.a(2097152, aVar8.b()));
                k kVar9 = k.f22762a;
            }
            n1.a aVar9 = (n1.a) SemanticsConfigurationKt.a(semanticsNode.s(), iVar.d());
            if (aVar9 != null) {
                cVar.b(new c.a(PDButton.FLAG_PUSHBUTTON, aVar9.b()));
                k kVar10 = k.f22762a;
            }
            n1.a aVar10 = (n1.a) SemanticsConfigurationKt.a(semanticsNode.s(), iVar.j());
            if (aVar10 != null) {
                if (cVar.I() && this.f6997d.getClipboardManager().b()) {
                    cVar.b(new c.a(32768, aVar10.b()));
                }
                k kVar11 = k.f22762a;
            }
        }
        String J = J(semanticsNode);
        if (!(J == null || J.length() == 0)) {
            cVar.J0(H(semanticsNode), G(semanticsNode));
            n1.a aVar11 = (n1.a) SemanticsConfigurationKt.a(semanticsNode.s(), iVar.o());
            if (aVar11 != null) {
                str3 = aVar11.b();
            }
            cVar.b(new c.a(PDChoice.FLAG_COMBO, str3));
            cVar.a(256);
            cVar.a(TruecallerSdkScope.FOOTER_TYPE_MANUALLY);
            cVar.t0(11);
            List list2 = (List) SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties3.c());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.s().c(iVar.g()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.l(semanticsNode)) {
                cVar.t0(cVar.t() | 4 | 16);
            }
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 26) {
            ArrayList arrayList = new ArrayList();
            CharSequence y11 = cVar.y();
            if (!(y11 == null || y11.length() == 0) && semanticsNode.s().c(iVar.g())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.s().c(semanticsProperties3.w())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            if (!arrayList.isEmpty()) {
                i iVar2 = i.f7308a;
                AccessibilityNodeInfo N0 = cVar.N0();
                p.i(N0, "info.unwrap()");
                iVar2.a(N0, arrayList);
            }
        }
        n1.f fVar = (n1.f) SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties3.r());
        if (fVar != null) {
            if (semanticsNode.s().c(iVar.n())) {
                cVar.c0("android.widget.SeekBar");
            } else {
                cVar.c0("android.widget.ProgressBar");
            }
            if (fVar != n1.f.f15773d.a()) {
                cVar.z0(c.d.a(1, fVar.c().getStart().floatValue(), fVar.c().c().floatValue(), fVar.b()));
                if (cVar.x() == null) {
                    rp0.b<Float> c11 = fVar.c();
                    if (c11.c().floatValue() - c11.getStart().floatValue() == 0.0f) {
                        f11 = 0.0f;
                    } else {
                        f11 = (fVar.b() - c11.getStart().floatValue()) / (c11.c().floatValue() - c11.getStart().floatValue());
                    }
                    float l11 = l.l(f11, 0.0f, 1.0f);
                    int i18 = 100;
                    if (l11 == 0.0f) {
                        i18 = 0;
                    } else {
                        if (!(l11 == 1.0f)) {
                            i18 = l.m(c.c(l11 * ((float) 100)), 1, 99);
                        }
                    }
                    cVar.H0(this.f6997d.getContext().getResources().getString(R.string.template_percent, new Object[]{Integer.valueOf(i18)}));
                }
            } else if (cVar.x() == null) {
                cVar.H0(this.f6997d.getContext().getResources().getString(R.string.in_progress));
            }
            if (semanticsNode.s().c(iVar.n()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode)) {
                if (fVar.b() < l.c(fVar.c().c().floatValue(), fVar.c().getStart().floatValue())) {
                    cVar.b(c.a.q);
                }
                if (fVar.b() > l.h(fVar.c().getStart().floatValue(), fVar.c().c().floatValue())) {
                    cVar.b(c.a.f9465r);
                }
            }
        }
        if (i17 >= 24) {
            b.a(cVar, semanticsNode);
        }
        CollectionInfoKt.d(semanticsNode, cVar);
        CollectionInfoKt.e(semanticsNode, cVar);
        n1.h hVar = (n1.h) SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties3.i());
        n1.a aVar12 = (n1.a) SemanticsConfigurationKt.a(semanticsNode.s(), iVar.l());
        if (!(hVar == null || aVar12 == null)) {
            if (!CollectionInfoKt.b(semanticsNode)) {
                cVar.c0("android.widget.HorizontalScrollView");
            }
            if (hVar.a().invoke().floatValue() > 0.0f) {
                cVar.C0(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode)) {
                if (Y(hVar)) {
                    cVar.b(c.a.q);
                    if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.s(semanticsNode)) {
                        aVar2 = c.a.F;
                    } else {
                        aVar2 = c.a.D;
                    }
                    cVar.b(aVar2);
                }
                if (X(hVar)) {
                    cVar.b(c.a.f9465r);
                    if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.s(semanticsNode)) {
                        aVar = c.a.D;
                    } else {
                        aVar = c.a.F;
                    }
                    cVar.b(aVar);
                }
            }
        }
        n1.h hVar2 = (n1.h) SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties3.A());
        if (!(hVar2 == null || aVar12 == null)) {
            if (!CollectionInfoKt.b(semanticsNode)) {
                cVar.c0("android.widget.ScrollView");
            }
            if (hVar2.a().invoke().floatValue() > 0.0f) {
                cVar.C0(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode)) {
                if (Y(hVar2)) {
                    cVar.b(c.a.q);
                    cVar.b(c.a.E);
                }
                if (X(hVar2)) {
                    cVar.b(c.a.f9465r);
                    cVar.b(c.a.C);
                }
            }
        }
        cVar.v0((CharSequence) SemanticsConfigurationKt.a(semanticsNode.s(), semanticsProperties3.p()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.k(semanticsNode)) {
            n1.a aVar13 = (n1.a) SemanticsConfigurationKt.a(semanticsNode.s(), iVar.f());
            if (aVar13 != null) {
                cVar.b(new c.a(262144, aVar13.b()));
                k kVar12 = k.f22762a;
            }
            n1.a aVar14 = (n1.a) SemanticsConfigurationKt.a(semanticsNode.s(), iVar.a());
            if (aVar14 != null) {
                cVar.b(new c.a(524288, aVar14.b()));
                k kVar13 = k.f22762a;
            }
            n1.a aVar15 = (n1.a) SemanticsConfigurationKt.a(semanticsNode.s(), iVar.e());
            if (aVar15 != null) {
                cVar.b(new c.a(1048576, aVar15.b()));
                k kVar14 = k.f22762a;
            }
            if (semanticsNode.s().c(iVar.c())) {
                List list3 = (List) semanticsNode.s().g(iVar.c());
                int size2 = list3.size();
                int[] iArr = B;
                if (size2 < iArr.length) {
                    androidx.collection.h hVar3 = new androidx.collection.h();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.f7003l.g(i11)) {
                        Map i19 = this.f7003l.i(i11);
                        List i02 = ArraysKt___ArraysKt.i0(iArr);
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list3.size();
                        for (int i21 = 0; i21 < size3; i21++) {
                            n1.d dVar = (n1.d) list3.get(i21);
                            p.g(i19);
                            if (i19.containsKey(dVar.b())) {
                                Integer num = (Integer) i19.get(dVar.b());
                                p.g(num);
                                hVar3.n(num.intValue(), dVar.b());
                                linkedHashMap.put(dVar.b(), num);
                                i02.remove(num);
                                cVar.b(new c.a(num.intValue(), dVar.b()));
                            } else {
                                arrayList2.add(dVar);
                            }
                        }
                        int size4 = arrayList2.size();
                        while (i12 < size4) {
                            n1.d dVar2 = (n1.d) arrayList2.get(i12);
                            int intValue = ((Number) i02.get(i12)).intValue();
                            hVar3.n(intValue, dVar2.b());
                            linkedHashMap.put(dVar2.b(), Integer.valueOf(intValue));
                            cVar.b(new c.a(intValue, dVar2.b()));
                            i12++;
                        }
                    } else {
                        int size5 = list3.size();
                        while (i12 < size5) {
                            n1.d dVar3 = (n1.d) list3.get(i12);
                            int i22 = B[i12];
                            hVar3.n(i22, dVar3.b());
                            linkedHashMap.put(dVar3.b(), Integer.valueOf(i22));
                            cVar.b(new c.a(i22, dVar3.b()));
                            i12++;
                        }
                    }
                    this.k.n(i11, hVar3);
                    this.f7003l.n(i11, linkedHashMap);
                    return;
                }
                throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
            }
        }
    }

    public androidx.core.view.accessibility.d b(View view) {
        p.j(view, "host");
        return this.f7002i;
    }

    /* JADX WARNING: type inference failed for: r1v30, types: [p1.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j0(java.util.Map<java.lang.Integer, androidx.compose.ui.platform.d1> r29) {
        /*
            r28 = this;
            r7 = r28
            r8 = r29
            java.lang.String r0 = "newSemanticsNodes"
            kotlin.jvm.internal.p.j(r8, r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List<androidx.compose.ui.platform.c1> r0 = r7.f7012y
            r9.<init>(r0)
            java.util.List<androidx.compose.ui.platform.c1> r0 = r7.f7012y
            r0.clear()
            java.util.Set r0 = r29.keySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x001d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x04be
            java.lang.Object r0 = r10.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r0.intValue()
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g> r0 = r7.f7009u
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r0.get(r1)
            r12 = r0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g r12 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.g) r12
            if (r12 != 0) goto L_0x003d
            goto L_0x001d
        L_0x003d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r8.get(r0)
            androidx.compose.ui.platform.d1 r0 = (androidx.compose.ui.platform.d1) r0
            if (r0 == 0) goto L_0x004f
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.b()
            r14 = r0
            goto L_0x0050
        L_0x004f:
            r14 = 0
        L_0x0050:
            kotlin.jvm.internal.p.g(r14)
            n1.j r0 = r14.s()
            java.util.Iterator r15 = r0.iterator()
            r6 = 1
            r16 = 0
            r17 = 0
        L_0x0060:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x04a1
            java.lang.Object r0 = r15.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsProperties r2 = androidx.compose.ui.semantics.SemanticsProperties.f7428a
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.i()
            boolean r1 = kotlin.jvm.internal.p.e(r1, r3)
            if (r1 != 0) goto L_0x008d
            java.lang.Object r1 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.A()
            boolean r1 = kotlin.jvm.internal.p.e(r1, r3)
            if (r1 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r1 = 0
            goto L_0x0091
        L_0x008d:
            boolean r1 = r7.Z(r11, r9)
        L_0x0091:
            if (r1 != 0) goto L_0x00ad
            java.lang.Object r1 = r0.getValue()
            n1.j r3 = r12.b()
            java.lang.Object r4 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = (androidx.compose.ui.semantics.SemanticsPropertyKey) r4
            java.lang.Object r3 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r3, r4)
            boolean r1 = kotlin.jvm.internal.p.e(r1, r3)
            if (r1 == 0) goto L_0x00ad
            goto L_0x046f
        L_0x00ad:
            java.lang.Object r1 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = (androidx.compose.ui.semantics.SemanticsPropertyKey) r1
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.p()
            boolean r3 = kotlin.jvm.internal.p.e(r1, r3)
            r4 = 8
            if (r3 == 0) goto L_0x00d5
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r12.c()
            if (r1 == 0) goto L_0x046f
            r7.g0(r11, r4, r0)
            goto L_0x046f
        L_0x00d5:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.v()
            boolean r3 = kotlin.jvm.internal.p.e(r1, r3)
            if (r3 == 0) goto L_0x00e1
            r3 = 1
            goto L_0x00e9
        L_0x00e1:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.z()
            boolean r3 = kotlin.jvm.internal.p.e(r1, r3)
        L_0x00e9:
            r5 = 64
            if (r3 == 0) goto L_0x0112
            int r1 = r7.c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4 = 0
            r5 = 8
            r18 = 0
            r0 = r28
            r13 = 1
            r6 = r18
            f0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.c0(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r6 = 0
            f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x046f
        L_0x0112:
            r13 = 1
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.r()
            boolean r3 = kotlin.jvm.internal.p.e(r1, r3)
            if (r3 == 0) goto L_0x013d
            int r1 = r7.c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r28
            f0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.c0(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x046f
        L_0x013d:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.u()
            boolean r3 = kotlin.jvm.internal.p.e(r1, r3)
            r6 = 4
            if (r3 == 0) goto L_0x0229
            n1.j r0 = r14.h()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.s()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            n1.g r0 = (n1.g) r0
            n1.g$a r1 = n1.g.f15778b
            int r1 = r1.f()
            if (r0 != 0) goto L_0x0160
            r0 = 0
            goto L_0x0168
        L_0x0160:
            int r0 = r0.m()
            boolean r0 = n1.g.j(r0, r1)
        L_0x0168:
            if (r0 == 0) goto L_0x0209
            n1.j r0 = r14.h()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.u()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.p.e(r0, r1)
            if (r0 == 0) goto L_0x01f4
            int r0 = r7.c0(r11)
            android.view.accessibility.AccessibilityEvent r0 = r7.C(r0, r6)
            androidx.compose.ui.semantics.SemanticsNode r1 = new androidx.compose.ui.semantics.SemanticsNode
            n1.k r3 = r14.l()
            r1.<init>(r3, r13)
            n1.j r3 = r1.h()
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = r2.c()
            java.lang.Object r3 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r3, r4)
            r19 = r3
            java.util.List r19 = (java.util.List) r19
            if (r19 == 0) goto L_0x01b6
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 62
            r27 = 0
            java.lang.String r20 = ","
            java.lang.String r3 = p0.h.d(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x01b7
        L_0x01b6:
            r3 = 0
        L_0x01b7:
            n1.j r1 = r1.h()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.x()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r2)
            r19 = r1
            java.util.List r19 = (java.util.List) r19
            if (r19 == 0) goto L_0x01de
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 62
            r27 = 0
            java.lang.String r20 = ","
            java.lang.String r1 = p0.h.d(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x01df
        L_0x01de:
            r1 = 0
        L_0x01df:
            if (r3 == 0) goto L_0x01e6
            r0.setContentDescription(r3)
            bp0.k r2 = bp0.k.f22762a
        L_0x01e6:
            if (r1 == 0) goto L_0x01ef
            java.util.List r2 = r0.getText()
            r2.add(r1)
        L_0x01ef:
            r7.d0(r0)
            goto L_0x046f
        L_0x01f4:
            int r1 = r7.c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r28
            f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x046f
        L_0x0209:
            int r1 = r7.c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r28
            f0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.c0(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x046f
        L_0x0229:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.c()
            boolean r3 = kotlin.jvm.internal.p.e(r1, r3)
            if (r3 == 0) goto L_0x024d
            int r1 = r7.c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            java.util.Objects.requireNonNull(r0, r4)
            java.util.List r0 = (java.util.List) r0
            r7.e0(r1, r2, r3, r0)
            goto L_0x046f
        L_0x024d:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.e()
            boolean r3 = kotlin.jvm.internal.p.e(r1, r3)
            java.lang.String r6 = ""
            if (r3 == 0) goto L_0x02f5
            boolean r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(r14)
            if (r0 == 0) goto L_0x02df
            n1.j r0 = r12.b()
            p1.b r0 = r7.L(r0)
            if (r0 == 0) goto L_0x026a
            goto L_0x026b
        L_0x026a:
            r0 = r6
        L_0x026b:
            n1.j r1 = r14.s()
            p1.b r1 = r7.L(r1)
            if (r1 == 0) goto L_0x0276
            r6 = r1
        L_0x0276:
            int r1 = r0.length()
            int r2 = r6.length()
            int r3 = rp0.l.i(r1, r2)
            r4 = 0
        L_0x0283:
            if (r4 >= r3) goto L_0x0294
            char r13 = r0.charAt(r4)
            char r5 = r6.charAt(r4)
            if (r13 == r5) goto L_0x0290
            goto L_0x0294
        L_0x0290:
            int r4 = r4 + 1
            r13 = 1
            goto L_0x0283
        L_0x0294:
            r5 = 0
        L_0x0295:
            int r13 = r3 - r4
            if (r5 >= r13) goto L_0x02b2
            int r13 = r1 + -1
            int r13 = r13 - r5
            char r13 = r0.charAt(r13)
            int r20 = r2 + -1
            r21 = r3
            int r3 = r20 - r5
            char r3 = r6.charAt(r3)
            if (r13 == r3) goto L_0x02ad
            goto L_0x02b2
        L_0x02ad:
            int r5 = r5 + 1
            r3 = r21
            goto L_0x0295
        L_0x02b2:
            int r1 = r1 - r5
            int r1 = r1 - r4
            int r2 = r2 - r5
            int r2 = r2 - r4
            int r3 = r7.c0(r11)
            r5 = 16
            android.view.accessibility.AccessibilityEvent r3 = r7.C(r3, r5)
            r3.setFromIndex(r4)
            r3.setRemovedCount(r1)
            r3.setAddedCount(r2)
            r3.setBeforeText(r0)
            java.util.List r0 = r3.getText()
            r1 = 100000(0x186a0, float:1.4013E-40)
            java.lang.CharSequence r1 = r7.r0(r6, r1)
            r0.add(r1)
            r7.d0(r3)
            goto L_0x046f
        L_0x02df:
            int r1 = r7.c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            r0 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r28
            f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x046f
        L_0x02f5:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.y()
            boolean r3 = kotlin.jvm.internal.p.e(r1, r3)
            if (r3 == 0) goto L_0x0360
            n1.j r0 = r14.s()
            p1.b r0 = r7.L(r0)
            if (r0 == 0) goto L_0x0311
            java.lang.String r0 = r0.g()
            if (r0 != 0) goto L_0x0310
            goto L_0x0311
        L_0x0310:
            r6 = r0
        L_0x0311:
            n1.j r0 = r14.s()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.y()
            java.lang.Object r0 = r0.g(r1)
            p1.a0 r0 = (p1.a0) r0
            long r0 = r0.r()
            int r2 = r7.c0(r11)
            int r3 = p1.a0.n(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = p1.a0.i(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r0 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 100000(0x186a0, float:1.4013E-40)
            java.lang.CharSequence r0 = r7.r0(r6, r0)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            r0 = r28
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            android.view.accessibility.AccessibilityEvent r0 = r0.E(r1, r2, r3, r4, r5)
            r7.d0(r0)
            int r0 = r14.i()
            r7.h0(r0)
            goto L_0x046f
        L_0x0360:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.i()
            boolean r3 = kotlin.jvm.internal.p.e(r1, r3)
            if (r3 == 0) goto L_0x036c
            r6 = 1
            goto L_0x0374
        L_0x036c:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.A()
            boolean r6 = kotlin.jvm.internal.p.e(r1, r3)
        L_0x0374:
            if (r6 == 0) goto L_0x03ad
            androidx.compose.ui.node.LayoutNode r0 = r14.k()
            r7.Q(r0)
            java.util.List<androidx.compose.ui.platform.c1> r0 = r7.f7012y
            androidx.compose.ui.platform.c1 r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m(r0, r11)
            kotlin.jvm.internal.p.g(r0)
            n1.j r1 = r14.s()
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.i()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r3)
            n1.h r1 = (n1.h) r1
            r0.f(r1)
            n1.j r1 = r14.s()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.A()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r2)
            n1.h r1 = (n1.h) r1
            r0.i(r1)
            r7.i0(r0)
            goto L_0x046f
        L_0x03ad:
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.g()
            boolean r2 = kotlin.jvm.internal.p.e(r1, r2)
            if (r2 == 0) goto L_0x03f0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x03d7
            int r0 = r14.i()
            int r0 = r7.c0(r0)
            android.view.accessibility.AccessibilityEvent r0 = r7.C(r0, r4)
            r7.d0(r0)
        L_0x03d7:
            int r0 = r14.i()
            int r1 = r7.c0(r0)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r28
            f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x046f
        L_0x03f0:
            n1.i r2 = n1.i.f15789a
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.c()
            boolean r1 = kotlin.jvm.internal.p.e(r1, r3)
            if (r1 == 0) goto L_0x0472
            n1.j r0 = r14.s()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.c()
            java.lang.Object r0 = r0.g(r1)
            java.util.List r0 = (java.util.List) r0
            n1.j r1 = r12.b()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.c()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0462
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            int r3 = r0.size()
            r4 = 0
        L_0x0424:
            if (r4 >= r3) goto L_0x0436
            java.lang.Object r5 = r0.get(r4)
            n1.d r5 = (n1.d) r5
            java.lang.String r5 = r5.b()
            r2.add(r5)
            int r4 = r4 + 1
            goto L_0x0424
        L_0x0436:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r3 = r1.size()
            r4 = 0
        L_0x0440:
            if (r4 >= r3) goto L_0x0452
            java.lang.Object r5 = r1.get(r4)
            n1.d r5 = (n1.d) r5
            java.lang.String r5 = r5.b()
            r0.add(r5)
            int r4 = r4 + 1
            goto L_0x0440
        L_0x0452:
            boolean r1 = r2.containsAll(r0)
            if (r1 == 0) goto L_0x049e
            boolean r0 = r0.containsAll(r2)
            if (r0 != 0) goto L_0x045f
            goto L_0x049e
        L_0x045f:
            r17 = 0
            goto L_0x046f
        L_0x0462:
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x046f
            r6 = 1
            r17 = 1
            goto L_0x0060
        L_0x046f:
            r6 = 1
            goto L_0x0060
        L_0x0472:
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof n1.a
            if (r1 == 0) goto L_0x049e
            java.lang.Object r1 = r0.getValue()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            java.util.Objects.requireNonNull(r1, r2)
            n1.a r1 = (n1.a) r1
            n1.j r2 = r12.b()
            java.lang.Object r0 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = (androidx.compose.ui.semantics.SemanticsPropertyKey) r0
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r2, r0)
            boolean r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.j(r1, r0)
            r17 = 1
            r0 = r0 ^ 1
            r17 = r0
            goto L_0x046f
        L_0x049e:
            r17 = 1
            goto L_0x046f
        L_0x04a1:
            if (r17 != 0) goto L_0x04a7
            boolean r17 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.u(r14, r12)
        L_0x04a7:
            if (r17 == 0) goto L_0x001d
            int r1 = r7.c0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r28
            f0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x001d
        L_0x04be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.j0(java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[Catch:{ all -> 0x0051 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(fp0.c<? super bp0.k> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) r0
            int r1 = r0.f7021f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7021f = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f7019d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f7021f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r2 = r0.f7018c
            yp0.h r2 = (yp0.h) r2
            java.lang.Object r5 = r0.f7017b
            androidx.collection.b r5 = (androidx.collection.b) r5
            java.lang.Object r6 = r0.f7016a
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r6
            bp0.g.b(r11)     // Catch:{ all -> 0x0051 }
        L_0x0037:
            r11 = r5
            goto L_0x0063
        L_0x0039:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0041:
            java.lang.Object r2 = r0.f7018c
            yp0.h r2 = (yp0.h) r2
            java.lang.Object r5 = r0.f7017b
            androidx.collection.b r5 = (androidx.collection.b) r5
            java.lang.Object r6 = r0.f7016a
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r6
            bp0.g.b(r11)     // Catch:{ all -> 0x0051 }
            goto L_0x0075
        L_0x0051:
            r11 = move-exception
            goto L_0x00d0
        L_0x0054:
            bp0.g.b(r11)
            androidx.collection.b r11 = new androidx.collection.b     // Catch:{ all -> 0x00ce }
            r11.<init>()     // Catch:{ all -> 0x00ce }
            yp0.f<bp0.k> r2 = r10.f7006p     // Catch:{ all -> 0x00ce }
            yp0.h r2 = r2.iterator()     // Catch:{ all -> 0x00ce }
            r6 = r10
        L_0x0063:
            r0.f7016a = r6     // Catch:{ all -> 0x0051 }
            r0.f7017b = r11     // Catch:{ all -> 0x0051 }
            r0.f7018c = r2     // Catch:{ all -> 0x0051 }
            r0.f7021f = r4     // Catch:{ all -> 0x0051 }
            java.lang.Object r5 = r2.a(r0)     // Catch:{ all -> 0x0051 }
            if (r5 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r9 = r5
            r5 = r11
            r11 = r9
        L_0x0075:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0051 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0051 }
            if (r11 == 0) goto L_0x00c6
            r2.next()     // Catch:{ all -> 0x0051 }
            boolean r11 = r6.N()     // Catch:{ all -> 0x0051 }
            if (r11 == 0) goto L_0x00b0
            r11 = 0
            androidx.collection.b<androidx.compose.ui.node.LayoutNode> r7 = r6.f7005o     // Catch:{ all -> 0x0051 }
            int r7 = r7.size()     // Catch:{ all -> 0x0051 }
        L_0x008d:
            if (r11 >= r7) goto L_0x00a0
            androidx.collection.b<androidx.compose.ui.node.LayoutNode> r8 = r6.f7005o     // Catch:{ all -> 0x0051 }
            java.lang.Object r8 = r8.k(r11)     // Catch:{ all -> 0x0051 }
            kotlin.jvm.internal.p.g(r8)     // Catch:{ all -> 0x0051 }
            androidx.compose.ui.node.LayoutNode r8 = (androidx.compose.ui.node.LayoutNode) r8     // Catch:{ all -> 0x0051 }
            r6.l0(r8, r5)     // Catch:{ all -> 0x0051 }
            int r11 = r11 + 1
            goto L_0x008d
        L_0x00a0:
            r5.clear()     // Catch:{ all -> 0x0051 }
            boolean r11 = r6.f7010w     // Catch:{ all -> 0x0051 }
            if (r11 != 0) goto L_0x00b0
            r6.f7010w = r4     // Catch:{ all -> 0x0051 }
            android.os.Handler r11 = r6.f7001h     // Catch:{ all -> 0x0051 }
            java.lang.Runnable r7 = r6.f7011x     // Catch:{ all -> 0x0051 }
            r11.post(r7)     // Catch:{ all -> 0x0051 }
        L_0x00b0:
            androidx.collection.b<androidx.compose.ui.node.LayoutNode> r11 = r6.f7005o     // Catch:{ all -> 0x0051 }
            r11.clear()     // Catch:{ all -> 0x0051 }
            r7 = 100
            r0.f7016a = r6     // Catch:{ all -> 0x0051 }
            r0.f7017b = r5     // Catch:{ all -> 0x0051 }
            r0.f7018c = r2     // Catch:{ all -> 0x0051 }
            r0.f7021f = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r11 = wp0.q0.a(r7, r0)     // Catch:{ all -> 0x0051 }
            if (r11 != r1) goto L_0x0037
            return r1
        L_0x00c6:
            androidx.collection.b<androidx.compose.ui.node.LayoutNode> r11 = r6.f7005o
            r11.clear()
            bp0.k r11 = bp0.k.f22762a
            return r11
        L_0x00ce:
            r11 = move-exception
            r6 = r10
        L_0x00d0:
            androidx.collection.b<androidx.compose.ui.node.LayoutNode> r0 = r6.f7005o
            r0.clear()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.x(fp0.c):java.lang.Object");
    }

    public final boolean y(boolean z11, int i11, long j11) {
        return z(I().values(), z11, i11, j11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean z(java.util.Collection<androidx.compose.ui.platform.d1> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            java.lang.String r0 = "currentSemanticsNodes"
            kotlin.jvm.internal.p.j(r6, r0)
            t0.f$a r0 = t0.f.f16662b
            long r0 = r0.b()
            boolean r0 = t0.f.j(r9, r0)
            r1 = 0
            if (r0 != 0) goto L_0x00b8
            boolean r0 = t0.f.p(r9)
            if (r0 != 0) goto L_0x001a
            goto L_0x00b8
        L_0x001a:
            r0 = 1
            if (r7 != r0) goto L_0x0024
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.ui.semantics.SemanticsProperties.f7428a
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.A()
            goto L_0x002c
        L_0x0024:
            if (r7 != 0) goto L_0x00b2
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.ui.semantics.SemanticsProperties.f7428a
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.i()
        L_0x002c:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0034
            goto L_0x00b1
        L_0x0034:
            java.util.Iterator r6 = r6.iterator()
        L_0x0038:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r6.next()
            androidx.compose.ui.platform.d1 r2 = (androidx.compose.ui.platform.d1) r2
            android.graphics.Rect r3 = r2.a()
            t0.h r3 = u0.b1.c(r3)
            boolean r3 = r3.b(r9)
            if (r3 != 0) goto L_0x0054
        L_0x0052:
            r2 = 0
            goto L_0x00ae
        L_0x0054:
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.b()
            n1.j r2 = r2.h()
            java.lang.Object r2 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r2, r7)
            n1.h r2 = (n1.h) r2
            if (r2 != 0) goto L_0x0065
            goto L_0x0052
        L_0x0065:
            boolean r3 = r2.b()
            if (r3 == 0) goto L_0x006d
            int r3 = -r8
            goto L_0x006e
        L_0x006d:
            r3 = r8
        L_0x006e:
            if (r8 != 0) goto L_0x0077
            boolean r4 = r2.b()
            if (r4 == 0) goto L_0x0077
            r3 = -1
        L_0x0077:
            if (r3 >= 0) goto L_0x008d
            lp0.a r2 = r2.c()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0052
            goto L_0x00ad
        L_0x008d:
            lp0.a r3 = r2.c()
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            lp0.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0052
        L_0x00ad:
            r2 = 1
        L_0x00ae:
            if (r2 == 0) goto L_0x0038
            r1 = 1
        L_0x00b1:
            return r1
        L_0x00b2:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.z(java.util.Collection, boolean, int, long):boolean");
    }
}
