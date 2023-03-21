package o5;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.os.AsyncTask;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import h5.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

@Instrumented
public class g extends AsyncTask implements TraceFieldInterface {

    /* renamed from: e  reason: collision with root package name */
    private static final String f15933e = g.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private a f15934a;

    /* renamed from: b  reason: collision with root package name */
    private File f15935b;

    /* renamed from: c  reason: collision with root package name */
    private int f15936c;

    /* renamed from: d  reason: collision with root package name */
    public Trace f15937d;

    public interface a {
        void a(String str);
    }

    public g(File file, a aVar, int i11) {
        this.f15934a = aVar;
        this.f15935b = file;
        this.f15936c = i11;
    }

    private String a(Bitmap bitmap) {
        d dVar = new d();
        dVar.b("SaveTask", "Copied exif");
        if (this.f15935b.exists()) {
            this.f15935b.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f15935b);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            bitmap.recycle();
            ExifInterface exifInterface = new ExifInterface(this.f15935b.getAbsolutePath());
            exifInterface.setAttribute("Orientation", "" + this.f15936c);
            exifInterface.setAttribute("DateTimeOriginal", e.f15932a.format(new Date(System.currentTimeMillis())));
            exifInterface.saveAttributes();
            dVar.b("SaveTask", "Saved exif");
            return this.f15935b.toString();
        } catch (FileNotFoundException e11) {
            e11.getMessage();
            return null;
        } catch (IOException e12) {
            e12.getMessage();
            return null;
        }
    }

    public void _nr_setTrace(Trace trace) {
        try {
            this.f15937d = trace;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public String b(Bitmap... bitmapArr) {
        if (this.f15935b == null) {
            return null;
        }
        return a(bitmapArr[0]);
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        a aVar;
        if (str != null && (aVar = this.f15934a) != null) {
            aVar.a(str);
        }
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            TraceMachine.enterMethod(this.f15937d, "g#doInBackground", (ArrayList<String>) null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod((Trace) null, "g#doInBackground", (ArrayList<String>) null);
        }
        String b11 = b((Bitmap[]) objArr);
        TraceMachine.exitMethod();
        return b11;
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        try {
            TraceMachine.enterMethod(this.f15937d, "g#onPostExecute", (ArrayList<String>) null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod((Trace) null, "g#onPostExecute", (ArrayList<String>) null);
        }
        c((String) obj);
        TraceMachine.exitMethod();
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        super.onPreExecute();
    }
}
