package j60;

import androidx.databinding.ObservableInt;
import in.swiggy.android.mvvm.viewmodels.SwiggyBaseViewModel;
import kotlin.jvm.internal.p;

/* compiled from: RecordingTableHeader.kt */
public final class c extends SwiggyBaseViewModel {
    private String N;
    private boolean O;
    private float P;
    private ObservableInt Q = new ObservableInt(8388611);

    public c(String str, boolean z11, float f11) {
        p.j(str, "name");
        this.N = str;
        this.O = z11;
        this.P = f11;
    }

    public void init() {
        this.Q.j(this.O ? 8388613 : 8388611);
    }

    public final ObservableInt k2() {
        return this.Q;
    }

    public final String l2() {
        return this.N;
    }
}
