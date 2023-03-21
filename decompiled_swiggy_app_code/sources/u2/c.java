package u2;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import kotlin.jvm.internal.p;

/* compiled from: PoolingContainer.kt */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f16971a = new ArrayList<>();

    public final void a(b bVar) {
        p.j(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f16971a.add(bVar);
    }

    public final void b(b bVar) {
        p.j(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f16971a.remove(bVar);
    }
}
