package in.swiggy.android.tejas.feature.google.googlereversegeocode.model;

import android.location.Address;
import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.Regex;
import os.d0;

@Instrumented
/* compiled from: GeocodedAddress.kt */
public final class GeocodedAddress implements Serializable {
    public static final Companion Companion = new Companion((i) null);
    public static final String TAG = "GeocodedAddress";
    @SerializedName("addressLines")
    private List<String> addressLines = new ArrayList(1);
    @SerializedName("adminArea")
    private String adminArea;
    @SerializedName("area")
    private String area = "";
    @SerializedName("areaAndState")
    private String areaAndState = "";
    @SerializedName("city")
    private String city = "";
    @SerializedName("countryCode")
    private String countryCode;
    @SerializedName("countryName")
    private String countryName;
    @SerializedName("displayableAddress")
    private String displayableAddress = "";
    @SerializedName("featureName")
    private String featureName;
    @SerializedName("googlePlace")
    private GooglePlace googlePlace;
    @SerializedName("hasLatitude")
    private boolean hasLatitude;
    @SerializedName("hasLongitude")
    private boolean hasLongitude;
    @SerializedName("latitude")
    private double latitude;
    @SerializedName("locality")
    private String locality;
    @SerializedName("longitude")
    private double longitude;
    @SerializedName("maxAddressLineIndex")
    private int maxAddressLineIndex = -1;
    @SerializedName("phone")
    private String phone;
    @SerializedName("postalCode")
    private String postalCode;
    @SerializedName("premises")
    private String premises;
    @SerializedName("roofTopArea")
    private String roofTopArea = "";
    @SerializedName("subAdminArea")
    private String subAdminArea;
    @SerializedName("subLocality")
    private String subLocality;
    @SerializedName("subThoroughfare")
    private String subThoroughfare;
    @SerializedName("thoroughfare")
    private String thoroughfare;
    @SerializedName("url")
    private String url;

    /* compiled from: GeocodedAddress.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public GeocodedAddress(LatLng latLng, String str, String str2, String str3) {
        p.j(latLng, "coordinates");
        p.j(str, "displayableAddress");
        p.j(str2, "city");
        p.j(str3, "area");
        this.latitude = latLng.f43937a;
        this.longitude = latLng.f43938b;
        this.displayableAddress = str;
        this.city = str2;
        this.area = str3;
    }

    private final String getAreaAndStateFromGooglePlace(GooglePlace googlePlace2) {
        String secondLevelName = googlePlace2.getSecondLevelName();
        boolean z11 = false;
        if (!(secondLevelName == null || o.A(secondLevelName))) {
            String thirdLevelName = googlePlace2.getThirdLevelName();
            if (!(thirdLevelName == null || o.A(thirdLevelName))) {
                return googlePlace2.getSecondLevelName() + ", " + googlePlace2.getThirdLevelName();
            }
        }
        String thirdLevelName2 = googlePlace2.getThirdLevelName();
        if (thirdLevelName2 == null || o.A(thirdLevelName2)) {
            z11 = true;
        }
        if (!z11) {
            return googlePlace2.getThirdLevelName();
        }
        return googlePlace2.getSecondLevelName();
    }

    public final List<String> getAddressLines() {
        return this.addressLines;
    }

    public final String getAdminArea() {
        return this.adminArea;
    }

    public final String getArea() {
        Object[] objArr;
        String str;
        String str2;
        List list;
        boolean z11;
        if (d0.e(this.area)) {
            List<String> list2 = this.addressLines;
            String str3 = null;
            String join = list2 == null ? null : TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, list2);
            if (join == null) {
                objArr = null;
            } else {
                List<String> i11 = new Regex(Constants.ACCEPT_TIME_SEPARATOR_SP).i(join, 0);
                if (!i11.isEmpty()) {
                    ListIterator<String> listIterator = i11.listIterator(i11.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        if (listIterator.previous().length() == 0) {
                            z11 = true;
                            continue;
                        } else {
                            z11 = false;
                            continue;
                        }
                        if (!z11) {
                            list = s.x0(i11, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    objArr = list.toArray(new String[0]);
                    Objects.requireNonNull(objArr, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                list = k.j();
                objArr = list.toArray(new String[0]);
                Objects.requireNonNull(objArr, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) objArr;
            int length = strArr == null ? 0 : strArr.length;
            if (length > 3) {
                if (strArr == null) {
                    str2 = null;
                } else {
                    str2 = strArr[length - 3];
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(", ");
                if (strArr != null) {
                    str3 = strArr[length - 2];
                }
                sb2.append(str3);
                str = sb2.toString();
            } else {
                if (length == 3) {
                    if (strArr != null) {
                        str3 = strArr[length - 2];
                    }
                } else if (length <= 0) {
                    str = "";
                } else if (strArr != null) {
                    str3 = strArr[0];
                }
                str = str3;
            }
            if (str != null) {
                this.area = StringsKt__StringsKt.i1(str).toString();
            }
        }
        return this.area;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r0 == false) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getAreaAndState() {
        /*
            r6 = this;
            java.lang.String r0 = r6.areaAndState
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            r0 = 0
            goto L_0x0016
        L_0x000a:
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 != r1) goto L_0x0008
            r0 = 1
        L_0x0016:
            if (r0 == 0) goto L_0x00bf
        L_0x0018:
            java.util.List<java.lang.String> r0 = r6.addressLines
            java.lang.String r3 = ","
            r4 = 0
            if (r0 != 0) goto L_0x0021
            r0 = r4
            goto L_0x0025
        L_0x0021:
            java.lang.String r0 = android.text.TextUtils.join(r3, r0)
        L_0x0025:
            if (r0 != 0) goto L_0x0029
            r0 = r4
            goto L_0x0070
        L_0x0029:
            kotlin.text.Regex r5 = new kotlin.text.Regex
            r5.<init>((java.lang.String) r3)
            java.util.List r0 = r5.i(r0, r2)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0061
            int r3 = r0.size()
            java.util.ListIterator r3 = r0.listIterator(r3)
        L_0x0040:
            boolean r5 = r3.hasPrevious()
            if (r5 == 0) goto L_0x0061
            java.lang.Object r5 = r3.previous()
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0054
            r5 = 1
            goto L_0x0055
        L_0x0054:
            r5 = 0
        L_0x0055:
            if (r5 != 0) goto L_0x0040
            int r3 = r3.nextIndex()
            int r3 = r3 + r1
            java.util.List r0 = kotlin.collections.s.x0(r0, r3)
            goto L_0x0065
        L_0x0061:
            java.util.List r0 = kotlin.collections.k.j()
        L_0x0065:
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.util.Objects.requireNonNull(r0, r1)
        L_0x0070:
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L_0x0076
            r1 = 0
            goto L_0x0077
        L_0x0076:
            int r1 = r0.length
        L_0x0077:
            r3 = 3
            if (r1 <= r3) goto L_0x009e
            if (r0 != 0) goto L_0x007e
            r2 = r4
            goto L_0x0082
        L_0x007e:
            int r2 = r1 + -3
            r2 = r0[r2]
        L_0x0082:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ", "
            r3.append(r2)
            if (r0 != 0) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            int r1 = r1 + -2
            r4 = r0[r1]
        L_0x0096:
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            goto L_0x00b3
        L_0x009e:
            if (r1 != r3) goto L_0x00a9
            if (r0 != 0) goto L_0x00a3
            goto L_0x00a7
        L_0x00a3:
            int r1 = r1 + -2
            r4 = r0[r1]
        L_0x00a7:
            r0 = r4
            goto L_0x00b3
        L_0x00a9:
            if (r1 <= 0) goto L_0x00b1
            if (r0 != 0) goto L_0x00ae
            goto L_0x00a7
        L_0x00ae:
            r4 = r0[r2]
            goto L_0x00a7
        L_0x00b1:
            java.lang.String r0 = ""
        L_0x00b3:
            if (r0 == 0) goto L_0x00bf
            java.lang.CharSequence r0 = kotlin.text.StringsKt__StringsKt.i1(r0)
            java.lang.String r0 = r0.toString()
            r6.areaAndState = r0
        L_0x00bf:
            java.lang.String r0 = r6.areaAndState
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress.getAreaAndState():java.lang.String");
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r0 == false) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getDisplayableAddress() {
        /*
            r8 = this;
            java.lang.String r0 = r8.displayableAddress
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            r0 = 0
            goto L_0x0016
        L_0x000a:
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 != r1) goto L_0x0008
            r0 = 1
        L_0x0016:
            if (r0 == 0) goto L_0x00e6
        L_0x0018:
            java.util.List<java.lang.String> r0 = r8.addressLines
            java.lang.String r3 = ", "
            java.lang.String r4 = ""
            if (r0 != 0) goto L_0x0022
            r5 = r4
            goto L_0x0069
        L_0x0022:
            java.util.Iterator r0 = r0.iterator()
            r5 = r4
        L_0x0027:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0069
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.CharSequence r7 = kotlin.text.StringsKt__StringsKt.i1(r6)
            java.lang.String r7 = r7.toString()
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x0043
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x0027
            int r7 = r5.length()
            if (r7 != 0) goto L_0x004e
            r7 = 1
            goto L_0x004f
        L_0x004e:
            r7 = 0
        L_0x004f:
            if (r7 == 0) goto L_0x0056
            java.lang.String r5 = kotlin.jvm.internal.p.s(r5, r6)
            goto L_0x0027
        L_0x0056:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r3)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            goto L_0x0027
        L_0x0069:
            java.lang.String r0 = r8.featureName     // Catch:{ Exception -> 0x009a }
            if (r0 == 0) goto L_0x00a0
            if (r0 != 0) goto L_0x0071
        L_0x006f:
            r1 = 0
            goto L_0x007e
        L_0x0071:
            kotlin.text.Regex r6 = new kotlin.text.Regex     // Catch:{ Exception -> 0x009a }
            java.lang.String r7 = ".*\\d+.*"
            r6.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x009a }
            boolean r0 = r6.e(r0)     // Catch:{ Exception -> 0x009a }
            if (r0 != r1) goto L_0x006f
        L_0x007e:
            if (r1 == 0) goto L_0x00a0
            kotlin.text.Regex r0 = new kotlin.text.Regex     // Catch:{ Exception -> 0x009a }
            java.lang.String r1 = r8.featureName     // Catch:{ Exception -> 0x009a }
            java.lang.String r6 = ","
            java.lang.String r1 = kotlin.jvm.internal.p.s(r1, r6)     // Catch:{ Exception -> 0x009a }
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x009a }
            java.lang.String r0 = r0.h(r5, r4)     // Catch:{ Exception -> 0x009a }
            java.lang.CharSequence r0 = kotlin.text.StringsKt__StringsKt.i1(r0)     // Catch:{ Exception -> 0x009a }
            java.lang.String r5 = r0.toString()     // Catch:{ Exception -> 0x009a }
            goto L_0x00a0
        L_0x009a:
            r0 = move-exception
            java.lang.String r1 = "GeocodedAddress"
            os.u.h(r1, r0)
        L_0x00a0:
            java.lang.CharSequence r0 = kotlin.text.StringsKt__StringsKt.i1(r5)
            java.lang.String r0 = r0.toString()
            r8.displayableAddress = r0
            java.lang.String r0 = r8.premises
            boolean r0 = os.d0.g(r0)
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = r8.premises
            if (r0 != 0) goto L_0x00b7
            goto L_0x00cc
        L_0x00b7:
            java.lang.String r1 = r8.displayableAddress
            r4 = 0
            if (r1 != 0) goto L_0x00bd
            goto L_0x00c6
        L_0x00bd:
            r5 = 2
            boolean r0 = kotlin.text.StringsKt__StringsKt.S(r1, r0, r2, r5, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x00c6:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.p.e(r4, r0)
        L_0x00cc:
            if (r2 != 0) goto L_0x00e6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.premises
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r8.displayableAddress
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.displayableAddress = r0
        L_0x00e6:
            java.lang.String r0 = r8.displayableAddress
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress.getDisplayableAddress():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getDisplayableAddressContentDescription() {
        /*
            r8 = this;
            java.lang.String r0 = r8.displayableAddress
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            r3 = 0
            goto L_0x0016
        L_0x000a:
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0012
            r3 = 1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            if (r3 != r1) goto L_0x0008
            r3 = 1
        L_0x0016:
            if (r3 == 0) goto L_0x00a3
        L_0x0018:
            java.util.List<java.lang.String> r0 = r8.addressLines
            r3 = 0
            if (r0 != 0) goto L_0x001f
            r0 = r3
            goto L_0x0025
        L_0x001f:
            java.lang.Object r0 = kotlin.collections.s.W(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0025:
            java.lang.String r4 = ""
            java.lang.String r0 = kotlin.jvm.internal.p.s(r4, r0)
            java.lang.String r5 = r8.featureName     // Catch:{ Exception -> 0x005c }
            if (r5 == 0) goto L_0x0062
            if (r5 != 0) goto L_0x0033
        L_0x0031:
            r1 = 0
            goto L_0x0040
        L_0x0033:
            kotlin.text.Regex r6 = new kotlin.text.Regex     // Catch:{ Exception -> 0x005c }
            java.lang.String r7 = ".*\\d+.*"
            r6.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x005c }
            boolean r5 = r6.e(r5)     // Catch:{ Exception -> 0x005c }
            if (r5 != r1) goto L_0x0031
        L_0x0040:
            if (r1 == 0) goto L_0x0062
            kotlin.text.Regex r1 = new kotlin.text.Regex     // Catch:{ Exception -> 0x005c }
            java.lang.String r5 = r8.featureName     // Catch:{ Exception -> 0x005c }
            java.lang.String r6 = ","
            java.lang.String r5 = kotlin.jvm.internal.p.s(r5, r6)     // Catch:{ Exception -> 0x005c }
            r1.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x005c }
            java.lang.String r1 = r1.h(r0, r4)     // Catch:{ Exception -> 0x005c }
            java.lang.CharSequence r1 = kotlin.text.StringsKt__StringsKt.i1(r1)     // Catch:{ Exception -> 0x005c }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x005c }
            goto L_0x0062
        L_0x005c:
            r1 = move-exception
            java.lang.String r4 = "GeocodedAddress"
            os.u.h(r4, r1)
        L_0x0062:
            java.lang.CharSequence r0 = kotlin.text.StringsKt__StringsKt.i1(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r8.premises
            boolean r1 = os.d0.g(r1)
            if (r1 == 0) goto L_0x00a3
            java.lang.String r1 = r8.premises
            if (r1 != 0) goto L_0x0077
            goto L_0x008b
        L_0x0077:
            java.lang.String r4 = r8.displayableAddress
            if (r4 != 0) goto L_0x007c
            goto L_0x0085
        L_0x007c:
            r5 = 2
            boolean r1 = kotlin.text.StringsKt__StringsKt.S(r4, r1, r2, r5, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
        L_0x0085:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.p.e(r3, r1)
        L_0x008b:
            if (r2 != 0) goto L_0x00a3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.premises
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress.getDisplayableAddressContentDescription():java.lang.String");
    }

    public final String getEntryForAddress() {
        List<String> list;
        String str;
        List<String> list2 = this.addressLines;
        boolean z11 = true;
        if (list2 != null && c.f(Integer.valueOf(list2.size()), 1)) {
            List<String> list3 = this.addressLines;
            if (list3 == null || (str = list3.get(1)) == null) {
                return "";
            }
        } else {
            List<String> list4 = this.addressLines;
            if (list4 == null || !c.f(Integer.valueOf(list4.size()), 0)) {
                z11 = false;
            }
            if (!z11 || (list = this.addressLines) == null || (str = list.get(0)) == null) {
                return "";
            }
        }
        return str;
    }

    public final String getFeatureName() {
        return this.featureName;
    }

    public final GooglePlace getGooglePlace() {
        return this.googlePlace;
    }

    public final boolean getHasLatitude() {
        return this.hasLatitude;
    }

    public final boolean getHasLongitude() {
        return this.hasLongitude;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final int getMaxAddressLineIndex() {
        return this.maxAddressLineIndex;
    }

    public final String getName() {
        List<String> list;
        String str;
        List<String> list2 = this.addressLines;
        boolean z11 = true;
        if (list2 == null || !(!list2.isEmpty())) {
            z11 = false;
        }
        if (!z11 || (list = this.addressLines) == null || (str = list.get(0)) == null) {
            return "";
        }
        return str;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getPremises() {
        return this.premises;
    }

    public final String getRoofTopArea() {
        return this.roofTopArea;
    }

    public final String getSubAdminArea() {
        return this.subAdminArea;
    }

    public final String getSubLocality() {
        return this.subLocality;
    }

    public final String getSubName() {
        List<String> list;
        String str;
        List<String> list2 = this.addressLines;
        boolean z11 = false;
        if (list2 != null && c.f(Integer.valueOf(list2.size()), 1)) {
            z11 = true;
        }
        if (!z11 || (list = this.addressLines) == null || (str = list.get(1)) == null) {
            return "";
        }
        return str;
    }

    public final String getSubThoroughfare() {
        return this.subThoroughfare;
    }

    public final String getThoroughfare() {
        return this.thoroughfare;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setAddressLines(List<String> list) {
        this.addressLines = list;
    }

    public final void setAdminArea(String str) {
        this.adminArea = str;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final void setCountryName(String str) {
        this.countryName = str;
    }

    public final void setDisplayableAddress(String str) {
        this.displayableAddress = str;
        if (str != null && d0.g(this.premises)) {
            String str2 = this.premises;
            boolean z11 = false;
            if (str2 != null) {
                String str3 = this.displayableAddress;
                Boolean bool = null;
                if (str3 != null) {
                    bool = Boolean.valueOf(StringsKt__StringsKt.S(str3, str2, false, 2, (Object) null));
                }
                z11 = p.e(bool, Boolean.TRUE);
            }
            if (!z11) {
                this.displayableAddress = this.premises + ", " + this.displayableAddress;
            }
        }
    }

    public final void setFeatureName(String str) {
        this.featureName = str;
    }

    public final void setGooglePlace(GooglePlace googlePlace2) {
        this.googlePlace = googlePlace2;
    }

    public final void setHasLatitude(boolean z11) {
        this.hasLatitude = z11;
    }

    public final void setHasLongitude(boolean z11) {
        this.hasLongitude = z11;
    }

    public final void setLatitude(double d11) {
        this.latitude = d11;
    }

    public final void setLocality(String str) {
        this.locality = str;
    }

    public final void setLongitude(double d11) {
        this.longitude = d11;
    }

    public final void setMaxAddressLineIndex(int i11) {
        this.maxAddressLineIndex = i11;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setPostalCode(String str) {
        this.postalCode = str;
    }

    public final void setPremises(String str) {
        this.premises = str;
    }

    public final void setRoofTopArea(String str) {
        this.roofTopArea = str;
    }

    public final void setSubAdminArea(String str) {
        this.subAdminArea = str;
    }

    public final void setSubLocality(String str) {
        this.subLocality = str;
    }

    public final void setSubThoroughfare(String str) {
        this.subThoroughfare = str;
    }

    public final void setThoroughfare(String str) {
        this.thoroughfare = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final GooglePlace toGooglePlace() {
        GooglePlace googlePlace2 = new GooglePlace();
        GooglePlaceLocation googlePlaceLocation = new GooglePlaceLocation(0.0d, 0.0d, 3, (i) null);
        GooglePlaceGeometry googlePlaceGeometry = new GooglePlaceGeometry((GooglePlaceLocation) null, (String) null, 3, (i) null);
        googlePlaceLocation.setLatitude(this.latitude);
        googlePlaceLocation.setLongitude(this.longitude);
        googlePlaceGeometry.setLocation(googlePlaceLocation);
        googlePlace2.setSubLocality1(this.subLocality);
        googlePlace2.setFormattedAddress(this.displayableAddress);
        googlePlace2.setLocality(this.areaAndState);
        googlePlace2.setPlaceId(this.featureName + ", " + this.premises);
        googlePlace2.setGeometry(googlePlaceGeometry);
        googlePlace2.setCity(this.city);
        return googlePlace2;
    }

    public String toString() {
        String json = GsonInstrumentation.toJson(new Gson(), (Object) this);
        p.i(json, "Gson().toJson(this)");
        return json;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        r0 = r0.getLocation();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GeocodedAddress(in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace r6) {
        /*
            r5 = this;
            java.lang.String r0 = "googlePlace"
            kotlin.jvm.internal.p.j(r6, r0)
            r5.<init>()
            r0 = -1
            r5.maxAddressLineIndex = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r5.addressLines = r0
            java.lang.String r0 = ""
            r5.displayableAddress = r0
            r5.area = r0
            r5.areaAndState = r0
            r5.city = r0
            r5.roofTopArea = r0
            in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceGeometry r0 = r6.getGeometry()
            r1 = 0
            if (r0 != 0) goto L_0x0029
        L_0x0027:
            r3 = r1
            goto L_0x0034
        L_0x0029:
            in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceLocation r0 = r0.getLocation()
            if (r0 != 0) goto L_0x0030
            goto L_0x0027
        L_0x0030:
            double r3 = r0.getLatitude()
        L_0x0034:
            r5.latitude = r3
            in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceGeometry r0 = r6.getGeometry()
            if (r0 != 0) goto L_0x003d
            goto L_0x0048
        L_0x003d:
            in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceLocation r0 = r0.getLocation()
            if (r0 != 0) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            double r1 = r0.getLongitude()
        L_0x0048:
            r5.longitude = r1
            java.lang.String r0 = r6.getFirstLevelName()
            r5.premises = r0
            java.lang.String r0 = r6.getSecondLevelName()
            r5.subLocality = r0
            java.lang.String r0 = r6.getAddressString()
            r5.displayableAddress = r0
            java.lang.String r0 = r5.getAreaAndStateFromGooglePlace(r6)
            r5.areaAndState = r0
            java.lang.String r0 = r6.getCity()
            r5.city = r0
            java.lang.String r0 = r6.getArea()
            r5.area = r0
            java.lang.String r0 = r6.getRoofTopArea()
            r5.roofTopArea = r0
            r5.googlePlace = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress.<init>(in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace):void");
    }

    public GeocodedAddress(Address address) {
        p.j(address, "address");
        this.featureName = address.getFeatureName();
        this.adminArea = address.getAdminArea();
        this.countryCode = address.getCountryCode();
        this.countryName = address.getCountryName();
        this.hasLatitude = address.hasLatitude();
        this.hasLongitude = address.hasLongitude();
        this.locality = address.getLocality();
        this.latitude = address.getLatitude();
        this.longitude = address.getLongitude();
        this.maxAddressLineIndex = address.getMaxAddressLineIndex();
        this.addressLines = new ArrayList();
        int i11 = this.maxAddressLineIndex;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                List<String> list = this.addressLines;
                if (list != null) {
                    String addressLine = address.getAddressLine(i12);
                    p.i(addressLine, "address.getAddressLine(i)");
                    list.add(addressLine);
                }
                if (i12 == i11) {
                    break;
                }
                i12 = i13;
            }
        }
        this.areaAndState = getAreaAndState();
        this.phone = address.getPhone();
        this.postalCode = address.getPostalCode();
        this.premises = address.getPremises();
        this.subAdminArea = address.getSubAdminArea();
        this.subLocality = address.getSubLocality();
        this.subThoroughfare = address.getSubThoroughfare();
        this.thoroughfare = address.getThoroughfare();
        this.url = address.getUrl();
        this.city = address.getLocality();
    }
}
