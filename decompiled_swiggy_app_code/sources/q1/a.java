package q1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.p;

/* compiled from: BoringLayoutFactory.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16282a = new a();

    private a() {
    }

    public final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i11, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z11, TextUtils.TruncateAt truncateAt, int i12) {
        CharSequence charSequence2 = charSequence;
        p.j(charSequence, "text");
        TextPaint textPaint2 = textPaint;
        p.j(textPaint, "paint");
        p.j(metrics, "metrics");
        p.j(alignment, "alignment");
        boolean z12 = true;
        if (i11 >= 0) {
            if (i12 < 0) {
                z12 = false;
            }
            if (!z12) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (truncateAt == null) {
                return new BoringLayout(charSequence, textPaint, i11, alignment, 1.0f, 0.0f, metrics, z11);
            } else {
                return new BoringLayout(charSequence, textPaint, i11, alignment, 1.0f, 0.0f, metrics, z11, truncateAt, i12);
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        p.j(charSequence, "text");
        p.j(textDirectionHeuristic, "textDir");
        if (!textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return BoringLayout.isBoring(charSequence, textPaint, (BoringLayout.Metrics) null);
        }
        return null;
    }
}
