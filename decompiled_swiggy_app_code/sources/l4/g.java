package l4;

/* compiled from: SystemIdInfo */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f15471a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15472b;

    public g(String str, int i11) {
        this.f15471a = str;
        this.f15472b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f15472b != gVar.f15472b) {
            return false;
        }
        return this.f15471a.equals(gVar.f15471a);
    }

    public int hashCode() {
        return (this.f15471a.hashCode() * 31) + this.f15472b;
    }
}
