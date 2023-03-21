package u1;

import android.content.Context;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter;
import androidx.compose.ui.text.font.TypefaceRequestCache;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;
import u1.i;

/* compiled from: FontFamilyResolver.android.kt */
public final class m {
    public static final i.b a(Context context) {
        p.j(context, LogCategory.CONTEXT);
        return new FontFamilyResolverImpl(new b(context), d.a(context), (TypefaceRequestCache) null, (FontListFontFamilyTypefaceAdapter) null, (z) null, 28, (kotlin.jvm.internal.i) null);
    }
}
