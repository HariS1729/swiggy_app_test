package p4;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Either.kt */
public abstract class a<A, B> implements o4.a<o4.a<Object, ? extends A>, B> {

    /* renamed from: a  reason: collision with root package name */
    public static final C0165a f16234a = new C0165a((i) null);

    /* renamed from: p4.a$a  reason: collision with other inner class name */
    /* compiled from: Either.kt */
    public static final class C0165a {
        private C0165a() {
        }

        public final <R> a a(R r11) {
            return new c(r11);
        }

        public /* synthetic */ C0165a(i iVar) {
            this();
        }
    }

    /* compiled from: Either.kt */
    public static final class b<A> extends a {

        /* renamed from: c  reason: collision with root package name */
        public static final C0166a f16235c = new C0166a((i) null);

        /* renamed from: b  reason: collision with root package name */
        private final A f16236b;

        /* renamed from: p4.a$b$a  reason: collision with other inner class name */
        /* compiled from: Either.kt */
        public static final class C0166a {
            private C0166a() {
            }

            public /* synthetic */ C0166a(i iVar) {
                this();
            }
        }

        public b(A a11) {
            super((i) null);
            this.f16236b = a11;
        }

        public final A a() {
            return this.f16236b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && p.e(this.f16236b, ((b) obj).f16236b);
            }
            return true;
        }

        public int hashCode() {
            A a11 = this.f16236b;
            if (a11 != null) {
                return a11.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Left(a=" + this.f16236b + ")";
        }
    }

    /* compiled from: Either.kt */
    public static final class c<B> extends a {

        /* renamed from: c  reason: collision with root package name */
        public static final C0167a f16237c = new C0167a((i) null);

        /* renamed from: b  reason: collision with root package name */
        private final B f16238b;

        /* renamed from: p4.a$c$a  reason: collision with other inner class name */
        /* compiled from: Either.kt */
        public static final class C0167a {
            private C0167a() {
            }

            public /* synthetic */ C0167a(i iVar) {
                this();
            }
        }

        public c(B b11) {
            super((i) null);
            this.f16238b = b11;
        }

        public final B a() {
            return this.f16238b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && p.e(this.f16238b, ((c) obj).f16238b);
            }
            return true;
        }

        public int hashCode() {
            B b11 = this.f16238b;
            if (b11 != null) {
                return b11.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Right(b=" + this.f16238b + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(i iVar) {
        this();
    }
}
