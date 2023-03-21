package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

public final class GestureDetectorCompat {

    /* renamed from: a  reason: collision with root package name */
    private final a f9421a;

    interface a {
        boolean a(MotionEvent motionEvent);
    }

    static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final GestureDetector f9422a;

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f9422a = new GestureDetector(context, onGestureListener, handler);
        }

        public boolean a(MotionEvent motionEvent) {
            return this.f9422a.onTouchEvent(motionEvent);
        }
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (Handler) null);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f9421a.a(motionEvent);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f9421a = new b(context, onGestureListener, handler);
    }
}
