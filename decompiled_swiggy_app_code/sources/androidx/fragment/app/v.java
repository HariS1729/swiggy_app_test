package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.a0;
import androidx.core.view.d0;
import androidx.core.view.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* compiled from: FragmentTransitionImpl */
public abstract class v {

    /* compiled from: FragmentTransitionImpl */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f10594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f10595b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f10596c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f10597d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f10598e;

        a(int i11, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f10594a = i11;
            this.f10595b = arrayList;
            this.f10596c = arrayList2;
            this.f10597d = arrayList3;
            this.f10598e = arrayList4;
        }

        public void run() {
            for (int i11 = 0; i11 < this.f10594a; i11++) {
                a0.P0((View) this.f10595b.get(i11), (String) this.f10596c.get(i11));
                a0.P0((View) this.f10597d.get(i11), (String) this.f10598e.get(i11));
            }
        }
    }

    /* compiled from: FragmentTransitionImpl */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10600a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f10601b;

        b(ArrayList arrayList, Map map) {
            this.f10600a = arrayList;
            this.f10601b = map;
        }

        public void run() {
            int size = this.f10600a.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) this.f10600a.get(i11);
                String O = a0.O(view);
                if (O != null) {
                    a0.P0(view, v.i(this.f10601b, O));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionImpl */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10603a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f10604b;

        c(ArrayList arrayList, Map map) {
            this.f10603a = arrayList;
            this.f10604b = map;
        }

        public void run() {
            int size = this.f10603a.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) this.f10603a.get(i11);
                a0.P0(view, (String) this.f10604b.get(a0.O(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (!h(list, view, size)) {
            if (a0.O(view) != null) {
                list.add(view);
            }
            for (int i11 = size; i11 < list.size(); i11++) {
                View view2 = list.get(i11);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = viewGroup.getChildAt(i12);
                        if (!h(list, childAt, size) && a0.O(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (list.get(i12) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    /* access modifiers changed from: package-private */
    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (d0.a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                f(arrayList, viewGroup.getChildAt(i11));
            }
            return;
        }
        arrayList.add(view);
    }

    public abstract Object g(Object obj);

    /* access modifiers changed from: package-private */
    public void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String O = a0.O(view);
            if (O != null) {
                map.put(O, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    j(map, viewGroup.getChildAt(i11));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void k(View view, Rect rect) {
        if (a0.Z(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = arrayList.get(i11);
            arrayList2.add(a0.O(view));
            a0.P0(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        w.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(Fragment fragment, Object obj, androidx.core.os.c cVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    public void x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        w.a(view, new b(arrayList, map));
    }

    /* access modifiers changed from: package-private */
    public void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = arrayList.get(i11);
            String O = a0.O(view2);
            arrayList4.add(O);
            if (O != null) {
                a0.P0(view2, (String) null);
                String str = map.get(O);
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i12))) {
                        a0.P0(arrayList2.get(i12), O);
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        w.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);
}
