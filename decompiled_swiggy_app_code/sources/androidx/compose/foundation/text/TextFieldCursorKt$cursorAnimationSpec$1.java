package androidx.compose.foundation.text;

import bp0.k;
import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: TextFieldCursor.kt */
final class TextFieldCursorKt$cursorAnimationSpec$1 extends Lambda implements l<v1.g0.b<Float>, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldCursorKt$cursorAnimationSpec$1 f4537a = new TextFieldCursorKt$cursorAnimationSpec$1();

    TextFieldCursorKt$cursorAnimationSpec$1() {
        super(1);
    }

    public final void a(v1.g0.b<Float> bVar) {
        p.j(bVar, "$this$keyframes");
        bVar.e(1000);
        Float valueOf = Float.valueOf(1.0f);
        bVar.a(valueOf, 0);
        bVar.a(valueOf, 499);
        Float valueOf2 = Float.valueOf(0.0f);
        bVar.a(valueOf2, OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
        bVar.a(valueOf2, 999);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((v1.g0.b) obj);
        return k.f22762a;
    }
}
