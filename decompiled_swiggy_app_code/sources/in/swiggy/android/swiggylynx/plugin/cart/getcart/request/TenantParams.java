package in.swiggy.android.swiggylynx.plugin.cart.getcart.request;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: TenantParams.kt */
public final class TenantParams {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f19023a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19024b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19025c;

    /* compiled from: TenantParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<TenantParams> serializer() {
            return TenantParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TenantParams(int i11, int i12, String str, String str2, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19023a = i12;
            if ((i11 & 2) != 0) {
                this.f19024b = str;
                if ((i11 & 4) != 0) {
                    this.f19025c = str2;
                    return;
                }
                throw new MissingFieldException("marketplaceBusinessline");
            }
            throw new MissingFieldException("marketplaceCategory");
        }
        throw new MissingFieldException("marketplaceId");
    }

    public static final void a(TenantParams tenantParams, d dVar, SerialDescriptor serialDescriptor) {
        p.j(tenantParams, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.l(serialDescriptor, 0, tenantParams.f19023a);
        dVar.n(serialDescriptor, 1, tenantParams.f19024b);
        dVar.n(serialDescriptor, 2, tenantParams.f19025c);
    }
}
