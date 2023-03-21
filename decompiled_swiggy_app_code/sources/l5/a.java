package l5;

import android.content.Context;
import co.hyperverge.hvcamera.R;

public class a {
    public static int a(int i11) {
        if (i11 != 0) {
            return R.string.filter_none;
        }
        return R.string.filter_none;
    }

    public static String b(Context context, int i11) {
        return context.getResources().getString(a(i11));
    }
}
