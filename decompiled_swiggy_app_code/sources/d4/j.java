package d4;

import android.annotation.SuppressLint;

/* compiled from: Operation */
public interface j {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f14135a = new b.c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0117b f14136b = new b.C0117b();

    /* compiled from: Operation */
    public static abstract class b {

        /* compiled from: Operation */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f14137a;

            public a(Throwable th2) {
                this.f14137a = th2;
            }

            public Throwable a() {
                return this.f14137a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f14137a.getMessage()});
            }
        }

        /* renamed from: d4.j$b$b  reason: collision with other inner class name */
        /* compiled from: Operation */
        public static final class C0117b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0117b() {
            }
        }

        /* compiled from: Operation */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    com.google.common.util.concurrent.b<b.c> a();
}
