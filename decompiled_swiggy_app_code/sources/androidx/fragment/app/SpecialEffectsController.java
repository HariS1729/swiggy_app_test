package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.c;
import androidx.core.view.a0;
import androidx.fragment.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

abstract class SpecialEffectsController {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f10391a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<Operation> f10392b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<Operation> f10393c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    boolean f10394d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f10395e = false;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f10404a;

        a(d dVar) {
            this.f10404a = dVar;
        }

        public void run() {
            if (SpecialEffectsController.this.f10392b.contains(this.f10404a)) {
                this.f10404a.e().applyState(this.f10404a.f().mView);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f10406a;

        b(d dVar) {
            this.f10406a = dVar;
        }

        public void run() {
            SpecialEffectsController.this.f10392b.remove(this.f10406a);
            SpecialEffectsController.this.f10393c.remove(this.f10406a);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10408a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f10409b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10409b = r0
                r1 = 1
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10409b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f10409b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r4 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f10408a = r3
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f10408a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f10408a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f10408a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.c.<clinit>():void");
        }
    }

    private static class d extends Operation {

        /* renamed from: h  reason: collision with root package name */
        private final q f10410h;

        d(Operation.State state, Operation.LifecycleImpact lifecycleImpact, q qVar, androidx.core.os.c cVar) {
            super(state, lifecycleImpact, qVar.k(), cVar);
            this.f10410h = qVar;
        }

        public void c() {
            super.c();
            this.f10410h.m();
        }

        /* access modifiers changed from: package-private */
        public void l() {
            if (g() == Operation.LifecycleImpact.ADDING) {
                Fragment k = this.f10410h.k();
                View findFocus = k.mView.findFocus();
                if (findFocus != null) {
                    k.setFocusedView(findFocus);
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k);
                    }
                }
                View requireView = f().requireView();
                if (requireView.getParent() == null) {
                    this.f10410h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k.getPostOnViewCreatedAlpha());
            }
        }
    }

    SpecialEffectsController(ViewGroup viewGroup) {
        this.f10391a = viewGroup;
    }

    private void a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, q qVar) {
        synchronized (this.f10392b) {
            androidx.core.os.c cVar = new androidx.core.os.c();
            Operation h11 = h(qVar.k());
            if (h11 != null) {
                h11.k(state, lifecycleImpact);
                return;
            }
            d dVar = new d(state, lifecycleImpact, qVar, cVar);
            this.f10392b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private Operation h(Fragment fragment) {
        Iterator<Operation> it2 = this.f10392b.iterator();
        while (it2.hasNext()) {
            Operation next = it2.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private Operation i(Fragment fragment) {
        Iterator<Operation> it2 = this.f10393c.iterator();
        while (it2.hasNext()) {
            Operation next = it2.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    static SpecialEffectsController n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.C0());
    }

    static SpecialEffectsController o(ViewGroup viewGroup, y yVar) {
        int i11 = R.id.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i11);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        SpecialEffectsController a11 = yVar.a(viewGroup);
        viewGroup.setTag(i11, a11);
        return a11;
    }

    private void q() {
        Iterator<Operation> it2 = this.f10392b.iterator();
        while (it2.hasNext()) {
            Operation next = it2.next();
            if (next.g() == Operation.LifecycleImpact.ADDING) {
                next.k(Operation.State.from(next.f().requireView().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Operation.State state, q qVar) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + qVar.k());
        }
        a(state, Operation.LifecycleImpact.ADDING, qVar);
    }

    /* access modifiers changed from: package-private */
    public void c(q qVar) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + qVar.k());
        }
        a(Operation.State.GONE, Operation.LifecycleImpact.NONE, qVar);
    }

    /* access modifiers changed from: package-private */
    public void d(q qVar) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + qVar.k());
        }
        a(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, qVar);
    }

    /* access modifiers changed from: package-private */
    public void e(q qVar) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + qVar.k());
        }
        a(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, qVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void f(List<Operation> list, boolean z11);

    /* access modifiers changed from: package-private */
    public void g() {
        if (!this.f10395e) {
            if (!a0.Z(this.f10391a)) {
                j();
                this.f10394d = false;
                return;
            }
            synchronized (this.f10392b) {
                if (!this.f10392b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f10393c);
                    this.f10393c.clear();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Operation operation = (Operation) it2.next();
                        if (FragmentManager.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                        }
                        operation.b();
                        if (!operation.i()) {
                            this.f10393c.add(operation);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f10392b);
                    this.f10392b.clear();
                    this.f10393c.addAll(arrayList2);
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((Operation) it3.next()).l();
                    }
                    f(arrayList2, this.f10394d);
                    this.f10394d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        boolean Z = a0.Z(this.f10391a);
        synchronized (this.f10392b) {
            q();
            Iterator<Operation> it2 = this.f10392b.iterator();
            while (it2.hasNext()) {
                it2.next().l();
            }
            Iterator it3 = new ArrayList(this.f10393c).iterator();
            while (it3.hasNext()) {
                Operation operation = (Operation) it3.next();
                if (FragmentManager.J0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (Z) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f10391a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(operation);
                    Log.v("FragmentManager", sb2.toString());
                }
                operation.b();
            }
            Iterator it4 = new ArrayList(this.f10392b).iterator();
            while (it4.hasNext()) {
                Operation operation2 = (Operation) it4.next();
                if (FragmentManager.J0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (Z) {
                        str = "";
                    } else {
                        str = "Container " + this.f10391a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(operation2);
                    Log.v("FragmentManager", sb3.toString());
                }
                operation2.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        if (this.f10395e) {
            this.f10395e = false;
            g();
        }
    }

    /* access modifiers changed from: package-private */
    public Operation.LifecycleImpact l(q qVar) {
        Operation h11 = h(qVar.k());
        Operation.LifecycleImpact g11 = h11 != null ? h11.g() : null;
        Operation i11 = i(qVar.k());
        return (i11 == null || !(g11 == null || g11 == Operation.LifecycleImpact.NONE)) ? g11 : i11.g();
    }

    public ViewGroup m() {
        return this.f10391a;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f10392b) {
            q();
            this.f10395e = false;
            int size = this.f10392b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Operation operation = this.f10392b.get(size);
                Operation.State from = Operation.State.from(operation.f().mView);
                Operation.State e11 = operation.e();
                Operation.State state = Operation.State.VISIBLE;
                if (e11 == state && from != state) {
                    this.f10395e = operation.f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z11) {
        this.f10394d = z11;
    }

    static class Operation {

        /* renamed from: a  reason: collision with root package name */
        private State f10396a;

        /* renamed from: b  reason: collision with root package name */
        private LifecycleImpact f10397b;

        /* renamed from: c  reason: collision with root package name */
        private final Fragment f10398c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Runnable> f10399d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final HashSet<androidx.core.os.c> f10400e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        private boolean f10401f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f10402g = false;

        enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        class a implements c.b {
            a() {
            }

            public void e() {
                Operation.this.b();
            }
        }

        Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, androidx.core.os.c cVar) {
            this.f10396a = state;
            this.f10397b = lifecycleImpact;
            this.f10398c = fragment;
            cVar.c(new a());
        }

        /* access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f10399d.add(runnable);
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if (!h()) {
                this.f10401f = true;
                if (this.f10400e.isEmpty()) {
                    c();
                    return;
                }
                Iterator it2 = new ArrayList(this.f10400e).iterator();
                while (it2.hasNext()) {
                    ((androidx.core.os.c) it2.next()).a();
                }
            }
        }

        public void c() {
            if (!this.f10402g) {
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f10402g = true;
                for (Runnable run : this.f10399d) {
                    run.run();
                }
            }
        }

        public final void d(androidx.core.os.c cVar) {
            if (this.f10400e.remove(cVar) && this.f10400e.isEmpty()) {
                c();
            }
        }

        public State e() {
            return this.f10396a;
        }

        public final Fragment f() {
            return this.f10398c;
        }

        /* access modifiers changed from: package-private */
        public LifecycleImpact g() {
            return this.f10397b;
        }

        /* access modifiers changed from: package-private */
        public final boolean h() {
            return this.f10401f;
        }

        /* access modifiers changed from: package-private */
        public final boolean i() {
            return this.f10402g;
        }

        public final void j(androidx.core.os.c cVar) {
            l();
            this.f10400e.add(cVar);
        }

        /* access modifiers changed from: package-private */
        public final void k(State state, LifecycleImpact lifecycleImpact) {
            int i11 = c.f10409b[lifecycleImpact.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f10398c + " mFinalState = " + this.f10396a + " -> REMOVED. mLifecycleImpact  = " + this.f10397b + " to REMOVING.");
                    }
                    this.f10396a = State.REMOVED;
                    this.f10397b = LifecycleImpact.REMOVING;
                } else if (i11 == 3 && this.f10396a != State.REMOVED) {
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f10398c + " mFinalState = " + this.f10396a + " -> " + state + ". ");
                    }
                    this.f10396a = state;
                }
            } else if (this.f10396a == State.REMOVED) {
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f10398c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f10397b + " to ADDING.");
                }
                this.f10396a = State.VISIBLE;
                this.f10397b = LifecycleImpact.ADDING;
            }
        }

        /* access modifiers changed from: package-private */
        public void l() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f10396a + "} " + "{" + "mLifecycleImpact = " + this.f10397b + "} " + "{" + "mFragment = " + this.f10398c + "}";
        }

        enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static State from(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return from(view.getVisibility());
            }

            /* access modifiers changed from: package-private */
            public void applyState(View view) {
                int i11 = c.f10408a[ordinal()];
                if (i11 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i11 == 2) {
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i11 == 3) {
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (i11 == 4) {
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }

            static State from(int i11) {
                if (i11 == 0) {
                    return VISIBLE;
                }
                if (i11 == 4) {
                    return INVISIBLE;
                }
                if (i11 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i11);
            }
        }
    }
}
