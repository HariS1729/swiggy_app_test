package x;

import bp0.k;
import lp0.l;

/* compiled from: IntervalList.kt */
public interface b<T> {

    /* compiled from: IntervalList.kt */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f17629a;

        /* renamed from: b  reason: collision with root package name */
        private final int f17630b;

        /* renamed from: c  reason: collision with root package name */
        private final T f17631c;

        public a(int i11, int i12, T t) {
            this.f17629a = i11;
            this.f17630b = i12;
            this.f17631c = t;
            boolean z11 = true;
            if (i11 >= 0) {
                if (!(i12 <= 0 ? false : z11)) {
                    throw new IllegalArgumentException(("size should be >0, but was " + i12).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i11).toString());
        }

        public final int a() {
            return this.f17630b;
        }

        public final int b() {
            return this.f17629a;
        }

        public final T c() {
            return this.f17631c;
        }
    }

    int a();

    void b(int i11, int i12, l<? super a<T>, k> lVar);

    a<T> get(int i11);
}
