package androidx.databinding;

import androidx.databinding.k;

/* compiled from: BaseObservableField */
abstract class b extends a {

    /* compiled from: BaseObservableField */
    class a extends k.a {
        a() {
        }

        public void a(k kVar, int i11) {
            b.this.d();
        }
    }

    public b() {
    }

    public b(k... kVarArr) {
        if (kVarArr != null && kVarArr.length != 0) {
            a aVar = new a();
            for (k h11 : kVarArr) {
                h11.h(aVar);
            }
        }
    }
}
