package u0;

import android.graphics.Shader;
import android.os.Build;
import u0.o1;

/* compiled from: AndroidTileMode.android.kt */
public final class q {
    public static final Shader.TileMode a(int i11) {
        o1.a aVar = o1.f16850a;
        if (o1.f(i11, aVar.a())) {
            return Shader.TileMode.CLAMP;
        }
        if (o1.f(i11, aVar.d())) {
            return Shader.TileMode.REPEAT;
        }
        if (o1.f(i11, aVar.c())) {
            return Shader.TileMode.MIRROR;
        }
        if (!o1.f(i11, aVar.b())) {
            return Shader.TileMode.CLAMP;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p1.f16857a.b();
        }
        return Shader.TileMode.CLAMP;
    }
}
