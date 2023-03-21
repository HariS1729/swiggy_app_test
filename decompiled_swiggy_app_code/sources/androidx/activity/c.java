package androidx.activity;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f1400a;

    public /* synthetic */ c(ComponentActivity componentActivity) {
        this.f1400a = componentActivity;
    }

    public final void run() {
        this.f1400a.invalidateMenu();
    }
}
