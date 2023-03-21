package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick;

import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.x0;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: OneClickEligibilityRequestPayload.kt */
public final class OneClickEligibilityRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19211a;

    /* renamed from: b  reason: collision with root package name */
    private final List<CardDetail> f19212b;

    /* compiled from: OneClickEligibilityRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<OneClickEligibilityRequestPayload> serializer() {
            return OneClickEligibilityRequestPayload$$serializer.INSTANCE;
        }
    }

    public OneClickEligibilityRequestPayload() {
        this((String) null, (List) null, 3, (i) null);
    }

    public /* synthetic */ OneClickEligibilityRequestPayload(int i11, String str, List list, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) == 0) {
            this.f19211a = null;
        } else {
            this.f19211a = str;
        }
        if ((i11 & 2) == 0) {
            this.f19212b = null;
        } else {
            this.f19212b = list;
        }
    }

    public static final void d(OneClickEligibilityRequestPayload oneClickEligibilityRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(oneClickEligibilityRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || oneClickEligibilityRequestPayload.f19211a != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, oneClickEligibilityRequestPayload.f19211a);
        }
        if (dVar.o(serialDescriptor, 1) || oneClickEligibilityRequestPayload.f19212b != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, new f(CardDetail$$serializer.INSTANCE), oneClickEligibilityRequestPayload.f19212b);
        }
    }

    public final String b() {
        return this.f19211a;
    }

    public final List<CardDetail> c() {
        return this.f19212b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OneClickEligibilityRequestPayload(String str, List list, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list);
    }

    public OneClickEligibilityRequestPayload(String str, List<CardDetail> list) {
        this.f19211a = str;
        this.f19212b = list;
    }
}
