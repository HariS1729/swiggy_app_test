package in.swiggy.android.tejas.feature.google.googleplacesearch.model;

import android.text.style.CharacterStyle;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import retrofit2.HttpException;

@Instrumented
/* compiled from: GooglePlacePredictionList.kt */
public final class GooglePlacePredictionList {
    public static final Companion Companion = new Companion((i) null);
    /* access modifiers changed from: private */
    public static final String TAG = GooglePlacePredictionList.class.getSimpleName();
    @SerializedName("predictions")
    private ArrayList<GooglePlacePrediction> predictions;

    /* compiled from: GooglePlacePredictionList.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final String getTAG() {
            return GooglePlacePredictionList.TAG;
        }

        public final boolean isGoogleApiOverLimitError(Throwable th2) {
            p.j(th2, "e");
            return (th2 instanceof HttpException) && ((HttpException) th2).code() == 420;
        }
    }

    public GooglePlacePredictionList(List<? extends AutocompletePrediction> list) {
        p.j(list, "autocompletePredictionList");
        populatePredictions(list);
    }

    private final void populatePredictions(List<? extends AutocompletePrediction> list) {
        this.predictions = new ArrayList<>();
        for (AutocompletePrediction autocompletePrediction : list) {
            GooglePlacePrediction googlePlacePrediction = new GooglePlacePrediction();
            googlePlacePrediction.setDescription(autocompletePrediction.getFullText((CharacterStyle) null).toString());
            googlePlacePrediction.setPlaceId(autocompletePrediction.getPlaceId());
            googlePlacePrediction.setAreaName(autocompletePrediction.getPrimaryText((CharacterStyle) null).toString());
            googlePlacePrediction.setArea(autocompletePrediction.getPrimaryText((CharacterStyle) null).toString());
            googlePlacePrediction.setCityAndState(autocompletePrediction.getSecondaryText((CharacterStyle) null).toString());
            ArrayList<GooglePlacePrediction> arrayList = this.predictions;
            if (arrayList != null) {
                arrayList.add(googlePlacePrediction);
            }
        }
    }

    public final ArrayList<GooglePlacePrediction> getPredictions() {
        return this.predictions;
    }

    public final void setPredictions(ArrayList<GooglePlacePrediction> arrayList) {
        this.predictions = arrayList;
    }

    public String toString() {
        String json = GsonInstrumentation.toJson(new Gson(), (Object) this);
        p.i(json, "Gson().toJson(this)");
        return json;
    }
}
