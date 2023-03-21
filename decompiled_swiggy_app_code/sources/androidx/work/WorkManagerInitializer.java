package androidx.work;

import android.content.Context;
import androidx.work.a;
import d4.i;
import d4.n;
import java.util.Collections;
import java.util.List;
import v3.a;

public final class WorkManagerInitializer implements a<n> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12301a = i.f("WrkMgrInitializer");

    public List<Class<? extends a<?>>> b() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public n a(Context context) {
        i.c().a(f12301a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        n.m(context, new a.b().a());
        return n.k(context);
    }
}
