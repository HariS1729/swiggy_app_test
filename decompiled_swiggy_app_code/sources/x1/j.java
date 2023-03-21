package x1;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import kotlin.jvm.internal.p;

/* compiled from: AndroidAccessibilitySpannableString.android.kt */
final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f17666a = new j();

    private j() {
    }

    public final TypefaceSpan a(Typeface typeface) {
        p.j(typeface, "typeface");
        return new TypefaceSpan(typeface);
    }
}
