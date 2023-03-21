package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.requestdata;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CheckChargeStatusData.kt */
public final class CheckChargeStatusData {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19175a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19176b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19177c;

    /* compiled from: CheckChargeStatusData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CheckChargeStatusData> serializer() {
            return CheckChargeStatusData$$serializer.INSTANCE;
        }
    }

    public CheckChargeStatusData() {
        this((String) null, (String) null, (String) null, 7, (i) null);
    }

    public /* synthetic */ CheckChargeStatusData(int i11, String str, String str2, String str3, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19175a = null;
        } else {
            this.f19175a = str;
        }
        if ((i11 & 2) == 0) {
            this.f19176b = null;
        } else {
            this.f19176b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f19177c = null;
        } else {
            this.f19177c = str3;
        }
    }

    public static final void d(CheckChargeStatusData checkChargeStatusData, d dVar, SerialDescriptor serialDescriptor) {
        p.j(checkChargeStatusData, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || checkChargeStatusData.f19175a != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, checkChargeStatusData.f19175a);
        }
        if (dVar.o(serialDescriptor, 1) || checkChargeStatusData.f19176b != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, checkChargeStatusData.f19176b);
        }
        if (dVar.o(serialDescriptor, 2) || checkChargeStatusData.f19177c != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 2, a1.f23069b, checkChargeStatusData.f19177c);
        }
    }

    public final String a() {
        return this.f19176b;
    }

    public final String b() {
        return this.f19177c;
    }

    public final String c() {
        return this.f19175a;
    }

    public CheckChargeStatusData(String str, String str2, String str3) {
        this.f19175a = str;
        this.f19176b = str2;
        this.f19177c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckChargeStatusData(String str, String str2, String str3, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
