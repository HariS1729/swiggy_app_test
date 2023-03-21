package l4;

/* compiled from: Preference */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f15466a;

    /* renamed from: b  reason: collision with root package name */
    public Long f15467b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z11) {
        this(str, z11 ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f15466a.equals(dVar.f15466a)) {
            return false;
        }
        Long l11 = this.f15467b;
        Long l12 = dVar.f15467b;
        if (l11 != null) {
            return l11.equals(l12);
        }
        if (l12 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f15466a.hashCode() * 31;
        Long l11 = this.f15467b;
        return hashCode + (l11 != null ? l11.hashCode() : 0);
    }

    public d(String str, long j) {
        this.f15466a = str;
        this.f15467b = Long.valueOf(j);
    }
}
