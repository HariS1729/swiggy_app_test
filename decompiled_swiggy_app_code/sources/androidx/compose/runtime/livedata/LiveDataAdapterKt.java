package androidx.compose.runtime.livedata;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.r;
import e0.a1;
import e0.d1;
import e0.g;
import e0.h0;
import e0.u;
import kotlin.jvm.internal.p;

/* compiled from: LiveDataAdapter.kt */
public final class LiveDataAdapterKt {
    public static final <T> d1<T> a(LiveData<T> liveData, g gVar, int i11) {
        p.j(liveData, "<this>");
        gVar.E(-2027640062);
        d1<T> b11 = b(liveData, liveData.f(), gVar, 8);
        gVar.P();
        return b11;
    }

    public static final <R, T extends R> d1<R> b(LiveData<T> liveData, R r11, g gVar, int i11) {
        p.j(liveData, "<this>");
        gVar.E(-2027639486);
        r rVar = (r) gVar.z(AndroidCompositionLocals_androidKt.i());
        gVar.E(-3687241);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = j.e(r11, (a1) null, 2, (Object) null);
            gVar.y(F);
        }
        gVar.P();
        h0 h0Var = (h0) F;
        u.a(liveData, rVar, new LiveDataAdapterKt$observeAsState$1(liveData, rVar, h0Var), gVar, 72);
        gVar.P();
        return h0Var;
    }
}
