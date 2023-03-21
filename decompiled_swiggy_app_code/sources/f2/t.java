package f2;

import j2.a;
import j2.b;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.p;

/* compiled from: ConstraintSetParser.kt */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, Integer> f14603a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, o> f14604b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, ArrayList<String>> f14605c = new HashMap<>();

    public final float a(Object obj) {
        p.j(obj, "elementName");
        if (obj instanceof b) {
            String c11 = ((b) obj).c();
            if (this.f14604b.containsKey(c11)) {
                o oVar = this.f14604b.get(c11);
                p.g(oVar);
                return oVar.value();
            } else if (!this.f14603a.containsKey(c11)) {
                return 0.0f;
            } else {
                Integer num = this.f14603a.get(c11);
                p.g(num);
                return (float) num.intValue();
            }
        } else if (obj instanceof a) {
            return ((a) obj).h();
        } else {
            return 0.0f;
        }
    }

    public final ArrayList<String> b(String str) {
        p.j(str, "elementName");
        if (this.f14605c.containsKey(str)) {
            return this.f14605c.get(str);
        }
        return null;
    }

    public final void c(String str, float f11, float f12) {
        p.j(str, "elementName");
        if (!this.f14604b.containsKey(str) || !(this.f14604b.get(str) instanceof u)) {
            this.f14604b.put(str, new p(f11, f12));
        }
    }

    public final void d(String str, float f11, float f12, float f13, String str2, String str3) {
        p.j(str, "elementName");
        p.j(str2, "prefix");
        p.j(str3, "postfix");
        if (!this.f14604b.containsKey(str) || !(this.f14604b.get(str) instanceof u)) {
            n nVar = new n(f11, f12, f13, str2, str3);
            this.f14604b.put(str, nVar);
            this.f14605c.put(str, nVar.a());
        }
    }

    public final void e(String str, int i11) {
        p.j(str, "elementName");
        this.f14603a.put(str, Integer.valueOf(i11));
    }

    public final void f(String str, ArrayList<String> arrayList) {
        p.j(str, "elementName");
        p.j(arrayList, "elements");
        this.f14605c.put(str, arrayList);
    }

    public final void g(String str, float f11) {
        p.j(str, "elementName");
        this.f14604b.put(str, new u(f11));
    }
}
