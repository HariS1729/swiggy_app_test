package m4;

import androidx.work.WorkerParameters;
import e4.i;

/* compiled from: StartWorkRunnable */
public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private i f15649a;

    /* renamed from: b  reason: collision with root package name */
    private String f15650b;

    /* renamed from: c  reason: collision with root package name */
    private WorkerParameters.a f15651c;

    public h(i iVar, String str, WorkerParameters.a aVar) {
        this.f15649a = iVar;
        this.f15650b = str;
        this.f15651c = aVar;
    }

    public void run() {
        this.f15649a.u().k(this.f15650b, this.f15651c);
    }
}
