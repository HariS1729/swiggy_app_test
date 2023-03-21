package k5;

import android.opengl.GLES20;
import co.hyperverge.hvcamera.magicfilter.utils.f;
import in.swiggy.android.tejas.oldapi.models.intdef.TrackOrderState;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import o5.j;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private LinkedList<Runnable> f15406a;

    /* renamed from: b  reason: collision with root package name */
    private String f15407b;

    /* renamed from: c  reason: collision with root package name */
    private String f15408c;

    /* renamed from: d  reason: collision with root package name */
    protected int f15409d;

    /* renamed from: e  reason: collision with root package name */
    protected int f15410e;

    /* renamed from: f  reason: collision with root package name */
    protected int f15411f;

    /* renamed from: g  reason: collision with root package name */
    protected int f15412g;

    /* renamed from: h  reason: collision with root package name */
    protected int f15413h;

    /* renamed from: i  reason: collision with root package name */
    protected int f15414i;
    protected boolean j;
    protected FloatBuffer k;

    /* renamed from: l  reason: collision with root package name */
    protected FloatBuffer f15415l;

    /* renamed from: m  reason: collision with root package name */
    protected int f15416m;
    protected int n;

    public a() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    private void e(String str) {
        do {
        } while (GLES20.glGetError() != 0);
    }

    public int a(int i11, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.f15409d);
        n();
        if (!this.j) {
            return -1;
        }
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.f15410e, 2, 5126, false, 0, floatBuffer);
        GLES20.glEnableVertexAttribArray(this.f15410e);
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(this.f15412g, 2, 5126, false, 0, floatBuffer2);
        GLES20.glEnableVertexAttribArray(this.f15412g);
        if (i11 != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i11);
            GLES20.glUniform1i(this.f15411f, 0);
        }
        k();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f15410e);
        GLES20.glDisableVertexAttribArray(this.f15412g);
        j();
        GLES20.glBindTexture(3553, 0);
        return 1;
    }

    public int b(int i11, boolean z11, boolean z12) {
        GLES20.glUseProgram(this.f15409d);
        n();
        if (!this.j) {
            return -1;
        }
        this.k.position(0);
        GLES20.glVertexAttribPointer(this.f15410e, 2, 5126, false, 0, this.k);
        GLES20.glEnableVertexAttribArray(this.f15410e);
        if (z11 || z12) {
            float[] fArr = new float[8];
            if (z11) {
                fArr = j.b(f.ROTATION_180, false, false);
            } else if (z12) {
                fArr = j.b(f.NORMAL, false, false);
            }
            this.f15415l.clear();
            this.f15415l.put(fArr).position(0);
        }
        this.f15415l.position(0);
        GLES20.glVertexAttribPointer(this.f15412g, 2, 5126, false, 0, this.f15415l);
        GLES20.glEnableVertexAttribArray(this.f15412g);
        if (i11 != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i11);
            GLES20.glUniform1i(this.f15411f, 0);
        }
        k();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f15410e);
        GLES20.glDisableVertexAttribArray(this.f15412g);
        j();
        GLES20.glBindTexture(3553, 0);
        return 1;
    }

    public final void c() {
        this.j = false;
        GLES20.glDeleteProgram(this.f15409d);
        i();
    }

    public void d(int i11, int i12) {
        this.f15416m = i11;
        this.n = i12;
    }

    public void f() {
        l();
        m();
        this.j = true;
    }

    public void g(int i11, int i12) {
        this.f15413h = i11;
        this.f15414i = i12;
    }

    public boolean h() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public void l() {
        e("7");
        try {
            int d11 = o5.f.d(this.f15407b, this.f15408c);
            this.f15409d = d11;
            this.f15410e = GLES20.glGetAttribLocation(d11, "position");
            this.f15411f = GLES20.glGetUniformLocation(this.f15409d, "inputImageTexture");
            this.f15412g = GLES20.glGetAttribLocation(this.f15409d, "inputTextureCoordinate");
            this.j = true;
        } catch (Exception e11) {
            e11.getMessage();
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public void n() {
        while (!this.f15406a.isEmpty()) {
            this.f15406a.removeFirst().run();
        }
    }

    public a(String str, String str2) {
        this.f15406a = new LinkedList<>();
        this.f15407b = "";
        this.f15408c = "";
        try {
            e("1");
            this.f15406a = new LinkedList<>();
            this.f15407b = str;
            this.f15408c = str2;
            e(TrackOrderState.ORDER_CONFIRMED);
            float[] fArr = j.f15951e;
            this.k = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            e(TrackOrderState.ORDER_PICKED_UP);
            this.k.put(fArr).position(0);
            e(TrackOrderState.ORDER_DELIVERED);
            this.f15415l = ByteBuffer.allocateDirect(j.f15947a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            e(TrackOrderState.ORDER_CANCELLED);
            this.f15415l.put(j.b(f.NORMAL, false, true)).position(0);
            e(TrackOrderState.ORDER_OTHER_ERROR);
        } catch (Exception e11) {
            e11.getMessage();
        }
    }
}
