package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f10839a = versionedParcel.s(audioAttributesImplBase.f10839a, 1);
        audioAttributesImplBase.f10840b = versionedParcel.s(audioAttributesImplBase.f10840b, 2);
        audioAttributesImplBase.f10841c = versionedParcel.s(audioAttributesImplBase.f10841c, 3);
        audioAttributesImplBase.f10842d = versionedParcel.s(audioAttributesImplBase.f10842d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.E(false, false);
        versionedParcel.O(audioAttributesImplBase.f10839a, 1);
        versionedParcel.O(audioAttributesImplBase.f10840b, 2);
        versionedParcel.O(audioAttributesImplBase.f10841c, 3);
        versionedParcel.O(audioAttributesImplBase.f10842d, 4);
    }
}
