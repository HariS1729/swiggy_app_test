package m1;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e0.g;
import java.util.Arrays;
import kotlin.jvm.internal.p;

/* compiled from: StringResources.android.kt */
public final class f {
    private static final Resources a(g gVar, int i11) {
        gVar.z(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) gVar.z(AndroidCompositionLocals_androidKt.g())).getResources();
        p.i(resources, "LocalContext.current.resources");
        return resources;
    }

    public static final String b(int i11, g gVar, int i12) {
        String string = a(gVar, 0).getString(i11);
        p.i(string, "resources.getString(id)");
        return string;
    }

    public static final String c(int i11, Object[] objArr, g gVar, int i12) {
        p.j(objArr, "formatArgs");
        String string = a(gVar, 0).getString(i11, Arrays.copyOf(objArr, objArr.length));
        p.i(string, "resources.getString(id, *formatArgs)");
        return string;
    }
}
