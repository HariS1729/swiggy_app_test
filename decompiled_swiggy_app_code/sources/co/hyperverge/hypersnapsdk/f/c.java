package co.hyperverge.hypersnapsdk.f;

import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: NonBlockingFixedSizeQueue */
public class c<E> extends ArrayBlockingQueue<E> {

    /* renamed from: a  reason: collision with root package name */
    private int f13336a;

    public c(int i11) {
        super(i11);
        this.f13336a = i11;
    }

    public synchronized boolean add(E e11) {
        if (super.size() == this.f13336a) {
            remove();
        }
        return super.add(e11);
    }
}
