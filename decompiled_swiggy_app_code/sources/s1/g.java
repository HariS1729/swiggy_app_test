package s1;

import android.graphics.Paint;
import kotlin.jvm.internal.p;

/* compiled from: LineHeightStyleSpan.kt */
public final class g {
    public static final int a(Paint.FontMetricsInt fontMetricsInt) {
        p.j(fontMetricsInt, "<this>");
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}
