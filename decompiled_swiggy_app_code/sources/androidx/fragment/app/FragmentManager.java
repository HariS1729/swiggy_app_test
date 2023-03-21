package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.s;
import androidx.fragment.app.t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o0;
import androidx.lifecycle.r;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class FragmentManager {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.b<IntentSenderRequest> A;
    private androidx.activity.result.b<String[]> B;
    ArrayDeque<LaunchedFragmentInfo> C = new ArrayDeque<>();
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<q> L;
    private m M;
    private Runnable N = new g();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<o> f10321a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f10322b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final r f10323c = new r();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<a> f10324d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f10325e;

    /* renamed from: f  reason: collision with root package name */
    private final j f10326f = new j(this);

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f10327g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.e f10328h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f10329i = new AtomicInteger();
    /* access modifiers changed from: private */
    public final Map<String, Bundle> j = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */
    public final Map<String, m> k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<n> f10330l;

    /* renamed from: m  reason: collision with root package name */
    private Map<Fragment, HashSet<androidx.core.os.c>> f10331m = Collections.synchronizedMap(new HashMap());
    private final t.g n = new d();

    /* renamed from: o  reason: collision with root package name */
    private final k f10332o = new k(this);

    /* renamed from: p  reason: collision with root package name */
    private final CopyOnWriteArrayList<n> f10333p = new CopyOnWriteArrayList<>();
    int q = -1;

    /* renamed from: r  reason: collision with root package name */
    private h<?> f10334r;

    /* renamed from: s  reason: collision with root package name */
    private e f10335s;
    private Fragment t;

    /* renamed from: u  reason: collision with root package name */
    Fragment f10336u;
    private g v = null;

    /* renamed from: w  reason: collision with root package name */
    private g f10337w = new e();

    /* renamed from: x  reason: collision with root package name */
    private y f10338x = null;

    /* renamed from: y  reason: collision with root package name */
    private y f10339y = new f();

    /* renamed from: z  reason: collision with root package name */
    private androidx.activity.result.b<Intent> f10340z;

    public static abstract class FragmentLifecycleCallbacks {
        @Deprecated
        public void a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void d(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void e(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void f(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void g(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void h(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void i(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void k(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void l(FragmentManager fragmentManager, Fragment fragment) {
        }

        public abstract void m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle);

        public void n(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    class a implements androidx.activity.result.a<ActivityResult> {
        a() {
        }

        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f10345a;
            int i11 = pollFirst.f10346b;
            Fragment i12 = FragmentManager.this.f10323c.i(str);
            if (i12 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i12.onActivityResult(i11, activityResult.b(), activityResult.a());
        }
    }

    class b implements androidx.activity.result.a<Map<String, Boolean>> {
        b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = ((Boolean) arrayList.get(i11)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f10345a;
            int i12 = pollFirst.f10346b;
            Fragment i13 = FragmentManager.this.f10323c.i(str);
            if (i13 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i13.onRequestPermissionsResult(i12, strArr, iArr);
        }
    }

    class c extends androidx.activity.e {
        c(boolean z11) {
            super(z11);
        }

        public void b() {
            FragmentManager.this.F0();
        }
    }

    class d implements t.g {
        d() {
        }

        public void a(Fragment fragment, androidx.core.os.c cVar) {
            if (!cVar.b()) {
                FragmentManager.this.j1(fragment, cVar);
            }
        }

        public void b(Fragment fragment, androidx.core.os.c cVar) {
            FragmentManager.this.f(fragment, cVar);
        }
    }

    class e extends g {
        e() {
        }

        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.x0().b(FragmentManager.this.x0().f(), str, (Bundle) null);
        }
    }

    class f implements y {
        f() {
        }

        public SpecialEffectsController a(ViewGroup viewGroup) {
            return new b(viewGroup);
        }
    }

    class g implements Runnable {
        g() {
        }

        public void run() {
            FragmentManager.this.c0(true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f10354a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f10355b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f10356c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f10354a = viewGroup;
            this.f10355b = view;
            this.f10356c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f10354a.endViewTransition(this.f10355b);
            animator.removeListener(this);
            Fragment fragment = this.f10356c;
            View view = fragment.mView;
            if (view != null && fragment.mHidden) {
                view.setVisibility(8);
            }
        }
    }

    class i implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f10358a;

        i(Fragment fragment) {
            this.f10358a = fragment;
        }

        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f10358a.onAttachFragment(fragment);
        }
    }

    class j implements androidx.activity.result.a<ActivityResult> {
        j() {
        }

        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f10345a;
            int i11 = pollFirst.f10346b;
            Fragment i12 = FragmentManager.this.f10323c.i(str);
            if (i12 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i12.onActivityResult(i11, activityResult.b(), activityResult.a());
        }
    }

    public interface k {
        String getName();
    }

    static class l extends e.a<IntentSenderRequest, ActivityResult> {
        l() {
        }

        /* renamed from: d */
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a11 = intentSenderRequest.a();
            if (!(a11 == null || (bundleExtra = a11.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a11.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a11.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.b(intentSenderRequest.d()).b((Intent) null).c(intentSenderRequest.c(), intentSenderRequest.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: e */
        public ActivityResult c(int i11, Intent intent) {
            return new ActivityResult(i11, intent);
        }
    }

    private static class m implements p {

        /* renamed from: a  reason: collision with root package name */
        private final Lifecycle f10361a;

        /* renamed from: b  reason: collision with root package name */
        private final p f10362b;

        /* renamed from: c  reason: collision with root package name */
        private final androidx.lifecycle.o f10363c;

        m(Lifecycle lifecycle, p pVar, androidx.lifecycle.o oVar) {
            this.f10361a = lifecycle;
            this.f10362b = pVar;
            this.f10363c = oVar;
        }

        public void a(String str, Bundle bundle) {
            this.f10362b.a(str, bundle);
        }

        public boolean b(Lifecycle.State state) {
            return this.f10361a.b().isAtLeast(state);
        }

        public void c() {
            this.f10361a.c(this.f10363c);
        }
    }

    public interface n {
        void a();
    }

    interface o {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class p implements o {

        /* renamed from: a  reason: collision with root package name */
        final String f10364a;

        /* renamed from: b  reason: collision with root package name */
        final int f10365b;

        /* renamed from: c  reason: collision with root package name */
        final int f10366c;

        p(String str, int i11, int i12) {
            this.f10364a = str;
            this.f10365b = i11;
            this.f10366c = i12;
        }

        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f10336u;
            if (fragment != null && this.f10365b < 0 && this.f10364a == null && fragment.getChildFragmentManager().d1()) {
                return false;
            }
            return FragmentManager.this.f1(arrayList, arrayList2, this.f10364a, this.f10365b, this.f10366c);
        }
    }

    static class q implements Fragment.k {

        /* renamed from: a  reason: collision with root package name */
        final boolean f10368a;

        /* renamed from: b  reason: collision with root package name */
        final a f10369b;

        /* renamed from: c  reason: collision with root package name */
        private int f10370c;

        q(a aVar, boolean z11) {
            this.f10368a = z11;
            this.f10369b = aVar;
        }

        public void a() {
            this.f10370c++;
        }

        public void b() {
            int i11 = this.f10370c - 1;
            this.f10370c = i11;
            if (i11 == 0) {
                this.f10369b.t.s1();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            a aVar = this.f10369b;
            aVar.t.v(aVar, this.f10368a, false, false);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            boolean z11 = this.f10370c > 0;
            for (Fragment next : this.f10369b.t.w0()) {
                next.setOnStartEnterTransitionListener((Fragment.k) null);
                if (z11 && next.isPostponed()) {
                    next.startPostponedEnterTransition();
                }
            }
            a aVar = this.f10369b;
            aVar.t.v(aVar, this.f10368a, !z11, true);
        }

        public boolean e() {
            return this.f10370c == 0;
        }
    }

    private void A1() {
        for (q Z0 : this.f10323c.k()) {
            Z0(Z0);
        }
    }

    private void B1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new x("FragmentManager"));
        h<?> hVar = this.f10334r;
        if (hVar != null) {
            try {
                hVar.h("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e11) {
                Log.e("FragmentManager", "Failed dumping state", e11);
            }
        } else {
            try {
                Y("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e12) {
                Log.e("FragmentManager", "Failed dumping state", e12);
            }
        }
        throw runtimeException;
    }

    static Fragment D0(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (p0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (M0(r3.t) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f10328h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void D1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$o> r0 = r3.f10321a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$o> r1 = r3.f10321a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.e r1 = r3.f10328h     // Catch:{ all -> 0x002a }
            r1.f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.e r0 = r3.f10328h
            int r1 = r3.p0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.t
            boolean r1 = r3.M0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.D1():void");
    }

    static boolean J0(int i11) {
        return O || Log.isLoggable("FragmentManager", i11);
    }

    private boolean K0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.p();
    }

    private void N(Fragment fragment) {
        if (fragment != null && fragment.equals(i0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    private void S0(androidx.collection.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment k11 = bVar.k(i11);
            if (!k11.mAdded) {
                View requireView = k11.requireView();
                k11.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void U(int i11) {
        try {
            this.f10322b = true;
            this.f10323c.d(i11);
            U0(i11, false);
            if (P) {
                for (SpecialEffectsController j11 : t()) {
                    j11.j();
                }
            }
            this.f10322b = false;
            c0(true);
        } catch (Throwable th2) {
            this.f10322b = false;
            throw th2;
        }
    }

    private void X() {
        if (this.H) {
            this.H = false;
            A1();
        }
    }

    private void Z() {
        if (P) {
            for (SpecialEffectsController j11 : t()) {
                j11.j();
            }
        } else if (!this.f10331m.isEmpty()) {
            for (Fragment next : this.f10331m.keySet()) {
                o(next);
                V0(next);
            }
        }
    }

    private void b0(boolean z11) {
        if (this.f10322b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f10334r == null) {
            if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f10334r.g().getLooper()) {
            if (!z11) {
                q();
            }
            if (this.I == null) {
                this.I = new ArrayList<>();
                this.J = new ArrayList<>();
            }
            this.f10322b = true;
            try {
                h0((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f10322b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private void d(androidx.collection.b<Fragment> bVar) {
        int i11 = this.q;
        if (i11 >= 1) {
            int min = Math.min(i11, 5);
            for (Fragment next : this.f10323c.n()) {
                if (next.mState < min) {
                    W0(next, min);
                    if (next.mView != null && !next.mHidden && next.mIsNewlyAdded) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    private static void e0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        while (i11 < i12) {
            a aVar = arrayList.get(i11);
            boolean z11 = true;
            if (arrayList2.get(i11).booleanValue()) {
                aVar.D(-1);
                if (i11 != i12 - 1) {
                    z11 = false;
                }
                aVar.I(z11);
            } else {
                aVar.D(1);
                aVar.H();
            }
            i11++;
        }
    }

    private boolean e1(String str, int i11, int i12) {
        c0(false);
        b0(true);
        Fragment fragment = this.f10336u;
        if (fragment != null && i11 < 0 && str == null && fragment.getChildFragmentManager().d1()) {
            return true;
        }
        boolean f12 = f1(this.I, this.J, str, i11, i12);
        if (f12) {
            this.f10322b = true;
            try {
                l1(this.I, this.J);
            } finally {
                r();
            }
        }
        D1();
        X();
        this.f10323c.b();
        return f12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f0(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r15 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            boolean r2 = r0.f10527r
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.K = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            androidx.fragment.app.r r1 = r6.f10323c
            java.util.List r1 = r1.n()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r17.B0()
            r1 = 0
            r7 = r4
            r16 = 0
        L_0x0034:
            r14 = 1
            if (r7 >= r3) goto L_0x0065
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.a) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0050
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.K
            androidx.fragment.app.Fragment r0 = r8.J(r9, r0)
            goto L_0x0056
        L_0x0050:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.K
            androidx.fragment.app.Fragment r0 = r8.Q(r9, r0)
        L_0x0056:
            if (r16 != 0) goto L_0x0060
            boolean r8 = r8.f10522i
            if (r8 == 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r16 = 0
            goto L_0x0062
        L_0x0060:
            r16 = 1
        L_0x0062:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0065:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            r0.clear()
            if (r2 != 0) goto L_0x00bd
            int r0 = r6.q
            if (r0 < r14) goto L_0x00bd
            boolean r0 = P
            if (r0 == 0) goto L_0x00a4
            r0 = r4
        L_0x0075:
            if (r0 >= r3) goto L_0x00bd
            java.lang.Object r1 = r15.get(r0)
            androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
            java.util.ArrayList<androidx.fragment.app.s$a> r1 = r1.f10516c
            java.util.Iterator r1 = r1.iterator()
        L_0x0083:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00a1
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.s$a r7 = (androidx.fragment.app.s.a) r7
            androidx.fragment.app.Fragment r7 = r7.f10530b
            if (r7 == 0) goto L_0x0083
            androidx.fragment.app.FragmentManager r8 = r7.mFragmentManager
            if (r8 == 0) goto L_0x0083
            androidx.fragment.app.q r7 = r6.x(r7)
            androidx.fragment.app.r r8 = r6.f10323c
            r8.p(r7)
            goto L_0x0083
        L_0x00a1:
            int r0 = r0 + 1
            goto L_0x0075
        L_0x00a4:
            androidx.fragment.app.h<?> r0 = r6.f10334r
            android.content.Context r7 = r0.f()
            androidx.fragment.app.e r8 = r6.f10335s
            r13 = 0
            androidx.fragment.app.t$g r0 = r6.n
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r1 = 1
            r14 = r0
            androidx.fragment.app.t.B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00be
        L_0x00bd:
            r1 = 1
        L_0x00be:
            e0(r18, r19, r20, r21)
            boolean r0 = P
            if (r0 == 0) goto L_0x0143
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = r4
        L_0x00d2:
            if (r2 >= r3) goto L_0x011c
            java.lang.Object r7 = r15.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            if (r0 == 0) goto L_0x00fb
            java.util.ArrayList<androidx.fragment.app.s$a> r8 = r7.f10516c
            int r8 = r8.size()
            int r8 = r8 - r1
        L_0x00e3:
            if (r8 < 0) goto L_0x0119
            java.util.ArrayList<androidx.fragment.app.s$a> r9 = r7.f10516c
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.s$a r9 = (androidx.fragment.app.s.a) r9
            androidx.fragment.app.Fragment r9 = r9.f10530b
            if (r9 == 0) goto L_0x00f8
            androidx.fragment.app.q r9 = r6.x(r9)
            r9.m()
        L_0x00f8:
            int r8 = r8 + -1
            goto L_0x00e3
        L_0x00fb:
            java.util.ArrayList<androidx.fragment.app.s$a> r7 = r7.f10516c
            java.util.Iterator r7 = r7.iterator()
        L_0x0101:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0119
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.s$a r8 = (androidx.fragment.app.s.a) r8
            androidx.fragment.app.Fragment r8 = r8.f10530b
            if (r8 == 0) goto L_0x0101
            androidx.fragment.app.q r8 = r6.x(r8)
            r8.m()
            goto L_0x0101
        L_0x0119:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x011c:
            int r2 = r6.q
            r6.U0(r2, r1)
            java.util.Set r1 = r6.u(r15, r4, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0129:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2
            r2.r(r0)
            r2.p()
            r2.g()
            goto L_0x0129
        L_0x013f:
            r0 = r3
            r3 = r5
            goto L_0x0199
        L_0x0143:
            if (r2 == 0) goto L_0x0165
            androidx.collection.b r7 = new androidx.collection.b
            r7.<init>()
            r6.d(r7)
            r0 = r17
            r14 = 1
            r1 = r18
            r8 = r2
            r2 = r19
            r13 = r3
            r3 = r20
            r12 = r4
            r4 = r21
            r11 = r5
            r5 = r7
            int r0 = r0.g1(r1, r2, r3, r4, r5)
            r6.S0(r7)
            goto L_0x016b
        L_0x0165:
            r8 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r14 = 1
            r0 = r13
        L_0x016b:
            if (r0 == r12) goto L_0x0197
            if (r8 == 0) goto L_0x0197
            int r1 = r6.q
            if (r1 < r14) goto L_0x018e
            androidx.fragment.app.h<?> r1 = r6.f10334r
            android.content.Context r7 = r1.f()
            androidx.fragment.app.e r8 = r6.f10335s
            r1 = 1
            androidx.fragment.app.t$g r2 = r6.n
            r9 = r18
            r10 = r19
            r3 = r11
            r11 = r20
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = 1
            r14 = r2
            androidx.fragment.app.t.B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0191
        L_0x018e:
            r3 = r11
            r0 = r13
            r1 = 1
        L_0x0191:
            int r2 = r6.q
            r6.U0(r2, r1)
            goto L_0x0199
        L_0x0197:
            r3 = r11
            r0 = r13
        L_0x0199:
            r1 = r20
        L_0x019b:
            if (r1 >= r0) goto L_0x01bc
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.a) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01b6
            int r4 = r2.v
            if (r4 < 0) goto L_0x01b6
            r4 = -1
            r2.v = r4
        L_0x01b6:
            r2.O()
            int r1 = r1 + 1
            goto L_0x019b
        L_0x01bc:
            if (r16 == 0) goto L_0x01c1
            r17.n1()
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.f0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private int g1(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12, androidx.collection.b<Fragment> bVar) {
        int i13 = i12;
        for (int i14 = i12 - 1; i14 >= i11; i14--) {
            a aVar = arrayList.get(i14);
            boolean booleanValue = arrayList2.get(i14).booleanValue();
            if (aVar.N() && !aVar.L(arrayList, i14 + 1, i12)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                q qVar = new q(aVar, booleanValue);
                this.L.add(qVar);
                aVar.P(qVar);
                if (booleanValue) {
                    aVar.H();
                } else {
                    aVar.I(false);
                }
                i13--;
                if (i14 != i13) {
                    arrayList.remove(i14);
                    arrayList.add(i13, aVar);
                }
                d(bVar);
            }
        }
        return i13;
    }

    private void h0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<q> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i11 = 0;
        while (i11 < size) {
            q qVar = this.L.get(i11);
            if (arrayList != null && !qVar.f10368a && (indexOf2 = arrayList.indexOf(qVar.f10369b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.L.remove(i11);
                i11--;
                size--;
                qVar.c();
            } else if (qVar.e() || (arrayList != null && qVar.f10369b.L(arrayList, 0, arrayList.size()))) {
                this.L.remove(i11);
                i11--;
                size--;
                if (arrayList == null || qVar.f10368a || (indexOf = arrayList.indexOf(qVar.f10369b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    qVar.d();
                } else {
                    qVar.c();
                }
            }
            i11++;
        }
    }

    private void l1(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                h0(arrayList, arrayList2);
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i11 < size) {
                    if (!arrayList.get(i11).f10527r) {
                        if (i12 != i11) {
                            f0(arrayList, arrayList2, i12, i11);
                        }
                        i12 = i11 + 1;
                        if (arrayList2.get(i11).booleanValue()) {
                            while (i12 < size && arrayList2.get(i12).booleanValue() && !arrayList.get(i12).f10527r) {
                                i12++;
                            }
                        }
                        f0(arrayList, arrayList2, i11, i12);
                        i11 = i12 - 1;
                    }
                    i11++;
                }
                if (i12 != size) {
                    f0(arrayList, arrayList2, i12, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void m0() {
        if (P) {
            for (SpecialEffectsController k11 : t()) {
                k11.k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    private boolean n0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f10321a) {
            if (this.f10321a.isEmpty()) {
                return false;
            }
            int size = this.f10321a.size();
            boolean z11 = false;
            for (int i11 = 0; i11 < size; i11++) {
                z11 |= this.f10321a.get(i11).a(arrayList, arrayList2);
            }
            this.f10321a.clear();
            this.f10334r.g().removeCallbacks(this.N);
            return z11;
        }
    }

    private void n1() {
        if (this.f10330l != null) {
            for (int i11 = 0; i11 < this.f10330l.size(); i11++) {
                this.f10330l.get(i11).a();
            }
        }
    }

    private void o(Fragment fragment) {
        HashSet hashSet = this.f10331m.get(fragment);
        if (hashSet != null) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((androidx.core.os.c) it2.next()).a();
            }
            hashSet.clear();
            y(fragment);
            this.f10331m.remove(fragment);
        }
    }

    static int p1(int i11) {
        if (i11 == 4097) {
            return 8194;
        }
        if (i11 != 4099) {
            return i11 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void q() {
        if (O0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private m q0(Fragment fragment) {
        return this.M.n1(fragment);
    }

    private void r() {
        this.f10322b = false;
        this.J.clear();
        this.I.clear();
    }

    private Set<SpecialEffectsController> t() {
        HashSet hashSet = new HashSet();
        for (q k11 : this.f10323c.k()) {
            ViewGroup viewGroup = k11.k().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.o(viewGroup, C0()));
            }
        }
        return hashSet;
    }

    private ViewGroup t0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f10335s.d()) {
            View c11 = this.f10335s.c(fragment.mContainerId);
            if (c11 instanceof ViewGroup) {
                return (ViewGroup) c11;
            }
        }
        return null;
    }

    private Set<SpecialEffectsController> u(ArrayList<a> arrayList, int i11, int i12) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i11 < i12) {
            Iterator<s.a> it2 = arrayList.get(i11).f10516c.iterator();
            while (it2.hasNext()) {
                Fragment fragment = it2.next().f10530b;
                if (!(fragment == null || (viewGroup = fragment.mContainer) == null)) {
                    hashSet.add(SpecialEffectsController.n(viewGroup, this));
                }
            }
            i11++;
        }
        return hashSet;
    }

    private void w(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            d.C0063d c11 = d.c(this.f10334r.f(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (c11 == null || (animator = c11.f10472b) == null) {
                if (c11 != null) {
                    fragment.mView.startAnimation(c11.f10471a);
                    c11.f10471a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    c11.f10472b.addListener(new h(viewGroup, view, fragment));
                }
                c11.f10472b.start();
            }
        }
        H0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    private void y(Fragment fragment) {
        fragment.performDestroyView();
        this.f10332o.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.q(null);
        fragment.mInLayout = false;
    }

    private void y1(Fragment fragment) {
        ViewGroup t02 = t0(fragment);
        if (t02 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i11 = R.id.visible_removing_fragment_view_tag;
            if (t02.getTag(i11) == null) {
                t02.setTag(i11, fragment);
            }
            ((Fragment) t02.getTag(i11)).setPopDirection(fragment.getPopDirection());
        }
    }

    /* access modifiers changed from: package-private */
    public void A() {
        this.E = false;
        this.F = false;
        this.M.t1(false);
        U(4);
    }

    /* access modifiers changed from: package-private */
    public Fragment A0() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public void B() {
        this.E = false;
        this.F = false;
        this.M.t1(false);
        U(0);
    }

    public Fragment B0() {
        return this.f10336u;
    }

    /* access modifiers changed from: package-private */
    public void C(Configuration configuration) {
        for (Fragment next : this.f10323c.n()) {
            if (next != null) {
                next.performConfigurationChanged(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public y C0() {
        y yVar = this.f10338x;
        if (yVar != null) {
            return yVar;
        }
        Fragment fragment = this.t;
        if (fragment != null) {
            return fragment.mFragmentManager.C0();
        }
        return this.f10339y;
    }

    public void C1(FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        this.f10332o.p(fragmentLifecycleCallbacks);
    }

    /* access modifiers changed from: package-private */
    public boolean D(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment next : this.f10323c.n()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void E() {
        this.E = false;
        this.F = false;
        this.M.t1(false);
        U(1);
    }

    /* access modifiers changed from: package-private */
    public o0 E0(Fragment fragment) {
        return this.M.q1(fragment);
    }

    /* access modifiers changed from: package-private */
    public boolean F(Menu menu, MenuInflater menuInflater) {
        if (this.q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z11 = false;
        for (Fragment next : this.f10323c.n()) {
            if (next != null && L0(next) && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z11 = true;
            }
        }
        if (this.f10325e != null) {
            for (int i11 = 0; i11 < this.f10325e.size(); i11++) {
                Fragment fragment = this.f10325e.get(i11);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.f10325e = arrayList;
        return z11;
    }

    /* access modifiers changed from: package-private */
    public void F0() {
        c0(true);
        if (this.f10328h.c()) {
            d1();
        } else {
            this.f10327g.f();
        }
    }

    /* access modifiers changed from: package-private */
    public void G() {
        this.G = true;
        c0(true);
        Z();
        U(-1);
        this.f10334r = null;
        this.f10335s = null;
        this.t = null;
        if (this.f10327g != null) {
            this.f10328h.d();
            this.f10327g = null;
        }
        androidx.activity.result.b<Intent> bVar = this.f10340z;
        if (bVar != null) {
            bVar.c();
            this.A.c();
            this.B.c();
        }
    }

    /* access modifiers changed from: package-private */
    public void G0(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            y1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        U(1);
    }

    /* access modifiers changed from: package-private */
    public void H0(Fragment fragment) {
        if (fragment.mAdded && K0(fragment)) {
            this.D = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void I() {
        for (Fragment next : this.f10323c.n()) {
            if (next != null) {
                next.performLowMemory();
            }
        }
    }

    public boolean I0() {
        return this.G;
    }

    /* access modifiers changed from: package-private */
    public void J(boolean z11) {
        for (Fragment next : this.f10323c.n()) {
            if (next != null) {
                next.performMultiWindowModeChanged(z11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void K(Fragment fragment) {
        Iterator<n> it2 = this.f10333p.iterator();
        while (it2.hasNext()) {
            it2.next().a(this, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean L(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment next : this.f10323c.n()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean L0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* access modifiers changed from: package-private */
    public void M(Menu menu) {
        if (this.q >= 1) {
            for (Fragment next : this.f10323c.n()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean M0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(fragmentManager.B0()) || !M0(fragmentManager.t)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean N0(int i11) {
        return this.q >= i11;
    }

    /* access modifiers changed from: package-private */
    public void O() {
        U(5);
    }

    public boolean O0() {
        return this.E || this.F;
    }

    /* access modifiers changed from: package-private */
    public void P(boolean z11) {
        for (Fragment next : this.f10323c.n()) {
            if (next != null) {
                next.performPictureInPictureModeChanged(z11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void P0(Fragment fragment, String[] strArr, int i11) {
        if (this.B != null) {
            this.C.addLast(new LaunchedFragmentInfo(fragment.mWho, i11));
            this.B.a(strArr);
            return;
        }
        this.f10334r.k(fragment, strArr, i11);
    }

    /* access modifiers changed from: package-private */
    public boolean Q(Menu menu) {
        boolean z11 = false;
        if (this.q < 1) {
            return false;
        }
        for (Fragment next : this.f10323c.n()) {
            if (next != null && L0(next) && next.performPrepareOptionsMenu(menu)) {
                z11 = true;
            }
        }
        return z11;
    }

    /* access modifiers changed from: package-private */
    public void Q0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i11, Bundle bundle) {
        if (this.f10340z != null) {
            this.C.addLast(new LaunchedFragmentInfo(fragment.mWho, i11));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f10340z.a(intent);
            return;
        }
        this.f10334r.n(fragment, intent, i11, bundle);
    }

    /* access modifiers changed from: package-private */
    public void R() {
        D1();
        N(this.f10336u);
    }

    /* access modifiers changed from: package-private */
    public void R0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        if (this.A != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (J0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle2 + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            IntentSenderRequest a11 = new IntentSenderRequest.b(intentSender).b(intent2).c(i13, i12).a();
            int i15 = i11;
            this.C.addLast(new LaunchedFragmentInfo(fragment2.mWho, i11));
            if (J0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.A.a(a11);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i16 = i11;
        int i17 = i12;
        int i18 = i13;
        this.f10334r.o(fragment, intentSender, i11, intent, i12, i13, i14, bundle);
    }

    /* access modifiers changed from: package-private */
    public void S() {
        this.E = false;
        this.F = false;
        this.M.t1(false);
        U(7);
    }

    /* access modifiers changed from: package-private */
    public void T() {
        this.E = false;
        this.F = false;
        this.M.t1(false);
        U(5);
    }

    /* access modifiers changed from: package-private */
    public void T0(Fragment fragment) {
        if (this.f10323c.c(fragment.mWho)) {
            V0(fragment);
            View view = fragment.mView;
            if (!(view == null || !fragment.mIsNewlyAdded || fragment.mContainer == null)) {
                float f11 = fragment.mPostponedAlpha;
                if (f11 > 0.0f) {
                    view.setAlpha(f11);
                }
                fragment.mPostponedAlpha = 0.0f;
                fragment.mIsNewlyAdded = false;
                d.C0063d c11 = d.c(this.f10334r.f(), fragment, true, fragment.getPopDirection());
                if (c11 != null) {
                    Animation animation = c11.f10471a;
                    if (animation != null) {
                        fragment.mView.startAnimation(animation);
                    } else {
                        c11.f10472b.setTarget(fragment.mView);
                        c11.f10472b.start();
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                w(fragment);
            }
        } else if (J0(3)) {
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.q + "since it is not added to " + this);
        }
    }

    /* access modifiers changed from: package-private */
    public void U0(int i11, boolean z11) {
        h<?> hVar;
        if (this.f10334r == null && i11 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z11 || i11 != this.q) {
            this.q = i11;
            if (P) {
                this.f10323c.r();
            } else {
                for (Fragment T0 : this.f10323c.n()) {
                    T0(T0);
                }
                for (q next : this.f10323c.k()) {
                    Fragment k11 = next.k();
                    if (!k11.mIsNewlyAdded) {
                        T0(k11);
                    }
                    if (k11.mRemoving && !k11.isInBackStack()) {
                        this.f10323c.q(next);
                    }
                }
            }
            A1();
            if (this.D && (hVar = this.f10334r) != null && this.q == 7) {
                hVar.p();
                this.D = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void V() {
        this.F = true;
        this.M.t1(true);
        U(4);
    }

    /* access modifiers changed from: package-private */
    public void V0(Fragment fragment) {
        W0(fragment, this.q);
    }

    /* access modifiers changed from: package-private */
    public void W() {
        U(2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r2 != 5) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void W0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            r10 = this;
            androidx.fragment.app.r r0 = r10.f10323c
            java.lang.String r1 = r11.mWho
            androidx.fragment.app.q r0 = r0.m(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0017
            androidx.fragment.app.q r0 = new androidx.fragment.app.q
            androidx.fragment.app.k r2 = r10.f10332o
            androidx.fragment.app.r r3 = r10.f10323c
            r0.<init>(r2, r3, r11)
            r0.u(r1)
        L_0x0017:
            boolean r2 = r11.mFromLayout
            r3 = 2
            if (r2 == 0) goto L_0x0028
            boolean r2 = r11.mInLayout
            if (r2 == 0) goto L_0x0028
            int r2 = r11.mState
            if (r2 != r3) goto L_0x0028
            int r12 = java.lang.Math.max(r12, r3)
        L_0x0028:
            int r2 = r0.d()
            int r12 = java.lang.Math.min(r12, r2)
            int r2 = r11.mState
            r4 = 3
            java.lang.String r5 = "FragmentManager"
            r6 = -1
            r7 = 5
            r8 = 4
            if (r2 > r12) goto L_0x007c
            if (r2 >= r12) goto L_0x0047
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.c>> r2 = r10.f10331m
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0047
            r10.o(r11)
        L_0x0047:
            int r2 = r11.mState
            if (r2 == r6) goto L_0x0057
            if (r2 == 0) goto L_0x005c
            if (r2 == r1) goto L_0x0061
            if (r2 == r3) goto L_0x006b
            if (r2 == r8) goto L_0x0070
            if (r2 == r7) goto L_0x0075
            goto L_0x0164
        L_0x0057:
            if (r12 <= r6) goto L_0x005c
            r0.c()
        L_0x005c:
            if (r12 <= 0) goto L_0x0061
            r0.e()
        L_0x0061:
            if (r12 <= r6) goto L_0x0066
            r0.j()
        L_0x0066:
            if (r12 <= r1) goto L_0x006b
            r0.f()
        L_0x006b:
            if (r12 <= r3) goto L_0x0070
            r0.a()
        L_0x0070:
            if (r12 <= r8) goto L_0x0075
            r0.v()
        L_0x0075:
            if (r12 <= r7) goto L_0x0164
            r0.p()
            goto L_0x0164
        L_0x007c:
            if (r2 <= r12) goto L_0x0164
            if (r2 == 0) goto L_0x015d
            if (r2 == r1) goto L_0x014f
            if (r2 == r3) goto L_0x00c6
            if (r2 == r8) goto L_0x0097
            if (r2 == r7) goto L_0x0092
            r9 = 7
            if (r2 == r9) goto L_0x008d
            goto L_0x0164
        L_0x008d:
            if (r12 >= r9) goto L_0x0092
            r0.n()
        L_0x0092:
            if (r12 >= r7) goto L_0x0097
            r0.w()
        L_0x0097:
            if (r12 >= r8) goto L_0x00c6
            boolean r2 = J0(r4)
            if (r2 == 0) goto L_0x00b3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "movefrom ACTIVITY_CREATED: "
            r2.append(r7)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x00b3:
            android.view.View r2 = r11.mView
            if (r2 == 0) goto L_0x00c6
            androidx.fragment.app.h<?> r2 = r10.f10334r
            boolean r2 = r2.l(r11)
            if (r2 == 0) goto L_0x00c6
            android.util.SparseArray<android.os.Parcelable> r2 = r11.mSavedViewState
            if (r2 != 0) goto L_0x00c6
            r0.t()
        L_0x00c6:
            if (r12 >= r3) goto L_0x014f
            r2 = 0
            android.view.View r7 = r11.mView
            if (r7 == 0) goto L_0x0144
            android.view.ViewGroup r8 = r11.mContainer
            if (r8 == 0) goto L_0x0144
            r8.endViewTransition(r7)
            android.view.View r7 = r11.mView
            r7.clearAnimation()
            boolean r7 = r11.isRemovingParent()
            if (r7 != 0) goto L_0x0144
            int r7 = r10.q
            r8 = 0
            if (r7 <= r6) goto L_0x0105
            boolean r6 = r10.G
            if (r6 != 0) goto L_0x0105
            android.view.View r6 = r11.mView
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0105
            float r6 = r11.mPostponedAlpha
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0105
            androidx.fragment.app.h<?> r2 = r10.f10334r
            android.content.Context r2 = r2.f()
            r6 = 0
            boolean r7 = r11.getPopDirection()
            androidx.fragment.app.d$d r2 = androidx.fragment.app.d.c(r2, r11, r6, r7)
        L_0x0105:
            r11.mPostponedAlpha = r8
            android.view.ViewGroup r6 = r11.mContainer
            android.view.View r7 = r11.mView
            if (r2 == 0) goto L_0x0112
            androidx.fragment.app.t$g r8 = r10.n
            androidx.fragment.app.d.a(r11, r2, r8)
        L_0x0112:
            r6.removeView(r7)
            boolean r2 = J0(r3)
            if (r2 == 0) goto L_0x013f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Removing view "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " for fragment "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " from container "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r5, r2)
        L_0x013f:
            android.view.ViewGroup r2 = r11.mContainer
            if (r6 == r2) goto L_0x0144
            return
        L_0x0144:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.c>> r2 = r10.f10331m
            java.lang.Object r2 = r2.get(r11)
            if (r2 != 0) goto L_0x014f
            r0.h()
        L_0x014f:
            if (r12 >= r1) goto L_0x015d
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.c>> r2 = r10.f10331m
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x015a
            goto L_0x015e
        L_0x015a:
            r0.g()
        L_0x015d:
            r1 = r12
        L_0x015e:
            if (r1 >= 0) goto L_0x0163
            r0.i()
        L_0x0163:
            r12 = r1
        L_0x0164:
            int r0 = r11.mState
            if (r0 == r12) goto L_0x0196
            boolean r0 = J0(r4)
            if (r0 == 0) goto L_0x0194
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r11.mState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r5, r0)
        L_0x0194:
            r11.mState = r12
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.W0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    public void X0() {
        if (this.f10334r != null) {
            this.E = false;
            this.F = false;
            this.M.t1(false);
            for (Fragment next : this.f10323c.n()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    public void Y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f10323c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f10325e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f10325e.get(i11).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f10324d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                a aVar = this.f10324d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.F(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f10329i.get());
        synchronized (this.f10321a) {
            int size3 = this.f10321a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size3; i13++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println(this.f10321a.get(i13));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f10334r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f10335s);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    /* access modifiers changed from: package-private */
    public void Y0(FragmentContainerView fragmentContainerView) {
        View view;
        for (q next : this.f10323c.k()) {
            Fragment k11 = next.k();
            if (k11.mContainerId == fragmentContainerView.getId() && (view = k11.mView) != null && view.getParent() == null) {
                k11.mContainer = fragmentContainerView;
                next.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Z0(q qVar) {
        Fragment k11 = qVar.k();
        if (!k11.mDeferStart) {
            return;
        }
        if (this.f10322b) {
            this.H = true;
            return;
        }
        k11.mDeferStart = false;
        if (P) {
            qVar.m();
        } else {
            V0(k11);
        }
    }

    /* access modifiers changed from: package-private */
    public void a0(o oVar, boolean z11) {
        if (!z11) {
            if (this.f10334r != null) {
                q();
            } else if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f10321a) {
            if (this.f10334r != null) {
                this.f10321a.add(oVar);
                s1();
            } else if (!z11) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void a1() {
        a0(new p((String) null, -1, 0), false);
    }

    public void b1(int i11, int i12) {
        if (i11 >= 0) {
            a0(new p((String) null, i11, i12), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i11);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean c0(boolean z11) {
        b0(z11);
        boolean z12 = false;
        while (n0(this.I, this.J)) {
            this.f10322b = true;
            try {
                l1(this.I, this.J);
                r();
                z12 = true;
            } catch (Throwable th2) {
                r();
                throw th2;
            }
        }
        D1();
        X();
        this.f10323c.b();
        return z12;
    }

    public void c1(String str, int i11) {
        a0(new p(str, -1, i11), false);
    }

    /* access modifiers changed from: package-private */
    public void d0(o oVar, boolean z11) {
        if (!z11 || (this.f10334r != null && !this.G)) {
            b0(z11);
            if (oVar.a(this.I, this.J)) {
                this.f10322b = true;
                try {
                    l1(this.I, this.J);
                } finally {
                    r();
                }
            }
            D1();
            X();
            this.f10323c.b();
        }
    }

    public boolean d1() {
        return e1((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        if (this.f10324d == null) {
            this.f10324d = new ArrayList<>();
        }
        this.f10324d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment, androidx.core.os.c cVar) {
        if (this.f10331m.get(fragment) == null) {
            this.f10331m.put(fragment, new HashSet());
        }
        this.f10331m.get(fragment).add(cVar);
    }

    /* access modifiers changed from: package-private */
    public boolean f1(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i11, int i12) {
        int i13;
        ArrayList<a> arrayList3 = this.f10324d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i11 < 0 && (i12 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f10324d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i11 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.f10324d.get(size2);
                    if ((str != null && str.equals(aVar.getName())) || (i11 >= 0 && i11 == aVar.v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i12 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.f10324d.get(size2);
                        if ((str == null || !str.equals(aVar2.getName())) && (i11 < 0 || i11 != aVar2.v)) {
                            break;
                        }
                    }
                }
                i13 = size2;
            } else {
                i13 = -1;
            }
            if (i13 == this.f10324d.size() - 1) {
                return false;
            }
            for (int size3 = this.f10324d.size() - 1; size3 > i13; size3--) {
                arrayList.add(this.f10324d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public q g(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        q x11 = x(fragment);
        fragment.mFragmentManager = this;
        this.f10323c.p(x11);
        if (!fragment.mDetached) {
            this.f10323c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (K0(fragment)) {
                this.D = true;
            }
        }
        return x11;
    }

    public boolean g0() {
        boolean c02 = c0(true);
        m0();
        return c02;
    }

    public void h(n nVar) {
        this.f10333p.add(nVar);
    }

    public void h1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            B1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public void i(n nVar) {
        if (this.f10330l == null) {
            this.f10330l = new ArrayList<>();
        }
        this.f10330l.add(nVar);
    }

    /* access modifiers changed from: package-private */
    public Fragment i0(String str) {
        return this.f10323c.f(str);
    }

    public void i1(FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z11) {
        this.f10332o.o(fragmentLifecycleCallbacks, z11);
    }

    /* access modifiers changed from: package-private */
    public void j(Fragment fragment) {
        this.M.k1(fragment);
    }

    public Fragment j0(int i11) {
        return this.f10323c.g(i11);
    }

    /* access modifiers changed from: package-private */
    public void j1(Fragment fragment, androidx.core.os.c cVar) {
        HashSet hashSet = this.f10331m.get(fragment);
        if (hashSet != null && hashSet.remove(cVar) && hashSet.isEmpty()) {
            this.f10331m.remove(fragment);
            if (fragment.mState < 5) {
                y(fragment);
                V0(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f10329i.getAndIncrement();
    }

    public Fragment k0(String str) {
        return this.f10323c.h(str);
    }

    /* access modifiers changed from: package-private */
    public void k1(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z11 = !fragment.isInBackStack();
        if (!fragment.mDetached || z11) {
            this.f10323c.s(fragment);
            if (K0(fragment)) {
                this.D = true;
            }
            fragment.mRemoving = true;
            y1(fragment);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: androidx.activity.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(androidx.fragment.app.h<?> r3, androidx.fragment.app.e r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.h<?> r0 = r2.f10334r
            if (r0 != 0) goto L_0x0108
            r2.f10334r = r3
            r2.f10335s = r4
            r2.t = r5
            if (r5 == 0) goto L_0x0015
            androidx.fragment.app.FragmentManager$i r4 = new androidx.fragment.app.FragmentManager$i
            r4.<init>(r5)
            r2.h(r4)
            goto L_0x001f
        L_0x0015:
            boolean r4 = r3 instanceof androidx.fragment.app.n
            if (r4 == 0) goto L_0x001f
            r4 = r3
            androidx.fragment.app.n r4 = (androidx.fragment.app.n) r4
            r2.h(r4)
        L_0x001f:
            androidx.fragment.app.Fragment r4 = r2.t
            if (r4 == 0) goto L_0x0026
            r2.D1()
        L_0x0026:
            boolean r4 = r3 instanceof androidx.activity.i
            if (r4 == 0) goto L_0x003b
            r4 = r3
            androidx.activity.i r4 = (androidx.activity.i) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.f10327g = r0
            if (r5 == 0) goto L_0x0036
            r4 = r5
        L_0x0036:
            androidx.activity.e r1 = r2.f10328h
            r0.b(r4, r1)
        L_0x003b:
            if (r5 == 0) goto L_0x0046
            androidx.fragment.app.FragmentManager r3 = r5.mFragmentManager
            androidx.fragment.app.m r3 = r3.q0(r5)
            r2.M = r3
            goto L_0x005f
        L_0x0046:
            boolean r4 = r3 instanceof androidx.lifecycle.p0
            if (r4 == 0) goto L_0x0057
            androidx.lifecycle.p0 r3 = (androidx.lifecycle.p0) r3
            androidx.lifecycle.o0 r3 = r3.getViewModelStore()
            androidx.fragment.app.m r3 = androidx.fragment.app.m.o1(r3)
            r2.M = r3
            goto L_0x005f
        L_0x0057:
            androidx.fragment.app.m r3 = new androidx.fragment.app.m
            r4 = 0
            r3.<init>(r4)
            r2.M = r3
        L_0x005f:
            androidx.fragment.app.m r3 = r2.M
            boolean r4 = r2.O0()
            r3.t1(r4)
            androidx.fragment.app.r r3 = r2.f10323c
            androidx.fragment.app.m r4 = r2.M
            r3.x(r4)
            androidx.fragment.app.h<?> r3 = r2.f10334r
            boolean r4 = r3 instanceof androidx.activity.result.c
            if (r4 == 0) goto L_0x0107
            androidx.activity.result.c r3 = (androidx.activity.result.c) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.getActivityResultRegistry()
            if (r5 == 0) goto L_0x0091
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.mWho
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x0093
        L_0x0091:
            java.lang.String r4 = ""
        L_0x0093:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            e.d r0 = new e.d
            r0.<init>()
            androidx.fragment.app.FragmentManager$j r1 = new androidx.fragment.app.FragmentManager$j
            r1.<init>()
            androidx.activity.result.b r5 = r3.j(r5, r0, r1)
            r2.f10340z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.FragmentManager$l r0 = new androidx.fragment.app.FragmentManager$l
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>()
            androidx.activity.result.b r5 = r3.j(r5, r0, r1)
            r2.A = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            e.b r5 = new e.b
            r5.<init>()
            androidx.fragment.app.FragmentManager$b r0 = new androidx.fragment.app.FragmentManager$b
            r0.<init>()
            androidx.activity.result.b r3 = r3.j(r4, r5, r0)
            r2.B = r3
        L_0x0107:
            return
        L_0x0108:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.l(androidx.fragment.app.h, androidx.fragment.app.e, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    public Fragment l0(String str) {
        return this.f10323c.i(str);
    }

    /* access modifiers changed from: package-private */
    public void m(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f10323c.a(fragment);
                if (J0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (K0(fragment)) {
                    this.D = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m1(Fragment fragment) {
        this.M.s1(fragment);
    }

    public s n() {
        return new a(this);
    }

    public k o0(int i11) {
        return this.f10324d.get(i11);
    }

    /* access modifiers changed from: package-private */
    public void o1(Parcelable parcelable) {
        q qVar;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f10371a != null) {
                this.f10323c.t();
                Iterator<FragmentState> it2 = fragmentManagerState.f10371a.iterator();
                while (it2.hasNext()) {
                    FragmentState next = it2.next();
                    if (next != null) {
                        Fragment m12 = this.M.m1(next.f10380b);
                        if (m12 != null) {
                            if (J0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + m12);
                            }
                            qVar = new q(this.f10332o, this.f10323c, m12, next);
                        } else {
                            qVar = new q(this.f10332o, this.f10323c, this.f10334r.f().getClassLoader(), u0(), next);
                        }
                        Fragment k11 = qVar.k();
                        k11.mFragmentManager = this;
                        if (J0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k11.mWho + "): " + k11);
                        }
                        qVar.o(this.f10334r.f().getClassLoader());
                        this.f10323c.p(qVar);
                        qVar.u(this.q);
                    }
                }
                for (Fragment next2 : this.M.p1()) {
                    if (!this.f10323c.c(next2.mWho)) {
                        if (J0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + fragmentManagerState.f10371a);
                        }
                        this.M.s1(next2);
                        next2.mFragmentManager = this;
                        q qVar2 = new q(this.f10332o, this.f10323c, next2);
                        qVar2.u(1);
                        qVar2.m();
                        next2.mRemoving = true;
                        qVar2.m();
                    }
                }
                this.f10323c.u(fragmentManagerState.f10372b);
                if (fragmentManagerState.f10373c != null) {
                    this.f10324d = new ArrayList<>(fragmentManagerState.f10373c.length);
                    int i11 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr = fragmentManagerState.f10373c;
                        if (i11 >= backStackStateArr.length) {
                            break;
                        }
                        a a11 = backStackStateArr[i11].a(this);
                        if (J0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i11 + " (index " + a11.v + "): " + a11);
                            PrintWriter printWriter = new PrintWriter(new x("FragmentManager"));
                            a11.G("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f10324d.add(a11);
                        i11++;
                    }
                } else {
                    this.f10324d = null;
                }
                this.f10329i.set(fragmentManagerState.f10374d);
                String str = fragmentManagerState.f10375e;
                if (str != null) {
                    Fragment i02 = i0(str);
                    this.f10336u = i02;
                    N(i02);
                }
                ArrayList<String> arrayList = fragmentManagerState.f10376f;
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        Bundle bundle = fragmentManagerState.f10377g.get(i12);
                        bundle.setClassLoader(this.f10334r.f().getClassLoader());
                        this.j.put(arrayList.get(i12), bundle);
                    }
                }
                this.C = new ArrayDeque<>(fragmentManagerState.f10378h);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        boolean z11 = false;
        for (Fragment next : this.f10323c.l()) {
            if (next != null) {
                z11 = K0(next);
                continue;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public int p0() {
        ArrayList<a> arrayList = this.f10324d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public Parcelable q1() {
        int size;
        m0();
        Z();
        c0(true);
        this.E = true;
        this.M.t1(true);
        ArrayList<FragmentState> v11 = this.f10323c.v();
        BackStackState[] backStackStateArr = null;
        if (v11.isEmpty()) {
            if (J0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w11 = this.f10323c.w();
        ArrayList<a> arrayList = this.f10324d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i11 = 0; i11 < size; i11++) {
                backStackStateArr[i11] = new BackStackState(this.f10324d.get(i11));
                if (J0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i11 + ": " + this.f10324d.get(i11));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f10371a = v11;
        fragmentManagerState.f10372b = w11;
        fragmentManagerState.f10373c = backStackStateArr;
        fragmentManagerState.f10374d = this.f10329i.get();
        Fragment fragment = this.f10336u;
        if (fragment != null) {
            fragmentManagerState.f10375e = fragment.mWho;
        }
        fragmentManagerState.f10376f.addAll(this.j.keySet());
        fragmentManagerState.f10377g.addAll(this.j.values());
        fragmentManagerState.f10378h = new ArrayList<>(this.C);
        return fragmentManagerState;
    }

    /* access modifiers changed from: package-private */
    public e r0() {
        return this.f10335s;
    }

    public Fragment.SavedState r1(Fragment fragment) {
        q m11 = this.f10323c.m(fragment.mWho);
        if (m11 == null || !m11.k().equals(fragment)) {
            B1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return m11.r();
    }

    public final void s(String str) {
        this.j.remove(str);
    }

    public Fragment s0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment i02 = i0(string);
        if (i02 == null) {
            B1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return i02;
    }

    /* access modifiers changed from: package-private */
    public void s1() {
        synchronized (this.f10321a) {
            ArrayList<q> arrayList = this.L;
            boolean z11 = false;
            boolean z12 = arrayList != null && !arrayList.isEmpty();
            if (this.f10321a.size() == 1) {
                z11 = true;
            }
            if (z12 || z11) {
                this.f10334r.g().removeCallbacks(this.N);
                this.f10334r.g().post(this.N);
                D1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t1(Fragment fragment, boolean z11) {
        ViewGroup t02 = t0(fragment);
        if (t02 != null && (t02 instanceof FragmentContainerView)) {
            ((FragmentContainerView) t02).setDrawDisappearingViewsLast(!z11);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.t)));
            sb2.append("}");
        } else {
            h<?> hVar = this.f10334r;
            if (hVar != null) {
                sb2.append(hVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f10334r)));
                sb2.append("}");
            } else {
                sb2.append(SafeJsonPrimitive.NULL_STRING);
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public g u0() {
        g gVar = this.v;
        if (gVar != null) {
            return gVar;
        }
        Fragment fragment = this.t;
        if (fragment != null) {
            return fragment.mFragmentManager.u0();
        }
        return this.f10337w;
    }

    public final void u1(String str, Bundle bundle) {
        m mVar = this.k.get(str);
        if (mVar == null || !mVar.b(Lifecycle.State.STARTED)) {
            this.j.put(str, bundle);
        } else {
            mVar.a(str, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void v(a aVar, boolean z11, boolean z12, boolean z13) {
        if (z11) {
            aVar.I(z13);
        } else {
            aVar.H();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z11));
        if (z12 && this.q >= 1) {
            t.B(this.f10334r.f(), this.f10335s, arrayList, arrayList2, 0, 1, true, this.n);
        }
        if (z13) {
            U0(this.q, true);
        }
        for (Fragment next : this.f10323c.l()) {
            if (next != null && next.mView != null && next.mIsNewlyAdded && aVar.K(next.mContainerId)) {
                float f11 = next.mPostponedAlpha;
                if (f11 > 0.0f) {
                    next.mView.setAlpha(f11);
                }
                if (z13) {
                    next.mPostponedAlpha = 0.0f;
                } else {
                    next.mPostponedAlpha = -1.0f;
                    next.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public r v0() {
        return this.f10323c;
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void v1(final String str, r rVar, final p pVar) {
        final Lifecycle lifecycle = rVar.getLifecycle();
        if (lifecycle.b() != Lifecycle.State.DESTROYED) {
            AnonymousClass6 r02 = new androidx.lifecycle.o() {
                public void b(r rVar, Lifecycle.Event event) {
                    Bundle bundle;
                    if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) FragmentManager.this.j.get(str)) != null) {
                        pVar.a(str, bundle);
                        FragmentManager.this.s(str);
                    }
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.c(this);
                        FragmentManager.this.k.remove(str);
                    }
                }
            };
            lifecycle.a(r02);
            m put = this.k.put(str, new m(lifecycle, pVar, r02));
            if (put != null) {
                put.c();
            }
        }
    }

    public List<Fragment> w0() {
        return this.f10323c.n();
    }

    /* access modifiers changed from: package-private */
    public void w1(Fragment fragment, Lifecycle.State state) {
        if (!fragment.equals(i0(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = state;
    }

    /* access modifiers changed from: package-private */
    public q x(Fragment fragment) {
        q m11 = this.f10323c.m(fragment.mWho);
        if (m11 != null) {
            return m11;
        }
        q qVar = new q(this.f10332o, this.f10323c, fragment);
        qVar.o(this.f10334r.f().getClassLoader());
        qVar.u(this.q);
        return qVar;
    }

    /* access modifiers changed from: package-private */
    public h<?> x0() {
        return this.f10334r;
    }

    /* access modifiers changed from: package-private */
    public void x1(Fragment fragment) {
        if (fragment == null || (fragment.equals(i0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f10336u;
            this.f10336u = fragment;
            N(fragment2);
            N(this.f10336u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 y0() {
        return this.f10326f;
    }

    /* access modifiers changed from: package-private */
    public void z(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (J0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f10323c.s(fragment);
                if (K0(fragment)) {
                    this.D = true;
                }
                y1(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public k z0() {
        return this.f10332o;
    }

    /* access modifiers changed from: package-private */
    public void z1(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        String f10345a;

        /* renamed from: b  reason: collision with root package name */
        int f10346b;

        class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            a() {
            }

            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i11) {
                return new LaunchedFragmentInfo[i11];
            }
        }

        LaunchedFragmentInfo(String str, int i11) {
            this.f10345a = str;
            this.f10346b = i11;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f10345a);
            parcel.writeInt(this.f10346b);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f10345a = parcel.readString();
            this.f10346b = parcel.readInt();
        }
    }
}
