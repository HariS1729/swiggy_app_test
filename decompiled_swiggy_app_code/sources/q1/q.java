package q1;

import android.text.Layout;
import kotlin.jvm.internal.p;

/* compiled from: TextLayout.kt */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f16350a = new q();

    /* renamed from: b  reason: collision with root package name */
    private static final Layout.Alignment f16351b;

    /* renamed from: c  reason: collision with root package name */
    private static final Layout.Alignment f16352c;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (p.e(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (p.e(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f16351b = alignment;
        f16352c = alignment2;
    }

    private q() {
    }

    public final Layout.Alignment a(int i11) {
        if (i11 == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (i11 == 1) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (i11 == 2) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (i11 == 3) {
            return f16351b;
        }
        if (i11 != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return f16352c;
    }
}
