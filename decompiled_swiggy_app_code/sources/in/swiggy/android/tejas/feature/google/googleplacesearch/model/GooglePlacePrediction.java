package in.swiggy.android.tejas.feature.google.googleplacesearch.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import in.swiggy.android.tejas.utils.GooglePlaceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.p;
import os.d0;

@Instrumented
/* compiled from: GooglePlacePrediction.kt */
public final class GooglePlacePrediction {
    private String area;
    private String areaName;
    private String cityAndState;
    @SerializedName("description")
    private String description;
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private String f20227id;
    @SerializedName("place_id")
    private String placeId;
    @SerializedName("structured_formatting")
    private GooglePlaceStructuredFormatting structuredFormatting;
    @SerializedName("terms")
    private List<GooglePlacePredictionTerm> terms = new ArrayList();
    @SerializedName("types")
    private List<String> types = new ArrayList();

    public final String getArea() {
        String str = this.area;
        if (str != null) {
            return str;
        }
        String str2 = this.description;
        List<GooglePlacePredictionTerm> list = this.terms;
        return (list != null && (list.isEmpty() ^ true)) ? list.get(0).getValue() : str2;
    }

    public final String getAreaName() {
        String str = this.areaName;
        if (str != null) {
            return str;
        }
        List<GooglePlacePredictionTerm> list = this.terms;
        if (list == null || !(!list.isEmpty()) || list.size() <= 2) {
            return this.description;
        }
        ArrayList arrayList = new ArrayList();
        List<GooglePlacePredictionTerm> list2 = this.terms;
        List<GooglePlacePredictionTerm> subList = list2 == null ? null : list2.subList(0, 2);
        if (subList != null) {
            for (GooglePlacePredictionTerm value : subList) {
                String value2 = value.getValue();
                if (value2 != null) {
                    arrayList.add(value2);
                }
            }
        }
        return d0.h(arrayList, ", ");
    }

    public final String getCityAndState() {
        String str = this.cityAndState;
        if (str != null) {
            return str;
        }
        List<GooglePlacePredictionTerm> list = this.terms;
        if (list == null || !(!list.isEmpty()) || list.size() <= 3) {
            return "";
        }
        int size = list.size() - 3;
        int size2 = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        if (size < size2) {
            Iterator it2 = new ArrayList(list.subList(size, size2)).iterator();
            while (it2.hasNext()) {
                String value = ((GooglePlacePredictionTerm) it2.next()).getValue();
                if (value != null) {
                    arrayList.add(value);
                }
            }
        } else {
            String value2 = list.get(size).getValue();
            if (value2 != null) {
                arrayList.add(value2);
            }
        }
        return d0.h(arrayList, ", ");
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f20227id;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r0 = r0.getSecondaryText();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getPlaceSearchSubTitle() {
        /*
            r5 = this;
            java.util.List<in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlacePredictionTerm> r0 = r5.terms
            if (r0 == 0) goto L_0x0048
            boolean r1 = r0.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0048
            int r1 = r0.size()
            r3 = 2
            if (r1 <= r3) goto L_0x0048
            int r1 = r0.size()
            int r1 = r1 - r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r0 = r0.subList(r2, r1)
            r4.<init>(r0)
            java.util.Iterator r0 = r4.iterator()
        L_0x002a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r0.next()
            in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlacePredictionTerm r1 = (in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlacePredictionTerm) r1
            java.lang.String r1 = r1.getValue()
            if (r1 != 0) goto L_0x003d
            goto L_0x002a
        L_0x003d:
            r3.add(r1)
            goto L_0x002a
        L_0x0041:
            java.lang.String r0 = ", "
            java.lang.String r0 = os.d0.h(r3, r0)
            return r0
        L_0x0048:
            in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlaceStructuredFormatting r0 = r5.structuredFormatting
            r1 = 0
            if (r0 != 0) goto L_0x004f
        L_0x004d:
            r0 = r1
            goto L_0x005e
        L_0x004f:
            java.lang.String r0 = r0.getSecondaryText()
            if (r0 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0056:
            boolean r0 = in.swiggy.android.commons.extension.StringExtensionsKt.d(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x005e:
            boolean r0 = js.c.h(r0)
            if (r0 == 0) goto L_0x006e
            in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlaceStructuredFormatting r0 = r5.structuredFormatting
            if (r0 != 0) goto L_0x0069
            goto L_0x006d
        L_0x0069:
            java.lang.String r1 = r0.getSecondaryText()
        L_0x006d:
            return r1
        L_0x006e:
            java.lang.String r0 = r5.getCityAndState()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlacePrediction.getPlaceSearchSubTitle():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r0.getMainText();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getPlaceSearchTitle() {
        /*
            r2 = this;
            in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlaceStructuredFormatting r0 = r2.structuredFormatting
            r1 = 0
            if (r0 != 0) goto L_0x0007
        L_0x0005:
            r0 = r1
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = r0.getMainText()
            if (r0 != 0) goto L_0x000e
            goto L_0x0005
        L_0x000e:
            boolean r0 = in.swiggy.android.commons.extension.StringExtensionsKt.d(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0016:
            boolean r0 = js.c.h(r0)
            if (r0 == 0) goto L_0x0026
            in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlaceStructuredFormatting r0 = r2.structuredFormatting
            if (r0 != 0) goto L_0x0021
            goto L_0x002a
        L_0x0021:
            java.lang.String r1 = r0.getMainText()
            goto L_0x002a
        L_0x0026:
            java.lang.String r1 = r2.getAreaName()
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlacePrediction.getPlaceSearchTitle():java.lang.String");
    }

    public final GooglePlaceStructuredFormatting getStructuredFormatting() {
        return this.structuredFormatting;
    }

    public final List<GooglePlacePredictionTerm> getTerms() {
        return this.terms;
    }

    public final String getType() {
        List<String> list = this.types;
        String str = null;
        if (list != null && (!list.isEmpty())) {
            str = list.get(0);
        }
        return str;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final boolean isAcceptableForAddLocation() {
        List<String> list = this.types;
        if (!(list == null || list.isEmpty())) {
            List<String> list2 = this.types;
            p.g(list2);
            for (String contains : list2) {
                if (GooglePlaceConstants.notAllowed.contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void setArea(String str) {
        this.area = str;
    }

    public final void setAreaName(String str) {
        this.areaName = str;
    }

    public final void setCityAndState(String str) {
        this.cityAndState = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setId(String str) {
        this.f20227id = str;
    }

    public final void setPlaceId(String str) {
        this.placeId = str;
    }

    public final void setStructuredFormatting(GooglePlaceStructuredFormatting googlePlaceStructuredFormatting) {
        this.structuredFormatting = googlePlaceStructuredFormatting;
    }

    public final void setTerms(List<GooglePlacePredictionTerm> list) {
        this.terms = list;
    }

    public final void setTypes(List<String> list) {
        this.types = list;
    }

    public String toString() {
        String json = GsonInstrumentation.toJson(new Gson(), (Object) this);
        p.i(json, "Gson().toJson(this)");
        return json;
    }
}
