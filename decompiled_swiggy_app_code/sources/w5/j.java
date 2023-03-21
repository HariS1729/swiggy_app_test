package w5;

import a6.b;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import c6.c;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Instrumented
/* compiled from: ImageComparisonHelper */
public class j {
    private static j k;

    /* renamed from: a  reason: collision with root package name */
    private final int f17571a = 50;

    /* renamed from: b  reason: collision with root package name */
    private final int f17572b = 10000;

    /* renamed from: c  reason: collision with root package name */
    private final int f17573c = 10;

    /* renamed from: d  reason: collision with root package name */
    private final int f17574d = 10;

    /* renamed from: e  reason: collision with root package name */
    AtomicBoolean f17575e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    c f17576f = new c();

    /* renamed from: g  reason: collision with root package name */
    int f17577g = 0;

    /* renamed from: h  reason: collision with root package name */
    long f17578h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f17579i = new byte[2500];
    private byte[] j = new byte[2500];

    j() {
    }

    private float c(Integer[] numArr, Integer[] numArr2) {
        int i11 = 0;
        float f11 = 0.0f;
        while (i11 < numArr.length) {
            try {
                f11 = (float) (((double) f11) + Math.pow((double) (l((float) numArr[i11].intValue()) - l((float) numArr2[i11].intValue())), 2.0d));
                i11++;
            } catch (Exception e11) {
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
                Log.e("ImageHelper", e11.toString());
                return 0.0f;
            }
        }
        return (1.0f / l(2.0f)) * l(f11);
    }

    private int d(byte[] bArr, byte[] bArr2) {
        double d11 = 0.0d;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            d11 += Math.pow((double) (bArr[i11] - bArr2[i11]), 2.0d);
        }
        return (int) Math.sqrt(d11);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(Bitmap bitmap, Bitmap bitmap2) {
        try {
            n().p(bitmap, bitmap2);
            Bitmap m11 = n().m(bitmap);
            Bitmap m12 = n().m(bitmap2);
            n().q(m11, m12);
            m11.recycle();
            m12.recycle();
            bitmap2.recycle();
            bitmap.recycle();
        } catch (Exception e11) {
            Log.e("ImageHelper", e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        } finally {
            this.f17575e.set(true);
        }
    }

    private Integer[] k(Integer[] numArr) {
        try {
            Integer[] numArr2 = new Integer[256];
            Arrays.fill(numArr2, 0);
            float floatValue = Float.valueOf((float) ((Integer) Collections.min(Arrays.asList(numArr))).intValue()).floatValue();
            float floatValue2 = Float.valueOf((float) ((Integer) Collections.max(Arrays.asList(numArr))).intValue()).floatValue();
            for (int i11 = 0; i11 < numArr.length; i11++) {
                numArr2[i11] = Integer.valueOf(Math.round((((((float) numArr[i11].intValue()) - floatValue) * 255.0f) / (floatValue2 - floatValue)) + 0.0f));
            }
            return numArr2;
        } catch (Exception e11) {
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
            Log.e("ImageHelper", e11.toString());
            return numArr;
        }
    }

    public static j n() {
        if (k == null) {
            k = new j();
        }
        return k;
    }

    private void s() {
        this.f17576f.f().clear();
        this.f17576f.e().clear();
        this.f17575e.set(false);
        this.f17577g = 0;
    }

    public double b(float f11) {
        return ((double) Math.round(((double) f11) * 100.0d)) / 100.0d;
    }

    public List<Integer[]> e(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        try {
            Integer[] numArr = new Integer[256];
            Arrays.fill(numArr, 0);
            Integer[] numArr2 = new Integer[256];
            Arrays.fill(numArr2, 0);
            Integer[] numArr3 = new Integer[256];
            Arrays.fill(numArr3, 0);
            this.f17578h = (long) (bitmap.getWidth() * bitmap.getHeight());
            int width = bitmap.getWidth() * bitmap.getHeight();
            int[] iArr = new int[width];
            bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            for (int i11 = 0; i11 < width; i11++) {
                int i12 = iArr[i11];
                int red = Color.red(i12);
                int green = Color.green(i12);
                int blue = Color.blue(i12);
                Integer num = numArr[red];
                numArr[red] = Integer.valueOf(numArr[red].intValue() + 1);
                Integer num2 = numArr2[green];
                numArr2[green] = Integer.valueOf(numArr2[green].intValue() + 1);
                Integer num3 = numArr3[blue];
                numArr3[blue] = Integer.valueOf(numArr3[blue].intValue() + 1);
            }
            arrayList.add(k(numArr));
            arrayList.add(k(numArr2));
            arrayList.add(k(numArr3));
        } catch (Exception e11) {
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
            Log.e("ImageHelper", e11.toString());
        }
        return arrayList;
    }

    public List<Float> f(List<Integer[]> list, List<Integer[]> list2) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < list.size()) {
            try {
                arrayList.add(Float.valueOf(c(list.get(i11), list2.get(i11))));
                i11++;
            } catch (Exception e11) {
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
                Log.e("ImageHelper", e11.toString());
            }
        }
        return arrayList;
    }

    public void g() {
        k = null;
    }

    public void h(int i11, int i12) {
        this.f17576f.q(i11);
        this.f17576f.p(i12);
    }

    public void j(byte[] bArr, long j11) {
        if (n.w() != null && n.w().F()) {
            try {
                if (this.f17577g == 0) {
                    this.f17579i = Arrays.copyOfRange(bArr, 0, 50);
                }
                this.f17576f.e().set(this.f17577g % 10, Long.valueOf(j11));
                int i11 = this.f17577g + 1;
                this.f17577g = i11;
                if (i11 % 10 == 0) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 50);
                    this.j = copyOfRange;
                    this.f17576f.f().add(Integer.valueOf(d(copyOfRange, this.f17579i)));
                    byte[] bArr2 = this.j;
                    this.f17579i = Arrays.copyOf(bArr2, bArr2.length);
                }
            } catch (Exception e11) {
                Log.e("ImageHelper", e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }
    }

    public float l(float f11) {
        if (f11 > 0.0f) {
            return (float) Math.sqrt((double) f11);
        }
        return 0.0f;
    }

    public Bitmap m(Bitmap bitmap) {
        int i11;
        int width = bitmap.getWidth();
        n();
        int height = bitmap.getHeight();
        n();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width / 4, height / 4, false);
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), createScaledBitmap.getConfig());
        int i12 = 0;
        while (i12 < createScaledBitmap.getWidth()) {
            try {
                for (int i13 = 0; i13 < createScaledBitmap.getHeight(); i13 += 8) {
                    int width2 = createScaledBitmap.getWidth() * createScaledBitmap.getHeight();
                    int[] iArr = new int[width2];
                    try {
                        createScaledBitmap.getPixels(iArr, 0, createScaledBitmap.getWidth(), i12, i13, 8, 8);
                    } catch (Exception e11) {
                        Log.e("exception", e11.getMessage());
                    }
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    for (int i17 = 0; i17 < width2; i17++) {
                        int i18 = iArr[i17];
                        i14 += Color.red(i18);
                        i15 += Color.green(i18);
                        i16 += Color.blue(i18);
                    }
                    int[] iArr2 = new int[(createScaledBitmap.getWidth() * createScaledBitmap.getHeight())];
                    if (i14 >= i15 && i14 >= i16) {
                        i11 = Color.rgb(255, 0, 0);
                    } else if (i15 < i14 || i15 < i16) {
                        i11 = Color.rgb(0, 0, 255);
                    } else {
                        i11 = Color.rgb(0, 255, 0);
                    }
                    Arrays.fill(iArr2, i11);
                    createBitmap.setPixels(iArr2, 0, createBitmap.getWidth(), i12, i13, 8, 8);
                }
                i12 += 8;
            } catch (Exception e12) {
                Log.e("ImageHelper", e12.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e12);
                }
            }
        }
        return createBitmap;
    }

    public void o(int i11, int i12) {
        this.f17576f.n(i11);
        this.f17576f.m(i12);
    }

    public void p(Bitmap bitmap, Bitmap bitmap2) {
        try {
            List<Float> f11 = f(e(bitmap), e(bitmap2));
            if (f11 != null && !f11.isEmpty()) {
                this.f17576f.r(f11.get(0).floatValue());
                this.f17576f.o(f11.get(1).floatValue());
                this.f17576f.l(f11.get(2).floatValue());
            }
        } catch (Exception e11) {
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
            Log.e("ImageHelper", e11.toString());
        }
    }

    public float q(Bitmap bitmap, Bitmap bitmap2) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < bitmap.getWidth()) {
            try {
                for (int i14 = 0; i14 < bitmap.getHeight(); i14 += 8) {
                    i13++;
                    if (bitmap.getPixel(i11, i14) == bitmap2.getPixel(i11, i14)) {
                        i12++;
                    }
                }
                i11 += 8;
            } catch (Exception e11) {
                Log.e("ImageHelper", e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }
        float f11 = (float) ((i12 * 100) / i13);
        this.f17576f.s(f11);
        return f11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b A[LOOP:0: B:5:0x001b->B:8:0x002c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, okhttp3.RequestBody> r() {
        /*
            r9 = this;
            java.lang.String r0 = "X"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            w5.n r2 = w5.n.w()
            if (r2 == 0) goto L_0x0134
            w5.n r2 = w5.n.w()
            boolean r2 = r2.F()
            if (r2 == 0) goto L_0x0134
            long r2 = java.lang.System.currentTimeMillis()
        L_0x001b:
            java.util.concurrent.atomic.AtomicBoolean r4 = r9.f17575e
            boolean r4 = r4.get()
            if (r4 != 0) goto L_0x002e
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r6 = 10000(0x2710, double:4.9407E-320)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x001b
        L_0x002e:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x010d }
            r2.<init>()     // Catch:{ Exception -> 0x010d }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x010d }
            r3.<init>()     // Catch:{ Exception -> 0x010d }
            c6.c r4 = r9.f17576f     // Catch:{ Exception -> 0x010d }
            float r4 = r4.j()     // Catch:{ Exception -> 0x010d }
            double r4 = r9.b(r4)     // Catch:{ Exception -> 0x010d }
            r2.put(r4)     // Catch:{ Exception -> 0x010d }
            c6.c r4 = r9.f17576f     // Catch:{ Exception -> 0x010d }
            float r4 = r4.g()     // Catch:{ Exception -> 0x010d }
            double r4 = r9.b(r4)     // Catch:{ Exception -> 0x010d }
            r2.put(r4)     // Catch:{ Exception -> 0x010d }
            c6.c r4 = r9.f17576f     // Catch:{ Exception -> 0x010d }
            float r4 = r4.b()     // Catch:{ Exception -> 0x010d }
            double r4 = r9.b(r4)     // Catch:{ Exception -> 0x010d }
            r2.put(r4)     // Catch:{ Exception -> 0x010d }
            java.lang.String r4 = "isEmulator"
            boolean r5 = z5.g.n()     // Catch:{ Exception -> 0x010d }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x010d }
            java.lang.String r4 = "frameDiffs"
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x010d }
            c6.c r6 = r9.f17576f     // Catch:{ Exception -> 0x010d }
            java.util.List r6 = r6.f()     // Catch:{ Exception -> 0x010d }
            r5.<init>(r6)     // Catch:{ Exception -> 0x010d }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x010d }
            java.lang.String r4 = "frameDataLength"
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x010d }
            c6.c r6 = r9.f17576f     // Catch:{ Exception -> 0x010d }
            java.util.List r6 = r6.e()     // Catch:{ Exception -> 0x010d }
            r5.<init>(r6)     // Catch:{ Exception -> 0x010d }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x010d }
            java.lang.String r4 = "imageSize"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010d }
            r5.<init>()     // Catch:{ Exception -> 0x010d }
            c6.c r6 = r9.f17576f     // Catch:{ Exception -> 0x010d }
            int r6 = r6.i()     // Catch:{ Exception -> 0x010d }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x010d }
            r5.append(r6)     // Catch:{ Exception -> 0x010d }
            r5.append(r0)     // Catch:{ Exception -> 0x010d }
            c6.c r6 = r9.f17576f     // Catch:{ Exception -> 0x010d }
            int r6 = r6.h()     // Catch:{ Exception -> 0x010d }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x010d }
            r5.append(r6)     // Catch:{ Exception -> 0x010d }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x010d }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x010d }
            java.lang.String r4 = "cameraCaptureSize"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010d }
            r5.<init>()     // Catch:{ Exception -> 0x010d }
            c6.c r6 = r9.f17576f     // Catch:{ Exception -> 0x010d }
            int r6 = r6.d()     // Catch:{ Exception -> 0x010d }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x010d }
            r5.append(r6)     // Catch:{ Exception -> 0x010d }
            r5.append(r0)     // Catch:{ Exception -> 0x010d }
            c6.c r0 = r9.f17576f     // Catch:{ Exception -> 0x010d }
            int r0 = r0.c()     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x010d }
            r5.append(r0)     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x010d }
            r3.put(r4, r0)     // Catch:{ Exception -> 0x010d }
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f17575e     // Catch:{ Exception -> 0x010d }
            boolean r0 = r0.get()     // Catch:{ Exception -> 0x010d }
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = "channelDiffs"
            r3.put(r0, r2)     // Catch:{ Exception -> 0x010d }
            java.lang.String r0 = "blocksDiff"
            c6.c r2 = r9.f17576f     // Catch:{ Exception -> 0x010d }
            float r2 = r2.k()     // Catch:{ Exception -> 0x010d }
            double r4 = (double) r2     // Catch:{ Exception -> 0x010d }
            r3.put(r0, r4)     // Catch:{ Exception -> 0x010d }
        L_0x00f7:
            java.lang.String r0 = "text/plain"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)     // Catch:{ Exception -> 0x010d }
            java.lang.String r2 = com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation.toString(r3)     // Catch:{ Exception -> 0x010d }
            okhttp3.RequestBody r0 = okhttp3.RequestBody.create((okhttp3.MediaType) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x010d }
            java.lang.String r2 = "captureData"
            r1.put(r2, r0)     // Catch:{ Exception -> 0x010d }
            goto L_0x012c
        L_0x010b:
            r0 = move-exception
            goto L_0x0130
        L_0x010d:
            r0 = move-exception
            w5.n r2 = w5.n.w()     // Catch:{ all -> 0x010b }
            f6.b r2 = r2.s()     // Catch:{ all -> 0x010b }
            if (r2 == 0) goto L_0x0123
            w5.n r2 = w5.n.w()     // Catch:{ all -> 0x010b }
            f6.b r2 = r2.s()     // Catch:{ all -> 0x010b }
            r2.a(r0)     // Catch:{ all -> 0x010b }
        L_0x0123:
            java.lang.String r2 = "ImageHelper"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x010b }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x010b }
        L_0x012c:
            r9.s()
            goto L_0x0134
        L_0x0130:
            r9.s()
            throw r0
        L_0x0134:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.j.r():java.util.Map");
    }

    public void t(Bitmap bitmap, Bitmap bitmap2) {
        b.a().b(new i(this, bitmap, bitmap2));
    }
}
