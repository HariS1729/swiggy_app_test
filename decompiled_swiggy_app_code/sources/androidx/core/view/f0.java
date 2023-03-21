package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* compiled from: ViewParentCompat */
public final class f0 {

    /* compiled from: ViewParentCompat */
    static class a {
        static boolean a(ViewParent viewParent, View view, float f11, float f12, boolean z11) {
            return viewParent.onNestedFling(view, f11, f12, z11);
        }

        static boolean b(ViewParent viewParent, View view, float f11, float f12) {
            return viewParent.onNestedPreFling(view, f11, f12);
        }

        static void c(ViewParent viewParent, View view, int i11, int i12, int[] iArr) {
            viewParent.onNestedPreScroll(view, i11, i12, iArr);
        }

        static void d(ViewParent viewParent, View view, int i11, int i12, int i13, int i14) {
            viewParent.onNestedScroll(view, i11, i12, i13, i14);
        }

        static void e(ViewParent viewParent, View view, View view2, int i11) {
            viewParent.onNestedScrollAccepted(view, view2, i11);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int i11) {
            return viewParent.onStartNestedScroll(view, view2, i11);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f11, float f12, boolean z11) {
        try {
            return a.a(viewParent, view, f11, f12, z11);
        } catch (AbstractMethodError e11) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e11);
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f11, float f12) {
        try {
            return a.b(viewParent, view, f11, f12);
        } catch (AbstractMethodError e11) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e11);
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i11, int i12, int[] iArr, int i13) {
        if (viewParent instanceof q) {
            ((q) viewParent).l(view, i11, i12, iArr, i13);
        } else if (i13 == 0) {
            try {
                a.c(viewParent, view, i11, i12, iArr);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e11);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof r) {
            ((r) viewParent2).n(view, i11, i12, i13, i14, i15, iArr);
            return;
        }
        iArr[0] = iArr[0] + i13;
        iArr[1] = iArr[1] + i14;
        if (viewParent2 instanceof q) {
            ((q) viewParent2).j(view, i11, i12, i13, i14, i15);
        } else if (i15 == 0) {
            try {
                a.d(viewParent, view, i11, i12, i13, i14);
            } catch (AbstractMethodError e11) {
                AbstractMethodError abstractMethodError = e11;
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", abstractMethodError);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i11, int i12) {
        if (viewParent instanceof q) {
            ((q) viewParent).h(view, view2, i11, i12);
        } else if (i12 == 0) {
            try {
                a.e(viewParent, view, view2, i11);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e11);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i11, int i12) {
        if (viewParent instanceof q) {
            return ((q) viewParent).o(view, view2, i11, i12);
        }
        if (i12 != 0) {
            return false;
        }
        try {
            return a.f(viewParent, view, view2, i11);
        } catch (AbstractMethodError e11) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e11);
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i11) {
        if (viewParent instanceof q) {
            ((q) viewParent).i(view, i11);
        } else if (i11 == 0) {
            try {
                a.g(viewParent, view);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e11);
            }
        }
    }
}
