package j2;

import androidx.constraintlayout.core.parser.c;

/* compiled from: CLNumber */
public class a extends c {

    /* renamed from: f  reason: collision with root package name */
    float f15268f = Float.NaN;

    public a(char[] cArr) {
        super(cArr);
    }

    public static c r(char[] cArr) {
        return new a(cArr);
    }

    public float h() {
        if (Float.isNaN(this.f15268f)) {
            this.f15268f = Float.parseFloat(c());
        }
        return this.f15268f;
    }

    /* access modifiers changed from: protected */
    public String q() {
        float h11 = h();
        int i11 = (int) h11;
        if (((float) i11) == h11) {
            return "" + i11;
        }
        return "" + h11;
    }

    public int s() {
        if (Float.isNaN(this.f15268f)) {
            this.f15268f = (float) Integer.parseInt(c());
        }
        return (int) this.f15268f;
    }
}
