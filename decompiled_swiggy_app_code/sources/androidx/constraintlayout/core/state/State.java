package androidx.constraintlayout.core.state;

import java.util.ArrayList;
import java.util.HashMap;
import l2.b;
import l2.c;
import l2.f;
import l2.g;
import l2.h;

public class State {

    /* renamed from: f  reason: collision with root package name */
    public static final Integer f8106f = 0;

    /* renamed from: a  reason: collision with root package name */
    protected HashMap<Object, k2.a> f8107a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    protected HashMap<Object, c> f8108b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    HashMap<String, ArrayList<String>> f8109c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final a f8110d;

    /* renamed from: e  reason: collision with root package name */
    private int f8111e;

    public enum Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8112a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.state.State$Helper[] r0 = androidx.constraintlayout.core.state.State.Helper.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8112a = r0
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8112a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8112a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.ALIGN_HORIZONTALLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8112a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.ALIGN_VERTICALLY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8112a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.BARRIER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.State.a.<clinit>():void");
        }
    }

    public State() {
        a aVar = new a(this);
        this.f8110d = aVar;
        this.f8111e = 0;
        this.f8107a.put(f8106f, aVar);
    }

    private String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("__HELPER_KEY_");
        int i11 = this.f8111e;
        this.f8111e = i11 + 1;
        sb2.append(i11);
        sb2.append("__");
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014d, code lost:
        r1 = (androidx.constraintlayout.core.state.c) r0.e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.constraintlayout.core.widgets.d r8) {
        /*
            r7 = this;
            r8.A1()
            androidx.constraintlayout.core.state.a r0 = r7.f8110d
            androidx.constraintlayout.core.state.b r0 = r0.C()
            r1 = 0
            r0.h(r7, r8, r1)
            androidx.constraintlayout.core.state.a r0 = r7.f8110d
            androidx.constraintlayout.core.state.b r0 = r0.A()
            r1 = 1
            r0.h(r7, r8, r1)
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r0 = r7.f8108b
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x004b
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r2 = r7.f8108b
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.state.c r2 = (androidx.constraintlayout.core.state.c) r2
            m2.b r2 = r2.s0()
            if (r2 == 0) goto L_0x0021
            java.util.HashMap<java.lang.Object, k2.a> r3 = r7.f8107a
            java.lang.Object r3 = r3.get(r1)
            k2.a r3 = (k2.a) r3
            if (r3 != 0) goto L_0x0047
            androidx.constraintlayout.core.state.a r3 = r7.c(r1)
        L_0x0047:
            r3.c(r2)
            goto L_0x0021
        L_0x004b:
            java.util.HashMap<java.lang.Object, k2.a> r0 = r7.f8107a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0055:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0091
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, k2.a> r2 = r7.f8107a
            java.lang.Object r2 = r2.get(r1)
            k2.a r2 = (k2.a) r2
            androidx.constraintlayout.core.state.a r3 = r7.f8110d
            if (r2 == r3) goto L_0x0055
            l2.e r3 = r2.e()
            boolean r3 = r3 instanceof androidx.constraintlayout.core.state.c
            if (r3 == 0) goto L_0x0055
            l2.e r2 = r2.e()
            androidx.constraintlayout.core.state.c r2 = (androidx.constraintlayout.core.state.c) r2
            m2.b r2 = r2.s0()
            if (r2 == 0) goto L_0x0055
            java.util.HashMap<java.lang.Object, k2.a> r3 = r7.f8107a
            java.lang.Object r3 = r3.get(r1)
            k2.a r3 = (k2.a) r3
            if (r3 != 0) goto L_0x008d
            androidx.constraintlayout.core.state.a r3 = r7.c(r1)
        L_0x008d:
            r3.c(r2)
            goto L_0x0055
        L_0x0091:
            java.util.HashMap<java.lang.Object, k2.a> r0 = r7.f8107a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x009b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d7
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, k2.a> r2 = r7.f8107a
            java.lang.Object r1 = r2.get(r1)
            k2.a r1 = (k2.a) r1
            androidx.constraintlayout.core.state.a r2 = r7.f8110d
            if (r1 == r2) goto L_0x00d3
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.a()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = r3.toString()
            r2.I0(r3)
            r3 = 0
            r2.i1(r3)
            l2.e r3 = r1.e()
            boolean r3 = r3 instanceof l2.f
            if (r3 == 0) goto L_0x00cf
            r1.b()
        L_0x00cf:
            r8.a(r2)
            goto L_0x009b
        L_0x00d3:
            r1.c(r8)
            goto L_0x009b
        L_0x00d7:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r8 = r7.f8108b
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x00e1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0125
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.c> r1 = r7.f8108b
            java.lang.Object r0 = r1.get(r0)
            androidx.constraintlayout.core.state.c r0 = (androidx.constraintlayout.core.state.c) r0
            m2.b r1 = r0.s0()
            if (r1 == 0) goto L_0x0121
            java.util.ArrayList<java.lang.Object> r1 = r0.f8156l0
            java.util.Iterator r1 = r1.iterator()
        L_0x00ff:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x011d
            java.lang.Object r2 = r1.next()
            java.util.HashMap<java.lang.Object, k2.a> r3 = r7.f8107a
            java.lang.Object r2 = r3.get(r2)
            k2.a r2 = (k2.a) r2
            m2.b r3 = r0.s0()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.a()
            r3.a(r2)
            goto L_0x00ff
        L_0x011d:
            r0.b()
            goto L_0x00e1
        L_0x0121:
            r0.b()
            goto L_0x00e1
        L_0x0125:
            java.util.HashMap<java.lang.Object, k2.a> r8 = r7.f8107a
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x012f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01a4
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, k2.a> r1 = r7.f8107a
            java.lang.Object r0 = r1.get(r0)
            k2.a r0 = (k2.a) r0
            androidx.constraintlayout.core.state.a r1 = r7.f8110d
            if (r0 == r1) goto L_0x012f
            l2.e r1 = r0.e()
            boolean r1 = r1 instanceof androidx.constraintlayout.core.state.c
            if (r1 == 0) goto L_0x012f
            l2.e r1 = r0.e()
            androidx.constraintlayout.core.state.c r1 = (androidx.constraintlayout.core.state.c) r1
            m2.b r2 = r1.s0()
            if (r2 == 0) goto L_0x012f
            java.util.ArrayList<java.lang.Object> r1 = r1.f8156l0
            java.util.Iterator r1 = r1.iterator()
        L_0x015f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01a0
            java.lang.Object r3 = r1.next()
            java.util.HashMap<java.lang.Object, k2.a> r4 = r7.f8107a
            java.lang.Object r4 = r4.get(r3)
            k2.a r4 = (k2.a) r4
            if (r4 == 0) goto L_0x017b
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r4.a()
            r2.a(r3)
            goto L_0x015f
        L_0x017b:
            boolean r4 = r3 instanceof k2.a
            if (r4 == 0) goto L_0x0189
            k2.a r3 = (k2.a) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.a()
            r2.a(r3)
            goto L_0x015f
        L_0x0189:
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "couldn't find reference for "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.println(r3)
            goto L_0x015f
        L_0x01a0:
            r0.b()
            goto L_0x012f
        L_0x01a4:
            java.util.HashMap<java.lang.Object, k2.a> r8 = r7.f8107a
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x01ae:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01d2
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, k2.a> r1 = r7.f8107a
            java.lang.Object r1 = r1.get(r0)
            k2.a r1 = (k2.a) r1
            r1.b()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.a()
            if (r1 == 0) goto L_0x01ae
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = r0.toString()
            r1.f8193o = r0
            goto L_0x01ae
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.State.a(androidx.constraintlayout.core.widgets.d):void");
    }

    public c b(Object obj, Direction direction) {
        a c11 = c(obj);
        if (c11.e() == null || !(c11.e() instanceof c)) {
            c cVar = new c(this);
            cVar.t0(direction);
            c11.W(cVar);
        }
        return (c) c11.e();
    }

    public a c(Object obj) {
        k2.a aVar = this.f8107a.get(obj);
        if (aVar == null) {
            aVar = e(obj);
            this.f8107a.put(obj, aVar);
            aVar.d(obj);
        }
        if (aVar instanceof a) {
            return (a) aVar;
        }
        return null;
    }

    public int d(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public a e(Object obj) {
        return new a(this);
    }

    public ArrayList<String> g(String str) {
        if (this.f8109c.containsKey(str)) {
            return this.f8109c.get(str);
        }
        return null;
    }

    public f h(Object obj, int i11) {
        a c11 = c(obj);
        if (c11.e() == null || !(c11.e() instanceof f)) {
            f fVar = new f(this);
            fVar.h(i11);
            fVar.d(obj);
            c11.W(fVar);
        }
        return (f) c11.e();
    }

    public State i(b bVar) {
        return p(bVar);
    }

    public c j(Object obj, Helper helper) {
        c cVar;
        if (obj == null) {
            obj = f();
        }
        c cVar2 = this.f8108b.get(obj);
        if (cVar2 == null) {
            int i11 = a.f8112a[helper.ordinal()];
            if (i11 == 1) {
                cVar = new g(this);
            } else if (i11 == 2) {
                cVar = new h(this);
            } else if (i11 == 3) {
                cVar = new l2.a(this);
            } else if (i11 == 4) {
                cVar = new b(this);
            } else if (i11 != 5) {
                cVar2 = new c(this, helper);
                cVar2.d(obj);
                this.f8108b.put(obj, cVar2);
            } else {
                cVar = new c(this);
            }
            cVar2 = cVar;
            cVar2.d(obj);
            this.f8108b.put(obj, cVar2);
        }
        return cVar2;
    }

    public g k() {
        return (g) j((Object) null, Helper.HORIZONTAL_CHAIN);
    }

    public f l(Object obj) {
        return h(obj, 0);
    }

    public void m(Object obj, Object obj2) {
        a c11 = c(obj);
        if (c11 instanceof a) {
            c11.d0(obj2);
        }
    }

    /* access modifiers changed from: package-private */
    public k2.a n(Object obj) {
        return this.f8107a.get(obj);
    }

    public void o() {
        this.f8108b.clear();
        this.f8109c.clear();
    }

    public State p(b bVar) {
        this.f8110d.X(bVar);
        return this;
    }

    public void q(String str, String str2) {
        ArrayList arrayList;
        a c11 = c(str);
        if (c11 instanceof a) {
            c11.a0(str2);
            if (!this.f8109c.containsKey(str2)) {
                arrayList = new ArrayList();
                this.f8109c.put(str2, arrayList);
            } else {
                arrayList = this.f8109c.get(str2);
            }
            arrayList.add(str);
        }
    }

    public State r(b bVar) {
        this.f8110d.e0(bVar);
        return this;
    }

    public h s() {
        return (h) j((Object) null, Helper.VERTICAL_CHAIN);
    }

    public f t(Object obj) {
        return h(obj, 1);
    }

    public State u(b bVar) {
        return r(bVar);
    }
}
