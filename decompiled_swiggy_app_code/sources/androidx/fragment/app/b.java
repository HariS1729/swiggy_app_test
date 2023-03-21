package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.c;
import androidx.core.view.a0;
import androidx.core.view.d0;
import androidx.core.view.w;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultSpecialEffectsController */
class b extends SpecialEffectsController {

    /* compiled from: DefaultSpecialEffectsController */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10412a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10412a = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10412a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10412a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10412a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b.a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.b$b  reason: collision with other inner class name */
    /* compiled from: DefaultSpecialEffectsController */
    class C0061b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f10413a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f10414b;

        C0061b(List list, SpecialEffectsController.Operation operation) {
            this.f10413a = list;
            this.f10414b = operation;
        }

        public void run() {
            if (this.f10413a.contains(this.f10414b)) {
                this.f10413a.remove(this.f10414b);
                b.this.s(this.f10414b);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f10416a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f10417b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f10418c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f10419d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f10420e;

        c(ViewGroup viewGroup, View view, boolean z11, SpecialEffectsController.Operation operation, k kVar) {
            this.f10416a = viewGroup;
            this.f10417b = view;
            this.f10418c = z11;
            this.f10419d = operation;
            this.f10420e = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f10416a.endViewTransition(this.f10417b);
            if (this.f10418c) {
                this.f10419d.e().applyState(this.f10417b);
            }
            this.f10420e.a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class d implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Animator f10422a;

        d(Animator animator) {
            this.f10422a = animator;
        }

        public void e() {
            this.f10422a.end();
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class e implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f10424a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f10425b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f10426c;

        /* compiled from: DefaultSpecialEffectsController */
        class a implements Runnable {
            a() {
            }

            public void run() {
                e eVar = e.this;
                eVar.f10424a.endViewTransition(eVar.f10425b);
                e.this.f10426c.a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f10424a = viewGroup;
            this.f10425b = view;
            this.f10426c = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f10424a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class f implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f10429a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f10430b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f10431c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f10429a = view;
            this.f10430b = viewGroup;
            this.f10431c = kVar;
        }

        public void e() {
            this.f10429a.clearAnimation();
            this.f10430b.endViewTransition(this.f10429a);
            this.f10431c.a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f10433a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f10434b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f10435c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f10436d;

        g(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z11, androidx.collection.a aVar) {
            this.f10433a = operation;
            this.f10434b = operation2;
            this.f10435c = z11;
            this.f10436d = aVar;
        }

        public void run() {
            t.f(this.f10433a.f(), this.f10434b.f(), this.f10435c, this.f10436d, false);
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f10438a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f10439b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f10440c;

        h(v vVar, View view, Rect rect) {
            this.f10438a = vVar;
            this.f10439b = view;
            this.f10440c = rect;
        }

        public void run() {
            this.f10438a.k(this.f10439b, this.f10440c);
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10442a;

        i(ArrayList arrayList) {
            this.f10442a = arrayList;
        }

        public void run() {
            t.A(this.f10442a, 4);
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f10444a;

        j(m mVar) {
            this.f10444a = mVar;
        }

        public void run() {
            this.f10444a.a();
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    private static class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private boolean f10446c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10447d = false;

        /* renamed from: e  reason: collision with root package name */
        private d.C0063d f10448e;

        k(SpecialEffectsController.Operation operation, androidx.core.os.c cVar, boolean z11) {
            super(operation, cVar);
            this.f10446c = z11;
        }

        /* access modifiers changed from: package-private */
        public d.C0063d e(Context context) {
            if (this.f10447d) {
                return this.f10448e;
            }
            d.C0063d c11 = d.c(context, b().f(), b().e() == SpecialEffectsController.Operation.State.VISIBLE, this.f10446c);
            this.f10448e = c11;
            this.f10447d = true;
            return c11;
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    private static class l {

        /* renamed from: a  reason: collision with root package name */
        private final SpecialEffectsController.Operation f10449a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.os.c f10450b;

        l(SpecialEffectsController.Operation operation, androidx.core.os.c cVar) {
            this.f10449a = operation;
            this.f10450b = cVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f10449a.d(this.f10450b);
        }

        /* access modifiers changed from: package-private */
        public SpecialEffectsController.Operation b() {
            return this.f10449a;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.os.c c() {
            return this.f10450b;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d() {
            /*
                r3 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r3.f10449a
                androidx.fragment.app.Fragment r0 = r0.f()
                android.view.View r0 = r0.mView
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.from((android.view.View) r0)
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.f10449a
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.e()
                if (r0 == r1) goto L_0x001d
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 == r2) goto L_0x001b
                if (r1 == r2) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                goto L_0x001e
            L_0x001d:
                r0 = 1
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b.l.d():boolean");
        }
    }

    /* compiled from: DefaultSpecialEffectsController */
    private static class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final Object f10451c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f10452d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f10453e;

        m(SpecialEffectsController.Operation operation, androidx.core.os.c cVar, boolean z11, boolean z12) {
            super(operation, cVar);
            Object obj;
            Object obj2;
            boolean z13;
            if (operation.e() == SpecialEffectsController.Operation.State.VISIBLE) {
                if (z11) {
                    obj2 = operation.f().getReenterTransition();
                } else {
                    obj2 = operation.f().getEnterTransition();
                }
                this.f10451c = obj2;
                if (z11) {
                    z13 = operation.f().getAllowReturnTransitionOverlap();
                } else {
                    z13 = operation.f().getAllowEnterTransitionOverlap();
                }
                this.f10452d = z13;
            } else {
                if (z11) {
                    obj = operation.f().getReturnTransition();
                } else {
                    obj = operation.f().getExitTransition();
                }
                this.f10451c = obj;
                this.f10452d = true;
            }
            if (!z12) {
                this.f10453e = null;
            } else if (z11) {
                this.f10453e = operation.f().getSharedElementReturnTransition();
            } else {
                this.f10453e = operation.f().getSharedElementEnterTransition();
            }
        }

        private v f(Object obj) {
            if (obj == null) {
                return null;
            }
            v vVar = t.f10538b;
            if (vVar != null && vVar.e(obj)) {
                return vVar;
            }
            v vVar2 = t.f10539c;
            if (vVar2 != null && vVar2.e(obj)) {
                return vVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* access modifiers changed from: package-private */
        public v e() {
            v f11 = f(this.f10451c);
            v f12 = f(this.f10453e);
            if (f11 == null || f12 == null || f11 == f12) {
                return f11 != null ? f11 : f12;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f10451c + " which uses a different Transition  type than its shared element transition " + this.f10453e);
        }

        public Object g() {
            return this.f10453e;
        }

        /* access modifiers changed from: package-private */
        public Object h() {
            return this.f10451c;
        }

        public boolean i() {
            return this.f10453e != null;
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            return this.f10452d;
        }
    }

    b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<SpecialEffectsController.Operation> list2, boolean z11, Map<SpecialEffectsController.Operation, Boolean> map) {
        ViewGroup m11 = m();
        Context context = m11.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z12 = false;
        for (k next : list) {
            if (next.d()) {
                next.a();
            } else {
                d.C0063d e11 = next.e(context);
                if (e11 == null) {
                    next.a();
                } else {
                    Animator animator = e11.f10472b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        SpecialEffectsController.Operation b11 = next.b();
                        Fragment f11 = b11.f();
                        if (Boolean.TRUE.equals(map.get(b11))) {
                            if (FragmentManager.J0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f11 + " as this Fragment was involved in a Transition.");
                            }
                            next.a();
                        } else {
                            boolean z13 = b11.e() == SpecialEffectsController.Operation.State.GONE;
                            List<SpecialEffectsController.Operation> list3 = list2;
                            if (z13) {
                                list3.remove(b11);
                            }
                            View view = f11.mView;
                            m11.startViewTransition(view);
                            c cVar = r0;
                            c cVar2 = new c(m11, view, z13, b11, next);
                            animator.addListener(cVar);
                            animator.setTarget(view);
                            animator.start();
                            next.c().c(new d(animator));
                            z12 = true;
                        }
                    }
                }
            }
            Map<SpecialEffectsController.Operation, Boolean> map2 = map;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar = (k) it2.next();
            SpecialEffectsController.Operation b12 = kVar.b();
            Fragment f12 = b12.f();
            if (z11) {
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f12 + " as Animations cannot run alongside Transitions.");
                }
                kVar.a();
            } else if (z12) {
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f12 + " as Animations cannot run alongside Animators.");
                }
                kVar.a();
            } else {
                View view2 = f12.mView;
                Animation animation = (Animation) androidx.core.util.g.g(((d.C0063d) androidx.core.util.g.g(kVar.e(context))).f10471a);
                if (b12.e() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation);
                    kVar.a();
                } else {
                    m11.startViewTransition(view2);
                    d.e eVar = new d.e(animation, m11, view2);
                    eVar.setAnimationListener(new e(m11, view2, kVar));
                    view2.startAnimation(eVar);
                }
                kVar.c().c(new f(view2, m11, kVar));
            }
        }
    }

    private Map<SpecialEffectsController.Operation, Boolean> x(List<m> list, List<SpecialEffectsController.Operation> list2, boolean z11, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        View view2;
        Object obj;
        SpecialEffectsController.Operation operation3;
        SpecialEffectsController.Operation operation4;
        Object obj2;
        Object obj3;
        androidx.collection.a aVar;
        SpecialEffectsController.Operation operation5;
        v vVar;
        View view3;
        Rect rect;
        ArrayList arrayList3;
        SpecialEffectsController.Operation operation6;
        ArrayList arrayList4;
        boolean z12 = z11;
        SpecialEffectsController.Operation operation7 = operation;
        SpecialEffectsController.Operation operation8 = operation2;
        HashMap hashMap = new HashMap();
        v vVar2 = null;
        for (m next : list) {
            if (!next.d()) {
                v e11 = next.e();
                if (vVar2 == null) {
                    vVar2 = e11;
                } else if (!(e11 == null || vVar2 == e11)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.b().f() + " returned Transition " + next.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (vVar2 == null) {
            for (m next2 : list) {
                hashMap.put(next2.b(), Boolean.FALSE);
                next2.a();
            }
            return hashMap;
        }
        View view4 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        androidx.collection.a aVar2 = new androidx.collection.a();
        Object obj4 = null;
        View view5 = null;
        boolean z13 = false;
        for (m next3 : list) {
            if (!next3.i() || operation7 == null || operation8 == null) {
                aVar = aVar2;
                arrayList4 = arrayList6;
                operation6 = operation7;
                arrayList3 = arrayList5;
                rect = rect2;
                view3 = view4;
                vVar = vVar2;
                operation5 = operation8;
                view5 = view5;
            } else {
                Object B = vVar2.B(vVar2.g(next3.g()));
                ArrayList<String> sharedElementSourceNames = operation2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = operation.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = operation.f().getSharedElementTargetNames();
                Object obj5 = B;
                View view6 = view5;
                int i11 = 0;
                while (i11 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i11));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i11));
                    }
                    i11++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.f().getSharedElementTargetNames();
                if (!z12) {
                    operation.f().getExitTransitionCallback();
                    operation2.f().getEnterTransitionCallback();
                } else {
                    operation.f().getEnterTransitionCallback();
                    operation2.f().getExitTransitionCallback();
                }
                int i12 = 0;
                for (int size = sharedElementSourceNames.size(); i12 < size; size = size) {
                    aVar2.put(sharedElementSourceNames.get(i12), sharedElementTargetNames2.get(i12));
                    i12++;
                }
                androidx.collection.a aVar3 = new androidx.collection.a();
                u(aVar3, operation.f().mView);
                aVar3.u(sharedElementSourceNames);
                aVar2.u(aVar3.keySet());
                androidx.collection.a aVar4 = new androidx.collection.a();
                u(aVar4, operation2.f().mView);
                aVar4.u(sharedElementTargetNames2);
                aVar4.u(aVar2.values());
                t.x(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList4 = arrayList6;
                    operation6 = operation7;
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    vVar = vVar2;
                    view5 = view6;
                    obj4 = null;
                    operation5 = operation8;
                } else {
                    t.f(operation2.f(), operation.f(), z12, aVar3, true);
                    ArrayList<String> arrayList8 = sharedElementSourceNames;
                    g gVar = r0;
                    ViewGroup m11 = m();
                    Object obj6 = obj5;
                    androidx.collection.a aVar5 = aVar4;
                    View view7 = view6;
                    androidx.collection.a aVar6 = aVar3;
                    aVar = aVar2;
                    ArrayList arrayList9 = arrayList6;
                    g gVar2 = new g(operation2, operation, z11, aVar5);
                    w.a(m11, gVar2);
                    arrayList5.addAll(aVar6.values());
                    if (!arrayList8.isEmpty()) {
                        View view8 = (View) aVar6.get(arrayList8.get(0));
                        vVar2.v(obj6, view8);
                        view5 = view8;
                    } else {
                        view5 = view7;
                    }
                    arrayList4 = arrayList9;
                    arrayList4.addAll(aVar5.values());
                    if (!sharedElementTargetNames2.isEmpty()) {
                        View view9 = (View) aVar5.get(sharedElementTargetNames2.get(0));
                        if (view9 != null) {
                            w.a(m(), new h(vVar2, view9, rect2));
                            z13 = true;
                        }
                    }
                    vVar2.z(obj6, view4, arrayList5);
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    vVar = vVar2;
                    vVar2.t(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                    Boolean bool = Boolean.TRUE;
                    operation6 = operation;
                    hashMap.put(operation6, bool);
                    operation5 = operation2;
                    hashMap.put(operation5, bool);
                    obj4 = obj6;
                }
            }
            operation7 = operation6;
            arrayList5 = arrayList3;
            rect2 = rect;
            view4 = view3;
            operation8 = operation5;
            aVar2 = aVar;
            z12 = z11;
            arrayList6 = arrayList4;
            vVar2 = vVar;
        }
        View view10 = view5;
        androidx.collection.a aVar7 = aVar2;
        ArrayList arrayList10 = arrayList6;
        SpecialEffectsController.Operation operation9 = operation7;
        ArrayList arrayList11 = arrayList5;
        Rect rect3 = rect2;
        View view11 = view4;
        v vVar3 = vVar2;
        SpecialEffectsController.Operation operation10 = operation8;
        ArrayList arrayList12 = new ArrayList();
        Object obj7 = null;
        Object obj8 = null;
        for (m next4 : list) {
            if (next4.d()) {
                hashMap.put(next4.b(), Boolean.FALSE);
                next4.a();
            } else {
                Object g11 = vVar3.g(next4.h());
                SpecialEffectsController.Operation b11 = next4.b();
                boolean z14 = obj4 != null && (b11 == operation9 || b11 == operation10);
                if (g11 == null) {
                    if (!z14) {
                        hashMap.put(b11, Boolean.FALSE);
                        next4.a();
                    }
                    List<SpecialEffectsController.Operation> list3 = list2;
                    arrayList = arrayList10;
                    arrayList2 = arrayList11;
                    view = view11;
                    obj = obj7;
                    operation3 = operation10;
                    view2 = view10;
                } else {
                    ArrayList arrayList13 = new ArrayList();
                    Object obj9 = obj7;
                    t(arrayList13, b11.f().mView);
                    if (z14) {
                        if (b11 == operation9) {
                            arrayList13.removeAll(arrayList11);
                        } else {
                            arrayList13.removeAll(arrayList10);
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        vVar3.a(g11, view11);
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        view = view11;
                        operation4 = b11;
                        obj3 = obj8;
                        operation3 = operation10;
                        List<SpecialEffectsController.Operation> list4 = list2;
                        obj2 = obj9;
                    } else {
                        vVar3.b(g11, arrayList13);
                        view = view11;
                        obj2 = obj9;
                        SpecialEffectsController.Operation operation11 = b11;
                        arrayList2 = arrayList11;
                        obj3 = obj8;
                        arrayList = arrayList10;
                        operation3 = operation10;
                        vVar3.t(g11, g11, arrayList13, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (operation11.e() == SpecialEffectsController.Operation.State.GONE) {
                            operation4 = operation11;
                            list2.remove(operation4);
                            ArrayList arrayList14 = new ArrayList(arrayList13);
                            arrayList14.remove(operation4.f().mView);
                            vVar3.r(g11, operation4.f().mView, arrayList14);
                            w.a(m(), new i(arrayList13));
                        } else {
                            List<SpecialEffectsController.Operation> list5 = list2;
                            operation4 = operation11;
                        }
                    }
                    if (operation4.e() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList12.addAll(arrayList13);
                        if (z13) {
                            vVar3.u(g11, rect3);
                        }
                        view2 = view10;
                    } else {
                        view2 = view10;
                        vVar3.v(g11, view2);
                    }
                    hashMap.put(operation4, Boolean.TRUE);
                    if (next4.j()) {
                        obj8 = vVar3.n(obj3, g11, (Object) null);
                        obj = obj2;
                    } else {
                        obj = vVar3.n(obj2, g11, (Object) null);
                        obj8 = obj3;
                    }
                }
                operation10 = operation3;
                obj7 = obj;
                view10 = view2;
                view11 = view;
                arrayList11 = arrayList2;
                arrayList10 = arrayList;
            }
        }
        ArrayList arrayList15 = arrayList10;
        ArrayList arrayList16 = arrayList11;
        SpecialEffectsController.Operation operation12 = operation10;
        Object m12 = vVar3.m(obj8, obj7, obj4);
        for (m next5 : list) {
            if (!next5.d()) {
                Object h11 = next5.h();
                SpecialEffectsController.Operation b12 = next5.b();
                boolean z15 = obj4 != null && (b12 == operation9 || b12 == operation12);
                if (h11 != null || z15) {
                    if (!a0.a0(m())) {
                        if (FragmentManager.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b12);
                        }
                        next5.a();
                    } else {
                        vVar3.w(next5.b().f(), m12, next5.c(), new j(next5));
                    }
                }
            }
        }
        if (!a0.a0(m())) {
            return hashMap;
        }
        t.A(arrayList12, 4);
        ArrayList arrayList17 = arrayList15;
        ArrayList<String> o11 = vVar3.o(arrayList17);
        vVar3.c(m(), m12);
        vVar3.y(m(), arrayList16, arrayList17, o11, aVar7);
        t.A(arrayList12, 0);
        vVar3.A(obj4, arrayList16, arrayList17);
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void f(List<SpecialEffectsController.Operation> list, boolean z11) {
        SpecialEffectsController.Operation operation = null;
        SpecialEffectsController.Operation operation2 = null;
        for (SpecialEffectsController.Operation next : list) {
            SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(next.f().mView);
            int i11 = a.f10412a[next.e().ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                if (from == SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = next;
                }
            } else if (i11 == 4 && from != SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = next;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<SpecialEffectsController.Operation> arrayList3 = new ArrayList<>(list);
        for (SpecialEffectsController.Operation next2 : list) {
            androidx.core.os.c cVar = new androidx.core.os.c();
            next2.j(cVar);
            arrayList.add(new k(next2, cVar, z11));
            androidx.core.os.c cVar2 = new androidx.core.os.c();
            next2.j(cVar2);
            boolean z12 = false;
            if (z11) {
                if (next2 != operation) {
                    arrayList2.add(new m(next2, cVar2, z11, z12));
                    next2.a(new C0061b(arrayList3, next2));
                }
            } else if (next2 != operation2) {
                arrayList2.add(new m(next2, cVar2, z11, z12));
                next2.a(new C0061b(arrayList3, next2));
            }
            z12 = true;
            arrayList2.add(new m(next2, cVar2, z11, z12));
            next2.a(new C0061b(arrayList3, next2));
        }
        Map<SpecialEffectsController.Operation, Boolean> x11 = x(arrayList2, arrayList3, z11, operation, operation2);
        w(arrayList, arrayList3, x11.containsValue(Boolean.TRUE), x11);
        for (SpecialEffectsController.Operation s11 : arrayList3) {
            s(s11);
        }
        arrayList3.clear();
    }

    /* access modifiers changed from: package-private */
    public void s(SpecialEffectsController.Operation operation) {
        operation.e().applyState(operation.f().mView);
    }

    /* access modifiers changed from: package-private */
    public void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!d0.a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt.getVisibility() == 0) {
                        t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(Map<String, View> map, View view) {
        String O = a0.O(view);
        if (O != null) {
            map.put(O, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(androidx.collection.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it2 = aVar.entrySet().iterator();
        while (it2.hasNext()) {
            if (!collection.contains(a0.O((View) it2.next().getValue()))) {
                it2.remove();
            }
        }
    }
}
