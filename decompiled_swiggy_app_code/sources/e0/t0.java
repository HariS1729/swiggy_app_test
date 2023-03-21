package e0;

import kotlin.jvm.internal.p;

/* compiled from: Composer.kt */
public final class t0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final g f14220a;

    private /* synthetic */ t0(g gVar) {
        this.f14220a = gVar;
    }

    public static final /* synthetic */ t0 a(g gVar) {
        return new t0(gVar);
    }

    public static <T> g b(g gVar) {
        p.j(gVar, "composer");
        return gVar;
    }

    public static boolean c(g gVar, Object obj) {
        return (obj instanceof t0) && p.e(gVar, ((t0) obj).f());
    }

    public static int d(g gVar) {
        return gVar.hashCode();
    }

    public static String e(g gVar) {
        return "SkippableUpdater(composer=" + gVar + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f14220a, obj);
    }

    public final /* synthetic */ g f() {
        return this.f14220a;
    }

    public int hashCode() {
        return d(this.f14220a);
    }

    public String toString() {
        return e(this.f14220a);
    }
}
