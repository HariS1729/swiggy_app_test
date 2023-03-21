package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* compiled from: CLObject */
public class e extends b implements Iterable<d> {

    /* compiled from: CLObject */
    private class a implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        e f8103a;

        /* renamed from: b  reason: collision with root package name */
        int f8104b = 0;

        public a(e eVar) {
            this.f8103a = eVar;
        }

        public boolean hasNext() {
            return this.f8104b < this.f8103a.size();
        }

        public Object next() {
            d dVar = (d) this.f8103a.f8096f.get(this.f8104b);
            this.f8104b++;
            return dVar;
        }
    }

    public e(char[] cArr) {
        super(cArr);
    }

    public static e N(char[] cArr) {
        return new e(cArr);
    }

    public Iterator iterator() {
        return new a(this);
    }

    public String q() {
        StringBuilder sb2 = new StringBuilder(g() + "{ ");
        Iterator<c> it2 = this.f8096f.iterator();
        boolean z11 = true;
        while (it2.hasNext()) {
            c next = it2.next();
            if (!z11) {
                sb2.append(", ");
            } else {
                z11 = false;
            }
            sb2.append(next.q());
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
