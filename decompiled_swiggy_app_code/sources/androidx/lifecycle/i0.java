package androidx.lifecycle;

/* compiled from: Transformations */
public class i0 {

    /* compiled from: Transformations */
    static class a implements z<X> {

        /* renamed from: a  reason: collision with root package name */
        boolean f10746a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f10747b;

        a(w wVar) {
            this.f10747b = wVar;
        }

        public void a(X x11) {
            Object f11 = this.f10747b.f();
            if (this.f10746a || ((f11 == null && x11 != null) || (f11 != null && !f11.equals(x11)))) {
                this.f10746a = false;
                this.f10747b.q(x11);
            }
        }
    }

    public static <X> LiveData<X> a(LiveData<X> liveData) {
        w wVar = new w();
        wVar.r(liveData, new a(wVar));
        return wVar;
    }
}
