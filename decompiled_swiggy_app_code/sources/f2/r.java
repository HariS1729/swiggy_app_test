package f2;

import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.c;
import androidx.constraintlayout.core.parser.d;
import androidx.constraintlayout.core.parser.e;
import com.newrelic.agent.android.agentdata.HexAttribute;
import f2.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: JSONConstraintSet.kt */
public final class r extends m implements g {

    /* renamed from: h  reason: collision with root package name */
    private final e f14601h;

    /* renamed from: i  reason: collision with root package name */
    private final HashMap<String, Float> f14602i;
    private final String j;

    private final void k(t tVar) {
        String str = this.j;
        if (str != null) {
            try {
                e d11 = CLParser.d(str);
                int i11 = 0;
                int size = d11.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i12 = i11 + 1;
                        c s11 = d11.s(i11);
                        if (s11 != null) {
                            d dVar = (d) s11;
                            float h11 = dVar.O().h();
                            String c11 = dVar.c();
                            p.i(c11, "key.content()");
                            tVar.g(c11, h11);
                            if (i11 == size) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                        }
                    }
                }
            } catch (CLParsingException e11) {
                System.err.println(p.s("exception: ", e11));
            }
        }
        for (String next : this.f14602i.keySet()) {
            p.i(next, "name");
            Float f11 = this.f14602i.get(next);
            p.g(f11);
            tVar.g(next, f11.floatValue());
        }
    }

    public void a(v vVar, List<? extends i1.r> list) {
        g.a.a(this, vVar, list);
    }

    public void c(v vVar) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        t tVar = new t();
        k(tVar);
        try {
            f.n(i(), vVar, tVar);
        } catch (Exception unused) {
        }
    }

    public boolean d(List<? extends i1.r> list) {
        return g.a.b(this, list);
    }

    public e e() {
        return this.f14601h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return p.e(i(), ((r) obj).i());
        }
        return false;
    }

    public final void l(ArrayList<h> arrayList) {
        p.j(arrayList, "designElements");
        try {
            arrayList.clear();
            f.g(i(), arrayList);
        } catch (Exception unused) {
        }
    }
}
