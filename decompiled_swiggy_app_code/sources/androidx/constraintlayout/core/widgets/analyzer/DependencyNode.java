package androidx.constraintlayout.core.widgets.analyzer;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import n2.a;

public class DependencyNode implements a {

    /* renamed from: a  reason: collision with root package name */
    public a f8217a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8218b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8219c = false;

    /* renamed from: d  reason: collision with root package name */
    WidgetRun f8220d;

    /* renamed from: e  reason: collision with root package name */
    Type f8221e = Type.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    int f8222f;

    /* renamed from: g  reason: collision with root package name */
    public int f8223g;

    /* renamed from: h  reason: collision with root package name */
    int f8224h = 1;

    /* renamed from: i  reason: collision with root package name */
    e f8225i = null;
    public boolean j = false;
    List<a> k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List<DependencyNode> f8226l = new ArrayList();

    enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f8220d = widgetRun;
    }

    public void a(a aVar) {
        for (DependencyNode dependencyNode : this.f8226l) {
            if (!dependencyNode.j) {
                return;
            }
        }
        this.f8219c = true;
        a aVar2 = this.f8217a;
        if (aVar2 != null) {
            aVar2.a(this);
        }
        if (this.f8218b) {
            this.f8220d.a(this);
            return;
        }
        DependencyNode dependencyNode2 = null;
        int i11 = 0;
        for (DependencyNode next : this.f8226l) {
            if (!(next instanceof e)) {
                i11++;
                dependencyNode2 = next;
            }
        }
        if (dependencyNode2 != null && i11 == 1 && dependencyNode2.j) {
            e eVar = this.f8225i;
            if (eVar != null) {
                if (eVar.j) {
                    this.f8222f = this.f8224h * eVar.f8223g;
                } else {
                    return;
                }
            }
            d(dependencyNode2.f8223g + this.f8222f);
        }
        a aVar3 = this.f8217a;
        if (aVar3 != null) {
            aVar3.a(this);
        }
    }

    public void b(a aVar) {
        this.k.add(aVar);
        if (this.j) {
            aVar.a(aVar);
        }
    }

    public void c() {
        this.f8226l.clear();
        this.k.clear();
        this.j = false;
        this.f8223g = 0;
        this.f8219c = false;
        this.f8218b = false;
    }

    public void d(int i11) {
        if (!this.j) {
            this.j = true;
            this.f8223g = i11;
            for (a next : this.k) {
                next.a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8220d.f8228b.v());
        sb2.append(Constants.COLON_SEPARATOR);
        sb2.append(this.f8221e);
        sb2.append("(");
        sb2.append(this.j ? Integer.valueOf(this.f8223g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f8226l.size());
        sb2.append(":d=");
        sb2.append(this.k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
