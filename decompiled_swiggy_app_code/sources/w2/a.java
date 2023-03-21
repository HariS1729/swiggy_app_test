package w2;

import android.widget.CompoundButton;
import androidx.databinding.h;

/* compiled from: CompoundButtonBindingAdapter */
public class a {

    /* renamed from: w2.a$a  reason: collision with other inner class name */
    /* compiled from: CompoundButtonBindingAdapter */
    class C0203a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CompoundButton.OnCheckedChangeListener f17452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f17453b;

        C0203a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, h hVar) {
            this.f17452a = onCheckedChangeListener;
            this.f17453b = hVar;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f17452a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z11);
            }
            this.f17453b.a();
        }
    }

    public static void a(CompoundButton compoundButton, boolean z11) {
        if (compoundButton.isChecked() != z11) {
            compoundButton.setChecked(z11);
        }
    }

    public static void b(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, h hVar) {
        if (hVar == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new C0203a(onCheckedChangeListener, hVar));
        }
    }
}
