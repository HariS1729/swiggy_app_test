package j5;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

public class a extends k5.a {

    /* renamed from: s  reason: collision with root package name */
    protected static int[] f15293s;
    protected static int[] t;

    /* renamed from: o  reason: collision with root package name */
    private float[] f15294o;

    /* renamed from: p  reason: collision with root package name */
    private int f15295p;
    private int q = -1;

    /* renamed from: r  reason: collision with root package name */
    private int f15296r = -1;

    public a() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n\nvoid main()\n{\n\ttextureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n\tgl_Position = position;\n}", "#extension GL_OES_EGL_image_external : require\nvarying highp vec2 textureCoordinate;\n\nuniform samplerExternalOES inputImageTexture;\n\nvoid main()\n{\n\tgl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public int a(int i11, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.f15409d);
        if (!h()) {
            return -1;
        }
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.f15410e, 2, 5126, false, 0, floatBuffer);
        GLES20.glEnableVertexAttribArray(this.f15410e);
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(this.f15412g, 2, 5126, false, 0, floatBuffer2);
        GLES20.glEnableVertexAttribArray(this.f15412g);
        GLES20.glUniformMatrix4fv(this.f15295p, 1, false, this.f15294o, 0);
        if (i11 != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i11);
            GLES20.glUniform1i(this.f15411f, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f15410e);
        GLES20.glDisableVertexAttribArray(this.f15412g);
        GLES20.glBindTexture(36197, 0);
        return 1;
    }

    public int b(int i11, boolean z11, boolean z12) {
        GLES20.glUseProgram(this.f15409d);
        if (!h()) {
            return -1;
        }
        this.k.position(0);
        GLES20.glVertexAttribPointer(this.f15410e, 2, 5126, false, 0, this.k);
        GLES20.glEnableVertexAttribArray(this.f15410e);
        this.f15415l.position(0);
        GLES20.glVertexAttribPointer(this.f15412g, 2, 5126, false, 0, this.f15415l);
        GLES20.glEnableVertexAttribArray(this.f15412g);
        GLES20.glUniformMatrix4fv(this.f15295p, 1, false, this.f15294o, 0);
        if (i11 != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i11);
            GLES20.glUniform1i(this.f15411f, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f15410e);
        GLES20.glDisableVertexAttribArray(this.f15412g);
        GLES20.glBindTexture(36197, 0);
        return 1;
    }

    /* access modifiers changed from: protected */
    public void l() {
        super.l();
        this.f15295p = GLES20.glGetUniformLocation(this.f15409d, "textureTransform");
    }

    public int o(int i11) {
        if (f15293s == null) {
            return -1;
        }
        GLES20.glViewport(0, 0, this.f15413h, this.f15414i);
        GLES20.glBindFramebuffer(36160, f15293s[0]);
        GLES20.glUseProgram(this.f15409d);
        if (!h()) {
            return -1;
        }
        this.k.position(0);
        GLES20.glVertexAttribPointer(this.f15410e, 2, 5126, false, 0, this.k);
        GLES20.glEnableVertexAttribArray(this.f15410e);
        this.f15415l.position(0);
        GLES20.glVertexAttribPointer(this.f15412g, 2, 5126, false, 0, this.f15415l);
        GLES20.glEnableVertexAttribArray(this.f15412g);
        GLES20.glUniformMatrix4fv(this.f15295p, 1, false, this.f15294o, 0);
        if (i11 != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i11);
            GLES20.glUniform1i(this.f15411f, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f15410e);
        GLES20.glDisableVertexAttribArray(this.f15412g);
        GLES20.glBindTexture(36197, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, this.f15416m, this.n);
        return t[0];
    }

    public void p(float[] fArr) {
        this.f15294o = fArr;
    }

    public void q(int i11, int i12) {
        if (!(f15293s == null || (this.q == i11 && this.f15296r == i12))) {
            r();
        }
        if (f15293s == null) {
            this.q = i11;
            this.f15296r = i12;
            int[] iArr = new int[1];
            f15293s = iArr;
            t = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            GLES20.glGenTextures(1, t, 0);
            GLES20.glBindTexture(3553, t[0]);
            GLES20.glTexImage2D(3553, 0, 6408, i11, i12, 0, 6408, 5121, (Buffer) null);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, f15293s[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, t[0], 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    public void r() {
        int[] iArr = t;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            t = null;
        }
        int[] iArr2 = f15293s;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(1, iArr2, 0);
            f15293s = null;
        }
        this.q = -1;
        this.f15296r = -1;
    }
}
