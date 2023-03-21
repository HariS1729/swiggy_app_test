package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.responsedata;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: AmazonPayAvailableResponsePayload.kt */
public final class AmazonPayAvailableResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19186a;

    /* compiled from: AmazonPayAvailableResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<AmazonPayAvailableResponsePayload> serializer() {
            return AmazonPayAvailableResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AmazonPayAvailableResponsePayload(int i11, boolean z11, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19186a = z11;
            return;
        }
        throw new MissingFieldException("isAmazonSdkAvailable");
    }

    public static final void a(AmazonPayAvailableResponsePayload amazonPayAvailableResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(amazonPayAvailableResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.m(serialDescriptor, 0, amazonPayAvailableResponsePayload.f19186a);
    }

    public AmazonPayAvailableResponsePayload(boolean z11) {
        this.f19186a = z11;
    }
}
