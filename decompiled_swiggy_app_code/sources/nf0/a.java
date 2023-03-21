package nf0;

import bp0.h;
import java.util.Map;
import kotlin.jvm.internal.i;

/* compiled from: NetworkPreHeatService.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0235a f19778a = new C0235a((i) null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f19779b = 8;

    /* renamed from: nf0.a$a  reason: collision with other inner class name */
    /* compiled from: NetworkPreHeatService.kt */
    public static final class C0235a {
        private C0235a() {
        }

        public /* synthetic */ C0235a(i iVar) {
            this();
        }

        public final Map<String, String> a() {
            return x.i(h.a("NETWORK_PRE_HEAT_WORKER_INTERVAL_SECONDS", "43200"), h.a("NETWORK_PRE_HEAT_SHOULD_RUN_WORKER", "true"), h.a("NETWORK_PRE_HEAT_SHOULD_STOP_WORKER", "false"), h.a("NETWORK_PRE_HEAT_WORKER_START_DELAY_SECONDS", "600"));
        }
    }
}
