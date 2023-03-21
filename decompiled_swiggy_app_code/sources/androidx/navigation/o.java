package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.collection.h;
import androidx.navigation.common.R;
import androidx.navigation.m;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: NavGraph */
public class o extends m implements Iterable<m> {
    final h<m> j = new h<>();
    private int k;

    /* renamed from: l  reason: collision with root package name */
    private String f10957l;

    /* compiled from: NavGraph */
    class a implements Iterator<m> {

        /* renamed from: a  reason: collision with root package name */
        private int f10958a = -1;

        /* renamed from: b  reason: collision with root package name */
        private boolean f10959b = false;

        a() {
        }

        /* renamed from: b */
        public m next() {
            if (hasNext()) {
                this.f10959b = true;
                h<m> hVar = o.this.j;
                int i11 = this.f10958a + 1;
                this.f10958a = i11;
                return hVar.q(i11);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f10958a + 1 < o.this.j.p();
        }

        public void remove() {
            if (this.f10959b) {
                o.this.j.q(this.f10958a).u((o) null);
                o.this.j.o(this.f10958a);
                this.f10958a--;
                this.f10959b = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    public o(w<? extends o> wVar) {
        super((w<? extends m>) wVar);
    }

    public final void B(m mVar) {
        if (mVar.l() != 0) {
            m i11 = this.j.i(mVar.l());
            if (i11 != mVar) {
                if (mVar.o() == null) {
                    if (i11 != null) {
                        i11.u((o) null);
                    }
                    mVar.u(this);
                    this.j.n(mVar.l(), mVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            return;
        }
        throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
    }

    public final m D(int i11) {
        return E(i11, true);
    }

    /* access modifiers changed from: package-private */
    public final m E(int i11, boolean z11) {
        m i12 = this.j.i(i11);
        if (i12 != null) {
            return i12;
        }
        if (!z11 || o() == null) {
            return null;
        }
        return o().D(i11);
    }

    /* access modifiers changed from: package-private */
    public String F() {
        if (this.f10957l == null) {
            this.f10957l = Integer.toString(this.k);
        }
        return this.f10957l;
    }

    public final int G() {
        return this.k;
    }

    public final void H(int i11) {
        this.k = i11;
        this.f10957l = null;
    }

    public String i() {
        return l() != 0 ? super.i() : "the root navigation";
    }

    public final Iterator<m> iterator() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    public m.a p(l lVar) {
        m.a p11 = super.p(lVar);
        Iterator<m> it2 = iterator();
        while (it2.hasNext()) {
            m.a p12 = it2.next().p(lVar);
            if (p12 != null && (p11 == null || p12.compareTo(p11) > 0)) {
                p11 = p12;
            }
        }
        return p11;
    }

    public void q(Context context, AttributeSet attributeSet) {
        super.q(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.NavGraphNavigator);
        H(obtainAttributes.getResourceId(R.styleable.NavGraphNavigator_startDestination, 0));
        this.f10957l = m.k(context, this.k);
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" startDestination=");
        m D = D(G());
        if (D == null) {
            String str = this.f10957l;
            if (str == null) {
                sb2.append("0x");
                sb2.append(Integer.toHexString(this.k));
            } else {
                sb2.append(str);
            }
        } else {
            sb2.append("{");
            sb2.append(D.toString());
            sb2.append("}");
        }
        return sb2.toString();
    }
}
