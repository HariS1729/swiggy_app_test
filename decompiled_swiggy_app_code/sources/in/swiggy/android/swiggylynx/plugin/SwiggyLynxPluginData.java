package in.swiggy.android.swiggylynx.plugin;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathyResponsePayload;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SwiggyLynxPluginData.kt */
public abstract class SwiggyLynxPluginData implements Parcelable {

    /* compiled from: SwiggyLynxPluginData.kt */
    public static final class CartLynxPluginData extends SwiggyLynxPluginData {
        public static final Parcelable.Creator<CartLynxPluginData> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f18970a;

        /* compiled from: SwiggyLynxPluginData.kt */
        public static final class a implements Parcelable.Creator<CartLynxPluginData> {
            /* renamed from: a */
            public final CartLynxPluginData createFromParcel(Parcel parcel) {
                p.j(parcel, "parcel");
                return new CartLynxPluginData(parcel.readString());
            }

            /* renamed from: b */
            public final CartLynxPluginData[] newArray(int i11) {
                return new CartLynxPluginData[i11];
            }
        }

        public CartLynxPluginData() {
            this((String) null, 1, (i) null);
        }

        public CartLynxPluginData(String str) {
            super((i) null);
            this.f18970a = str;
        }

        public final String a() {
            return this.f18970a;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CartLynxPluginData) && p.e(this.f18970a, ((CartLynxPluginData) obj).f18970a);
        }

        public int hashCode() {
            String str = this.f18970a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "CartLynxPluginData(source=" + this.f18970a + ')';
        }

        public void writeToParcel(Parcel parcel, int i11) {
            p.j(parcel, "out");
            parcel.writeString(this.f18970a);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CartLynxPluginData(String str, int i11, i iVar) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: SwiggyLynxPluginData.kt */
    public static final class DashPluginData extends SwiggyLynxPluginData {
        public static final Parcelable.Creator<DashPluginData> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f18971a;

        /* compiled from: SwiggyLynxPluginData.kt */
        public static final class a implements Parcelable.Creator<DashPluginData> {
            /* renamed from: a */
            public final DashPluginData createFromParcel(Parcel parcel) {
                p.j(parcel, "parcel");
                return new DashPluginData(parcel.readString());
            }

            /* renamed from: b */
            public final DashPluginData[] newArray(int i11) {
                return new DashPluginData[i11];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DashPluginData(String str) {
            super((i) null);
            p.j(str, "url");
            this.f18971a = str;
        }

        public final String a() {
            return this.f18971a;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DashPluginData) && p.e(this.f18971a, ((DashPluginData) obj).f18971a);
        }

        public int hashCode() {
            return this.f18971a.hashCode();
        }

        public String toString() {
            return "DashPluginData(url=" + this.f18971a + ')';
        }

        public void writeToParcel(Parcel parcel, int i11) {
            p.j(parcel, "out");
            parcel.writeString(this.f18971a);
        }
    }

    /* compiled from: SwiggyLynxPluginData.kt */
    public static final class EmpathyLynxPluginData extends SwiggyLynxPluginData {
        public static final Parcelable.Creator<EmpathyLynxPluginData> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final RestEmpathyResponsePayload f18972a;

        /* compiled from: SwiggyLynxPluginData.kt */
        public static final class a implements Parcelable.Creator<EmpathyLynxPluginData> {
            /* renamed from: a */
            public final EmpathyLynxPluginData createFromParcel(Parcel parcel) {
                p.j(parcel, "parcel");
                return new EmpathyLynxPluginData(RestEmpathyResponsePayload.CREATOR.createFromParcel(parcel));
            }

            /* renamed from: b */
            public final EmpathyLynxPluginData[] newArray(int i11) {
                return new EmpathyLynxPluginData[i11];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public EmpathyLynxPluginData(RestEmpathyResponsePayload restEmpathyResponsePayload) {
            super((i) null);
            p.j(restEmpathyResponsePayload, PaymentConstants.PAYLOAD);
            this.f18972a = restEmpathyResponsePayload;
        }

        public final RestEmpathyResponsePayload a() {
            return this.f18972a;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmpathyLynxPluginData) && p.e(this.f18972a, ((EmpathyLynxPluginData) obj).f18972a);
        }

        public int hashCode() {
            return this.f18972a.hashCode();
        }

        public String toString() {
            return "EmpathyLynxPluginData(payload=" + this.f18972a + ')';
        }

        public void writeToParcel(Parcel parcel, int i11) {
            p.j(parcel, "out");
            this.f18972a.writeToParcel(parcel, i11);
        }
    }

    /* compiled from: SwiggyLynxPluginData.kt */
    public static final class LocationPluginData extends SwiggyLynxPluginData {
        public static final Parcelable.Creator<LocationPluginData> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public static final LocationPluginData f18973a = new LocationPluginData();

        /* compiled from: SwiggyLynxPluginData.kt */
        public static final class a implements Parcelable.Creator<LocationPluginData> {
            /* renamed from: a */
            public final LocationPluginData createFromParcel(Parcel parcel) {
                p.j(parcel, "parcel");
                parcel.readInt();
                return LocationPluginData.f18973a;
            }

            /* renamed from: b */
            public final LocationPluginData[] newArray(int i11) {
                return new LocationPluginData[i11];
            }
        }

        private LocationPluginData() {
            super((i) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i11) {
            p.j(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* compiled from: SwiggyLynxPluginData.kt */
    public static final class PaymentLynxPluginData extends SwiggyLynxPluginData {
        public static final Parcelable.Creator<PaymentLynxPluginData> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f18974a;

        /* compiled from: SwiggyLynxPluginData.kt */
        public static final class a implements Parcelable.Creator<PaymentLynxPluginData> {
            /* renamed from: a */
            public final PaymentLynxPluginData createFromParcel(Parcel parcel) {
                p.j(parcel, "parcel");
                return new PaymentLynxPluginData(parcel.readString());
            }

            /* renamed from: b */
            public final PaymentLynxPluginData[] newArray(int i11) {
                return new PaymentLynxPluginData[i11];
            }
        }

        public PaymentLynxPluginData() {
            this((String) null, 1, (i) null);
        }

        public PaymentLynxPluginData(String str) {
            super((i) null);
            this.f18974a = str;
        }

        public final String a() {
            return this.f18974a;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentLynxPluginData) && p.e(this.f18974a, ((PaymentLynxPluginData) obj).f18974a);
        }

        public int hashCode() {
            String str = this.f18974a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "PaymentLynxPluginData(source=" + this.f18974a + ')';
        }

        public void writeToParcel(Parcel parcel, int i11) {
            p.j(parcel, "out");
            parcel.writeString(this.f18974a);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PaymentLynxPluginData(String str, int i11, i iVar) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: SwiggyLynxPluginData.kt */
    public static final class PermissionPluginData extends SwiggyLynxPluginData {
        public static final Parcelable.Creator<PermissionPluginData> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public static final PermissionPluginData f18975a = new PermissionPluginData();

        /* compiled from: SwiggyLynxPluginData.kt */
        public static final class a implements Parcelable.Creator<PermissionPluginData> {
            /* renamed from: a */
            public final PermissionPluginData createFromParcel(Parcel parcel) {
                p.j(parcel, "parcel");
                parcel.readInt();
                return PermissionPluginData.f18975a;
            }

            /* renamed from: b */
            public final PermissionPluginData[] newArray(int i11) {
                return new PermissionPluginData[i11];
            }
        }

        private PermissionPluginData() {
            super((i) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i11) {
            p.j(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* compiled from: SwiggyLynxPluginData.kt */
    public static final class SwiggyLynxCorePluginData extends SwiggyLynxPluginData {
        public static final Parcelable.Creator<SwiggyLynxCorePluginData> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final Intent f18976a;

        /* compiled from: SwiggyLynxPluginData.kt */
        public static final class a implements Parcelable.Creator<SwiggyLynxCorePluginData> {
            /* renamed from: a */
            public final SwiggyLynxCorePluginData createFromParcel(Parcel parcel) {
                p.j(parcel, "parcel");
                return new SwiggyLynxCorePluginData((Intent) parcel.readParcelable(SwiggyLynxCorePluginData.class.getClassLoader()));
            }

            /* renamed from: b */
            public final SwiggyLynxCorePluginData[] newArray(int i11) {
                return new SwiggyLynxCorePluginData[i11];
            }
        }

        public SwiggyLynxCorePluginData() {
            this((Intent) null, 1, (i) null);
        }

        public SwiggyLynxCorePluginData(Intent intent) {
            super((i) null);
            this.f18976a = intent;
        }

        public final Intent a() {
            return this.f18976a;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SwiggyLynxCorePluginData) && p.e(this.f18976a, ((SwiggyLynxCorePluginData) obj).f18976a);
        }

        public int hashCode() {
            Intent intent = this.f18976a;
            if (intent == null) {
                return 0;
            }
            return intent.hashCode();
        }

        public String toString() {
            return "SwiggyLynxCorePluginData(switchToNativeIntent=" + this.f18976a + ')';
        }

        public void writeToParcel(Parcel parcel, int i11) {
            p.j(parcel, "out");
            parcel.writeParcelable(this.f18976a, i11);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SwiggyLynxCorePluginData(Intent intent, int i11, i iVar) {
            this((i11 & 1) != 0 ? null : intent);
        }
    }

    private SwiggyLynxPluginData() {
    }

    public /* synthetic */ SwiggyLynxPluginData(i iVar) {
        this();
    }
}
