package etceterum.libra.graphics.gles.android;

import android.opengl.GLU;

import etceterum.libra.graphics.gles.GLESU;

public final class AndroidGLESU implements GLESU {
    private final AndroidGLES10 gl;
    
    AndroidGLESU(AndroidGLES10 gl) {
        assert null != gl;
        this.gl = gl;
    }
    
    public AndroidGLES10 getGL() {
        return gl;
    }

    @Override
    public void gluLookAt(float eyeX, float eyeY, float eyeZ, float centerX, float centerY, float centerZ, float upX, float upY, float upZ) {
        assert null != gl;
        GLU.gluLookAt(gl.getImpl(), eyeX, eyeY, eyeZ, centerX, centerY, centerZ, upX, upY, upZ);
    }
    
    @Override
    public void gluPerspective(float fov, float aspect, float zNear, float zFar) {
        assert null != gl;
        GLU.gluPerspective(gl.getImpl(), fov, aspect, zNear, zFar);
    }

}
