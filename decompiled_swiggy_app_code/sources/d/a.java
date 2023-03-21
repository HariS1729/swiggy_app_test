package d;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ContextAwareHelper */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f13797a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f13798b;

    public void a(b bVar) {
        if (this.f13798b != null) {
            bVar.a(this.f13798b);
        }
        this.f13797a.add(bVar);
    }

    public void b() {
        this.f13798b = null;
    }

    public void c(Context context) {
        this.f13798b = context;
        for (b a11 : this.f13797a) {
            a11.a(context);
        }
    }

    public Context d() {
        return this.f13798b;
    }

    public void e(b bVar) {
        this.f13797a.remove(bVar);
    }
}
