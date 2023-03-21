package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: DiffUtil */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<d> f11372a = new a();

    /* compiled from: DiffUtil */
    class a implements Comparator<d> {
        a() {
        }

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return dVar.f11375a - dVar2.f11375a;
        }
    }

    /* compiled from: DiffUtil */
    public static abstract class b {
        public abstract boolean a(int i11, int i12);

        public abstract boolean b(int i11, int i12);

        public abstract Object c(int i11, int i12);

        public abstract int d();

        public abstract int e();
    }

    /* compiled from: DiffUtil */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f11373a;

        /* renamed from: b  reason: collision with root package name */
        private final int f11374b;

        c(int i11) {
            int[] iArr = new int[i11];
            this.f11373a = iArr;
            this.f11374b = iArr.length / 2;
        }

        /* access modifiers changed from: package-private */
        public int[] a() {
            return this.f11373a;
        }

        /* access modifiers changed from: package-private */
        public int b(int i11) {
            return this.f11373a[i11 + this.f11374b];
        }

        /* access modifiers changed from: package-private */
        public void c(int i11, int i12) {
            this.f11373a[i11 + this.f11374b] = i12;
        }
    }

    /* compiled from: DiffUtil */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f11375a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11376b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11377c;

        d(int i11, int i12, int i13) {
            this.f11375a = i11;
            this.f11376b = i12;
            this.f11377c = i13;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f11375a + this.f11377c;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f11376b + this.f11377c;
        }
    }

    /* compiled from: DiffUtil */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f11378a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f11379b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f11380c;

        /* renamed from: d  reason: collision with root package name */
        private final b f11381d;

        /* renamed from: e  reason: collision with root package name */
        private final int f11382e;

        /* renamed from: f  reason: collision with root package name */
        private final int f11383f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f11384g;

        e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z11) {
            this.f11378a = list;
            this.f11379b = iArr;
            this.f11380c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f11381d = bVar;
            this.f11382e = bVar.e();
            this.f11383f = bVar.d();
            this.f11384g = z11;
            a();
            d();
        }

        private void a() {
            d dVar = this.f11378a.isEmpty() ? null : this.f11378a.get(0);
            if (!(dVar != null && dVar.f11375a == 0 && dVar.f11376b == 0)) {
                this.f11378a.add(0, new d(0, 0, 0));
            }
            this.f11378a.add(new d(this.f11382e, this.f11383f, 0));
        }

        private void c(int i11) {
            int size = this.f11378a.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                d dVar = this.f11378a.get(i13);
                while (i12 < dVar.f11376b) {
                    if (this.f11380c[i12] != 0 || !this.f11381d.b(i11, i12)) {
                        i12++;
                    } else {
                        int i14 = this.f11381d.a(i11, i12) ? 8 : 4;
                        this.f11379b[i11] = (i12 << 4) | i14;
                        this.f11380c[i12] = (i11 << 4) | i14;
                        return;
                    }
                }
                i12 = dVar.b();
            }
        }

        private void d() {
            for (d next : this.f11378a) {
                for (int i11 = 0; i11 < next.f11377c; i11++) {
                    int i12 = next.f11375a + i11;
                    int i13 = next.f11376b + i11;
                    int i14 = this.f11381d.a(i12, i13) ? 1 : 2;
                    this.f11379b[i12] = (i13 << 4) | i14;
                    this.f11380c[i13] = (i12 << 4) | i14;
                }
            }
            if (this.f11384g) {
                e();
            }
        }

        private void e() {
            int i11 = 0;
            for (d next : this.f11378a) {
                while (i11 < next.f11375a) {
                    if (this.f11379b[i11] == 0) {
                        c(i11);
                    }
                    i11++;
                }
                i11 = next.a();
            }
        }

        private static g f(Collection<g> collection, int i11, boolean z11) {
            g gVar;
            Iterator<g> it2 = collection.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = it2.next();
                if (gVar.f11385a == i11 && gVar.f11387c == z11) {
                    it2.remove();
                    break;
                }
            }
            while (it2.hasNext()) {
                g next = it2.next();
                if (z11) {
                    next.f11386b--;
                } else {
                    next.f11386b++;
                }
            }
            return gVar;
        }

        public void b(o oVar) {
            e eVar;
            int i11;
            if (oVar instanceof e) {
                eVar = (e) oVar;
            } else {
                eVar = new e(oVar);
            }
            int i12 = this.f11382e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i13 = this.f11382e;
            int i14 = this.f11383f;
            for (int size = this.f11378a.size() - 1; size >= 0; size--) {
                d dVar = this.f11378a.get(size);
                int a11 = dVar.a();
                int b11 = dVar.b();
                while (true) {
                    if (i13 <= a11) {
                        break;
                    }
                    i13--;
                    int i15 = this.f11379b[i13];
                    if ((i15 & 12) != 0) {
                        int i16 = i15 >> 4;
                        g f11 = f(arrayDeque, i16, false);
                        if (f11 != null) {
                            int i17 = (i12 - f11.f11386b) - 1;
                            eVar.d(i13, i17);
                            if ((i15 & 4) != 0) {
                                eVar.a(i17, 1, this.f11381d.c(i13, i16));
                            }
                        } else {
                            arrayDeque.add(new g(i13, (i12 - i13) - 1, true));
                        }
                    } else {
                        eVar.c(i13, 1);
                        i12--;
                    }
                }
                while (i14 > b11) {
                    i14--;
                    int i18 = this.f11380c[i14];
                    if ((i18 & 12) != 0) {
                        int i19 = i18 >> 4;
                        g f12 = f(arrayDeque, i19, true);
                        if (f12 == null) {
                            arrayDeque.add(new g(i14, i12 - i13, false));
                        } else {
                            eVar.d((i12 - f12.f11386b) - 1, i13);
                            if ((i18 & 4) != 0) {
                                eVar.a(i13, 1, this.f11381d.c(i19, i14));
                            }
                        }
                    } else {
                        eVar.b(i13, 1);
                        i12++;
                    }
                }
                int i21 = dVar.f11375a;
                int i22 = dVar.f11376b;
                for (i11 = 0; i11 < dVar.f11377c; i11++) {
                    if ((this.f11379b[i21] & 15) == 2) {
                        eVar.a(i21, 1, this.f11381d.c(i21, i22));
                    }
                    i21++;
                    i22++;
                }
                i13 = dVar.f11375a;
                i14 = dVar.f11376b;
            }
            eVar.e();
        }
    }

    /* compiled from: DiffUtil */
    public static abstract class f<T> {
        public abstract boolean a(T t, T t11);

        public abstract boolean b(T t, T t11);

        public Object c(T t, T t11) {
            return null;
        }
    }

    /* compiled from: DiffUtil */
    private static class g {

        /* renamed from: a  reason: collision with root package name */
        int f11385a;

        /* renamed from: b  reason: collision with root package name */
        int f11386b;

        /* renamed from: c  reason: collision with root package name */
        boolean f11387c;

        g(int i11, int i12, boolean z11) {
            this.f11385a = i11;
            this.f11386b = i12;
            this.f11387c = z11;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h  reason: collision with other inner class name */
    /* compiled from: DiffUtil */
    static class C0079h {

        /* renamed from: a  reason: collision with root package name */
        int f11388a;

        /* renamed from: b  reason: collision with root package name */
        int f11389b;

        /* renamed from: c  reason: collision with root package name */
        int f11390c;

        /* renamed from: d  reason: collision with root package name */
        int f11391d;

        public C0079h() {
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f11391d - this.f11390c;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f11389b - this.f11388a;
        }

        public C0079h(int i11, int i12, int i13, int i14) {
            this.f11388a = i11;
            this.f11389b = i12;
            this.f11390c = i13;
            this.f11391d = i14;
        }
    }

    /* compiled from: DiffUtil */
    static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f11392a;

        /* renamed from: b  reason: collision with root package name */
        public int f11393b;

        /* renamed from: c  reason: collision with root package name */
        public int f11394c;

        /* renamed from: d  reason: collision with root package name */
        public int f11395d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11396e;

        i() {
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return Math.min(this.f11394c - this.f11392a, this.f11395d - this.f11393b);
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f11395d - this.f11393b != this.f11394c - this.f11392a;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f11395d - this.f11393b > this.f11394c - this.f11392a;
        }

        /* access modifiers changed from: package-private */
        public d d() {
            if (!b()) {
                int i11 = this.f11392a;
                return new d(i11, this.f11393b, this.f11394c - i11);
            } else if (this.f11396e) {
                return new d(this.f11392a, this.f11393b, a());
            } else {
                if (c()) {
                    return new d(this.f11392a, this.f11393b + 1, a());
                }
                return new d(this.f11392a + 1, this.f11393b, a());
            }
        }
    }

    private static i a(C0079h hVar, b bVar, c cVar, c cVar2, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z11 = (hVar.b() - hVar.a()) % 2 == 0;
        int b11 = hVar.b() - hVar.a();
        int i15 = -i11;
        int i16 = i15;
        while (i16 <= i11) {
            if (i16 == i15 || (i16 != i11 && cVar2.b(i16 + 1) < cVar2.b(i16 - 1))) {
                i13 = cVar2.b(i16 + 1);
                i12 = i13;
            } else {
                i13 = cVar2.b(i16 - 1);
                i12 = i13 - 1;
            }
            int i17 = hVar.f11391d - ((hVar.f11389b - i12) - i16);
            int i18 = (i11 == 0 || i12 != i13) ? i17 : i17 + 1;
            while (i12 > hVar.f11388a && i17 > hVar.f11390c && bVar.b(i12 - 1, i17 - 1)) {
                i12--;
                i17--;
            }
            cVar2.c(i16, i12);
            if (!z11 || (i14 = b11 - i16) < i15 || i14 > i11 || cVar.b(i14) < i12) {
                i16 += 2;
            } else {
                i iVar = new i();
                iVar.f11392a = i12;
                iVar.f11393b = i17;
                iVar.f11394c = i13;
                iVar.f11395d = i18;
                iVar.f11396e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z11) {
        C0079h hVar;
        int e11 = bVar.e();
        int d11 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0079h(0, e11, 0, d11));
        int i11 = ((((e11 + d11) + 1) / 2) * 2) + 1;
        c cVar = new c(i11);
        c cVar2 = new c(i11);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0079h hVar2 = (C0079h) arrayList2.remove(arrayList2.size() - 1);
            i e12 = e(hVar2, bVar, cVar, cVar2);
            if (e12 != null) {
                if (e12.a() > 0) {
                    arrayList.add(e12.d());
                }
                if (arrayList3.isEmpty()) {
                    hVar = new C0079h();
                } else {
                    hVar = (C0079h) arrayList3.remove(arrayList3.size() - 1);
                }
                hVar.f11388a = hVar2.f11388a;
                hVar.f11390c = hVar2.f11390c;
                hVar.f11389b = e12.f11392a;
                hVar.f11391d = e12.f11393b;
                arrayList2.add(hVar);
                hVar2.f11389b = hVar2.f11389b;
                hVar2.f11391d = hVar2.f11391d;
                hVar2.f11388a = e12.f11394c;
                hVar2.f11390c = e12.f11395d;
                arrayList2.add(hVar2);
            } else {
                arrayList3.add(hVar2);
            }
        }
        Collections.sort(arrayList, f11372a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z11);
    }

    private static i d(C0079h hVar, b bVar, c cVar, c cVar2, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z11 = true;
        if (Math.abs(hVar.b() - hVar.a()) % 2 != 1) {
            z11 = false;
        }
        int b11 = hVar.b() - hVar.a();
        int i15 = -i11;
        int i16 = i15;
        while (i16 <= i11) {
            if (i16 == i15 || (i16 != i11 && cVar.b(i16 + 1) > cVar.b(i16 - 1))) {
                i13 = cVar.b(i16 + 1);
                i12 = i13;
            } else {
                i13 = cVar.b(i16 - 1);
                i12 = i13 + 1;
            }
            int i17 = (hVar.f11390c + (i12 - hVar.f11388a)) - i16;
            int i18 = (i11 == 0 || i12 != i13) ? i17 : i17 - 1;
            while (i12 < hVar.f11389b && i17 < hVar.f11391d && bVar.b(i12, i17)) {
                i12++;
                i17++;
            }
            cVar.c(i16, i12);
            if (!z11 || (i14 = b11 - i16) < i15 + 1 || i14 > i11 - 1 || cVar2.b(i14) > i12) {
                i16 += 2;
            } else {
                i iVar = new i();
                iVar.f11392a = i13;
                iVar.f11393b = i18;
                iVar.f11394c = i12;
                iVar.f11395d = i17;
                iVar.f11396e = false;
                return iVar;
            }
        }
        return null;
    }

    private static i e(C0079h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int b11 = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.c(1, hVar.f11388a);
            cVar2.c(1, hVar.f11389b);
            for (int i11 = 0; i11 < b11; i11++) {
                i d11 = d(hVar, bVar, cVar, cVar2, i11);
                if (d11 != null) {
                    return d11;
                }
                i a11 = a(hVar, bVar, cVar, cVar2, i11);
                if (a11 != null) {
                    return a11;
                }
            }
        }
        return null;
    }
}
