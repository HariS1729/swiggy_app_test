package in.swiggy.android.searchkit.instamart;

import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: InstamartEventData.kt */
public final class InstamartEventData implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f18561e = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f18562a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18563b;

    /* renamed from: c  reason: collision with root package name */
    private final String f18564c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18565d;

    /* compiled from: InstamartEventData.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public InstamartEventData() {
        this((String) null, (String) null, (String) null, 0, 15, (i) null);
    }

    public InstamartEventData(String str, String str2, String str3, int i11) {
        this.f18562a = str;
        this.f18563b = str2;
        this.f18564c = str3;
        this.f18565d = i11;
    }

    public final String a() {
        return this.f18564c;
    }

    public final int b() {
        return this.f18565d;
    }

    public final String c() {
        return this.f18563b;
    }

    public final String d() {
        return this.f18562a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartEventData)) {
            return false;
        }
        InstamartEventData instamartEventData = (InstamartEventData) obj;
        return p.e(this.f18562a, instamartEventData.f18562a) && p.e(this.f18563b, instamartEventData.f18563b) && p.e(this.f18564c, instamartEventData.f18564c) && this.f18565d == instamartEventData.f18565d;
    }

    public int hashCode() {
        String str = this.f18562a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18563b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18564c;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return ((hashCode2 + i11) * 31) + this.f18565d;
    }

    public String toString() {
        return "InstamartEventData(queryUniqueId=" + this.f18562a + ", query=" + this.f18563b + ", grid=" + this.f18564c + ", position=" + this.f18565d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstamartEventData(String str, String str2, String str3, int i11, int i12, i iVar) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? 0 : i11);
    }
}
