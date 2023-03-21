package e7;

import com.adobe.xmp.XMPException;
import d7.d;
import f7.b;
import g7.e;
import java.util.Iterator;
import okhttp3.HttpUrl;

public class n {
    static void a(m mVar, String str, String str2) throws XMPException {
        m mVar2 = new m(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, str2, (e) null);
        m mVar3 = new m("xml:lang", str, (e) null);
        mVar2.d(mVar3);
        if (!"x-default".equals(mVar3.y())) {
            mVar.c(mVar2);
        } else {
            mVar.a(1, mVar2);
        }
    }

    static Object[] b(m mVar, String str, String str2) throws XMPException {
        if (mVar.s().j()) {
            m mVar2 = null;
            if (!mVar.z()) {
                return new Object[]{new Integer(0), null};
            }
            Iterator G = mVar.G();
            m mVar3 = null;
            int i11 = 0;
            while (G.hasNext()) {
                m mVar4 = (m) G.next();
                if (mVar4.s().m()) {
                    throw new XMPException("Alt-text array item is not simple", 102);
                } else if (!mVar4.A() || !"xml:lang".equals(mVar4.u(1).r())) {
                    throw new XMPException("Alt-text array item has no language qualifier", 102);
                } else {
                    String y11 = mVar4.u(1).y();
                    if (str2.equals(y11)) {
                        return new Object[]{new Integer(1), mVar4};
                    } else if (str != null && y11.startsWith(str)) {
                        if (mVar2 == null) {
                            mVar2 = mVar4;
                        }
                        i11++;
                    } else if ("x-default".equals(y11)) {
                        mVar3 = mVar4;
                    }
                }
            }
            if (i11 == 1) {
                return new Object[]{new Integer(2), mVar2};
            } else if (i11 > 1) {
                return new Object[]{new Integer(3), mVar2};
            } else if (mVar3 != null) {
                return new Object[]{new Integer(4), mVar3};
            } else {
                return new Object[]{new Integer(5), mVar.m(1)};
            }
        } else {
            throw new XMPException("Localized text array is not alt-text", 102);
        }
    }

    static void c(m mVar) {
        m t = mVar.t();
        if (mVar.s().n()) {
            t.N(mVar);
        } else {
            t.K(mVar);
        }
        if (!t.z() && t.s().o()) {
            t.t().K(t);
        }
    }

    static void d(m mVar) {
        if (mVar.s().k() && mVar.z()) {
            boolean z11 = false;
            Iterator G = mVar.G();
            while (true) {
                if (G.hasNext()) {
                    if (((m) G.next()).s().h()) {
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z11) {
                mVar.s().t(true);
                o(mVar);
            }
        }
    }

    static m e(m mVar, String str, boolean z11) throws XMPException {
        if (!mVar.s().o() && !mVar.s().q()) {
            if (!mVar.C()) {
                throw new XMPException("Named children only allowed for schemas and structs", 102);
            } else if (mVar.s().i()) {
                throw new XMPException("Named children not allowed for arrays", 102);
            } else if (z11) {
                mVar.s().B(true);
            }
        }
        m k = mVar.k(str);
        if (k != null || !z11) {
            return k;
        }
        m mVar2 = new m(str, new e());
        mVar2.U(true);
        mVar.c(mVar2);
        return mVar2;
    }

    private static int f(m mVar, String str, boolean z11) throws XMPException {
        try {
            int parseInt = Integer.parseInt(str.substring(1, str.length() - 1));
            if (parseInt >= 1) {
                if (z11 && parseInt == mVar.o() + 1) {
                    m mVar2 = new m(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, (e) null);
                    mVar2.U(true);
                    mVar.c(mVar2);
                }
                return parseInt;
            }
            throw new XMPException("Array index must be larger than zero", 102);
        } catch (NumberFormatException unused) {
            throw new XMPException("Array index not digits.", 102);
        }
    }

    static m g(m mVar, b bVar, boolean z11, e eVar) throws XMPException {
        m mVar2;
        if (bVar == null || bVar.c() == 0) {
            throw new XMPException("Empty XMPPath", 102);
        }
        m j = j(mVar, bVar.b(0).c(), z11);
        if (j == null) {
            return null;
        }
        if (j.C()) {
            j.U(false);
            mVar2 = j;
        } else {
            mVar2 = null;
        }
        int i11 = 1;
        while (i11 < bVar.c()) {
            try {
                j = k(j, bVar.b(i11), z11);
                if (j == null) {
                    if (z11) {
                        c(mVar2);
                    }
                    return null;
                }
                if (j.C()) {
                    j.U(false);
                    if (i11 == 1 && bVar.b(i11).d() && bVar.b(i11).a() != 0) {
                        j.s().f(bVar.b(i11).a(), true);
                    } else if (i11 < bVar.c() - 1 && bVar.b(i11).b() == 1 && !j.s().m()) {
                        j.s().B(true);
                    }
                    if (mVar2 == null) {
                        mVar2 = j;
                    }
                }
                i11++;
            } catch (XMPException e11) {
                if (mVar2 != null) {
                    c(mVar2);
                }
                throw e11;
            }
        }
        if (mVar2 != null) {
            j.s().r(eVar);
            j.W(j.s());
        }
        return j;
    }

    private static m h(m mVar, String str, boolean z11) throws XMPException {
        m l11 = mVar.l(str);
        if (l11 != null || !z11) {
            return l11;
        }
        m mVar2 = new m(str, (e) null);
        mVar2.U(true);
        mVar.d(mVar2);
        return mVar2;
    }

    static m i(m mVar, String str, String str2, boolean z11) throws XMPException {
        m k = mVar.k(str);
        if (k == null && z11) {
            k = new m(str, new e().A(true));
            k.U(true);
            String a11 = d.a().a(str);
            if (a11 == null) {
                if (str2 == null || str2.length() == 0) {
                    throw new XMPException("Unregistered schema namespace URI", 101);
                }
                a11 = d.a().b(str, str2);
            }
            k.Y(a11);
            mVar.c(k);
        }
        return k;
    }

    static m j(m mVar, String str, boolean z11) throws XMPException {
        return i(mVar, str, (String) null, z11);
    }

    private static m k(m mVar, f7.d dVar, boolean z11) throws XMPException {
        int i11;
        int b11 = dVar.b();
        if (b11 == 1) {
            return e(mVar, dVar.c(), z11);
        }
        if (b11 == 2) {
            return h(mVar, dVar.c().substring(1), z11);
        }
        if (mVar.s().i()) {
            if (b11 == 3) {
                i11 = f(mVar, dVar.c(), z11);
            } else if (b11 == 4) {
                i11 = mVar.o();
            } else if (b11 == 6) {
                String[] i12 = h.i(dVar.c());
                i11 = l(mVar, i12[0], i12[1]);
            } else if (b11 == 5) {
                String[] i13 = h.i(dVar.c());
                i11 = n(mVar, i13[0], i13[1], dVar.a());
            } else {
                throw new XMPException("Unknown array indexing step in FollowXPathStep", 9);
            }
            if (1 > i11 || i11 > mVar.o()) {
                return null;
            }
            return mVar.m(i11);
        }
        throw new XMPException("Indexing applied to non-array", 102);
    }

    private static int l(m mVar, String str, String str2) throws XMPException {
        int i11 = -1;
        int i12 = 1;
        while (i12 <= mVar.o() && i11 < 0) {
            m m11 = mVar.m(i12);
            if (m11.s().q()) {
                int i13 = 1;
                while (true) {
                    if (i13 > m11.o()) {
                        break;
                    }
                    m m12 = m11.m(i13);
                    if (str.equals(m12.r()) && str2.equals(m12.y())) {
                        i11 = i12;
                        break;
                    }
                    i13++;
                }
                i12++;
            } else {
                throw new XMPException("Field selector must be used on array of struct", 102);
            }
        }
        return i11;
    }

    static int m(m mVar, String str) throws XMPException {
        if (mVar.s().i()) {
            for (int i11 = 1; i11 <= mVar.o(); i11++) {
                m m11 = mVar.m(i11);
                if (m11.A() && "xml:lang".equals(m11.u(1).r()) && str.equals(m11.u(1).y())) {
                    return i11;
                }
            }
            return -1;
        }
        throw new XMPException("Language item must be used on array", 102);
    }

    private static int n(m mVar, String str, String str2, int i11) throws XMPException {
        if ("xml:lang".equals(str)) {
            int m11 = m(mVar, h.h(str2));
            if (m11 >= 0 || (i11 & 4096) <= 0) {
                return m11;
            }
            m mVar2 = new m(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, (e) null);
            mVar2.d(new m("xml:lang", "x-default", (e) null));
            mVar.a(1, mVar2);
            return 1;
        }
        for (int i12 = 1; i12 < mVar.o(); i12++) {
            Iterator I = mVar.m(i12).I();
            while (I.hasNext()) {
                m mVar3 = (m) I.next();
                if (str.equals(mVar3.r()) && str2.equals(mVar3.y())) {
                    return i12;
                }
            }
        }
        return -1;
    }

    static void o(m mVar) {
        if (mVar.s().j()) {
            int i11 = 2;
            while (i11 <= mVar.o()) {
                m m11 = mVar.m(i11);
                if (!m11.A() || !"x-default".equals(m11.u(1).y())) {
                    i11++;
                } else {
                    try {
                        mVar.J(i11);
                        mVar.a(1, m11);
                    } catch (XMPException unused) {
                    }
                    if (i11 == 2) {
                        mVar.m(2).Y(m11.y());
                        return;
                    }
                    return;
                }
            }
        }
    }

    static e p(e eVar, Object obj) throws XMPException {
        if (eVar == null) {
            eVar = new e();
        }
        if (eVar.j()) {
            eVar.u(true);
        }
        if (eVar.k()) {
            eVar.v(true);
        }
        if (eVar.l()) {
            eVar.s(true);
        }
        if (!eVar.m() || obj == null || obj.toString().length() <= 0) {
            eVar.a(eVar.d());
            return eVar;
        }
        throw new XMPException("Structs and arrays can't have values", 103);
    }
}
