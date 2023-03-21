package in.swiggy.android.swiggylynx.ui;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import in.swiggy.android.swiggylynx.plugin.SwiggyLynxPluginData;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Keep
/* compiled from: LynxData.kt */
public final class LynxData implements Parcelable {
    public static final Parcelable.Creator<LynxData> CREATOR = new b();
    public static final a Companion = new a((i) null);
    public static final String DEFAULT_URL = "https://www.swiggy.com";
    private final boolean addDefaultHeaders;
    private final Map<String, String> headers;
    private final Set<SwiggyLynxPluginData> plugins;
    private final int requestCode;
    private final Intent switchToNativeIntent;
    private final String url;

    /* compiled from: LynxData.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: LynxData.kt */
    public static final class b implements Parcelable.Creator<LynxData> {
        /* renamed from: a */
        public final LynxData createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            String readString = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            int readInt3 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt3);
            for (int i12 = 0; i12 != readInt3; i12++) {
                linkedHashSet.add(parcel.readParcelable(LynxData.class.getClassLoader()));
            }
            return new LynxData(readString, z11, readInt, linkedHashMap, linkedHashSet, (Intent) parcel.readParcelable(LynxData.class.getClassLoader()));
        }

        /* renamed from: b */
        public final LynxData[] newArray(int i11) {
            return new LynxData[i11];
        }
    }

    public LynxData() {
        this((String) null, false, 0, (Map) null, (Set) null, (Intent) null, 63, (i) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LynxData(String str) {
        this(str, false, 0, (Map) null, (Set) null, (Intent) null, 62, (i) null);
        p.j(str, "url");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LynxData(String str, boolean z11) {
        this(str, z11, 0, (Map) null, (Set) null, (Intent) null, 60, (i) null);
        p.j(str, "url");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LynxData(String str, boolean z11, int i11) {
        this(str, z11, i11, (Map) null, (Set) null, (Intent) null, 56, (i) null);
        p.j(str, "url");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LynxData(String str, boolean z11, int i11, Map<String, String> map) {
        this(str, z11, i11, map, (Set) null, (Intent) null, 48, (i) null);
        p.j(str, "url");
        p.j(map, "headers");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LynxData(String str, boolean z11, int i11, Map<String, String> map, Set<? extends SwiggyLynxPluginData> set) {
        this(str, z11, i11, map, set, (Intent) null, 32, (i) null);
        p.j(str, "url");
        p.j(map, "headers");
        p.j(set, "plugins");
    }

    public LynxData(String str, boolean z11, int i11, Map<String, String> map, Set<? extends SwiggyLynxPluginData> set, Intent intent) {
        p.j(str, "url");
        p.j(map, "headers");
        p.j(set, "plugins");
        this.url = str;
        this.addDefaultHeaders = z11;
        this.requestCode = i11;
        this.headers = map;
        this.plugins = set;
        this.switchToNativeIntent = intent;
    }

    private final Set<SwiggyLynxPluginData> component5() {
        return this.plugins;
    }

    private final Intent component6() {
        return this.switchToNativeIntent;
    }

    public static /* synthetic */ LynxData copy$default(LynxData lynxData, String str, boolean z11, int i11, Map<String, String> map, Set<SwiggyLynxPluginData> set, Intent intent, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = lynxData.url;
        }
        if ((i12 & 2) != 0) {
            z11 = lynxData.addDefaultHeaders;
        }
        boolean z12 = z11;
        if ((i12 & 4) != 0) {
            i11 = lynxData.requestCode;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            map = lynxData.headers;
        }
        Map<String, String> map2 = map;
        if ((i12 & 16) != 0) {
            set = lynxData.plugins;
        }
        Set<SwiggyLynxPluginData> set2 = set;
        if ((i12 & 32) != 0) {
            intent = lynxData.switchToNativeIntent;
        }
        return lynxData.copy(str, z12, i13, map2, set2, intent);
    }

    public static /* synthetic */ void getInitiatePhonePeSDK$annotations() {
    }

    public final String component1() {
        return this.url;
    }

    public final boolean component2() {
        return this.addDefaultHeaders;
    }

    public final int component3() {
        return this.requestCode;
    }

    public final Map<String, String> component4() {
        return this.headers;
    }

    public final LynxData copy(String str, boolean z11, int i11, Map<String, String> map, Set<? extends SwiggyLynxPluginData> set, Intent intent) {
        p.j(str, "url");
        p.j(map, "headers");
        p.j(set, "plugins");
        return new LynxData(str, z11, i11, map, set, intent);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LynxData)) {
            return false;
        }
        LynxData lynxData = (LynxData) obj;
        return p.e(this.url, lynxData.url) && this.addDefaultHeaders == lynxData.addDefaultHeaders && this.requestCode == lynxData.requestCode && p.e(this.headers, lynxData.headers) && p.e(this.plugins, lynxData.plugins) && p.e(this.switchToNativeIntent, lynxData.switchToNativeIntent);
    }

    public final boolean getAddDefaultHeaders() {
        return this.addDefaultHeaders;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final boolean getInitiatePhonePeSDK() {
        for (SwiggyLynxPluginData swiggyLynxPluginData : this.plugins) {
            if (swiggyLynxPluginData instanceof SwiggyLynxPluginData.PaymentLynxPluginData) {
                return true;
            }
        }
        return false;
    }

    public final Set<SwiggyLynxPluginData> getPluginSet() {
        return e0.e(d0.d(new SwiggyLynxPluginData.SwiggyLynxCorePluginData(this.switchToNativeIntent), SwiggyLynxPluginData.PermissionPluginData.f18975a, SwiggyLynxPluginData.LocationPluginData.f18973a), this.plugins);
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        boolean z11 = this.addDefaultHeaders;
        if (z11) {
            z11 = true;
        }
        int hashCode2 = (((((((hashCode + (z11 ? 1 : 0)) * 31) + this.requestCode) * 31) + this.headers.hashCode()) * 31) + this.plugins.hashCode()) * 31;
        Intent intent = this.switchToNativeIntent;
        return hashCode2 + (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        return "LynxData(url=" + this.url + ", addDefaultHeaders=" + this.addDefaultHeaders + ", requestCode=" + this.requestCode + ", headers=" + this.headers + ", plugins=" + this.plugins + ", switchToNativeIntent=" + this.switchToNativeIntent + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeString(this.url);
        parcel.writeInt(this.addDefaultHeaders ? 1 : 0);
        parcel.writeInt(this.requestCode);
        Map<String, String> map = this.headers;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
        Set<SwiggyLynxPluginData> set = this.plugins;
        parcel.writeInt(set.size());
        for (SwiggyLynxPluginData writeParcelable : set) {
            parcel.writeParcelable(writeParcelable, i11);
        }
        parcel.writeParcelable(this.switchToNativeIntent, i11);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LynxData(java.lang.String r5, boolean r6, int r7, java.util.Map r8, java.util.Set r9, android.content.Intent r10, int r11, kotlin.jvm.internal.i r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.lang.String r5 = "https://www.swiggy.com"
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000d
            r6 = 1
            r12 = 1
            goto L_0x000e
        L_0x000d:
            r12 = r6
        L_0x000e:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0017
            r7 = -9
            r0 = -9
            goto L_0x0018
        L_0x0017:
            r0 = r7
        L_0x0018:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0020
            java.util.Map r8 = kotlin.collections.x.f()
        L_0x0020:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0029
            java.util.Set r9 = kotlin.collections.d0.b()
        L_0x0029:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x002f
            r10 = 0
        L_0x002f:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.ui.LynxData.<init>(java.lang.String, boolean, int, java.util.Map, java.util.Set, android.content.Intent, int, kotlin.jvm.internal.i):void");
    }
}
