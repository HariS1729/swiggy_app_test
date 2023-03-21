package w4;

/* compiled from: TaskCompletionSource */
public class f<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final e<TResult> f17496a = new e<>();

    public e<TResult> a() {
        return this.f17496a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(TResult tresult) {
        if (!g(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.f17496a.p();
    }

    public boolean f(Exception exc) {
        return this.f17496a.q(exc);
    }

    public boolean g(TResult tresult) {
        return this.f17496a.r(tresult);
    }
}
