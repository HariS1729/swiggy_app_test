package androidx.compose.ui.platform;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p1.b;
import p1.u;

/* compiled from: AndroidClipboardManager.android.kt */
public final class l {
    public static final b a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(charSequence.toString(), (List) null, (List) null, 6, (i) null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i11 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        p.i(annotationArr, "annotations");
        int O = ArraysKt___ArraysKt.O(annotationArr);
        if (O >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i11];
                if (p.e(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    int spanStart = spanned.getSpanStart(annotation);
                    int spanEnd = spanned.getSpanEnd(annotation);
                    String value = annotation.getValue();
                    p.i(value, "span.value");
                    arrayList.add(new b.C0163b(new f0(value).k(), spanStart, spanEnd));
                }
                if (i11 == O) {
                    break;
                }
                i11++;
            }
        }
        return new b(charSequence.toString(), arrayList, (List) null, 4, (i) null);
    }

    public static final CharSequence b(b bVar) {
        p.j(bVar, "<this>");
        if (bVar.e().isEmpty()) {
            return bVar.g();
        }
        SpannableString spannableString = new SpannableString(bVar.g());
        k0 k0Var = new k0();
        List<b.C0163b<u>> e11 = bVar.e();
        int size = e11.size();
        for (int i11 = 0; i11 < size; i11++) {
            b.C0163b bVar2 = e11.get(i11);
            int b11 = bVar2.b();
            int c11 = bVar2.c();
            k0Var.q();
            k0Var.g((u) bVar2.a());
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", k0Var.p()), b11, c11, 33);
        }
        return spannableString;
    }
}
