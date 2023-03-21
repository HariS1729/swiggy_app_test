package e0;

import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SlotTable.kt */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<Integer> f14209a;

    public k0(List<Integer> list) {
        p.j(list, "list");
        this.f14209a = list;
    }

    public final void a(int i11) {
        if (!this.f14209a.isEmpty()) {
            if (this.f14209a.get(0).intValue() != i11) {
                List<Integer> list = this.f14209a;
                if (list.get(list.size() - 1).intValue() == i11) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.f14209a.size();
        this.f14209a.add(Integer.valueOf(i11));
        while (size > 0) {
            int i12 = ((size + 1) >>> 1) - 1;
            int intValue = this.f14209a.get(i12).intValue();
            if (i11 <= intValue) {
                break;
            }
            this.f14209a.set(size, Integer.valueOf(intValue));
            size = i12;
        }
        this.f14209a.set(size, Integer.valueOf(i11));
    }

    public final boolean b() {
        return !this.f14209a.isEmpty();
    }

    public final int c() {
        return ((Number) s.W(this.f14209a)).intValue();
    }

    public final int d() {
        int intValue;
        if (this.f14209a.size() > 0) {
            int intValue2 = this.f14209a.get(0).intValue();
            while ((!this.f14209a.isEmpty()) && this.f14209a.get(0).intValue() == intValue2) {
                List<Integer> list = this.f14209a;
                list.set(0, s.h0(list));
                List<Integer> list2 = this.f14209a;
                list2.remove(list2.size() - 1);
                int size = this.f14209a.size();
                int size2 = this.f14209a.size() >>> 1;
                int i11 = 0;
                while (i11 < size2) {
                    int intValue3 = this.f14209a.get(i11).intValue();
                    int i12 = (i11 + 1) * 2;
                    int i13 = i12 - 1;
                    int intValue4 = this.f14209a.get(i13).intValue();
                    if (i12 < size && (intValue = this.f14209a.get(i12).intValue()) > intValue4) {
                        if (intValue <= intValue3) {
                            break;
                        }
                        this.f14209a.set(i11, Integer.valueOf(intValue));
                        this.f14209a.set(i12, Integer.valueOf(intValue3));
                        i11 = i12;
                    } else if (intValue4 <= intValue3) {
                        break;
                    } else {
                        this.f14209a.set(i11, Integer.valueOf(intValue4));
                        this.f14209a.set(i13, Integer.valueOf(intValue3));
                        i11 = i13;
                    }
                }
            }
            return intValue2;
        }
        ComposerKt.x("Set is empty".toString());
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(List list, int i11, i iVar) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }
}
