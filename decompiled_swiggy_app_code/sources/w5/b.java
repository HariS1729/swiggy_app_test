package w5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w5.e;

/* compiled from: CamPreviewFaceDetectionHandler */
public class b extends HandlerThread {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final String f17504h = b.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static int f17505i = 0;
    static b j;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f17506a = new Handler(getLooper());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Handler f17507b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f17508c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f17509d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final float[] f17510e;

    /* renamed from: f  reason: collision with root package name */
    x5.a f17511f;

    /* renamed from: g  reason: collision with root package name */
    boolean f17512g;

    /* compiled from: CamPreviewFaceDetectionHandler */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f17513a;

        /* renamed from: b  reason: collision with root package name */
        public int f17514b;

        /* renamed from: c  reason: collision with root package name */
        public int f17515c;

        /* renamed from: d  reason: collision with root package name */
        public int f17516d;

        /* renamed from: e  reason: collision with root package name */
        public int f17517e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f17518f;

        /* renamed from: g  reason: collision with root package name */
        public e.a f17519g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<ArrayList<Float>> f17520h = new ArrayList<>();

        /* renamed from: i  reason: collision with root package name */
        private final boolean f17521i;

        public a(byte[] bArr, int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
            this.f17513a = bArr;
            this.f17514b = i11;
            this.f17515c = i12;
            this.f17516d = i13;
            this.f17517e = i14;
            this.f17518f = z11;
            this.f17519g = new e.a(System.currentTimeMillis());
            this.f17521i = z12;
        }

        public ArrayList<Float> a(ArrayList<ArrayList<Float>> arrayList) {
            ArrayList<Float> arrayList2 = arrayList.get(0);
            float floatValue = (arrayList2.get(4).floatValue() - arrayList2.get(0).floatValue()) * (arrayList2.get(3).floatValue() - arrayList2.get(1).floatValue());
            Iterator<ArrayList<Float>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ArrayList<Float> next = it2.next();
                if ((next.get(4).floatValue() - next.get(0).floatValue()) * (next.get(3).floatValue() - next.get(1).floatValue()) > floatValue) {
                    floatValue = (next.get(4).floatValue() - next.get(0).floatValue()) * (next.get(3).floatValue() - next.get(1).floatValue());
                    arrayList2 = next;
                }
            }
            return arrayList2;
        }

        public void b() {
            float f11;
            float f12;
            float f13;
            float f14;
            int i11 = this.f17517e;
            if (i11 != 0) {
                if (i11 == 90) {
                    f14 = b.this.f17510e[0];
                    f13 = b.this.f17510e[1];
                } else if (i11 == 180) {
                    f14 = 1.0f - b.this.f17510e[1];
                    f13 = b.this.f17510e[0];
                } else if (i11 != 270) {
                    f11 = 1.0f - b.this.f17510e[0];
                    f12 = b.this.f17510e[1];
                } else {
                    f11 = 1.0f - b.this.f17510e[0];
                    f12 = b.this.f17510e[1];
                }
                f11 = f14;
                f12 = 1.0f - f13;
            } else {
                float f15 = b.this.f17510e[0];
                f12 = 1.0f - b.this.f17510e[0];
                f11 = b.this.f17510e[1];
            }
            b.this.f17510e[0] = f11;
            b.this.f17510e[1] = f12;
        }

        public void run() {
            try {
                e.a a11 = e.a();
                int i11 = -1;
                if (b.this.f17510e[0] > 0.0f) {
                    b();
                    i11 = f5.a.b(this.f17513a, this.f17514b, this.f17515c, Math.max(0, Math.round(b.this.f17510e[0] * ((float) this.f17514b)) - 20), Math.min(this.f17514b, Math.round(b.this.f17510e[0] * ((float) this.f17514b)) + 20), Math.max(0, Math.round(b.this.f17510e[1] * ((float) this.f17515c)) - 20), Math.min(this.f17515c, Math.round(b.this.f17510e[1] * ((float) this.f17515c)) + 20), false);
                    b.this.e(Math.log(89.0d) - Math.log((double) i11));
                    int unused = b.f17505i = 0;
                    b.this.f17510e[0] = -1.0f;
                    b.this.f17510e[1] = -1.0f;
                } else if (a11 != null && b.f17505i % 10 == 0) {
                    byte[] bArr = this.f17513a;
                    int i12 = this.f17514b;
                    i11 = f5.a.b(bArr, i12, this.f17515c, Math.round((((float) i12) / 100.0f) * a11.h()), Math.round((((float) this.f17514b) / 100.0f) * a11.a()), Math.round((((float) this.f17515c) / 100.0f) * a11.i()), Math.round((((float) this.f17515c) / 100.0f) * a11.e()), true);
                }
                int unused2 = b.f17505i = b.f17505i + 1;
                int unused3 = b.f17505i = b.f17505i % 10;
                this.f17520h = f5.a.a(this.f17513a, this.f17514b, this.f17515c, this.f17517e % 180 == 0 ? 0 : 1);
                this.f17519g.c(System.currentTimeMillis());
                b.this.f17507b.removeCallbacksAndMessages((Object) null);
                ArrayList<ArrayList<Float>> arrayList = this.f17520h;
                if (arrayList != null) {
                    if (arrayList.size() != 0) {
                        ArrayList<Float> a12 = a(this.f17520h);
                        if (i11 > 0 && a11 != null && (StrictMath.abs(((a12.get(0).floatValue() * 100.0f) + (a12.get(4).floatValue() * 100.0f)) - (a11.h() + a11.a())) * ((float) this.f17514b)) / 200.0f < 15.0f && (StrictMath.abs(((a12.get(1).floatValue() * 100.0f) + (a12.get(3).floatValue() * 100.0f)) - (a11.i() + a11.e())) * ((float) this.f17515c)) / 200.0f < 15.0f) {
                            b.this.e(Math.log(89.0d) - Math.log((double) i11));
                            int unused4 = b.f17505i = 1;
                        }
                        ArrayList<ArrayList<Float>> arrayList2 = this.f17520h;
                        if (arrayList2 == null || arrayList2.size() <= 1) {
                            b.this.f17507b.post(new C0207b(a12, this.f17516d, this.f17519g, this.f17518f, this.f17521i, (ArrayList<ArrayList<Float>>) null));
                            return;
                        } else {
                            b.this.f17507b.post(new C0207b(a12, this.f17516d, this.f17519g, this.f17518f, this.f17521i, this.f17520h));
                            return;
                        }
                    }
                }
                b.this.f17507b.post(new C0207b((ArrayList<Float>) null, this.f17516d, this.f17519g, this.f17518f, this.f17521i, (ArrayList<ArrayList<Float>>) null));
            } catch (IllegalArgumentException e11) {
                Log.e(b.f17504h, e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }
    }

    /* renamed from: w5.b$b  reason: collision with other inner class name */
    /* compiled from: CamPreviewFaceDetectionHandler */
    public class C0207b implements Runnable {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<Float> f17522a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f17523b;

        /* renamed from: c  reason: collision with root package name */
        e.a f17524c;

        /* renamed from: d  reason: collision with root package name */
        boolean f17525d;

        /* renamed from: e  reason: collision with root package name */
        boolean f17526e;

        /* renamed from: f  reason: collision with root package name */
        ArrayList<ArrayList<Float>> f17527f;

        /* renamed from: w5.b$b$a */
        /* compiled from: CamPreviewFaceDetectionHandler */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f17529a;

            a(List list) {
                this.f17529a = list;
            }

            public void run() {
                Iterator<ArrayList<Float>> it2 = C0207b.this.f17527f.iterator();
                while (it2.hasNext()) {
                    C0207b bVar = C0207b.this;
                    this.f17529a.add(bVar.a(bVar.f17523b, it2.next()));
                }
                C0207b bVar2 = C0207b.this;
                b bVar3 = b.this;
                x5.a aVar = bVar3.f17511f;
                if (aVar != null) {
                    aVar.b((ArrayList<Integer>) null, bVar2.f17524c, bVar3.f17508c, b.this.f17509d, this.f17529a);
                }
            }
        }

        /* renamed from: w5.b$b$b  reason: collision with other inner class name */
        /* compiled from: CamPreviewFaceDetectionHandler */
        class C0208b implements Runnable {
            C0208b() {
            }

            public void run() {
                ArrayList arrayList = new ArrayList();
                float floatValue = ((Float) C0207b.this.f17522a.get(4)).floatValue() - ((Float) C0207b.this.f17522a.get(0)).floatValue();
                float floatValue2 = ((Float) C0207b.this.f17522a.get(5)).floatValue() - ((Float) C0207b.this.f17522a.get(1)).floatValue();
                float f11 = floatValue * 0.35f;
                float f12 = 100.0f;
                float f13 = 0.0f;
                float floatValue3 = (((Float) C0207b.this.f17522a.get(0)).floatValue() - f11) * 100.0f < 0.0f ? 0.0f : (((Float) C0207b.this.f17522a.get(0)).floatValue() - f11) * 100.0f;
                float f14 = floatValue2 * 0.45f;
                if ((((Float) C0207b.this.f17522a.get(1)).floatValue() - f14) * 100.0f >= 0.0f) {
                    f13 = (((Float) C0207b.this.f17522a.get(1)).floatValue() - f14) * 100.0f;
                }
                float floatValue4 = (((Float) C0207b.this.f17522a.get(4)).floatValue() + f11) * 100.0f > 100.0f ? 100.0f : (((Float) C0207b.this.f17522a.get(4)).floatValue() + f11) * 100.0f;
                if ((((Float) C0207b.this.f17522a.get(5)).floatValue() + f14) * 100.0f <= 100.0f) {
                    f12 = 100.0f * (((Float) C0207b.this.f17522a.get(5)).floatValue() + f14);
                }
                arrayList.add(Float.valueOf(floatValue3));
                arrayList.add(Float.valueOf(f13));
                arrayList.add(Float.valueOf(floatValue4));
                arrayList.add(Float.valueOf(f12));
                C0207b.this.f17524c.d(arrayList);
                e.b(C0207b.this.f17524c);
                C0207b bVar = C0207b.this;
                ArrayList<Integer> a11 = bVar.a(bVar.f17523b, bVar.f17522a);
                C0207b bVar2 = C0207b.this;
                b bVar3 = b.this;
                x5.a aVar = bVar3.f17511f;
                if (aVar != null) {
                    aVar.b(a11, bVar2.f17524c, bVar3.f17508c, b.this.f17509d, (List<ArrayList<Integer>>) null);
                }
            }
        }

        public C0207b(ArrayList<Float> arrayList, int i11, e.a aVar, boolean z11, boolean z12, ArrayList<ArrayList<Float>> arrayList2) {
            new ArrayList();
            this.f17522a = arrayList;
            this.f17523b = i11;
            this.f17524c = aVar;
            this.f17525d = z11;
            this.f17526e = z12;
            this.f17527f = arrayList2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x01a4  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x01a8  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x01b2  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x01c2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.ArrayList<java.lang.Integer> a(int r22, java.util.ArrayList<java.lang.Float> r23) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                r2 = r23
                r5 = 4598175219545276416(0x3fd0000000000000, double:0.25)
                r7 = 5
                r8 = 2
                r9 = 4
                r10 = 1
                r11 = 0
                r12 = 3
                if (r1 != 0) goto L_0x005e
                java.lang.Object r1 = r2.get(r11)
                java.lang.Float r1 = (java.lang.Float) r1
                float r1 = r1.floatValue()
                w5.b r13 = w5.b.this
                int r13 = r13.f17508c
                float r13 = (float) r13
                float r1 = r1 * r13
                int r1 = (int) r1
                java.lang.Object r13 = r2.get(r10)
                java.lang.Float r13 = (java.lang.Float) r13
                float r13 = r13.floatValue()
                w5.b r14 = w5.b.this
                int r14 = r14.f17509d
                float r14 = (float) r14
                float r13 = r13 * r14
                int r13 = (int) r13
                java.lang.Object r14 = r2.get(r9)
                java.lang.Float r14 = (java.lang.Float) r14
                float r14 = r14.floatValue()
                w5.b r15 = w5.b.this
                int r15 = r15.f17508c
                float r15 = (float) r15
                float r14 = r14 * r15
                int r14 = (int) r14
                java.lang.Object r2 = r2.get(r7)
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                w5.b r7 = w5.b.this
                int r7 = r7.f17509d
                goto L_0x0110
            L_0x005e:
                r13 = 90
                r14 = 6
                r15 = 7
                r16 = 1065353216(0x3f800000, float:1.0)
                if (r1 != r13) goto L_0x00b8
                java.lang.Object r1 = r2.get(r15)
                java.lang.Float r1 = (java.lang.Float) r1
                float r1 = r1.floatValue()
                w5.b r7 = w5.b.this
                int r7 = r7.f17508c
                float r7 = (float) r7
                float r1 = r1 * r7
                int r1 = (int) r1
                java.lang.Object r7 = r2.get(r14)
                java.lang.Float r7 = (java.lang.Float) r7
                float r7 = r7.floatValue()
                float r7 = r16 - r7
                w5.b r13 = w5.b.this
                int r13 = r13.f17509d
                float r13 = (float) r13
                float r7 = r7 * r13
                int r7 = (int) r7
                java.lang.Object r13 = r2.get(r12)
                java.lang.Float r13 = (java.lang.Float) r13
                float r13 = r13.floatValue()
                w5.b r14 = w5.b.this
                int r14 = r14.f17508c
                float r14 = (float) r14
                float r13 = r13 * r14
                int r13 = (int) r13
                java.lang.Object r2 = r2.get(r8)
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                float r16 = r16 - r2
                w5.b r2 = w5.b.this
                int r2 = r2.f17509d
                goto L_0x017a
            L_0x00b8:
                r13 = 180(0xb4, float:2.52E-43)
                if (r1 != r13) goto L_0x012a
                java.lang.Object r1 = r2.get(r9)
                java.lang.Float r1 = (java.lang.Float) r1
                float r1 = r1.floatValue()
                float r1 = r16 - r1
                w5.b r13 = w5.b.this
                int r13 = r13.f17508c
                float r13 = (float) r13
                float r1 = r1 * r13
                int r1 = (int) r1
                java.lang.Object r7 = r2.get(r7)
                java.lang.Float r7 = (java.lang.Float) r7
                float r7 = r7.floatValue()
                float r7 = r16 - r7
                w5.b r13 = w5.b.this
                int r13 = r13.f17509d
                float r13 = (float) r13
                float r7 = r7 * r13
                int r13 = (int) r7
                java.lang.Object r7 = r2.get(r11)
                java.lang.Float r7 = (java.lang.Float) r7
                float r7 = r7.floatValue()
                float r7 = r16 - r7
                w5.b r14 = w5.b.this
                int r14 = r14.f17508c
                float r14 = (float) r14
                float r7 = r7 * r14
                int r14 = (int) r7
                java.lang.Object r2 = r2.get(r10)
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                float r2 = r16 - r2
                w5.b r7 = w5.b.this
                int r7 = r7.f17509d
            L_0x0110:
                float r7 = (float) r7
                float r2 = r2 * r7
                int r2 = (int) r2
                int r7 = r14 - r1
                float r7 = (float) r7
                int r15 = r2 - r13
                float r15 = (float) r15
                double r10 = (double) r1
                double r3 = (double) r7
                double r3 = r3 * r5
                double r10 = r10 - r3
                int r1 = (int) r10
                double r5 = (double) r13
                double r10 = (double) r15
                r13 = r14
                r14 = r3
                r3 = 4599976659396224614(0x3fd6666666666666, double:0.35)
                goto L_0x0197
            L_0x012a:
                java.lang.Object r1 = r2.get(r12)
                java.lang.Float r1 = (java.lang.Float) r1
                float r1 = r1.floatValue()
                float r1 = r16 - r1
                w5.b r3 = w5.b.this
                int r3 = r3.f17508c
                float r3 = (float) r3
                float r1 = r1 * r3
                int r1 = (int) r1
                java.lang.Object r3 = r2.get(r8)
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                w5.b r4 = w5.b.this
                int r4 = r4.f17509d
                float r4 = (float) r4
                float r3 = r3 * r4
                int r7 = (int) r3
                java.lang.Object r3 = r2.get(r15)
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                float r16 = r16 - r3
                w5.b r3 = w5.b.this
                int r3 = r3.f17508c
                float r3 = (float) r3
                float r3 = r3 * r16
                int r13 = (int) r3
                java.lang.Object r2 = r2.get(r14)
                java.lang.Float r2 = (java.lang.Float) r2
                float r16 = r2.floatValue()
                w5.b r2 = w5.b.this
                int r2 = r2.f17509d
            L_0x017a:
                float r2 = (float) r2
                float r2 = r2 * r16
                int r2 = (int) r2
                int r3 = r13 - r1
                float r3 = (float) r3
                int r4 = r2 - r7
                float r4 = (float) r4
                double r10 = (double) r1
                double r14 = (double) r3
                r17 = 4599976659396224614(0x3fd6666666666666, double:0.35)
                double r14 = r14 * r17
                double r10 = r10 - r14
                int r1 = (int) r10
                double r10 = (double) r7
                double r3 = (double) r4
                r19 = r5
                r5 = r10
                r10 = r3
                r3 = r19
            L_0x0197:
                double r10 = r10 * r3
                double r5 = r5 - r10
                int r3 = (int) r5
                double r4 = (double) r13
                double r4 = r4 + r14
                int r4 = (int) r4
                double r5 = (double) r2
                double r5 = r5 + r10
                int r2 = (int) r5
                if (r1 <= 0) goto L_0x01a4
                goto L_0x01a5
            L_0x01a4:
                r1 = 0
            L_0x01a5:
                if (r3 <= 0) goto L_0x01a8
                goto L_0x01a9
            L_0x01a8:
                r3 = 0
            L_0x01a9:
                w5.b r5 = w5.b.this
                int r5 = r5.f17509d
                int r5 = r5 - r12
                if (r2 <= r5) goto L_0x01b9
                w5.b r2 = w5.b.this
                int r2 = r2.f17509d
                int r2 = r2 - r12
            L_0x01b9:
                w5.b r5 = w5.b.this
                int r5 = r5.f17508c
                int r5 = r5 - r12
                if (r4 <= r5) goto L_0x01c9
                w5.b r4 = w5.b.this
                int r4 = r4.f17508c
                int r4 = r4 - r12
            L_0x01c9:
                java.util.ArrayList r5 = new java.util.ArrayList
                java.lang.Integer[] r6 = new java.lang.Integer[r9]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r7 = 0
                r6[r7] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r3 = 1
                r6[r3] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                r6[r8] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r6[r12] = r1
                java.util.List r1 = java.util.Arrays.asList(r6)
                r5.<init>(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: w5.b.C0207b.a(int, java.util.ArrayList):java.util.ArrayList");
        }

        public void run() {
            if (this.f17522a == null) {
                x5.a aVar = b.this.f17511f;
                if (aVar != null) {
                    aVar.b((ArrayList<Integer>) null, (e.a) null, 0, 0, (List<ArrayList<Integer>>) null);
                }
            } else if (this.f17527f != null) {
                new Handler(Looper.getMainLooper()).post(new a(new ArrayList()));
            } else {
                new Handler(Looper.getMainLooper()).post(new C0208b());
            }
        }
    }

    public b(x5.a aVar) {
        super("FaceHandler");
        float[] fArr = new float[2];
        this.f17510e = fArr;
        start();
        this.f17511f = aVar;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
    }

    public static b d(x5.a aVar) {
        if (j == null) {
            j = new b(aVar);
        }
        return j;
    }

    public void e(double d11) {
        if (this.f17512g) {
            n5.a.m(d11);
        }
    }

    public void f(c6.b bVar) {
        this.f17508c = bVar.h();
        this.f17509d = bVar.g();
        this.f17512g = bVar.k();
        this.f17506a.removeCallbacksAndMessages((Object) null);
        this.f17506a.post(new a(bVar.b(), bVar.i(), bVar.c(), bVar.d(), bVar.f(), bVar.k(), bVar.j()));
    }

    public void i() {
        this.f17511f = null;
        j = null;
    }
}
