package p1;

import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: TempListUtils.kt */
public final class w {
    private static final <T> void a(Appendable appendable, T t, l<? super T, ? extends CharSequence> lVar) {
        boolean z11;
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t));
            return;
        }
        if (t == null) {
            z11 = true;
        } else {
            z11 = t instanceof CharSequence;
        }
        if (z11) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }

    private static final <T, A extends Appendable> A b(List<? extends T> list, A a11, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        a11.append(charSequence2);
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            i12++;
            if (i12 > 1) {
                a11.append(charSequence);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            a(a11, obj, lVar);
        }
        if (i11 >= 0 && i12 > i11) {
            a11.append(charSequence4);
        }
        a11.append(charSequence3);
        return a11;
    }

    public static final <T> String c(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        p.j(list, "<this>");
        p.j(charSequence, "separator");
        p.j(charSequence2, "prefix");
        p.j(charSequence3, "postfix");
        p.j(charSequence4, "truncated");
        String sb2 = ((StringBuilder) b(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i11, charSequence4, lVar)).toString();
        p.i(sb2, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb2;
    }

    public static /* synthetic */ String d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i12 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i12 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i13 = (i12 & 8) != 0 ? -1 : i11;
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        return c(list, charSequence, charSequence6, charSequence5, i13, charSequence7, lVar);
    }
}
