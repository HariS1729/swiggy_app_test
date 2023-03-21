package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import b3.a;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;
import op0.d;
import sp0.j;
import wp0.j0;
import y2.b;
import y2.c;

/* compiled from: PreferenceDataStoreDelegate.kt */
public final class PreferenceDataStoreSingletonDelegate implements d<Context, c<a>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f9877a;

    /* renamed from: b  reason: collision with root package name */
    private final l<Context, List<b<a>>> f9878b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f9879c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f9880d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private volatile c<a> f9881e;

    public PreferenceDataStoreSingletonDelegate(String str, z2.b<a> bVar, l<? super Context, ? extends List<? extends b<a>>> lVar, j0 j0Var) {
        p.j(str, "name");
        p.j(lVar, "produceMigrations");
        p.j(j0Var, "scope");
        this.f9877a = str;
        this.f9878b = lVar;
        this.f9879c = j0Var;
    }

    /* renamed from: d */
    public c<a> a(Context context, j<?> jVar) {
        c<a> cVar;
        p.j(context, "thisRef");
        p.j(jVar, "property");
        c<a> cVar2 = this.f9881e;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (this.f9880d) {
            if (this.f9881e == null) {
                Context applicationContext = context.getApplicationContext();
                PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.f9893a;
                l<Context, List<b<a>>> lVar = this.f9878b;
                p.i(applicationContext, "applicationContext");
                this.f9881e = preferenceDataStoreFactory.a((z2.b<a>) null, lVar.invoke(applicationContext), this.f9879c, new PreferenceDataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
            }
            cVar = this.f9881e;
            p.g(cVar);
        }
        return cVar;
    }
}
