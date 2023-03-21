package q0;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.autofill.AutofillType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.p;
import t0.h;
import u0.b1;

/* compiled from: AndroidAutofill.android.kt */
public final class c {
    public static final void a(a aVar, SparseArray<AutofillValue> sparseArray) {
        p.j(aVar, "<this>");
        p.j(sparseArray, "values");
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            int keyAt = sparseArray.keyAt(i11);
            AutofillValue autofillValue = sparseArray.get(keyAt);
            f fVar = f.f16274a;
            p.i(autofillValue, "value");
            if (fVar.d(autofillValue)) {
                aVar.b().b(keyAt, fVar.i(autofillValue).toString());
            } else if (fVar.b(autofillValue)) {
                throw new NotImplementedError("An operation is not implemented: " + "b/138604541: Add onFill() callback for date");
            } else if (fVar.c(autofillValue)) {
                throw new NotImplementedError("An operation is not implemented: " + "b/138604541: Add onFill() callback for list");
            } else if (fVar.e(autofillValue)) {
                throw new NotImplementedError("An operation is not implemented: " + "b/138604541:  Add onFill() callback for toggle");
            }
        }
    }

    public static final void b(a aVar, ViewStructure viewStructure) {
        Rect a11;
        ViewStructure viewStructure2 = viewStructure;
        p.j(aVar, "<this>");
        p.j(viewStructure2, "root");
        int a12 = e.f16273a.a(viewStructure2, aVar.b().a().size());
        for (Map.Entry next : aVar.b().a().entrySet()) {
            int intValue = ((Number) next.getKey()).intValue();
            h hVar = (h) next.getValue();
            e eVar = e.f16273a;
            ViewStructure b11 = eVar.b(viewStructure2, a12);
            if (b11 != null) {
                f fVar = f.f16274a;
                AutofillId a13 = fVar.a(viewStructure2);
                p.g(a13);
                fVar.g(b11, a13, intValue);
                eVar.d(b11, intValue, aVar.c().getContext().getPackageName(), (String) null, (String) null);
                fVar.h(b11, 1);
                List<AutofillType> a14 = hVar.a();
                ArrayList arrayList = new ArrayList(a14.size());
                int size = a14.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(b.a(a14.get(i11)));
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                fVar.f(b11, (String[]) array);
                if (hVar.b() == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                }
                h b12 = hVar.b();
                if (!(b12 == null || (a11 = b1.a(b12)) == null)) {
                    e.f16273a.c(b11, a11.left, a11.top, 0, 0, a11.width(), a11.height());
                }
            }
            a12++;
        }
    }
}
