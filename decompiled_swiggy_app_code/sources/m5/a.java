package m5;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import h5.b;
import java.util.ArrayList;

public class a extends b {
    private static final String t = a.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f15694b = false;

    /* renamed from: c  reason: collision with root package name */
    private Sensor f15695c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public b.a f15696d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<ArrayList<Float>> f15697e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<Long> f15698f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<Float> f15699g;

    /* renamed from: h  reason: collision with root package name */
    private int f15700h;

    /* renamed from: i  reason: collision with root package name */
    private long f15701i = 1000;
    private float j = 0.325f;
    /* access modifiers changed from: private */
    public Handler k;

    /* renamed from: l  reason: collision with root package name */
    private Runnable f15702l;

    /* renamed from: m  reason: collision with root package name */
    private Runnable f15703m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f15704o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f15705p;
    /* access modifiers changed from: private */
    public boolean q;

    /* renamed from: r  reason: collision with root package name */
    private Long f15706r;

    /* renamed from: s  reason: collision with root package name */
    private Long f15707s;

    /* renamed from: m5.a$a  reason: collision with other inner class name */
    class C0148a implements Runnable {
        C0148a() {
        }

        public void run() {
            boolean unused = a.this.q = true;
            n5.a.a((Object) null);
            boolean unused2 = a.this.f15694b = false;
            if (a.this.f15696d != null) {
                a.this.f15696d.a();
            }
            boolean unused3 = a.this.q = false;
            a.this.k.removeMessages(0);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            boolean unused = a.this.q = false;
        }
    }

    public a(Context context, int i11) {
        super(context);
        d(i11);
    }

    private void f(Long l11) {
        this.f15698f.add(l11);
        if (this.f15698f.size() > this.f15700h) {
            this.f15698f.remove(0);
        }
    }

    private void g(float[] fArr) {
        for (int i11 = 0; i11 < fArr.length; i11++) {
            this.f15697e.get(i11).add(Float.valueOf(fArr[i11]));
            if (this.f15697e.get(i11).size() > this.f15700h) {
                this.f15697e.get(i11).remove(0);
            }
        }
    }

    private boolean m() {
        System.currentTimeMillis();
        int i11 = this.f15700h / 2;
        int i12 = i11 - 1;
        if (this.f15698f.get(i11).longValue() - this.f15698f.get(i12).longValue() < 500) {
            int i13 = 0;
            while (i13 < this.f15697e.size()) {
                Float valueOf = Float.valueOf(((Float) this.f15697e.get(i13).get(i11)).floatValue() - this.f15699g.get(i13).floatValue());
                Float valueOf2 = Float.valueOf(((Float) this.f15697e.get(i13).get(i12)).floatValue() - this.f15699g.get(i13).floatValue());
                if ((Math.abs(valueOf.floatValue()) <= Math.max(this.j, this.f15699g.get(i13).floatValue() / 4.0f) && Math.abs(valueOf2.floatValue()) <= Math.max(this.j, this.f15699g.get(i13).floatValue() / 4.0f)) || valueOf.floatValue() * valueOf2.floatValue() >= 0.0f) {
                    i13++;
                } else if (this.q) {
                    return true;
                } else {
                    if (this.k.hasMessages(0)) {
                        this.k.removeCallbacks(this.f15702l);
                        this.k.removeMessages(0);
                    }
                    this.k.postDelayed(this.f15702l, 300);
                    this.k.sendEmptyMessage(0);
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        if (this.f15704o && !this.n) {
            this.f15710a.registerListener(this, this.f15695c, 3);
            this.n = true;
        }
    }

    public void d(int i11) {
        this.f15704o = false;
        this.n = false;
        this.f15705p = false;
        this.q = false;
        this.k = new Handler();
        this.f15702l = new C0148a();
        this.f15703m = new b();
        SensorManager sensorManager = this.f15710a;
        if (sensorManager != null) {
            this.f15695c = sensorManager.getDefaultSensor(1);
        } else {
            this.f15704o = false;
        }
        if (this.f15695c != null) {
            this.f15704o = true;
        }
        if (i11 > 15) {
            this.f15700h = 15;
        } else {
            this.f15700h = i11;
        }
        this.f15697e = new ArrayList<>(3);
        this.f15699g = new ArrayList<>(3);
        for (int i12 = 0; i12 < 3; i12++) {
            this.f15697e.add(i12, new ArrayList(this.f15700h));
            for (int i13 = 0; i13 < this.f15700h; i13++) {
                this.f15697e.get(i12).add(i13, Float.valueOf(0.0f));
            }
            this.f15699g.add(i12, Float.valueOf(0.0f));
        }
        this.f15698f = new ArrayList<>();
    }

    public void e(b.a aVar) {
        this.f15696d = aVar;
    }

    public void j() {
        if (this.n && this.f15704o) {
            this.f15710a.unregisterListener(this, this.f15695c);
            this.n = false;
            this.f15705p = false;
            this.k.removeCallbacksAndMessages((Object) null);
        }
    }

    public void l() {
        this.f15694b = true;
        if (!this.q && this.k.hasMessages(0)) {
            this.k.removeCallbacks(this.f15702l);
            this.k.removeMessages(0);
        }
        this.q = true;
        this.k.postDelayed(this.f15703m, 2500);
    }

    public void onAccuracyChanged(Sensor sensor, int i11) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (!this.f15705p) {
            this.f15706r = Long.valueOf(sensorEvent.timestamp);
            this.f15707s = Long.valueOf(System.currentTimeMillis());
            this.f15705p = true;
        }
        Long valueOf = Long.valueOf(this.f15707s.longValue() + ((long) Math.round((float) ((sensorEvent.timestamp - this.f15706r.longValue()) / 1000000))));
        if (type == 1) {
            for (int i11 = 0; i11 < this.f15699g.size(); i11++) {
                ArrayList<Float> arrayList = this.f15699g;
                arrayList.set(i11, Float.valueOf(b.a(arrayList.get(i11).floatValue(), ((Float) this.f15697e.get(i11).get(0)).floatValue(), sensorEvent.values[i11], this.f15700h)));
            }
            g(sensorEvent.values);
            f(valueOf);
            if (this.f15698f.size() == this.f15700h && valueOf.longValue() - this.f15707s.longValue() >= this.f15701i && this.f15694b) {
                m();
            }
        }
    }
}
