package tf0;

import android.content.Context;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;
import vf0.b;
import vf0.c;

/* compiled from: BasePreCacheAssetHandler.kt */
public abstract class a<T extends c, R> implements c {
    public void a(Context context, b bVar) {
        p.j(context, LogCategory.CONTEXT);
        p.j(bVar, "request");
        if (c(bVar.a())) {
            b(context, d(bVar.a()));
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b(Context context, R r11);

    /* access modifiers changed from: protected */
    public abstract boolean c(c cVar);

    /* access modifiers changed from: protected */
    public abstract R d(T t);
}
