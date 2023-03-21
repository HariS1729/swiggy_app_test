package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static b0 f11895a = new y3.a();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<b0>>>> f11896b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f11897c = new ArrayList<>();

    /* compiled from: TransitionManager */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        b0 f11898a;

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f11899b;

        /* renamed from: androidx.transition.e0$a$a  reason: collision with other inner class name */
        /* compiled from: TransitionManager */
        class C0088a extends d0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f11900a;

            C0088a(androidx.collection.a aVar) {
                this.f11900a = aVar;
            }

            public void d(b0 b0Var) {
                ((ArrayList) this.f11900a.get(a.this.f11899b)).remove(b0Var);
                b0Var.d0(this);
            }
        }

        a(b0 b0Var, ViewGroup viewGroup) {
            this.f11898a = b0Var;
            this.f11899b = viewGroup;
        }

        private void a() {
            this.f11899b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f11899b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!e0.f11897c.remove(this.f11899b)) {
                return true;
            }
            androidx.collection.a<ViewGroup, ArrayList<b0>> d11 = e0.d();
            ArrayList arrayList = d11.get(this.f11899b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                d11.put(this.f11899b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f11898a);
            this.f11898a.b(new C0088a(d11));
            this.f11898a.o(this.f11899b, false);
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((b0) it2.next()).f0(this.f11899b);
                }
            }
            this.f11898a.c0(this.f11899b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            e0.f11897c.remove(this.f11899b);
            ArrayList arrayList = e0.d().get(this.f11899b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((b0) it2.next()).f0(this.f11899b);
                }
            }
            this.f11898a.p(true);
        }
    }

    public static void a(ViewGroup viewGroup) {
        b(viewGroup, (b0) null);
    }

    public static void b(ViewGroup viewGroup, b0 b0Var) {
        if (!f11897c.contains(viewGroup) && a0.a0(viewGroup)) {
            f11897c.add(viewGroup);
            if (b0Var == null) {
                b0Var = f11895a;
            }
            b0 q = b0Var.clone();
            g(viewGroup, q);
            y.g(viewGroup, (y) null);
            f(viewGroup, q);
        }
    }

    private static void c(y yVar, b0 b0Var) {
        ViewGroup e11 = yVar.e();
        if (!f11897c.contains(e11)) {
            y c11 = y.c(e11);
            if (b0Var == null) {
                if (c11 != null) {
                    c11.b();
                }
                yVar.a();
                return;
            }
            f11897c.add(e11);
            b0 q = b0Var.clone();
            q.p0(e11);
            if (c11 != null && c11.f()) {
                q.i0(true);
            }
            g(e11, q);
            yVar.a();
            f(e11, q);
        }
    }

    static androidx.collection.a<ViewGroup, ArrayList<b0>> d() {
        androidx.collection.a<ViewGroup, ArrayList<b0>> aVar;
        WeakReference weakReference = f11896b.get();
        if (weakReference != null && (aVar = (androidx.collection.a) weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a<ViewGroup, ArrayList<b0>> aVar2 = new androidx.collection.a<>();
        f11896b.set(new WeakReference(aVar2));
        return aVar2;
    }

    public static void e(y yVar, b0 b0Var) {
        c(yVar, b0Var);
    }

    private static void f(ViewGroup viewGroup, b0 b0Var) {
        if (b0Var != null && viewGroup != null) {
            a aVar = new a(b0Var, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void g(ViewGroup viewGroup, b0 b0Var) {
        ArrayList arrayList = d().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((b0) it2.next()).b0(viewGroup);
            }
        }
        if (b0Var != null) {
            b0Var.o(viewGroup, true);
        }
        y c11 = y.c(viewGroup);
        if (c11 != null) {
            c11.b();
        }
    }
}
