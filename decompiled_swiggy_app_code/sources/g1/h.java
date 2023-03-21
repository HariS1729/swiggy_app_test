package g1;

import f1.f;
import f1.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import pc0.x;

/* compiled from: VelocityTracker.kt */
public final class h {
    public static final void b(g gVar, v vVar) {
        p.j(gVar, "<this>");
        p.j(vVar, "event");
        List<f> d11 = vVar.d();
        int size = d11.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = d11.get(i11);
            gVar.a(fVar.b(), fVar.a());
        }
        gVar.a(vVar.l(), vVar.f());
    }

    /* access modifiers changed from: private */
    public static final float c(float f11) {
        return Math.signum(f11) * ((float) Math.sqrt((double) (((float) 2) * Math.abs(f11))));
    }

    public static final d d(List<Float> list, List<Float> list2, int i11) {
        float f11;
        float f12;
        float f13;
        List<Float> list3 = list;
        List<Float> list4 = list2;
        int i12 = i11;
        p.j(list3, x.f81957i);
        p.j(list4, "y");
        if (i12 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        } else if (!list.isEmpty()) {
            int size = i12 >= list.size() ? list.size() - 1 : i12;
            int i13 = i12 + 1;
            ArrayList arrayList = new ArrayList(i13);
            int i14 = 0;
            while (true) {
                f11 = 0.0f;
                if (i14 >= i13) {
                    break;
                }
                arrayList.add(Float.valueOf(0.0f));
                i14++;
            }
            int size2 = list.size();
            int i15 = size + 1;
            b bVar = new b(i15, size2);
            int i16 = 0;
            while (true) {
                f12 = 1.0f;
                if (i16 >= size2) {
                    break;
                }
                bVar.c(0, i16, 1.0f);
                for (int i17 = 1; i17 < i15; i17++) {
                    bVar.c(i17, i16, bVar.a(i17 - 1, i16) * list3.get(i16).floatValue());
                }
                i16++;
            }
            b bVar2 = new b(i15, size2);
            b bVar3 = new b(i15, i15);
            int i18 = 0;
            while (i18 < i15) {
                for (int i19 = 0; i19 < size2; i19++) {
                    bVar2.c(i18, i19, bVar.a(i18, i19));
                }
                for (int i21 = 0; i21 < i18; i21++) {
                    float d11 = bVar2.b(i18).d(bVar2.b(i21));
                    for (int i22 = 0; i22 < size2; i22++) {
                        bVar2.c(i18, i22, bVar2.a(i18, i22) - (bVar2.a(i21, i22) * d11));
                    }
                }
                float b11 = bVar2.b(i18).b();
                if (((double) b11) >= 1.0E-6d) {
                    float f14 = 1.0f / b11;
                    for (int i23 = 0; i23 < size2; i23++) {
                        bVar2.c(i18, i23, bVar2.a(i18, i23) * f14);
                    }
                    for (int i24 = 0; i24 < i15; i24++) {
                        if (i24 < i18) {
                            f13 = 0.0f;
                        } else {
                            f13 = bVar2.b(i18).d(bVar.b(i24));
                        }
                        bVar3.c(i18, i24, f13);
                    }
                    i18++;
                } else {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
            }
            e eVar = new e(size2);
            for (int i25 = 0; i25 < size2; i25++) {
                eVar.c(i25, list4.get(i25).floatValue() * 1.0f);
            }
            int i26 = i15 - 1;
            for (int i27 = i26; -1 < i27; i27--) {
                arrayList.set(i27, Float.valueOf(bVar2.b(i27).d(eVar)));
                int i28 = i27 + 1;
                if (i28 <= i26) {
                    int i29 = i26;
                    while (true) {
                        arrayList.set(i27, Float.valueOf(((Number) arrayList.get(i27)).floatValue() - (bVar3.a(i27, i29) * ((Number) arrayList.get(i29)).floatValue())));
                        if (i29 == i28) {
                            break;
                        }
                        i29--;
                    }
                }
                arrayList.set(i27, Float.valueOf(((Number) arrayList.get(i27)).floatValue() / bVar3.a(i27, i27)));
            }
            float f15 = 0.0f;
            for (int i31 = 0; i31 < size2; i31++) {
                f15 += list4.get(i31).floatValue();
            }
            float f16 = f15 / ((float) size2);
            float f17 = 0.0f;
            for (int i32 = 0; i32 < size2; i32++) {
                float floatValue = list4.get(i32).floatValue() - ((Number) arrayList.get(0)).floatValue();
                float f18 = 1.0f;
                for (int i33 = 1; i33 < i15; i33++) {
                    f18 *= list3.get(i32).floatValue();
                    floatValue -= ((Number) arrayList.get(i33)).floatValue() * f18;
                }
                f17 += floatValue * 1.0f * floatValue;
                float floatValue2 = list4.get(i32).floatValue() - f16;
                f11 += floatValue2 * 1.0f * floatValue2;
            }
            if (f11 > 1.0E-6f) {
                f12 = 1.0f - (f17 / f11);
            }
            return new d(arrayList, f12);
        } else {
            throw new IllegalArgumentException("At least one point must be provided");
        }
    }
}
