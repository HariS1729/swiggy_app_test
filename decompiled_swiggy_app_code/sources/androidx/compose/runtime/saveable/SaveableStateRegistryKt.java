package androidx.compose.runtime.saveable;

import androidx.compose.runtime.CompositionLocalKt;
import e0.m0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.l;
import m0.b;

/* compiled from: SaveableStateRegistry.kt */
public final class SaveableStateRegistryKt {

    /* renamed from: a  reason: collision with root package name */
    private static final m0<b> f6213a = CompositionLocalKt.d(SaveableStateRegistryKt$LocalSaveableStateRegistry$1.f6214a);

    public static final b a(Map<String, ? extends List<? extends Object>> map, l<Object, Boolean> lVar) {
        p.j(lVar, "canBeSaved");
        return new a(map, lVar);
    }

    public static final m0<b> b() {
        return f6213a;
    }
}
