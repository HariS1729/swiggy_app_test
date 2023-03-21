package com.BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.o;

/* compiled from: LinearGradientView */
public class b extends View {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f13695a = new Paint(1);

    /* renamed from: b  reason: collision with root package name */
    private Path f13696b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f13697c;

    /* renamed from: d  reason: collision with root package name */
    private LinearGradient f13698d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f13699e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f13700f = {0.0f, 0.0f};

    /* renamed from: g  reason: collision with root package name */
    private float[] f13701g = {0.0f, 1.0f};

    /* renamed from: h  reason: collision with root package name */
    private int[] f13702h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13703i = false;
    private float[] j = {0.5f, 0.5f};
    private float k = 45.0f;

    /* renamed from: l  reason: collision with root package name */
    private int[] f13704l = {0, 0};

    /* renamed from: m  reason: collision with root package name */
    private float[] f13705m = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public b(Context context) {
        super(context);
    }

    private float[] a(float f11) {
        float sqrt = (float) Math.sqrt(2.0d);
        double d11 = (double) ((f11 - 90.0f) * 0.017453292f);
        return new float[]{((float) Math.cos(d11)) * sqrt, ((float) Math.sin(d11)) * sqrt};
    }

    private void b() {
        int[] iArr = this.f13702h;
        if (iArr != null) {
            float[] fArr = this.f13699e;
            if (fArr == null || iArr.length == fArr.length) {
                float[] fArr2 = this.f13700f;
                float[] fArr3 = this.f13701g;
                if (this.f13703i && this.j != null) {
                    float[] a11 = a(this.k);
                    float[] fArr4 = this.j;
                    float[] fArr5 = {fArr4[0] - (a11[0] / 2.0f), fArr4[1] - (a11[1] / 2.0f)};
                    fArr3 = new float[]{fArr4[0] + (a11[0] / 2.0f), fArr4[1] + (a11[1] / 2.0f)};
                    fArr2 = fArr5;
                }
                float f11 = fArr2[0];
                int[] iArr2 = this.f13704l;
                float f12 = ((float) iArr2[0]) * f11;
                float f13 = fArr2[1] * ((float) iArr2[1]);
                LinearGradient linearGradient = new LinearGradient(f12, f13, fArr3[0] * ((float) iArr2[0]), fArr3[1] * ((float) iArr2[1]), this.f13702h, this.f13699e, Shader.TileMode.CLAMP);
                this.f13698d = linearGradient;
                this.f13695a.setShader(linearGradient);
                invalidate();
            }
        }
    }

    private void c() {
        if (this.f13696b == null) {
            this.f13696b = new Path();
            this.f13697c = new RectF();
        }
        this.f13696b.reset();
        RectF rectF = this.f13697c;
        int[] iArr = this.f13704l;
        rectF.set(0.0f, 0.0f, (float) iArr[0], (float) iArr[1]);
        this.f13696b.addRoundRect(this.f13697c, this.f13705m, Path.Direction.CW);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f13696b;
        if (path == null) {
            canvas.drawPaint(this.f13695a);
        } else {
            canvas.drawPath(path, this.f13695a);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        this.f13704l = new int[]{i11, i12};
        c();
        b();
    }

    public void setAngle(float f11) {
        this.k = f11;
        b();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.j = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        b();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            fArr[i11] = o.c((float) readableArray.getDouble(i11));
        }
        this.f13705m = fArr;
        c();
        b();
    }

    public void setColors(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = readableArray.getInt(i11);
        }
        this.f13702h = iArr;
        b();
    }

    public void setEndPosition(ReadableArray readableArray) {
        this.f13701g = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        b();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            fArr[i11] = (float) readableArray.getDouble(i11);
        }
        this.f13699e = fArr;
        b();
    }

    public void setStartPosition(ReadableArray readableArray) {
        this.f13700f = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        b();
    }

    public void setUseAngle(boolean z11) {
        this.f13703i = z11;
        b();
    }
}
