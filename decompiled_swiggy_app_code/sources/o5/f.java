package o5;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;

public class f {
    public static int a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public static int b(Bitmap bitmap, int i11, boolean z11) {
        if (bitmap == null) {
            return -1;
        }
        int[] iArr = new int[1];
        if (i11 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i11);
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            iArr[0] = i11;
        }
        if (z11) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    private static int c(String str, int i11) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glGetShaderInfoLog(glCreateShader);
        return 0;
    }

    public static int d(String str, String str2) {
        int c11;
        int[] iArr = new int[1];
        int c12 = c(str, 35633);
        if (c12 == 0 || (c11 = c(str2, 35632)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, c12);
        GLES20.glAttachShader(glCreateProgram, c11);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            GLES20.glGetProgramInfoLog(glCreateProgram);
            return 0;
        }
        GLES20.glDeleteShader(c12);
        GLES20.glDeleteShader(c11);
        return glCreateProgram;
    }
}
