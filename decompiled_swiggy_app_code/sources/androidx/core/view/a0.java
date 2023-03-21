package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R;
import androidx.core.view.a;
import androidx.core.view.accessibility.c;
import androidx.core.view.m0;
import androidx.core.view.n0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* compiled from: ViewCompat */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f9428a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private static WeakHashMap<View, h0> f9429b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Field f9430c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f9431d = false;

    /* renamed from: e  reason: collision with root package name */
    private static ThreadLocal<Rect> f9432e;

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f9433f = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: g  reason: collision with root package name */
    private static final v f9434g = z.f9606a;

    /* renamed from: h  reason: collision with root package name */
    private static final e f9435h = new e();

    /* compiled from: ViewCompat */
    class a extends f<Boolean> {
        a(int i11, Class cls, int i12) {
            super(i11, cls, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(q.d(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            q.i(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat */
    class b extends f<CharSequence> {
        b(int i11, Class cls, int i12, int i13) {
            super(i11, cls, i12, i13);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence d(View view) {
            return q.b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            q.h(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat */
    class c extends f<CharSequence> {
        c(int i11, Class cls, int i12, int i13) {
            super(i11, cls, i12, i13);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence d(View view) {
            return s.a(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            s.b(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat */
    class d extends f<Boolean> {
        d(int i11, Class cls, int i12) {
            super(i11, cls, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(q.c(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            q.g(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f9436a = new WeakHashMap<>();

        e() {
        }

        private void a(View view, boolean z11) {
            boolean z12 = view.isShown() && view.getWindowVisibility() == 0;
            if (z11 != z12) {
                a0.f0(view, z12 ? 16 : 32);
                this.f9436a.put(view, Boolean.valueOf(z12));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f9436a.entrySet()) {
                    a((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewCompat */
    static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f9437a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f9438b;

        /* renamed from: c  reason: collision with root package name */
        private final int f9439c;

        /* renamed from: d  reason: collision with root package name */
        private final int f9440d;

        f(int i11, Class<T> cls, int i12) {
            this(i11, cls, 0, i12);
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f9439c;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Boolean bool, Boolean bool2) {
            if ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue())) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract T d(View view);

        /* access modifiers changed from: package-private */
        public abstract void e(View view, T t);

        /* access modifiers changed from: package-private */
        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T tag = view.getTag(this.f9437a);
            if (this.f9438b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void g(View view, T t) {
            if (c()) {
                e(view, t);
            } else if (b() && h(f(view), t)) {
                a0.l(view);
                view.setTag(this.f9437a, t);
                a0.f0(view, this.f9440d);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract boolean h(T t, T t11);

        f(int i11, Class<T> cls, int i12, int i13) {
            this.f9437a = i11;
            this.f9438b = cls;
            this.f9440d = i12;
            this.f9439c = i13;
        }
    }

    /* compiled from: ViewCompat */
    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: ViewCompat */
    static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i11, Bundle bundle) {
            return view.performAccessibilityAction(i11, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i11, int i12, int i13, int i14) {
            view.postInvalidateOnAnimation(i11, i12, i13, i14);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z11) {
            view.setHasTransientState(z11);
        }

        static void s(View view, int i11) {
            view.setImportantForAccessibility(i11);
        }
    }

    /* compiled from: ViewCompat */
    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i11) {
            view.setLabelFor(i11);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i11) {
            view.setLayoutDirection(i11);
        }

        static void k(View view, int i11, int i12, int i13, int i14) {
            view.setPaddingRelative(i11, i12, i13, i14);
        }
    }

    /* compiled from: ViewCompat */
    static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* compiled from: ViewCompat */
    static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i11) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i11);
        }

        static void f(View view, int i11) {
            view.setAccessibilityLiveRegion(i11);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i11) {
            accessibilityEvent.setContentChangeTypes(i11);
        }
    }

    /* compiled from: ViewCompat */
    static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat */
    private static class m {

        /* compiled from: ViewCompat */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            n0 f9441a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f9442b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ t f9443c;

            a(View view, t tVar) {
                this.f9442b = view;
                this.f9443c = tVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                n0 D = n0.D(windowInsets, view);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 30) {
                    m.a(windowInsets, this.f9442b);
                    if (D.equals(this.f9441a)) {
                        return this.f9443c.a(view, D).B();
                    }
                }
                this.f9441a = D;
                n0 a11 = this.f9443c.a(view, D);
                if (i11 >= 30) {
                    return a11.B();
                }
                a0.t0(view);
                return a11.B();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static n0 b(View view, n0 n0Var, Rect rect) {
            WindowInsets B = n0Var.B();
            if (B != null) {
                return n0.D(view.computeSystemWindowInsets(B, rect), view);
            }
            rect.setEmpty();
            return n0Var;
        }

        static boolean c(View view, float f11, float f12, boolean z11) {
            return view.dispatchNestedFling(f11, f12, z11);
        }

        static boolean d(View view, float f11, float f12) {
            return view.dispatchNestedPreFling(f11, f12);
        }

        static boolean e(View view, int i11, int i12, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i11, i12, iArr, iArr2);
        }

        static boolean f(View view, int i11, int i12, int i13, int i14, int[] iArr) {
            return view.dispatchNestedScroll(i11, i12, i13, i14, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static n0 j(View view) {
            return n0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f11) {
            view.setElevation(f11);
        }

        static void t(View view, boolean z11) {
            view.setNestedScrollingEnabled(z11);
        }

        static void u(View view, t tVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, tVar);
            }
            if (tVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, tVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f11) {
            view.setTranslationZ(f11);
        }

        static void x(View view, float f11) {
            view.setZ(f11);
        }

        static boolean y(View view, int i11) {
            return view.startNestedScroll(i11);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat */
    private static class n {
        public static n0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            n0 C = n0.C(rootWindowInsets);
            C.z(C);
            C.d(view.getRootView());
            return C;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i11) {
            view.setScrollIndicators(i11);
        }

        static void d(View view, int i11, int i12) {
            view.setScrollIndicators(i11, i12);
        }
    }

    /* compiled from: ViewCompat */
    static class o {
        static void a(View view) {
            view.cancelDragAndDrop();
        }

        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i11) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i11);
        }

        static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat */
    static class p {
        static void a(View view, Collection<View> collection, int i11) {
            view.addKeyboardNavigationClusters(collection, i11);
        }

        static int b(View view) {
            return view.getImportantForAutofill();
        }

        static int c(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View h(View view, View view2, int i11) {
            return view.keyboardNavigationClusterSearch(view2, i11);
        }

        static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void k(View view, boolean z11) {
            view.setFocusedByDefault(z11);
        }

        static void l(View view, int i11) {
            view.setImportantForAutofill(i11);
        }

        static void m(View view, boolean z11) {
            view.setKeyboardNavigationCluster(z11);
        }

        static void n(View view, int i11) {
            view.setNextClusterForwardId(i11);
        }

        static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat */
    static class q {
        static void a(View view, v vVar) {
            int i11 = R.id.tag_unhandled_key_listeners;
            androidx.collection.g gVar = (androidx.collection.g) view.getTag(i11);
            if (gVar == null) {
                gVar = new androidx.collection.g();
                view.setTag(i11, gVar);
            }
            Objects.requireNonNull(vVar);
            b0 b0Var = new b0(vVar);
            gVar.put(vVar, b0Var);
            view.addOnUnhandledKeyEventListener(b0Var);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, v vVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.g gVar = (androidx.collection.g) view.getTag(R.id.tag_unhandled_key_listeners);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(vVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        static <T> T f(View view, int i11) {
            return view.requireViewById(i11);
        }

        static void g(View view, boolean z11) {
            view.setAccessibilityHeading(z11);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z11) {
            view.setScreenReaderFocusable(z11);
        }
    }

    /* compiled from: ViewCompat */
    private static class r {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i11, int i12) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i11, i12);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat */
    private static class s {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat */
    private static final class t {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static c b(View view, c cVar) {
            ContentInfo f11 = cVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f11);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == f11) {
                return cVar;
            }
            return c.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, u uVar) {
            if (uVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new u(uVar));
            }
        }
    }

    /* compiled from: ViewCompat */
    private static final class u implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        private final u f9444a;

        u(u uVar) {
            this.f9444a = uVar;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            c g11 = c.g(contentInfo);
            c a11 = this.f9444a.a(view, g11);
            if (a11 == null) {
                return null;
            }
            if (a11 == g11) {
                return contentInfo;
            }
            return a11.f();
        }
    }

    /* compiled from: ViewCompat */
    public interface v {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* compiled from: ViewCompat */
    static class w {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f9445d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f9446a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f9447b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f9448c = null;

        w() {
        }

        static w a(View view) {
            int i11 = R.id.tag_unhandled_key_event_manager;
            w wVar = (w) view.getTag(i11);
            if (wVar != null) {
                return wVar;
            }
            w wVar2 = new w();
            view.setTag(i11, wVar2);
            return wVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f9446a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c11 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c11 != null) {
                            return c11;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f9447b == null) {
                this.f9447b = new SparseArray<>();
            }
            return this.f9447b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((v) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f9446a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f9445d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f9446a == null) {
                        this.f9446a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f9445d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f9446a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f9446a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c11 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c11 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c11));
                }
            }
            return c11 != null;
        }

        /* access modifiers changed from: package-private */
        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f9448c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f9448c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d11 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d11.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d11.valueAt(indexOfKey);
                d11.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d11.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && a0.Z(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    private static Rect A() {
        if (f9432e == null) {
            f9432e = new ThreadLocal<>();
        }
        Rect rect = f9432e.get();
        if (rect == null) {
            rect = new Rect();
            f9432e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void A0(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    private static v B(View view) {
        if (view instanceof v) {
            return (v) view;
        }
        return f9434g;
    }

    public static void B0(View view, ColorStateList colorStateList) {
        int i11 = Build.VERSION.SDK_INT;
        m.q(view, colorStateList);
        if (i11 == 21) {
            Drawable background = view.getBackground();
            boolean z11 = (m.g(view) == null && m.h(view) == null) ? false : true;
            if (background != null && z11) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        }
    }

    public static boolean C(View view) {
        return h.b(view);
    }

    public static void C0(View view, PorterDuff.Mode mode) {
        int i11 = Build.VERSION.SDK_INT;
        m.r(view, mode);
        if (i11 == 21) {
            Drawable background = view.getBackground();
            boolean z11 = (m.g(view) == null && m.h(view) == null) ? false : true;
            if (background != null && z11) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        }
    }

    public static int D(View view) {
        return h.c(view);
    }

    public static void D0(View view, Rect rect) {
        j.c(view, rect);
    }

    @SuppressLint({"InlinedApi"})
    public static int E(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.b(view);
        }
        return 0;
    }

    public static void E0(View view, float f11) {
        m.s(view, f11);
    }

    public static int F(View view) {
        return i.d(view);
    }

    @Deprecated
    public static void F0(View view, boolean z11) {
        view.setFitsSystemWindows(z11);
    }

    public static int G(View view) {
        return h.d(view);
    }

    public static void G0(View view, boolean z11) {
        h.r(view, z11);
    }

    public static int H(View view) {
        return h.e(view);
    }

    public static void H0(View view, int i11) {
        h.s(view, i11);
    }

    public static String[] I(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void I0(View view, int i11) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.l(view, i11);
        }
    }

    public static int J(View view) {
        return i.e(view);
    }

    public static void J0(View view, boolean z11) {
        m.t(view, z11);
    }

    public static int K(View view) {
        return i.f(view);
    }

    public static void K0(View view, t tVar) {
        m.u(view, tVar);
    }

    public static ViewParent L(View view) {
        return h.f(view);
    }

    public static void L0(View view, int i11, int i12, int i13, int i14) {
        i.k(view, i11, i12, i13, i14);
    }

    public static n0 M(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return n.a(view);
        }
        return m.j(view);
    }

    public static void M0(View view, x xVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.d(view, (PointerIcon) (xVar != null ? xVar.a() : null));
        }
    }

    public static CharSequence N(View view) {
        return W0().f(view);
    }

    public static void N0(View view, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i11, i12);
        }
    }

    public static String O(View view) {
        return m.k(view);
    }

    public static void O0(View view, CharSequence charSequence) {
        W0().g(view, charSequence);
    }

    @Deprecated
    public static float P(View view) {
        return view.getTranslationX();
    }

    public static void P0(View view, String str) {
        m.v(view, str);
    }

    @Deprecated
    public static float Q(View view) {
        return view.getTranslationY();
    }

    @Deprecated
    public static void Q0(View view, float f11) {
        view.setTranslationX(f11);
    }

    public static float R(View view) {
        return m.l(view);
    }

    @Deprecated
    public static void R0(View view, float f11) {
        view.setTranslationY(f11);
    }

    @Deprecated
    public static int S(View view) {
        return h.g(view);
    }

    public static void S0(View view, float f11) {
        m.w(view, f11);
    }

    public static float T(View view) {
        return m.m(view);
    }

    private static void T0(View view) {
        if (D(view) == 0) {
            H0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (D((View) parent) == 4) {
                H0(view, 2);
                return;
            }
        }
    }

    public static boolean U(View view) {
        return o(view) != null;
    }

    public static void U0(View view, m0.b bVar) {
        m0.d(view, bVar);
    }

    public static boolean V(View view) {
        return g.a(view);
    }

    public static void V0(View view, float f11) {
        m.x(view, f11);
    }

    public static boolean W(View view) {
        return h.h(view);
    }

    private static f<CharSequence> W0() {
        return new c(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    public static boolean X(View view) {
        return h.i(view);
    }

    public static void X0(View view) {
        m.z(view);
    }

    public static boolean Y(View view) {
        Boolean f11 = b().f(view);
        return f11 != null && f11.booleanValue();
    }

    private static void Y0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static boolean Z(View view) {
        return k.b(view);
    }

    public static boolean a0(View view) {
        return k.c(view);
    }

    private static f<Boolean> b() {
        return new d(R.id.tag_accessibility_heading, Boolean.class, 28);
    }

    public static boolean b0(View view) {
        return m.p(view);
    }

    public static int c(View view, CharSequence charSequence, androidx.core.view.accessibility.f fVar) {
        int u11 = u(view, charSequence);
        if (u11 != -1) {
            d(view, new c.a(u11, charSequence, fVar));
        }
        return u11;
    }

    public static boolean c0(View view) {
        return i.g(view);
    }

    private static void d(View view, c.a aVar) {
        l(view);
        r0(aVar.b(), view);
        s(view).add(aVar);
        f0(view, 0);
    }

    public static boolean d0(View view) {
        Boolean f11 = v0().f(view);
        return f11 != null && f11.booleanValue();
    }

    public static h0 e(View view) {
        if (f9429b == null) {
            f9429b = new WeakHashMap<>();
        }
        h0 h0Var = f9429b.get(view);
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(view);
        f9429b.put(view, h0Var2);
        return h0Var2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ c e0(c cVar) {
        return cVar;
    }

    private static void f(View view, int i11) {
        view.offsetLeftAndRight(i11);
        if (view.getVisibility() == 0) {
            Y0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                Y0((View) parent);
            }
        }
    }

    static void f0(View view, int i11) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z11 = r(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i12 = 32;
            if (q(view) != 0 || z11) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z11) {
                    i12 = 2048;
                }
                obtain.setEventType(i12);
                k.g(obtain, i11);
                if (z11) {
                    obtain.getText().add(r(view));
                    T0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i11 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i11);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(r(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i11);
                } catch (AbstractMethodError e11) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e11);
                }
            }
        }
    }

    private static void g(View view, int i11) {
        view.offsetTopAndBottom(i11);
        if (view.getVisibility() == 0) {
            Y0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                Y0((View) parent);
            }
        }
    }

    public static void g0(View view, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i11);
            return;
        }
        Rect A = A();
        boolean z11 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            A.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z11 = !A.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        f(view, i11);
        if (z11 && A.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(A);
        }
    }

    public static n0 h(View view, n0 n0Var, Rect rect) {
        return m.b(view, n0Var, rect);
    }

    public static void h0(View view, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i11);
            return;
        }
        Rect A = A();
        boolean z11 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            A.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z11 = !A.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        g(view, i11);
        if (z11 && A.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(A);
        }
    }

    public static n0 i(View view, n0 n0Var) {
        WindowInsets B = n0Var.B();
        if (B != null) {
            WindowInsets a11 = l.a(view, B);
            if (!a11.equals(B)) {
                return n0.D(a11, view);
            }
        }
        return n0Var;
    }

    public static n0 i0(View view, n0 n0Var) {
        WindowInsets B = n0Var.B();
        if (B != null) {
            WindowInsets b11 = l.b(view, B);
            if (!b11.equals(B)) {
                return n0.D(b11, view);
            }
        }
        return n0Var;
    }

    static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).b(view, keyEvent);
    }

    public static void j0(View view, androidx.core.view.accessibility.c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.N0());
    }

    static boolean k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).f(keyEvent);
    }

    private static f<CharSequence> k0() {
        return new b(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    static void l(View view) {
        a n11 = n(view);
        if (n11 == null) {
            n11 = new a();
        }
        w0(view, n11);
    }

    public static boolean l0(View view, int i11, Bundle bundle) {
        return h.j(view, i11, bundle);
    }

    public static int m() {
        return i.a();
    }

    public static c m0(View view, c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.b(view, cVar);
        }
        u uVar = (u) view.getTag(R.id.tag_on_receive_content_listener);
        if (uVar == null) {
            return B(view).a(cVar);
        }
        c a11 = uVar.a(view, cVar);
        if (a11 == null) {
            return null;
        }
        return B(view).a(a11);
    }

    public static a n(View view) {
        View.AccessibilityDelegate o11 = o(view);
        if (o11 == null) {
            return null;
        }
        if (o11 instanceof a.C0046a) {
            return ((a.C0046a) o11).f9427a;
        }
        return new a(o11);
    }

    public static void n0(View view) {
        h.k(view);
    }

    private static View.AccessibilityDelegate o(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r.a(view);
        }
        return p(view);
    }

    public static void o0(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    private static View.AccessibilityDelegate p(View view) {
        if (f9431d) {
            return null;
        }
        if (f9430c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f9430c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f9431d = true;
                return null;
            }
        }
        try {
            Object obj = f9430c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f9431d = true;
            return null;
        }
    }

    @SuppressLint({"LambdaLast"})
    public static void p0(View view, Runnable runnable, long j11) {
        h.n(view, runnable, j11);
    }

    public static int q(View view) {
        return k.a(view);
    }

    public static void q0(View view, int i11) {
        r0(i11, view);
        f0(view, 0);
    }

    public static CharSequence r(View view) {
        return k0().f(view);
    }

    private static void r0(int i11, View view) {
        List<c.a> s11 = s(view);
        for (int i12 = 0; i12 < s11.size(); i12++) {
            if (s11.get(i12).b() == i11) {
                s11.remove(i12);
                return;
            }
        }
    }

    private static List<c.a> s(View view) {
        int i11 = R.id.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i11);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i11, arrayList2);
        return arrayList2;
    }

    public static void s0(View view, c.a aVar, CharSequence charSequence, androidx.core.view.accessibility.f fVar) {
        if (fVar == null && charSequence == null) {
            q0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, fVar));
        }
    }

    @Deprecated
    public static float t(View view) {
        return view.getAlpha();
    }

    public static void t0(View view) {
        l.c(view);
    }

    private static int u(View view, CharSequence charSequence) {
        List<c.a> s11 = s(view);
        for (int i11 = 0; i11 < s11.size(); i11++) {
            if (TextUtils.equals(charSequence, s11.get(i11).c())) {
                return s11.get(i11).b();
            }
        }
        int i12 = 0;
        int i13 = -1;
        while (true) {
            int[] iArr = f9433f;
            if (i12 >= iArr.length || i13 != -1) {
                return i13;
            }
            int i14 = iArr[i12];
            boolean z11 = true;
            for (int i15 = 0; i15 < s11.size(); i15++) {
                z11 &= s11.get(i15).b() != i14;
            }
            if (z11) {
                i13 = i14;
            }
            i12++;
        }
        return i13;
    }

    public static void u0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.c(view, context, iArr, attributeSet, typedArray, i11, i12);
        }
    }

    public static ColorStateList v(View view) {
        return m.g(view);
    }

    private static f<Boolean> v0() {
        return new a(R.id.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static PorterDuff.Mode w(View view) {
        return m.h(view);
    }

    public static void w0(View view, a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (o(view) instanceof a.C0046a)) {
            aVar = new a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.d();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static Rect x(View view) {
        return j.a(view);
    }

    public static void x0(View view, boolean z11) {
        b().g(view, Boolean.valueOf(z11));
    }

    public static Display y(View view) {
        return i.b(view);
    }

    public static void y0(View view, int i11) {
        k.f(view, i11);
    }

    public static float z(View view) {
        return m.i(view);
    }

    @Deprecated
    public static void z0(View view, float f11) {
        view.setAlpha(f11);
    }
}
