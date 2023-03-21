package androidx.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: DataBindingUtil */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static e f9723a = new DataBinderMapperImpl();

    /* renamed from: b  reason: collision with root package name */
    private static f f9724b = null;

    public static <T extends ViewDataBinding> T a(View view) {
        return b(view, f9724b);
    }

    public static <T extends ViewDataBinding> T b(View view, f fVar) {
        T g11 = g(view);
        if (g11 != null) {
            return g11;
        }
        Object tag = view.getTag();
        if (tag instanceof String) {
            int layoutId = f9723a.getLayoutId((String) tag);
            if (layoutId != 0) {
                return f9723a.getDataBinder(fVar, view, layoutId);
            }
            throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
        }
        throw new IllegalArgumentException("View is not a binding layout");
    }

    static <T extends ViewDataBinding> T c(f fVar, View view, int i11) {
        return f9723a.getDataBinder(fVar, view, i11);
    }

    static <T extends ViewDataBinding> T d(f fVar, View[] viewArr, int i11) {
        return f9723a.getDataBinder(fVar, viewArr, i11);
    }

    private static <T extends ViewDataBinding> T e(f fVar, ViewGroup viewGroup, int i11, int i12) {
        int childCount = viewGroup.getChildCount();
        int i13 = childCount - i11;
        if (i13 == 1) {
            return c(fVar, viewGroup.getChildAt(childCount - 1), i12);
        }
        View[] viewArr = new View[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            viewArr[i14] = viewGroup.getChildAt(i14 + i11);
        }
        return d(fVar, viewArr, i12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r3 == -1) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r1.indexOf(47, r3 + 1) == -1) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends androidx.databinding.ViewDataBinding> T f(android.view.View r9) {
        /*
        L_0x0000:
            r0 = 0
            if (r9 == 0) goto L_0x005a
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.C(r9)
            if (r1 == 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.Object r1 = r9.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x004d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "layout"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = "_0"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L_0x004d
            r2 = 6
            char r2 = r1.charAt(r2)
            r3 = 7
            r4 = 47
            int r3 = r1.indexOf(r4, r3)
            r5 = 1
            r6 = -1
            r7 = 0
            if (r2 != r4) goto L_0x003b
            if (r3 != r6) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            r7 = r5
            goto L_0x004a
        L_0x003b:
            r8 = 45
            if (r2 != r8) goto L_0x004a
            if (r3 == r6) goto L_0x004a
            int r3 = r3 + 1
            int r1 = r1.indexOf(r4, r3)
            if (r1 != r6) goto L_0x0038
            goto L_0x0039
        L_0x004a:
            if (r7 == 0) goto L_0x004d
            return r0
        L_0x004d:
            android.view.ViewParent r9 = r9.getParent()
            boolean r1 = r9 instanceof android.view.View
            if (r1 == 0) goto L_0x0058
            android.view.View r9 = (android.view.View) r9
            goto L_0x0000
        L_0x0058:
            r9 = r0
            goto L_0x0000
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.g.f(android.view.View):androidx.databinding.ViewDataBinding");
    }

    public static <T extends ViewDataBinding> T g(View view) {
        return ViewDataBinding.C(view);
    }

    public static f h() {
        return f9724b;
    }

    public static <T extends ViewDataBinding> T i(LayoutInflater layoutInflater, int i11, ViewGroup viewGroup, boolean z11) {
        return j(layoutInflater, i11, viewGroup, z11, f9724b);
    }

    public static <T extends ViewDataBinding> T j(LayoutInflater layoutInflater, int i11, ViewGroup viewGroup, boolean z11, f fVar) {
        int i12 = 0;
        boolean z12 = viewGroup != null && z11;
        if (z12) {
            i12 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i11, viewGroup, z11);
        if (z12) {
            return e(fVar, viewGroup, i12, i11);
        }
        return c(fVar, inflate, i11);
    }

    public static <T extends ViewDataBinding> T k(Activity activity, int i11) {
        return l(activity, i11, f9724b);
    }

    public static <T extends ViewDataBinding> T l(Activity activity, int i11, f fVar) {
        activity.setContentView(i11);
        return e(fVar, (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290), 0, i11);
    }
}
