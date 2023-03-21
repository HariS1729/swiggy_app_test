package in.swiggy.android.swiggylynx.plugin.cart.getcart.response;

import fq0.d;
import gq0.a1;
import gq0.x0;
import in.swiggy.android.tejas.oldapi.models.menu.Addon;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CartAddon.kt */
public final class CartAddon {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private String f19027a;

    /* renamed from: b  reason: collision with root package name */
    private String f19028b;

    /* renamed from: c  reason: collision with root package name */
    private double f19029c;

    /* renamed from: d  reason: collision with root package name */
    private String f19030d;

    /* compiled from: CartAddon.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CartAddon> serializer() {
            return CartAddon$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CartAddon(int i11, String str, String str2, double d11, String str3, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19027a = str;
            if ((i11 & 2) == 0) {
                this.f19028b = null;
            } else {
                this.f19028b = str2;
            }
            if ((i11 & 4) == 0) {
                this.f19029c = 0.0d;
            } else {
                this.f19029c = d11;
            }
            if ((i11 & 8) == 0) {
                this.f19030d = null;
            } else {
                this.f19030d = str3;
            }
        } else {
            throw new MissingFieldException("group_id");
        }
    }

    public static final void c(CartAddon cartAddon, d dVar, SerialDescriptor serialDescriptor) {
        boolean z11;
        p.j(cartAddon, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z12 = false;
        dVar.n(serialDescriptor, 0, cartAddon.f19027a);
        if (dVar.o(serialDescriptor, 1) || cartAddon.f19028b != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, cartAddon.f19028b);
        }
        if (!dVar.o(serialDescriptor, 2) && p.e(Double.valueOf(cartAddon.f19029c), Double.valueOf(0.0d))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            dVar.C(serialDescriptor, 2, cartAddon.f19029c);
        }
        if (dVar.o(serialDescriptor, 3) || cartAddon.f19030d != null) {
            z12 = true;
        }
        if (z12) {
            dVar.E(serialDescriptor, 3, a1.f23069b, cartAddon.f19030d);
        }
    }

    public final Addon a() {
        Addon addon = new Addon();
        addon.mId = this.f19028b;
        addon.mName = this.f19030d;
        addon.mPrice = this.f19029c;
        return addon;
    }

    public final String b() {
        return this.f19027a;
    }

    public CartAddon(String str, String str2, double d11, String str3) {
        p.j(str, "mGroupId");
        this.f19027a = str;
        this.f19028b = str2;
        this.f19029c = d11;
        this.f19030d = str3;
    }
}
