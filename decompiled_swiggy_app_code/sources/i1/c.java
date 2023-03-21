package i1;

import t0.l;

/* compiled from: ContentScale.kt */
public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14864a = a.f14865a;

    /* compiled from: ContentScale.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f14865a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final c f14866b = new C0131a();

        /* renamed from: c  reason: collision with root package name */
        private static final c f14867c = new e();

        /* renamed from: d  reason: collision with root package name */
        private static final c f14868d = new C0132c();

        /* renamed from: e  reason: collision with root package name */
        private static final c f14869e = new d();

        /* renamed from: f  reason: collision with root package name */
        private static final c f14870f = new f();

        /* renamed from: g  reason: collision with root package name */
        private static final f f14871g = new f(1.0f);

        /* renamed from: h  reason: collision with root package name */
        private static final c f14872h = new b();

        /* renamed from: i1.c$a$a  reason: collision with other inner class name */
        /* compiled from: ContentScale.kt */
        public static final class C0131a implements c {
            C0131a() {
            }

            public long a(long j, long j11) {
                float b11 = d.b(j, j11);
                return i0.a(b11, b11);
            }
        }

        /* compiled from: ContentScale.kt */
        public static final class b implements c {
            b() {
            }

            public long a(long j, long j11) {
                return i0.a(d.d(j, j11), d.a(j, j11));
            }
        }

        /* renamed from: i1.c$a$c  reason: collision with other inner class name */
        /* compiled from: ContentScale.kt */
        public static final class C0132c implements c {
            C0132c() {
            }

            public long a(long j, long j11) {
                float a11 = d.a(j, j11);
                return i0.a(a11, a11);
            }
        }

        /* compiled from: ContentScale.kt */
        public static final class d implements c {
            d() {
            }

            public long a(long j, long j11) {
                float d11 = d.d(j, j11);
                return i0.a(d11, d11);
            }
        }

        /* compiled from: ContentScale.kt */
        public static final class e implements c {
            e() {
            }

            public long a(long j, long j11) {
                float c11 = d.c(j, j11);
                return i0.a(c11, c11);
            }
        }

        /* compiled from: ContentScale.kt */
        public static final class f implements c {
            f() {
            }

            public long a(long j, long j11) {
                if (l.i(j) <= l.i(j11) && l.g(j) <= l.g(j11)) {
                    return i0.a(1.0f, 1.0f);
                }
                float c11 = d.c(j, j11);
                return i0.a(c11, c11);
            }
        }

        private a() {
        }

        public final c a() {
            return f14866b;
        }

        public final c b() {
            return f14872h;
        }

        public final c c() {
            return f14868d;
        }

        public final c d() {
            return f14869e;
        }

        public final c e() {
            return f14867c;
        }

        public final c f() {
            return f14870f;
        }

        public final f g() {
            return f14871g;
        }
    }

    long a(long j, long j11);
}
