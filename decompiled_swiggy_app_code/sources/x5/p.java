package x5;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.util.Log;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.listeners.FaceCaptureCompletionHandler;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import h6.a;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import t5.b;
import w5.e;
import w5.f;
import w5.j;
import w5.n;
import w5.o;
import w5.p;
import w5.q;
import z5.g;

/* compiled from: TexturePresenter */
public class p implements a {
    long A;
    int B;
    String C;
    String D;
    j E;
    MediaMetadataRetriever F;
    private String G;
    /* access modifiers changed from: private */
    public Location H;
    private String I;
    private String J;
    /* access modifiers changed from: private */
    public String K;

    /* renamed from: a  reason: collision with root package name */
    public final float f17708a;

    /* renamed from: b  reason: collision with root package name */
    private final float f17709b;

    /* renamed from: c  reason: collision with root package name */
    private final float f17710c;

    /* renamed from: d  reason: collision with root package name */
    private final float f17711d;

    /* renamed from: e  reason: collision with root package name */
    private final float f17712e;

    /* renamed from: f  reason: collision with root package name */
    private final float f17713f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final String f17714g;

    /* renamed from: h  reason: collision with root package name */
    public String f17715h;

    /* renamed from: i  reason: collision with root package name */
    w5.b f17716i;
    a6.b j;
    b k;

    /* renamed from: l  reason: collision with root package name */
    boolean f17717l;

    /* renamed from: m  reason: collision with root package name */
    boolean f17718m;
    boolean n;

    /* renamed from: o  reason: collision with root package name */
    boolean f17719o;

    /* renamed from: p  reason: collision with root package name */
    boolean f17720p;
    t5.a q;

    /* renamed from: r  reason: collision with root package name */
    a6.a f17721r;

    /* renamed from: s  reason: collision with root package name */
    Handler f17722s;
    HVFaceConfig.LivenessMode t;

    /* renamed from: u  reason: collision with root package name */
    String f17723u;
    FaceCaptureCompletionHandler v;

    /* renamed from: w  reason: collision with root package name */
    e.a f17724w;

    /* renamed from: x  reason: collision with root package name */
    String f17725x;

    /* renamed from: y  reason: collision with root package name */
    ArrayList<Integer> f17726y;

    /* renamed from: z  reason: collision with root package name */
    HVFaceConfig f17727z;

    /* compiled from: TexturePresenter */
    class a implements Runnable {
        a() {
        }

        public void run() {
            p.this.K(true);
        }
    }

    /* compiled from: TexturePresenter */
    class b implements Runnable {
        b() {
        }

        public void run() {
            p.this.K(true);
        }
    }

    /* compiled from: TexturePresenter */
    class c implements p.a {

        /* renamed from: a  reason: collision with root package name */
        String f17730a = "";

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f17731b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f17732c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ w5.d f17733d;

        /* compiled from: TexturePresenter */
        class a implements a.C0128a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f17735a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f17736b;

            a(String str, List list) {
                this.f17735a = str;
                this.f17736b = list;
            }

            public void a(co.hyperverge.hypersnapsdk.objects.e eVar) {
                c cVar = c.this;
                p.this.u(cVar.f17731b, cVar.f17732c, this.f17735a, this.f17736b, eVar, cVar.f17733d, cVar.f17730a);
            }

            public void a() {
                c cVar = c.this;
                p.this.u(cVar.f17731b, cVar.f17732c, this.f17735a, this.f17736b, (co.hyperverge.hypersnapsdk.objects.e) null, cVar.f17733d, cVar.f17730a);
            }
        }

        c(String str, String str2, w5.d dVar) {
            this.f17731b = str;
            this.f17732c = str2;
            this.f17733d = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x005d, code lost:
            r0 = r10.f17734e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r11, java.util.List<java.lang.Integer> r12) {
            /*
                r10 = this;
                x5.p r0 = x5.p.this
                x5.b r0 = r0.k
                r0.a((java.lang.String) r11)
                x5.p r0 = x5.p.this
                r0.f17725x = r11
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r10.f17731b
                r1.append(r2)
                java.lang.String r2 = "/"
                r1.append(r2)
                java.lang.String r2 = r10.f17732c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.f17715h = r1
                x5.p r0 = x5.p.this
                r0.J()
                w5.n r0 = w5.n.w()
                boolean r0 = r0.C()
                if (r0 != 0) goto L_0x003a
                x5.p r0 = x5.p.this
                java.lang.String r1 = r0.f17715h
                r0.f17725x = r1
            L_0x003a:
                x5.p r0 = x5.p.this
                co.hyperverge.hypersnapsdk.objects.HVFaceConfig r0 = r0.f17727z
                boolean r0 = r0.isShouldHandleRetries()
                if (r0 != 0) goto L_0x004c
                x5.p r0 = x5.p.this
                x5.b r0 = r0.k
                r0.d()
                goto L_0x0053
            L_0x004c:
                x5.p r0 = x5.p.this
                x5.b r0 = r0.k
                r0.a()
            L_0x0053:
                w5.n r0 = w5.n.w()
                boolean r0 = r0.C()
                if (r0 == 0) goto L_0x009b
                x5.p r0 = x5.p.this
                java.lang.String r1 = r0.f17725x
                if (r1 == 0) goto L_0x0086
                java.lang.String r0 = r0.f17715h
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0086
                x5.p r0 = x5.p.this
                java.lang.String r0 = r0.f17725x
                if (r0 == 0) goto L_0x0077
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0086
            L_0x0077:
                java.io.File r0 = new java.io.File
                x5.p r1 = x5.p.this
                java.lang.String r1 = r1.f17725x
                r0.<init>(r1)
                boolean r0 = r0.exists()
                if (r0 != 0) goto L_0x009b
            L_0x0086:
                x5.p r11 = x5.p.this
                x5.b r12 = r11.k
                int r0 = co.hyperverge.hypersnapsdk.R.string.blurry_face_detection_error
                java.lang.String r12 = r12.a((int) r0)
                r0 = 23
                co.hyperverge.hypersnapsdk.objects.HVError r12 = r11.j(r0, r12)
                r0 = 0
                r11.p(r12, r0)
                return
            L_0x009b:
                x5.p r0 = x5.p.this
                co.hyperverge.hypersnapsdk.objects.HVFaceConfig r0 = r0.f17727z
                org.json.JSONObject r0 = r0.getHeaders()
                if (r0 == 0) goto L_0x00e8
                x5.p r0 = x5.p.this
                co.hyperverge.hypersnapsdk.objects.HVFaceConfig r0 = r0.f17727z
                org.json.JSONObject r0 = r0.getHeaders()
                java.lang.String r1 = "transactionId"
                boolean r0 = r0.has(r1)
                if (r0 == 0) goto L_0x00e8
                x5.p r0 = x5.p.this     // Catch:{ JSONException -> 0x00c4 }
                co.hyperverge.hypersnapsdk.objects.HVFaceConfig r0 = r0.f17727z     // Catch:{ JSONException -> 0x00c4 }
                org.json.JSONObject r0 = r0.getHeaders()     // Catch:{ JSONException -> 0x00c4 }
                java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x00c4 }
                r10.f17730a = r0     // Catch:{ JSONException -> 0x00c4 }
                goto L_0x00ee
            L_0x00c4:
                r0 = move-exception
                w5.n r1 = w5.n.w()
                f6.b r1 = r1.s()
                if (r1 == 0) goto L_0x00da
                w5.n r1 = w5.n.w()
                f6.b r1 = r1.s()
                r1.a(r0)
            L_0x00da:
                x5.p r1 = x5.p.this
                java.lang.String r1 = r1.f17714g
                java.lang.String r0 = r0.toString()
                android.util.Log.e(r1, r0)
                goto L_0x00ee
            L_0x00e8:
                java.lang.String r0 = w5.o.r()
                r10.f17730a = r0
            L_0x00ee:
                w5.n r0 = w5.n.w()
                co.hyperverge.hypersnapsdk.b.e r0 = r0.z()
                boolean r0 = r0.g()
                if (r0 == 0) goto L_0x010a
                h6.c r0 = new h6.c
                r0.<init>()
                x5.p$c$a r1 = new x5.p$c$a
                r1.<init>(r11, r12)
                r0.a(r1)
                goto L_0x011a
            L_0x010a:
                x5.p r2 = x5.p.this
                java.lang.String r3 = r10.f17731b
                java.lang.String r4 = r10.f17732c
                w5.d r8 = r10.f17733d
                java.lang.String r9 = r10.f17730a
                r7 = 0
                r5 = r11
                r6 = r12
                r2.u(r3, r4, r5, r6, r7, r8, r9)
            L_0x011a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x5.p.c.a(java.lang.String, java.util.List):void");
        }
    }

    /* compiled from: TexturePresenter */
    class e implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f17741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c6.d f17742b;

        e(String str, c6.d dVar) {
            this.f17741a = str;
            this.f17742b = dVar;
        }

        public void a(boolean z11, String str, String str2, HVError hVError) {
            p pVar = p.this;
            pVar.C = str2;
            pVar.D = str;
            if (z11) {
                Intent intent = new Intent(p.this.k.c(), HVRetakeActivity.class);
                intent.putExtra("imageUri", this.f17741a);
                intent.putExtra("retryMessage", str);
                intent.putExtra(PaymentConstants.Category.CONFIG, p.this.f17727z);
                intent.putExtra("face", true);
                intent.putExtra("radius", p.this.k.k());
                ((Activity) p.this.k.c()).startActivityForResult(intent, 1);
                return;
            }
            pVar.n(this.f17742b, hVError);
        }
    }

    /* compiled from: TexturePresenter */
    class f implements b6.d {
        f() {
        }

        public void a(Location location) {
            if (location != null) {
                Location unused = p.this.H = location;
                p pVar = p.this;
                String unused2 = pVar.K = location.getLatitude() + ", " + location.getLongitude();
                return;
            }
            p pVar2 = p.this;
            Location unused3 = pVar2.H = i6.a.d(pVar2.k.c()).a();
            p pVar3 = p.this;
            String unused4 = pVar3.K = p.this.H.getLatitude() + ", " + p.this.H.getLongitude();
        }
    }

    public p() {
        this.f17708a = 5.0f;
        this.f17709b = 0.2f;
        this.f17710c = 0.9f;
        this.f17711d = 0.3f;
        this.f17712e = 0.35f;
        this.f17713f = 0.6f;
        this.f17714g = p.class.getSimpleName();
        this.t = HVFaceConfig.LivenessMode.TEXTURELIVENESS;
        this.f17723u = "";
        this.f17725x = "";
        this.f17726y = new ArrayList<>();
        this.B = 0;
        this.C = null;
        this.D = null;
        this.F = new MediaMetadataRetriever();
        this.G = "";
        this.K = "";
        this.j = a6.b.a();
        this.f17721r = a6.a.a();
        this.f17719o = true;
        this.f17726y = new ArrayList<>();
        this.f17722s = new Handler();
        this.f17717l = false;
        this.f17720p = false;
        this.f17727z = new HVFaceConfig();
        this.q = t5.a.a();
        this.E = j.n();
        this.v = y5.a.a().d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(HVError hVError, co.hyperverge.hypersnapsdk.objects.b bVar) {
        if (n5.a.e()) {
            this.v.f(hVError, bVar);
            L();
            return;
        }
        new Handler().postDelayed(new l(this, hVError, bVar), 20);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(boolean z11) {
        if (this.f17727z.getCustomLoaderClass() == null) {
            this.k.a(z11);
        } else if (z11) {
            try {
                ((Activity) this.k.c()).startActivityForResult(new Intent(this.k.c(), Class.forName(this.f17727z.getCustomLoaderClass())), 87);
            } catch (ClassNotFoundException e11) {
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        } else {
            ((Activity) this.k.c()).finishActivity(87);
        }
    }

    private void M() {
        i6.a.d(this.k.c()).g();
        i6.a.d(this.k.c()).e(new f());
    }

    /* access modifiers changed from: private */
    public void u(String str, String str2, String str3, List<Integer> list, co.hyperverge.hypersnapsdk.objects.e eVar, w5.d dVar, String str4) {
        dVar.c(this.f17725x, str4, eVar);
        dVar.c(this.f17715h, str4, eVar);
        if (this.f17727z.isShouldAddWaterMark()) {
            dVar.c(this.I, str4, eVar);
            dVar.c(this.J, str4, eVar);
        }
        if (this.f17727z.isShouldRecordVideo()) {
            long a11 = g.a(this.G, this.k.c(), this.F);
            if (a11 == 0) {
                this.G = null;
                HVError hVError = new HVError(2, "videoDuration is 0 ms");
                if (n.w().m() != null) {
                    n.w().m().i(hVError, this.k.g());
                }
            } else if (n.w().m() != null) {
                n.w().m().d0(this.G, a11, this.k.g());
            }
        }
        if (this.t == HVFaceConfig.LivenessMode.NONE) {
            n((c6.d) null, (HVError) null);
            return;
        }
        v(str + "/" + str2, str3, list, this.G);
        this.f17718m = false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z(byte[] bArr, long j11) {
        this.E.j(bArr, j11);
    }

    public boolean A(int i11, List<Integer> list) {
        long intValue = (long) (list.get(2).intValue() - list.get(0).intValue());
        long intValue2 = ((long) list.get(1).intValue()) + (((long) (list.get(3).intValue() - list.get(1).intValue())) / 2);
        float f11 = this.f17727z.getShouldUseBackCamera() ? 0.35f : 0.3f;
        boolean z11 = ((double) Math.abs(((float) i11) - (((float) intValue2) + this.k.h()))) < ((double) i11) * 0.3d;
        float f12 = (float) intValue;
        if (f12 <= f11 * ((float) z5.f.h()) || f12 >= ((float) z5.f.h()) * 0.6f || !z11) {
            return false;
        }
        return true;
    }

    public boolean B(List<ArrayList<Integer>> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        this.B = 0;
        int i11 = 0;
        for (ArrayList<Integer> G2 : list) {
            if (G(G2)) {
                i11++;
            }
        }
        if (i11 > 0) {
            return true;
        }
        return false;
    }

    public void D(c6.d dVar, String str) {
        try {
            o(dVar, str);
        } catch (Exception e11) {
            Log.e(this.f17714g, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void F(byte[] bArr, long j11) {
        this.j.b(new o(this, bArr, j11));
    }

    public boolean G(List<Integer> list) {
        float intValue = (float) ((long) (list.get(2).intValue() - list.get(0).intValue()));
        if (intValue <= (this.f17727z.getShouldUseBackCamera() ? 0.35f : 0.3f) * ((float) z5.f.h()) || intValue >= ((float) z5.f.h()) * 0.6f) {
            return false;
        }
        return true;
    }

    public void J() {
        if (this.f17727z.isShouldAddWaterMark() && p5.a.t().s().isShouldUseLocation()) {
            if (this.f17715h != null) {
                this.I = q.c().b(this.k.c(), this.f17727z, this.K, this.f17715h, false);
            }
            if (this.f17725x != null) {
                this.J = q.c().b(this.k.c(), this.f17727z, this.K, this.f17725x, true);
            }
        }
    }

    public void K(boolean z11) {
        this.f17719o = z11;
    }

    public void L() {
        try {
            this.E.g();
            this.f17716i.i();
            w5.f.b();
            this.k.l();
            MediaMetadataRetriever mediaMetadataRetriever = this.F;
            if (mediaMetadataRetriever != null) {
                mediaMetadataRetriever.release();
            }
        } catch (Exception e11) {
            Log.e(this.f17714g, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void N() {
        this.k.b();
        this.n = true;
        K(false);
        this.f17722s.postDelayed(new b(), 50);
    }

    public void a(c6.b bVar) {
        this.f17716i.f(bVar);
        F(bVar.b(), bVar.e());
    }

    public void b(ArrayList<Integer> arrayList, e.a aVar, int i11, int i12, List<ArrayList<Integer>> list) {
        if (!this.f17718m && this.f17719o) {
            if (arrayList != null && !arrayList.isEmpty() && this.f17717l) {
                this.f17717l = false;
            }
            this.f17724w = aVar;
            boolean B2 = B(list);
            boolean z11 = true;
            if (B2) {
                this.f17720p = true;
                this.f17717l = false;
                this.n = false;
                K(false);
                this.k.o();
                this.f17722s.postDelayed(new a(), 50);
            } else if ((arrayList == null || arrayList.isEmpty()) && (this.f17717l || this.n)) {
                this.k.f();
                this.f17717l = false;
                this.n = false;
            } else if (arrayList == null || arrayList.isEmpty() || this.f17717l) {
                this.B = 0;
                this.k.f();
                this.f17717l = false;
            } else {
                this.n = false;
                int i13 = this.B + 1;
                this.B = i13;
                if (((float) i13) < 5.0f) {
                    z11 = false;
                }
                if (!z11) {
                    this.f17717l = false;
                    return;
                }
                this.f17726y = arrayList;
                long intValue = (long) (arrayList.get(2).intValue() - arrayList.get(0).intValue());
                if (A((int) this.k.e(), arrayList)) {
                    w(aVar);
                    return;
                }
                this.B = 0;
                if (((float) intValue) > ((float) z5.f.h()) * 0.6f) {
                    N();
                } else {
                    this.k.f();
                }
                this.f17717l = false;
            }
        }
    }

    public void c() {
        this.k.d();
        if (n.w().m() != null) {
            n.w().m().C(this.f17727z);
        }
        n((c6.d) null, j(3, this.k.a(R.string.operation_cancelled)));
    }

    public void d(byte[] bArr, byte[] bArr2, String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        this.f17718m = true;
        w5.d dVar = new w5.d();
        byte[] bArr3 = bArr;
        dVar.d(bArr, str + "/" + str2, this.H);
        if (this.t != HVFaceConfig.LivenessMode.NONE) {
            a(true);
        }
        this.G = str3;
        this.j.b(new w5.p(bArr, bArr2, str, this.f17724w, str2, this.f17727z, new c(str, str2, dVar)));
    }

    public HVError j(int i11, String str) {
        return new HVError(i11, str);
    }

    public JSONObject m(c6.d dVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = dVar.f12847b;
        if (jSONObject2 == null) {
            try {
                JSONObject jSONObject3 = dVar.f12848c;
                if (!jSONObject3.has("X-HV-Raw-Response")) {
                    return jSONObject;
                }
                jSONObject2 = new JSONObject(jSONObject3.getString("X-HV-Raw-Response"));
                if (!jSONObject2.has("result")) {
                    return jSONObject;
                }
            } catch (JSONException e11) {
                Log.e(this.f17714g, e11.getMessage());
                return jSONObject;
            }
        }
        return jSONObject2;
    }

    public void n(c6.d dVar, HVError hVError) {
        if (this.v != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = null;
                if (dVar != null) {
                    JSONObject jSONObject3 = dVar.f12847b;
                    if (jSONObject3 != null) {
                        if (this.t == HVFaceConfig.LivenessMode.TEXTURELIVENESS) {
                            n.w().m().V(dVar, this.f17727z, this.A);
                        }
                        jSONObject = jSONObject3;
                    }
                    jSONObject2 = dVar.f12848c;
                }
                co.hyperverge.hypersnapsdk.objects.b bVar = new co.hyperverge.hypersnapsdk.objects.b(jSONObject, jSONObject2, this.f17725x, this.C);
                bVar.setRetakeMessage(this.D);
                bVar.setAttemptsCount(o.a(this.f17727z.getLivenessEndpoint(), ""));
                if (this.f17727z.isShouldReturnFullImageUrl()) {
                    bVar.setFullImageURI(this.f17715h);
                } else if (!z5.e.a(this.f17715h)) {
                    new File(this.f17715h).delete();
                }
                if (this.f17727z.isShouldAddWaterMark() && p5.a.t().s().isShouldUseLocation()) {
                    bVar.setWaterMarkFullImageUri(this.I);
                    bVar.setWaterMarkCroppedImageUri(this.J);
                }
                bVar.setVideoUri(this.G);
                bVar.toString();
                E(hVError, bVar);
            } catch (Exception e11) {
                Log.e(this.f17714g, e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }
    }

    public void o(c6.d dVar, String str) {
        w5.f.e().c(m(dVar), this.f17727z, new e(str, dVar));
    }

    public void p(HVError hVError, c6.d dVar) {
        if (n.w().m() != null) {
            n.w().m().f0(hVError, dVar, this.f17727z);
        }
        a(false);
        n(dVar, hVError);
    }

    /* renamed from: q */
    public void E(HVError hVError, co.hyperverge.hypersnapsdk.objects.b bVar) {
        this.f17721r.b(new m(this, hVError, bVar));
    }

    public void r(HVFaceConfig.LivenessMode livenessMode) {
        if (livenessMode != null) {
            this.t = livenessMode;
        }
    }

    public void s(HVFaceConfig hVFaceConfig) {
        this.f17727z = hVFaceConfig;
    }

    public void t(String str) {
        this.f17723u = str;
    }

    public void v(String str, String str2, List<Integer> list, String str3) {
        co.hyperverge.hypersnapsdk.c.p pVar = new co.hyperverge.hypersnapsdk.c.p();
        if (this.f17727z.isShouldHandleRetries() && !z5.e.a(o.r())) {
            w5.f.e().g(this.f17727z);
        }
        this.q.d(this.k.c(), str, str2, str3, list, this.f17727z, new d(pVar, str));
    }

    public void w(e.a aVar) {
        if (!p5.a.t().s().isShouldUseLocation() || this.H != null) {
            this.k.i();
            this.f17717l = true;
            this.f17724w = aVar;
            return;
        }
        this.f17717l = false;
    }

    public void x(b bVar) {
        this.k = bVar;
    }

    public void a(boolean z11) {
        this.f17721r.b(new n(this, z11));
    }

    public void a() {
        this.f17716i = w5.b.d(this);
        try {
            M();
        } catch (NoClassDefFoundError unused) {
            Log.e(this.f17714g, "gms excluded");
        }
    }

    public void c(boolean z11) {
        this.f17717l = z11;
    }

    /* compiled from: TexturePresenter */
    class d implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ co.hyperverge.hypersnapsdk.c.p f17738a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f17739b;

        d(co.hyperverge.hypersnapsdk.c.p pVar, String str) {
            this.f17738a = pVar;
            this.f17739b = str;
        }

        public void a(c6.a aVar) {
            HVError hVError;
            p.this.A = this.f17738a.c().longValue();
            c6.d dVar = (c6.d) aVar;
            p.this.a(false);
            if (aVar != null) {
                int a11 = aVar.a();
                if (a11 == 200 || a11 == 422) {
                    if (n.w().m() != null) {
                        n.w().m().s(dVar, this.f17739b, this.f17738a.c().longValue());
                    }
                    p.this.D(dVar, this.f17739b);
                    return;
                }
                if (dVar.c() != null) {
                    hVError = p.this.j(dVar.a(), dVar.c());
                } else {
                    hVError = p.this.j(14, "Internal server error has occurred.");
                }
                if (n.w().m() != null) {
                    n.w().m().x((c6.d) null, hVError);
                }
                p.this.p(hVError, dVar);
                return;
            }
            HVError j = p.this.j(14, "Internal server error has occurred.");
            if (n.w().m() != null) {
                n.w().m().x((c6.d) null, j);
            }
            p.this.p(j, dVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x002e A[Catch:{ Exception -> 0x003f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x001b
                java.lang.String r0 = "Certificate pinning"
                boolean r0 = r4.contains(r0)     // Catch:{ Exception -> 0x003f }
                if (r0 == 0) goto L_0x001b
                x5.p r4 = x5.p.this     // Catch:{ Exception -> 0x003f }
                r0 = 15
                x5.b r1 = r4.k     // Catch:{ Exception -> 0x003f }
                int r2 = co.hyperverge.hypersnapsdk.R.string.ssl_error     // Catch:{ Exception -> 0x003f }
                java.lang.String r1 = r1.a((int) r2)     // Catch:{ Exception -> 0x003f }
                co.hyperverge.hypersnapsdk.objects.HVError r4 = r4.j(r0, r1)     // Catch:{ Exception -> 0x003f }
                goto L_0x0023
            L_0x001b:
                x5.p r0 = x5.p.this     // Catch:{ Exception -> 0x003f }
                r1 = 12
                co.hyperverge.hypersnapsdk.objects.HVError r4 = r0.j(r1, r4)     // Catch:{ Exception -> 0x003f }
            L_0x0023:
                w5.n r0 = w5.n.w()     // Catch:{ Exception -> 0x003f }
                q5.b r0 = r0.m()     // Catch:{ Exception -> 0x003f }
                r1 = 0
                if (r0 == 0) goto L_0x0039
                w5.n r0 = w5.n.w()     // Catch:{ Exception -> 0x003f }
                q5.b r0 = r0.m()     // Catch:{ Exception -> 0x003f }
                r0.x(r1, r4)     // Catch:{ Exception -> 0x003f }
            L_0x0039:
                x5.p r0 = x5.p.this     // Catch:{ Exception -> 0x003f }
                r0.p(r4, r1)     // Catch:{ Exception -> 0x003f }
                goto L_0x0062
            L_0x003f:
                r4 = move-exception
                x5.p r0 = x5.p.this
                java.lang.String r0 = r0.f17714g
                java.lang.String r1 = r4.getMessage()
                android.util.Log.e(r0, r1)
                w5.n r0 = w5.n.w()
                f6.b r0 = r0.s()
                if (r0 == 0) goto L_0x0062
                w5.n r0 = w5.n.w()
                f6.b r0 = r0.s()
                r0.a(r4)
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x5.p.d.a(java.lang.String):void");
        }

        public void a() {
            p pVar = p.this;
            HVError j = pVar.j(12, pVar.k.a(R.string.network_error));
            if (n.w().m() != null) {
                n.w().m().x((c6.d) null, j);
            }
            p.this.p(j, (c6.d) null);
        }
    }

    public boolean b() {
        return this.f17717l || !n.w().C();
    }
}
