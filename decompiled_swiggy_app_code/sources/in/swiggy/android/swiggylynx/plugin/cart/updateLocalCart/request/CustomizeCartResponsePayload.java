package in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request;

import fq0.d;
import gq0.f;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.response.CartAddon$$serializer;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.response.GroupVariation2;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.response.GroupVariation2$$serializer;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CustomizeCartResponsePayload.kt */
public final class CustomizeCartResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private List<GroupVariation2> f19070a;

    /* renamed from: b  reason: collision with root package name */
    private List<CartAddon> f19071b;

    /* compiled from: CustomizeCartResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CustomizeCartResponsePayload> serializer() {
            return CustomizeCartResponsePayload$$serializer.INSTANCE;
        }
    }

    public CustomizeCartResponsePayload() {
        this((List) null, (List) null, 3, (i) null);
    }

    public /* synthetic */ CustomizeCartResponsePayload(int i11, List list, List list2, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19070a = null;
        } else {
            this.f19070a = list;
        }
        if ((i11 & 2) == 0) {
            this.f19071b = null;
        } else {
            this.f19071b = list2;
        }
    }

    public static final void c(CustomizeCartResponsePayload customizeCartResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(customizeCartResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || customizeCartResponsePayload.f19070a != null) {
            dVar.E(serialDescriptor, 0, new f(GroupVariation2$$serializer.INSTANCE), customizeCartResponsePayload.f19070a);
        }
        if (dVar.o(serialDescriptor, 1) || customizeCartResponsePayload.f19071b != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, new f(CartAddon$$serializer.INSTANCE), customizeCartResponsePayload.f19071b);
        }
    }

    public final void a(List<CartAddon> list) {
        this.f19071b = list;
    }

    public final void b(List<GroupVariation2> list) {
        this.f19070a = list;
    }

    public CustomizeCartResponsePayload(List<GroupVariation2> list, List<CartAddon> list2) {
        this.f19070a = list;
        this.f19071b = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomizeCartResponsePayload(List list, List list2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2);
    }
}
