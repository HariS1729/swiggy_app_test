package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f10837a;

    /* renamed from: b  reason: collision with root package name */
    public int f10838b;

    public AudioAttributesImplApi21() {
        this.f10838b = -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f10837a.equals(((AudioAttributesImplApi21) obj).f10837a);
    }

    public int hashCode() {
        return this.f10837a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f10837a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i11) {
        this.f10837a = audioAttributes;
        this.f10838b = i11;
    }
}
