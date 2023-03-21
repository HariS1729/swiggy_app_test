package x;

import bp0.k;
import f0.e;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.jvm.internal.p;
import lp0.l;
import x.b;

/* compiled from: IntervalList.kt */
public final class i<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e<b.a<T>> f17651a = new e<>(new b.a[16], 0);

    /* renamed from: b  reason: collision with root package name */
    private int f17652b;

    /* renamed from: c  reason: collision with root package name */
    private b.a<T> f17653c;

    private final void d(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < a()) {
            z11 = true;
        }
        if (!z11) {
            throw new IndexOutOfBoundsException("Index " + i11 + ", size " + a());
        }
    }

    private final boolean e(b.a<T> aVar, int i11) {
        return i11 < aVar.b() + aVar.a() && aVar.b() <= i11;
    }

    private final b.a<T> f(int i11) {
        b.a<T> aVar = this.f17653c;
        if (aVar != null && e(aVar, i11)) {
            return aVar;
        }
        e<b.a<T>> eVar = this.f17651a;
        b.a<T> aVar2 = (b.a) eVar.l()[c.b(eVar, i11)];
        this.f17653c = aVar2;
        return aVar2;
    }

    public int a() {
        return this.f17652b;
    }

    public void b(int i11, int i12, l<? super b.a<T>, k> lVar) {
        p.j(lVar, RenderingDetails.TYPE_BLOCK);
        d(i11);
        d(i12);
        if (i12 >= i11) {
            int a11 = c.b(this.f17651a, i11);
            int b11 = ((b.a) this.f17651a.l()[a11]).b();
            while (b11 <= i12) {
                b.a aVar = (b.a) this.f17651a.l()[a11];
                lVar.invoke(aVar);
                b11 += aVar.a();
                a11++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i12 + ") should be not smaller than fromIndex (" + i11 + ')').toString());
    }

    public final void c(int i11, T t) {
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i11).toString());
        } else if (i11 != 0) {
            b.a aVar = new b.a(a(), i11, t);
            this.f17652b = a() + i11;
            this.f17651a.b(aVar);
        }
    }

    public b.a<T> get(int i11) {
        d(i11);
        return f(i11);
    }
}
