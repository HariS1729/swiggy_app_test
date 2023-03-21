package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;
import u1.h0;

/* compiled from: AndroidFontLoader.android.kt */
final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7609a = new a();

    private a() {
    }

    public final Typeface a(Context context, h0 h0Var) {
        p.j(context, LogCategory.CONTEXT);
        p.j(h0Var, "font");
        Typeface font = context.getResources().getFont(h0Var.d());
        p.i(font, "context.resources.getFont(font.resId)");
        return font;
    }
}
