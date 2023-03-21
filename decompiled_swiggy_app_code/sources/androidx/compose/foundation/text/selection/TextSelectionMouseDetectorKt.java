package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import b0.c;
import bp0.k;
import f1.d0;

/* compiled from: TextSelectionMouseDetector.kt */
public final class TextSelectionMouseDetectorKt {
    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    public static final java.lang.Object b(f1.d r10, fp0.c<? super f1.n> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = (androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1) r0
            int r1 = r0.f4784c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f4784c = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f4783b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f4784c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r10 = r0.f4782a
            f1.d r10 = (f1.d) r10
            bp0.g.b(r11)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0035:
            bp0.g.b(r11)
        L_0x0038:
            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.f4782a = r10
            r0.f4784c = r3
            java.lang.Object r11 = r10.r0(r11, r0)
            if (r11 != r1) goto L_0x0045
            return r1
        L_0x0045:
            f1.n r11 = (f1.n) r11
            int r2 = r11.b()
            boolean r2 = f1.q.a(r2)
            if (r2 == 0) goto L_0x0038
            java.util.List r2 = r11.c()
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L_0x005b:
            if (r6 >= r4) goto L_0x0082
            java.lang.Object r7 = r2.get(r6)
            f1.v r7 = (f1.v) r7
            int r8 = r7.k()
            f1.g0$a r9 = f1.g0.f14488a
            int r9 = r9.b()
            boolean r8 = f1.g0.g(r8, r9)
            if (r8 == 0) goto L_0x007b
            boolean r7 = f1.o.a(r7)
            if (r7 == 0) goto L_0x007b
            r7 = 1
            goto L_0x007c
        L_0x007b:
            r7 = 0
        L_0x007c:
            if (r7 != 0) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            int r6 = r6 + 1
            goto L_0x005b
        L_0x0082:
            r5 = 1
        L_0x0083:
            if (r5 == 0) goto L_0x0038
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.b(f1.d, fp0.c):java.lang.Object");
    }

    public static final Object c(d0 d0Var, c cVar, fp0.c<? super k> cVar2) {
        Object d11 = ForEachGestureKt.d(d0Var, new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(cVar, (fp0.c<? super TextSelectionMouseDetectorKt$mouseSelectionDetector$2>) null), cVar2);
        return d11 == b.d() ? d11 : k.f22762a;
    }
}
