package h2;

import org.apache.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: CustomVariable */
public class a {

    /* renamed from: a  reason: collision with root package name */
    String f14771a;

    /* renamed from: b  reason: collision with root package name */
    private int f14772b;

    /* renamed from: c  reason: collision with root package name */
    private int f14773c;

    /* renamed from: d  reason: collision with root package name */
    private float f14774d;

    /* renamed from: e  reason: collision with root package name */
    private String f14775e;

    /* renamed from: f  reason: collision with root package name */
    boolean f14776f;

    public a(a aVar) {
        this.f14773c = Integer.MIN_VALUE;
        this.f14774d = Float.NaN;
        this.f14775e = null;
        this.f14771a = aVar.f14771a;
        this.f14772b = aVar.f14772b;
        this.f14773c = aVar.f14773c;
        this.f14774d = aVar.f14774d;
        this.f14775e = aVar.f14775e;
        this.f14776f = aVar.f14776f;
    }

    public static String a(int i11) {
        String str = "00000000" + Integer.toHexString(i11);
        return "#" + str.substring(str.length() - 8);
    }

    public a b() {
        return new a(this);
    }

    public boolean c() {
        return this.f14776f;
    }

    public float d() {
        return this.f14774d;
    }

    public int e() {
        return this.f14773c;
    }

    public String f() {
        return this.f14771a;
    }

    public String g() {
        return this.f14775e;
    }

    public int h() {
        return this.f14772b;
    }

    public void i(float f11) {
        this.f14774d = f11;
    }

    public void j(int i11) {
        this.f14773c = i11;
    }

    public String toString() {
        String str = this.f14771a + ':';
        switch (this.f14772b) {
            case OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK /*900*/:
                return str + this.f14773c;
            case 901:
                return str + this.f14774d;
            case 902:
                return str + a(this.f14773c);
            case 903:
                return str + this.f14775e;
            case 904:
                return str + Boolean.valueOf(this.f14776f);
            case 905:
                return str + this.f14774d;
            default:
                return str + "????";
        }
    }

    public a(String str, int i11, int i12) {
        this.f14773c = Integer.MIN_VALUE;
        this.f14774d = Float.NaN;
        this.f14775e = null;
        this.f14771a = str;
        this.f14772b = i11;
        if (i11 == 901) {
            this.f14774d = (float) i12;
        } else {
            this.f14773c = i12;
        }
    }

    public a(String str, int i11, float f11) {
        this.f14773c = Integer.MIN_VALUE;
        this.f14775e = null;
        this.f14771a = str;
        this.f14772b = i11;
        this.f14774d = f11;
    }
}
