package n0;

/* compiled from: SnapshotStateList.kt */
public final class m {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Object f15741a = new Object();

    /* access modifiers changed from: private */
    public static final Void d() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    /* access modifiers changed from: private */
    public static final void e(int i11, int i12) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < i12) {
            z11 = true;
        }
        if (!z11) {
            throw new IndexOutOfBoundsException("index (" + i11 + ") is out of bound of [0, " + i12 + ')');
        }
    }
}
