package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f10839a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f10840b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f10841c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f10842d = -1;

    public int a() {
        return this.f10840b;
    }

    public int b() {
        int i11 = this.f10841c;
        int c11 = c();
        if (c11 == 6) {
            i11 |= 4;
        } else if (c11 == 7) {
            i11 |= 1;
        }
        return i11 & 273;
    }

    public int c() {
        int i11 = this.f10842d;
        if (i11 != -1) {
            return i11;
        }
        return AudioAttributesCompat.a(false, this.f10841c, this.f10839a);
    }

    public int d() {
        return this.f10839a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f10840b == audioAttributesImplBase.a() && this.f10841c == audioAttributesImplBase.b() && this.f10839a == audioAttributesImplBase.d() && this.f10842d == audioAttributesImplBase.f10842d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10840b), Integer.valueOf(this.f10841c), Integer.valueOf(this.f10839a), Integer.valueOf(this.f10842d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f10842d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f10842d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f10839a));
        sb2.append(" content=");
        sb2.append(this.f10840b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f10841c).toUpperCase());
        return sb2.toString();
    }
}
