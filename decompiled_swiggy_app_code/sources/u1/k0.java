package u1;

import android.graphics.Typeface;
import kotlin.jvm.internal.p;

/* compiled from: AndroidFontUtils.android.kt */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f16922a = new k0();

    private k0() {
    }

    public final Typeface a(Typeface typeface, int i11, boolean z11) {
        p.j(typeface, "typeface");
        Typeface create = Typeface.create(typeface, i11, z11);
        p.i(create, "create(typeface, finalFontWeight, finalFontStyle)");
        return create;
    }
}
