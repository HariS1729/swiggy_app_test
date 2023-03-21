package q0;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.jvm.internal.p;

/* compiled from: AndroidAutofill.android.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f16274a = new f();

    private f() {
    }

    public final AutofillId a(ViewStructure viewStructure) {
        p.j(viewStructure, "structure");
        return viewStructure.getAutofillId();
    }

    public final boolean b(AutofillValue autofillValue) {
        p.j(autofillValue, "value");
        return autofillValue.isDate();
    }

    public final boolean c(AutofillValue autofillValue) {
        p.j(autofillValue, "value");
        return autofillValue.isList();
    }

    public final boolean d(AutofillValue autofillValue) {
        p.j(autofillValue, "value");
        return autofillValue.isText();
    }

    public final boolean e(AutofillValue autofillValue) {
        p.j(autofillValue, "value");
        return autofillValue.isToggle();
    }

    public final void f(ViewStructure viewStructure, String[] strArr) {
        p.j(viewStructure, "structure");
        p.j(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(ViewStructure viewStructure, AutofillId autofillId, int i11) {
        p.j(viewStructure, "structure");
        p.j(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i11);
    }

    public final void h(ViewStructure viewStructure, int i11) {
        p.j(viewStructure, "structure");
        viewStructure.setAutofillType(i11);
    }

    public final CharSequence i(AutofillValue autofillValue) {
        p.j(autofillValue, "value");
        CharSequence textValue = autofillValue.getTextValue();
        p.i(textValue, "value.textValue");
        return textValue;
    }
}
