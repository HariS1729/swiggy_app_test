package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarPreference extends Preference {
    int G;
    int H;
    private int I;
    private int K;
    boolean L;
    SeekBar M;
    private TextView N;
    boolean O;
    private boolean P;
    boolean Q;
    private SeekBar.OnSeekBarChangeListener R;
    private View.OnKeyListener S;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
            if (z11) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.Q || !seekBarPreference.L) {
                    seekBarPreference.R(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.S(i11 + seekBarPreference2.H);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.L = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.L = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.H != seekBarPreference.G) {
                seekBarPreference.R(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        public boolean onKey(View view, int i11, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.O && (i11 == 21 || i11 == 22)) || i11 == 23 || i11 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.M;
            if (seekBar != null) {
                return seekBar.onKeyDown(i11, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.R = new a();
        this.S = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SeekBarPreference, i11, i12);
        this.H = obtainStyledAttributes.getInt(R.styleable.SeekBarPreference_min, 0);
        N(obtainStyledAttributes.getInt(R.styleable.SeekBarPreference_android_max, 100));
        O(obtainStyledAttributes.getInt(R.styleable.SeekBarPreference_seekBarIncrement, 0));
        this.O = obtainStyledAttributes.getBoolean(R.styleable.SeekBarPreference_adjustable, true);
        this.P = obtainStyledAttributes.getBoolean(R.styleable.SeekBarPreference_showSeekBarValue, false);
        this.Q = obtainStyledAttributes.getBoolean(R.styleable.SeekBarPreference_updatesContinuously, false);
        obtainStyledAttributes.recycle();
    }

    private void Q(int i11, boolean z11) {
        int i12 = this.H;
        if (i11 < i12) {
            i11 = i12;
        }
        int i13 = this.I;
        if (i11 > i13) {
            i11 = i13;
        }
        if (i11 != this.G) {
            this.G = i11;
            S(i11);
            G(i11);
            if (z11) {
                w();
            }
        }
    }

    /* access modifiers changed from: protected */
    public Object A(TypedArray typedArray, int i11) {
        return Integer.valueOf(typedArray.getInt(i11, 0));
    }

    public final void N(int i11) {
        int i12 = this.H;
        if (i11 < i12) {
            i11 = i12;
        }
        if (i11 != this.I) {
            this.I = i11;
            w();
        }
    }

    public final void O(int i11) {
        if (i11 != this.K) {
            this.K = Math.min(this.I - this.H, Math.abs(i11));
            w();
        }
    }

    /* access modifiers changed from: package-private */
    public void R(SeekBar seekBar) {
        int progress = this.H + seekBar.getProgress();
        if (progress == this.G) {
            return;
        }
        if (a(Integer.valueOf(progress))) {
            Q(progress, false);
            return;
        }
        seekBar.setProgress(this.G - this.H);
        S(this.G);
    }

    /* access modifiers changed from: package-private */
    public void S(int i11) {
        TextView textView = this.N;
        if (textView != null) {
            textView.setText(String.valueOf(i11));
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarPreferenceStyle);
    }
}
