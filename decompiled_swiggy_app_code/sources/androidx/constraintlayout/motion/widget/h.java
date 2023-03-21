package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;
import i2.c;
import java.util.HashMap;
import o2.d;

/* compiled from: KeyPosition */
public class h extends i {

    /* renamed from: h  reason: collision with root package name */
    String f8490h = null;

    /* renamed from: i  reason: collision with root package name */
    int f8491i = d.f8455f;
    int j = 0;
    float k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    float f8492l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    float f8493m = Float.NaN;
    float n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    float f8494o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    float f8495p = Float.NaN;
    int q = 0;

    /* renamed from: r  reason: collision with root package name */
    private float f8496r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    private float f8497s = Float.NaN;

    /* compiled from: KeyPosition */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f8498a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8498a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyPosition_motionTarget, 1);
            f8498a.append(R.styleable.KeyPosition_framePosition, 2);
            f8498a.append(R.styleable.KeyPosition_transitionEasing, 3);
            f8498a.append(R.styleable.KeyPosition_curveFit, 4);
            f8498a.append(R.styleable.KeyPosition_drawPath, 5);
            f8498a.append(R.styleable.KeyPosition_percentX, 6);
            f8498a.append(R.styleable.KeyPosition_percentY, 7);
            f8498a.append(R.styleable.KeyPosition_keyPositionType, 9);
            f8498a.append(R.styleable.KeyPosition_sizePercent, 8);
            f8498a.append(R.styleable.KeyPosition_percentWidth, 11);
            f8498a.append(R.styleable.KeyPosition_percentHeight, 12);
            f8498a.append(R.styleable.KeyPosition_pathMotionArc, 10);
        }

        /* access modifiers changed from: private */
        public static void b(h hVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f8498a.get(index)) {
                    case 1:
                        if (!MotionLayout.f8375p1) {
                            if (typedArray.peekValue(index).type != 3) {
                                hVar.f8457b = typedArray.getResourceId(index, hVar.f8457b);
                                break;
                            } else {
                                hVar.f8458c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, hVar.f8457b);
                            hVar.f8457b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                hVar.f8458c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        hVar.f8456a = typedArray.getInt(index, hVar.f8456a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type != 3) {
                            hVar.f8490h = c.f14916c[typedArray.getInteger(index, 0)];
                            break;
                        } else {
                            hVar.f8490h = typedArray.getString(index);
                            break;
                        }
                    case 4:
                        hVar.f8499g = typedArray.getInteger(index, hVar.f8499g);
                        break;
                    case 5:
                        hVar.j = typedArray.getInt(index, hVar.j);
                        break;
                    case 6:
                        hVar.f8493m = typedArray.getFloat(index, hVar.f8493m);
                        break;
                    case 7:
                        hVar.n = typedArray.getFloat(index, hVar.n);
                        break;
                    case 8:
                        float f11 = typedArray.getFloat(index, hVar.f8492l);
                        hVar.k = f11;
                        hVar.f8492l = f11;
                        break;
                    case 9:
                        hVar.q = typedArray.getInt(index, hVar.q);
                        break;
                    case 10:
                        hVar.f8491i = typedArray.getInt(index, hVar.f8491i);
                        break;
                    case 11:
                        hVar.k = typedArray.getFloat(index, hVar.k);
                        break;
                    case 12:
                        hVar.f8492l = typedArray.getFloat(index, hVar.f8492l);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8498a.get(index));
                        break;
                }
            }
            if (hVar.f8456a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public h() {
        this.f8459d = 2;
    }

    public void a(HashMap<String, d> hashMap) {
    }

    /* renamed from: b */
    public d clone() {
        return new h().c(this);
    }

    public d c(d dVar) {
        super.c(dVar);
        h hVar = (h) dVar;
        this.f8490h = hVar.f8490h;
        this.f8491i = hVar.f8491i;
        this.j = hVar.j;
        this.k = hVar.k;
        this.f8492l = Float.NaN;
        this.f8493m = hVar.f8493m;
        this.n = hVar.n;
        this.f8494o = hVar.f8494o;
        this.f8495p = hVar.f8495p;
        this.f8496r = hVar.f8496r;
        this.f8497s = hVar.f8497s;
        return this;
    }

    public void e(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyPosition));
    }
}
