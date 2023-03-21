package q1;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.jvm.internal.p;
import s1.c;
import s1.d;

/* compiled from: LayoutIntrinsics.kt */
public final class f {
    public static final float c(CharSequence charSequence, TextPaint textPaint) {
        p.j(charSequence, "text");
        p.j(textPaint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new b(charSequence, 0, charSequence.length()));
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(10, e.f28027a);
        int next = lineInstance.next();
        int i11 = 0;
        while (next != -1) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.d()).intValue() - ((Number) pair.c()).intValue() < next - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(next)));
                }
            }
            int i12 = next;
            next = lineInstance.next();
            i11 = i12;
        }
        float f11 = 0.0f;
        for (Pair pair2 : priorityQueue) {
            f11 = Math.max(f11, Layout.getDesiredWidth(charSequence, ((Number) pair2.a()).intValue(), ((Number) pair2.b()).intValue(), textPaint));
        }
        return f11;
    }

    /* access modifiers changed from: private */
    public static final int d(Pair pair, Pair pair2) {
        return (((Number) pair.d()).intValue() - ((Number) pair.c()).intValue()) - (((Number) pair2.d()).intValue() - ((Number) pair2.c()).intValue());
    }

    /* access modifiers changed from: private */
    public static final boolean e(float f11, CharSequence charSequence, TextPaint textPaint) {
        if (!(f11 == 0.0f) && (charSequence instanceof Spanned)) {
            if (!(textPaint.getLetterSpacing() == 0.0f)) {
                return true;
            }
            Spanned spanned = (Spanned) charSequence;
            if (i.a(spanned, d.class) || i.a(spanned, c.class)) {
                return true;
            }
        }
        return false;
    }
}
