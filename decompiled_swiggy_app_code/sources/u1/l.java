package u1;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.TypefaceRequestCache;

/* compiled from: FontFamilyResolver.kt */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final TypefaceRequestCache f16923a = new TypefaceRequestCache();

    /* renamed from: b  reason: collision with root package name */
    private static final AsyncTypefaceCache f16924b = new AsyncTypefaceCache();

    public static final AsyncTypefaceCache a() {
        return f16924b;
    }

    public static final TypefaceRequestCache b() {
        return f16923a;
    }
}
