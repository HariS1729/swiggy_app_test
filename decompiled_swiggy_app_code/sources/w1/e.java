package w1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Locale.kt */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17446b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final g f17447a;

    /* compiled from: Locale.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final e a() {
            return new e(i.a().a().get(0));
        }
    }

    public e(g gVar) {
        p.j(gVar, "platformLocale");
        this.f17447a = gVar;
    }

    public final g a() {
        return this.f17447a;
    }

    public final String b() {
        return this.f17447a.a();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return p.e(b(), ((e) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(String str) {
        this(i.a().b(str));
        p.j(str, "languageTag");
    }
}
