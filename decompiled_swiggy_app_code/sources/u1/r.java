package u1;

import bp0.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import u1.v;

/* compiled from: FontMatcher.kt */
public final class r {
    public final List<h> a(List<? extends h> list, v vVar, int i11) {
        p.j(list, "fontList");
        p.j(vVar, "fontWeight");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z11 = true;
            if (i13 >= size) {
                break;
            }
            Object obj = list.get(i13);
            h hVar = (h) obj;
            if (!p.e(hVar.a(), vVar) || !s.f(hVar.c(), i11)) {
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj);
            }
            i13++;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        k kVar = k.f22762a;
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            Object obj2 = list.get(i14);
            if (s.f(((h) obj2).c(), i11)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        v.a aVar = v.f16949b;
        v vVar2 = null;
        if (vVar.compareTo(aVar.h()) < 0) {
            int size3 = list.size();
            v vVar3 = null;
            int i15 = 0;
            while (true) {
                if (i15 >= size3) {
                    break;
                }
                v a11 = ((h) list.get(i15)).a();
                if (a11.compareTo(vVar) >= 0) {
                    if (a11.compareTo(vVar) <= 0) {
                        vVar3 = a11;
                        vVar2 = vVar3;
                        break;
                    } else if (vVar3 == null || a11.compareTo(vVar3) < 0) {
                        vVar3 = a11;
                    }
                } else if (vVar2 == null || a11.compareTo(vVar2) > 0) {
                    vVar2 = a11;
                }
                i15++;
            }
            if (vVar2 != null) {
                vVar3 = vVar2;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i12 < size4) {
                Object obj3 = list.get(i12);
                if (p.e(((h) obj3).a(), vVar3)) {
                    arrayList3.add(obj3);
                }
                i12++;
            }
            return arrayList3;
        } else if (vVar.compareTo(aVar.i()) > 0) {
            int size5 = list.size();
            v vVar4 = null;
            int i16 = 0;
            while (true) {
                if (i16 >= size5) {
                    break;
                }
                v a12 = ((h) list.get(i16)).a();
                if (a12.compareTo(vVar) >= 0) {
                    if (a12.compareTo(vVar) <= 0) {
                        vVar4 = a12;
                        vVar2 = vVar4;
                        break;
                    } else if (vVar4 == null || a12.compareTo(vVar4) < 0) {
                        vVar4 = a12;
                    }
                } else if (vVar2 == null || a12.compareTo(vVar2) > 0) {
                    vVar2 = a12;
                }
                i16++;
            }
            if (vVar4 == null) {
                vVar4 = vVar2;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i12 < size6) {
                Object obj4 = list.get(i12);
                if (p.e(((h) obj4).a(), vVar4)) {
                    arrayList4.add(obj4);
                }
                i12++;
            }
            return arrayList4;
        } else {
            v i17 = aVar.i();
            int size7 = list.size();
            v vVar5 = null;
            v vVar6 = null;
            int i18 = 0;
            while (true) {
                if (i18 >= size7) {
                    break;
                }
                v a13 = ((h) list.get(i18)).a();
                if (i17 == null || a13.compareTo(i17) <= 0) {
                    if (a13.compareTo(vVar) >= 0) {
                        if (a13.compareTo(vVar) <= 0) {
                            vVar5 = a13;
                            vVar6 = vVar5;
                            break;
                        } else if (vVar6 == null || a13.compareTo(vVar6) < 0) {
                            vVar6 = a13;
                        }
                    } else if (vVar5 == null || a13.compareTo(vVar5) > 0) {
                        vVar5 = a13;
                    }
                }
                i18++;
            }
            if (vVar6 != null) {
                vVar5 = vVar6;
            }
            ArrayList arrayList5 = new ArrayList(list.size());
            int size8 = list.size();
            for (int i19 = 0; i19 < size8; i19++) {
                Object obj5 = list.get(i19);
                if (p.e(((h) obj5).a(), vVar5)) {
                    arrayList5.add(obj5);
                }
            }
            if (!arrayList5.isEmpty()) {
                return arrayList5;
            }
            v i21 = v.f16949b.i();
            int size9 = list.size();
            v vVar7 = null;
            int i22 = 0;
            while (true) {
                if (i22 >= size9) {
                    break;
                }
                v a14 = ((h) list.get(i22)).a();
                if (i21 == null || a14.compareTo(i21) >= 0) {
                    if (a14.compareTo(vVar) >= 0) {
                        if (a14.compareTo(vVar) <= 0) {
                            vVar2 = a14;
                            vVar7 = vVar2;
                            break;
                        } else if (vVar7 == null || a14.compareTo(vVar7) < 0) {
                            vVar7 = a14;
                        }
                    } else if (vVar2 == null || a14.compareTo(vVar2) > 0) {
                        vVar2 = a14;
                    }
                }
                i22++;
            }
            if (vVar7 != null) {
                vVar2 = vVar7;
            }
            ArrayList arrayList6 = new ArrayList(list.size());
            int size10 = list.size();
            while (i12 < size10) {
                Object obj6 = list.get(i12);
                if (p.e(((h) obj6).a(), vVar2)) {
                    arrayList6.add(obj6);
                }
                i12++;
            }
            return arrayList6;
        }
    }
}
