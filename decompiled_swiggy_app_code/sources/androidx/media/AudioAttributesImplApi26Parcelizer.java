package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f10837a = (AudioAttributes) versionedParcel.w(audioAttributesImplApi26.f10837a, 1);
        audioAttributesImplApi26.f10838b = versionedParcel.s(audioAttributesImplApi26.f10838b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        versionedParcel.E(false, false);
        versionedParcel.S(audioAttributesImplApi26.f10837a, 1);
        versionedParcel.O(audioAttributesImplApi26.f10838b, 2);
    }
}
