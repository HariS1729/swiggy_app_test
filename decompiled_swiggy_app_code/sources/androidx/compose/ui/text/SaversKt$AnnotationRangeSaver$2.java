package androidx.compose.ui.text;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import m0.c;
import p1.b;
import p1.f0;
import p1.m;
import p1.u;

/* compiled from: Savers.kt */
final class SaversKt$AnnotationRangeSaver$2 extends Lambda implements l<Object, b.C0163b<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$AnnotationRangeSaver$2 f7490a = new SaversKt$AnnotationRangeSaver$2();

    /* compiled from: Savers.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7491a;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            iArr[AnnotationType.Paragraph.ordinal()] = 1;
            iArr[AnnotationType.Span.ordinal()] = 2;
            iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            iArr[AnnotationType.String.ordinal()] = 4;
            f7491a = iArr;
        }
    }

    SaversKt$AnnotationRangeSaver$2() {
        super(1);
    }

    /* renamed from: a */
    public final b.C0163b<? extends Object> invoke(Object obj) {
        p.j(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = null;
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        p.g(annotationType);
        Object obj4 = list.get(2);
        Integer num = obj4 != null ? (Integer) obj4 : null;
        p.g(num);
        int intValue = num.intValue();
        Object obj5 = list.get(3);
        Integer num2 = obj5 != null ? (Integer) obj5 : null;
        p.g(num2);
        int intValue2 = num2.intValue();
        Object obj6 = list.get(4);
        String str = obj6 != null ? (String) obj6 : null;
        p.g(str);
        int i11 = a.f7491a[annotationType.ordinal()];
        if (i11 == 1) {
            Object obj7 = list.get(1);
            c<m, Object> e11 = SaversKt.e();
            if (!p.e(obj7, Boolean.FALSE) && obj7 != null) {
                obj3 = e11.a(obj7);
            }
            p.g(obj3);
            return new b.C0163b<>(obj3, intValue, intValue2, str);
        } else if (i11 == 2) {
            Object obj8 = list.get(1);
            c<u, Object> r11 = SaversKt.r();
            if (!p.e(obj8, Boolean.FALSE) && obj8 != null) {
                obj3 = r11.a(obj8);
            }
            p.g(obj3);
            return new b.C0163b<>(obj3, intValue, intValue2, str);
        } else if (i11 == 3) {
            Object obj9 = list.get(1);
            c c11 = SaversKt.f7473d;
            if (!p.e(obj9, Boolean.FALSE) && obj9 != null) {
                obj3 = (f0) c11.a(obj9);
            }
            p.g(obj3);
            return new b.C0163b<>(obj3, intValue, intValue2, str);
        } else if (i11 == 4) {
            Object obj10 = list.get(1);
            if (obj10 != null) {
                obj3 = (String) obj10;
            }
            p.g(obj3);
            return new b.C0163b<>(obj3, intValue, intValue2, str);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
