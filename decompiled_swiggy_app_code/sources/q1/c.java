package q1;

import android.text.Layout;
import kotlin.jvm.internal.p;

/* compiled from: LayoutCompat.kt */
public final class c {
    public static final int a(Layout layout, int i11, boolean z11) {
        p.j(layout, "<this>");
        if (i11 <= 0) {
            return 0;
        }
        if (i11 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i11);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i11 || lineEnd == i11) {
            return lineStart == i11 ? z11 ? lineForOffset - 1 : lineForOffset : z11 ? lineForOffset : lineForOffset + 1;
        }
        return lineForOffset;
    }
}
