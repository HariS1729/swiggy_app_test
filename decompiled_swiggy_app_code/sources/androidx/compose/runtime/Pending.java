package androidx.compose.runtime;

import bp0.f;
import e0.x;
import e0.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: Composer.kt */
final class Pending {

    /* renamed from: a  reason: collision with root package name */
    private final List<y> f6022a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6023b;

    /* renamed from: c  reason: collision with root package name */
    private int f6024c;

    /* renamed from: d  reason: collision with root package name */
    private final List<y> f6025d;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<Integer, b> f6026e;

    /* renamed from: f  reason: collision with root package name */
    private final f f6027f;

    public Pending(List<y> list, int i11) {
        p.j(list, "keyInfos");
        this.f6022a = list;
        this.f6023b = i11;
        if (i11 >= 0) {
            this.f6025d = new ArrayList();
            HashMap<Integer, b> hashMap = new HashMap<>();
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                y yVar = this.f6022a.get(i13);
                hashMap.put(Integer.valueOf(yVar.b()), new b(i13, i12, yVar.c()));
                i12 += yVar.c();
            }
            this.f6026e = hashMap;
            this.f6027f = b.b(new Pending$keyMap$2(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final int a() {
        return this.f6024c;
    }

    public final List<y> b() {
        return this.f6022a;
    }

    public final HashMap<Object, LinkedHashSet<y>> c() {
        return (HashMap) this.f6027f.getValue();
    }

    public final y d(int i11, Object obj) {
        return (y) ComposerKt.R(c(), obj != null ? new x(Integer.valueOf(i11), obj) : Integer.valueOf(i11));
    }

    public final int e() {
        return this.f6023b;
    }

    public final List<y> f() {
        return this.f6025d;
    }

    public final int g(y yVar) {
        p.j(yVar, "keyInfo");
        b bVar = this.f6026e.get(Integer.valueOf(yVar.b()));
        if (bVar != null) {
            return bVar.b();
        }
        return -1;
    }

    public final boolean h(y yVar) {
        p.j(yVar, "keyInfo");
        return this.f6025d.add(yVar);
    }

    public final void i(y yVar, int i11) {
        p.j(yVar, "keyInfo");
        this.f6026e.put(Integer.valueOf(yVar.b()), new b(-1, i11, 0));
    }

    public final void j(int i11, int i12, int i13) {
        if (i11 > i12) {
            Collection<b> values = this.f6026e.values();
            p.i(values, "groupInfos.values");
            for (b bVar : values) {
                int b11 = bVar.b();
                if (i11 <= b11 && b11 < i11 + i13) {
                    bVar.e((b11 - i11) + i12);
                } else {
                    if (i12 <= b11 && b11 < i11) {
                        bVar.e(b11 + i13);
                    }
                }
            }
        } else if (i12 > i11) {
            Collection<b> values2 = this.f6026e.values();
            p.i(values2, "groupInfos.values");
            for (b bVar2 : values2) {
                int b12 = bVar2.b();
                if (i11 <= b12 && b12 < i11 + i13) {
                    bVar2.e((b12 - i11) + i12);
                } else {
                    if (i11 + 1 <= b12 && b12 < i12) {
                        bVar2.e(b12 - i13);
                    }
                }
            }
        }
    }

    public final void k(int i11, int i12) {
        if (i11 > i12) {
            Collection<b> values = this.f6026e.values();
            p.i(values, "groupInfos.values");
            for (b bVar : values) {
                int c11 = bVar.c();
                if (c11 == i11) {
                    bVar.f(i12);
                } else {
                    if (i12 <= c11 && c11 < i11) {
                        bVar.f(c11 + 1);
                    }
                }
            }
        } else if (i12 > i11) {
            Collection<b> values2 = this.f6026e.values();
            p.i(values2, "groupInfos.values");
            for (b bVar2 : values2) {
                int c12 = bVar2.c();
                if (c12 == i11) {
                    bVar2.f(i12);
                } else {
                    if (i11 + 1 <= c12 && c12 < i12) {
                        bVar2.f(c12 - 1);
                    }
                }
            }
        }
    }

    public final void l(int i11) {
        this.f6024c = i11;
    }

    public final int m(y yVar) {
        p.j(yVar, "keyInfo");
        b bVar = this.f6026e.get(Integer.valueOf(yVar.b()));
        if (bVar != null) {
            return bVar.c();
        }
        return -1;
    }

    public final boolean n(int i11, int i12) {
        int b11;
        b bVar = this.f6026e.get(Integer.valueOf(i11));
        if (bVar == null) {
            return false;
        }
        int b12 = bVar.b();
        int a11 = i12 - bVar.a();
        bVar.d(i12);
        if (a11 == 0) {
            return true;
        }
        Collection<b> values = this.f6026e.values();
        p.i(values, "groupInfos.values");
        for (b bVar2 : values) {
            if (bVar2.b() >= b12 && !p.e(bVar2, bVar) && (b11 = bVar2.b() + a11) >= 0) {
                bVar2.e(b11);
            }
        }
        return true;
    }

    public final int o(y yVar) {
        p.j(yVar, "keyInfo");
        b bVar = this.f6026e.get(Integer.valueOf(yVar.b()));
        return bVar != null ? bVar.a() : yVar.c();
    }
}
