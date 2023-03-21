package in.swiggy.android.swiggylynx.plugin.accessibility;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: AccessibilityEnabledResponsePayload.kt */
public final class AccessibilityEnabledResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private String f18977a;

    /* compiled from: AccessibilityEnabledResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<AccessibilityEnabledResponsePayload> serializer() {
            return AccessibilityEnabledResponsePayload$$serializer.INSTANCE;
        }
    }

    public AccessibilityEnabledResponsePayload() {
        this((String) null, 1, (i) null);
    }

    public /* synthetic */ AccessibilityEnabledResponsePayload(int i11, String str, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f18977a = "false";
        } else {
            this.f18977a = str;
        }
    }

    public static final void a(AccessibilityEnabledResponsePayload accessibilityEnabledResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(accessibilityEnabledResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && p.e(accessibilityEnabledResponsePayload.f18977a, "false")) {
            z11 = false;
        }
        if (z11) {
            dVar.n(serialDescriptor, 0, accessibilityEnabledResponsePayload.f18977a);
        }
    }

    public AccessibilityEnabledResponsePayload(String str) {
        p.j(str, "isAccessibilityEnabled");
        this.f18977a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccessibilityEnabledResponsePayload(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? "false" : str);
    }
}
