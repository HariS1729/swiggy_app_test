package e7;

import com.adobe.xmp.XMPException;
import g7.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

class m implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private String f14433a;

    /* renamed from: b  reason: collision with root package name */
    private String f14434b;

    /* renamed from: c  reason: collision with root package name */
    private m f14435c;

    /* renamed from: d  reason: collision with root package name */
    private List f14436d;

    /* renamed from: e  reason: collision with root package name */
    private List f14437e;

    /* renamed from: f  reason: collision with root package name */
    private e f14438f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14439g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14440h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14441i;
    private boolean j;

    class a implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f14442a;

        a(Iterator it2) {
            this.f14442a = it2;
        }

        public boolean hasNext() {
            return this.f14442a.hasNext();
        }

        public Object next() {
            return this.f14442a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
        }
    }

    static {
        Class<m> cls = m.class;
    }

    public m(String str, e eVar) {
        this(str, (String) null, eVar);
    }

    public m(String str, String str2, e eVar) {
        this.f14436d = null;
        this.f14437e = null;
        this.f14433a = str;
        this.f14434b = str2;
        this.f14438f = eVar;
    }

    private boolean E() {
        return "xml:lang".equals(this.f14433a);
    }

    private boolean F() {
        return "rdf:type".equals(this.f14433a);
    }

    private void e(String str) throws XMPException {
        if (!HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(str) && k(str) != null) {
            throw new XMPException("Duplicate property or field node '" + str + "'", 203);
        }
    }

    private void f(String str) throws XMPException {
        if (!HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(str) && l(str) != null) {
            throw new XMPException("Duplicate '" + str + "' qualifier", 203);
        }
    }

    private m j(List list, String str) {
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            m mVar = (m) it2.next();
            if (mVar.r().equals(str)) {
                return mVar;
            }
        }
        return null;
    }

    private List n() {
        if (this.f14436d == null) {
            this.f14436d = new ArrayList(0);
        }
        return this.f14436d;
    }

    private List v() {
        if (this.f14437e == null) {
            this.f14437e = new ArrayList(0);
        }
        return this.f14437e;
    }

    public boolean A() {
        List list = this.f14437e;
        return list != null && list.size() > 0;
    }

    public boolean B() {
        return this.f14441i;
    }

    public boolean C() {
        return this.f14439g;
    }

    public Iterator G() {
        return this.f14436d != null ? n().iterator() : Collections.EMPTY_LIST.listIterator();
    }

    public Iterator I() {
        return this.f14437e != null ? new a(v().iterator()) : Collections.EMPTY_LIST.iterator();
    }

    public void J(int i11) {
        n().remove(i11 - 1);
        h();
    }

    public void K(m mVar) {
        n().remove(mVar);
        h();
    }

    public void L() {
        this.f14436d = null;
    }

    public void N(m mVar) {
        e s11 = s();
        if (mVar.E()) {
            s11.w(false);
        } else if (mVar.F()) {
            s11.y(false);
        }
        v().remove(mVar);
        if (this.f14437e.isEmpty()) {
            s11.x(false);
            this.f14437e = null;
        }
    }

    public void O() {
        e s11 = s();
        s11.x(false);
        s11.w(false);
        s11.y(false);
        this.f14437e = null;
    }

    public void Q(int i11, m mVar) {
        mVar.X(this);
        n().set(i11 - 1, mVar);
    }

    public void R(boolean z11) {
        this.f14441i = z11;
    }

    public void S(boolean z11) {
        this.f14440h = z11;
    }

    public void T(boolean z11) {
        this.j = z11;
    }

    public void U(boolean z11) {
        this.f14439g = z11;
    }

    public void V(String str) {
        this.f14433a = str;
    }

    public void W(e eVar) {
        this.f14438f = eVar;
    }

    /* access modifiers changed from: protected */
    public void X(m mVar) {
        this.f14435c = mVar;
    }

    public void Y(String str) {
        this.f14434b = str;
    }

    public void a(int i11, m mVar) throws XMPException {
        e(mVar.r());
        mVar.X(this);
        n().add(i11 - 1, mVar);
    }

    public void c(m mVar) throws XMPException {
        e(mVar.r());
        mVar.X(this);
        n().add(mVar);
    }

    public Object clone() {
        e eVar;
        try {
            eVar = new e(s().d());
        } catch (XMPException unused) {
            eVar = new e();
        }
        m mVar = new m(this.f14433a, this.f14434b, eVar);
        i(mVar);
        return mVar;
    }

    public int compareTo(Object obj) {
        String str;
        String r11;
        if (s().o()) {
            str = this.f14434b;
            r11 = ((m) obj).y();
        } else {
            str = this.f14433a;
            r11 = ((m) obj).r();
        }
        return str.compareTo(r11);
    }

    public void d(m mVar) throws XMPException {
        List v;
        boolean h11;
        f(mVar.r());
        mVar.X(this);
        mVar.s().z(true);
        s().x(true);
        if (mVar.E()) {
            this.f14438f.w(true);
            v = v();
            h11 = false;
        } else if (mVar.F()) {
            this.f14438f.y(true);
            v = v();
            h11 = this.f14438f.h();
        } else {
            v().add(mVar);
            return;
        }
        v.add(h11 ? 1 : 0, mVar);
    }

    /* access modifiers changed from: protected */
    public void h() {
        if (this.f14436d.isEmpty()) {
            this.f14436d = null;
        }
    }

    public void i(m mVar) {
        try {
            Iterator G = G();
            while (G.hasNext()) {
                mVar.c((m) ((m) G.next()).clone());
            }
            Iterator I = I();
            while (I.hasNext()) {
                mVar.d((m) ((m) I.next()).clone());
            }
        } catch (XMPException unused) {
        }
    }

    public m k(String str) {
        return j(n(), str);
    }

    public m l(String str) {
        return j(this.f14437e, str);
    }

    public m m(int i11) {
        return (m) n().get(i11 - 1);
    }

    public int o() {
        List list = this.f14436d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public boolean p() {
        return this.f14440h;
    }

    public boolean q() {
        return this.j;
    }

    public String r() {
        return this.f14433a;
    }

    public e s() {
        if (this.f14438f == null) {
            this.f14438f = new e();
        }
        return this.f14438f;
    }

    public m t() {
        return this.f14435c;
    }

    public m u(int i11) {
        return (m) v().get(i11 - 1);
    }

    public int w() {
        List list = this.f14437e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public List x() {
        return Collections.unmodifiableList(new ArrayList(n()));
    }

    public String y() {
        return this.f14434b;
    }

    public boolean z() {
        List list = this.f14436d;
        return list != null && list.size() > 0;
    }
}
