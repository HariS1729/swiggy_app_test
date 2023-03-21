package a0;

import java.text.BreakIterator;
import kotlin.jvm.internal.p;

/* compiled from: StringHelpers.android.kt */
public final class l {
    public static final int a(String str, int i11) {
        p.j(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i11);
    }

    public static final int b(String str, int i11) {
        p.j(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i11);
    }
}
