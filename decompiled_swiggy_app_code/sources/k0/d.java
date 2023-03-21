package k0;

/* compiled from: ListImplementation.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f15322a = new d();

    private d() {
    }

    public static final void a(int i11, int i12) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
        }
    }

    public static final void b(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
        }
    }

    public static final void c(int i11, int i12, int i13) {
        if (i11 < 0 || i12 > i13) {
            throw new IndexOutOfBoundsException("fromIndex: " + i11 + ", toIndex: " + i12 + ", size: " + i13);
        } else if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex: " + i11 + " > toIndex: " + i12);
        }
    }
}
