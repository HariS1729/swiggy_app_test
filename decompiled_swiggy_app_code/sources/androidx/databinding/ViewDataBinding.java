package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.c;
import androidx.databinding.k;
import androidx.databinding.library.R;
import androidx.databinding.m;
import androidx.databinding.n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class ViewDataBinding extends a implements a4.a {
    /* access modifiers changed from: private */
    public static final View.OnAttachStateChangeListener A = new f();

    /* renamed from: r  reason: collision with root package name */
    static int f9686r = Build.VERSION.SDK_INT;

    /* renamed from: s  reason: collision with root package name */
    private static final int f9687s = 8;
    private static final boolean t = true;

    /* renamed from: u  reason: collision with root package name */
    private static final d f9688u = new a();
    private static final d v = new b();

    /* renamed from: w  reason: collision with root package name */
    private static final d f9689w = new c();

    /* renamed from: x  reason: collision with root package name */
    private static final d f9690x = new d();

    /* renamed from: y  reason: collision with root package name */
    private static final c.a<p, ViewDataBinding, Void> f9691y = new e();

    /* renamed from: z  reason: collision with root package name */
    private static final ReferenceQueue<ViewDataBinding> f9692z = new ReferenceQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f9693b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f9694c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f9695d;

    /* renamed from: e  reason: collision with root package name */
    private s[] f9696e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final View f9697f;

    /* renamed from: g  reason: collision with root package name */
    private c<p, ViewDataBinding, Void> f9698g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9699h;

    /* renamed from: i  reason: collision with root package name */
    private Choreographer f9700i;
    private final Choreographer.FrameCallback j;
    private Handler k;

    /* renamed from: l  reason: collision with root package name */
    protected final f f9701l;

    /* renamed from: m  reason: collision with root package name */
    private ViewDataBinding f9702m;
    private r n;

    /* renamed from: o  reason: collision with root package name */
    private OnStartListener f9703o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9704p;
    protected boolean q;

    static class OnStartListener implements q {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<ViewDataBinding> f9705a;

        /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, a aVar) {
            this(viewDataBinding);
        }

        @a0(Lifecycle.Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) this.f9705a.get();
            if (viewDataBinding != null) {
                viewDataBinding.w();
            }
        }

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.f9705a = new WeakReference<>(viewDataBinding);
        }
    }

    class a implements d {
        a() {
        }

        public s a(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new m(viewDataBinding, i11, referenceQueue).f();
        }
    }

    class b implements d {
        b() {
        }

        public s a(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new k(viewDataBinding, i11, referenceQueue).j();
        }
    }

    class c implements d {
        c() {
        }

        public s a(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new l(viewDataBinding, i11, referenceQueue).f();
        }
    }

    class d implements d {
        d() {
        }

        public s a(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new j(viewDataBinding, i11, referenceQueue).g();
        }
    }

    class e extends c.a<p, ViewDataBinding, Void> {
        e() {
        }

        /* renamed from: b */
        public void a(p pVar, ViewDataBinding viewDataBinding, int i11, Void voidR) {
            if (i11 != 1) {
                if (i11 == 2) {
                    pVar.b(viewDataBinding);
                } else if (i11 == 3) {
                    pVar.a(viewDataBinding);
                }
            } else if (!pVar.c(viewDataBinding)) {
                boolean unused = viewDataBinding.f9695d = true;
            }
        }
    }

    class f implements View.OnAttachStateChangeListener {
        f() {
        }

        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.C(view).f9693b.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    class g implements Runnable {
        g() {
        }

        public void run() {
            synchronized (this) {
                boolean unused = ViewDataBinding.this.f9694c = false;
            }
            ViewDataBinding.W();
            if (!ViewDataBinding.this.f9697f.isAttachedToWindow()) {
                ViewDataBinding.this.f9697f.removeOnAttachStateChangeListener(ViewDataBinding.A);
                ViewDataBinding.this.f9697f.addOnAttachStateChangeListener(ViewDataBinding.A);
                return;
            }
            ViewDataBinding.this.w();
        }
    }

    class h implements Choreographer.FrameCallback {
        h() {
        }

        public void doFrame(long j) {
            ViewDataBinding.this.f9693b.run();
        }
    }

    protected static class i {

        /* renamed from: a  reason: collision with root package name */
        public final String[][] f9708a;

        /* renamed from: b  reason: collision with root package name */
        public final int[][] f9709b;

        /* renamed from: c  reason: collision with root package name */
        public final int[][] f9710c;

        public i(int i11) {
            this.f9708a = new String[i11][];
            this.f9709b = new int[i11][];
            this.f9710c = new int[i11][];
        }

        public void a(int i11, String[] strArr, int[] iArr, int[] iArr2) {
            this.f9708a[i11] = strArr;
            this.f9709b[i11] = iArr;
            this.f9710c[i11] = iArr2;
        }
    }

    private static class j implements z, o<LiveData<?>> {

        /* renamed from: a  reason: collision with root package name */
        final s<LiveData<?>> f9711a;

        /* renamed from: b  reason: collision with root package name */
        WeakReference<r> f9712b = null;

        public j(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f9711a = new s<>(viewDataBinding, i11, this, referenceQueue);
        }

        private r f() {
            WeakReference<r> weakReference = this.f9712b;
            if (weakReference == null) {
                return null;
            }
            return (r) weakReference.get();
        }

        public void a(Object obj) {
            ViewDataBinding a11 = this.f9711a.a();
            if (a11 != null) {
                s<LiveData<?>> sVar = this.f9711a;
                a11.H(sVar.f9744b, sVar.b(), 0);
            }
        }

        public void b(r rVar) {
            r f11 = f();
            LiveData b11 = this.f9711a.b();
            if (b11 != null) {
                if (f11 != null) {
                    b11.o(this);
                }
                if (rVar != null) {
                    b11.j(rVar, this);
                }
            }
            if (rVar != null) {
                this.f9712b = new WeakReference<>(rVar);
            }
        }

        /* renamed from: e */
        public void d(LiveData<?> liveData) {
            r f11 = f();
            if (f11 != null) {
                liveData.j(f11, this);
            }
        }

        public s<LiveData<?>> g() {
            return this.f9711a;
        }

        /* renamed from: h */
        public void c(LiveData<?> liveData) {
            liveData.o(this);
        }
    }

    private static class k extends m.a implements o<m> {

        /* renamed from: a  reason: collision with root package name */
        final s<m> f9713a;

        public k(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f9713a = new s<>(viewDataBinding, i11, this, referenceQueue);
        }

        public void a(m mVar) {
            m b11;
            ViewDataBinding a11 = this.f9713a.a();
            if (a11 != null && (b11 = this.f9713a.b()) == mVar) {
                a11.H(this.f9713a.f9744b, b11, 0);
            }
        }

        public void b(r rVar) {
        }

        public void e(m mVar, int i11, int i12) {
            a(mVar);
        }

        public void f(m mVar, int i11, int i12) {
            a(mVar);
        }

        public void g(m mVar, int i11, int i12, int i13) {
            a(mVar);
        }

        public void h(m mVar, int i11, int i12) {
            a(mVar);
        }

        /* renamed from: i */
        public void d(m mVar) {
            mVar.y(this);
        }

        public s<m> j() {
            return this.f9713a;
        }

        /* renamed from: k */
        public void c(m mVar) {
            mVar.A(this);
        }
    }

    private static class l extends n.a implements o<n> {

        /* renamed from: a  reason: collision with root package name */
        final s<n> f9714a;

        public l(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f9714a = new s<>(viewDataBinding, i11, this, referenceQueue);
        }

        public void a(n nVar, Object obj) {
            ViewDataBinding a11 = this.f9714a.a();
            if (a11 != null && nVar == this.f9714a.b()) {
                a11.H(this.f9714a.f9744b, nVar, 0);
            }
        }

        public void b(r rVar) {
        }

        /* renamed from: e */
        public void d(n nVar) {
            nVar.c(this);
        }

        public s<n> f() {
            return this.f9714a;
        }

        /* renamed from: g */
        public void c(n nVar) {
            nVar.i(this);
        }
    }

    private static class m extends k.a implements o<k> {

        /* renamed from: a  reason: collision with root package name */
        final s<k> f9715a;

        public m(ViewDataBinding viewDataBinding, int i11, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f9715a = new s<>(viewDataBinding, i11, this, referenceQueue);
        }

        public void a(k kVar, int i11) {
            ViewDataBinding a11 = this.f9715a.a();
            if (a11 != null && this.f9715a.b() == kVar) {
                a11.H(this.f9715a.f9744b, kVar, i11);
            }
        }

        public void b(r rVar) {
        }

        /* renamed from: e */
        public void d(k kVar) {
            kVar.h(this);
        }

        public s<k> f() {
            return this.f9715a;
        }

        /* renamed from: g */
        public void c(k kVar) {
            kVar.j0(this);
        }
    }

    protected ViewDataBinding(f fVar, View view, int i11) {
        this.f9693b = new g();
        this.f9694c = false;
        this.f9695d = false;
        this.f9701l = fVar;
        this.f9696e = new s[i11];
        this.f9697f = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (t) {
            this.f9700i = Choreographer.getInstance();
            this.j = new h();
        } else {
            this.j = null;
            this.k = new Handler(Looper.myLooper());
        }
    }

    static ViewDataBinding C(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    public static int D() {
        return f9686r;
    }

    protected static int E(View view, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            return view.getContext().getColor(i11);
        }
        return view.getResources().getColor(i11);
    }

    protected static <T> T F(T[] tArr, int i11) {
        if (tArr == null || i11 < 0 || i11 >= tArr.length) {
            return null;
        }
        return tArr[i11];
    }

    protected static <T extends ViewDataBinding> T K(LayoutInflater layoutInflater, int i11, ViewGroup viewGroup, boolean z11, Object obj) {
        return g.j(layoutInflater, i11, viewGroup, z11, p(obj));
    }

    private static boolean N(String str, int i11) {
        int length = str.length();
        if (length == i11) {
            return false;
        }
        while (i11 < length) {
            if (!Character.isDigit(str.charAt(i11))) {
                return false;
            }
            i11++;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void P(androidx.databinding.f r16, android.view.View r17, java.lang.Object[] r18, androidx.databinding.ViewDataBinding.i r19, android.util.SparseIntArray r20, boolean r21) {
        /*
            r6 = r16
            r0 = r17
            r7 = r19
            r8 = r20
            androidx.databinding.ViewDataBinding r1 = C(r17)
            if (r1 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r1 = r17.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x001a
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.String r9 = "layout"
            r2 = -1
            r11 = 1
            if (r21 == 0) goto L_0x004b
            if (r1 == 0) goto L_0x004b
            boolean r3 = r1.startsWith(r9)
            if (r3 == 0) goto L_0x004b
            r3 = 95
            int r3 = r1.lastIndexOf(r3)
            if (r3 <= 0) goto L_0x0047
            int r3 = r3 + r11
            boolean r4 = N(r1, r3)
            if (r4 == 0) goto L_0x0047
            int r1 = V(r1, r3)
            r3 = r18[r1]
            if (r3 != 0) goto L_0x0042
            r18[r1] = r0
        L_0x0042:
            if (r7 != 0) goto L_0x0045
            r1 = -1
        L_0x0045:
            r3 = 1
            goto L_0x0049
        L_0x0047:
            r1 = -1
            r3 = 0
        L_0x0049:
            r12 = r1
            goto L_0x0069
        L_0x004b:
            if (r1 == 0) goto L_0x0067
            java.lang.String r3 = "binding_"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0067
            int r3 = f9687s
            int r1 = V(r1, r3)
            r3 = r18[r1]
            if (r3 != 0) goto L_0x0061
            r18[r1] = r0
        L_0x0061:
            if (r7 != 0) goto L_0x0064
            r1 = -1
        L_0x0064:
            r12 = r1
            r3 = 1
            goto L_0x0069
        L_0x0067:
            r3 = 0
            r12 = -1
        L_0x0069:
            if (r3 != 0) goto L_0x007f
            int r1 = r17.getId()
            if (r1 <= 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            int r1 = r8.get(r1, r2)
            if (r1 < 0) goto L_0x007f
            r2 = r18[r1]
            if (r2 != 0) goto L_0x007f
            r18[r1] = r0
        L_0x007f:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0113
            r13 = r0
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            int r14 = r13.getChildCount()
            r0 = 0
            r1 = 0
        L_0x008c:
            if (r0 >= r14) goto L_0x0113
            android.view.View r2 = r13.getChildAt(r0)
            if (r12 < 0) goto L_0x00f9
            java.lang.Object r3 = r2.getTag()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x00f9
            java.lang.Object r3 = r2.getTag()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "_0"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x00f9
            boolean r4 = r3.startsWith(r9)
            if (r4 == 0) goto L_0x00f9
            r4 = 47
            int r4 = r3.indexOf(r4)
            if (r4 <= 0) goto L_0x00f9
            int r3 = y(r3, r1, r7, r12)
            if (r3 < 0) goto L_0x00f9
            int r1 = r3 + 1
            int[][] r4 = r7.f9709b
            r4 = r4[r12]
            r4 = r4[r3]
            int[][] r5 = r7.f9710c
            r5 = r5[r12]
            r3 = r5[r3]
            int r5 = z(r13, r0)
            if (r5 != r0) goto L_0x00dc
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.g.c(r6, r2, r3)
            r18[r4] = r3
        L_0x00d8:
            r10 = r0
            r11 = r1
            r0 = 1
            goto L_0x00fc
        L_0x00dc:
            int r5 = r5 - r0
            int r5 = r5 + r11
            android.view.View[] r15 = new android.view.View[r5]
            r10 = 0
        L_0x00e1:
            if (r10 >= r5) goto L_0x00ef
            int r11 = r0 + r10
            android.view.View r11 = r13.getChildAt(r11)
            r15[r10] = r11
            int r10 = r10 + 1
            r11 = 1
            goto L_0x00e1
        L_0x00ef:
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.g.d(r6, r15, r3)
            r18[r4] = r3
            int r5 = r5 + -1
            int r0 = r0 + r5
            goto L_0x00d8
        L_0x00f9:
            r10 = r0
            r11 = r1
            r0 = 0
        L_0x00fc:
            if (r0 != 0) goto L_0x010b
            r5 = 0
            r0 = r16
            r1 = r2
            r2 = r18
            r3 = r19
            r4 = r20
            P(r0, r1, r2, r3, r4, r5)
        L_0x010b:
            r0 = 1
            int r1 = r10 + 1
            r0 = r1
            r1 = r11
            r11 = 1
            goto L_0x008c
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.P(androidx.databinding.f, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$i, android.util.SparseIntArray, boolean):void");
    }

    protected static Object[] R(f fVar, View view, int i11, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i11];
        P(fVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    protected static Object[] S(f fVar, View[] viewArr, int i11, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i11];
        for (View P : viewArr) {
            P(fVar, P, objArr, iVar, sparseIntArray, true);
        }
        return objArr;
    }

    private static int V(String str, int i11) {
        int length = str.length();
        int i12 = 0;
        while (i11 < length) {
            i12 = (i12 * 10) + (str.charAt(i11) - '0');
            i11++;
        }
        return i12;
    }

    /* access modifiers changed from: private */
    public static void W() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = f9692z.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof s) {
                ((s) poll).e();
            }
        }
    }

    protected static float b0(Float f11) {
        if (f11 == null) {
            return 0.0f;
        }
        return f11.floatValue();
    }

    protected static int c0(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    protected static boolean d0(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private static f p(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof f) {
            return (f) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private void s() {
        if (this.f9699h) {
            a0();
        } else if (J()) {
            this.f9699h = true;
            this.f9695d = false;
            c<p, ViewDataBinding, Void> cVar = this.f9698g;
            if (cVar != null) {
                cVar.g(this, 1, null);
                if (this.f9695d) {
                    this.f9698g.g(this, 2, null);
                }
            }
            if (!this.f9695d) {
                r();
                c<p, ViewDataBinding, Void> cVar2 = this.f9698g;
                if (cVar2 != null) {
                    cVar2.g(this, 3, null);
                }
            }
            this.f9699h = false;
        }
    }

    protected static void t(ViewDataBinding viewDataBinding) {
        viewDataBinding.s();
    }

    private static int y(String str, int i11, i iVar, int i12) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f9708a[i12];
        int length = strArr.length;
        while (i11 < length) {
            if (TextUtils.equals(subSequence, strArr[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    private static int z(ViewGroup viewGroup, int i11) {
        String str = (String) viewGroup.getChildAt(i11).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i12 = i11 + 1; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i11;
                }
                if (N(str2, length)) {
                    i11 = i12;
                }
            }
        }
        return i11;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        r();
    }

    public View G() {
        return this.f9697f;
    }

    /* access modifiers changed from: protected */
    public void H(int i11, Object obj, int i12) {
        if (!this.f9704p && !this.q && U(i11, obj, i12)) {
            a0();
        }
    }

    public abstract boolean J();

    public abstract void M();

    /* access modifiers changed from: protected */
    public abstract boolean U(int i11, Object obj, int i12);

    /* access modifiers changed from: protected */
    public void X(int i11, Object obj, d dVar) {
        if (obj != null) {
            s sVar = this.f9696e[i11];
            if (sVar == null) {
                sVar = dVar.a(this, i11, f9692z);
                this.f9696e[i11] = sVar;
                r rVar = this.n;
                if (rVar != null) {
                    sVar.c(rVar);
                }
            }
            sVar.d(obj);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (t == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2.f9700i.postFrameCallback(r2.j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r2.k.post(r2.f9693b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a0() {
        /*
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.f9702m
            if (r0 == 0) goto L_0x0008
            r0.a0()
            goto L_0x003b
        L_0x0008:
            androidx.lifecycle.r r0 = r2.n
            if (r0 == 0) goto L_0x001d
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.b()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            monitor-enter(r2)
            boolean r0 = r2.f9694c     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0024
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            return
        L_0x0024:
            r0 = 1
            r2.f9694c = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            boolean r0 = t
            if (r0 == 0) goto L_0x0034
            android.view.Choreographer r0 = r2.f9700i
            android.view.Choreographer$FrameCallback r1 = r2.j
            r0.postFrameCallback(r1)
            goto L_0x003b
        L_0x0034:
            android.os.Handler r0 = r2.k
            java.lang.Runnable r1 = r2.f9693b
            r0.post(r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.a0():void");
    }

    /* access modifiers changed from: protected */
    public void h0(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.f9702m = this;
        }
    }

    public void i0(r rVar) {
        if (rVar instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        r rVar2 = this.n;
        if (rVar2 != rVar) {
            if (rVar2 != null) {
                rVar2.getLifecycle().c(this.f9703o);
            }
            this.n = rVar;
            if (rVar != null) {
                if (this.f9703o == null) {
                    this.f9703o = new OnStartListener(this, (a) null);
                }
                rVar.getLifecycle().a(this.f9703o);
            }
            for (s sVar : this.f9696e) {
                if (sVar != null) {
                    sVar.c(rVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void k0(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    /* access modifiers changed from: protected */
    public void l0(View[] viewArr) {
        for (View tag : viewArr) {
            tag.setTag(R.id.dataBinding, this);
        }
    }

    public abstract boolean m0(int i11, Object obj);

    /* access modifiers changed from: protected */
    public boolean n0(int i11) {
        s sVar = this.f9696e[i11];
        if (sVar != null) {
            return sVar.e();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean p0(int i11, LiveData<?> liveData) {
        this.f9704p = true;
        try {
            return v0(i11, liveData, f9690x);
        } finally {
            this.f9704p = false;
        }
    }

    /* access modifiers changed from: protected */
    public void q(Class<?> cls) {
        if (this.f9701l == null) {
            throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
        }
    }

    /* access modifiers changed from: protected */
    public abstract void r();

    /* access modifiers changed from: protected */
    public boolean r0(int i11, k kVar) {
        return v0(i11, kVar, f9688u);
    }

    /* access modifiers changed from: protected */
    public boolean s0(int i11, m mVar) {
        return v0(i11, mVar, v);
    }

    /* access modifiers changed from: protected */
    public boolean t0(int i11, n nVar) {
        return v0(i11, nVar, f9689w);
    }

    /* access modifiers changed from: protected */
    public boolean v0(int i11, Object obj, d dVar) {
        if (obj == null) {
            return n0(i11);
        }
        s sVar = this.f9696e[i11];
        if (sVar == null) {
            X(i11, obj, dVar);
            return true;
        } else if (sVar.b() == obj) {
            return false;
        } else {
            n0(i11);
            X(i11, obj, dVar);
            return true;
        }
    }

    public void w() {
        ViewDataBinding viewDataBinding = this.f9702m;
        if (viewDataBinding == null) {
            s();
        } else {
            viewDataBinding.w();
        }
    }

    protected ViewDataBinding(Object obj, View view, int i11) {
        this(p(obj), view, i11);
    }
}
