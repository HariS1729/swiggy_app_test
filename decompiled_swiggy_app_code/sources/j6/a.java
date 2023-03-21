package j6;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: HVSensorBiometrics */
public class a {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String f15297m = "co.hyperverge.hypersnapsdk.service.d.a";

    /* renamed from: a  reason: collision with root package name */
    private Context f15298a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Map<Long, float[]> f15299b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<Long, float[]> f15300c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Map<Long, float[]> f15301d = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public File f15302e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public File f15303f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public File f15304g;

    /* renamed from: h  reason: collision with root package name */
    private SensorManager f15305h;

    /* renamed from: i  reason: collision with root package name */
    private Sensor f15306i;
    private Sensor j;
    private Sensor k;

    /* renamed from: l  reason: collision with root package name */
    private SensorEventListener f15307l = new C0140a();

    /* renamed from: j6.a$a  reason: collision with other inner class name */
    /* compiled from: HVSensorBiometrics */
    class C0140a implements SensorEventListener {
        C0140a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i11) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            int type = sensorEvent.sensor.getType();
            float[] fArr = sensorEvent.values;
            long currentTimeMillis = System.currentTimeMillis();
            if (type == 1) {
                a.this.f15299b.put(Long.valueOf(currentTimeMillis), fArr);
                String unused = a.f15297m;
                Arrays.toString(fArr);
                String unused2 = a.f15297m;
                a.this.f15299b.size();
                if (a.this.f15299b.size() > 100) {
                    a aVar = a.this;
                    aVar.f(aVar.f15299b, a.this.f15302e);
                    a aVar2 = a.this;
                    aVar2.e(aVar2.f15299b);
                }
            } else if (type == 2) {
                a.this.f15300c.put(Long.valueOf(currentTimeMillis), fArr);
                String unused3 = a.f15297m;
                Arrays.toString(fArr);
                String unused4 = a.f15297m;
                a.this.f15300c.size();
                if (a.this.f15300c.size() > 100) {
                    a aVar3 = a.this;
                    aVar3.f(aVar3.f15300c, a.this.f15303f);
                    a aVar4 = a.this;
                    aVar4.e(aVar4.f15300c);
                }
            } else if (type == 4) {
                a.this.f15301d.put(Long.valueOf(currentTimeMillis), fArr);
                String unused5 = a.f15297m;
                Arrays.toString(fArr);
                String unused6 = a.f15297m;
                a.this.f15301d.size();
                if (a.this.f15301d.size() > 100) {
                    a aVar5 = a.this;
                    aVar5.f(aVar5.f15301d, a.this.f15304g);
                    a aVar6 = a.this;
                    aVar6.e(aVar6.f15301d);
                }
            }
        }
    }

    public a(Context context) {
        this.f15298a = context;
        this.f15305h = (SensorManager) context.getSystemService("sensor");
        z();
        i();
    }

    private File a(File file, String str) {
        PrintWriter printWriter;
        File file2 = new File(file, str);
        try {
            printWriter = new PrintWriter(file2);
            if (file2.exists()) {
                printWriter.print("");
            }
            printWriter.close();
        } catch (Exception e11) {
            Log.e(f15297m, e11.getMessage());
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        return file2;
        throw th;
    }

    /* access modifiers changed from: private */
    public void f(Map<Long, float[]> map, File file) {
        BufferedWriter bufferedWriter;
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            try {
                bufferedWriter = new BufferedWriter(fileWriter);
                for (Map.Entry next : map.entrySet()) {
                    bufferedWriter.append(String.valueOf(next.getKey())).append(Constants.COLON_SEPARATOR).append(Arrays.toString((float[]) next.getValue()));
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
                bufferedWriter.close();
                fileWriter.close();
                return;
            } catch (Throwable th2) {
                fileWriter.close();
                throw th2;
            }
            throw th;
        } catch (Exception e11) {
            Log.e(f15297m, e11.getMessage());
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    private void i() {
        File file = new File(this.f15298a.getFilesDir(), "hv/sensorData");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f15302e = a(file, "accelerometerSensorData.txt");
        this.f15303f = a(file, "geomagneticSensorData.txt");
        this.f15304g = a(file, "gyroscopeSensorData.txt");
    }

    private void z() {
        this.f15306i = this.f15305h.getDefaultSensor(1);
        this.j = this.f15305h.getDefaultSensor(2);
        this.k = this.f15305h.getDefaultSensor(4);
    }

    public void e(Map<Long, float[]> map) {
        map.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!aVar.g(this)) {
            return false;
        }
        Context t = t();
        Context t11 = aVar.t();
        if (t != null ? !t.equals(t11) : t11 != null) {
            return false;
        }
        Map<Long, float[]> m11 = m();
        Map<Long, float[]> m12 = aVar.m();
        if (m11 != null ? !m11.equals(m12) : m12 != null) {
            return false;
        }
        Map<Long, float[]> q = q();
        Map<Long, float[]> q11 = aVar.q();
        if (q != null ? !q.equals(q11) : q11 != null) {
            return false;
        }
        Map<Long, float[]> s11 = s();
        Map<Long, float[]> s12 = aVar.s();
        if (s11 != null ? !s11.equals(s12) : s12 != null) {
            return false;
        }
        File j11 = j();
        File j12 = aVar.j();
        if (j11 != null ? !j11.equals(j12) : j12 != null) {
            return false;
        }
        File n = n();
        File n11 = aVar.n();
        if (n != null ? !n.equals(n11) : n11 != null) {
            return false;
        }
        File r11 = r();
        File r12 = aVar.r();
        if (r11 != null ? !r11.equals(r12) : r12 != null) {
            return false;
        }
        SensorManager y11 = y();
        SensorManager y12 = aVar.y();
        if (y11 != null ? !y11.equals(y12) : y12 != null) {
            return false;
        }
        Sensor u11 = u();
        Sensor u12 = aVar.u();
        if (u11 != null ? !u11.equals(u12) : u12 != null) {
            return false;
        }
        Sensor w11 = w();
        Sensor w12 = aVar.w();
        if (w11 != null ? !w11.equals(w12) : w12 != null) {
            return false;
        }
        Sensor x11 = x();
        Sensor x12 = aVar.x();
        if (x11 != null ? !x11.equals(x12) : x12 != null) {
            return false;
        }
        SensorEventListener v = v();
        SensorEventListener v11 = aVar.v();
        return v != null ? v.equals(v11) : v11 == null;
    }

    /* access modifiers changed from: protected */
    public boolean g(Object obj) {
        return obj instanceof a;
    }

    public int hashCode() {
        Context t = t();
        int i11 = 43;
        int hashCode = t == null ? 43 : t.hashCode();
        Map<Long, float[]> m11 = m();
        int hashCode2 = ((hashCode + 59) * 59) + (m11 == null ? 43 : m11.hashCode());
        Map<Long, float[]> q = q();
        int hashCode3 = (hashCode2 * 59) + (q == null ? 43 : q.hashCode());
        Map<Long, float[]> s11 = s();
        int hashCode4 = (hashCode3 * 59) + (s11 == null ? 43 : s11.hashCode());
        File j11 = j();
        int hashCode5 = (hashCode4 * 59) + (j11 == null ? 43 : j11.hashCode());
        File n = n();
        int hashCode6 = (hashCode5 * 59) + (n == null ? 43 : n.hashCode());
        File r11 = r();
        int hashCode7 = (hashCode6 * 59) + (r11 == null ? 43 : r11.hashCode());
        SensorManager y11 = y();
        int hashCode8 = (hashCode7 * 59) + (y11 == null ? 43 : y11.hashCode());
        Sensor u11 = u();
        int hashCode9 = (hashCode8 * 59) + (u11 == null ? 43 : u11.hashCode());
        Sensor w11 = w();
        int hashCode10 = (hashCode9 * 59) + (w11 == null ? 43 : w11.hashCode());
        Sensor x11 = x();
        int hashCode11 = (hashCode10 * 59) + (x11 == null ? 43 : x11.hashCode());
        SensorEventListener v = v();
        int i12 = hashCode11 * 59;
        if (v != null) {
            i11 = v.hashCode();
        }
        return i12 + i11;
    }

    public File j() {
        return this.f15302e;
    }

    public Map<Long, float[]> m() {
        return this.f15299b;
    }

    public File n() {
        return this.f15303f;
    }

    public Map<Long, float[]> q() {
        return this.f15300c;
    }

    public File r() {
        return this.f15304g;
    }

    public Map<Long, float[]> s() {
        return this.f15301d;
    }

    public Context t() {
        return this.f15298a;
    }

    public String toString() {
        return "HVSensorBiometrics(mContext=" + t() + ", accelerometerSensorDataMap=" + m() + ", geomagneticSensorDataMap=" + q() + ", gyroscopeSensorDataMap=" + s() + ", accelerometerSensorDataFile=" + j() + ", geomagneticSensorDataFile=" + n() + ", gyroscopeSensorDataFile=" + r() + ", mSensorManager=" + y() + ", mSensorAccelerometer=" + u() + ", mSensorGeoMagnetic=" + w() + ", mSensorGyroscope=" + x() + ", mSensorEventListener=" + v() + ")";
    }

    public Sensor u() {
        return this.f15306i;
    }

    public SensorEventListener v() {
        return this.f15307l;
    }

    public Sensor w() {
        return this.j;
    }

    public Sensor x() {
        return this.k;
    }

    public SensorManager y() {
        return this.f15305h;
    }
}
