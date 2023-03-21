package y6;

import kotlin.jvm.internal.i;

/* compiled from: Dimension.kt */
public abstract class c {

    /* compiled from: Dimension.kt */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final int f18024a;

        public a(int i11) {
            super((i) null);
            this.f18024a = i11;
            if (!(i11 > 0)) {
                throw new IllegalArgumentException("px must be > 0.".toString());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f18024a == ((a) obj).f18024a;
        }

        public int hashCode() {
            return this.f18024a;
        }

        public String toString() {
            return String.valueOf(this.f18024a);
        }
    }

    /* compiled from: Dimension.kt */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f18025a = new b();

        private b() {
            super((i) null);
        }

        public String toString() {
            return "Dimension.Undefined";
        }
    }

    private c() {
    }

    public /* synthetic */ c(i iVar) {
        this();
    }
}
