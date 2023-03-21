package androidx.compose.ui;

import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: Modifier.kt */
final class CombinedModifier$toString$1 extends Lambda implements p<String, d.b, String> {

    /* renamed from: a  reason: collision with root package name */
    public static final CombinedModifier$toString$1 f6313a = new CombinedModifier$toString$1();

    CombinedModifier$toString$1() {
        super(2);
    }

    /* renamed from: a */
    public final String invoke(String str, d.b bVar) {
        kotlin.jvm.internal.p.j(str, "acc");
        kotlin.jvm.internal.p.j(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }
}
