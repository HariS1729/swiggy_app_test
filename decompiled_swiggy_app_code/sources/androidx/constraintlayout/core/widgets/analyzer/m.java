package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.b;
import in.swiggy.android.tejas.oldapi.models.listing.PLCardTypes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject;

/* compiled from: WidgetGroup */
public class m {

    /* renamed from: g  reason: collision with root package name */
    static int f8276g;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<ConstraintWidget> f8277a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    int f8278b;

    /* renamed from: c  reason: collision with root package name */
    boolean f8279c = false;

    /* renamed from: d  reason: collision with root package name */
    int f8280d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<a> f8281e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f8282f = -1;

    /* compiled from: WidgetGroup */
    class a {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<ConstraintWidget> f8283a;

        /* renamed from: b  reason: collision with root package name */
        int f8284b;

        /* renamed from: c  reason: collision with root package name */
        int f8285c;

        /* renamed from: d  reason: collision with root package name */
        int f8286d;

        /* renamed from: e  reason: collision with root package name */
        int f8287e;

        /* renamed from: f  reason: collision with root package name */
        int f8288f;

        /* renamed from: g  reason: collision with root package name */
        int f8289g;

        public a(ConstraintWidget constraintWidget, d dVar, int i11) {
            this.f8283a = new WeakReference<>(constraintWidget);
            this.f8284b = dVar.x(constraintWidget.Q);
            this.f8285c = dVar.x(constraintWidget.R);
            this.f8286d = dVar.x(constraintWidget.S);
            this.f8287e = dVar.x(constraintWidget.T);
            this.f8288f = dVar.x(constraintWidget.U);
            this.f8289g = i11;
        }
    }

    public m(int i11) {
        int i12 = f8276g;
        f8276g = i12 + 1;
        this.f8278b = i12;
        this.f8280d = i11;
    }

    private String e() {
        int i11 = this.f8280d;
        return i11 == 0 ? "Horizontal" : i11 == 1 ? PLCardTypes.SUBTYPE_VERTICAL : i11 == 2 ? PDTableAttributeObject.SCOPE_BOTH : "Unknown";
    }

    private int j(d dVar, ArrayList<ConstraintWidget> arrayList, int i11) {
        int x11;
        int x12;
        androidx.constraintlayout.core.widgets.d dVar2 = (androidx.constraintlayout.core.widgets.d) arrayList.get(0).N();
        dVar.D();
        dVar2.g(dVar, false);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList.get(i12).g(dVar, false);
        }
        if (i11 == 0 && dVar2.f8313g1 > 0) {
            b.b(dVar2, dVar, arrayList, 0);
        }
        if (i11 == 1 && dVar2.f8314h1 > 0) {
            b.b(dVar2, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f8281e = new ArrayList<>();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f8281e.add(new a(arrayList.get(i13), dVar, i11));
        }
        if (i11 == 0) {
            x11 = dVar.x(dVar2.Q);
            x12 = dVar.x(dVar2.S);
            dVar.D();
        } else {
            x11 = dVar.x(dVar2.R);
            x12 = dVar.x(dVar2.T);
            dVar.D();
        }
        return x12 - x11;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.f8277a.contains(constraintWidget)) {
            return false;
        }
        this.f8277a.add(constraintWidget);
        return true;
    }

    public void b(ArrayList<m> arrayList) {
        int size = this.f8277a.size();
        if (this.f8282f != -1 && size > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                m mVar = arrayList.get(i11);
                if (this.f8282f == mVar.f8278b) {
                    g(this.f8280d, mVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f8278b;
    }

    public int d() {
        return this.f8280d;
    }

    public int f(d dVar, int i11) {
        if (this.f8277a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f8277a, i11);
    }

    public void g(int i11, m mVar) {
        Iterator<ConstraintWidget> it2 = this.f8277a.iterator();
        while (it2.hasNext()) {
            ConstraintWidget next = it2.next();
            mVar.a(next);
            if (i11 == 0) {
                next.S0 = mVar.c();
            } else {
                next.T0 = mVar.c();
            }
        }
        this.f8282f = mVar.f8278b;
    }

    public void h(boolean z11) {
        this.f8279c = z11;
    }

    public void i(int i11) {
        this.f8280d = i11;
    }

    public String toString() {
        String str = e() + " [" + this.f8278b + "] <";
        Iterator<ConstraintWidget> it2 = this.f8277a.iterator();
        while (it2.hasNext()) {
            str = str + " " + it2.next().v();
        }
        return str + " >";
    }
}
