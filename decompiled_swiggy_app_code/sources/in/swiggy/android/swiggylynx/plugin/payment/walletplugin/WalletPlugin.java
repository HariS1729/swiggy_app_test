package in.swiggy.android.swiggylynx.plugin.payment.walletplugin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebResourceRequest;
import androidx.appcompat.app.AppCompatActivity;
import bp0.h;
import com.amazon.identity.auth.device.AuthError;
import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import ef0.e;
import gd0.l;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.payment.utility.PaymentUtils;
import in.swiggy.android.swiggylynx.plugin.payment.walletplugin.AmazonDelinkPlugin;
import in.swiggy.android.swiggylynx.plugin.payment.walletplugin.WalletDataConsumerPayload;
import in.swiggy.android.tejas.feature.payment.PaymentWalletIconWPConfig;
import in.swiggy.android.tejas.payment.model.payment.models.PaymentType;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import os.u;
import wh0.d;
import zp.b;

/* compiled from: WalletPlugin.kt */
public final class WalletPlugin implements np.a {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: g  reason: collision with root package name */
    private static final np.b f19350g = new np.b("GET_WALLET_DATA", GetLinkWalletDataPayload$GetLinkWalletDataRequestPayload.Companion.serializer());

    /* renamed from: h  reason: collision with root package name */
    private static final np.b f19351h = new np.b("GET_LINKED_WALLET_DETAILS", GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload.Companion.serializer());

    /* renamed from: i  reason: collision with root package name */
    private static final np.b f19352i = new np.b("WALLET_DELINKED", WalletDataConsumerPayload.WalletDelinked.Companion.serializer());
    private static final np.b j = new np.b("WALLET_ADD_MONEY_SUCCESS", WalletDataConsumerPayload.WalletAddMoneySuccess.Companion.serializer());
    private static final np.b k = new np.b("DELINK_AMAZON_PAY", AmazonDelinkPlugin.AmazonDelinkRequestPayload.Companion.serializer());

    /* renamed from: b  reason: collision with root package name */
    private final e f19353b;

    /* renamed from: c  reason: collision with root package name */
    private final AppCompatActivity f19354c;

    /* renamed from: d  reason: collision with root package name */
    private final d f19355d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedPreferences f19356e;

    /* renamed from: f  reason: collision with root package name */
    private final jr.a f19357f;

    /* compiled from: WalletPlugin.kt */
    public enum WalletCodes {
        PayTM,
        PhonePe,
        Mobikwik,
        Freecharge,
        AmazonPay
    }

    /* compiled from: WalletPlugin.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19361a;

        static {
            int[] iArr = new int[WalletCodes.values().length];
            iArr[WalletCodes.PayTM.ordinal()] = 1;
            iArr[WalletCodes.Freecharge.ordinal()] = 2;
            iArr[WalletCodes.Mobikwik.ordinal()] = 3;
            iArr[WalletCodes.PhonePe.ordinal()] = 4;
            iArr[WalletCodes.AmazonPay.ordinal()] = 5;
            f19361a = iArr;
        }
    }

    /* compiled from: WalletPlugin.kt */
    public static final class b implements f8.a<Void, AuthError> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ zp.b f19362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f19363b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WalletPlugin f19364c;

        b(zp.b bVar, String str, WalletPlugin walletPlugin) {
            this.f19362a = bVar;
            this.f19363b = str;
            this.f19364c = walletPlugin;
        }

        /* renamed from: d */
        public void c(AuthError authError) {
            p.j(authError, "authError");
            this.f19364c.b1(WalletCodes.AmazonPay.name(), authError.getMessage(), "delink_api");
            b.a.a(this.f19362a, this.f19363b, 0, (String) null, new AmazonDelinkPlugin.AmazonDelinkResponsePayload("FAILURE"), AmazonDelinkPlugin.AmazonDelinkResponsePayload.Companion.serializer(), 6, (Object) null);
        }

        /* renamed from: e */
        public void onSuccess(Void voidR) {
            b.a.a(this.f19362a, this.f19363b, 0, (String) null, new AmazonDelinkPlugin.AmazonDelinkResponsePayload("SUCCESS"), AmazonDelinkPlugin.AmazonDelinkResponsePayload.Companion.serializer(), 6, (Object) null);
        }
    }

    public WalletPlugin(e eVar, AppCompatActivity appCompatActivity, d dVar, SharedPreferences sharedPreferences, jr.a aVar) {
        p.j(eVar, LogSubCategory.Action.USER);
        p.j(appCompatActivity, "activity");
        p.j(dVar, "lynxViewComponent");
        p.j(sharedPreferences, "sharedPreferences");
        p.j(aVar, "newRelicePerformanceUtils");
        this.f19353b = eVar;
        this.f19354c = appCompatActivity;
        this.f19355d = dVar;
        this.f19356e = sharedPreferences;
        this.f19357f = aVar;
    }

    /* access modifiers changed from: private */
    public final void b1(String str, String str2, String str3) {
        String str4 = str + '_' + str3;
        HashMap hashMap = new HashMap();
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str4, str2);
        this.f19357f.b("WALLET_PLUGIN_" + str + "_error_event", hashMap);
    }

    private final void g1(WalletDataConsumerPayload.WalletDelinked walletDelinked, String str, zp.b bVar) {
        Companion.ActivityResponseData p11 = p(walletDelinked);
        Intent intent = new Intent();
        intent.putExtra("response", p11);
        this.f19354c.setResult(-1, intent);
        this.f19355d.x0();
    }

    public void G0(lp.a aVar, zp.b bVar, ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(aVar, "request");
        p.j(bVar, "responseHandler");
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        np.b c11 = aVar.c();
        if (p.e(c11, f19350g)) {
            e1((GetLinkWalletDataPayload$GetLinkWalletDataRequestPayload) aVar.a(), aVar.b(), bVar);
        } else if (p.e(c11, f19351h)) {
            d1((GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload) aVar.a(), aVar.b(), bVar);
        } else if (p.e(c11, f19352i)) {
            g1((WalletDataConsumerPayload.WalletDelinked) aVar.a(), aVar.b(), bVar);
        } else if (p.e(c11, j)) {
            f1((WalletDataConsumerPayload.WalletAddMoneySuccess) aVar.a(), aVar.b(), bVar);
        } else if (p.e(c11, k)) {
            c1((AmazonDelinkPlugin.AmazonDelinkRequestPayload) aVar.a(), aVar.b(), bVar);
        }
    }

    public List<np.b> T() {
        return k.f(f19350g, f19351h, f19352i, j, k);
    }

    public final String W0(String str) {
        p.j(str, "walletCode");
        int i11 = a.f19361a[WalletCodes.valueOf(str).ordinal()];
        if (i11 == 1) {
            return PaymentType.PAYTM;
        }
        if (i11 == 2) {
            return PaymentType.FREECHARGE;
        }
        if (i11 == 3) {
            return PaymentType.MOBIKWIK;
        }
        if (i11 == 4) {
            return "PhonePe";
        }
        if (i11 == 5) {
            return PaymentType.AMAZONPAY;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload X0(GetLinkWalletDataPayload$GetLinkWalletDataRequestPayload getLinkWalletDataPayload$GetLinkWalletDataRequestPayload) {
        p.j(getLinkWalletDataPayload$GetLinkWalletDataRequestPayload, PaymentConstants.PAYLOAD);
        try {
            Pair<String, String> Z0 = Z0(getLinkWalletDataPayload$GetLinkWalletDataRequestPayload.b());
            String b11 = Z0.b();
            String phoneNumber = this.f19353b.getPhoneNumber();
            String b12 = getLinkWalletDataPayload$GetLinkWalletDataRequestPayload.b();
            p.i(phoneNumber, "phoneNumber");
            return new GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload(b12, phoneNumber, b11, Z0.a());
        } catch (IllegalArgumentException e11) {
            u.h(s.b(WalletPlugin.class).g(), e11);
            return null;
        }
    }

    public final GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload Y0(GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload) {
        GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload;
        p.j(getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload, PaymentConstants.PAYLOAD);
        l a12 = a1(getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload.b());
        String d11 = Z0(getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload.b()).d();
        if (a12 == null) {
            getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload = null;
        } else {
            String b11 = a12.b();
            String a11 = a12.a();
            if (a11 == null) {
                a11 = "";
            }
            String c11 = a12.c();
            if (c11 == null) {
                c11 = "";
            }
            getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload = new GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload(b11, a11, c11, d11);
        }
        return getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload == null ? new GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload("", "", "", d11) : getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload;
    }

    public final Pair<String, String> Z0(String str) {
        p.j(str, "code");
        String string = this.f19356e.getString("payment_wallet_icon", "{\"amazon_pay_icon\":\"v1588992010/Amazon_Pay_Logos/Pay/logo_pay-primary-fullcolor-positive\",\"freecharge_icon\":\"\",\"mobikwik_icon\":\"\",\"paytm_icon\":\"\",\"phonepe_icon\":\"\",\"lazypay_icon\":\"\"}");
        String string2 = this.f19356e.getString("payment_wallet_icon_ux4", "\n        {\n        \"amazon_pay_icon\":\"PaymentLogos/paymentIcons/wallets/amazonpay\",\n        \"freecharge_icon\":\"PaymentLogos/paymentIcons/wallets/freecharge\",\n        \"mobikwik_icon\":\"PaymentLogos/paymentIcons/wallets/mobikwik\",\n        \"paytm_icon\":\"PaymentLogos/paymentIcons/wallets/paytm\",\n        \"phonepe_icon\":\"PaymentLogos/paymentIcons/wallets/phonepe\"\n        }\n        ");
        PaymentUtils paymentUtils = PaymentUtils.f80724a;
        PaymentWalletIconWPConfig w11 = paymentUtils.w(string2);
        PaymentWalletIconWPConfig w12 = paymentUtils.w(string);
        int i11 = a.f19361a[WalletCodes.valueOf(str).ordinal()];
        String str2 = null;
        if (i11 == 1) {
            String r11 = PaymentUtils.r(PaymentType.PAYTM);
            String paytmIcon = w11 == null ? null : w11.getPaytmIcon();
            if (paytmIcon != null) {
                str2 = paytmIcon;
            } else if (w12 != null) {
                str2 = w12.getPaytmIcon();
            }
            return h.a(r11, str2);
        } else if (i11 == 2) {
            String r12 = PaymentUtils.r(PaymentType.FREECHARGE);
            String freechargeIcon = w11 == null ? null : w11.getFreechargeIcon();
            if (freechargeIcon != null) {
                str2 = freechargeIcon;
            } else if (w12 != null) {
                str2 = w12.getFreechargeIcon();
            }
            return h.a(r12, str2);
        } else if (i11 == 3) {
            String r13 = PaymentUtils.r(PaymentType.MOBIKWIK);
            String mobikwikIcon = w11 == null ? null : w11.getMobikwikIcon();
            if (mobikwikIcon != null) {
                str2 = mobikwikIcon;
            } else if (w12 != null) {
                str2 = w12.getMobikwikIcon();
            }
            return h.a(r13, str2);
        } else if (i11 == 4) {
            String r14 = PaymentUtils.r("PhonePe");
            String phonepeIcon = w11 == null ? null : w11.getPhonepeIcon();
            if (phonepeIcon != null) {
                str2 = phonepeIcon;
            } else if (w12 != null) {
                str2 = w12.getPhonepeIcon();
            }
            return h.a(r14, str2);
        } else if (i11 == 5) {
            String r15 = PaymentUtils.r(PaymentType.AMAZONPAY);
            String amazonPayIcon = w11 == null ? null : w11.getAmazonPayIcon();
            if (amazonPayIcon != null) {
                str2 = amazonPayIcon;
            } else if (w12 != null) {
                str2 = w12.getAmazonPayIcon();
            }
            return h.a(r15, str2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final l a1(String str) {
        p.j(str, "walletCode");
        return PaymentUtils.f80724a.o(W0(str), this.f19356e);
    }

    public final void c1(AmazonDelinkPlugin.AmazonDelinkRequestPayload amazonDelinkRequestPayload, String str, zp.b bVar) {
        p.j(amazonDelinkRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        com.amazon.identity.auth.device.api.authorization.a.f(this.f19354c, new b(bVar, str, this));
    }

    public final void d1(GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload, String str, zp.b bVar) {
        p.j(getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        bVar.a(str, 0, "", Y0(getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload), GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload.Companion.serializer());
    }

    public final void e1(GetLinkWalletDataPayload$GetLinkWalletDataRequestPayload getLinkWalletDataPayload$GetLinkWalletDataRequestPayload, String str, zp.b bVar) {
        p.j(getLinkWalletDataPayload$GetLinkWalletDataRequestPayload, PaymentConstants.PAYLOAD);
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload X0 = X0(getLinkWalletDataPayload$GetLinkWalletDataRequestPayload);
        if (X0 != null) {
            bVar.a(str, 0, "", X0, GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload.Companion.serializer());
        }
    }

    public final void f1(WalletDataConsumerPayload.WalletAddMoneySuccess walletAddMoneySuccess, String str, zp.b bVar) {
        p.j(walletAddMoneySuccess, "walletAddMoneySuccess");
        p.j(str, "requestId");
        p.j(bVar, "responseHandler");
        Companion.ActivityResponseData p11 = p(walletAddMoneySuccess);
        Intent intent = new Intent();
        intent.putExtra("response", p11);
        this.f19354c.setResult(-1, intent);
        this.f19355d.x0();
    }

    public void h() {
    }

    public boolean i0(WebResourceRequest webResourceRequest, zp.d dVar) {
        return false;
    }

    public boolean n(ILynxViewUpdateHandler iLynxViewUpdateHandler) {
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        return false;
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
    }

    public void onNewIntent(Intent intent) {
        p.j(intent, "intent");
    }

    public final Companion.ActivityResponseData p(WalletDataConsumerPayload walletDataConsumerPayload) {
        p.j(walletDataConsumerPayload, "walletResponse");
        if (walletDataConsumerPayload instanceof WalletDataConsumerPayload.WalletDelinked) {
            WalletDataConsumerPayload.WalletDelinked walletDelinked = (WalletDataConsumerPayload.WalletDelinked) walletDataConsumerPayload;
            return new Companion.ActivityResponseData("wallet-delink", W0(walletDelinked.c()), walletDelinked.b());
        } else if (walletDataConsumerPayload instanceof WalletDataConsumerPayload.WalletAddMoneySuccess) {
            return new Companion.ActivityResponseData("add-money", W0(((WalletDataConsumerPayload.WalletAddMoneySuccess) walletDataConsumerPayload).b()), (String) null, 4, (i) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: WalletPlugin.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final String a(String str) {
            p.j(str, "walletCode");
            switch (str.hashCode()) {
                case -1040489500:
                    if (str.equals(PaymentType.AMAZONPAY)) {
                        return WalletCodes.AmazonPay.name();
                    }
                    break;
                case -284113991:
                    if (str.equals(PaymentType.MOBIKWIK)) {
                        return WalletCodes.Mobikwik.name();
                    }
                    break;
                case 348334818:
                    if (str.equals(PaymentType.FREECHARGE)) {
                        return WalletCodes.Freecharge.name();
                    }
                    break;
                case 1069169635:
                    if (str.equals("PhonePe")) {
                        return WalletCodes.PhonePe.name();
                    }
                    break;
                case 1177587491:
                    if (str.equals(PaymentType.PAYTM)) {
                        return WalletCodes.PayTM.name();
                    }
                    break;
            }
            return "";
        }

        /* compiled from: WalletPlugin.kt */
        public static final class ActivityResponseData implements Parcelable {
            public static final Parcelable.Creator<ActivityResponseData> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            private final String f19358a;

            /* renamed from: b  reason: collision with root package name */
            private final String f19359b;

            /* renamed from: c  reason: collision with root package name */
            private final String f19360c;

            /* compiled from: WalletPlugin.kt */
            public static final class a implements Parcelable.Creator<ActivityResponseData> {
                /* renamed from: a */
                public final ActivityResponseData createFromParcel(Parcel parcel) {
                    p.j(parcel, "parcel");
                    return new ActivityResponseData(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* renamed from: b */
                public final ActivityResponseData[] newArray(int i11) {
                    return new ActivityResponseData[i11];
                }
            }

            public ActivityResponseData(String str, String str2, String str3) {
                p.j(str, Labels.HyperSdk.PROCESS);
                p.j(str2, "internalPaymentCode");
                this.f19358a = str;
                this.f19359b = str2;
                this.f19360c = str3;
            }

            public final String a() {
                return this.f19359b;
            }

            public final String b() {
                return this.f19358a;
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActivityResponseData)) {
                    return false;
                }
                ActivityResponseData activityResponseData = (ActivityResponseData) obj;
                return p.e(this.f19358a, activityResponseData.f19358a) && p.e(this.f19359b, activityResponseData.f19359b) && p.e(this.f19360c, activityResponseData.f19360c);
            }

            public int hashCode() {
                int hashCode = ((this.f19358a.hashCode() * 31) + this.f19359b.hashCode()) * 31;
                String str = this.f19360c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "ActivityResponseData(process=" + this.f19358a + ", internalPaymentCode=" + this.f19359b + ", mobileNumber=" + this.f19360c + ')';
            }

            public void writeToParcel(Parcel parcel, int i11) {
                p.j(parcel, "out");
                parcel.writeString(this.f19358a);
                parcel.writeString(this.f19359b);
                parcel.writeString(this.f19360c);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ ActivityResponseData(String str, String str2, String str3, int i11, i iVar) {
                this(str, str2, (i11 & 4) != 0 ? "" : str3);
            }
        }
    }
}
