package h0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.p;

/* compiled from: BufferIterator.kt */
public final class b<T> extends a<T> {

    /* renamed from: c  reason: collision with root package name */
    private final T[] f14749c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(T[] tArr, int i11, int i12) {
        super(i11, i12);
        p.j(tArr, "buffer");
        this.f14749c = tArr;
    }

    public T next() {
        if (hasNext()) {
            T[] tArr = this.f14749c;
            int d11 = d();
            g(d11 + 1);
            return tArr[d11];
        }
        throw new NoSuchElementException();
    }

    public T previous() {
        if (hasPrevious()) {
            T[] tArr = this.f14749c;
            g(d() - 1);
            return tArr[d()];
        }
        throw new NoSuchElementException();
    }
}
