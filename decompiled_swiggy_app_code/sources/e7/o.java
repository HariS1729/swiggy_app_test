package e7;

import com.adobe.xmp.XMPException;
import d7.a;
import d7.c;
import d7.f;
import g7.d;
import g7.e;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.HttpUrl;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static Map f14444a;

    static {
        d();
    }

    private static void a(m mVar, m mVar2, boolean z11) throws XMPException {
        if (!mVar.y().equals(mVar2.y()) || mVar.o() != mVar2.o()) {
            throw new XMPException("Mismatch between alias and base nodes", 203);
        } else if (z11 || (mVar.r().equals(mVar2.r()) && mVar.s().equals(mVar2.s()) && mVar.w() == mVar2.w())) {
            Iterator G = mVar.G();
            Iterator G2 = mVar2.G();
            while (G.hasNext() && G2.hasNext()) {
                a((m) G.next(), (m) G2.next(), false);
            }
            Iterator I = mVar.I();
            Iterator I2 = mVar2.I();
            while (I.hasNext() && I2.hasNext()) {
                a((m) I.next(), (m) I2.next(), false);
            }
        } else {
            throw new XMPException("Mismatch between alias and base nodes", 203);
        }
    }

    private static void b(m mVar) {
        Iterator G = mVar.G();
        while (G.hasNext()) {
            if (!((m) G.next()).z()) {
                G.remove();
            }
        }
    }

    private static void c(m mVar) throws XMPException {
        m e11 = n.e(mVar, "exif:GPSTimeStamp", false);
        if (e11 != null) {
            try {
                a b11 = f.b(e11.y());
                if (b11.getYear() != 0 || b11.getMonth() != 0) {
                    return;
                }
                if (b11.getDay() == 0) {
                    m e12 = n.e(mVar, "exif:DateTimeOriginal", false);
                    if (e12 == null) {
                        e12 = n.e(mVar, "exif:DateTimeDigitized", false);
                    }
                    a b12 = f.b(e12.y());
                    Calendar q02 = b11.q0();
                    q02.set(1, b12.getYear());
                    q02.set(2, b12.getMonth());
                    q02.set(5, b12.getDay());
                    e11.Y(f.a(new i(q02)));
                }
            } catch (XMPException unused) {
            }
        }
    }

    private static void d() {
        f14444a = new HashMap();
        e eVar = new e();
        eVar.s(true);
        f14444a.put("dc:contributor", eVar);
        f14444a.put("dc:language", eVar);
        f14444a.put("dc:publisher", eVar);
        f14444a.put("dc:relation", eVar);
        f14444a.put("dc:subject", eVar);
        f14444a.put("dc:type", eVar);
        e eVar2 = new e();
        eVar2.s(true);
        eVar2.v(true);
        f14444a.put("dc:creator", eVar2);
        f14444a.put("dc:date", eVar2);
        e eVar3 = new e();
        eVar3.s(true);
        eVar3.v(true);
        eVar3.u(true);
        eVar3.t(true);
        f14444a.put("dc:description", eVar3);
        f14444a.put("dc:rights", eVar3);
        f14444a.put("dc:title", eVar3);
    }

    private static void e(c cVar, m mVar) {
        String str;
        try {
            m j = n.j(((k) cVar).b(), "http://purl.org/dc/elements/1.1/", true);
            String y11 = mVar.y();
            m e11 = n.e(j, "dc:rights", false);
            if (e11 != null) {
                if (e11.z()) {
                    int m11 = n.m(e11, "x-default");
                    if (m11 < 0) {
                        cVar.O0("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", e11.m(1).y(), (e) null);
                        m11 = n.m(e11, "x-default");
                    }
                    m m12 = e11.m(m11);
                    String y12 = m12.y();
                    int indexOf = y12.indexOf("\n\n");
                    if (indexOf < 0) {
                        if (!y11.equals(y12)) {
                            str = y12 + "\n\n" + y11;
                        }
                        mVar.t().K(mVar);
                    }
                    int i11 = indexOf + 2;
                    if (!y12.substring(i11).equals(y11)) {
                        str = y12.substring(0, i11) + y11;
                    }
                    mVar.t().K(mVar);
                    m12.Y(str);
                    mVar.t().K(mVar);
                }
            }
            cVar.O0("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", "\n\n" + y11, (e) null);
            mVar.t().K(mVar);
        } catch (XMPException unused) {
        }
    }

    private static void f(m mVar, d dVar) throws XMPException {
        if (mVar.p()) {
            mVar.S(false);
            boolean m11 = dVar.m();
            for (m mVar2 : mVar.x()) {
                if (mVar2.p()) {
                    Iterator G = mVar2.G();
                    while (G.hasNext()) {
                        m mVar3 = (m) G.next();
                        if (mVar3.B()) {
                            mVar3.R(false);
                            h7.a d11 = d7.d.a().d(mVar3.r());
                            if (d11 != null) {
                                m mVar4 = null;
                                m i11 = n.i(mVar, d11.getNamespace(), (String) null, true);
                                i11.U(false);
                                m e11 = n.e(i11, d11.c() + d11.a(), false);
                                if (e11 == null) {
                                    if (d11.b().j()) {
                                        mVar3.V(d11.c() + d11.a());
                                        i11.c(mVar3);
                                    } else {
                                        m mVar5 = new m(d11.c() + d11.a(), d11.b().m());
                                        i11.c(mVar5);
                                        k(G, mVar3, mVar5);
                                    }
                                } else if (!d11.b().j()) {
                                    if (d11.b().i()) {
                                        int m12 = n.m(e11, "x-default");
                                        if (m12 != -1) {
                                            mVar4 = e11.m(m12);
                                        }
                                    } else if (e11.z()) {
                                        mVar4 = e11.m(1);
                                    }
                                    if (mVar4 == null) {
                                        k(G, mVar3, e11);
                                    } else if (m11) {
                                        a(mVar3, mVar4, true);
                                    }
                                } else if (m11) {
                                    a(mVar3, e11, true);
                                }
                                G.remove();
                            }
                        }
                    }
                    mVar2.S(false);
                }
            }
        }
    }

    private static void g(m mVar) throws XMPException {
        for (int i11 = 1; i11 <= mVar.o(); i11++) {
            m m11 = mVar.m(i11);
            e eVar = (e) f14444a.get(m11.r());
            if (eVar != null) {
                if (m11.s().p()) {
                    m mVar2 = new m(m11.r(), eVar);
                    m11.V(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                    mVar2.c(m11);
                    mVar.Q(i11, mVar2);
                    if (eVar.j() && !m11.s().h()) {
                        m11.d(new m("xml:lang", "x-default", (e) null));
                    }
                } else {
                    m11.s().f(7680, false);
                    m11.s().r(eVar);
                    if (eVar.j()) {
                        i(m11);
                    }
                }
            }
        }
    }

    static c h(k kVar, d dVar) throws XMPException {
        m b11 = kVar.b();
        j(kVar);
        f(b11, dVar);
        l(b11);
        b(b11);
        return kVar;
    }

    private static void i(m mVar) throws XMPException {
        if (mVar != null && mVar.s().i()) {
            mVar.s().v(true).u(true).t(true);
            Iterator G = mVar.G();
            while (G.hasNext()) {
                m mVar2 = (m) G.next();
                if (!mVar2.s().m()) {
                    if (!mVar2.s().h()) {
                        String y11 = mVar2.y();
                        if (!(y11 == null || y11.length() == 0)) {
                            mVar2.d(new m("xml:lang", "x-repair", (e) null));
                        }
                    }
                }
                G.remove();
            }
        }
    }

    private static void j(k kVar) throws XMPException {
        m e11;
        n.j(kVar.b(), "http://purl.org/dc/elements/1.1/", true);
        Iterator G = kVar.b().G();
        while (G.hasNext()) {
            m mVar = (m) G.next();
            if ("http://purl.org/dc/elements/1.1/".equals(mVar.r())) {
                g(mVar);
            } else {
                if ("http://ns.adobe.com/exif/1.0/".equals(mVar.r())) {
                    c(mVar);
                    e11 = n.e(mVar, "exif:UserComment", false);
                    if (e11 == null) {
                    }
                } else if ("http://ns.adobe.com/xmp/1.0/DynamicMedia/".equals(mVar.r())) {
                    m e12 = n.e(mVar, "xmpDM:copyright", false);
                    if (e12 != null) {
                        e(kVar, e12);
                    }
                } else if ("http://ns.adobe.com/xap/1.0/rights/".equals(mVar.r())) {
                    e11 = n.e(mVar, "xmpRights:UsageTerms", false);
                    if (e11 == null) {
                    }
                }
                i(e11);
            }
        }
    }

    private static void k(Iterator it2, m mVar, m mVar2) throws XMPException {
        if (mVar2.s().j()) {
            if (!mVar.s().h()) {
                mVar.d(new m("xml:lang", "x-default", (e) null));
            } else {
                throw new XMPException("Alias to x-default already has a language qualifier", 203);
            }
        }
        it2.remove();
        mVar.V(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        mVar2.c(mVar);
    }

    private static void l(m mVar) throws XMPException {
        if (mVar.r() != null && mVar.r().length() >= 36) {
            String lowerCase = mVar.r().toLowerCase();
            if (lowerCase.startsWith("uuid:")) {
                lowerCase = lowerCase.substring(5);
            }
            if (h.a(lowerCase)) {
                m g11 = n.g(mVar, f7.c.a("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, (e) null);
                if (g11 != null) {
                    g11.W((e) null);
                    g11.Y("uuid:" + lowerCase);
                    g11.L();
                    g11.O();
                    mVar.V((String) null);
                    return;
                }
                throw new XMPException("Failure creating xmpMM:InstanceID", 9);
            }
        }
    }
}
