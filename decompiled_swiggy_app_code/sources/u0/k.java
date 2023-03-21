package u0;

import android.graphics.PathEffect;
import kotlin.jvm.internal.p;

/* compiled from: AndroidPathEffect.android.kt */
public final class k implements x0 {

    /* renamed from: b  reason: collision with root package name */
    private final PathEffect f16819b;

    public k(PathEffect pathEffect) {
        p.j(pathEffect, "nativePathEffect");
        this.f16819b = pathEffect;
    }

    public final PathEffect a() {
        return this.f16819b;
    }
}
