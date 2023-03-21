package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a0;
import androidx.core.view.w;
import androidx.transition.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: FragmentTransition */
class t {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f10537a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    static final v f10538b = new u();

    /* renamed from: c  reason: collision with root package name */
    static final v f10539c = w();

    /* compiled from: FragmentTransition */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f10540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f10541b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.c f10542c;

        a(g gVar, Fragment fragment, androidx.core.os.c cVar) {
            this.f10540a = gVar;
            this.f10541b = fragment;
            this.f10542c = cVar;
        }

        public void run() {
            this.f10540a.a(this.f10541b, this.f10542c);
        }
    }

    /* compiled from: FragmentTransition */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10543a;

        b(ArrayList arrayList) {
            this.f10543a = arrayList;
        }

        public void run() {
            t.A(this.f10543a, 4);
        }
    }

    /* compiled from: FragmentTransition */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f10544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f10545b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.c f10546c;

        c(g gVar, Fragment fragment, androidx.core.os.c cVar) {
            this.f10544a = gVar;
            this.f10545b = fragment;
            this.f10546c = cVar;
        }

        public void run() {
            this.f10544a.a(this.f10545b, this.f10546c);
        }
    }

    /* compiled from: FragmentTransition */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f10547a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f10548b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f10549c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Fragment f10550d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f10551e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f10552f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f10553g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object f10554h;

        d(Object obj, v vVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f10547a = obj;
            this.f10548b = vVar;
            this.f10549c = view;
            this.f10550d = fragment;
            this.f10551e = arrayList;
            this.f10552f = arrayList2;
            this.f10553g = arrayList3;
            this.f10554h = obj2;
        }

        public void run() {
            Object obj = this.f10547a;
            if (obj != null) {
                this.f10548b.p(obj, this.f10549c);
                this.f10552f.addAll(t.k(this.f10548b, this.f10547a, this.f10550d, this.f10551e, this.f10549c));
            }
            if (this.f10553g != null) {
                if (this.f10554h != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f10549c);
                    this.f10548b.q(this.f10554h, this.f10553g, arrayList);
                }
                this.f10553g.clear();
                this.f10553g.add(this.f10549c);
            }
        }
    }

    /* compiled from: FragmentTransition */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f10555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f10556b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f10557c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f10558d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f10559e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f10560f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Rect f10561g;

        e(Fragment fragment, Fragment fragment2, boolean z11, androidx.collection.a aVar, View view, v vVar, Rect rect) {
            this.f10555a = fragment;
            this.f10556b = fragment2;
            this.f10557c = z11;
            this.f10558d = aVar;
            this.f10559e = view;
            this.f10560f = vVar;
            this.f10561g = rect;
        }

        public void run() {
            t.f(this.f10555a, this.f10556b, this.f10557c, this.f10558d, false);
            View view = this.f10559e;
            if (view != null) {
                this.f10560f.k(view, this.f10561g);
            }
        }
    }

    /* compiled from: FragmentTransition */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f10562a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f10563b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f10564c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f10565d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f10566e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f10567f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Fragment f10568g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f10569h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f10570i;
        final /* synthetic */ ArrayList j;
        final /* synthetic */ Object k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Rect f10571l;

        f(v vVar, androidx.collection.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z11, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f10562a = vVar;
            this.f10563b = aVar;
            this.f10564c = obj;
            this.f10565d = hVar;
            this.f10566e = arrayList;
            this.f10567f = view;
            this.f10568g = fragment;
            this.f10569h = fragment2;
            this.f10570i = z11;
            this.j = arrayList2;
            this.k = obj2;
            this.f10571l = rect;
        }

        public void run() {
            androidx.collection.a<String, View> h11 = t.h(this.f10562a, this.f10563b, this.f10564c, this.f10565d);
            if (h11 != null) {
                this.f10566e.addAll(h11.values());
                this.f10566e.add(this.f10567f);
            }
            t.f(this.f10568g, this.f10569h, this.f10570i, h11, false);
            Object obj = this.f10564c;
            if (obj != null) {
                this.f10562a.A(obj, this.j, this.f10566e);
                View s11 = t.s(h11, this.f10565d, this.k, this.f10570i);
                if (s11 != null) {
                    this.f10562a.k(s11, this.f10571l);
                }
            }
        }
    }

    /* compiled from: FragmentTransition */
    interface g {
        void a(Fragment fragment, androidx.core.os.c cVar);

        void b(Fragment fragment, androidx.core.os.c cVar);
    }

    /* compiled from: FragmentTransition */
    static class h {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f10572a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10573b;

        /* renamed from: c  reason: collision with root package name */
        public a f10574c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f10575d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f10576e;

        /* renamed from: f  reason: collision with root package name */
        public a f10577f;

        h() {
        }
    }

    static void A(ArrayList<View> arrayList, int i11) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i11);
            }
        }
    }

    static void B(Context context, e eVar, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12, boolean z11, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i13 = i11; i13 < i12; i13++) {
            a aVar = arrayList.get(i13);
            if (arrayList2.get(i13).booleanValue()) {
                e(aVar, sparseArray, z11);
            } else {
                c(aVar, sparseArray, z11);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                int keyAt = sparseArray.keyAt(i14);
                androidx.collection.a<String, String> d11 = d(keyAt, arrayList, arrayList2, i11, i12);
                h hVar = (h) sparseArray.valueAt(i14);
                if (eVar.d() && (viewGroup = (ViewGroup) eVar.c(keyAt)) != null) {
                    if (z11) {
                        o(viewGroup, hVar, view, d11, gVar);
                    } else {
                        n(viewGroup, hVar, view, d11, gVar);
                    }
                }
            }
        }
    }

    static boolean C() {
        return (f10538b == null && f10539c == null) ? false : true;
    }

    private static void a(ArrayList<View> arrayList, androidx.collection.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View q = aVar.q(size);
            if (collection.contains(a0.O(q))) {
                arrayList.add(q);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.mAdded != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        if (r0.mHidden == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.s.a r9, android.util.SparseArray<androidx.fragment.app.t.h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f10530b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.mContainerId
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f10537a
            int r9 = r9.f10529a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f10529a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007f
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007f
            r9 = 0
            r3 = 0
        L_0x002a:
            r4 = 0
            goto L_0x0092
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x008e
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x008e
            goto L_0x008c
        L_0x003c:
            boolean r9 = r0.mHidden
            goto L_0x008f
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mHidden
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            if (r12 == 0) goto L_0x0072
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.mPostponedAlpha
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x007b
        L_0x0070:
            r9 = 0
            goto L_0x007b
        L_0x0072:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x007b:
            r4 = r9
            r9 = 1
            r3 = 0
            goto L_0x0092
        L_0x007f:
            if (r12 == 0) goto L_0x0084
            boolean r9 = r0.mIsNewlyAdded
            goto L_0x008f
        L_0x0084:
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            r9 = 1
            goto L_0x008f
        L_0x008e:
            r9 = 0
        L_0x008f:
            r2 = r9
            r9 = 0
            goto L_0x002a
        L_0x0092:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.t$h r5 = (androidx.fragment.app.t.h) r5
            if (r2 == 0) goto L_0x00a4
            androidx.fragment.app.t$h r5 = p(r5, r10, r1)
            r5.f10572a = r0
            r5.f10573b = r11
            r5.f10574c = r8
        L_0x00a4:
            r2 = 0
            if (r12 != 0) goto L_0x00c5
            if (r3 == 0) goto L_0x00c5
            if (r5 == 0) goto L_0x00b1
            androidx.fragment.app.Fragment r3 = r5.f10575d
            if (r3 != r0) goto L_0x00b1
            r5.f10575d = r2
        L_0x00b1:
            boolean r3 = r8.f10527r
            if (r3 != 0) goto L_0x00c5
            androidx.fragment.app.FragmentManager r3 = r8.t
            androidx.fragment.app.q r6 = r3.x(r0)
            androidx.fragment.app.r r7 = r3.v0()
            r7.p(r6)
            r3.V0(r0)
        L_0x00c5:
            if (r4 == 0) goto L_0x00d7
            if (r5 == 0) goto L_0x00cd
            androidx.fragment.app.Fragment r3 = r5.f10575d
            if (r3 != 0) goto L_0x00d7
        L_0x00cd:
            androidx.fragment.app.t$h r5 = p(r5, r10, r1)
            r5.f10575d = r0
            r5.f10576e = r11
            r5.f10577f = r8
        L_0x00d7:
            if (r12 != 0) goto L_0x00e3
            if (r9 == 0) goto L_0x00e3
            if (r5 == 0) goto L_0x00e3
            androidx.fragment.app.Fragment r8 = r5.f10572a
            if (r8 != r0) goto L_0x00e3
            r5.f10572a = r2
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.t.b(androidx.fragment.app.a, androidx.fragment.app.s$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(a aVar, SparseArray<h> sparseArray, boolean z11) {
        int size = aVar.f10516c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b(aVar, aVar.f10516c.get(i11), sparseArray, false, z11);
        }
    }

    private static androidx.collection.a<String, String> d(int i11, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i12, int i13) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        androidx.collection.a<String, String> aVar = new androidx.collection.a<>();
        for (int i14 = i13 - 1; i14 >= i12; i14--) {
            a aVar2 = arrayList.get(i14);
            if (aVar2.K(i11)) {
                boolean booleanValue = arrayList2.get(i14).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f10526p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f10526p;
                        arrayList4 = aVar2.q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f10526p;
                        arrayList3 = aVar2.q;
                        arrayList4 = arrayList6;
                    }
                    for (int i15 = 0; i15 < size; i15++) {
                        String str = arrayList4.get(i15);
                        String str2 = arrayList3.get(i15);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(a aVar, SparseArray<h> sparseArray, boolean z11) {
        if (aVar.t.r0().d()) {
            for (int size = aVar.f10516c.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f10516c.get(size), sparseArray, true, z11);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z11, androidx.collection.a<String, View> aVar, boolean z12) {
        if (z11) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    private static boolean g(v vVar, List<Object> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!vVar.e(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    static androidx.collection.a<String, View> h(v vVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f10572a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
        vVar.j(aVar2, view);
        a aVar3 = hVar.f10574c;
        if (hVar.f10573b) {
            fragment.getExitTransitionCallback();
            arrayList = aVar3.f10526p;
        } else {
            fragment.getEnterTransitionCallback();
            arrayList = aVar3.q;
        }
        if (arrayList != null) {
            aVar2.u(arrayList);
            aVar2.u(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static androidx.collection.a<String, View> i(v vVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f10575d;
        androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
        vVar.j(aVar2, fragment.requireView());
        a aVar3 = hVar.f10577f;
        if (hVar.f10576e) {
            fragment.getEnterTransitionCallback();
            arrayList = aVar3.q;
        } else {
            fragment.getExitTransitionCallback();
            arrayList = aVar3.f10526p;
        }
        if (arrayList != null) {
            aVar2.u(arrayList);
        }
        aVar.u(aVar2.keySet());
        return aVar2;
    }

    private static v j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        v vVar = f10538b;
        if (vVar != null && g(vVar, arrayList)) {
            return vVar;
        }
        v vVar2 = f10539c;
        if (vVar2 != null && g(vVar2, arrayList)) {
            return vVar2;
        }
        if (vVar == null && vVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(v vVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            vVar.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        vVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(v vVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        androidx.collection.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        v vVar2 = vVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f10572a;
        Fragment fragment2 = hVar2.f10575d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z11 = hVar2.f10573b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = t(vVar2, fragment, fragment2, z11);
            aVar2 = aVar;
        }
        androidx.collection.a<String, View> i11 = i(vVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i11.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z11, i11, true);
        if (obj4 != null) {
            rect = new Rect();
            vVar2.z(obj4, view, arrayList3);
            z(vVar, obj4, obj2, i11, hVar2.f10576e, hVar2.f10577f);
            if (obj5 != null) {
                vVar2.u(obj5, rect);
            }
        } else {
            rect = null;
        }
        f fVar = r0;
        f fVar2 = new f(vVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z11, arrayList, obj, rect);
        w.a(viewGroup, fVar);
        return obj4;
    }

    private static Object m(v vVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        v vVar2 = vVar;
        View view3 = view;
        androidx.collection.a<String, String> aVar2 = aVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = hVar2.f10572a;
        Fragment fragment2 = hVar2.f10575d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z11 = hVar2.f10573b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = t(vVar, fragment, fragment2, z11);
        }
        androidx.collection.a<String, View> i11 = i(vVar, aVar2, obj3, hVar2);
        androidx.collection.a<String, View> h11 = h(vVar, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            if (i11 != null) {
                i11.clear();
            }
            if (h11 != null) {
                h11.clear();
            }
            obj4 = null;
        } else {
            a(arrayList3, i11, aVar.keySet());
            a(arrayList4, h11, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z11, i11, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            vVar.z(obj4, view3, arrayList3);
            z(vVar, obj4, obj2, i11, hVar2.f10576e, hVar2.f10577f);
            Rect rect2 = new Rect();
            View s11 = s(h11, hVar2, obj5, z11);
            if (s11 != null) {
                vVar.u(obj5, rect2);
            }
            rect = rect2;
            view2 = s11;
        } else {
            view2 = null;
            rect = null;
        }
        w.a(viewGroup, new e(fragment, fragment2, z11, h11, view2, vVar, rect));
        return obj4;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        ViewGroup viewGroup2 = viewGroup;
        h hVar2 = hVar;
        View view2 = view;
        androidx.collection.a<String, String> aVar2 = aVar;
        g gVar2 = gVar;
        Fragment fragment = hVar2.f10572a;
        Fragment fragment2 = hVar2.f10575d;
        v j = j(fragment2, fragment);
        if (j != null) {
            boolean z11 = hVar2.f10573b;
            boolean z12 = hVar2.f10576e;
            Object q = q(j, fragment, z11);
            Object r11 = r(j, fragment2, z12);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = r11;
            v vVar = j;
            Object l11 = l(j, viewGroup, view, aVar, hVar, arrayList, arrayList2, q, obj2);
            Object obj3 = q;
            if (obj3 == null && l11 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k = k(vVar, obj, fragment2, arrayList4, view2);
            if (k == null || k.isEmpty()) {
                obj = null;
            }
            Object obj4 = obj;
            vVar.a(obj3, view2);
            Object u11 = u(vVar, obj3, obj4, l11, fragment, hVar2.f10573b);
            if (!(fragment2 == null || k == null || (k.size() <= 0 && arrayList4.size() <= 0))) {
                androidx.core.os.c cVar = new androidx.core.os.c();
                gVar2.b(fragment2, cVar);
                vVar.w(fragment2, u11, cVar, new c(gVar2, fragment2, cVar));
            }
            if (u11 != null) {
                ArrayList arrayList5 = new ArrayList();
                v vVar2 = vVar;
                vVar2.t(u11, obj3, arrayList5, obj4, k, l11, arrayList2);
                y(vVar2, viewGroup, fragment, view, arrayList2, obj3, arrayList5, obj4, k);
                ViewGroup viewGroup3 = viewGroup;
                v vVar3 = vVar;
                ArrayList arrayList6 = arrayList2;
                vVar3.x(viewGroup3, arrayList6, aVar2);
                vVar3.c(viewGroup3, u11);
                vVar3.s(viewGroup3, arrayList6, aVar2);
            }
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        h hVar2 = hVar;
        View view2 = view;
        g gVar2 = gVar;
        Fragment fragment = hVar2.f10572a;
        Fragment fragment2 = hVar2.f10575d;
        v j = j(fragment2, fragment);
        if (j != null) {
            boolean z11 = hVar2.f10573b;
            boolean z12 = hVar2.f10576e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object q = q(j, fragment, z11);
            Object r11 = r(j, fragment2, z12);
            ArrayList arrayList3 = arrayList2;
            Object m11 = m(j, viewGroup, view, aVar, hVar, arrayList2, arrayList, q, r11);
            Object obj2 = q;
            if (obj2 == null && m11 == null) {
                obj = r11;
                if (obj == null) {
                    return;
                }
            } else {
                obj = r11;
            }
            ArrayList<View> k = k(j, obj, fragment2, arrayList3, view2);
            ArrayList<View> k11 = k(j, obj2, fragment, arrayList, view2);
            A(k11, 4);
            Fragment fragment3 = fragment;
            ArrayList<View> arrayList4 = k;
            Object u11 = u(j, obj2, obj, m11, fragment3, z11);
            if (!(fragment2 == null || arrayList4 == null || (arrayList4.size() <= 0 && arrayList3.size() <= 0))) {
                androidx.core.os.c cVar = new androidx.core.os.c();
                g gVar3 = gVar;
                gVar3.b(fragment2, cVar);
                j.w(fragment2, u11, cVar, new a(gVar3, fragment2, cVar));
            }
            if (u11 != null) {
                v(j, obj, fragment2, arrayList4);
                ArrayList<String> o11 = j.o(arrayList);
                v vVar = j;
                vVar.t(u11, obj2, k11, obj, arrayList4, m11, arrayList);
                ViewGroup viewGroup2 = viewGroup;
                j.c(viewGroup2, u11);
                vVar.y(viewGroup2, arrayList3, arrayList, o11, aVar);
                A(k11, 0);
                j.A(m11, arrayList3, arrayList);
            }
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i11) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i11, hVar2);
        return hVar2;
    }

    private static Object q(v vVar, Fragment fragment, boolean z11) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z11) {
            obj = fragment.getReenterTransition();
        } else {
            obj = fragment.getEnterTransition();
        }
        return vVar.g(obj);
    }

    private static Object r(v vVar, Fragment fragment, boolean z11) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z11) {
            obj = fragment.getReturnTransition();
        } else {
            obj = fragment.getExitTransition();
        }
        return vVar.g(obj);
    }

    static View s(androidx.collection.a<String, View> aVar, h hVar, Object obj, boolean z11) {
        ArrayList<String> arrayList;
        String str;
        a aVar2 = hVar.f10574c;
        if (obj == null || aVar == null || (arrayList = aVar2.f10526p) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z11) {
            str = aVar2.f10526p.get(0);
        } else {
            str = aVar2.q.get(0);
        }
        return aVar.get(str);
    }

    private static Object t(v vVar, Fragment fragment, Fragment fragment2, boolean z11) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z11) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return vVar.B(vVar.g(obj));
    }

    private static Object u(v vVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z11) {
        boolean z12;
        if (obj == null || obj2 == null || fragment == null) {
            z12 = true;
        } else {
            z12 = z11 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        if (z12) {
            return vVar.n(obj2, obj, obj3);
        }
        return vVar.m(obj2, obj, obj3);
    }

    private static void v(v vVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            vVar.r(obj, fragment.getView(), arrayList);
            w.a(fragment.mContainer, new b(arrayList));
        }
    }

    private static v w() {
        try {
            return l.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static void x(androidx.collection.a<String, String> aVar, androidx.collection.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.q(size))) {
                aVar.o(size);
            }
        }
    }

    private static void y(v vVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        w.a(viewGroup, new d(obj, vVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(v vVar, Object obj, Object obj2, androidx.collection.a<String, View> aVar, boolean z11, a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f10526p;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z11) {
                str = aVar2.q.get(0);
            } else {
                str = aVar2.f10526p.get(0);
            }
            View view = aVar.get(str);
            vVar.v(obj, view);
            if (obj2 != null) {
                vVar.v(obj2, view);
            }
        }
    }
}
