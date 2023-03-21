package co.hyperverge.hypersnapsdk.objects;

import java.util.HashMap;

/* compiled from: HyperKYCConfigs */
public class c {
    private HashMap<String, String> hyperKYCValueMap;
    private String sentryEndPoint;
    private String sentryFilter;
    private String sentryKey;

    /* compiled from: HyperKYCConfigs */
    public static class a {
        private HashMap<String, String> hyperKYCValueMap;
        private String sentryEndPoint;
        private String sentryFilter;
        private String sentryKey;

        a() {
        }

        public c build() {
            return new c(this.sentryKey, this.sentryEndPoint, this.sentryFilter, this.hyperKYCValueMap);
        }

        public a hyperKYCValueMap(HashMap<String, String> hashMap) {
            this.hyperKYCValueMap = hashMap;
            return this;
        }

        public a sentryEndPoint(String str) {
            this.sentryEndPoint = str;
            return this;
        }

        public a sentryFilter(String str) {
            this.sentryFilter = str;
            return this;
        }

        public a sentryKey(String str) {
            this.sentryKey = str;
            return this;
        }

        public String toString() {
            return "HyperKYCConfigs.HyperKYCConfigsBuilder(sentryKey=" + this.sentryKey + ", sentryEndPoint=" + this.sentryEndPoint + ", sentryFilter=" + this.sentryFilter + ", hyperKYCValueMap=" + this.hyperKYCValueMap + ")";
        }
    }

    c(String str, String str2, String str3, HashMap<String, String> hashMap) {
        this.sentryKey = str;
        this.sentryEndPoint = str2;
        this.sentryFilter = str3;
        this.hyperKYCValueMap = hashMap;
    }

    public static a builder() {
        return new a();
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!cVar.canEqual(this)) {
            return false;
        }
        String sentryKey2 = getSentryKey();
        String sentryKey3 = cVar.getSentryKey();
        if (sentryKey2 != null ? !sentryKey2.equals(sentryKey3) : sentryKey3 != null) {
            return false;
        }
        String sentryEndPoint2 = getSentryEndPoint();
        String sentryEndPoint3 = cVar.getSentryEndPoint();
        if (sentryEndPoint2 != null ? !sentryEndPoint2.equals(sentryEndPoint3) : sentryEndPoint3 != null) {
            return false;
        }
        String sentryFilter2 = getSentryFilter();
        String sentryFilter3 = cVar.getSentryFilter();
        if (sentryFilter2 != null ? !sentryFilter2.equals(sentryFilter3) : sentryFilter3 != null) {
            return false;
        }
        HashMap<String, String> hyperKYCValueMap2 = getHyperKYCValueMap();
        HashMap<String, String> hyperKYCValueMap3 = cVar.getHyperKYCValueMap();
        return hyperKYCValueMap2 != null ? hyperKYCValueMap2.equals(hyperKYCValueMap3) : hyperKYCValueMap3 == null;
    }

    public HashMap<String, String> getHyperKYCValueMap() {
        return this.hyperKYCValueMap;
    }

    public String getSentryEndPoint() {
        return this.sentryEndPoint;
    }

    public String getSentryFilter() {
        return this.sentryFilter;
    }

    public String getSentryKey() {
        return this.sentryKey;
    }

    public int hashCode() {
        String sentryKey2 = getSentryKey();
        int i11 = 43;
        int hashCode = sentryKey2 == null ? 43 : sentryKey2.hashCode();
        String sentryEndPoint2 = getSentryEndPoint();
        int hashCode2 = ((hashCode + 59) * 59) + (sentryEndPoint2 == null ? 43 : sentryEndPoint2.hashCode());
        String sentryFilter2 = getSentryFilter();
        int hashCode3 = (hashCode2 * 59) + (sentryFilter2 == null ? 43 : sentryFilter2.hashCode());
        HashMap<String, String> hyperKYCValueMap2 = getHyperKYCValueMap();
        int i12 = hashCode3 * 59;
        if (hyperKYCValueMap2 != null) {
            i11 = hyperKYCValueMap2.hashCode();
        }
        return i12 + i11;
    }

    public void setHyperKYCValueMap(HashMap<String, String> hashMap) {
        this.hyperKYCValueMap = hashMap;
    }

    public void setSentryEndPoint(String str) {
        this.sentryEndPoint = str;
    }

    public void setSentryFilter(String str) {
        this.sentryFilter = str;
    }

    public void setSentryKey(String str) {
        this.sentryKey = str;
    }

    public String toString() {
        return "HyperKYCConfigs(sentryKey=" + getSentryKey() + ", sentryEndPoint=" + getSentryEndPoint() + ", sentryFilter=" + getSentryFilter() + ", hyperKYCValueMap=" + getHyperKYCValueMap() + ")";
    }
}
