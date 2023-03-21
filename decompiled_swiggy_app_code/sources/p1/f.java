package p1;

import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: MultiParagraph.kt */
public final class f {
    public static final int a(List<h> list, int i11) {
        char c11;
        p.j(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            h hVar = list.get(i13);
            if (hVar.f() > i11) {
                c11 = 1;
            } else {
                c11 = hVar.b() <= i11 ? (char) 65535 : 0;
            }
            if (c11 < 0) {
                i12 = i13 + 1;
            } else if (c11 <= 0) {
                return i13;
            } else {
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final int b(List<h> list, int i11) {
        char c11;
        p.j(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            h hVar = list.get(i13);
            if (hVar.g() > i11) {
                c11 = 1;
            } else {
                c11 = hVar.c() <= i11 ? (char) 65535 : 0;
            }
            if (c11 < 0) {
                i12 = i13 + 1;
            } else if (c11 <= 0) {
                return i13;
            } else {
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final int c(List<h> list, float f11) {
        char c11;
        p.j(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            h hVar = list.get(i12);
            if (hVar.h() > f11) {
                c11 = 1;
            } else {
                c11 = hVar.a() <= f11 ? (char) 65535 : 0;
            }
            if (c11 < 0) {
                i11 = i12 + 1;
            } else if (c11 <= 0) {
                return i12;
            } else {
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }
}
