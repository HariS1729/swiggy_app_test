package androidx.compose.ui.text;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import m0.d;
import p1.b;
import p1.f0;
import p1.m;
import p1.u;

/* compiled from: Savers.kt */
final class SaversKt$AnnotationRangeSaver$1 extends Lambda implements p<d, b.C0163b<? extends Object>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$AnnotationRangeSaver$1 f7488a = new SaversKt$AnnotationRangeSaver$1();

    /* compiled from: Savers.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7489a;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            iArr[AnnotationType.Paragraph.ordinal()] = 1;
            iArr[AnnotationType.Span.ordinal()] = 2;
            iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            iArr[AnnotationType.String.ordinal()] = 4;
            f7489a = iArr;
        }
    }

    SaversKt$AnnotationRangeSaver$1() {
        super(2);
    }

    /* renamed from: a */
    public final Object invoke(d dVar, b.C0163b<? extends Object> bVar) {
        AnnotationType annotationType;
        Object obj;
        kotlin.jvm.internal.p.j(dVar, "$this$Saver");
        kotlin.jvm.internal.p.j(bVar, "it");
        Object e11 = bVar.e();
        if (e11 instanceof m) {
            annotationType = AnnotationType.Paragraph;
        } else if (e11 instanceof u) {
            annotationType = AnnotationType.Span;
        } else if (e11 instanceof f0) {
            annotationType = AnnotationType.VerbatimTts;
        } else {
            annotationType = AnnotationType.String;
        }
        int i11 = a.f7489a[annotationType.ordinal()];
        if (i11 == 1) {
            obj = SaversKt.t((m) bVar.e(), SaversKt.e(), dVar);
        } else if (i11 == 2) {
            obj = SaversKt.t((u) bVar.e(), SaversKt.r(), dVar);
        } else if (i11 == 3) {
            obj = SaversKt.t((f0) bVar.e(), SaversKt.f7473d, dVar);
        } else if (i11 == 4) {
            obj = SaversKt.s(bVar.e());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return k.f(SaversKt.s(annotationType), obj, SaversKt.s(Integer.valueOf(bVar.f())), SaversKt.s(Integer.valueOf(bVar.d())), SaversKt.s(bVar.g()));
    }
}
