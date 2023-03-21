package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f10837a = (AudioAttributes) versionedParcel.w(audioAttributesImplApi21.f10837a, 1);
        audioAttributesImplApi21.f10838b = versionedParcel.s(audioAttributesImplApi21.f10838b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.E(false, false);
        versionedParcel.S(audioAttributesImplApi21.f10837a, 1);
        versionedParcel.O(audioAttributesImplApi21.f10838b, 2);
    }
}
