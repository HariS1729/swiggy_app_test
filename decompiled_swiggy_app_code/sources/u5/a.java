package u5;

import android.os.Build;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import z5.g;

/* compiled from: FeatureConfig */
public class a {
    @SerializedName("id")

    /* renamed from: a  reason: collision with root package name */
    private String f16993a;
    @SerializedName("enable")

    /* renamed from: b  reason: collision with root package name */
    private boolean f16994b;
    @SerializedName("override")

    /* renamed from: c  reason: collision with root package name */
    private List<b> f16995c;

    /* renamed from: u5.a$a  reason: collision with other inner class name */
    /* compiled from: FeatureConfig */
    public static class C0193a {

        /* renamed from: a  reason: collision with root package name */
        private String f16996a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f16997b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f16998c;

        /* renamed from: d  reason: collision with root package name */
        private List<b> f16999d;

        C0193a() {
        }

        public C0193a a(String str) {
            this.f16996a = str;
            return this;
        }

        public C0193a b(List<b> list) {
            this.f16999d = list;
            this.f16998c = true;
            return this;
        }

        public C0193a c(boolean z11) {
            this.f16997b = z11;
            return this;
        }

        public a d() {
            List<b> list = this.f16999d;
            if (!this.f16998c) {
                list = a.a();
            }
            return new a(this.f16996a, this.f16997b, list);
        }

        public String toString() {
            return "FeatureConfig.FeatureConfigBuilder(id=" + this.f16996a + ", enable=" + this.f16997b + ", overrides$value=" + this.f16999d + ")";
        }
    }

    /* compiled from: FeatureConfig */
    public static class b {
        @SerializedName("brand")

        /* renamed from: a  reason: collision with root package name */
        private String f17000a;
        @SerializedName("enable")

        /* renamed from: b  reason: collision with root package name */
        private boolean f17001b;
        @SerializedName("models")

        /* renamed from: c  reason: collision with root package name */
        private List<String> f17002c;

        /* renamed from: u5.a$b$a  reason: collision with other inner class name */
        /* compiled from: FeatureConfig */
        public static class C0194a {

            /* renamed from: a  reason: collision with root package name */
            private String f17003a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f17004b;

            /* renamed from: c  reason: collision with root package name */
            private boolean f17005c;

            /* renamed from: d  reason: collision with root package name */
            private List<String> f17006d;

            C0194a() {
            }

            public C0194a a(String str) {
                this.f17003a = str;
                return this;
            }

            public C0194a b(List<String> list) {
                this.f17006d = list;
                this.f17005c = true;
                return this;
            }

            public C0194a c(boolean z11) {
                this.f17004b = z11;
                return this;
            }

            public b d() {
                List<String> list = this.f17006d;
                if (!this.f17005c) {
                    list = b.a();
                }
                return new b(this.f17003a, this.f17004b, list);
            }

            public String toString() {
                return "FeatureConfig.Override.OverrideBuilder(brand=" + this.f17003a + ", enable=" + this.f17004b + ", models$value=" + this.f17006d + ")";
            }
        }

        b(String str, boolean z11, List<String> list) {
            this.f17000a = str;
            this.f17001b = z11;
            this.f17002c = list;
        }

        /* access modifiers changed from: private */
        public static List<String> a() {
            return new ArrayList();
        }

        public static C0194a d() {
            return new C0194a();
        }

        /* access modifiers changed from: protected */
        public boolean b(Object obj) {
            return obj instanceof b;
        }

        public String e() {
            return this.f17000a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.b(this) || g() != bVar.g()) {
                return false;
            }
            String e11 = e();
            String e12 = bVar.e();
            if (e11 != null ? !e11.equals(e12) : e12 != null) {
                return false;
            }
            List<String> f11 = f();
            List<String> f12 = bVar.f();
            return f11 != null ? f11.equals(f12) : f12 == null;
        }

        public List<String> f() {
            return this.f17002c;
        }

        public boolean g() {
            return this.f17001b;
        }

        public Boolean h() {
            if (!this.f17000a.equalsIgnoreCase(Build.BRAND) && !this.f17000a.equalsIgnoreCase(Build.MANUFACTURER)) {
                return null;
            }
            if (this.f17002c.isEmpty() || g.h(this.f17002c, Build.MODEL.toLowerCase())) {
                return Boolean.valueOf(this.f17001b);
            }
            return null;
        }

        public int hashCode() {
            int i11 = g() ? 79 : 97;
            String e11 = e();
            int i12 = 43;
            int hashCode = ((i11 + 59) * 59) + (e11 == null ? 43 : e11.hashCode());
            List<String> f11 = f();
            int i13 = hashCode * 59;
            if (f11 != null) {
                i12 = f11.hashCode();
            }
            return i13 + i12;
        }

        public String toString() {
            return "FeatureConfig.Override(brand=" + e() + ", enable=" + g() + ", models=" + f() + ")";
        }
    }

    a(String str, boolean z11, List<b> list) {
        this.f16993a = str;
        this.f16994b = z11;
        this.f16995c = list;
    }

    /* access modifiers changed from: private */
    public static List<b> a() {
        return new ArrayList();
    }

    public static C0193a d() {
        return new C0193a();
    }

    /* access modifiers changed from: protected */
    public boolean b(Object obj) {
        return obj instanceof a;
    }

    public String e() {
        return this.f16993a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!aVar.b(this) || g() != aVar.g()) {
            return false;
        }
        String e11 = e();
        String e12 = aVar.e();
        if (e11 != null ? !e11.equals(e12) : e12 != null) {
            return false;
        }
        List<b> f11 = f();
        List<b> f12 = aVar.f();
        return f11 != null ? f11.equals(f12) : f12 == null;
    }

    public List<b> f() {
        return this.f16995c;
    }

    public boolean g() {
        return this.f16994b;
    }

    public Boolean h() {
        for (b h11 : this.f16995c) {
            Boolean h12 = h11.h();
            if (h12 != null) {
                return h12;
            }
        }
        return Boolean.valueOf(this.f16994b);
    }

    public int hashCode() {
        int i11 = g() ? 79 : 97;
        String e11 = e();
        int i12 = 43;
        int hashCode = ((i11 + 59) * 59) + (e11 == null ? 43 : e11.hashCode());
        List<b> f11 = f();
        int i13 = hashCode * 59;
        if (f11 != null) {
            i12 = f11.hashCode();
        }
        return i13 + i12;
    }

    public String toString() {
        return "FeatureConfig(id=" + e() + ", enable=" + g() + ", overrides=" + f() + ")";
    }
}
