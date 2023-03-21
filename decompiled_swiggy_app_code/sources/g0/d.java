package g0;

import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: ImmutableList.kt */
public interface d<E> extends List<E>, b<E>, mp0.a {

    /* compiled from: ImmutableList.kt */
    private static final class a<E> extends cp0.a<E> implements d<E> {

        /* renamed from: b  reason: collision with root package name */
        private final d<E> f14705b;

        /* renamed from: c  reason: collision with root package name */
        private final int f14706c;

        /* renamed from: d  reason: collision with root package name */
        private final int f14707d;

        /* renamed from: e  reason: collision with root package name */
        private int f14708e;

        public a(d<? extends E> dVar, int i11, int i12) {
            p.j(dVar, "source");
            this.f14705b = dVar;
            this.f14706c = i11;
            this.f14707d = i12;
            k0.d.c(i11, i12, dVar.size());
            this.f14708e = i12 - i11;
        }

        public int c() {
            return this.f14708e;
        }

        /* renamed from: d */
        public d<E> subList(int i11, int i12) {
            k0.d.c(i11, i12, this.f14708e);
            d<E> dVar = this.f14705b;
            int i13 = this.f14706c;
            return new a(dVar, i11 + i13, i13 + i12);
        }

        public E get(int i11) {
            k0.d.a(i11, this.f14708e);
            return this.f14705b.get(this.f14706c + i11);
        }
    }
}
