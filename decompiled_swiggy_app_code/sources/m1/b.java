package m1;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e0.g;
import u0.f0;

/* compiled from: ColorResources.android.kt */
public final class b {
    public static final long a(int i11, g gVar, int i12) {
        Context context = (Context) gVar.z(AndroidCompositionLocals_androidKt.g());
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f15592a.a(context, i11);
        }
        return f0.b(context.getResources().getColor(i11));
    }
}
