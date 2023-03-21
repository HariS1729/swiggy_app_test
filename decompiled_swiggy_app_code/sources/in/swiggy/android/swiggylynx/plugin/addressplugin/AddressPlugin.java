package in.swiggy.android.swiggylynx.plugin.addressplugin;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import androidx.appcompat.app.AppCompatActivity;
import bp0.k;
import cg0.n;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import gq0.l0;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressResponsePayload;
import in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext;
import in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressDirectionsRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressResponsePayload;
import in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType;
import in.swiggy.android.tejas.feature.address.model.Address;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import lp0.p;
import lp0.q;
import mb0.n1;
import os.g0;
import tg0.a;
import zp.b;
import zp.d;

@Instrumented
/* compiled from: AddressPlugin.kt */
public final class AddressPlugin implements tg0.a {
    public static final a Companion = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final AppCompatActivity f18979b;

    /* renamed from: c  reason: collision with root package name */
    private final n f18980c;

    /* renamed from: d  reason: collision with root package name */
    private final uh0.a f18981d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18982e;

    /* renamed from: f  reason: collision with root package name */
    private final n1 f18983f;

    /* renamed from: g  reason: collision with root package name */
    private b f18984g;

    /* renamed from: h  reason: collision with root package name */
    private EditAddressRequestPayload f18985h;

    /* renamed from: i  reason: collision with root package name */
    private String f18986i;
    private EditAddressDirectionsRequestPayload j;
    private AddNewAddressRequestPayload k;

    /* renamed from: l  reason: collision with root package name */
    private final p<Boolean, String, k> f18987l;

    /* renamed from: m  reason: collision with root package name */
    private final q<Address, OperationType, Integer, k> f18988m;

    /* compiled from: AddressPlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public AddressPlugin(AppCompatActivity appCompatActivity, n nVar, uh0.a aVar, boolean z11, n1 n1Var) {
        kotlin.jvm.internal.p.j(appCompatActivity, "activity");
        kotlin.jvm.internal.p.j(nVar, "locationContext");
        kotlin.jvm.internal.p.j(aVar, "swiggyLynxInterface");
        this.f18979b = appCompatActivity;
        this.f18980c = nVar;
        this.f18981d = aVar;
        this.f18982e = z11;
        this.f18983f = n1Var;
        this.f18987l = new AddressPlugin$receiverEditAddressDirectionsCallback$1(this);
        this.f18988m = new AddressPlugin$receiverDetailsHalfCardCallback$1(this);
    }

    public void F0(AddNewAddressRequestPayload addNewAddressRequestPayload, String str, b bVar) {
        b W0;
        kotlin.jvm.internal.p.j(addNewAddressRequestPayload, PaymentConstants.PAYLOAD);
        kotlin.jvm.internal.p.j(str, "requestId");
        kotlin.jvm.internal.p.j(bVar, "responseHandler");
        this.f18984g = bVar;
        this.f18986i = str;
        this.k = addNewAddressRequestPayload;
        if (addNewAddressRequestPayload.d() == UserContext.OFO_EVENTS) {
            this.f18981d.b(addNewAddressRequestPayload, this.f18983f, this.f18979b);
            return;
        }
        String str2 = this.f18986i;
        if (str2 != null && (W0 = W0()) != null) {
            b.a.a(W0, str2, 0, (String) null, (Object) null, new l0(mp.a.f53029a.a()), 2, (Object) null);
        }
    }

    public void G0(lp.a aVar, b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        a.b.c(this, aVar, bVar, iLynxViewUpdateHandler);
    }

    public void R0(EditAddressDirectionsRequestPayload editAddressDirectionsRequestPayload, String str, b bVar) {
        kotlin.jvm.internal.p.j(editAddressDirectionsRequestPayload, PaymentConstants.PAYLOAD);
        kotlin.jvm.internal.p.j(str, "requestId");
        kotlin.jvm.internal.p.j(bVar, "responseHandler");
        this.f18984g = bVar;
        this.f18986i = str;
        this.j = editAddressDirectionsRequestPayload;
        this.f18981d.g(this.f18979b, editAddressDirectionsRequestPayload, this.f18982e, this.f18983f, this.f18987l);
    }

    public void S(EditAddressRequestPayload editAddressRequestPayload, String str, b bVar) {
        kotlin.jvm.internal.p.j(editAddressRequestPayload, PaymentConstants.PAYLOAD);
        kotlin.jvm.internal.p.j(str, "requestId");
        kotlin.jvm.internal.p.j(bVar, "responseHandler");
        this.f18984g = bVar;
        this.f18986i = str;
        this.f18985h = editAddressRequestPayload;
        this.f18981d.a(this.f18979b, editAddressRequestPayload, this.f18982e, this.f18983f, this.f18988m);
    }

    public final b W0() {
        return this.f18984g;
    }

    /* renamed from: X0 */
    public ArrayList<np.b> T() {
        return a.b.b(this);
    }

    public final EditAddressRequestPayload c() {
        return this.f18985h;
    }

    public void h() {
        a.b.a(this);
    }

    public boolean i0(WebResourceRequest webResourceRequest, d dVar) {
        return a.b.e(this, webResourceRequest, dVar);
    }

    public boolean n(ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        return a.b.d(this, iLynxViewUpdateHandler);
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        b W0;
        String str;
        b W02;
        EditAddressRequestPayload c11;
        b W03;
        b W04;
        int i13 = i11;
        int i14 = i12;
        String str2 = null;
        if (i13 != 146) {
            if (i13 != 148 && i13 != 151) {
                return;
            }
            if (i14 != -1 || intent == null) {
                String str3 = this.f18986i;
                if (str3 != null && (c11 = c()) != null && (W03 = W0()) != null) {
                    b.a.a(W03, str3, 0, (String) null, c11, EditAddressRequestPayload.Companion.serializer(), 6, (Object) null);
                    return;
                }
                return;
            }
            Bundle extras = intent.getExtras();
            String string = extras == null ? null : extras.getString("addressJson");
            EditAddressResponsePayload editAddressResponsePayload = new EditAddressResponsePayload(string, (OperationType) null, 2, (i) null);
            String str4 = this.f18986i;
            if (!(str4 == null || (W04 = W0()) == null)) {
                b.a.a(W04, str4, 0, (String) null, editAddressResponsePayload, EditAddressResponsePayload.Companion.serializer(), 6, (Object) null);
            }
            if (i13 == 151 && string != null) {
                Gson i15 = g0.i();
                Class cls = Address.class;
                this.f18980c.G1((Address) (!(i15 instanceof Gson) ? i15.fromJson(string, cls) : GsonInstrumentation.fromJson(i15, string, cls)));
            }
        } else if (i14 != -1 || intent == null) {
            String str5 = this.f18986i;
            if (str5 != null && (W0 = W0()) != null) {
                b.a.a(W0, str5, 0, (String) null, (Object) null, new l0(mp.a.f53029a.a()), 2, (Object) null);
            }
        } else {
            Gson i16 = g0.i();
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                str = null;
            } else {
                str = extras2.getString("addressJson");
            }
            Class cls2 = Address.class;
            Address address = (Address) (!(i16 instanceof Gson) ? i16.fromJson(str, cls2) : GsonInstrumentation.fromJson(i16, str, cls2));
            if (address != null) {
                str2 = address.getId();
            }
            if (str2 == null) {
                str2 = "";
            }
            AddNewAddressResponsePayload addNewAddressResponsePayload = new AddNewAddressResponsePayload(str2, UserContext.OFO_EVENTS);
            String str6 = this.f18986i;
            if (str6 != null && (W02 = W0()) != null) {
                b.a.a(W02, str6, 0, (String) null, addNewAddressResponsePayload, AddNewAddressResponsePayload.Companion.serializer(), 6, (Object) null);
            }
        }
    }

    public void onNewIntent(Intent intent) {
        a.b.f(this, intent);
    }

    public final String p() {
        return this.f18986i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressPlugin(AppCompatActivity appCompatActivity, n nVar, uh0.a aVar, boolean z11, n1 n1Var, int i11, i iVar) {
        this(appCompatActivity, nVar, aVar, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : n1Var);
    }
}
