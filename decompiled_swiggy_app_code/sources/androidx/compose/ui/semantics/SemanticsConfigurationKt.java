package androidx.compose.ui.semantics;

import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.p;
import n1.j;

/* compiled from: SemanticsConfiguration.kt */
public final class SemanticsConfigurationKt {
    public static final <T> T a(j jVar, SemanticsPropertyKey<T> semanticsPropertyKey) {
        p.j(jVar, "<this>");
        p.j(semanticsPropertyKey, HttpRequest.HEADER_KEY);
        return jVar.i(semanticsPropertyKey, SemanticsConfigurationKt$getOrNull$1.f7410a);
    }
}
