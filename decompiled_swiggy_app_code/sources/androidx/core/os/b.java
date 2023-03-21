package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.p;

/* compiled from: Bundle.kt */
public final class b {
    public static final Bundle a(Pair<String, ? extends Object>... pairArr) {
        p.j(pairArr, "pairs");
        Bundle bundle = new Bundle(pairArr.length);
        int length = pairArr.length;
        int i11 = 0;
        while (i11 < length) {
            Pair<String, ? extends Object> pair = pairArr[i11];
            i11++;
            String a11 = pair.a();
            Object b11 = pair.b();
            if (b11 == null) {
                bundle.putString(a11, (String) null);
            } else if (b11 instanceof Boolean) {
                bundle.putBoolean(a11, ((Boolean) b11).booleanValue());
            } else if (b11 instanceof Byte) {
                bundle.putByte(a11, ((Number) b11).byteValue());
            } else if (b11 instanceof Character) {
                bundle.putChar(a11, ((Character) b11).charValue());
            } else if (b11 instanceof Double) {
                bundle.putDouble(a11, ((Number) b11).doubleValue());
            } else if (b11 instanceof Float) {
                bundle.putFloat(a11, ((Number) b11).floatValue());
            } else if (b11 instanceof Integer) {
                bundle.putInt(a11, ((Number) b11).intValue());
            } else if (b11 instanceof Long) {
                bundle.putLong(a11, ((Number) b11).longValue());
            } else if (b11 instanceof Short) {
                bundle.putShort(a11, ((Number) b11).shortValue());
            } else if (b11 instanceof Bundle) {
                bundle.putBundle(a11, (Bundle) b11);
            } else if (b11 instanceof CharSequence) {
                bundle.putCharSequence(a11, (CharSequence) b11);
            } else if (b11 instanceof Parcelable) {
                bundle.putParcelable(a11, (Parcelable) b11);
            } else if (b11 instanceof boolean[]) {
                bundle.putBooleanArray(a11, (boolean[]) b11);
            } else if (b11 instanceof byte[]) {
                bundle.putByteArray(a11, (byte[]) b11);
            } else if (b11 instanceof char[]) {
                bundle.putCharArray(a11, (char[]) b11);
            } else if (b11 instanceof double[]) {
                bundle.putDoubleArray(a11, (double[]) b11);
            } else if (b11 instanceof float[]) {
                bundle.putFloatArray(a11, (float[]) b11);
            } else if (b11 instanceof int[]) {
                bundle.putIntArray(a11, (int[]) b11);
            } else if (b11 instanceof long[]) {
                bundle.putLongArray(a11, (long[]) b11);
            } else if (b11 instanceof short[]) {
                bundle.putShortArray(a11, (short[]) b11);
            } else if (b11 instanceof Object[]) {
                Class<?> componentType = b11.getClass().getComponentType();
                p.g(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(a11, (Parcelable[]) b11);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(a11, (String[]) b11);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(a11, (CharSequence[]) b11);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(a11, (Serializable) b11);
                } else {
                    String canonicalName = componentType.getCanonicalName();
                    throw new IllegalArgumentException("Illegal value array type " + canonicalName + " for key \"" + a11 + '\"');
                }
            } else if (b11 instanceof Serializable) {
                bundle.putSerializable(a11, (Serializable) b11);
            } else if (b11 instanceof IBinder) {
                bundle.putBinder(a11, (IBinder) b11);
            } else if (b11 instanceof Size) {
                bundle.putSize(a11, (Size) b11);
            } else if (b11 instanceof SizeF) {
                bundle.putSizeF(a11, (SizeF) b11);
            } else {
                String canonicalName2 = b11.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + canonicalName2 + " for key \"" + a11 + '\"');
            }
        }
        return bundle;
    }
}
