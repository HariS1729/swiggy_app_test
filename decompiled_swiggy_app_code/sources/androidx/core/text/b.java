package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;

@SuppressLint({"InlinedApi"})
/* compiled from: HtmlCompat */
public final class b {

    /* compiled from: HtmlCompat */
    static class a {
        static Spanned a(String str, int i11) {
            return Html.fromHtml(str, i11);
        }

        static Spanned b(String str, int i11, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i11, imageGetter, tagHandler);
        }

        static String c(Spanned spanned, int i11) {
            return Html.toHtml(spanned, i11);
        }
    }

    public static Spanned a(String str, int i11) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(str, i11);
        }
        return Html.fromHtml(str);
    }

    public static String b(Spanned spanned, int i11) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.c(spanned, i11);
        }
        return Html.toHtml(spanned);
    }
}
