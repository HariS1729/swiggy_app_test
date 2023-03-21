package q1;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.p;

/* compiled from: StaticLayoutFactory.kt */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f16330a = new m();

    /* renamed from: b  reason: collision with root package name */
    private static final n f16331b;

    static {
        n nVar;
        if (Build.VERSION.SDK_INT >= 23) {
            nVar = new j();
        } else {
            nVar = new o();
        }
        f16331b = nVar;
    }

    private m() {
    }

    public final StaticLayout a(CharSequence charSequence, int i11, int i12, TextPaint textPaint, int i13, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i14, TextUtils.TruncateAt truncateAt, int i15, float f11, float f12, int i16, boolean z11, boolean z12, int i17, int i18, int[] iArr, int[] iArr2) {
        CharSequence charSequence2 = charSequence;
        p.j(charSequence2, "text");
        p.j(textPaint, "paint");
        p.j(textDirectionHeuristic, "textDir");
        p.j(alignment, "alignment");
        p pVar = r0;
        n nVar = f16331b;
        p pVar2 = new p(charSequence2, i11, i12, textPaint, i13, textDirectionHeuristic, alignment, i14, truncateAt, i15, f11, f12, i16, z11, z12, i17, i18, iArr, iArr2);
        return nVar.a(pVar);
    }
}
