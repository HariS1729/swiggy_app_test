package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.closeWebViewWithParams;

import fq0.d;
import gq0.a1;
import gq0.x0;
import gq0.z;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: CloseWebViewWithParamsRequestPayload.kt */
public final class CloseWebViewWithParamsRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f19408a;

    /* compiled from: CloseWebViewWithParamsRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CloseWebViewWithParamsRequestPayload> serializer() {
            return CloseWebViewWithParamsRequestPayload$$serializer.INSTANCE;
        }
    }

    public CloseWebViewWithParamsRequestPayload() {
        this((Map) null, 1, (i) null);
    }

    public /* synthetic */ CloseWebViewWithParamsRequestPayload(int i11, Map map, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) == 0) {
            this.f19408a = new HashMap();
        } else {
            this.f19408a = map;
        }
    }

    public static final void c(CloseWebViewWithParamsRequestPayload closeWebViewWithParamsRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(closeWebViewWithParamsRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && p.e(closeWebViewWithParamsRequestPayload.f19408a, new HashMap())) {
            z11 = false;
        }
        if (z11) {
            a1 a1Var = a1.f23069b;
            dVar.v(serialDescriptor, 0, new z(a1Var, a1Var), closeWebViewWithParamsRequestPayload.f19408a);
        }
    }

    public final Map<String, String> b() {
        return this.f19408a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CloseWebViewWithParamsRequestPayload(Map map, int i11, i iVar) {
        this((i11 & 1) != 0 ? new HashMap() : map);
    }

    public CloseWebViewWithParamsRequestPayload(Map<String, String> map) {
        p.j(map, "params");
        this.f19408a = map;
    }
}
