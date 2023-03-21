package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.p;
import tp0.e;

/* compiled from: View.kt */
public final class ViewKt {
    public static final e<ViewParent> a(View view) {
        p.j(view, "<this>");
        return SequencesKt__SequencesKt.e(view.getParent(), ViewKt$ancestors$1.f9423a);
    }
}
