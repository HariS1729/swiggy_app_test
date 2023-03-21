package androidx.compose.runtime.snapshots;

import fp0.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import n0.g;

/* compiled from: SnapshotIdSet.kt */
public final class SnapshotIdSet implements Iterable<Integer>, mp0.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f6234e = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final SnapshotIdSet f6235f = new SnapshotIdSet(0, 0, 0, (int[]) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final long f6236a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f6237b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f6238c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int[] f6239d;

    /* compiled from: SnapshotIdSet.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final SnapshotIdSet a() {
            return SnapshotIdSet.f6235f;
        }
    }

    private SnapshotIdSet(long j, long j11, int i11, int[] iArr) {
        this.f6236a = j;
        this.f6237b = j11;
        this.f6238c = i11;
        this.f6239d = iArr;
    }

    public final SnapshotIdSet h(SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        p.j(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f6235f;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i11 = snapshotIdSet.f6238c;
        int i12 = this.f6238c;
        if (i11 == i12 && snapshotIdSet.f6239d == (iArr = this.f6239d)) {
            return new SnapshotIdSet(this.f6236a & (~snapshotIdSet.f6236a), this.f6237b & (~snapshotIdSet.f6237b), i12, iArr);
        }
        Iterator it2 = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it2.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.i(((Number) it2.next()).intValue());
        }
        return snapshotIdSet3;
    }

    public final SnapshotIdSet i(int i11) {
        int[] iArr;
        int b11;
        int i12 = i11;
        int i13 = this.f6238c;
        int i14 = i12 - i13;
        if (i14 >= 0 && i14 < 64) {
            long j = 1 << i14;
            long j11 = this.f6237b;
            if ((j11 & j) != 0) {
                return new SnapshotIdSet(this.f6236a, j11 & (~j), i13, this.f6239d);
            }
        } else if (i14 >= 64 && i14 < 128) {
            long j12 = 1 << (i14 - 64);
            long j13 = this.f6236a;
            if ((j13 & j12) != 0) {
                return new SnapshotIdSet(j13 & (~j12), this.f6237b, i13, this.f6239d);
            }
        } else if (i14 < 0 && (iArr = this.f6239d) != null && (b11 = g.b(iArr, i12)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new SnapshotIdSet(this.f6236a, this.f6237b, this.f6238c, (int[]) null);
            }
            int[] iArr2 = new int[length];
            if (b11 > 0) {
                int[] unused = g.h(iArr, iArr2, 0, 0, b11);
            }
            if (b11 < length) {
                int[] unused2 = g.h(iArr, iArr2, b11, b11 + 1, length + 1);
            }
            return new SnapshotIdSet(this.f6236a, this.f6237b, this.f6238c, iArr2);
        }
        return this;
    }

    public Iterator<Integer> iterator() {
        return e.b(new SnapshotIdSet$iterator$1(this, (c<? super SnapshotIdSet$iterator$1>) null)).iterator();
    }

    public final boolean k(int i11) {
        int[] iArr;
        int i12 = i11 - this.f6238c;
        boolean z11 = true;
        if (i12 < 0 || i12 >= 64) {
            if (i12 < 64 || i12 >= 128) {
                if (i12 > 0 || (iArr = this.f6239d) == null) {
                    return false;
                }
                if (g.b(iArr, i11) < 0) {
                    z11 = false;
                }
                return z11;
            } else if (((1 << (i12 - 64)) & this.f6236a) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (((1 << i12) & this.f6237b) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final int l(int i11) {
        int[] iArr = this.f6239d;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.f6237b;
        if (j != 0) {
            return this.f6238c + g.c(j);
        }
        long j11 = this.f6236a;
        return j11 != 0 ? this.f6238c + 64 + g.c(j11) : i11;
    }

    public final SnapshotIdSet m(SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        p.j(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f6235f;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        int i11 = snapshotIdSet.f6238c;
        int i12 = this.f6238c;
        if (i11 == i12 && snapshotIdSet.f6239d == (iArr = this.f6239d)) {
            return new SnapshotIdSet(this.f6236a | snapshotIdSet.f6236a, this.f6237b | snapshotIdSet.f6237b, i12, iArr);
        }
        if (this.f6239d == null) {
            Iterator it2 = iterator();
            while (it2.hasNext()) {
                snapshotIdSet = snapshotIdSet.n(((Number) it2.next()).intValue());
            }
            return snapshotIdSet;
        }
        Iterator it3 = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it3.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.n(((Number) it3.next()).intValue());
        }
        return snapshotIdSet3;
    }

    public final SnapshotIdSet n(int i11) {
        int i12;
        int[] iArr;
        int i13 = i11;
        int i14 = this.f6238c;
        int i15 = i13 - i14;
        long j = 0;
        if (i15 >= 0 && i15 < 64) {
            long j11 = 1 << i15;
            long j12 = this.f6237b;
            if ((j12 & j11) == 0) {
                return new SnapshotIdSet(this.f6236a, j12 | j11, i14, this.f6239d);
            }
        } else if (i15 >= 64 && i15 < 128) {
            long j13 = 1 << (i15 - 64);
            long j14 = this.f6236a;
            if ((j14 & j13) == 0) {
                return new SnapshotIdSet(j14 | j13, this.f6237b, i14, this.f6239d);
            }
        } else if (i15 < 128) {
            int[] iArr2 = this.f6239d;
            if (iArr2 == null) {
                return new SnapshotIdSet(this.f6236a, this.f6237b, i14, new int[]{i13});
            }
            int b11 = g.b(iArr2, i13);
            if (b11 < 0) {
                int i16 = -(b11 + 1);
                int length = iArr2.length + 1;
                int[] iArr3 = new int[length];
                int[] unused = g.h(iArr2, iArr3, 0, 0, i16);
                int[] unused2 = g.h(iArr2, iArr3, i16 + 1, i16, length - 1);
                iArr3[i16] = i13;
                return new SnapshotIdSet(this.f6236a, this.f6237b, this.f6238c, iArr3);
            }
        } else if (!k(i11)) {
            long j15 = this.f6236a;
            long j16 = this.f6237b;
            int i17 = this.f6238c;
            ArrayList arrayList = null;
            int i18 = ((i13 + 1) / 64) * 64;
            long j17 = j16;
            long j18 = j15;
            while (true) {
                if (i17 >= i18) {
                    i12 = i17;
                    break;
                }
                if (j17 != j) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr4 = this.f6239d;
                        if (iArr4 != null) {
                            for (int valueOf : iArr4) {
                                arrayList.add(Integer.valueOf(valueOf));
                            }
                        }
                    }
                    for (int i19 = 0; i19 < 64; i19++) {
                        if (((1 << i19) & j17) != 0) {
                            arrayList.add(Integer.valueOf(i19 + i17));
                        }
                    }
                    j = 0;
                }
                if (j18 == j) {
                    j17 = j;
                    i12 = i18;
                    break;
                }
                i17 += 64;
                j17 = j18;
                j18 = j;
            }
            if (arrayList == null || (iArr = s.D0(arrayList)) == null) {
                iArr = this.f6239d;
            }
            return new SnapshotIdSet(j18, j17, i12, iArr).n(i13);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(l.u(this, 10));
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(((Number) it2.next()).intValue()));
        }
        sb2.append(n0.a.d(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63, (Object) null));
        sb2.append(']');
        return sb2.toString();
    }
}
