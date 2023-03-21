package androidx.constraintlayout.core.parser;

import j2.a;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CLContainer */
public class b extends c {

    /* renamed from: f  reason: collision with root package name */
    ArrayList<c> f8096f = new ArrayList<>();

    public b(char[] cArr) {
        super(cArr);
    }

    public float B(String str) throws CLParsingException {
        c t = t(str);
        if (t != null) {
            return t.h();
        }
        throw new CLParsingException("no float found for key <" + str + ">, found [" + t.k() + "] : " + t, this);
    }

    public float D(String str) {
        c G = G(str);
        if (G instanceof a) {
            return G.h();
        }
        return Float.NaN;
    }

    public e E(String str) {
        c G = G(str);
        if (G instanceof e) {
            return (e) G;
        }
        return null;
    }

    public c F(int i11) {
        if (i11 < 0 || i11 >= this.f8096f.size()) {
            return null;
        }
        return this.f8096f.get(i11);
    }

    public c G(String str) {
        Iterator<c> it2 = this.f8096f.iterator();
        while (it2.hasNext()) {
            d dVar = (d) it2.next();
            if (dVar.c().equals(str)) {
                return dVar.O();
            }
        }
        return null;
    }

    public String H(int i11) throws CLParsingException {
        c s11 = s(i11);
        if (s11 instanceof j2.b) {
            return s11.c();
        }
        throw new CLParsingException("no string at index " + i11, this);
    }

    public String I(String str) throws CLParsingException {
        c t = t(str);
        if (t instanceof j2.b) {
            return t.c();
        }
        String str2 = null;
        if (t != null) {
            str2 = t.k();
        }
        throw new CLParsingException("no string found for key <" + str + ">, found [" + str2 + "] : " + t, this);
    }

    public String J(int i11) {
        c F = F(i11);
        if (F instanceof j2.b) {
            return F.c();
        }
        return null;
    }

    public String K(String str) {
        c G = G(str);
        if (G instanceof j2.b) {
            return G.c();
        }
        return null;
    }

    public boolean L(String str) {
        Iterator<c> it2 = this.f8096f.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            if ((next instanceof d) && ((d) next).c().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> M() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<c> it2 = this.f8096f.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            if (next instanceof d) {
                arrayList.add(((d) next).c());
            }
        }
        return arrayList;
    }

    public float getFloat(int i11) throws CLParsingException {
        c s11 = s(i11);
        if (s11 != null) {
            return s11.h();
        }
        throw new CLParsingException("no float at index " + i11, this);
    }

    public void r(c cVar) {
        this.f8096f.add(cVar);
        if (CLParser.f8083d) {
            PrintStream printStream = System.out;
            printStream.println("added element " + cVar + " to " + this);
        }
    }

    public c s(int i11) throws CLParsingException {
        if (i11 >= 0 && i11 < this.f8096f.size()) {
            return this.f8096f.get(i11);
        }
        throw new CLParsingException("no element at index " + i11, this);
    }

    public int size() {
        return this.f8096f.size();
    }

    public c t(String str) throws CLParsingException {
        Iterator<c> it2 = this.f8096f.iterator();
        while (it2.hasNext()) {
            d dVar = (d) it2.next();
            if (dVar.c().equals(str)) {
                return dVar.O();
            }
        }
        throw new CLParsingException("no element for key <" + str + ">", this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<c> it2 = this.f8096f.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(next);
        }
        return super.toString() + " = <" + sb2 + " >";
    }

    public a u(String str) throws CLParsingException {
        c t = t(str);
        if (t instanceof a) {
            return (a) t;
        }
        throw new CLParsingException("no array found for key <" + str + ">, found [" + t.k() + "] : " + t, this);
    }

    public a v(String str) {
        c G = G(str);
        if (G instanceof a) {
            return (a) G;
        }
        return null;
    }
}
