package q1;

import android.text.Spanned;
import kotlin.jvm.internal.p;

/* compiled from: SpannedExtensions.kt */
public final class i {
    public static final boolean a(Spanned spanned, Class<?> cls) {
        p.j(spanned, "<this>");
        p.j(cls, "clazz");
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean b(Spanned spanned, Class<?> cls, int i11, int i12) {
        p.j(spanned, "<this>");
        p.j(cls, "clazz");
        return spanned.nextSpanTransition(i11 - 1, i12, cls) != i12;
    }
}
