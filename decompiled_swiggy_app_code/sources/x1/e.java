package x1;

import a2.d;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.platform.AndroidParagraph;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p1.b;
import p1.c0;
import p1.g;
import p1.j;
import p1.o;
import p1.u;
import u1.i;

/* compiled from: AndroidParagraph.android.kt */
public final class e {
    public static final g a(j jVar, int i11, boolean z11, long j) {
        p.j(jVar, "paragraphIntrinsics");
        return new AndroidParagraph((AndroidParagraphIntrinsics) jVar, i11, z11, j, (i) null);
    }

    public static final g b(String str, c0 c0Var, List<b.C0163b<u>> list, List<b.C0163b<o>> list2, int i11, boolean z11, long j, d2.e eVar, i.b bVar) {
        p.j(str, "text");
        p.j(c0Var, "style");
        p.j(list, "spanStyles");
        p.j(list2, "placeholders");
        d2.e eVar2 = eVar;
        p.j(eVar2, "density");
        i.b bVar2 = bVar;
        p.j(bVar2, "fontFamilyResolver");
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, c0Var, list, list2, bVar2, eVar2), i11, z11, j, (kotlin.jvm.internal.i) null);
    }

    /* access modifiers changed from: private */
    public static final int e(TextLayout textLayout, int i11) {
        int h11 = textLayout.h();
        for (int i12 = 0; i12 < h11; i12++) {
            if (textLayout.g(i12) > ((float) i11)) {
                return i12;
            }
        }
        return textLayout.h();
    }

    /* access modifiers changed from: private */
    public static final int f(d dVar) {
        d.a aVar = d.f907b;
        if (dVar == null ? false : d.j(dVar.m(), aVar.d())) {
            return 3;
        }
        if (dVar == null ? false : d.j(dVar.m(), aVar.e())) {
            return 4;
        }
        if (dVar == null ? false : d.j(dVar.m(), aVar.a())) {
            return 2;
        }
        if (dVar == null ? false : d.j(dVar.m(), aVar.f())) {
            return 0;
        }
        if (dVar == null ? false : d.j(dVar.m(), aVar.b())) {
            return 1;
        }
        return 0;
    }
}
