package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.content.res.k;
import androidx.core.view.a0;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* compiled from: Transition */
public abstract class b0 implements Cloneable {
    private static final int[] H = {2, 1, 3, 4};
    private static final y3.c I = new a();
    private static ThreadLocal<androidx.collection.a<Animator, d>> K = new ThreadLocal<>();
    private boolean A = false;
    private ArrayList<g> B = null;
    private ArrayList<Animator> C = new ArrayList<>();
    y3.e D;
    private f E;
    private androidx.collection.a<String, String> F;
    private y3.c G = I;

    /* renamed from: a  reason: collision with root package name */
    private String f11833a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    private long f11834b = -1;

    /* renamed from: c  reason: collision with root package name */
    long f11835c = -1;

    /* renamed from: d  reason: collision with root package name */
    private TimeInterpolator f11836d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<Integer> f11837e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    ArrayList<View> f11838f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<String> f11839g = null;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<Class<?>> f11840h = null;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Integer> f11841i = null;
    private ArrayList<View> j = null;
    private ArrayList<Class<?>> k = null;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<String> f11842l = null;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<Integer> f11843m = null;
    private ArrayList<View> n = null;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<Class<?>> f11844o = null;

    /* renamed from: p  reason: collision with root package name */
    private i0 f11845p = new i0();
    private i0 q = new i0();

    /* renamed from: r  reason: collision with root package name */
    f0 f11846r = null;

    /* renamed from: s  reason: collision with root package name */
    private int[] f11847s = H;
    private ArrayList<h0> t;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<h0> f11848u;
    private ViewGroup v = null;

    /* renamed from: w  reason: collision with root package name */
    boolean f11849w = false;

    /* renamed from: x  reason: collision with root package name */
    ArrayList<Animator> f11850x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    private int f11851y = 0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f11852z = false;

    /* compiled from: Transition */
    static class a extends y3.c {
        a() {
        }

        public Path a(float f11, float f12, float f13, float f14) {
            Path path = new Path();
            path.moveTo(f11, f12);
            path.lineTo(f13, f14);
            return path;
        }
    }

    /* compiled from: Transition */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f11853a;

        b(androidx.collection.a aVar) {
            this.f11853a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f11853a.remove(animator);
            b0.this.f11850x.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            b0.this.f11850x.add(animator);
        }
    }

    /* compiled from: Transition */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            b0.this.u();
            animator.removeListener(this);
        }
    }

    /* compiled from: Transition */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        View f11856a;

        /* renamed from: b  reason: collision with root package name */
        String f11857b;

        /* renamed from: c  reason: collision with root package name */
        h0 f11858c;

        /* renamed from: d  reason: collision with root package name */
        y0 f11859d;

        /* renamed from: e  reason: collision with root package name */
        b0 f11860e;

        d(View view, String str, b0 b0Var, y0 y0Var, h0 h0Var) {
            this.f11856a = view;
            this.f11857b = str;
            this.f11858c = h0Var;
            this.f11859d = y0Var;
            this.f11860e = b0Var;
        }
    }

    /* compiled from: Transition */
    private static class e {
        static <T> ArrayList<T> a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        static <T> ArrayList<T> b(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* compiled from: Transition */
    public static abstract class f {
        public abstract Rect a(b0 b0Var);
    }

    /* compiled from: Transition */
    public interface g {
        void a(b0 b0Var);

        void b(b0 b0Var);

        void c(b0 b0Var);

        void d(b0 b0Var);

        void e(b0 b0Var);
    }

    public b0() {
    }

    private ArrayList<Class<?>> A(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z11) {
        if (cls == null) {
            return arrayList;
        }
        if (z11) {
            return e.a(arrayList, cls);
        }
        return e.b(arrayList, cls);
    }

    private static androidx.collection.a<Animator, d> J() {
        androidx.collection.a<Animator, d> aVar = K.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
        K.set(aVar2);
        return aVar2;
    }

    private static boolean S(int i11) {
        return i11 >= 1 && i11 <= 4;
    }

    private static boolean U(h0 h0Var, h0 h0Var2, String str) {
        Object obj = h0Var.f11935a.get(str);
        Object obj2 = h0Var2.f11935a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void V(androidx.collection.a<View, h0> aVar, androidx.collection.a<View, h0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            View valueAt = sparseArray.valueAt(i11);
            if (valueAt != null && T(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i11))) != null && T(view)) {
                h0 h0Var = aVar.get(valueAt);
                h0 h0Var2 = aVar2.get(view);
                if (!(h0Var == null || h0Var2 == null)) {
                    this.t.add(h0Var);
                    this.f11848u.add(h0Var2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void W(androidx.collection.a<View, h0> aVar, androidx.collection.a<View, h0> aVar2) {
        h0 remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m11 = aVar.m(size);
            if (m11 != null && T(m11) && (remove = aVar2.remove(m11)) != null && T(remove.f11936b)) {
                this.t.add(aVar.o(size));
                this.f11848u.add(remove);
            }
        }
    }

    private void X(androidx.collection.a<View, h0> aVar, androidx.collection.a<View, h0> aVar2, androidx.collection.e<View> eVar, androidx.collection.e<View> eVar2) {
        View i11;
        int q11 = eVar.q();
        for (int i12 = 0; i12 < q11; i12++) {
            View r11 = eVar.r(i12);
            if (r11 != null && T(r11) && (i11 = eVar2.i(eVar.m(i12))) != null && T(i11)) {
                h0 h0Var = aVar.get(r11);
                h0 h0Var2 = aVar2.get(i11);
                if (!(h0Var == null || h0Var2 == null)) {
                    this.t.add(h0Var);
                    this.f11848u.add(h0Var2);
                    aVar.remove(r11);
                    aVar2.remove(i11);
                }
            }
        }
    }

    private void Y(androidx.collection.a<View, h0> aVar, androidx.collection.a<View, h0> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i11 = 0; i11 < size; i11++) {
            View q11 = aVar3.q(i11);
            if (q11 != null && T(q11) && (view = aVar4.get(aVar3.m(i11))) != null && T(view)) {
                h0 h0Var = aVar.get(q11);
                h0 h0Var2 = aVar2.get(view);
                if (!(h0Var == null || h0Var2 == null)) {
                    this.t.add(h0Var);
                    this.f11848u.add(h0Var2);
                    aVar.remove(q11);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void Z(i0 i0Var, i0 i0Var2) {
        androidx.collection.a aVar = new androidx.collection.a((androidx.collection.g) i0Var.f11938a);
        androidx.collection.a aVar2 = new androidx.collection.a((androidx.collection.g) i0Var2.f11938a);
        int i11 = 0;
        while (true) {
            int[] iArr = this.f11847s;
            if (i11 < iArr.length) {
                int i12 = iArr[i11];
                if (i12 == 1) {
                    W(aVar, aVar2);
                } else if (i12 == 2) {
                    Y(aVar, aVar2, i0Var.f11941d, i0Var2.f11941d);
                } else if (i12 == 3) {
                    V(aVar, aVar2, i0Var.f11939b, i0Var2.f11939b);
                } else if (i12 == 4) {
                    X(aVar, aVar2, i0Var.f11940c, i0Var2.f11940c);
                }
                i11++;
            } else {
                g(aVar, aVar2);
                return;
            }
        }
    }

    private static int[] a0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i11 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (DistributedTracing.NR_ID_ATTRIBUTE.equalsIgnoreCase(trim)) {
                iArr[i11] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i11] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i11] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i11] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                i11--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i11++;
        }
        return iArr;
    }

    private void g(androidx.collection.a<View, h0> aVar, androidx.collection.a<View, h0> aVar2) {
        for (int i11 = 0; i11 < aVar.size(); i11++) {
            h0 q11 = aVar.q(i11);
            if (T(q11.f11936b)) {
                this.t.add(q11);
                this.f11848u.add((Object) null);
            }
        }
        for (int i12 = 0; i12 < aVar2.size(); i12++) {
            h0 q12 = aVar2.q(i12);
            if (T(q12.f11936b)) {
                this.f11848u.add(q12);
                this.t.add((Object) null);
            }
        }
    }

    private void g0(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            j(animator);
        }
    }

    private static void h(i0 i0Var, View view, h0 h0Var) {
        i0Var.f11938a.put(view, h0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (i0Var.f11939b.indexOfKey(id2) >= 0) {
                i0Var.f11939b.put(id2, (Object) null);
            } else {
                i0Var.f11939b.put(id2, view);
            }
        }
        String O = a0.O(view);
        if (O != null) {
            if (i0Var.f11941d.containsKey(O)) {
                i0Var.f11941d.put(O, null);
            } else {
                i0Var.f11941d.put(O, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (i0Var.f11940c.k(itemIdAtPosition) >= 0) {
                    View i11 = i0Var.f11940c.i(itemIdAtPosition);
                    if (i11 != null) {
                        a0.G0(i11, false);
                        i0Var.f11940c.n(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                a0.G0(view, true);
                i0Var.f11940c.n(itemIdAtPosition, view);
            }
        }
    }

    private static boolean i(int[] iArr, int i11) {
        int i12 = iArr[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            if (iArr[i13] == i12) {
                return true;
            }
        }
        return false;
    }

    private void l(View view, boolean z11) {
        if (view != null) {
            int id2 = view.getId();
            ArrayList<Integer> arrayList = this.f11841i;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
                ArrayList<View> arrayList2 = this.j;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.k;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            if (!this.k.get(i11).isInstance(view)) {
                                i11++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        h0 h0Var = new h0(view);
                        if (z11) {
                            n(h0Var);
                        } else {
                            k(h0Var);
                        }
                        h0Var.f11937c.add(this);
                        m(h0Var);
                        if (z11) {
                            h(this.f11845p, view, h0Var);
                        } else {
                            h(this.q, view, h0Var);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f11843m;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                            ArrayList<View> arrayList5 = this.n;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f11844o;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i12 = 0;
                                    while (i12 < size2) {
                                        if (!this.f11844o.get(i12).isInstance(view)) {
                                            i12++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                                    l(viewGroup.getChildAt(i13), z11);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList<Integer> v(ArrayList<Integer> arrayList, int i11, boolean z11) {
        if (i11 <= 0) {
            return arrayList;
        }
        if (z11) {
            return e.a(arrayList, Integer.valueOf(i11));
        }
        return e.b(arrayList, Integer.valueOf(i11));
    }

    private static <T> ArrayList<T> w(ArrayList<T> arrayList, T t11, boolean z11) {
        if (t11 == null) {
            return arrayList;
        }
        if (z11) {
            return e.a(arrayList, t11);
        }
        return e.b(arrayList, t11);
    }

    public long B() {
        return this.f11835c;
    }

    public Rect C() {
        f fVar = this.E;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    public f D() {
        return this.E;
    }

    public TimeInterpolator E() {
        return this.f11836d;
    }

    /* access modifiers changed from: package-private */
    public h0 F(View view, boolean z11) {
        f0 f0Var = this.f11846r;
        if (f0Var != null) {
            return f0Var.F(view, z11);
        }
        ArrayList<h0> arrayList = z11 ? this.t : this.f11848u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                break;
            }
            h0 h0Var = arrayList.get(i12);
            if (h0Var == null) {
                return null;
            }
            if (h0Var.f11936b == view) {
                i11 = i12;
                break;
            }
            i12++;
        }
        if (i11 < 0) {
            return null;
        }
        return (z11 ? this.f11848u : this.t).get(i11);
    }

    public String G() {
        return this.f11833a;
    }

    public y3.c H() {
        return this.G;
    }

    public y3.e I() {
        return this.D;
    }

    public long K() {
        return this.f11834b;
    }

    public List<Integer> L() {
        return this.f11837e;
    }

    public List<String> M() {
        return this.f11839g;
    }

    public List<Class<?>> N() {
        return this.f11840h;
    }

    public List<View> O() {
        return this.f11838f;
    }

    public String[] P() {
        return null;
    }

    public h0 Q(View view, boolean z11) {
        f0 f0Var = this.f11846r;
        if (f0Var != null) {
            return f0Var.Q(view, z11);
        }
        return (z11 ? this.f11845p : this.q).f11938a.get(view);
    }

    public boolean R(h0 h0Var, h0 h0Var2) {
        if (h0Var == null || h0Var2 == null) {
            return false;
        }
        String[] P = P();
        if (P != null) {
            int length = P.length;
            int i11 = 0;
            while (i11 < length) {
                if (!U(h0Var, h0Var2, P[i11])) {
                    i11++;
                }
            }
            return false;
        }
        for (String U : h0Var.f11935a.keySet()) {
            if (U(h0Var, h0Var2, U)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean T(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f11841i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (this.k.get(i11).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f11842l != null && a0.O(view) != null && this.f11842l.contains(a0.O(view))) {
            return false;
        }
        if ((this.f11837e.size() == 0 && this.f11838f.size() == 0 && (((arrayList = this.f11840h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f11839g) == null || arrayList2.isEmpty()))) || this.f11837e.contains(Integer.valueOf(id2)) || this.f11838f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f11839g;
        if (arrayList6 != null && arrayList6.contains(a0.O(view))) {
            return true;
        }
        if (this.f11840h != null) {
            for (int i12 = 0; i12 < this.f11840h.size(); i12++) {
                if (this.f11840h.get(i12).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public b0 b(g gVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(gVar);
        return this;
    }

    public void b0(View view) {
        if (!this.A) {
            androidx.collection.a<Animator, d> J = J();
            int size = J.size();
            y0 d11 = p0.d(view);
            for (int i11 = size - 1; i11 >= 0; i11--) {
                d q11 = J.q(i11);
                if (q11.f11856a != null && d11.equals(q11.f11859d)) {
                    a.b(J.m(i11));
                }
            }
            ArrayList<g> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((g) arrayList2.get(i12)).c(this);
                }
            }
            this.f11852z = true;
        }
    }

    public b0 c(int i11) {
        if (i11 != 0) {
            this.f11837e.add(Integer.valueOf(i11));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void c0(ViewGroup viewGroup) {
        d dVar;
        this.t = new ArrayList<>();
        this.f11848u = new ArrayList<>();
        Z(this.f11845p, this.q);
        androidx.collection.a<Animator, d> J = J();
        int size = J.size();
        y0 d11 = p0.d(viewGroup);
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator m11 = J.m(i11);
            if (!(m11 == null || (dVar = J.get(m11)) == null || dVar.f11856a == null || !d11.equals(dVar.f11859d))) {
                h0 h0Var = dVar.f11858c;
                View view = dVar.f11856a;
                h0 Q = Q(view, true);
                h0 F2 = F(view, true);
                if (Q == null && F2 == null) {
                    F2 = this.q.f11938a.get(view);
                }
                if (!(Q == null && F2 == null) && dVar.f11860e.R(h0Var, F2)) {
                    if (m11.isRunning() || m11.isStarted()) {
                        m11.cancel();
                    } else {
                        J.remove(m11);
                    }
                }
            }
        }
        s(viewGroup, this.f11845p, this.q, this.t, this.f11848u);
        h0();
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f11850x.size() - 1; size >= 0; size--) {
            this.f11850x.get(size).cancel();
        }
        ArrayList<g> arrayList = this.B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.B.clone();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((g) arrayList2.get(i11)).e(this);
            }
        }
    }

    public b0 d(View view) {
        this.f11838f.add(view);
        return this;
    }

    public b0 d0(g gVar) {
        ArrayList<g> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(gVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    public b0 e(Class<?> cls) {
        if (this.f11840h == null) {
            this.f11840h = new ArrayList<>();
        }
        this.f11840h.add(cls);
        return this;
    }

    public b0 e0(View view) {
        this.f11838f.remove(view);
        return this;
    }

    public b0 f(String str) {
        if (this.f11839g == null) {
            this.f11839g = new ArrayList<>();
        }
        this.f11839g.add(str);
        return this;
    }

    public void f0(View view) {
        if (this.f11852z) {
            if (!this.A) {
                androidx.collection.a<Animator, d> J = J();
                int size = J.size();
                y0 d11 = p0.d(view);
                for (int i11 = size - 1; i11 >= 0; i11--) {
                    d q11 = J.q(i11);
                    if (q11.f11856a != null && d11.equals(q11.f11859d)) {
                        a.c(J.m(i11));
                    }
                }
                ArrayList<g> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        ((g) arrayList2.get(i12)).a(this);
                    }
                }
            }
            this.f11852z = false;
        }
    }

    /* access modifiers changed from: protected */
    public void h0() {
        r0();
        androidx.collection.a<Animator, d> J = J();
        Iterator<Animator> it2 = this.C.iterator();
        while (it2.hasNext()) {
            Animator next = it2.next();
            if (J.containsKey(next)) {
                r0();
                g0(next, J);
            }
        }
        this.C.clear();
        u();
    }

    /* access modifiers changed from: package-private */
    public void i0(boolean z11) {
        this.f11849w = z11;
    }

    /* access modifiers changed from: protected */
    public void j(Animator animator) {
        if (animator == null) {
            u();
            return;
        }
        if (B() >= 0) {
            animator.setDuration(B());
        }
        if (K() >= 0) {
            animator.setStartDelay(K() + animator.getStartDelay());
        }
        if (E() != null) {
            animator.setInterpolator(E());
        }
        animator.addListener(new c());
        animator.start();
    }

    public b0 j0(long j11) {
        this.f11835c = j11;
        return this;
    }

    public abstract void k(h0 h0Var);

    public void k0(f fVar) {
        this.E = fVar;
    }

    public b0 l0(TimeInterpolator timeInterpolator) {
        this.f11836d = timeInterpolator;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void m(h0 h0Var) {
        String[] b11;
        if (this.D != null && !h0Var.f11935a.isEmpty() && (b11 = this.D.b()) != null) {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= b11.length) {
                    z11 = true;
                    break;
                } else if (!h0Var.f11935a.containsKey(b11[i11])) {
                    break;
                } else {
                    i11++;
                }
            }
            if (!z11) {
                this.D.a(h0Var);
            }
        }
    }

    public void m0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f11847s = H;
            return;
        }
        int i11 = 0;
        while (i11 < iArr.length) {
            if (!S(iArr[i11])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!i(iArr, i11)) {
                i11++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f11847s = (int[]) iArr.clone();
    }

    public abstract void n(h0 h0Var);

    public void n0(y3.c cVar) {
        if (cVar == null) {
            this.G = I;
        } else {
            this.G = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public void o(ViewGroup viewGroup, boolean z11) {
        androidx.collection.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        p(z11);
        if ((this.f11837e.size() > 0 || this.f11838f.size() > 0) && (((arrayList = this.f11839g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f11840h) == null || arrayList2.isEmpty()))) {
            for (int i11 = 0; i11 < this.f11837e.size(); i11++) {
                View findViewById = viewGroup.findViewById(this.f11837e.get(i11).intValue());
                if (findViewById != null) {
                    h0 h0Var = new h0(findViewById);
                    if (z11) {
                        n(h0Var);
                    } else {
                        k(h0Var);
                    }
                    h0Var.f11937c.add(this);
                    m(h0Var);
                    if (z11) {
                        h(this.f11845p, findViewById, h0Var);
                    } else {
                        h(this.q, findViewById, h0Var);
                    }
                }
            }
            for (int i12 = 0; i12 < this.f11838f.size(); i12++) {
                View view = this.f11838f.get(i12);
                h0 h0Var2 = new h0(view);
                if (z11) {
                    n(h0Var2);
                } else {
                    k(h0Var2);
                }
                h0Var2.f11937c.add(this);
                m(h0Var2);
                if (z11) {
                    h(this.f11845p, view, h0Var2);
                } else {
                    h(this.q, view, h0Var2);
                }
            }
        } else {
            l(viewGroup, z11);
        }
        if (!z11 && (aVar = this.F) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i13 = 0; i13 < size; i13++) {
                arrayList3.add(this.f11845p.f11941d.remove(this.F.m(i13)));
            }
            for (int i14 = 0; i14 < size; i14++) {
                View view2 = (View) arrayList3.get(i14);
                if (view2 != null) {
                    this.f11845p.f11941d.put(this.F.q(i14), view2);
                }
            }
        }
    }

    public void o0(y3.e eVar) {
        this.D = eVar;
    }

    /* access modifiers changed from: package-private */
    public void p(boolean z11) {
        if (z11) {
            this.f11845p.f11938a.clear();
            this.f11845p.f11939b.clear();
            this.f11845p.f11940c.e();
            return;
        }
        this.q.f11938a.clear();
        this.q.f11939b.clear();
        this.q.f11940c.e();
    }

    /* access modifiers changed from: package-private */
    public b0 p0(ViewGroup viewGroup) {
        this.v = viewGroup;
        return this;
    }

    /* renamed from: q */
    public b0 clone() {
        try {
            b0 b0Var = (b0) super.clone();
            b0Var.C = new ArrayList<>();
            b0Var.f11845p = new i0();
            b0Var.q = new i0();
            b0Var.t = null;
            b0Var.f11848u = null;
            return b0Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public b0 q0(long j11) {
        this.f11834b = j11;
        return this;
    }

    public Animator r(ViewGroup viewGroup, h0 h0Var, h0 h0Var2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void r0() {
        if (this.f11851y == 0) {
            ArrayList<g> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((g) arrayList2.get(i11)).b(this);
                }
            }
            this.A = false;
        }
        this.f11851y++;
    }

    /* access modifiers changed from: protected */
    public void s(ViewGroup viewGroup, i0 i0Var, i0 i0Var2, ArrayList<h0> arrayList, ArrayList<h0> arrayList2) {
        int i11;
        int i12;
        Animator r11;
        View view;
        Animator animator;
        h0 h0Var;
        h0 h0Var2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        androidx.collection.a<Animator, d> J = J();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j11 = Long.MAX_VALUE;
        int i13 = 0;
        while (i13 < size) {
            h0 h0Var3 = arrayList.get(i13);
            h0 h0Var4 = arrayList2.get(i13);
            if (h0Var3 != null && !h0Var3.f11937c.contains(this)) {
                h0Var3 = null;
            }
            if (h0Var4 != null && !h0Var4.f11937c.contains(this)) {
                h0Var4 = null;
            }
            if (!(h0Var3 == null && h0Var4 == null)) {
                if ((h0Var3 == null || h0Var4 == null || R(h0Var3, h0Var4)) && (r11 = r(viewGroup2, h0Var3, h0Var4)) != null) {
                    if (h0Var4 != null) {
                        view = h0Var4.f11936b;
                        String[] P = P();
                        if (P != null && P.length > 0) {
                            h0Var2 = new h0(view);
                            Animator animator3 = r11;
                            i12 = size;
                            h0 h0Var5 = i0Var2.f11938a.get(view);
                            if (h0Var5 != null) {
                                int i14 = 0;
                                while (i14 < P.length) {
                                    h0Var2.f11935a.put(P[i14], h0Var5.f11935a.get(P[i14]));
                                    i14++;
                                    ArrayList<h0> arrayList3 = arrayList2;
                                    i13 = i13;
                                    h0Var5 = h0Var5;
                                }
                            }
                            i11 = i13;
                            int size2 = J.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                d dVar = J.get(J.m(i15));
                                if (dVar.f11858c != null && dVar.f11856a == view && dVar.f11857b.equals(G()) && dVar.f11858c.equals(h0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            i12 = size;
                            i11 = i13;
                            animator2 = r11;
                            h0Var2 = null;
                        }
                        animator = animator2;
                        h0Var = h0Var2;
                    } else {
                        i12 = size;
                        i11 = i13;
                        view = h0Var3.f11936b;
                        animator = r11;
                        h0Var = null;
                    }
                    if (animator != null) {
                        y3.e eVar = this.D;
                        if (eVar != null) {
                            long c11 = eVar.c(viewGroup2, this, h0Var3, h0Var4);
                            sparseIntArray.put(this.C.size(), (int) c11);
                            j11 = Math.min(c11, j11);
                        }
                        J.put(animator, new d(view, G(), this, p0.d(viewGroup), h0Var));
                        this.C.add(animator);
                        j11 = j11;
                    }
                    i13 = i11 + 1;
                    size = i12;
                }
            }
            i12 = size;
            i11 = i13;
            i13 = i11 + 1;
            size = i12;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                Animator animator4 = this.C.get(sparseIntArray.keyAt(i16));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i16)) - j11) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String s0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f11835c != -1) {
            str2 = str2 + "dur(" + this.f11835c + ") ";
        }
        if (this.f11834b != -1) {
            str2 = str2 + "dly(" + this.f11834b + ") ";
        }
        if (this.f11836d != null) {
            str2 = str2 + "interp(" + this.f11836d + ") ";
        }
        if (this.f11837e.size() <= 0 && this.f11838f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f11837e.size() > 0) {
            for (int i11 = 0; i11 < this.f11837e.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f11837e.get(i11);
            }
        }
        if (this.f11838f.size() > 0) {
            for (int i12 = 0; i12 < this.f11838f.size(); i12++) {
                if (i12 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f11838f.get(i12);
            }
        }
        return str3 + ")";
    }

    public String toString() {
        return s0("");
    }

    /* access modifiers changed from: protected */
    public void u() {
        int i11 = this.f11851y - 1;
        this.f11851y = i11;
        if (i11 == 0) {
            ArrayList<g> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((g) arrayList2.get(i12)).d(this);
                }
            }
            for (int i13 = 0; i13 < this.f11845p.f11940c.q(); i13++) {
                View r11 = this.f11845p.f11940c.r(i13);
                if (r11 != null) {
                    a0.G0(r11, false);
                }
            }
            for (int i14 = 0; i14 < this.q.f11940c.q(); i14++) {
                View r12 = this.q.f11940c.r(i14);
                if (r12 != null) {
                    a0.G0(r12, false);
                }
            }
            this.A = true;
        }
    }

    public b0 x(int i11, boolean z11) {
        this.f11841i = v(this.f11841i, i11, z11);
        return this;
    }

    public b0 y(Class<?> cls, boolean z11) {
        this.k = A(this.k, cls, z11);
        return this;
    }

    public b0 z(String str, boolean z11) {
        this.f11842l = w(this.f11842l, str, z11);
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public b0(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f11819c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k11 = (long) k.k(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (k11 >= 0) {
            j0(k11);
        }
        long k12 = (long) k.k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k12 > 0) {
            q0(k12);
        }
        int l11 = k.l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l11 > 0) {
            l0(AnimationUtils.loadInterpolator(context, l11));
        }
        String m11 = k.m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m11 != null) {
            m0(a0(m11));
        }
        obtainStyledAttributes.recycle();
    }
}
