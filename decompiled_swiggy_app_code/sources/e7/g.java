package e7;

import com.adobe.xmp.XMPException;

class g {

    /* renamed from: a  reason: collision with root package name */
    private String f14396a;

    /* renamed from: b  reason: collision with root package name */
    private int f14397b = 0;

    public g(String str) {
        this.f14396a = str;
    }

    public char a() {
        if (this.f14397b < this.f14396a.length()) {
            return this.f14396a.charAt(this.f14397b);
        }
        return 0;
    }

    public char b(int i11) {
        if (i11 < this.f14396a.length()) {
            return this.f14396a.charAt(i11);
        }
        return 0;
    }

    public int c(String str, int i11) throws XMPException {
        char b11 = b(this.f14397b);
        int i12 = 0;
        boolean z11 = false;
        while ('0' <= b11 && b11 <= '9') {
            i12 = (i12 * 10) + (b11 - '0');
            int i13 = this.f14397b + 1;
            this.f14397b = i13;
            b11 = b(i13);
            z11 = true;
        }
        if (!z11) {
            throw new XMPException(str, 5);
        } else if (i12 > i11) {
            return i11;
        } else {
            if (i12 < 0) {
                return 0;
            }
            return i12;
        }
    }

    public boolean d() {
        return this.f14397b < this.f14396a.length();
    }

    public int e() {
        return this.f14397b;
    }

    public void f() {
        this.f14397b++;
    }
}
