package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: TestTag.kt */
public final class TestTagKt {
    public static final d a(d dVar, String str) {
        p.j(dVar, "<this>");
        p.j(str, "tag");
        return SemanticsModifierKt.c(dVar, false, new TestTagKt$testTag$1(str), 1, (Object) null);
    }
}
