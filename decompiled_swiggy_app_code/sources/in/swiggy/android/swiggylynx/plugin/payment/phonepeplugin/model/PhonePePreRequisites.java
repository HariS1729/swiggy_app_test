package in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model;

import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: PhonePePreRequisites.kt */
public final class PhonePePreRequisites {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private String f19316a;

    /* renamed from: b  reason: collision with root package name */
    private String f19317b;

    /* renamed from: c  reason: collision with root package name */
    private String f19318c;

    /* renamed from: d  reason: collision with root package name */
    private String f19319d;

    /* renamed from: e  reason: collision with root package name */
    private String f19320e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f19321f;

    /* renamed from: g  reason: collision with root package name */
    private String f19322g;

    /* compiled from: PhonePePreRequisites.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<PhonePePreRequisites> serializer() {
            return PhonePePreRequisites$$serializer.INSTANCE;
        }
    }

    public PhonePePreRequisites() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, 127, (i) null);
    }

    public /* synthetic */ PhonePePreRequisites(int i11, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19316a = null;
        } else {
            this.f19316a = str;
        }
        if ((i11 & 2) == 0) {
            this.f19317b = null;
        } else {
            this.f19317b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f19318c = null;
        } else {
            this.f19318c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f19319d = null;
        } else {
            this.f19319d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f19320e = null;
        } else {
            this.f19320e = str5;
        }
        if ((i11 & 32) == 0) {
            this.f19321f = Boolean.FALSE;
        } else {
            this.f19321f = bool;
        }
        if ((i11 & 64) == 0) {
            this.f19322g = null;
        } else {
            this.f19322g = str6;
        }
    }

    public static final void g(PhonePePreRequisites phonePePreRequisites, d dVar, SerialDescriptor serialDescriptor) {
        boolean z11;
        p.j(phonePePreRequisites, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z12 = false;
        if (dVar.o(serialDescriptor, 0) || phonePePreRequisites.f19316a != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, phonePePreRequisites.f19316a);
        }
        if (dVar.o(serialDescriptor, 1) || phonePePreRequisites.f19317b != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, phonePePreRequisites.f19317b);
        }
        if (dVar.o(serialDescriptor, 2) || phonePePreRequisites.f19318c != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, phonePePreRequisites.f19318c);
        }
        if (dVar.o(serialDescriptor, 3) || phonePePreRequisites.f19319d != null) {
            dVar.E(serialDescriptor, 3, a1.f23069b, phonePePreRequisites.f19319d);
        }
        if (dVar.o(serialDescriptor, 4) || phonePePreRequisites.f19320e != null) {
            dVar.E(serialDescriptor, 4, a1.f23069b, phonePePreRequisites.f19320e);
        }
        if (!dVar.o(serialDescriptor, 5) && p.e(phonePePreRequisites.f19321f, Boolean.FALSE)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 5, h.f23089b, phonePePreRequisites.f19321f);
        }
        if (dVar.o(serialDescriptor, 6) || phonePePreRequisites.f19322g != null) {
            z12 = true;
        }
        if (z12) {
            dVar.E(serialDescriptor, 6, a1.f23069b, phonePePreRequisites.f19322g);
        }
    }

    public final String a() {
        return this.f19318c;
    }

    public final String b() {
        return this.f19316a;
    }

    public final String c() {
        return this.f19317b;
    }

    public final String d() {
        return this.f19322g;
    }

    public final String e() {
        return this.f19320e;
    }

    public final Boolean f() {
        return this.f19321f;
    }

    public PhonePePreRequisites(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6) {
        this.f19316a = str;
        this.f19317b = str2;
        this.f19318c = str3;
        this.f19319d = str4;
        this.f19320e = str5;
        this.f19321f = bool;
        this.f19322g = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PhonePePreRequisites(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Boolean r12, java.lang.String r13, int r14, kotlin.jvm.internal.i r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
        L_0x002a:
            r5 = r12
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model.PhonePePreRequisites.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
