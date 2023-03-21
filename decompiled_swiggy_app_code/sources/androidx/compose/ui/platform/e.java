package androidx.compose.ui.platform;

import java.util.Objects;
import kotlin.jvm.internal.i;

/* compiled from: AccessibilityIterators.android.kt */
public final class e extends a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f7299c = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static e f7300d;

    /* compiled from: AccessibilityIterators.android.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final e a() {
            if (e.f7300d == null) {
                e.f7300d = new e((i) null);
            }
            e g11 = e.f7300d;
            Objects.requireNonNull(g11, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return g11;
        }
    }

    private e() {
    }

    public /* synthetic */ e(i iVar) {
        this();
    }

    private final boolean i(int i11) {
        return i11 > 0 && d().charAt(i11 + -1) != 10 && (i11 == d().length() || d().charAt(i11) == 10);
    }

    private final boolean j(int i11) {
        if (d().charAt(i11) == 10 || (i11 != 0 && d().charAt(i11 - 1) != 10)) {
            return false;
        }
        return true;
    }

    public int[] a(int i11) {
        int length = d().length();
        if (length <= 0 || i11 >= length) {
            return null;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < length && d().charAt(i11) == 10 && !j(i11)) {
            i11++;
        }
        if (i11 >= length) {
            return null;
        }
        int i12 = i11 + 1;
        while (i12 < length && !i(i12)) {
            i12++;
        }
        return c(i11, i12);
    }

    public int[] b(int i11) {
        int length = d().length();
        if (length <= 0 || i11 <= 0) {
            return null;
        }
        if (i11 > length) {
            i11 = length;
        }
        while (i11 > 0 && d().charAt(i11 - 1) == 10 && !i(i11)) {
            i11--;
        }
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        while (i12 > 0 && !j(i12)) {
            i12--;
        }
        return c(i12, i11);
    }
}
