package androidx.datastore.preferences.core;

import b3.a;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import y2.c;

/* compiled from: PreferenceDataStoreFactory.kt */
public final class PreferenceDataStore implements c<a> {

    /* renamed from: a  reason: collision with root package name */
    private final c<a> f9889a;

    public PreferenceDataStore(c<a> cVar) {
        p.j(cVar, "delegate");
        this.f9889a = cVar;
    }

    public Object a(lp0.p<? super a, ? super fp0.c<? super a>, ? extends Object> pVar, fp0.c<? super a> cVar) {
        return this.f9889a.a(new PreferenceDataStore$updateData$2(pVar, (fp0.c<? super PreferenceDataStore$updateData$2>) null), cVar);
    }

    public d<a> getData() {
        return this.f9889a.getData();
    }
}
