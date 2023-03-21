package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import b0.f;
import b0.k;
import e0.a1;
import e0.m0;
import java.util.Map;

/* compiled from: SelectionRegistrar.kt */
public final class SelectionRegistrarKt {

    /* renamed from: a  reason: collision with root package name */
    private static final m0<k> f4729a = CompositionLocalKt.c((a1) null, SelectionRegistrarKt$LocalSelectionRegistrar$1.f4730a, 1, (Object) null);

    public static final m0<k> a() {
        return f4729a;
    }

    public static final boolean b(k kVar, long j) {
        Map<Long, f> f11;
        if (kVar == null || (f11 = kVar.f()) == null) {
            return false;
        }
        return f11.containsKey(Long.valueOf(j));
    }
}
