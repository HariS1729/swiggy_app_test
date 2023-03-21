package co.hyperverge.facedetection.Detectors;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import bg.b;
import com.newrelic.agent.android.instrumentation.Instrumented;
import g5.a;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

@Instrumented
public class NDPDetector extends a {

    /* renamed from: e  reason: collision with root package name */
    private static final String f13159e = "co.hyperverge.facedetection.Detectors.NDPDetector";

    /* renamed from: a  reason: collision with root package name */
    AssetManager f13160a;

    /* renamed from: b  reason: collision with root package name */
    long f13161b;

    /* renamed from: c  reason: collision with root package name */
    private String f13162c;

    /* renamed from: d  reason: collision with root package name */
    private String f13163d;

    public boolean a(Context context) {
        b.a(context, "ndp-detector");
        AssetManager assets = context.getResources().getAssets();
        this.f13160a = assets;
        loadModel(assets, this.f13163d, 640, 480, 20, 11);
        try {
            new File("/sdcard/saved/").mkdirs();
            return true;
        } catch (Exception e11) {
            Log.d(f13159e, e11.getMessage());
            return true;
        }
    }

    public void b() {
        releaseModel(this.f13161b);
    }

    public ArrayList<ArrayList<Float>> c(byte[] bArr, int i11, int i12, int i13) {
        if (bArr == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(detectFaces(bArr, i11, i12, i13, this.f13162c));
            ArrayList<ArrayList<Float>> arrayList = new ArrayList<>(jSONArray.length());
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                try {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i14);
                    arrayList.add(new ArrayList(jSONArray2.length()));
                    ArrayList arrayList2 = arrayList.get(i14);
                    for (int i15 = 0; i15 < jSONArray2.length(); i15 += 2) {
                        arrayList2.add(i15, Float.valueOf(((float) jSONArray2.getInt(i15)) / ((float) i11)));
                        int i16 = i15 + 1;
                        arrayList2.add(i16, Float.valueOf(((float) jSONArray2.getInt(i16)) / ((float) i12)));
                    }
                } catch (JSONException e11) {
                    Log.d(f13159e, e11.getMessage());
                }
            }
            return arrayList;
        } catch (JSONException e12) {
            Log.d(f13159e, e12.getMessage());
            return null;
        }
    }

    public int d(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11) {
        int i17 = i13;
        int i18 = i14;
        int i19 = i15;
        int i21 = i16;
        if (!z11) {
            return getAverageIntensity(bArr, i11, i12, i13, i14, i15, i16, z11);
        }
        int round = Math.round((((float) i17) / 2.0f) + (((float) i18) / 2.0f));
        int round2 = Math.round((((float) i19) / 2.0f) + (((float) i21) / 2.0f));
        int round3 = Math.round(((float) (i18 - i17)) / 4.0f);
        int round4 = Math.round(((float) (i21 - i19)) / 4.0f);
        return getAverageIntensity(bArr, i11, i12, round - round3, round + round3, round2 - round4, round2 + round4, z11);
    }

    public native synchronized String detectFaces(byte[] bArr, int i11, int i12, int i13, String str);

    public native synchronized int getAverageIntensity(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11);

    public native synchronized void loadModel(AssetManager assetManager, String str, int i11, int i12, int i13, int i14);

    public native synchronized void releaseModel(long j);
}
