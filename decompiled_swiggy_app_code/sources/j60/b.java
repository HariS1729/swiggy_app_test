package j60;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import in.swiggy.android.R;
import in.swiggy.android.mvvm.viewmodels.SwiggyBaseViewModel;
import in.swiggy.android.tejas.oldapi.models.restaurant.RecordData;
import kotlin.jvm.internal.i;
import os.u;

/* compiled from: RecordingDetailViewModel.kt */
public final class b extends SwiggyBaseViewModel {
    public static final a S = new a((i) null);
    public static final int T = 8;
    private RecordData N;
    private boolean O;
    private float P;
    private ObservableField<SpannableString> Q = new ObservableField<>();
    private ObservableInt R = new ObservableInt(8388611);

    /* compiled from: RecordingDetailViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public b(RecordData recordData, boolean z11, float f11) {
        this.N = recordData;
        this.O = z11;
        this.P = f11;
    }

    private final void m2() {
        String values;
        RecordData recordData = this.N;
        String str = "";
        if (!(recordData == null || (values = recordData.getValues()) == null)) {
            str = values;
        }
        SpannableString spannableString = new SpannableString(str);
        int o11 = l().o(R.color.charcoalGrey02);
        try {
            RecordData recordData2 = this.N;
            o11 = Color.parseColor(recordData2 == null ? null : recordData2.getTextColor());
        } catch (Throwable th2) {
            u.h("RecordingDetailViewModel", th2);
        }
        spannableString.setSpan(new ForegroundColorSpan(o11), 0, spannableString.length(), 0);
        this.Q.j(spannableString);
    }

    public void init() {
        m2();
        this.R.j(this.O ? 8388613 : 8388611);
    }

    public final ObservableInt k2() {
        return this.R;
    }

    public final ObservableField<SpannableString> l2() {
        return this.Q;
    }
}
