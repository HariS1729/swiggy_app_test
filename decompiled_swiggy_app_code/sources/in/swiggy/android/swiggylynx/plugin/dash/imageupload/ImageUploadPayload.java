package in.swiggy.android.swiggylynx.plugin.dash.imageupload;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: ImageUploadPayload.kt */
public final class ImageUploadPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19109a;

    /* compiled from: ImageUploadPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<ImageUploadPayload> serializer() {
            return ImageUploadPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ImageUploadPayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19109a = str;
            return;
        }
        throw new MissingFieldException("name");
    }

    public static final void c(ImageUploadPayload imageUploadPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(imageUploadPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, imageUploadPayload.f19109a);
    }

    public final String b() {
        return this.f19109a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageUploadPayload) && p.e(this.f19109a, ((ImageUploadPayload) obj).f19109a);
    }

    public int hashCode() {
        return this.f19109a.hashCode();
    }

    public String toString() {
        return "ImageUploadPayload(name=" + this.f19109a + ')';
    }
}
