package p1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p1.b;

/* compiled from: AnnotatedString.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final b f16064a = new b("", (List) null, (List) null, 6, (i) null);

    public static final b a(String str, u uVar, m mVar) {
        p.j(str, "text");
        p.j(uVar, "spanStyle");
        return new b(str, j.d(new b.C0163b(uVar, 0, str.length())), mVar == null ? k.j() : j.d(new b.C0163b(mVar, 0, str.length())));
    }

    public static /* synthetic */ b b(String str, u uVar, m mVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            mVar = null;
        }
        return a(str, uVar, mVar);
    }

    public static final boolean e(int i11, int i12, int i13, int i14) {
        if (i11 <= i13 && i14 <= i12) {
            if (i12 != i14) {
                return true;
            }
            if ((i13 == i14) == (i11 == i12)) {
                return true;
            }
        }
        return false;
    }

    public static final b f() {
        return f16064a;
    }

    /* access modifiers changed from: private */
    public static final <T> List<b.C0163b<T>> g(List<? extends b.C0163b<? extends T>> list, int i11, int i12) {
        if (i11 <= i12) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                Object obj = list.get(i13);
                b.C0163b bVar = (b.C0163b) obj;
                if (i(i11, i12, bVar.f(), bVar.d())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                b.C0163b bVar2 = (b.C0163b) arrayList.get(i14);
                arrayList2.add(new b.C0163b(bVar2.e(), Math.max(i11, bVar2.f()) - i11, Math.min(i12, bVar2.d()) - i11, bVar2.g()));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i11 + ") should be less than or equal to end (" + i12 + ')').toString());
    }

    private static final List<b.C0163b<u>> h(b bVar, int i11, int i12) {
        if (i11 == i12) {
            return k.j();
        }
        if (i11 == 0 && i12 >= bVar.g().length()) {
            return bVar.e();
        }
        List<b.C0163b<u>> e11 = bVar.e();
        ArrayList arrayList = new ArrayList(e11.size());
        int size = e11.size();
        for (int i13 = 0; i13 < size; i13++) {
            b.C0163b<u> bVar2 = e11.get(i13);
            b.C0163b bVar3 = bVar2;
            if (i(i11, i12, bVar3.f(), bVar3.d())) {
                arrayList.add(bVar2);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            b.C0163b bVar4 = (b.C0163b) arrayList.get(i14);
            arrayList2.add(new b.C0163b(bVar4.e(), l.m(bVar4.f(), i11, i12) - i11, l.m(bVar4.d(), i11, i12) - i11));
        }
        return arrayList2;
    }

    public static final boolean i(int i11, int i12, int i13, int i14) {
        return Math.max(i11, i13) < Math.min(i12, i14) || e(i11, i12, i13, i14) || e(i13, i14, i11, i12);
    }

    public static final List<b.C0163b<m>> j(b bVar, m mVar) {
        p.j(bVar, "<this>");
        p.j(mVar, "defaultParagraphStyle");
        int length = bVar.g().length();
        List<b.C0163b<m>> d11 = bVar.d();
        ArrayList arrayList = new ArrayList();
        int size = d11.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            b.C0163b bVar2 = d11.get(i11);
            m mVar2 = (m) bVar2.a();
            int b11 = bVar2.b();
            int c11 = bVar2.c();
            if (b11 != i12) {
                arrayList.add(new b.C0163b(mVar, i12, b11));
            }
            arrayList.add(new b.C0163b(mVar.i(mVar2), b11, c11));
            i11++;
            i12 = c11;
        }
        if (i12 != length) {
            arrayList.add(new b.C0163b(mVar, i12, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new b.C0163b(mVar, 0, 0));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final b k(b bVar, int i11, int i12) {
        String str;
        if (i11 != i12) {
            str = bVar.g().substring(i11, i12);
            p.i(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new b(str, h(bVar, i11, i12), (List) null, 4, (i) null);
    }
}
