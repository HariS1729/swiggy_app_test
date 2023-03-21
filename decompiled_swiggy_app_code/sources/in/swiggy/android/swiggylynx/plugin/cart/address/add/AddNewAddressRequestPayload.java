package in.swiggy.android.swiggylynx.plugin.cart.address.add;

import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.x0;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.EnumSerializer;
import lp.b;

/* compiled from: AddNewAddressRequestPayload.kt */
public final class AddNewAddressRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f18991a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18992b;

    /* renamed from: c  reason: collision with root package name */
    private UserContext f18993c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f18994d;

    /* compiled from: AddNewAddressRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<AddNewAddressRequestPayload> serializer() {
            return AddNewAddressRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddNewAddressRequestPayload(int i11, String str, String str2, UserContext userContext, List list, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f18991a = str;
            if ((i11 & 2) != 0) {
                this.f18992b = str2;
                if ((i11 & 4) == 0) {
                    this.f18993c = null;
                } else {
                    this.f18993c = userContext;
                }
                if ((i11 & 8) == 0) {
                    this.f18994d = k.j();
                } else {
                    this.f18994d = list;
                }
            } else {
                throw new MissingFieldException("storeId");
            }
        } else {
            throw new MissingFieldException("type");
        }
    }

    public static final void e(AddNewAddressRequestPayload addNewAddressRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(addNewAddressRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.n(serialDescriptor, 0, addNewAddressRequestPayload.f18991a);
        dVar.n(serialDescriptor, 1, addNewAddressRequestPayload.f18992b);
        if (dVar.o(serialDescriptor, 2) || addNewAddressRequestPayload.f18993c != null) {
            dVar.E(serialDescriptor, 2, new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext", UserContext.values()), addNewAddressRequestPayload.f18993c);
        }
        if (dVar.o(serialDescriptor, 3) || !p.e(addNewAddressRequestPayload.f18994d, k.j())) {
            z11 = true;
        }
        if (z11) {
            dVar.v(serialDescriptor, 3, new f(a1.f23069b), addNewAddressRequestPayload.f18994d);
        }
    }

    public final List<String> b() {
        return this.f18994d;
    }

    public final String c() {
        return this.f18992b;
    }

    public final UserContext d() {
        return this.f18993c;
    }
}
