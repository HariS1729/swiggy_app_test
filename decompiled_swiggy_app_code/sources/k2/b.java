package k2;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import h2.a;
import java.util.HashMap;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: WidgetFrame */
public class b {

    /* renamed from: u  reason: collision with root package name */
    public static float f15386u = Float.NaN;

    /* renamed from: a  reason: collision with root package name */
    public ConstraintWidget f15387a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f15388b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f15389c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f15390d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f15391e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f15392f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f15393g = Float.NaN;

    /* renamed from: h  reason: collision with root package name */
    public float f15394h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f15395i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f15396l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f15397m = Float.NaN;
    public float n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f15398o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f15399p = Float.NaN;
    public float q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public int f15400r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final HashMap<String, a> f15401s = new HashMap<>();
    public String t = null;

    public b() {
    }

    private static void a(StringBuilder sb2, String str, float f11) {
        if (!Float.isNaN(f11)) {
            sb2.append(str);
            sb2.append(": ");
            sb2.append(f11);
            sb2.append(",\n");
        }
    }

    private static void b(StringBuilder sb2, String str, int i11) {
        sb2.append(str);
        sb2.append(": ");
        sb2.append(i11);
        sb2.append(",\n");
    }

    private void e(StringBuilder sb2, ConstraintAnchor.Type type) {
        ConstraintAnchor q11 = this.f15387a.q(type);
        if (q11 != null && q11.f8163f != null) {
            sb2.append("Anchor");
            sb2.append(type.name());
            sb2.append(": ['");
            String str = q11.f8163f.h().f8193o;
            if (str == null) {
                str = "#PARENT";
            }
            sb2.append(str);
            sb2.append("', '");
            sb2.append(q11.f8163f.k().name());
            sb2.append("', '");
            sb2.append(q11.f8164g);
            sb2.append("'],\n");
        }
    }

    public boolean c() {
        return Float.isNaN(this.f15394h) && Float.isNaN(this.f15395i) && Float.isNaN(this.j) && Float.isNaN(this.k) && Float.isNaN(this.f15396l) && Float.isNaN(this.f15397m) && Float.isNaN(this.n) && Float.isNaN(this.f15398o) && Float.isNaN(this.f15399p);
    }

    public StringBuilder d(StringBuilder sb2, boolean z11) {
        sb2.append("{\n");
        b(sb2, "left", this.f15388b);
        b(sb2, "top", this.f15389c);
        b(sb2, "right", this.f15390d);
        b(sb2, "bottom", this.f15391e);
        a(sb2, "pivotX", this.f15392f);
        a(sb2, "pivotY", this.f15393g);
        a(sb2, "rotationX", this.f15394h);
        a(sb2, "rotationY", this.f15395i);
        a(sb2, "rotationZ", this.j);
        a(sb2, "translationX", this.k);
        a(sb2, "translationY", this.f15396l);
        a(sb2, "translationZ", this.f15397m);
        a(sb2, "scaleX", this.n);
        a(sb2, "scaleY", this.f15398o);
        a(sb2, "alpha", this.f15399p);
        b(sb2, "visibility", this.f15400r);
        a(sb2, "interpolatedPos", this.q);
        if (this.f15387a != null) {
            for (ConstraintAnchor.Type e11 : ConstraintAnchor.Type.values()) {
                e(sb2, e11);
            }
        }
        if (z11) {
            a(sb2, "phone_orientation", f15386u);
        }
        if (z11) {
            a(sb2, "phone_orientation", f15386u);
        }
        if (this.f15401s.size() != 0) {
            sb2.append("custom : {\n");
            for (String next : this.f15401s.keySet()) {
                a aVar = this.f15401s.get(next);
                sb2.append(next);
                sb2.append(": ");
                switch (aVar.h()) {
                    case OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK /*900*/:
                        sb2.append(aVar.e());
                        sb2.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb2.append(aVar.d());
                        sb2.append(",\n");
                        break;
                    case 902:
                        sb2.append("'");
                        sb2.append(a.a(aVar.e()));
                        sb2.append("',\n");
                        break;
                    case 903:
                        sb2.append("'");
                        sb2.append(aVar.g());
                        sb2.append("',\n");
                        break;
                    case 904:
                        sb2.append("'");
                        sb2.append(aVar.c());
                        sb2.append("',\n");
                        break;
                }
            }
            sb2.append("}\n");
        }
        sb2.append("}\n");
        return sb2;
    }

    public void f(String str, int i11, float f11) {
        if (this.f15401s.containsKey(str)) {
            this.f15401s.get(str).i(f11);
        } else {
            this.f15401s.put(str, new a(str, i11, f11));
        }
    }

    public void g(String str, int i11, int i12) {
        if (this.f15401s.containsKey(str)) {
            this.f15401s.get(str).j(i12);
        } else {
            this.f15401s.put(str, new a(str, i11, i12));
        }
    }

    public b h() {
        ConstraintWidget constraintWidget = this.f15387a;
        if (constraintWidget != null) {
            this.f15388b = constraintWidget.G();
            this.f15389c = this.f15387a.U();
            this.f15390d = this.f15387a.P();
            this.f15391e = this.f15387a.t();
            i(this.f15387a.n);
        }
        return this;
    }

    public void i(b bVar) {
        this.f15392f = bVar.f15392f;
        this.f15393g = bVar.f15393g;
        this.f15394h = bVar.f15394h;
        this.f15395i = bVar.f15395i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.f15396l = bVar.f15396l;
        this.f15397m = bVar.f15397m;
        this.n = bVar.n;
        this.f15398o = bVar.f15398o;
        this.f15399p = bVar.f15399p;
        this.f15400r = bVar.f15400r;
        this.f15401s.clear();
        for (a next : bVar.f15401s.values()) {
            this.f15401s.put(next.f(), next.b());
        }
    }

    public b(ConstraintWidget constraintWidget) {
        this.f15387a = constraintWidget;
    }

    public b(b bVar) {
        this.f15387a = bVar.f15387a;
        this.f15388b = bVar.f15388b;
        this.f15389c = bVar.f15389c;
        this.f15390d = bVar.f15390d;
        this.f15391e = bVar.f15391e;
        i(bVar);
    }
}
