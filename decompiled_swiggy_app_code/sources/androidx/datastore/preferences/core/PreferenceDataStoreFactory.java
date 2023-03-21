package androidx.datastore.preferences.core;

import b3.a;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.p;
import wp0.j0;
import y2.c;
import y2.d;
import z2.b;

/* compiled from: PreferenceDataStoreFactory.kt */
public final class PreferenceDataStoreFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final PreferenceDataStoreFactory f9893a = new PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    public final c<a> a(b<a> bVar, List<? extends y2.b<a>> list, j0 j0Var, lp0.a<? extends File> aVar) {
        p.j(list, "migrations");
        p.j(j0Var, "scope");
        p.j(aVar, "produceFile");
        return new PreferenceDataStore(d.f18016a.a(b3.d.f12577a, bVar, list, j0Var, new PreferenceDataStoreFactory$create$delegate$1(aVar)));
    }
}
