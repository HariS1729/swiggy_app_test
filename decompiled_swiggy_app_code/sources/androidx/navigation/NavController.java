package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.e;
import androidx.core.app.t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.o0;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.navigation.m;
import androidx.navigation.t;
import androidx.navigation.w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class NavController {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10859a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f10860b;

    /* renamed from: c  reason: collision with root package name */
    private s f10861c;

    /* renamed from: d  reason: collision with root package name */
    o f10862d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f10863e;

    /* renamed from: f  reason: collision with root package name */
    private Parcelable[] f10864f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10865g;

    /* renamed from: h  reason: collision with root package name */
    final Deque<h> f10866h = new ArrayDeque();

    /* renamed from: i  reason: collision with root package name */
    private r f10867i;
    private i j;
    private x k = new x();

    /* renamed from: l  reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f10868l = new CopyOnWriteArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private final q f10869m = new o() {
        public void b(r rVar, Lifecycle.Event event) {
            NavController navController = NavController.this;
            if (navController.f10862d != null) {
                for (h e11 : navController.f10866h) {
                    e11.e(event);
                }
            }
        }
    };
    private final e n = new a(false);

    /* renamed from: o  reason: collision with root package name */
    private boolean f10870o = true;

    class a extends e {
        a(boolean z11) {
            super(z11);
        }

        public void b() {
            NavController.this.u();
        }
    }

    public interface b {
        void a(NavController navController, m mVar, Bundle bundle);
    }

    public NavController(Context context) {
        this.f10859a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.f10860b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        x xVar = this.k;
        xVar.a(new p(xVar));
        this.k.a(new a(this.f10859a));
    }

    private void G() {
        e eVar = this.n;
        boolean z11 = true;
        if (!this.f10870o || i() <= 1) {
            z11 = false;
        }
        eVar.f(z11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:5:0x002d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a() {
        /*
            r10 = this;
        L_0x0000:
            java.util.Deque<androidx.navigation.h> r0 = r10.f10866h
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x0030
            java.util.Deque<androidx.navigation.h> r0 = r10.f10866h
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.h r0 = (androidx.navigation.h) r0
            androidx.navigation.m r0 = r0.b()
            boolean r0 = r0 instanceof androidx.navigation.o
            if (r0 == 0) goto L_0x0030
            java.util.Deque<androidx.navigation.h> r0 = r10.f10866h
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.h r0 = (androidx.navigation.h) r0
            androidx.navigation.m r0 = r0.b()
            int r0 = r0.l()
            boolean r0 = r10.w(r0, r1)
            if (r0 == 0) goto L_0x0030
            goto L_0x0000
        L_0x0030:
            java.util.Deque<androidx.navigation.h> r0 = r10.f10866h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0110
            java.util.Deque<androidx.navigation.h> r0 = r10.f10866h
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.h r0 = (androidx.navigation.h) r0
            androidx.navigation.m r0 = r0.b()
            r2 = 0
            boolean r3 = r0 instanceof androidx.navigation.b
            if (r3 == 0) goto L_0x0068
            java.util.Deque<androidx.navigation.h> r3 = r10.f10866h
            java.util.Iterator r3 = r3.descendingIterator()
        L_0x004f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r3.next()
            androidx.navigation.h r4 = (androidx.navigation.h) r4
            androidx.navigation.m r4 = r4.b()
            boolean r5 = r4 instanceof androidx.navigation.o
            if (r5 != 0) goto L_0x004f
            boolean r5 = r4 instanceof androidx.navigation.b
            if (r5 != 0) goto L_0x004f
            r2 = r4
        L_0x0068:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Deque<androidx.navigation.h> r4 = r10.f10866h
            java.util.Iterator r4 = r4.descendingIterator()
        L_0x0073:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00c7
            java.lang.Object r5 = r4.next()
            androidx.navigation.h r5 = (androidx.navigation.h) r5
            androidx.lifecycle.Lifecycle$State r6 = r5.c()
            androidx.navigation.m r7 = r5.b()
            if (r0 == 0) goto L_0x009f
            int r8 = r7.l()
            int r9 = r0.l()
            if (r8 != r9) goto L_0x009f
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r6 == r7) goto L_0x009a
            r3.put(r5, r7)
        L_0x009a:
            androidx.navigation.o r0 = r0.o()
            goto L_0x0073
        L_0x009f:
            if (r2 == 0) goto L_0x00c1
            int r7 = r7.l()
            int r8 = r2.l()
            if (r7 != r8) goto L_0x00c1
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r6 != r7) goto L_0x00b5
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.STARTED
            r5.h(r6)
            goto L_0x00bc
        L_0x00b5:
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.STARTED
            if (r6 == r7) goto L_0x00bc
            r3.put(r5, r7)
        L_0x00bc:
            androidx.navigation.o r2 = r2.o()
            goto L_0x0073
        L_0x00c1:
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.CREATED
            r5.h(r6)
            goto L_0x0073
        L_0x00c7:
            java.util.Deque<androidx.navigation.h> r0 = r10.f10866h
            java.util.Iterator r0 = r0.iterator()
        L_0x00cd:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00e9
            java.lang.Object r2 = r0.next()
            androidx.navigation.h r2 = (androidx.navigation.h) r2
            java.lang.Object r4 = r3.get(r2)
            androidx.lifecycle.Lifecycle$State r4 = (androidx.lifecycle.Lifecycle.State) r4
            if (r4 == 0) goto L_0x00e5
            r2.h(r4)
            goto L_0x00cd
        L_0x00e5:
            r2.i()
            goto L_0x00cd
        L_0x00e9:
            java.util.Deque<androidx.navigation.h> r0 = r10.f10866h
            java.lang.Object r0 = r0.peekLast()
            androidx.navigation.h r0 = (androidx.navigation.h) r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.navigation.NavController$b> r2 = r10.f10868l
            java.util.Iterator r2 = r2.iterator()
        L_0x00f7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x010f
            java.lang.Object r3 = r2.next()
            androidx.navigation.NavController$b r3 = (androidx.navigation.NavController.b) r3
            androidx.navigation.m r4 = r0.b()
            android.os.Bundle r5 = r0.a()
            r3.a(r10, r4, r5)
            goto L_0x00f7
        L_0x010f:
            return r1
        L_0x0110:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.a():boolean");
    }

    private String d(int[] iArr) {
        o oVar;
        o oVar2 = this.f10862d;
        int i11 = 0;
        while (true) {
            m mVar = null;
            if (i11 >= iArr.length) {
                return null;
            }
            int i12 = iArr[i11];
            if (i11 != 0) {
                mVar = oVar2.D(i12);
            } else if (this.f10862d.l() == i12) {
                mVar = this.f10862d;
            }
            if (mVar == null) {
                return m.k(this.f10859a, i12);
            }
            if (i11 != iArr.length - 1) {
                while (true) {
                    oVar = (o) mVar;
                    if (!(oVar.D(oVar.G()) instanceof o)) {
                        break;
                    }
                    mVar = oVar.D(oVar.G());
                }
                oVar2 = oVar;
            }
            i11++;
        }
    }

    private int i() {
        int i11 = 0;
        for (h b11 : this.f10866h) {
            if (!(b11.b() instanceof o)) {
                i11++;
            }
        }
        return i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031 A[LOOP:0: B:10:0x0031->B:15:0x005d, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q(androidx.navigation.m r11, android.os.Bundle r12, androidx.navigation.t r13, androidx.navigation.w.a r14) {
        /*
            r10 = this;
            r0 = 0
            if (r13 == 0) goto L_0x0017
            int r1 = r13.e()
            r2 = -1
            if (r1 == r2) goto L_0x0017
            int r1 = r13.e()
            boolean r2 = r13.f()
            boolean r1 = r10.w(r1, r2)
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            androidx.navigation.x r2 = r10.k
            java.lang.String r3 = r11.n()
            androidx.navigation.w r2 = r2.d(r3)
            android.os.Bundle r9 = r11.c(r12)
            androidx.navigation.m r11 = r2.b(r11, r9, r13, r14)
            r14 = 1
            if (r11 == 0) goto L_0x00c2
            boolean r12 = r11 instanceof androidx.navigation.b
            if (r12 != 0) goto L_0x0060
        L_0x0031:
            java.util.Deque<androidx.navigation.h> r12 = r10.f10866h
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x0060
            java.util.Deque<androidx.navigation.h> r12 = r10.f10866h
            java.lang.Object r12 = r12.peekLast()
            androidx.navigation.h r12 = (androidx.navigation.h) r12
            androidx.navigation.m r12 = r12.b()
            boolean r12 = r12 instanceof androidx.navigation.b
            if (r12 == 0) goto L_0x0060
            java.util.Deque<androidx.navigation.h> r12 = r10.f10866h
            java.lang.Object r12 = r12.peekLast()
            androidx.navigation.h r12 = (androidx.navigation.h) r12
            androidx.navigation.m r12 = r12.b()
            int r12 = r12.l()
            boolean r12 = r10.w(r12, r14)
            if (r12 == 0) goto L_0x0060
            goto L_0x0031
        L_0x0060:
            java.util.Deque<androidx.navigation.h> r12 = r10.f10866h
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x007c
            androidx.navigation.h r12 = new androidx.navigation.h
            android.content.Context r4 = r10.f10859a
            androidx.navigation.o r5 = r10.f10862d
            androidx.lifecycle.r r7 = r10.f10867i
            androidx.navigation.i r8 = r10.j
            r3 = r12
            r6 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Deque<androidx.navigation.h> r13 = r10.f10866h
            r13.add(r12)
        L_0x007c:
            java.util.ArrayDeque r12 = new java.util.ArrayDeque
            r12.<init>()
            r13 = r11
        L_0x0082:
            if (r13 == 0) goto L_0x00a6
            int r14 = r13.l()
            androidx.navigation.m r14 = r10.c(r14)
            if (r14 != 0) goto L_0x00a6
            androidx.navigation.o r13 = r13.o()
            if (r13 == 0) goto L_0x0082
            androidx.navigation.h r14 = new androidx.navigation.h
            android.content.Context r4 = r10.f10859a
            androidx.lifecycle.r r7 = r10.f10867i
            androidx.navigation.i r8 = r10.j
            r3 = r14
            r5 = r13
            r6 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r12.addFirst(r14)
            goto L_0x0082
        L_0x00a6:
            java.util.Deque<androidx.navigation.h> r13 = r10.f10866h
            r13.addAll(r12)
            androidx.navigation.h r12 = new androidx.navigation.h
            android.content.Context r4 = r10.f10859a
            android.os.Bundle r6 = r11.c(r9)
            androidx.lifecycle.r r7 = r10.f10867i
            androidx.navigation.i r8 = r10.j
            r3 = r12
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Deque<androidx.navigation.h> r13 = r10.f10866h
            r13.add(r12)
            goto L_0x00d8
        L_0x00c2:
            if (r13 == 0) goto L_0x00d8
            boolean r13 = r13.g()
            if (r13 == 0) goto L_0x00d8
            java.util.Deque<androidx.navigation.h> r13 = r10.f10866h
            java.lang.Object r13 = r13.peekLast()
            androidx.navigation.h r13 = (androidx.navigation.h) r13
            if (r13 == 0) goto L_0x00d7
            r13.f(r12)
        L_0x00d7:
            r0 = 1
        L_0x00d8:
            r10.G()
            if (r1 != 0) goto L_0x00e1
            if (r11 != 0) goto L_0x00e1
            if (r0 == 0) goto L_0x00e4
        L_0x00e1:
            r10.a()
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.q(androidx.navigation.m, android.os.Bundle, androidx.navigation.t, androidx.navigation.w$a):void");
    }

    private void t(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f10863e;
        if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) == null)) {
            Iterator<String> it2 = stringArrayList.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                w d11 = this.k.d(next);
                Bundle bundle3 = this.f10863e.getBundle(next);
                if (bundle3 != null) {
                    d11.c(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f10864f;
        boolean z11 = false;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i11 = 0;
            while (i11 < length) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelableArr[i11];
                m c11 = c(navBackStackEntryState.b());
                if (c11 != null) {
                    Bundle a11 = navBackStackEntryState.a();
                    if (a11 != null) {
                        a11.setClassLoader(this.f10859a.getClassLoader());
                    }
                    this.f10866h.add(new h(this.f10859a, c11, a11, this.f10867i, this.j, navBackStackEntryState.d(), navBackStackEntryState.c()));
                    i11++;
                } else {
                    String k11 = m.k(this.f10859a, navBackStackEntryState.b());
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + k11 + " cannot be found from the current destination " + h());
                }
            }
            G();
            this.f10864f = null;
        }
        if (this.f10862d == null || !this.f10866h.isEmpty()) {
            a();
            return;
        }
        if (!this.f10865g && (activity = this.f10860b) != null && m(activity.getIntent())) {
            z11 = true;
        }
        if (!z11) {
            q(this.f10862d, bundle, (t) null, (w.a) null);
        }
    }

    public void A(int i11, Bundle bundle) {
        C(k().c(i11), bundle);
    }

    public void B(o oVar) {
        C(oVar, (Bundle) null);
    }

    public void C(o oVar, Bundle bundle) {
        o oVar2 = this.f10862d;
        if (oVar2 != null) {
            w(oVar2.l(), true);
        }
        this.f10862d = oVar;
        t(bundle);
    }

    /* access modifiers changed from: package-private */
    public void D(r rVar) {
        this.f10867i = rVar;
        rVar.getLifecycle().a(this.f10869m);
    }

    /* access modifiers changed from: package-private */
    public void E(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.f10867i != null) {
            this.n.d();
            onBackPressedDispatcher.b(this.f10867i, this.n);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    /* access modifiers changed from: package-private */
    public void F(o0 o0Var) {
        if (this.f10866h.isEmpty()) {
            this.j = i.l1(o0Var);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z11) {
        this.f10870o = z11;
        G();
    }

    /* access modifiers changed from: package-private */
    public m c(int i11) {
        m mVar;
        o oVar;
        o oVar2 = this.f10862d;
        if (oVar2 == null) {
            return null;
        }
        if (oVar2.l() == i11) {
            return this.f10862d;
        }
        if (this.f10866h.isEmpty()) {
            mVar = this.f10862d;
        } else {
            mVar = this.f10866h.getLast().b();
        }
        if (mVar instanceof o) {
            oVar = (o) mVar;
        } else {
            oVar = mVar.o();
        }
        return oVar.D(i11);
    }

    public h e(int i11) {
        h hVar;
        Iterator<h> descendingIterator = this.f10866h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                hVar = null;
                break;
            }
            hVar = descendingIterator.next();
            if (hVar.b().l() == i11) {
                break;
            }
        }
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalArgumentException("No destination with ID " + i11 + " is on the NavController's back stack. The current destination is " + h());
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f10859a;
    }

    public h g() {
        if (this.f10866h.isEmpty()) {
            return null;
        }
        return this.f10866h.getLast();
    }

    public m h() {
        h g11 = g();
        if (g11 != null) {
            return g11.b();
        }
        return null;
    }

    public o j() {
        o oVar = this.f10862d;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public s k() {
        if (this.f10861c == null) {
            this.f10861c = new s(this.f10859a, this.k);
        }
        return this.f10861c;
    }

    public x l() {
        return this.k;
    }

    public boolean m(Intent intent) {
        o oVar;
        m.a p11;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (!((intArray != null && intArray.length != 0) || intent.getData() == null || (p11 = this.f10862d.p(new l(intent))) == null)) {
            intArray = p11.h().f();
            bundle.putAll(p11.i());
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String d11 = d(intArray);
        if (d11 != null) {
            Log.i("NavController", "Could not find destination " + d11 + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int flags = intent.getFlags();
        int i11 = 268435456 & flags;
        if (i11 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            t.e(this.f10859a).b(intent).h();
            Activity activity = this.f10860b;
            if (activity != null) {
                activity.finish();
                this.f10860b.overridePendingTransition(0, 0);
            }
            return true;
        } else if (i11 != 0) {
            if (!this.f10866h.isEmpty()) {
                w(this.f10862d.l(), true);
            }
            int i12 = 0;
            while (i12 < intArray.length) {
                int i13 = i12 + 1;
                int i14 = intArray[i12];
                m c11 = c(i14);
                if (c11 != null) {
                    q(c11, bundle, new t.a().b(0).c(0).a(), (w.a) null);
                    i12 = i13;
                } else {
                    String k11 = m.k(this.f10859a, i14);
                    throw new IllegalStateException("Deep Linking failed: destination " + k11 + " cannot be found from the current destination " + h());
                }
            }
            return true;
        } else {
            o oVar2 = this.f10862d;
            int i15 = 0;
            while (i15 < intArray.length) {
                int i16 = intArray[i15];
                m D = i15 == 0 ? this.f10862d : oVar2.D(i16);
                if (D != null) {
                    if (i15 != intArray.length - 1) {
                        while (true) {
                            oVar = (o) D;
                            if (!(oVar.D(oVar.G()) instanceof o)) {
                                break;
                            }
                            D = oVar.D(oVar.G());
                        }
                        oVar2 = oVar;
                    } else {
                        q(D, D.c(bundle), new t.a().g(this.f10862d.l(), true).b(0).c(0).a(), (w.a) null);
                    }
                    i15++;
                } else {
                    String k12 = m.k(this.f10859a, i16);
                    throw new IllegalStateException("Deep Linking failed: destination " + k12 + " cannot be found in graph " + oVar2);
                }
            }
            this.f10865g = true;
            return true;
        }
    }

    public void n(int i11, Bundle bundle) {
        o(i11, bundle, (t) null);
    }

    public void o(int i11, Bundle bundle, t tVar) {
        p(i11, bundle, tVar, (w.a) null);
    }

    public void p(int i11, Bundle bundle, t tVar, w.a aVar) {
        m mVar;
        int i12;
        if (this.f10866h.isEmpty()) {
            mVar = this.f10862d;
        } else {
            mVar = this.f10866h.getLast().b();
        }
        if (mVar != null) {
            c g11 = mVar.g(i11);
            Bundle bundle2 = null;
            if (g11 != null) {
                if (tVar == null) {
                    tVar = g11.c();
                }
                i12 = g11.b();
                Bundle a11 = g11.a();
                if (a11 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(a11);
                }
            } else {
                i12 = i11;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i12 == 0 && tVar != null && tVar.e() != -1) {
                v(tVar.e(), tVar.f());
            } else if (i12 != 0) {
                m c11 = c(i12);
                if (c11 == null) {
                    String k11 = m.k(this.f10859a, i12);
                    if (g11 != null) {
                        throw new IllegalArgumentException("Navigation destination " + k11 + " referenced from action " + m.k(this.f10859a, i11) + " cannot be found from the current destination " + mVar);
                    }
                    throw new IllegalArgumentException("Navigation action/destination " + k11 + " cannot be found from the current destination " + mVar);
                }
                q(c11, bundle2, tVar, aVar);
            } else {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
        } else {
            throw new IllegalStateException("no current navigation node");
        }
    }

    public void r(n nVar) {
        n(nVar.b(), nVar.a());
    }

    public boolean s() {
        if (i() != 1) {
            return u();
        }
        m h11 = h();
        int l11 = h11.l();
        for (o o11 = h11.o(); o11 != null; o11 = o11.o()) {
            if (o11.G() != l11) {
                Bundle bundle = new Bundle();
                Activity activity = this.f10860b;
                if (!(activity == null || activity.getIntent() == null || this.f10860b.getIntent().getData() == null)) {
                    bundle.putParcelable("android-support-nav:controller:deepLinkIntent", this.f10860b.getIntent());
                    m.a p11 = this.f10862d.p(new l(this.f10860b.getIntent()));
                    if (p11 != null) {
                        bundle.putAll(p11.i());
                    }
                }
                new k(this).d(o11.l()).c(bundle).a().h();
                Activity activity2 = this.f10860b;
                if (activity2 != null) {
                    activity2.finish();
                }
                return true;
            }
            l11 = o11.l();
        }
        return false;
    }

    public boolean u() {
        if (this.f10866h.isEmpty()) {
            return false;
        }
        return v(h().l(), true);
    }

    public boolean v(int i11, boolean z11) {
        return w(i11, z11) && a();
    }

    /* access modifiers changed from: package-private */
    public boolean w(int i11, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f10866h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<h> descendingIterator = this.f10866h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z12 = false;
                break;
            }
            m b11 = descendingIterator.next().b();
            w d11 = this.k.d(b11.n());
            if (z11 || b11.l() != i11) {
                arrayList.add(d11);
            }
            if (b11.l() == i11) {
                z12 = true;
                break;
            }
        }
        if (!z12) {
            String k11 = m.k(this.f10859a, i11);
            Log.i("NavController", "Ignoring popBackStack to destination " + k11 + " as it was not found on the current back stack");
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext() && ((w) it2.next()).e()) {
            h removeLast = this.f10866h.removeLast();
            removeLast.h(Lifecycle.State.DESTROYED);
            i iVar = this.j;
            if (iVar != null) {
                iVar.k1(removeLast.f10912f);
            }
            z13 = true;
        }
        G();
        return z13;
    }

    public void x(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f10859a.getClassLoader());
            this.f10863e = bundle.getBundle("android-support-nav:controller:navigatorState");
            this.f10864f = bundle.getParcelableArray("android-support-nav:controller:backStack");
            this.f10865g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
    }

    public Bundle y() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Map.Entry next : this.k.e().entrySet()) {
            String str = (String) next.getKey();
            Bundle d11 = ((w) next.getValue()).d();
            if (d11 != null) {
                arrayList.add(str);
                bundle2.putBundle(str, d11);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.f10866h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f10866h.size()];
            int i11 = 0;
            for (h navBackStackEntryState : this.f10866h) {
                parcelableArr[i11] = new NavBackStackEntryState(navBackStackEntryState);
                i11++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (this.f10865g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f10865g);
        }
        return bundle;
    }

    public void z(int i11) {
        A(i11, (Bundle) null);
    }
}
