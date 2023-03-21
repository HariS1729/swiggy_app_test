package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {
    private final Context S;
    private final ArrayAdapter T;
    private Spinner U;
    private final AdapterView.OnItemSelectedListener V;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j) {
            if (i11 >= 0) {
                String charSequence = DropDownPreference.this.R()[i11].toString();
                if (!charSequence.equals(DropDownPreference.this.S()) && DropDownPreference.this.a(charSequence)) {
                    DropDownPreference.this.U(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.dropdownPreferenceStyle);
    }

    private void W() {
        this.T.clear();
        if (O() != null) {
            for (CharSequence charSequence : O()) {
                this.T.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public ArrayAdapter V() {
        return new ArrayAdapter(this.S, 17367049);
    }

    /* access modifiers changed from: protected */
    public void w() {
        super.w();
        ArrayAdapter arrayAdapter = this.T;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    public void y() {
        this.U.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.V = new a();
        this.S = context;
        this.T = V();
        W();
    }
}
