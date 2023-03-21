package s;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;

/* compiled from: EdgeEffectCompat.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f16536a = new f();

    private f() {
    }

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        p.j(context, LogCategory.CONTEXT);
        if (Build.VERSION.SDK_INT >= 31) {
            return a.f16530a.a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public final float b(EdgeEffect edgeEffect) {
        p.j(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return a.f16530a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void c(EdgeEffect edgeEffect, int i11) {
        p.j(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i11);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i11);
        }
    }

    public final float d(EdgeEffect edgeEffect, float f11, float f12) {
        p.j(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return a.f16530a.c(edgeEffect, f11, f12);
        }
        edgeEffect.onPull(f11, f12);
        return f11;
    }
}
