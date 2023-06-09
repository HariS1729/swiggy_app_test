package i2;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: KeyCache */
public class d {

    /* renamed from: a  reason: collision with root package name */
    HashMap<Object, HashMap<String, float[]>> f14924a = new HashMap<>();

    public float a(Object obj, String str, int i11) {
        HashMap hashMap;
        float[] fArr;
        if (this.f14924a.containsKey(obj) && (hashMap = this.f14924a.get(obj)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > i11) {
            return fArr[i11];
        }
        return Float.NaN;
    }

    public void b(Object obj, String str, int i11, float f11) {
        if (!this.f14924a.containsKey(obj)) {
            HashMap hashMap = new HashMap();
            float[] fArr = new float[(i11 + 1)];
            fArr[i11] = f11;
            hashMap.put(str, fArr);
            this.f14924a.put(obj, hashMap);
            return;
        }
        HashMap hashMap2 = this.f14924a.get(obj);
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
        }
        if (!hashMap2.containsKey(str)) {
            float[] fArr2 = new float[(i11 + 1)];
            fArr2[i11] = f11;
            hashMap2.put(str, fArr2);
            this.f14924a.put(obj, hashMap2);
            return;
        }
        float[] fArr3 = (float[]) hashMap2.get(str);
        if (fArr3 == null) {
            fArr3 = new float[0];
        }
        if (fArr3.length <= i11) {
            fArr3 = Arrays.copyOf(fArr3, i11 + 1);
        }
        fArr3[i11] = f11;
        hashMap2.put(str, fArr3);
    }
}
