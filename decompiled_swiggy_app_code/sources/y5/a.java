package y5;

import b6.b;
import co.hyperverge.hypersnapsdk.listeners.FaceCaptureCompletionHandler;

/* compiled from: CallbackProvider */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f18021c;

    /* renamed from: a  reason: collision with root package name */
    private FaceCaptureCompletionHandler f18022a;

    /* renamed from: b  reason: collision with root package name */
    private b f18023b;

    private a() {
    }

    public static a a() {
        if (f18021c == null) {
            f18021c = new a();
        }
        return f18021c;
    }

    public void b(FaceCaptureCompletionHandler faceCaptureCompletionHandler) {
        this.f18022a = faceCaptureCompletionHandler;
    }

    public b c() {
        return this.f18023b;
    }

    public FaceCaptureCompletionHandler d() {
        return this.f18022a;
    }
}
