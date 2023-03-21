package androidx.compose.foundation.text;

import a0.w;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import v1.s;

/* compiled from: TextFieldKeyInput.kt */
public final class TextFieldKeyInputKt {
    public static final d a(d dVar, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, l<? super TextFieldValue, k> lVar, boolean z11, boolean z12, s sVar, w wVar) {
        d dVar2 = dVar;
        p.j(dVar, "<this>");
        p.j(textFieldState, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(textFieldSelectionManager, "manager");
        p.j(textFieldValue, "value");
        p.j(lVar, "onValueChange");
        s sVar2 = sVar;
        p.j(sVar2, "offsetMapping");
        w wVar2 = wVar;
        p.j(wVar2, "undoManager");
        return ComposedModifierKt.d(dVar, (l) null, new TextFieldKeyInputKt$textFieldKeyInput$2(textFieldState, textFieldSelectionManager, textFieldValue, z11, z12, sVar2, wVar2, lVar), 1, (Object) null);
    }
}
