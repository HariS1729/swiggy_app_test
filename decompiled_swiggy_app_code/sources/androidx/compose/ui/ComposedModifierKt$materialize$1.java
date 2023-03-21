package androidx.compose.ui;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import s0.c;

/* compiled from: ComposedModifier.kt */
final class ComposedModifierKt$materialize$1 extends Lambda implements l<d.b, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposedModifierKt$materialize$1 f6319a = new ComposedModifierKt$materialize$1();

    ComposedModifierKt$materialize$1() {
        super(1);
    }

    /* renamed from: a */
    public final Boolean invoke(d.b bVar) {
        p.j(bVar, "it");
        return Boolean.valueOf(!(bVar instanceof a) && !(bVar instanceof c) && !(bVar instanceof s0.p));
    }
}
