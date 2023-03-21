package e7;

import com.adobe.xmp.XMPException;
import f7.c;
import g7.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class j implements d7.b {

    /* renamed from: a  reason: collision with root package name */
    private g7.b f14409a;

    /* renamed from: b  reason: collision with root package name */
    private String f14410b = null;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f14411c = false;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f14412d = false;

    /* renamed from: e  reason: collision with root package name */
    private Iterator f14413e = null;

    private class a implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private int f14414a = 0;

        /* renamed from: b  reason: collision with root package name */
        private m f14415b;

        /* renamed from: c  reason: collision with root package name */
        private String f14416c;

        /* renamed from: d  reason: collision with root package name */
        private Iterator f14417d = null;

        /* renamed from: e  reason: collision with root package name */
        private int f14418e = 0;

        /* renamed from: f  reason: collision with root package name */
        private Iterator f14419f = Collections.EMPTY_LIST.iterator();

        /* renamed from: g  reason: collision with root package name */
        private h7.b f14420g = null;

        /* renamed from: e7.j$a$a  reason: collision with other inner class name */
        class C0120a implements h7.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f14422a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f14423b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f14424c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f14425d;

            C0120a(m mVar, String str, String str2, String str3) {
                this.f14422a = mVar;
                this.f14423b = str;
                this.f14424c = str2;
                this.f14425d = str3;
            }

            public String getPath() {
                return this.f14424c;
            }

            public String getValue() {
                return this.f14425d;
            }
        }

        public a() {
        }

        public a(m mVar, String str, int i11) {
            this.f14415b = mVar;
            this.f14414a = 0;
            if (mVar.s().o()) {
                j.this.d(mVar.r());
            }
            this.f14416c = a(mVar, str, i11);
        }

        private boolean d(Iterator it2) {
            j jVar = j.this;
            if (jVar.f14411c) {
                jVar.f14411c = false;
                this.f14419f = Collections.EMPTY_LIST.iterator();
            }
            if (!this.f14419f.hasNext() && it2.hasNext()) {
                int i11 = this.f14418e + 1;
                this.f14418e = i11;
                this.f14419f = new a((m) it2.next(), this.f14416c, i11);
            }
            if (!this.f14419f.hasNext()) {
                return false;
            }
            this.f14420g = (h7.b) this.f14419f.next();
            return true;
        }

        /* access modifiers changed from: protected */
        public String a(m mVar, String str, int i11) {
            String str2;
            String str3;
            if (mVar.t() == null || mVar.s().o()) {
                return null;
            }
            if (mVar.t().s().i()) {
                str3 = "[" + String.valueOf(i11) + "]";
                str2 = "";
            } else {
                str3 = mVar.r();
                str2 = "/";
            }
            if (str == null || str.length() == 0) {
                return str3;
            }
            if (j.this.c().i()) {
                return !str3.startsWith("?") ? str3 : str3.substring(1);
            }
            return str + str2 + str3;
        }

        /* access modifiers changed from: protected */
        public h7.b b(m mVar, String str, String str2) {
            return new C0120a(mVar, str, str2, mVar.s().o() ? null : mVar.y());
        }

        /* access modifiers changed from: protected */
        public h7.b c() {
            return this.f14420g;
        }

        /* access modifiers changed from: protected */
        public boolean e() {
            this.f14414a = 1;
            if (this.f14415b.t() == null || (j.this.c().j() && this.f14415b.z())) {
                return hasNext();
            }
            this.f14420g = b(this.f14415b, j.this.b(), this.f14416c);
            return true;
        }

        /* access modifiers changed from: protected */
        public void f(h7.b bVar) {
            this.f14420g = bVar;
        }

        public boolean hasNext() {
            if (this.f14420g != null) {
                return true;
            }
            int i11 = this.f14414a;
            if (i11 == 0) {
                return e();
            }
            if (i11 == 1) {
                if (this.f14417d == null) {
                    this.f14417d = this.f14415b.G();
                }
                boolean d11 = d(this.f14417d);
                if (d11 || !this.f14415b.A() || j.this.c().k()) {
                    return d11;
                }
                this.f14414a = 2;
                this.f14417d = null;
                return hasNext();
            }
            if (this.f14417d == null) {
                this.f14417d = this.f14415b.I();
            }
            return d(this.f14417d);
        }

        public Object next() {
            if (hasNext()) {
                h7.b bVar = this.f14420g;
                this.f14420g = null;
                return bVar;
            }
            throw new NoSuchElementException("There are no more nodes to return");
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class b extends a {

        /* renamed from: i  reason: collision with root package name */
        private String f14427i;
        private Iterator j;
        private int k = 0;

        public b(m mVar, String str) {
            super();
            if (mVar.s().o()) {
                j.this.d(mVar.r());
            }
            this.f14427i = a(mVar, str, 1);
            this.j = mVar.G();
        }

        public boolean hasNext() {
            if (c() != null) {
                return true;
            }
            if (j.this.f14411c || !this.j.hasNext()) {
                return false;
            }
            m mVar = (m) this.j.next();
            this.k++;
            String str = null;
            if (mVar.s().o()) {
                j.this.d(mVar.r());
            } else if (mVar.t() != null) {
                str = a(mVar, this.f14427i, this.k);
            }
            if (j.this.c().j() && mVar.z()) {
                return hasNext();
            }
            f(b(mVar, j.this.b(), str));
            return true;
        }
    }

    public j(k kVar, String str, String str2, g7.b bVar) throws XMPException {
        m mVar;
        String str3 = null;
        this.f14409a = bVar == null ? new g7.b() : bVar;
        boolean z11 = str != null && str.length() > 0;
        boolean z12 = str2 != null && str2.length() > 0;
        if (!z11 && !z12) {
            mVar = kVar.b();
        } else if (z11 && z12) {
            f7.b a11 = c.a(str, str2);
            f7.b bVar2 = new f7.b();
            for (int i11 = 0; i11 < a11.c() - 1; i11++) {
                bVar2.a(a11.b(i11));
            }
            mVar = n.g(kVar.b(), a11, false, (e) null);
            this.f14410b = str;
            str3 = bVar2.toString();
        } else if (!z11 || z12) {
            throw new XMPException("Schema namespace URI is required", 101);
        } else {
            mVar = n.j(kVar.b(), str, false);
        }
        if (mVar != null) {
            this.f14413e = !this.f14409a.h() ? new a(mVar, str3, 1) : new b(mVar, str3);
        } else {
            this.f14413e = Collections.EMPTY_LIST.iterator();
        }
    }

    /* access modifiers changed from: protected */
    public String b() {
        return this.f14410b;
    }

    /* access modifiers changed from: protected */
    public g7.b c() {
        return this.f14409a;
    }

    /* access modifiers changed from: protected */
    public void d(String str) {
        this.f14410b = str;
    }

    public boolean hasNext() {
        return this.f14413e.hasNext();
    }

    public Object next() {
        return this.f14413e.next();
    }

    public void remove() {
        throw new UnsupportedOperationException("The XMPIterator does not support remove().");
    }
}
