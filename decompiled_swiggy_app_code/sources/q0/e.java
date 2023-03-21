package q0;

import android.view.ViewStructure;
import kotlin.jvm.internal.p;

/* compiled from: AndroidAutofill.android.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f16273a = new e();

    private e() {
    }

    public final int a(ViewStructure viewStructure, int i11) {
        p.j(viewStructure, "structure");
        return viewStructure.addChildCount(i11);
    }

    public final ViewStructure b(ViewStructure viewStructure, int i11) {
        p.j(viewStructure, "structure");
        return viewStructure.newChild(i11);
    }

    public final void c(ViewStructure viewStructure, int i11, int i12, int i13, int i14, int i15, int i16) {
        p.j(viewStructure, "structure");
        viewStructure.setDimens(i11, i12, i13, i14, i15, i16);
    }

    public final void d(ViewStructure viewStructure, int i11, String str, String str2, String str3) {
        p.j(viewStructure, "structure");
        viewStructure.setId(i11, str, str2, str3);
    }
}
