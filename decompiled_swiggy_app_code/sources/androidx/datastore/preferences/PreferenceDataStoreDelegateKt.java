package androidx.datastore.preferences;

import android.content.Context;
import b3.a;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;
import op0.d;
import wp0.e2;
import wp0.j0;
import wp0.k0;
import wp0.k1;
import wp0.u0;
import y2.c;
import z2.b;

/* compiled from: PreferenceDataStoreDelegate.kt */
public final class PreferenceDataStoreDelegateKt {
    public static final d<Context, c<a>> a(String str, b<a> bVar, l<? super Context, ? extends List<? extends y2.b<a>>> lVar, j0 j0Var) {
        p.j(str, "name");
        p.j(lVar, "produceMigrations");
        p.j(j0Var, "scope");
        return new PreferenceDataStoreSingletonDelegate(str, bVar, lVar, j0Var);
    }

    public static /* synthetic */ d b(String str, b bVar, l lVar, j0 j0Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bVar = null;
        }
        if ((i11 & 4) != 0) {
            lVar = PreferenceDataStoreDelegateKt$preferencesDataStore$1.f9876a;
        }
        if ((i11 & 8) != 0) {
            u0 u0Var = u0.f29495a;
            j0Var = k0.a(u0.b().plus(e2.b((k1) null, 1, (Object) null)));
        }
        return a(str, bVar, lVar, j0Var);
    }
}
