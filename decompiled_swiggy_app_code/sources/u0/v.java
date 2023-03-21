package u0;

import android.graphics.Shader;
import kotlin.jvm.internal.p;

/* compiled from: Brush.kt */
public final class v {

    /* compiled from: Brush.kt */
    public static final class a extends f1 {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Shader f16893e;

        a(Shader shader) {
            this.f16893e = shader;
        }

        public Shader b(long j) {
            return this.f16893e;
        }
    }

    public static final f1 a(Shader shader) {
        p.j(shader, "shader");
        return new a(shader);
    }
}
