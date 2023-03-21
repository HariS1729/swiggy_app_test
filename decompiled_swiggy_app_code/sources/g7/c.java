package g7;

import com.adobe.xmp.XMPException;
import java.util.Map;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private int f14745a = 0;

    /* renamed from: b  reason: collision with root package name */
    private Map f14746b = null;

    public c() {
    }

    public c(int i11) throws XMPException {
        b(i11);
        g(i11);
    }

    private void b(int i11) throws XMPException {
        int i12 = (~e()) & i11;
        if (i12 == 0) {
            a(i11);
            return;
        }
        throw new XMPException("The option bit(s) 0x" + Integer.toHexString(i12) + " are invalid!", 103);
    }

    /* access modifiers changed from: protected */
    public void a(int i11) throws XMPException {
    }

    /* access modifiers changed from: protected */
    public boolean c(int i11) {
        return (i11 & this.f14745a) != 0;
    }

    public int d() {
        return this.f14745a;
    }

    /* access modifiers changed from: protected */
    public abstract int e();

    public boolean equals(Object obj) {
        return d() == ((c) obj).d();
    }

    public void f(int i11, boolean z11) {
        int i12;
        if (z11) {
            i12 = i11 | this.f14745a;
        } else {
            i12 = (~i11) & this.f14745a;
        }
        this.f14745a = i12;
    }

    public void g(int i11) throws XMPException {
        b(i11);
        this.f14745a = i11;
    }

    public int hashCode() {
        return d();
    }

    public String toString() {
        return "0x" + Integer.toHexString(this.f14745a);
    }
}
