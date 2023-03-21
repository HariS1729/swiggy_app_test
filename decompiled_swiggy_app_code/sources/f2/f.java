package f2;

import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.a;
import androidx.constraintlayout.core.parser.d;
import androidx.constraintlayout.core.parser.e;
import androidx.constraintlayout.core.state.State;
import com.newrelic.agent.android.agentdata.HexAttribute;
import cp0.m;
import d2.h;
import j2.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.p;
import l2.c;

/* compiled from: ConstraintSetParser.kt */
public final class f {
    public static final String a(e eVar) {
        p.j(eVar, "element");
        ArrayList<String> M = eVar.M();
        if (M == null) {
            return null;
        }
        Iterator it2 = l.u(0, M.size()).iterator();
        while (it2.hasNext()) {
            if (M.get(((m) it2).b()).equals("type")) {
                return eVar.I("type");
            }
        }
        return null;
    }

    public static final void b(v vVar, String str, e eVar) {
        String I;
        a v;
        int size;
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(str, "elementName");
        p.j(eVar, "element");
        c b11 = vVar.b(str, State.Direction.END);
        ArrayList<String> M = eVar.M();
        if (M != null) {
            Iterator it2 = l.u(0, M.size()).iterator();
            while (it2.hasNext()) {
                String str2 = M.get(((m) it2).b());
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != -1081309778) {
                        if (hashCode == -962590849) {
                            if (str2.equals("direction") && (I = eVar.I(str2)) != null) {
                                switch (I.hashCode()) {
                                    case -1383228885:
                                        if (I.equals("bottom")) {
                                            b11.t0(State.Direction.BOTTOM);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 100571:
                                        if (I.equals("end")) {
                                            b11.t0(State.Direction.END);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 115029:
                                        if (I.equals("top")) {
                                            b11.t0(State.Direction.TOP);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3317767:
                                        if (I.equals("left")) {
                                            b11.t0(State.Direction.LEFT);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 108511772:
                                        if (I.equals("right")) {
                                            b11.t0(State.Direction.RIGHT);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 109757538:
                                        if (I.equals("start")) {
                                            b11.t0(State.Direction.START);
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                        } else if (hashCode == -567445985 && str2.equals("contains") && (v = eVar.v(str2)) != null && (size = v.size()) > 0) {
                            int i11 = 0;
                            while (true) {
                                int i12 = i11 + 1;
                                b11.r0(vVar.c(v.s(i11).c()));
                                if (i12 < size) {
                                    i11 = i12;
                                }
                            }
                        }
                    } else if (str2.equals("margin")) {
                        float D = eVar.D(str2);
                        if (!Float.isNaN(D)) {
                            b11.I((int) D);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(int r7, f2.v r8, f2.t r9, androidx.constraintlayout.core.parser.a r10) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.p.j(r8, r0)
            java.lang.String r0 = "margins"
            kotlin.jvm.internal.p.j(r9, r0)
            java.lang.String r0 = "helper"
            kotlin.jvm.internal.p.j(r10, r0)
            if (r7 != 0) goto L_0x0016
            l2.g r7 = r8.k()
            goto L_0x001a
        L_0x0016:
            l2.h r7 = r8.s()
        L_0x001a:
            r0 = 1
            androidx.constraintlayout.core.parser.c r1 = r10.s(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.a
            if (r2 == 0) goto L_0x00ee
            androidx.constraintlayout.core.parser.a r1 = (androidx.constraintlayout.core.parser.a) r1
            int r2 = r1.size()
            if (r2 >= r0) goto L_0x002d
            goto L_0x00ee
        L_0x002d:
            int r2 = r1.size()
            r3 = 0
            rp0.f r2 = rp0.l.u(r3, r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x003a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0053
            r4 = r2
            cp0.m r4 = (cp0.m) r4
            int r4 = r4.b()
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.String r4 = r1.H(r4)
            r5[r3] = r4
            r7.r0(r5)
            goto L_0x003a
        L_0x0053:
            int r1 = r10.size()
            r2 = 2
            if (r1 <= r2) goto L_0x00ee
            androidx.constraintlayout.core.parser.c r10 = r10.s(r2)
            boolean r1 = r10 instanceof androidx.constraintlayout.core.parser.e
            if (r1 != 0) goto L_0x0063
            return
        L_0x0063:
            androidx.constraintlayout.core.parser.e r10 = (androidx.constraintlayout.core.parser.e) r10
            java.util.ArrayList r1 = r10.M()
            if (r1 != 0) goto L_0x006c
            return
        L_0x006c:
            int r2 = r1.size()
            rp0.f r2 = rp0.l.u(r3, r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0078:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00ee
            r4 = r2
            cp0.m r4 = (cp0.m) r4
            int r4 = r4.b()
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "style"
            boolean r5 = kotlin.jvm.internal.p.e(r4, r5)
            if (r5 == 0) goto L_0x00e0
            androidx.constraintlayout.core.parser.c r4 = r10.t(r4)
            boolean r5 = r4 instanceof androidx.constraintlayout.core.parser.a
            if (r5 == 0) goto L_0x00b5
            r5 = r4
            androidx.constraintlayout.core.parser.a r5 = (androidx.constraintlayout.core.parser.a) r5
            int r6 = r5.size()
            if (r6 <= r0) goto L_0x00b5
            java.lang.String r4 = r5.H(r3)
            java.lang.String r6 = "styleObject.getString(0)"
            kotlin.jvm.internal.p.i(r4, r6)
            float r5 = r5.getFloat(r0)
            r7.t0(r5)
            goto L_0x00be
        L_0x00b5:
            java.lang.String r4 = r4.c()
            java.lang.String r5 = "styleObject.content()"
            kotlin.jvm.internal.p.i(r4, r5)
        L_0x00be:
            java.lang.String r5 = "packed"
            boolean r5 = kotlin.jvm.internal.p.e(r4, r5)
            if (r5 == 0) goto L_0x00cc
            androidx.constraintlayout.core.state.State$Chain r4 = androidx.constraintlayout.core.state.State.Chain.PACKED
            r7.u0(r4)
            goto L_0x0078
        L_0x00cc:
            java.lang.String r5 = "spread_inside"
            boolean r4 = kotlin.jvm.internal.p.e(r4, r5)
            if (r4 == 0) goto L_0x00da
            androidx.constraintlayout.core.state.State$Chain r4 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE
            r7.u0(r4)
            goto L_0x0078
        L_0x00da:
            androidx.constraintlayout.core.state.State$Chain r4 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            r7.u0(r4)
            goto L_0x0078
        L_0x00e0:
            java.lang.String r5 = "null cannot be cast to non-null type androidx.constraintlayout.core.state.ConstraintReference"
            java.util.Objects.requireNonNull(r7, r5)
            java.lang.String r5 = "constraintName"
            kotlin.jvm.internal.p.i(r4, r5)
            e(r8, r9, r10, r7, r4)
            goto L_0x0078
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.f.c(int, f2.v, f2.t, androidx.constraintlayout.core.parser.a):void");
    }

    private static final Integer d(String str) {
        if (!StringsKt__StringsKt.N0(str, '#', false, 2, (Object) null)) {
            return null;
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(1);
        p.i(substring, "(this as java.lang.String).substring(startIndex)");
        if (substring.length() == 6) {
            substring = p.s("FF", substring);
        }
        return Integer.valueOf((int) Long.parseLong(substring, 16));
    }

    private static final void e(v vVar, t tVar, e eVar, androidx.constraintlayout.core.state.a aVar, String str) {
        androidx.constraintlayout.core.state.a aVar2;
        float f11;
        float f12;
        androidx.constraintlayout.core.state.a aVar3;
        v vVar2 = vVar;
        t tVar2 = tVar;
        e eVar2 = eVar;
        androidx.constraintlayout.core.state.a aVar4 = aVar;
        String str2 = str;
        a v = eVar2.v(str2);
        if (v == null || v.size() <= 1) {
            String str3 = "reference.key";
            String str4 = "targetReference.key";
            String K = eVar2.K(str2);
            if (K != null) {
                if (K.equals("parent")) {
                    aVar2 = vVar2.c(State.f8106f);
                } else {
                    aVar2 = vVar2.c(K);
                }
                switch (str.hashCode()) {
                    case -1720785339:
                        if (str2.equals("baseline")) {
                            Object key = aVar.getKey();
                            p.i(key, str3);
                            vVar2.v(key);
                            Object key2 = aVar2.getKey();
                            p.i(key2, str4);
                            vVar2.v(key2);
                            aVar4.k(aVar2);
                            return;
                        }
                        return;
                    case -1383228885:
                        if (str2.equals("bottom")) {
                            aVar4.o(aVar2);
                            return;
                        }
                        return;
                    case 100571:
                        if (str2.equals("end")) {
                            aVar4.x(aVar2);
                            return;
                        }
                        return;
                    case 115029:
                        if (str2.equals("top")) {
                            aVar4.k0(aVar2);
                            return;
                        }
                        return;
                    case 109757538:
                        if (str2.equals("start")) {
                            aVar4.h0(aVar2);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } else {
            String H = v.H(0);
            String J = v.J(1);
            String str5 = "targetReference.key";
            String str6 = "reference.key";
            if (v.size() > 2) {
                androidx.constraintlayout.core.parser.c F = v.F(2);
                p.g(F);
                f11 = (float) vVar2.d(h.k(h.n(tVar2.a(F))));
            } else {
                f11 = 0.0f;
            }
            if (v.size() > 3) {
                androidx.constraintlayout.core.parser.c F2 = v.F(3);
                p.g(F2);
                f12 = (float) vVar2.d(h.k(h.n(tVar2.a(F2))));
            } else {
                f12 = 0.0f;
            }
            if (H.equals("parent")) {
                aVar3 = vVar2.c(State.f8106f);
            } else {
                aVar3 = vVar2.c(H);
            }
            float f13 = f12;
            switch (str.hashCode()) {
                case -1720785339:
                    if (str2.equals("baseline") && J != null) {
                        int hashCode = J.hashCode();
                        if (hashCode != -1720785339) {
                            if (hashCode != -1383228885) {
                                if (hashCode == 115029 && J.equals("top")) {
                                    Object key3 = aVar.getKey();
                                    p.i(key3, str6);
                                    vVar2.v(key3);
                                    Object key4 = aVar3.getKey();
                                    p.i(key4, str5);
                                    vVar2.v(key4);
                                    aVar4.m(aVar3);
                                    break;
                                }
                            } else {
                                String str7 = str5;
                                String str8 = str6;
                                if (J.equals("bottom")) {
                                    Object key5 = aVar.getKey();
                                    p.i(key5, str8);
                                    vVar2.v(key5);
                                    Object key6 = aVar3.getKey();
                                    p.i(key6, str7);
                                    vVar2.v(key6);
                                    aVar4.l(aVar3);
                                    break;
                                }
                            }
                        } else {
                            String str9 = str5;
                            String str10 = str6;
                            if (J.equals("baseline")) {
                                Object key7 = aVar.getKey();
                                p.i(key7, str10);
                                vVar2.v(key7);
                                Object key8 = aVar3.getKey();
                                p.i(key8, str9);
                                vVar2.v(key8);
                                aVar4.k(aVar3);
                                break;
                            }
                        }
                    }
                    break;
                case -1498085729:
                    if (str2.equals("circular")) {
                        androidx.constraintlayout.core.parser.c s11 = v.s(1);
                        p.i(s11, "constraint.get(1)");
                        aVar4.q(aVar3, tVar2.a(s11), 0.0f);
                        break;
                    }
                    break;
                case -1383228885:
                    if (str2.equals("bottom")) {
                        if (!p.e(J, "top")) {
                            if (p.e(J, "bottom")) {
                                aVar4.o(aVar3);
                                break;
                            }
                        } else {
                            aVar4.p(aVar3);
                            break;
                        }
                    }
                    break;
                case 100571:
                    if (str2.equals("end")) {
                        if (!p.e(J, "start")) {
                            if (p.e(J, "end")) {
                                aVar4.x(aVar3);
                                break;
                            }
                        } else {
                            aVar4.y(aVar3);
                            break;
                        }
                    }
                    break;
                case 115029:
                    if (str2.equals("top")) {
                        if (!p.e(J, "top")) {
                            if (p.e(J, "bottom")) {
                                aVar4.j0(aVar3);
                                break;
                            }
                        } else {
                            aVar4.k0(aVar3);
                            break;
                        }
                    }
                    break;
                case 3317767:
                    if (str2.equals("left")) {
                        if (!p.e(J, "left")) {
                            if (p.e(J, "right")) {
                                aVar4.H(aVar3);
                                break;
                            }
                        } else {
                            aVar4.G(aVar3);
                            break;
                        }
                    }
                    break;
                case 108511772:
                    if (str2.equals("right")) {
                        if (!p.e(J, "left")) {
                            if (p.e(J, "right")) {
                                aVar4.Q(aVar3);
                                break;
                            }
                        } else {
                            aVar4.P(aVar3);
                            break;
                        }
                    }
                    break;
                case 109757538:
                    if (str2.equals("start")) {
                        if (!p.e(J, "start")) {
                            if (p.e(J, "end")) {
                                aVar4.g0(aVar3);
                                break;
                            }
                        } else {
                            aVar4.h0(aVar3);
                            break;
                        }
                    }
                    break;
            }
            aVar4.J(Float.valueOf(f11)).K((int) f13);
        }
    }

    private static final void f(e eVar, androidx.constraintlayout.core.state.a aVar, String str) {
        ArrayList<String> M;
        e E = eVar.E(str);
        if (E != null && (M = E.M()) != null) {
            Iterator it2 = l.u(0, M.size()).iterator();
            while (it2.hasNext()) {
                String str2 = M.get(((m) it2).b());
                androidx.constraintlayout.core.parser.c t = E.t(str2);
                if (t instanceof j2.a) {
                    aVar.g(str2, t.h());
                } else if (t instanceof b) {
                    String c11 = t.c();
                    p.i(c11, "value.content()");
                    Integer d11 = d(c11);
                    if (d11 != null) {
                        aVar.f(str2, d11.intValue());
                    }
                }
            }
        }
    }

    public static final void g(String str, ArrayList<h> arrayList) {
        ArrayList<String> arrayList2;
        e eVar;
        ArrayList<h> arrayList3 = arrayList;
        p.j(str, "content");
        p.j(arrayList3, "list");
        e d11 = CLParser.d(str);
        ArrayList<String> M = d11.M();
        if (M != null) {
            int i11 = 0;
            Iterator it2 = l.u(0, M.size()).iterator();
            while (it2.hasNext()) {
                String str2 = M.get(((m) it2).b());
                androidx.constraintlayout.core.parser.c t = d11.t(str2);
                if (p.e(str2, "Design")) {
                    Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLObject");
                    e eVar2 = (e) t;
                    ArrayList<String> M2 = eVar2.M();
                    if (M2 != null) {
                        Iterator it3 = l.u(i11, M2.size()).iterator();
                        while (it3.hasNext()) {
                            String str3 = M2.get(((m) it3).b());
                            androidx.constraintlayout.core.parser.c t11 = eVar2.t(str3);
                            Objects.requireNonNull(t11, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLObject");
                            e eVar3 = (e) t11;
                            System.out.printf("element found <" + str3 + '>', new Object[i11]);
                            String K = eVar3.K("type");
                            if (K != null) {
                                HashMap hashMap = new HashMap();
                                int size = eVar3.size() - 1;
                                if (size >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        int i13 = i12 + 1;
                                        androidx.constraintlayout.core.parser.c s11 = eVar3.s(i12);
                                        eVar = d11;
                                        Objects.requireNonNull(s11, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                                        d dVar = (d) s11;
                                        String c11 = dVar.c();
                                        androidx.constraintlayout.core.parser.c O = dVar.O();
                                        String c12 = O == null ? null : O.c();
                                        arrayList2 = M;
                                        if (c12 != null) {
                                            p.i(c11, "paramName");
                                            hashMap.put(c11, c12);
                                        }
                                        if (i12 == size) {
                                            break;
                                        }
                                        i12 = i13;
                                        d11 = eVar;
                                        M = arrayList2;
                                    }
                                } else {
                                    eVar = d11;
                                    arrayList2 = M;
                                }
                                p.i(str3, "elementName");
                                arrayList3.add(new h(str3, K, hashMap));
                            } else {
                                eVar = d11;
                                arrayList2 = M;
                            }
                            d11 = eVar;
                            M = arrayList2;
                            i11 = 0;
                        }
                    } else {
                        return;
                    }
                }
                d11 = d11;
                M = M;
                i11 = 0;
            }
        }
    }

    private static final androidx.constraintlayout.core.state.b h(e eVar, String str, v vVar) {
        androidx.constraintlayout.core.parser.c t = eVar.t(str);
        androidx.constraintlayout.core.state.b a11 = androidx.constraintlayout.core.state.b.a(0);
        p.i(a11, "Fixed(0)");
        if (t instanceof b) {
            String c11 = t.c();
            p.i(c11, "dimensionElement.content()");
            return i(c11);
        } else if (t instanceof j2.a) {
            androidx.constraintlayout.core.state.b a12 = androidx.constraintlayout.core.state.b.a(vVar.d(h.k(h.n(eVar.B(str)))));
            p.i(a12, "Fixed(\n            state.convertDimension(\n                Dp(\n                    element.getFloat(constraintName)\n                )\n            )\n        )");
            return a12;
        } else if (!(t instanceof e)) {
            return a11;
        } else {
            e eVar2 = (e) t;
            String K = eVar2.K("value");
            if (K != null) {
                a11 = i(K);
            }
            androidx.constraintlayout.core.parser.c G = eVar2.G("min");
            if (G != null) {
                if (G instanceof j2.a) {
                    a11.n(vVar.d(h.k(h.n(G.h()))));
                } else if (G instanceof b) {
                    a11.o(androidx.constraintlayout.core.state.b.j);
                }
            }
            androidx.constraintlayout.core.parser.c G2 = eVar2.G("max");
            if (G2 == null) {
                return a11;
            }
            if (G2 instanceof j2.a) {
                a11.l(vVar.d(h.k(h.n(G2.h()))));
                return a11;
            } else if (!(G2 instanceof b)) {
                return a11;
            } else {
                a11.m(androidx.constraintlayout.core.state.b.j);
                return a11;
            }
        }
    }

    private static final androidx.constraintlayout.core.state.b i(String str) {
        androidx.constraintlayout.core.state.b a11 = androidx.constraintlayout.core.state.b.a(0);
        p.i(a11, "Fixed(0)");
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    androidx.constraintlayout.core.state.b f11 = androidx.constraintlayout.core.state.b.f(androidx.constraintlayout.core.state.b.j);
                    p.i(f11, "Suggested(WRAP_DIMENSION)");
                    return f11;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    androidx.constraintlayout.core.state.b c11 = androidx.constraintlayout.core.state.b.c();
                    p.i(c11, "Parent()");
                    return c11;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    androidx.constraintlayout.core.state.b f12 = androidx.constraintlayout.core.state.b.f(androidx.constraintlayout.core.state.b.k);
                    p.i(f12, "Suggested(SPREAD_DIMENSION)");
                    return f12;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    androidx.constraintlayout.core.state.b g11 = androidx.constraintlayout.core.state.b.g();
                    p.i(g11, "Wrap()");
                    return g11;
                }
                break;
        }
        if (StringsKt__StringsKt.X(str, '%', false, 2, (Object) null)) {
            androidx.constraintlayout.core.state.b r11 = androidx.constraintlayout.core.state.b.d(0, Float.parseFloat(StringsKt__StringsKt.b1(str, '%', (String) null, 2, (Object) null)) / 100.0f).r(0);
            p.i(r11, "Percent(0, percentValue).suggested(0)");
            return r11;
        } else if (!StringsKt__StringsKt.R(str, ':', false, 2, (Object) null)) {
            return a11;
        } else {
            androidx.constraintlayout.core.state.b s11 = androidx.constraintlayout.core.state.b.e(str).s(androidx.constraintlayout.core.state.b.k);
            p.i(s11, "Ratio(dimensionString).suggested(SPREAD_DIMENSION)");
            return s11;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r8 = (androidx.constraintlayout.core.parser.e) r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(f2.v r6, f2.t r7, java.lang.Object r8) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.p.j(r6, r0)
            java.lang.String r0 = "layoutVariables"
            kotlin.jvm.internal.p.j(r7, r0)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.p.j(r8, r0)
            boolean r0 = r8 instanceof androidx.constraintlayout.core.parser.e
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            androidx.constraintlayout.core.parser.e r8 = (androidx.constraintlayout.core.parser.e) r8
            java.util.ArrayList r0 = r8.M()
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            r1 = 0
            int r2 = r0.size()
            rp0.f r1 = rp0.l.u(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x002a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006c
            r2 = r1
            cp0.m r2 = (cp0.m) r2
            int r2 = r2.b()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            androidx.constraintlayout.core.parser.c r3 = r8.t(r2)
            java.lang.String r4 = "elementName"
            kotlin.jvm.internal.p.i(r2, r4)
            java.util.ArrayList r2 = r7.b(r2)
            if (r2 == 0) goto L_0x002a
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.e
            if (r4 == 0) goto L_0x002a
            java.util.Iterator r2 = r2.iterator()
        L_0x0054:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x002a
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "id"
            kotlin.jvm.internal.p.i(r4, r5)
            r5 = r3
            androidx.constraintlayout.core.parser.e r5 = (androidx.constraintlayout.core.parser.e) r5
            p(r6, r7, r4, r5)
            goto L_0x0054
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.f.j(f2.v, f2.t, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r3 = (androidx.constraintlayout.core.parser.e) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(int r1, f2.v r2, androidx.constraintlayout.core.parser.a r3) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.p.j(r2, r0)
            java.lang.String r0 = "helper"
            kotlin.jvm.internal.p.j(r3, r0)
            r0 = 1
            androidx.constraintlayout.core.parser.c r3 = r3.s(r0)
            boolean r0 = r3 instanceof androidx.constraintlayout.core.parser.e
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            androidx.constraintlayout.core.parser.e r3 = (androidx.constraintlayout.core.parser.e) r3
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.K(r0)
            if (r0 != 0) goto L_0x001f
            return
        L_0x001f:
            l(r1, r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.f.k(int, f2.v, androidx.constraintlayout.core.parser.a):void");
    }

    private static final void l(int i11, v vVar, String str, e eVar) {
        ArrayList<String> M = eVar.M();
        if (M != null) {
            androidx.constraintlayout.core.state.a c11 = vVar.c(str);
            if (i11 == 0) {
                vVar.l(str);
            } else {
                vVar.t(str);
            }
            l2.e e11 = c11.e();
            Objects.requireNonNull(e11, "null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.GuidelineReference");
            l2.f fVar = (l2.f) e11;
            Iterator it2 = l.u(0, M.size()).iterator();
            while (it2.hasNext()) {
                String str2 = M.get(((m) it2).b());
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != -678927291) {
                        if (hashCode != 100571) {
                            if (hashCode == 109757538 && str2.equals("start")) {
                                fVar.i(Integer.valueOf(vVar.d(h.k(h.n(eVar.B(str2))))));
                            }
                        } else if (str2.equals("end")) {
                            fVar.f(Integer.valueOf(vVar.d(h.k(h.n(eVar.B(str2))))));
                        }
                    } else if (str2.equals("percent")) {
                        fVar.g(eVar.B(str2));
                    }
                }
            }
        }
    }

    public static final void m(v vVar, t tVar, Object obj) {
        String H;
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(tVar, "layoutVariables");
        p.j(obj, "element");
        if (obj instanceof a) {
            a aVar = (a) obj;
            Iterator it2 = l.u(0, aVar.size()).iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.parser.c s11 = aVar.s(((m) it2).b());
                if (s11 instanceof a) {
                    a aVar2 = (a) s11;
                    if (aVar2.size() > 1 && (H = aVar2.H(0)) != null) {
                        switch (H.hashCode()) {
                            case -1785507558:
                                if (H.equals("vGuideline")) {
                                    k(1, vVar, aVar2);
                                    break;
                                } else {
                                    break;
                                }
                            case -1252464839:
                                if (H.equals("hChain")) {
                                    c(0, vVar, tVar, aVar2);
                                    break;
                                } else {
                                    break;
                                }
                            case -851656725:
                                if (H.equals("vChain")) {
                                    c(1, vVar, tVar, aVar2);
                                    break;
                                } else {
                                    break;
                                }
                            case 965681512:
                                if (H.equals("hGuideline")) {
                                    k(0, vVar, aVar2);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
            }
        }
    }

    public static final void n(String str, v vVar, t tVar) {
        p.j(str, "content");
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(tVar, "layoutVariables");
        try {
            e d11 = CLParser.d(str);
            ArrayList<String> M = d11.M();
            if (M != null) {
                Iterator it2 = l.u(0, M.size()).iterator();
                while (it2.hasNext()) {
                    String str2 = M.get(((m) it2).b());
                    androidx.constraintlayout.core.parser.c t = d11.t(str2);
                    if (str2 != null) {
                        int hashCode = str2.hashCode();
                        if (hashCode != -1824489883) {
                            if (hashCode != 1875016085) {
                                if (hashCode == 1921490263) {
                                    if (str2.equals("Variables")) {
                                        p.i(t, "element");
                                        o(vVar, tVar, t);
                                    }
                                }
                            } else if (str2.equals("Generate")) {
                                p.i(t, "element");
                                j(vVar, tVar, t);
                            }
                        } else if (str2.equals("Helpers")) {
                            p.i(t, "element");
                            m(vVar, tVar, t);
                        }
                    }
                    if (t instanceof e) {
                        String a11 = a((e) t);
                        if (a11 != null) {
                            int hashCode2 = a11.hashCode();
                            if (hashCode2 != -1785507558) {
                                if (hashCode2 != -333143113) {
                                    if (hashCode2 == 965681512) {
                                        if (a11.equals("hGuideline")) {
                                            p.i(str2, "elementName");
                                            l(0, vVar, str2, (e) t);
                                        }
                                    }
                                } else if (a11.equals("barrier")) {
                                    p.i(str2, "elementName");
                                    b(vVar, str2, (e) t);
                                }
                            } else if (a11.equals("vGuideline")) {
                                p.i(str2, "elementName");
                                l(1, vVar, str2, (e) t);
                            }
                        } else {
                            p.i(str2, "elementName");
                            p(vVar, tVar, str2, (e) t);
                        }
                    } else if (t instanceof j2.a) {
                        p.i(str2, "elementName");
                        tVar.e(str2, ((j2.a) t).s());
                    }
                }
            }
        } catch (CLParsingException e11) {
            System.err.println(p.s("Error parsing JSON ", e11));
        }
    }

    public static final void o(v vVar, t tVar, Object obj) {
        e eVar;
        ArrayList<String> M;
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(tVar, "layoutVariables");
        p.j(obj, "json");
        if ((obj instanceof e) && (M = eVar.M()) != null) {
            Iterator it2 = l.u(0, M.size()).iterator();
            while (it2.hasNext()) {
                String str = M.get(((m) it2).b());
                androidx.constraintlayout.core.parser.c t = (eVar = (e) obj).t(str);
                if (t instanceof j2.a) {
                    p.i(str, "elementName");
                    tVar.e(str, ((j2.a) t).s());
                } else if (t instanceof e) {
                    e eVar2 = (e) t;
                    if (eVar2.L("from") && eVar2.L("to")) {
                        androidx.constraintlayout.core.parser.c t11 = eVar2.t("from");
                        p.i(t11, "element[\"from\"]");
                        float a11 = tVar.a(t11);
                        androidx.constraintlayout.core.parser.c t12 = eVar2.t("to");
                        p.i(t12, "element[\"to\"]");
                        float a12 = tVar.a(t12);
                        String K = eVar2.K("prefix");
                        String str2 = K == null ? "" : K;
                        String K2 = eVar2.K("postfix");
                        if (K2 == null) {
                            K2 = "";
                        }
                        p.i(str, "elementName");
                        tVar.d(str, a11, a12, 1.0f, str2, K2);
                    } else if (eVar2.L("from") && eVar2.L("step")) {
                        androidx.constraintlayout.core.parser.c t13 = eVar2.t("from");
                        p.i(t13, "element[\"from\"]");
                        float a13 = tVar.a(t13);
                        androidx.constraintlayout.core.parser.c t14 = eVar2.t("step");
                        p.i(t14, "element[\"step\"]");
                        float a14 = tVar.a(t14);
                        p.i(str, "elementName");
                        tVar.c(str, a13, a14);
                    } else if (eVar2.L("ids")) {
                        a u11 = eVar2.u("ids");
                        ArrayList arrayList = new ArrayList();
                        int size = u11.size();
                        if (size > 0) {
                            int i11 = 0;
                            while (true) {
                                int i12 = i11 + 1;
                                arrayList.add(u11.H(i11));
                                if (i12 >= size) {
                                    break;
                                }
                                i11 = i12;
                            }
                        }
                        p.i(str, "elementName");
                        tVar.f(str, arrayList);
                    } else if (eVar2.L("tag")) {
                        ArrayList<String> g11 = vVar.g(eVar2.I("tag"));
                        p.i(str, "elementName");
                        p.i(g11, "arrayIds");
                        tVar.f(str, g11);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(f2.v r8, f2.t r9, java.lang.String r10, androidx.constraintlayout.core.parser.e r11) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.p.j(r8, r0)
            java.lang.String r0 = "layoutVariables"
            kotlin.jvm.internal.p.j(r9, r0)
            java.lang.String r0 = "elementName"
            kotlin.jvm.internal.p.j(r10, r0)
            java.lang.String r0 = "element"
            kotlin.jvm.internal.p.j(r11, r0)
            androidx.constraintlayout.core.state.a r10 = r8.c(r10)
            androidx.constraintlayout.core.state.b r0 = r10.C()
            if (r0 != 0) goto L_0x0025
            androidx.constraintlayout.core.state.b r0 = androidx.constraintlayout.core.state.b.g()
            r10.e0(r0)
        L_0x0025:
            androidx.constraintlayout.core.state.b r0 = r10.A()
            if (r0 != 0) goto L_0x0032
            androidx.constraintlayout.core.state.b r0 = androidx.constraintlayout.core.state.b.g()
            r10.X(r0)
        L_0x0032:
            java.util.ArrayList r0 = r11.M()
            if (r0 != 0) goto L_0x0039
            return
        L_0x0039:
            int r1 = r0.size()
            r2 = 0
            rp0.f r1 = rp0.l.u(r2, r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0046:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02fb
            r3 = r1
            cp0.m r3 = (cp0.m) r3
            int r3 = r3.b()
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "reference"
            if (r3 == 0) goto L_0x02ee
            int r5 = r3.hashCode()
            java.lang.String r6 = "parent"
            java.lang.String r7 = "element[constraintName]"
            switch(r5) {
                case -1448775240: goto L_0x02c8;
                case -1364013995: goto L_0x029c;
                case -1349088399: goto L_0x028b;
                case -1249320806: goto L_0x0271;
                case -1249320805: goto L_0x0257;
                case -1249320804: goto L_0x023d;
                case -1225497657: goto L_0x0223;
                case -1225497656: goto L_0x0209;
                case -1225497655: goto L_0x01ef;
                case -1221029593: goto L_0x01dc;
                case -987906986: goto L_0x01c2;
                case -987906985: goto L_0x01a8;
                case -908189618: goto L_0x018e;
                case -908189617: goto L_0x0174;
                case -61505906: goto L_0x015a;
                case 92909918: goto L_0x0140;
                case 98116417: goto L_0x0126;
                case 111045711: goto L_0x010c;
                case 113126854: goto L_0x00f9;
                case 398344448: goto L_0x00df;
                case 1404070310: goto L_0x00b8;
                case 1941332754: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x02ee
        L_0x006a:
            java.lang.String r5 = "visibility"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0074
            goto L_0x02ee
        L_0x0074:
            java.lang.String r3 = r11.I(r3)
            if (r3 == 0) goto L_0x0046
            int r4 = r3.hashCode()
            r5 = -1901805651(0xffffffff8ea4bfad, float:-4.06137E-30)
            if (r4 == r5) goto L_0x00aa
            r5 = 3178655(0x30809f, float:4.454244E-39)
            if (r4 == r5) goto L_0x009b
            r5 = 466743410(0x1bd1f072, float:3.4731534E-22)
            if (r4 == r5) goto L_0x008e
            goto L_0x0046
        L_0x008e:
            java.lang.String r4 = "visible"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0097
            goto L_0x0046
        L_0x0097:
            r10.p0(r2)
            goto L_0x0046
        L_0x009b:
            java.lang.String r4 = "gone"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00a4
            goto L_0x0046
        L_0x00a4:
            r3 = 8
            r10.p0(r3)
            goto L_0x0046
        L_0x00aa:
            java.lang.String r4 = "invisible"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00b3
            goto L_0x0046
        L_0x00b3:
            r3 = 4
            r10.p0(r3)
            goto L_0x0046
        L_0x00b8:
            java.lang.String r5 = "centerHorizontally"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x00c2
            goto L_0x02ee
        L_0x00c2:
            java.lang.String r3 = r11.I(r3)
            boolean r4 = r3.equals(r6)
            if (r4 == 0) goto L_0x00d3
            java.lang.Integer r3 = androidx.constraintlayout.core.state.State.f8106f
            androidx.constraintlayout.core.state.a r3 = r8.c(r3)
            goto L_0x00d7
        L_0x00d3:
            androidx.constraintlayout.core.state.a r3 = r8.c(r3)
        L_0x00d7:
            r10.h0(r3)
            r10.x(r3)
            goto L_0x0046
        L_0x00df:
            java.lang.String r5 = "hWeight"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x00e9
            goto L_0x02ee
        L_0x00e9:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.Z(r3)
            goto L_0x0046
        L_0x00f9:
            java.lang.String r5 = "width"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0103
            goto L_0x02ee
        L_0x0103:
            androidx.constraintlayout.core.state.b r3 = h(r11, r3, r8)
            r10.e0(r3)
            goto L_0x0046
        L_0x010c:
            java.lang.String r5 = "vBias"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0116
            goto L_0x02ee
        L_0x0116:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.o0(r3)
            goto L_0x0046
        L_0x0126:
            java.lang.String r5 = "hBias"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0130
            goto L_0x02ee
        L_0x0130:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.E(r3)
            goto L_0x0046
        L_0x0140:
            java.lang.String r5 = "alpha"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x014a
            goto L_0x02ee
        L_0x014a:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.h(r3)
            goto L_0x0046
        L_0x015a:
            java.lang.String r5 = "vWeight"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0164
            goto L_0x02ee
        L_0x0164:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.c0(r3)
            goto L_0x0046
        L_0x0174:
            java.lang.String r5 = "scaleY"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x017e
            goto L_0x02ee
        L_0x017e:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.V(r3)
            goto L_0x0046
        L_0x018e:
            java.lang.String r5 = "scaleX"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0198
            goto L_0x02ee
        L_0x0198:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.U(r3)
            goto L_0x0046
        L_0x01a8:
            java.lang.String r5 = "pivotY"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x01b2
            goto L_0x02ee
        L_0x01b2:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.N(r3)
            goto L_0x0046
        L_0x01c2:
            java.lang.String r5 = "pivotX"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x01cc
            goto L_0x02ee
        L_0x01cc:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.M(r3)
            goto L_0x0046
        L_0x01dc:
            java.lang.String r5 = "height"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x01e6
            goto L_0x02ee
        L_0x01e6:
            androidx.constraintlayout.core.state.b r3 = h(r11, r3, r8)
            r10.X(r3)
            goto L_0x0046
        L_0x01ef:
            java.lang.String r5 = "translationZ"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x01f9
            goto L_0x02ee
        L_0x01f9:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.n0(r3)
            goto L_0x0046
        L_0x0209:
            java.lang.String r5 = "translationY"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0213
            goto L_0x02ee
        L_0x0213:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.m0(r3)
            goto L_0x0046
        L_0x0223:
            java.lang.String r5 = "translationX"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x022d
            goto L_0x02ee
        L_0x022d:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.l0(r3)
            goto L_0x0046
        L_0x023d:
            java.lang.String r5 = "rotationZ"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0247
            goto L_0x02ee
        L_0x0247:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.T(r3)
            goto L_0x0046
        L_0x0257:
            java.lang.String r5 = "rotationY"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0261
            goto L_0x02ee
        L_0x0261:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.S(r3)
            goto L_0x0046
        L_0x0271:
            java.lang.String r5 = "rotationX"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x027b
            goto L_0x02ee
        L_0x027b:
            androidx.constraintlayout.core.parser.c r3 = r11.t(r3)
            kotlin.jvm.internal.p.i(r3, r7)
            float r3 = r9.a(r3)
            r10.R(r3)
            goto L_0x0046
        L_0x028b:
            java.lang.String r5 = "custom"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0294
            goto L_0x02ee
        L_0x0294:
            kotlin.jvm.internal.p.i(r10, r4)
            f(r11, r10, r3)
            goto L_0x0046
        L_0x029c:
            java.lang.String r5 = "center"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x02a5
            goto L_0x02ee
        L_0x02a5:
            java.lang.String r3 = r11.I(r3)
            boolean r4 = r3.equals(r6)
            if (r4 == 0) goto L_0x02b6
            java.lang.Integer r3 = androidx.constraintlayout.core.state.State.f8106f
            androidx.constraintlayout.core.state.a r3 = r8.c(r3)
            goto L_0x02ba
        L_0x02b6:
            androidx.constraintlayout.core.state.a r3 = r8.c(r3)
        L_0x02ba:
            r10.h0(r3)
            r10.x(r3)
            r10.k0(r3)
            r10.o(r3)
            goto L_0x0046
        L_0x02c8:
            java.lang.String r5 = "centerVertically"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x02d1
            goto L_0x02ee
        L_0x02d1:
            java.lang.String r3 = r11.I(r3)
            boolean r4 = r3.equals(r6)
            if (r4 == 0) goto L_0x02e2
            java.lang.Integer r3 = androidx.constraintlayout.core.state.State.f8106f
            androidx.constraintlayout.core.state.a r3 = r8.c(r3)
            goto L_0x02e6
        L_0x02e2:
            androidx.constraintlayout.core.state.a r3 = r8.c(r3)
        L_0x02e6:
            r10.k0(r3)
            r10.o(r3)
            goto L_0x0046
        L_0x02ee:
            kotlin.jvm.internal.p.i(r10, r4)
            java.lang.String r4 = "constraintName"
            kotlin.jvm.internal.p.i(r3, r4)
            e(r8, r9, r11, r10, r3)
            goto L_0x0046
        L_0x02fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.f.p(f2.v, f2.t, java.lang.String, androidx.constraintlayout.core.parser.e):void");
    }
}
