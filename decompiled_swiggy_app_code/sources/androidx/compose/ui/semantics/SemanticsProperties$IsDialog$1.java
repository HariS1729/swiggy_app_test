package androidx.compose.ui.semantics;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: SemanticsProperties.kt */
final class SemanticsProperties$IsDialog$1 extends Lambda implements p<k, k, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final SemanticsProperties$IsDialog$1 f7450a = new SemanticsProperties$IsDialog$1();

    SemanticsProperties$IsDialog$1() {
        super(2);
    }

    /* renamed from: a */
    public final k invoke(k kVar, k kVar2) {
        kotlin.jvm.internal.p.j(kVar2, "<anonymous parameter 1>");
        throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
    }
}
