package androidx.compose.foundation.text;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.text.input.TextFieldValue;
import com.newrelic.agent.android.agentdata.HexAttribute;
import d2.h;
import defpackage.v1;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import u0.u;
import v1.s;

/* compiled from: TextFieldCursor.kt */
public final class TextFieldCursorKt {

    /* renamed from: a  reason: collision with root package name */
    private static final float f4525a = h.n((float) 2);

    public static final d b(d dVar, TextFieldState textFieldState, TextFieldValue textFieldValue, s sVar, u uVar, boolean z11) {
        p.j(dVar, "<this>");
        p.j(textFieldState, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(textFieldValue, "value");
        p.j(sVar, "offsetMapping");
        p.j(uVar, "cursorBrush");
        return z11 ? ComposedModifierKt.d(dVar, (l) null, new TextFieldCursorKt$cursor$1(uVar, textFieldState, textFieldValue, sVar), 1, (Object) null) : dVar;
    }

    /* access modifiers changed from: private */
    public static final v1.g<Float> c() {
        return v1.h.d(v1.h.e(TextFieldCursorKt$cursorAnimationSpec$1.f4537a), (RepeatMode) null, 0, 6, (Object) null);
    }

    public static final float d() {
        return f4525a;
    }
}
