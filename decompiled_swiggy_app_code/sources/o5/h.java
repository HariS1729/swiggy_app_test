package o5;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import i5.c;
import java.io.File;
import java.util.ArrayList;

@Instrumented
public class h extends AsyncTask implements TraceFieldInterface {
    private static final String j = h.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private File f15938a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f15939b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f15940c;

    /* renamed from: d  reason: collision with root package name */
    boolean f15941d;

    /* renamed from: e  reason: collision with root package name */
    boolean f15942e;

    /* renamed from: f  reason: collision with root package name */
    int f15943f;

    /* renamed from: g  reason: collision with root package name */
    boolean f15944g = false;

    /* renamed from: h  reason: collision with root package name */
    c f15945h;

    /* renamed from: i  reason: collision with root package name */
    public Trace f15946i;

    public h(File file, byte[] bArr, c cVar) {
        this.f15938a = file;
        this.f15939b = bArr;
        this.f15945h = cVar;
    }

    public void _nr_setTrace(Trace trace) {
        try {
            this.f15946i = trace;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public String a(Boolean... boolArr) {
        if (this.f15938a == null) {
            return null;
        }
        int b11 = a.b(this.f15939b);
        try {
            byte[] bArr = this.f15939b;
            this.f15940c = BitmapFactoryInstrumentation.decodeByteArray(bArr, 0, bArr.length);
        } catch (OutOfMemoryError e11) {
            e11.getMessage();
            System.gc();
            this.f15944g = false;
            try {
                byte[] bArr2 = this.f15939b;
                this.f15940c = BitmapFactoryInstrumentation.decodeByteArray(bArr2, 0, bArr2.length);
                this.f15944g = true;
            } catch (OutOfMemoryError e12) {
                e12.getMessage();
            }
        }
        if (!boolArr[0].booleanValue() || !boolArr[1].booleanValue()) {
            this.f15941d = false;
            this.f15942e = false;
        } else if (b11 == 0 || b11 == 1 || b11 == 3) {
            this.f15941d = true;
            this.f15942e = false;
        } else if (b11 == 6 || b11 == 8) {
            this.f15941d = false;
            this.f15942e = true;
        }
        this.f15943f = b11;
        this.f15944g = true;
        return "true";
    }

    /* access modifiers changed from: protected */
    public void b(String str) {
        if (this.f15944g || this.f15940c == null) {
            this.f15945h.d(this.f15940c, this.f15938a, this.f15941d, this.f15942e, this.f15943f);
        }
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            TraceMachine.enterMethod(this.f15946i, "h#doInBackground", (ArrayList<String>) null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod((Trace) null, "h#doInBackground", (ArrayList<String>) null);
        }
        String a11 = a((Boolean[]) objArr);
        TraceMachine.exitMethod();
        return a11;
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        try {
            TraceMachine.enterMethod(this.f15946i, "h#onPostExecute", (ArrayList<String>) null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod((Trace) null, "h#onPostExecute", (ArrayList<String>) null);
        }
        b((String) obj);
        TraceMachine.exitMethod();
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        super.onPreExecute();
    }
}
