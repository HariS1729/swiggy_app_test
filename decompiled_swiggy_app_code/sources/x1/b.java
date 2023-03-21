package x1;

import a2.e;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.p;
import p1.d;
import p1.h;
import t0.m;
import u0.f1;
import u0.h1;
import u0.k1;
import u0.u;
import u0.v;
import u0.x;

/* compiled from: AndroidMultiParagraphDraw.kt */
public final class b {
    public static final void a(d dVar, x xVar, u uVar, h1 h1Var, e eVar) {
        p.j(dVar, "<this>");
        p.j(xVar, "canvas");
        p.j(uVar, "brush");
        xVar.a();
        if (dVar.v().size() <= 1) {
            b(dVar, xVar, uVar, h1Var, eVar);
        } else if (uVar instanceof k1) {
            b(dVar, xVar, uVar, h1Var, eVar);
        } else if (uVar instanceof f1) {
            List<h> v = dVar.v();
            int size = v.size();
            float f11 = 0.0f;
            float f12 = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = v.get(i11);
                f12 += hVar.e().getHeight();
                f11 = Math.max(f11, hVar.e().getWidth());
            }
            Shader b11 = ((f1) uVar).b(m.a(f11, f12));
            Matrix matrix = new Matrix();
            b11.getLocalMatrix(matrix);
            List<h> v11 = dVar.v();
            int size2 = v11.size();
            for (int i12 = 0; i12 < size2; i12++) {
                h hVar2 = v11.get(i12);
                hVar2.e().j(xVar, v.a(b11), h1Var, eVar);
                xVar.c(0.0f, hVar2.e().getHeight());
                matrix.setTranslate(0.0f, -hVar2.e().getHeight());
                b11.setLocalMatrix(matrix);
            }
        }
        xVar.o();
    }

    private static final void b(d dVar, x xVar, u uVar, h1 h1Var, e eVar) {
        List<h> v = dVar.v();
        int size = v.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = v.get(i11);
            hVar.e().j(xVar, uVar, h1Var, eVar);
            xVar.c(0.0f, hVar.e().getHeight());
        }
    }
}
