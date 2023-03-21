package w;

/* compiled from: DataIndex.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f17348a;

    private /* synthetic */ a(int i11) {
        this.f17348a = i11;
    }

    public static final /* synthetic */ a a(int i11) {
        return new a(i11);
    }

    public static int b(int i11) {
        return i11;
    }

    public static boolean c(int i11, Object obj) {
        return (obj instanceof a) && i11 == ((a) obj).g();
    }

    public static final boolean d(int i11, int i12) {
        return i11 == i12;
    }

    public static int e(int i11) {
        return i11;
    }

    public static String f(int i11) {
        return "DataIndex(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f17348a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f17348a;
    }

    public int hashCode() {
        return e(this.f17348a);
    }

    public String toString() {
        return f(this.f17348a);
    }
}
