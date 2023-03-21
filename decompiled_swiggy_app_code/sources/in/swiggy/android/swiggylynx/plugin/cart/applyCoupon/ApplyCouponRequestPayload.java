package in.swiggy.android.swiggylynx.plugin.cart.applyCoupon;

import fq0.d;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.request.TenantParams;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.request.TenantParams$$serializer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: ApplyCouponRequestPayload.kt */
public final class ApplyCouponRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final TenantParams f19018a;

    /* renamed from: b  reason: collision with root package name */
    private final double f19019b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19020c;

    /* compiled from: ApplyCouponRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<ApplyCouponRequestPayload> serializer() {
            return ApplyCouponRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApplyCouponRequestPayload(int i11, TenantParams tenantParams, double d11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19018a = tenantParams;
            if ((i11 & 2) != 0) {
                this.f19019b = d11;
                if ((i11 & 4) != 0) {
                    this.f19020c = str;
                    return;
                }
                throw new MissingFieldException("restaurantId");
            }
            throw new MissingFieldException("cart_total_shown_to_coupon");
        }
        throw new MissingFieldException("tenant");
    }

    public static final void d(ApplyCouponRequestPayload applyCouponRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(applyCouponRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, TenantParams$$serializer.INSTANCE, applyCouponRequestPayload.f19018a);
        dVar.C(serialDescriptor, 1, applyCouponRequestPayload.f19019b);
        dVar.n(serialDescriptor, 2, applyCouponRequestPayload.f19020c);
    }

    public final double b() {
        return this.f19019b;
    }

    public final String c() {
        return this.f19020c;
    }
}
