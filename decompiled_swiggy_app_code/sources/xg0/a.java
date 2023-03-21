package xg0;

import android.content.Intent;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.superV2.OpenSuperV2RequestPayload;
import in.swiggy.android.swiggylynx.plugin.dash.imageupload.ImageUploadPayload;
import in.swiggy.android.swiggylynx.plugin.dash.instamart.InstamartUpdateLocalCartPayload;
import in.swiggy.android.swiggylynx.plugin.dash.kyc.KycInitPayload;
import in.swiggy.android.swiggylynx.plugin.dash.payment.DashPaymentPayload;
import in.swiggy.android.swiggylynx.plugin.dash.trackevent.TrackEventPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import lp.b;

/* compiled from: IDashPlugin.kt */
public interface a extends np.a, sg0.b {
    public static final C0250a Companion = C0250a.f19987a;

    /* renamed from: xg0.a$a  reason: collision with other inner class name */
    /* compiled from: IDashPlugin.kt */
    public static final class C0250a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0250a f19987a = new C0250a();

        /* renamed from: b  reason: collision with root package name */
        private static final np.b f19988b = new np.b("TRACK_EVENT", TrackEventPayload.Companion.serializer());

        /* renamed from: c  reason: collision with root package name */
        private static final np.b f19989c = new np.b("MAKE_DASH_PAYMENT", DashPaymentPayload.Companion.serializer());

        /* renamed from: d  reason: collision with root package name */
        private static final np.b f19990d = new np.b("ADD_NEW_ADDRESS", AddNewAddressRequestPayload.Companion.serializer());

        /* renamed from: e  reason: collision with root package name */
        private static final np.b f19991e;

        /* renamed from: f  reason: collision with root package name */
        private static final np.b f19992f;

        /* renamed from: g  reason: collision with root package name */
        private static final np.b f19993g = new np.b("KYC_INIT", KycInitPayload.Companion.serializer());

        /* renamed from: h  reason: collision with root package name */
        private static final np.b f19994h;

        /* renamed from: i  reason: collision with root package name */
        private static final np.b f19995i;
        private static final np.b j = new np.b("IM_UPDATE_LOCAL_CART", InstamartUpdateLocalCartPayload.Companion.serializer());
        private static final np.b k;

        /* renamed from: l  reason: collision with root package name */
        private static final np.b f19996l = new np.b("OPEN_SUPER_V3", OpenSuperV2RequestPayload.Companion.serializer());

        static {
            ImageUploadPayload.Companion companion = ImageUploadPayload.Companion;
            f19991e = new np.b("IMAGE_UPLOAD", companion.serializer());
            f19992f = new np.b("GOOGLE_IMAGE_UPLOAD", companion.serializer());
            b.C0657b bVar = lp.b.Companion;
            f19994h = new np.b("GET_CURRENT_ADDRESS", bVar.a());
            f19995i = new np.b("IM_GET_LOCAL_CART", bVar.a());
            k = new np.b("IM_CLEAR_LOCAL_CART", bVar.a());
        }

        private C0250a() {
        }

        public final np.b a() {
            return f19990d;
        }

        public final np.b b() {
            return f19994h;
        }

        public final np.b c() {
            return f19992f;
        }

        public final np.b d() {
            return f19991e;
        }

        public final np.b e() {
            return k;
        }

        public final np.b f() {
            return f19995i;
        }

        public final np.b g() {
            return j;
        }

        public final np.b h() {
            return f19993g;
        }

        public final np.b i() {
            return f19989c;
        }

        public final np.b j() {
            return f19996l;
        }

        public final np.b k() {
            return f19988b;
        }
    }

    /* compiled from: IDashPlugin.kt */
    public static final class b {
        public static void a(a aVar) {
            p.j(aVar, "this");
        }

        public static ArrayList<np.b> b(a aVar) {
            p.j(aVar, "this");
            C0250a aVar2 = a.Companion;
            return k.f(aVar2.k(), aVar2.i(), aVar2.a(), aVar2.d(), aVar2.c(), aVar2.h(), aVar2.f(), aVar2.g(), aVar2.e(), aVar2.b(), aVar2.j());
        }

        public static void c(a aVar, lp.a aVar2, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(aVar2, "request");
            p.j(bVar, "responseHandler");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            np.b c11 = aVar2.c();
            C0250a aVar3 = a.Companion;
            if (p.e(c11, aVar3.k())) {
                aVar.W((TrackEventPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.i())) {
                aVar.v0(aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.a())) {
                aVar.B((AddNewAddressRequestPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.d())) {
                aVar.s((ImageUploadPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.c())) {
                aVar.I0((ImageUploadPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.h())) {
                aVar.i((KycInitPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.b())) {
                aVar.N0(aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.f())) {
                aVar.A(aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.g())) {
                aVar.C((InstamartUpdateLocalCartPayload) aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.e())) {
                aVar.J(aVar2.a(), aVar2.b(), bVar);
            } else if (p.e(c11, aVar3.j())) {
                aVar.k((OpenSuperV2RequestPayload) aVar2.a(), aVar2.b(), bVar);
            }
        }

        public static boolean d(a aVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
            p.j(aVar, "this");
            p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
            return false;
        }

        public static void e(a aVar, Intent intent) {
            p.j(aVar, "this");
            p.j(intent, "intent");
        }
    }

    void A(lp.b bVar, String str, zp.b bVar2);

    void B(AddNewAddressRequestPayload addNewAddressRequestPayload, String str, zp.b bVar);

    void C(InstamartUpdateLocalCartPayload instamartUpdateLocalCartPayload, String str, zp.b bVar);

    void I0(ImageUploadPayload imageUploadPayload, String str, zp.b bVar);

    void J(lp.b bVar, String str, zp.b bVar2);

    void N0(lp.b bVar, String str, zp.b bVar2);

    void W(TrackEventPayload trackEventPayload, String str, zp.b bVar);

    void i(KycInitPayload kycInitPayload, String str, zp.b bVar);

    void k(OpenSuperV2RequestPayload openSuperV2RequestPayload, String str, zp.b bVar);

    void s(ImageUploadPayload imageUploadPayload, String str, zp.b bVar);

    void v0(lp.b bVar, String str, zp.b bVar2);
}
