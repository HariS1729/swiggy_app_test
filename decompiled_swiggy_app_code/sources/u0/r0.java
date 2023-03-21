package u0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.h;
import t0.j;

/* compiled from: Outline.kt */
public abstract class r0 {

    /* compiled from: Outline.kt */
    public static final class a extends r0 {

        /* renamed from: a  reason: collision with root package name */
        private final w0 f16862a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(w0 w0Var) {
            super((i) null);
            p.j(w0Var, "path");
            this.f16862a = w0Var;
        }

        public final w0 a() {
            return this.f16862a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.e(this.f16862a, ((a) obj).f16862a);
        }

        public int hashCode() {
            return this.f16862a.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    public static final class b extends r0 {

        /* renamed from: a  reason: collision with root package name */
        private final h f16863a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h hVar) {
            super((i) null);
            p.j(hVar, "rect");
            this.f16863a = hVar;
        }

        public final h a() {
            return this.f16863a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p.e(this.f16863a, ((b) obj).f16863a);
        }

        public int hashCode() {
            return this.f16863a.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    public static final class c extends r0 {

        /* renamed from: a  reason: collision with root package name */
        private final j f16864a;

        /* renamed from: b  reason: collision with root package name */
        private final w0 f16865b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(j jVar) {
            super((i) null);
            p.j(jVar, "roundRect");
            w0 w0Var = null;
            this.f16864a = jVar;
            if (!s0.f(jVar)) {
                w0Var = o.a();
                w0Var.f(jVar);
            }
            this.f16865b = w0Var;
        }

        public final j a() {
            return this.f16864a;
        }

        public final w0 b() {
            return this.f16865b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p.e(this.f16864a, ((c) obj).f16864a);
        }

        public int hashCode() {
            return this.f16864a.hashCode();
        }
    }

    private r0() {
    }

    public /* synthetic */ r0(i iVar) {
        this();
    }
}
