package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import androidx.collection.g;
import androidx.core.content.res.k;
import java.util.ArrayList;
import java.util.List;

public abstract class PreferenceGroup extends Preference {
    final g<String, Long> G;
    private final Handler H;
    private List<Preference> I;
    private boolean K;
    private int L;
    private boolean M;
    private int N;
    private b O;
    private final Runnable P;

    class a implements Runnable {
        a() {
        }

        public void run() {
            synchronized (this) {
                PreferenceGroup.this.G.clear();
            }
        }
    }

    public interface b {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.G = new g<>();
        this.H = new Handler();
        this.K = true;
        this.L = 0;
        this.M = false;
        this.N = Integer.MAX_VALUE;
        this.O = null;
        this.P = new a();
        this.I = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PreferenceGroup, i11, i12);
        int i13 = R.styleable.PreferenceGroup_orderingFromXml;
        this.K = k.b(obtainStyledAttributes, i13, i13, true);
        int i14 = R.styleable.PreferenceGroup_initialExpandedChildrenCount;
        if (obtainStyledAttributes.hasValue(i14)) {
            Q(k.d(obtainStyledAttributes, i14, i14, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    public Preference N(int i11) {
        return this.I.get(i11);
    }

    public int O() {
        return this.I.size();
    }

    public void Q(int i11) {
        if (i11 != Integer.MAX_VALUE && !t()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.N = i11;
    }

    public void x(boolean z11) {
        super.x(z11);
        int O2 = O();
        for (int i11 = 0; i11 < O2; i11++) {
            N(i11).B(this, z11);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
