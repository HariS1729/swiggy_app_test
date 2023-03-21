package q1;

import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.ui.text.android.TextLayout;
import kotlin.Pair;
import kotlin.jvm.internal.p;
import s1.f;

/* compiled from: TextLayout.kt */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Pair<Integer, Integer> f16353a = new Pair<>(0, 0);

    /* access modifiers changed from: private */
    public static final Pair<Integer, Integer> c(TextLayout textLayout) {
        int i11 = 0;
        int i12 = 0;
        for (f fVar : d(textLayout)) {
            if (fVar.b() < 0) {
                i11 = Math.max(i11, Math.abs(fVar.b()));
            }
            if (fVar.c() < 0) {
                i12 = Math.max(i11, Math.abs(fVar.c()));
            }
        }
        if (i11 == 0 && i12 == 0) {
            return f16353a;
        }
        return new Pair<>(Integer.valueOf(i11), Integer.valueOf(i12));
    }

    private static final f[] d(TextLayout textLayout) {
        if (!(textLayout.z() instanceof Spanned)) {
            return new f[0];
        }
        f[] fVarArr = (f[]) ((Spanned) textLayout.z()).getSpans(0, textLayout.z().length(), f.class);
        p.i(fVarArr, "lineHeightStyleSpans");
        return fVarArr.length == 0 ? new f[0] : fVarArr;
    }

    public static final TextDirectionHeuristic e(int i11) {
        if (i11 == 0) {
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LTR;
            p.i(textDirectionHeuristic, "LTR");
            return textDirectionHeuristic;
        } else if (i11 == 1) {
            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            p.i(textDirectionHeuristic2, "RTL");
            return textDirectionHeuristic2;
        } else if (i11 == 2) {
            TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            p.i(textDirectionHeuristic3, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic3;
        } else if (i11 == 3) {
            TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            p.i(textDirectionHeuristic4, "FIRSTSTRONG_RTL");
            return textDirectionHeuristic4;
        } else if (i11 == 4) {
            TextDirectionHeuristic textDirectionHeuristic5 = TextDirectionHeuristics.ANYRTL_LTR;
            p.i(textDirectionHeuristic5, "ANYRTL_LTR");
            return textDirectionHeuristic5;
        } else if (i11 != 5) {
            TextDirectionHeuristic textDirectionHeuristic6 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            p.i(textDirectionHeuristic6, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic6;
        } else {
            TextDirectionHeuristic textDirectionHeuristic7 = TextDirectionHeuristics.LOCALE;
            p.i(textDirectionHeuristic7, "LOCALE");
            return textDirectionHeuristic7;
        }
    }

    /* access modifiers changed from: private */
    public static final Pair<Integer, Integer> f(TextLayout textLayout) {
        int i11;
        int i12;
        if (textLayout.c() || textLayout.A()) {
            return new Pair<>(0, 0);
        }
        TextPaint paint = textLayout.d().getPaint();
        CharSequence text = textLayout.d().getText();
        p.i(paint, "paint");
        p.i(text, "text");
        Rect c11 = h.c(paint, text, textLayout.d().getLineStart(0), textLayout.d().getLineEnd(0));
        int lineAscent = textLayout.d().getLineAscent(0);
        int i13 = c11.top;
        if (i13 < lineAscent) {
            i11 = lineAscent - i13;
        } else {
            i11 = textLayout.d().getTopPadding();
        }
        if (textLayout.h() != 1) {
            int lineCount = textLayout.d().getLineCount() - 1;
            c11 = h.c(paint, text, textLayout.d().getLineStart(lineCount), textLayout.d().getLineEnd(lineCount));
        }
        int lineDescent = textLayout.d().getLineDescent(textLayout.d().getLineCount() - 1);
        int i14 = c11.bottom;
        if (i14 > lineDescent) {
            i12 = i14 - lineDescent;
        } else {
            i12 = textLayout.d().getBottomPadding();
        }
        if (i11 == 0 && i12 == 0) {
            return f16353a;
        }
        return new Pair<>(Integer.valueOf(i11), Integer.valueOf(i12));
    }
}
