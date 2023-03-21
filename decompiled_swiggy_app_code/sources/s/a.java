package s;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;

/* compiled from: EdgeEffectCompat.kt */
final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16530a = new a();

    private a() {
    }

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        p.j(context, LogCategory.CONTEXT);
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float b(EdgeEffect edgeEffect) {
        p.j(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(EdgeEffect edgeEffect, float f11, float f12) {
        p.j(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f11, f12);
        } catch (Throwable unused) {
            edgeEffect.onPull(f11, f12);
            return 0.0f;
        }
    }
}
