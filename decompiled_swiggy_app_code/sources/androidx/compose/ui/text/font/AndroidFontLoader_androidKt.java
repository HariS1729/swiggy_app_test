package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.content.res.h;
import fp0.c;
import kotlin.jvm.internal.p;
import u1.h0;
import wp0.u0;

/* compiled from: AndroidFontLoader.android.kt */
public final class AndroidFontLoader_androidKt {
    /* access modifiers changed from: private */
    public static final Typeface c(h0 h0Var, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.f7609a.a(context, h0Var);
        }
        Typeface g11 = h.g(context, h0Var.d());
        p.g(g11);
        p.i(g11, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return g11;
    }

    /* access modifiers changed from: private */
    public static final Object d(h0 h0Var, Context context, c<? super Typeface> cVar) {
        return wp0.h.g(u0.b(), new AndroidFontLoader_androidKt$loadAsync$2(h0Var, context, (c<? super AndroidFontLoader_androidKt$loadAsync$2>) null), cVar);
    }
}
