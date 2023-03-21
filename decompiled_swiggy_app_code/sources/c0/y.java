package c0;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.x;
import e0.g;
import kotlin.jvm.internal.p;

/* compiled from: Strings.android.kt */
public final class y {
    public static final String a(int i11, g gVar, int i12) {
        String str;
        gVar.E(-845575816);
        gVar.z(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) gVar.z(AndroidCompositionLocals_androidKt.g())).getResources();
        x.a aVar = x.f12750a;
        if (x.g(i11, aVar.e())) {
            str = resources.getString(R.string.navigation_menu);
            p.i(str, "resources.getString(R.string.navigation_menu)");
        } else if (x.g(i11, aVar.a())) {
            str = resources.getString(R.string.close_drawer);
            p.i(str, "resources.getString(R.string.close_drawer)");
        } else if (x.g(i11, aVar.b())) {
            str = resources.getString(R.string.close_sheet);
            p.i(str, "resources.getString(R.string.close_sheet)");
        } else if (x.g(i11, aVar.c())) {
            str = resources.getString(R.string.default_error_message);
            p.i(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (x.g(i11, aVar.d())) {
            str = resources.getString(R.string.dropdown_menu);
            p.i(str, "resources.getString(R.string.dropdown_menu)");
        } else {
            str = "";
        }
        gVar.P();
        return str;
    }
}
