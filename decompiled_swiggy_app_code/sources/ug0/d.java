package ug0;

import android.content.Intent;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.applyCoupon.ApplyCouponRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.request.GetLocalCartRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.superV2.OpenSuperV2RequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.CustomizeLocalCartRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.UpdateLocalCartRequestPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ICartPlugin.kt */
public interface d extends np.a, sg0.b {
    public static final a Companion = a.f19926a;

    /* compiled from: ICartPlugin.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f19926a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f19927b;

        /* renamed from: c  reason: collision with root package name */
        private static final np.b f19928c = new np.b("ADD_NEW_ADDRESS", AddNewAddressRequestPayload.Companion.serializer());

        /* renamed from: d  reason: collision with root package name */
        private static final np.b f19929d = new np.b("APPLY_COUPON", ApplyCouponRequestPayload.Companion.serializer());

        /* renamed from: e  reason: collision with root package name */
        private static final np.b f19930e = new np.b("UPDATE_LOCAL_CART", UpdateLocalCartRequestPayload.Companion.serializer());

        /* renamed from: f  reason: collision with root package name */
        private static final np.b f19931f;

        /* renamed from: g  reason: collision with root package name */
        private static final np.b f19932g = new np.b("CUSTOMISE_CART_ITEM", CustomizeLocalCartRequestPayload.Companion.serializer());

        /* renamed from: h  reason: collision with root package name */
        private static final np.b f19933h = new np.b("SWITCH_TO_NATIVE_CART", (cq0.a) null, 2, (i) null);

        /* renamed from: i  reason: collision with root package name */
        private static final np.b f19934i;
        private static final np.b j;

        static {
            GetLocalCartRequestPayload.Companion companion = GetLocalCartRequestPayload.Companion;
            f19927b = new np.b("GET_LOCAL_CART", companion.serializer());
            f19931f = new np.b("CLEAR_LOCAL_CART", companion.serializer());
            OpenSuperV2RequestPayload.Companion companion2 = OpenSuperV2RequestPayload.Companion;
            f19934i = new np.b("OPEN_SUPER_V2", companion2.serializer());
            j = new np.b("OPEN_SUPER_V3", companion2.serializer());
        }

        private a() {
        }

        public final np.b a() {
            return f19928c;
        }

        public final np.b b() {
            return f19929d;
        }

        public final np.b c() {
            return f19931f;
        }

        public final np.b d() {
            return f19932g;
        }

        public final np.b e() {
            return f19927b;
        }

        public final np.b f() {
            return f19934i;
        }

        public final np.b g() {
            return j;
        }

        public final np.b h() {
            return f19933h;
        }

        public final np.b i() {
            return f19930e;
        }
    }

    /* compiled from: ICartPlugin.kt */
    public static final class b {
        public static void a(d dVar) {
            p.j(dVar, "this");
        }

        public static ArrayList<np.b> b(d dVar) {
            p.j(dVar, "this");
            a aVar = d.Companion;
            return k.f(aVar.e(), aVar.a(), aVar.b(), aVar.i(), aVar.c(), aVar.d(), aVar.h(), aVar.f(), aVar.g());
        }

        public static void c(d dVar, lp.a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(dVar, "this");
            p.j(aVar, "request");
            p.j(bVar, "responseHandler");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            np.b c11 = aVar.c();
            a aVar2 = d.Companion;
            if (p.e(c11, aVar2.e())) {
                dVar.L((GetLocalCartRequestPayload) aVar.a(), aVar.b(), bVar);
            } else if (p.e(c11, aVar2.a())) {
                dVar.M((AddNewAddressRequestPayload) aVar.a(), aVar.b(), bVar);
            } else if (p.e(c11, aVar2.b())) {
                dVar.s0((ApplyCouponRequestPayload) aVar.a(), aVar.b(), bVar);
            } else if (p.e(c11, aVar2.i())) {
                dVar.X((UpdateLocalCartRequestPayload) aVar.a(), aVar.b(), bVar);
            } else if (p.e(c11, aVar2.c())) {
                dVar.x0((GetLocalCartRequestPayload) aVar.a(), aVar.b(), bVar);
            } else if (p.e(c11, aVar2.d())) {
                dVar.U0((CustomizeLocalCartRequestPayload) aVar.a(), aVar.b(), bVar);
            } else if (p.e(c11, aVar2.h())) {
                dVar.a(aVar.a(), aVar.b(), bVar, iLynxViewUpdateHandler);
            } else if (p.e(c11, aVar2.f())) {
                dVar.E0((OpenSuperV2RequestPayload) aVar.a(), aVar.b(), bVar);
            } else if (p.e(c11, aVar2.g())) {
                dVar.x((OpenSuperV2RequestPayload) aVar.a(), aVar.b(), bVar);
            }
        }

        public static boolean d(d dVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(dVar, "this");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            return false;
        }

        public static void e(d dVar, Intent intent) {
            p.j(dVar, "this");
            p.j(intent, "intent");
        }
    }

    void E0(OpenSuperV2RequestPayload openSuperV2RequestPayload, String str, zp.b bVar);

    void L(GetLocalCartRequestPayload getLocalCartRequestPayload, String str, zp.b bVar);

    void M(AddNewAddressRequestPayload addNewAddressRequestPayload, String str, zp.b bVar);

    void U0(CustomizeLocalCartRequestPayload customizeLocalCartRequestPayload, String str, zp.b bVar);

    void X(UpdateLocalCartRequestPayload updateLocalCartRequestPayload, String str, zp.b bVar);

    void a(lp.b bVar, String str, zp.b bVar2, ILynxViewUpdateHandler iLynxViewUpdateHandler);

    void s0(ApplyCouponRequestPayload applyCouponRequestPayload, String str, zp.b bVar);

    void x(OpenSuperV2RequestPayload openSuperV2RequestPayload, String str, zp.b bVar);

    void x0(GetLocalCartRequestPayload getLocalCartRequestPayload, String str, zp.b bVar);
}
