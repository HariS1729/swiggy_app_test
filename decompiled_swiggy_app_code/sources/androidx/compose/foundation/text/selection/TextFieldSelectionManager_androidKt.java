package androidx.compose.foundation.text.selection;

import android.annotation.SuppressLint;
import androidx.compose.ui.ComposedModifierKt;
import f1.n;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import s.j;

/* compiled from: TextFieldSelectionManager.android.kt */
public final class TextFieldSelectionManager_androidKt {
    public static final boolean a(n nVar) {
        p.j(nVar, "<this>");
        return false;
    }

    @SuppressLint({"ModifierInspectorInfo"})
    public static final d b(d dVar, TextFieldSelectionManager textFieldSelectionManager) {
        p.j(dVar, "<this>");
        p.j(textFieldSelectionManager, "manager");
        if (!j.f16539g.b().i()) {
            return dVar;
        }
        return ComposedModifierKt.d(dVar, (l) null, new TextFieldSelectionManager_androidKt$textFieldMagnifier$1(textFieldSelectionManager), 1, (Object) null);
    }
}
