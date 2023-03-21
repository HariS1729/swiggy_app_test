package w2;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.databinding.h;
import androidx.databinding.library.baseAdapters.R;

/* compiled from: TextViewBindingAdapter */
public class e {

    /* compiled from: TextViewBindingAdapter */
    class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f17455a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f17456b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f17457c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f17458d;

        a(c cVar, d dVar, h hVar, b bVar) {
            this.f17455a = cVar;
            this.f17456b = dVar;
            this.f17457c = hVar;
            this.f17458d = bVar;
        }

        public void afterTextChanged(Editable editable) {
            b bVar = this.f17458d;
            if (bVar != null) {
                bVar.afterTextChanged(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            c cVar = this.f17455a;
            if (cVar != null) {
                cVar.beforeTextChanged(charSequence, i11, i12, i13);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            d dVar = this.f17456b;
            if (dVar != null) {
                dVar.onTextChanged(charSequence, i11, i12, i13);
            }
            h hVar = this.f17457c;
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    /* compiled from: TextViewBindingAdapter */
    public interface b {
        void afterTextChanged(Editable editable);
    }

    /* compiled from: TextViewBindingAdapter */
    public interface c {
        void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13);
    }

    /* compiled from: TextViewBindingAdapter */
    public interface d {
        void onTextChanged(CharSequence charSequence, int i11, int i12, int i13);
    }

    public static String a(TextView textView) {
        return textView.getText().toString();
    }

    private static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (charSequence.charAt(i11) != charSequence2.charAt(i11)) {
                return true;
            }
        }
        return false;
    }

    public static void c(TextView textView, float f11) {
        textView.setLineSpacing(f11, textView.getLineSpacingMultiplier());
    }

    public static void d(TextView textView, int i11) {
        boolean z11;
        InputFilter[] filters = textView.getFilters();
        if (filters == null) {
            filters = new InputFilter[]{new InputFilter.LengthFilter(i11)};
        } else {
            int i12 = 0;
            while (true) {
                if (i12 >= filters.length) {
                    z11 = false;
                    break;
                }
                InputFilter inputFilter = filters[i12];
                if (inputFilter instanceof InputFilter.LengthFilter) {
                    if (((InputFilter.LengthFilter) inputFilter).getMax() != i11) {
                        filters[i12] = new InputFilter.LengthFilter(i11);
                    }
                    z11 = true;
                } else {
                    i12++;
                }
            }
            if (!z11) {
                int length = filters.length + 1;
                InputFilter[] inputFilterArr = new InputFilter[length];
                System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                inputFilterArr[length - 1] = new InputFilter.LengthFilter(i11);
                filters = inputFilterArr;
            }
        }
        textView.setFilters(filters);
    }

    public static void e(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence == text) {
            return;
        }
        if (charSequence != null || text.length() != 0) {
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!b(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public static void f(TextView textView, float f11) {
        textView.setTextSize(0, f11);
    }

    public static void g(TextView textView, c cVar, d dVar, b bVar, h hVar) {
        a aVar = (cVar == null && bVar == null && dVar == null && hVar == null) ? null : new a(cVar, dVar, hVar, bVar);
        TextWatcher textWatcher = (TextWatcher) d.a(textView, aVar, R.id.textWatcher);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (aVar != null) {
            textView.addTextChangedListener(aVar);
        }
    }
}
