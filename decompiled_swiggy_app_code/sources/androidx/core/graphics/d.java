package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: PathParser */
public class d {

    /* compiled from: PathParser */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        int f9240a;

        /* renamed from: b  reason: collision with root package name */
        boolean f9241b;

        a() {
        }
    }

    private static void a(ArrayList<b> arrayList, char c11, float[] fArr) {
        arrayList.add(new b(c11, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            if (bVarArr[i11].f9242a != bVarArr2[i11].f9242a || bVarArr[i11].f9243b.length != bVarArr2[i11].f9243b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i11, int i12) {
        if (i11 <= i12) {
            int length = fArr.length;
            if (i11 < 0 || i11 > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i13 = i12 - i11;
            int min = Math.min(i13, length - i11);
            float[] fArr2 = new float[i13];
            System.arraycopy(fArr, i11, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        int i12 = 0;
        while (i11 < str.length()) {
            int i13 = i(str, i11);
            String trim = str.substring(i12, i13).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), h(trim));
            }
            i12 = i13;
            i11 = i13 + 1;
        }
        if (i11 - i12 == 1 && i12 < str.length()) {
            a(arrayList, str.charAt(i12), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] d11 = d(str);
        if (d11 == null) {
            return null;
        }
        try {
            b.e(d11, path);
            return path;
        } catch (RuntimeException e11) {
            throw new RuntimeException("Error in parsing " + str, e11);
        }
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            bVarArr2[i11] = new b(bVarArr[i11]);
        }
        return bVarArr2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r2 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[LOOP:0: B:1:0x0007->B:20:0x003a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void g(java.lang.String r8, int r9, androidx.core.graphics.d.a r10) {
        /*
            r0 = 0
            r10.f9241b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0007:
            int r5 = r8.length()
            if (r1 >= r5) goto L_0x003d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L_0x0035
            r6 = 69
            if (r5 == r6) goto L_0x0033
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L_0x0033
            switch(r5) {
                case 44: goto L_0x0035;
                case 45: goto L_0x002a;
                case 46: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0031
        L_0x0022:
            if (r3 != 0) goto L_0x0027
            r2 = 0
            r3 = 1
            goto L_0x0037
        L_0x0027:
            r10.f9241b = r7
            goto L_0x0035
        L_0x002a:
            if (r1 == r9) goto L_0x0031
            if (r2 != 0) goto L_0x0031
            r10.f9241b = r7
            goto L_0x0035
        L_0x0031:
            r2 = 0
            goto L_0x0037
        L_0x0033:
            r2 = 1
            goto L_0x0037
        L_0x0035:
            r2 = 0
            r4 = 1
        L_0x0037:
            if (r4 == 0) goto L_0x003a
            goto L_0x003d
        L_0x003a:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003d:
            r10.f9240a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.d.g(java.lang.String, int, androidx.core.graphics.d$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i11 = 1;
            int i12 = 0;
            while (i11 < length) {
                g(str, i11, aVar);
                int i13 = aVar.f9240a;
                if (i11 < i13) {
                    fArr[i12] = Float.parseFloat(str.substring(i11, i13));
                    i12++;
                }
                i11 = aVar.f9241b ? i13 : i13 + 1;
            }
            return c(fArr, 0, i12);
        } catch (NumberFormatException e11) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e11);
        }
    }

    private static int i(String str, int i11) {
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i11;
            }
            i11++;
        }
        return i11;
    }

    public static void j(b[] bVarArr, b[] bVarArr2) {
        for (int i11 = 0; i11 < bVarArr2.length; i11++) {
            bVarArr[i11].f9242a = bVarArr2[i11].f9242a;
            for (int i12 = 0; i12 < bVarArr2[i11].f9243b.length; i12++) {
                bVarArr[i11].f9243b[i12] = bVarArr2[i11].f9243b[i12];
            }
        }
    }

    /* compiled from: PathParser */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public char f9242a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f9243b;

        b(char c11, float[] fArr) {
            this.f9242a = c11;
            this.f9243b = fArr;
        }

        private static void a(Path path, float[] fArr, char c11, char c12, float[] fArr2) {
            int i11;
            int i12;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f21;
            Path path2 = path;
            char c13 = c12;
            float[] fArr3 = fArr2;
            float f22 = fArr[0];
            float f23 = fArr[1];
            float f24 = fArr[2];
            float f25 = fArr[3];
            float f26 = fArr[4];
            float f27 = fArr[5];
            switch (c13) {
                case 'A':
                case 'a':
                    i11 = 7;
                    break;
                case 'C':
                case 'c':
                    i11 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i11 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i11 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                    break;
            }
            i11 = 2;
            float f28 = f22;
            float f29 = f23;
            float f31 = f26;
            float f32 = f27;
            int i13 = 0;
            char c14 = c11;
            while (i13 < fArr3.length) {
                if (c13 != 'A') {
                    if (c13 == 'C') {
                        i12 = i13;
                        int i14 = i12 + 2;
                        int i15 = i12 + 3;
                        int i16 = i12 + 4;
                        int i17 = i12 + 5;
                        path.cubicTo(fArr3[i12 + 0], fArr3[i12 + 1], fArr3[i14], fArr3[i15], fArr3[i16], fArr3[i17]);
                        f28 = fArr3[i16];
                        float f33 = fArr3[i17];
                        float f34 = fArr3[i14];
                        float f35 = fArr3[i15];
                        f29 = f33;
                        f25 = f35;
                        f24 = f34;
                    } else if (c13 == 'H') {
                        i12 = i13;
                        int i18 = i12 + 0;
                        path2.lineTo(fArr3[i18], f29);
                        f28 = fArr3[i18];
                    } else if (c13 == 'Q') {
                        i12 = i13;
                        int i19 = i12 + 0;
                        int i21 = i12 + 1;
                        int i22 = i12 + 2;
                        int i23 = i12 + 3;
                        path2.quadTo(fArr3[i19], fArr3[i21], fArr3[i22], fArr3[i23]);
                        float f36 = fArr3[i19];
                        float f37 = fArr3[i21];
                        f28 = fArr3[i22];
                        f29 = fArr3[i23];
                        f24 = f36;
                        f25 = f37;
                    } else if (c13 == 'V') {
                        i12 = i13;
                        int i24 = i12 + 0;
                        path2.lineTo(f28, fArr3[i24]);
                        f29 = fArr3[i24];
                    } else if (c13 != 'a') {
                        if (c13 == 'c') {
                            int i25 = i13 + 2;
                            int i26 = i13 + 3;
                            int i27 = i13 + 4;
                            int i28 = i13 + 5;
                            path.rCubicTo(fArr3[i13 + 0], fArr3[i13 + 1], fArr3[i25], fArr3[i26], fArr3[i27], fArr3[i28]);
                            f14 = fArr3[i25] + f28;
                            f13 = fArr3[i26] + f29;
                            f28 += fArr3[i27];
                            f15 = fArr3[i28];
                            f29 += f15;
                            f24 = f14;
                            f25 = f13;
                        } else if (c13 != 'h') {
                            if (c13 != 'q') {
                                if (c13 == 'v') {
                                    int i29 = i13 + 0;
                                    path2.rLineTo(0.0f, fArr3[i29]);
                                    f16 = fArr3[i29];
                                } else if (c13 != 'L') {
                                    if (c13 == 'M') {
                                        int i31 = i13 + 0;
                                        f28 = fArr3[i31];
                                        int i32 = i13 + 1;
                                        f29 = fArr3[i32];
                                        if (i13 > 0) {
                                            path2.lineTo(fArr3[i31], fArr3[i32]);
                                        } else {
                                            path2.moveTo(fArr3[i31], fArr3[i32]);
                                        }
                                    } else if (c13 == 'S') {
                                        if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                            f28 = (f28 * 2.0f) - f24;
                                            f29 = (f29 * 2.0f) - f25;
                                        }
                                        float f38 = f29;
                                        int i33 = i13 + 0;
                                        int i34 = i13 + 1;
                                        int i35 = i13 + 2;
                                        int i36 = i13 + 3;
                                        path.cubicTo(f28, f38, fArr3[i33], fArr3[i34], fArr3[i35], fArr3[i36]);
                                        f14 = fArr3[i33];
                                        f13 = fArr3[i34];
                                        f28 = fArr3[i35];
                                        f29 = fArr3[i36];
                                        f24 = f14;
                                        f25 = f13;
                                    } else if (c13 == 'T') {
                                        if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                            f28 = (f28 * 2.0f) - f24;
                                            f29 = (f29 * 2.0f) - f25;
                                        }
                                        int i37 = i13 + 0;
                                        int i38 = i13 + 1;
                                        path2.quadTo(f28, f29, fArr3[i37], fArr3[i38]);
                                        float f39 = fArr3[i37];
                                        float f41 = fArr3[i38];
                                        i12 = i13;
                                        f25 = f29;
                                        f24 = f28;
                                        f28 = f39;
                                        f29 = f41;
                                    } else if (c13 == 'l') {
                                        int i39 = i13 + 0;
                                        int i41 = i13 + 1;
                                        path2.rLineTo(fArr3[i39], fArr3[i41]);
                                        f28 += fArr3[i39];
                                        f16 = fArr3[i41];
                                    } else if (c13 == 'm') {
                                        int i42 = i13 + 0;
                                        f28 += fArr3[i42];
                                        int i43 = i13 + 1;
                                        f29 += fArr3[i43];
                                        if (i13 > 0) {
                                            path2.rLineTo(fArr3[i42], fArr3[i43]);
                                        } else {
                                            path2.rMoveTo(fArr3[i42], fArr3[i43]);
                                        }
                                    } else if (c13 == 's') {
                                        if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                            float f42 = f28 - f24;
                                            f17 = f29 - f25;
                                            f18 = f42;
                                        } else {
                                            f18 = 0.0f;
                                            f17 = 0.0f;
                                        }
                                        int i44 = i13 + 0;
                                        int i45 = i13 + 1;
                                        int i46 = i13 + 2;
                                        int i47 = i13 + 3;
                                        path.rCubicTo(f18, f17, fArr3[i44], fArr3[i45], fArr3[i46], fArr3[i47]);
                                        f14 = fArr3[i44] + f28;
                                        f13 = fArr3[i45] + f29;
                                        f28 += fArr3[i46];
                                        f15 = fArr3[i47];
                                    } else if (c13 == 't') {
                                        if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                            f19 = f28 - f24;
                                            f21 = f29 - f25;
                                        } else {
                                            f21 = 0.0f;
                                            f19 = 0;
                                        }
                                        int i48 = i13 + 0;
                                        int i49 = i13 + 1;
                                        path2.rQuadTo(f19, f21, fArr3[i48], fArr3[i49]);
                                        float f43 = f19 + f28;
                                        float f44 = f21 + f29;
                                        f28 += fArr3[i48];
                                        f29 += fArr3[i49];
                                        f25 = f44;
                                        f24 = f43;
                                    }
                                    i12 = i13;
                                    f32 = f29;
                                    f31 = f28;
                                } else {
                                    int i51 = i13 + 0;
                                    int i52 = i13 + 1;
                                    path2.lineTo(fArr3[i51], fArr3[i52]);
                                    f28 = fArr3[i51];
                                    f29 = fArr3[i52];
                                }
                                f29 += f16;
                            } else {
                                int i53 = i13 + 0;
                                int i54 = i13 + 1;
                                int i55 = i13 + 2;
                                int i56 = i13 + 3;
                                path2.rQuadTo(fArr3[i53], fArr3[i54], fArr3[i55], fArr3[i56]);
                                f14 = fArr3[i53] + f28;
                                f13 = fArr3[i54] + f29;
                                f28 += fArr3[i55];
                                f15 = fArr3[i56];
                            }
                            f29 += f15;
                            f24 = f14;
                            f25 = f13;
                        } else {
                            int i57 = i13 + 0;
                            path2.rLineTo(fArr3[i57], 0.0f);
                            f28 += fArr3[i57];
                        }
                        i12 = i13;
                    } else {
                        int i58 = i13 + 5;
                        int i59 = i13 + 6;
                        i12 = i13;
                        c(path, f28, f29, fArr3[i58] + f28, fArr3[i59] + f29, fArr3[i13 + 0], fArr3[i13 + 1], fArr3[i13 + 2], fArr3[i13 + 3] != 0.0f, fArr3[i13 + 4] != 0.0f);
                        f11 = f28 + fArr3[i58];
                        f12 = f29 + fArr3[i59];
                    }
                    i13 = i12 + i11;
                    c14 = c12;
                    c13 = c14;
                } else {
                    i12 = i13;
                    int i61 = i12 + 5;
                    int i62 = i12 + 6;
                    c(path, f28, f29, fArr3[i61], fArr3[i62], fArr3[i12 + 0], fArr3[i12 + 1], fArr3[i12 + 2], fArr3[i12 + 3] != 0.0f, fArr3[i12 + 4] != 0.0f);
                    f11 = fArr3[i61];
                    f12 = fArr3[i62];
                }
                f25 = f29;
                f24 = f28;
                i13 = i12 + i11;
                c14 = c12;
                c13 = c14;
            }
            fArr[0] = f28;
            fArr[1] = f29;
            fArr[2] = f24;
            fArr[3] = f25;
            fArr[4] = f31;
            fArr[5] = f32;
        }

        private static void b(Path path, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
            double d21 = d13;
            int ceil = (int) Math.ceil(Math.abs((d19 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d17);
            double sin = Math.sin(d17);
            double cos2 = Math.cos(d18);
            double sin2 = Math.sin(d18);
            double d22 = -d21;
            double d23 = d22 * cos;
            double d24 = d14 * sin;
            double d25 = (d23 * sin2) - (d24 * cos2);
            double d26 = d22 * sin;
            double d27 = d14 * cos;
            double d28 = (sin2 * d26) + (cos2 * d27);
            double d29 = d19 / ((double) ceil);
            double d31 = d18;
            double d32 = d28;
            double d33 = d25;
            int i11 = 0;
            double d34 = d15;
            double d35 = d16;
            while (i11 < ceil) {
                double d36 = d31 + d29;
                double sin3 = Math.sin(d36);
                double cos3 = Math.cos(d36);
                double d37 = (d11 + ((d21 * cos) * cos3)) - (d24 * sin3);
                double d38 = d12 + (d21 * sin * cos3) + (d27 * sin3);
                double d39 = (d23 * sin3) - (d24 * cos3);
                double d41 = (sin3 * d26) + (cos3 * d27);
                double d42 = d36 - d31;
                double tan = Math.tan(d42 / 2.0d);
                double sin4 = (Math.sin(d42) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d43 = d34 + (d33 * sin4);
                double d44 = cos;
                double d45 = sin;
                path.rLineTo(0.0f, 0.0f);
                float f11 = (float) (d37 - (sin4 * d39));
                float f12 = (float) (d38 - (sin4 * d41));
                path.cubicTo((float) d43, (float) (d35 + (d32 * sin4)), f11, f12, (float) d37, (float) d38);
                i11++;
                d29 = d29;
                sin = d45;
                d34 = d37;
                d26 = d26;
                cos = d44;
                d31 = d36;
                d32 = d41;
                d33 = d39;
                ceil = ceil;
                d35 = d38;
                d21 = d13;
            }
        }

        private static void c(Path path, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z11, boolean z12) {
            double d11;
            double d12;
            float f18 = f11;
            float f19 = f13;
            float f21 = f15;
            boolean z13 = z12;
            double radians = Math.toRadians((double) f17);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d13 = (double) f18;
            double d14 = d13 * cos;
            double d15 = d13;
            double d16 = (double) f12;
            double d17 = (double) f21;
            double d18 = (d14 + (d16 * sin)) / d17;
            double d19 = (((double) (-f18)) * sin) + (d16 * cos);
            double d21 = d16;
            double d22 = (double) f16;
            double d23 = d19 / d22;
            double d24 = (double) f14;
            double d25 = ((((double) f19) * cos) + (d24 * sin)) / d17;
            double d26 = d17;
            double d27 = ((((double) (-f19)) * sin) + (d24 * cos)) / d22;
            double d28 = d18 - d25;
            double d29 = d23 - d27;
            double d31 = (d18 + d25) / 2.0d;
            double d32 = (d23 + d27) / 2.0d;
            double d33 = sin;
            double d34 = (d28 * d28) + (d29 * d29);
            if (d34 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d35 = (1.0d / d34) - 0.25d;
            if (d35 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d34);
                float sqrt = (float) (Math.sqrt(d34) / 1.99999d);
                c(path, f11, f12, f13, f14, f21 * sqrt, f16 * sqrt, f17, z11, z12);
                return;
            }
            double sqrt2 = Math.sqrt(d35);
            double d36 = d28 * sqrt2;
            double d37 = sqrt2 * d29;
            boolean z14 = z12;
            if (z11 == z14) {
                d12 = d31 - d37;
                d11 = d32 + d36;
            } else {
                d12 = d31 + d37;
                d11 = d32 - d36;
            }
            double atan2 = Math.atan2(d23 - d11, d18 - d12);
            double atan22 = Math.atan2(d27 - d11, d25 - d12) - atan2;
            int i11 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z14 != (i11 >= 0)) {
                atan22 = i11 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d38 = d12 * d26;
            double d39 = d11 * d22;
            b(path, (d38 * cos) - (d39 * d33), (d38 * d33) + (d39 * cos), d26, d22, d15, d21, radians, atan2, atan22);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c11 = 'm';
            for (int i11 = 0; i11 < bVarArr.length; i11++) {
                a(path, fArr, c11, bVarArr[i11].f9242a, bVarArr[i11].f9243b);
                c11 = bVarArr[i11].f9242a;
            }
        }

        public void d(b bVar, b bVar2, float f11) {
            this.f9242a = bVar.f9242a;
            int i11 = 0;
            while (true) {
                float[] fArr = bVar.f9243b;
                if (i11 < fArr.length) {
                    this.f9243b[i11] = (fArr[i11] * (1.0f - f11)) + (bVar2.f9243b[i11] * f11);
                    i11++;
                } else {
                    return;
                }
            }
        }

        b(b bVar) {
            this.f9242a = bVar.f9242a;
            float[] fArr = bVar.f9243b;
            this.f9243b = d.c(fArr, 0, fArr.length);
        }
    }
}
