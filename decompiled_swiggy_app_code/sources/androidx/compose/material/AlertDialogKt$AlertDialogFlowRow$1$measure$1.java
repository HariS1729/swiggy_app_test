package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import bp0.k;
import i1.e0;
import i1.w;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AlertDialog.kt */
final class AlertDialogKt$AlertDialogFlowRow$1$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<List<e0>> f4839a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ w f4840b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f4841c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4842d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<Integer> f4843e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlertDialogKt$AlertDialogFlowRow$1$measure$1(List<List<e0>> list, w wVar, float f11, int i11, List<Integer> list2) {
        super(1);
        this.f4839a = list;
        this.f4840b = wVar;
        this.f4841c = f11;
        this.f4842d = i11;
        this.f4843e = list2;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        List<List<e0>> list = this.f4839a;
        w wVar = this.f4840b;
        float f11 = this.f4841c;
        int i11 = this.f4842d;
        List<Integer> list2 = this.f4843e;
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            List list3 = list.get(i12);
            int size2 = list3.size();
            int[] iArr = new int[size2];
            int i14 = 0;
            while (i14 < size2) {
                iArr[i14] = ((e0) list3.get(i14)).A0() + (i14 < k.l(list3) ? wVar.j0(f11) : 0);
                i14++;
            }
            Arrangement.l a11 = Arrangement.f3654a.a();
            int[] iArr2 = new int[size2];
            for (int i15 = 0; i15 < size2; i15++) {
                iArr2[i15] = 0;
            }
            a11.b(wVar, i11, iArr, iArr2);
            int i16 = 0;
            for (int size3 = list3.size(); i16 < size3; size3 = size3) {
                e0.a.j(aVar, (e0) list3.get(i16), iArr2[i16], list2.get(i12).intValue(), 0.0f, 4, (Object) null);
                i16++;
                iArr2 = iArr2;
                list3 = list3;
                i12 = i12;
            }
            i12 = i13;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
