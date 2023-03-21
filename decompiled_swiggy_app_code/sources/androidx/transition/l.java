package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.transition.b0;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* compiled from: FragmentTransitionSupport */
public class l extends v {

    /* compiled from: FragmentTransitionSupport */
    class a extends b0.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f11957a;

        a(Rect rect) {
            this.f11957a = rect;
        }

        public Rect a(b0 b0Var) {
            return this.f11957a;
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class b implements b0.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f11959a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f11960b;

        b(View view, ArrayList arrayList) {
            this.f11959a = view;
            this.f11960b = arrayList;
        }

        public void a(b0 b0Var) {
        }

        public void b(b0 b0Var) {
            b0Var.d0(this);
            b0Var.b(this);
        }

        public void c(b0 b0Var) {
        }

        public void d(b0 b0Var) {
            b0Var.d0(this);
            this.f11959a.setVisibility(8);
            int size = this.f11960b.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((View) this.f11960b.get(i11)).setVisibility(0);
            }
        }

        public void e(b0 b0Var) {
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class c extends d0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f11962a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f11963b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f11964c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f11965d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f11966e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f11967f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f11962a = obj;
            this.f11963b = arrayList;
            this.f11964c = obj2;
            this.f11965d = arrayList2;
            this.f11966e = obj3;
            this.f11967f = arrayList3;
        }

        public void b(b0 b0Var) {
            Object obj = this.f11962a;
            if (obj != null) {
                l.this.q(obj, this.f11963b, (ArrayList<View>) null);
            }
            Object obj2 = this.f11964c;
            if (obj2 != null) {
                l.this.q(obj2, this.f11965d, (ArrayList<View>) null);
            }
            Object obj3 = this.f11966e;
            if (obj3 != null) {
                l.this.q(obj3, this.f11967f, (ArrayList<View>) null);
            }
        }

        public void d(b0 b0Var) {
            b0Var.d0(this);
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class d implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f11969a;

        d(b0 b0Var) {
            this.f11969a = b0Var;
        }

        public void e() {
            this.f11969a.cancel();
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class e implements b0.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f11971a;

        e(Runnable runnable) {
            this.f11971a = runnable;
        }

        public void a(b0 b0Var) {
        }

        public void b(b0 b0Var) {
        }

        public void c(b0 b0Var) {
        }

        public void d(b0 b0Var) {
            this.f11971a.run();
        }

        public void e(b0 b0Var) {
        }
    }

    /* compiled from: FragmentTransitionSupport */
    class f extends b0.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f11973a;

        f(Rect rect) {
            this.f11973a = rect;
        }

        public Rect a(b0 b0Var) {
            Rect rect = this.f11973a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f11973a;
        }
    }

    private static boolean C(b0 b0Var) {
        return !v.l(b0Var.L()) || !v.l(b0Var.M()) || !v.l(b0Var.N());
    }

    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        f0 f0Var = (f0) obj;
        if (f0Var != null) {
            f0Var.O().clear();
            f0Var.O().addAll(arrayList2);
            q(f0Var, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        f0 f0Var = new f0();
        f0Var.y0((b0) obj);
        return f0Var;
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((b0) obj).d(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        b0 b0Var = (b0) obj;
        if (b0Var != null) {
            int i11 = 0;
            if (b0Var instanceof f0) {
                f0 f0Var = (f0) b0Var;
                int B0 = f0Var.B0();
                while (i11 < B0) {
                    b(f0Var.A0(i11), arrayList);
                    i11++;
                }
            } else if (!C(b0Var) && v.l(b0Var.O())) {
                int size = arrayList.size();
                while (i11 < size) {
                    b0Var.d(arrayList.get(i11));
                    i11++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        e0.b(viewGroup, (b0) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof b0;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((b0) obj).clone();
        }
        return null;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        b0 b0Var = (b0) obj;
        b0 b0Var2 = (b0) obj2;
        b0 b0Var3 = (b0) obj3;
        if (b0Var != null && b0Var2 != null) {
            b0Var = new f0().y0(b0Var).y0(b0Var2).G0(1);
        } else if (b0Var == null) {
            b0Var = b0Var2 != null ? b0Var2 : null;
        }
        if (b0Var3 == null) {
            return b0Var;
        }
        f0 f0Var = new f0();
        if (b0Var != null) {
            f0Var.y0(b0Var);
        }
        f0Var.y0(b0Var3);
        return f0Var;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        f0 f0Var = new f0();
        if (obj != null) {
            f0Var.y0((b0) obj);
        }
        if (obj2 != null) {
            f0Var.y0((b0) obj2);
        }
        if (obj3 != null) {
            f0Var.y0((b0) obj3);
        }
        return f0Var;
    }

    public void p(Object obj, View view) {
        if (obj != null) {
            ((b0) obj).e0(view);
        }
    }

    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i11;
        b0 b0Var = (b0) obj;
        int i12 = 0;
        if (b0Var instanceof f0) {
            f0 f0Var = (f0) b0Var;
            int B0 = f0Var.B0();
            while (i12 < B0) {
                q(f0Var.A0(i12), arrayList, arrayList2);
                i12++;
            }
        } else if (!C(b0Var)) {
            List<View> O = b0Var.O();
            if (O.size() == arrayList.size() && O.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i11 = 0;
                } else {
                    i11 = arrayList2.size();
                }
                while (i12 < i11) {
                    b0Var.d(arrayList2.get(i12));
                    i12++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b0Var.e0(arrayList.get(size));
                }
            }
        }
    }

    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((b0) obj).b(new b(view, arrayList));
    }

    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((b0) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((b0) obj).k0(new f(rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((b0) obj).k0(new a(rect));
        }
    }

    public void w(Fragment fragment, Object obj, androidx.core.os.c cVar, Runnable runnable) {
        b0 b0Var = (b0) obj;
        cVar.c(new d(b0Var));
        b0Var.b(new e(runnable));
    }

    public void z(Object obj, View view, ArrayList<View> arrayList) {
        f0 f0Var = (f0) obj;
        List<View> O = f0Var.O();
        O.clear();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            v.d(O, arrayList.get(i11));
        }
        O.add(view);
        arrayList.add(view);
        b(f0Var, arrayList);
    }
}
