package m1;

import android.content.Context;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;
import u0.f0;

/* compiled from: ColorResources.android.kt */
final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15592a = new a();

    private a() {
    }

    public final long a(Context context, int i11) {
        p.j(context, LogCategory.CONTEXT);
        return f0.b(context.getResources().getColor(i11, context.getTheme()));
    }
}
