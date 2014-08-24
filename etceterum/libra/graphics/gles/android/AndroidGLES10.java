package etceterum.libra.graphics.gles.android;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import javax.microedition.khronos.opengles.GL10;

import etceterum.libra.graphics.gles.GLES10;

public class AndroidGLES10 implements GLES10 {
    protected GL10 impl;
    private final AndroidGLESU glu;
    
    public AndroidGLES10() {
        glu = new AndroidGLESU(this);
    }
    
    public GL10 getImpl() {
        return impl;
    }
    
    public AndroidGLES10 wrap(GL10 impl) {
        assert null != impl;
        this.impl = impl;
        return this;
    }
    
    public void glActiveTexture(int texture) {
        impl.glActiveTexture(texture);
    }
    
    public void glAlphaFunc(int func, float ref) {
        impl.glAlphaFunc(func, ref);
    }
    
    public void glBindTexture(int target, int texture) {
        impl.glBindTexture(target, texture);
    }
    
    public void glBlendFunc(int sfactor, int dfactor) {
        impl.glBlendFunc(sfactor, dfactor);
    }
    
    public void glClear(int mask) {
        impl.glClear(mask);
    }
    
    public void glClearColor(float red, float green, float blue, float alpha) {
        impl.glClearColor(red, green, blue, alpha);
    }
    
    public void glClearDepthf(float depth) {
        impl.glClearDepthf(depth);
    }
    
    public void glClearStencil(int s) {
        impl.glClearStencil(s);
    }
    
    public void glClientActiveTexture(int texture) {
        impl.glClientActiveTexture(texture);
    }
    
    public void glColor4f(float red, float green, float blue, float alpha) {
        impl.glColor4f(red, green, blue, alpha);
    }
    
    public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        impl.glColorMask(red, green, blue, alpha);
    }

    public void glColorPointer(int size, int type, int stride, Buffer pointer) {
        impl.glColorPointer(size, type, stride, pointer);
    }

    public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, Buffer data) {
        impl.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, Buffer data) {
        impl.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    public void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        impl.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
    }

    public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        impl.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    public void glCullFace(int mode) {
        impl.glCullFace(mode);
    }

    public void glDeleteTextures(int n, int[] textures, int offset) {
        impl.glDeleteTextures(n, textures, offset);
    }

    public void glDeleteTextures(int n, IntBuffer textures) {
        impl.glDeleteTextures(n, textures);
    }

    public void glDepthFunc(int func) {
        impl.glDepthFunc(func);
    }

    public void glDepthMask(boolean flag) {
        impl.glDepthMask(flag);
    }

    public void glDepthRangef(float zNear, float zFar) {
        impl.glDepthRangef(zNear, zFar);
    }

    public void glDisable(int cap) {
        impl.glDisable(cap);
    }

    public void glDisableClientState(int array) {
        impl.glDisableClientState(array);
    }

    public void glDrawArrays(int mode, int first, int count) {
        impl.glDrawArrays(mode, first, count);
    }

    public void glDrawElements(int mode, int count, int type, Buffer indices) {
        impl.glDrawElements(mode, count, type, indices);
    }

    public void glEnable(int cap) {
        impl.glEnable(cap);
    }

    public void glEnableClientState(int array) {
        impl.glEnableClientState(array);
    }

    public void glFinish() {
        impl.glFinish();
    }

    public void glFlush() {
        impl.glFlush();
    }

    public void glFogf(int pname, float param) {
        impl.glFogf(pname, param);
    }

    public void glFogfv(int pname, float[] params, int offset) {
        impl.glFogfv(pname, params, offset);
    }

    public void glFogfv(int pname, FloatBuffer params) {
        impl.glFogfv(pname, params);
    }

    public void glFrontFace(int mode) {
        impl.glFrontFace(mode);
    }

    public void glFrustumf(float left, float right, float bottom, float top, float zNear, float zFar) {
        impl.glFrustumf(left, right, bottom, top, zNear, zFar);
    }

    public void glGenTextures(int n, int[] textures, int offset) {
        impl.glGenTextures(n, textures, offset);
    }

    public void glGenTextures(int n, IntBuffer textures) {
        impl.glGenTextures(n, textures);
    }

    public int glGetError() {
        return impl.glGetError();
    }

    public void glGetIntegerv(int pname, int[] params, int offset) {
        impl.glGetIntegerv(pname, params, offset);
    }

    public void glGetIntegerv(int pname, IntBuffer params) {
        impl.glGetIntegerv(pname, params);
    }

    public String glGetString(int name) {
        return impl.glGetString(name);
    }
    
    public void glHint(int target, int mode) {
        impl.glHint(target, mode);
    }

    public void glLightModelf(int pname, float param) {
        impl.glLightModelf(pname, param);
    }

    public void glLightModelfv(int pname, float[] params, int offset) {
        impl.glLightModelfv(pname, params, offset);
    }

    public void glLightModelfv(int pname, FloatBuffer params) {
        impl.glLightModelfv(pname, params);
    }

    public void glLightf(int light, int pname, float param) {
        impl.glLightf(light, pname, param);
    }

    public void glLightfv(int light, int pname, float[] params, int offset) {
        impl.glLightfv(light, pname, params, offset);
    }

    public void glLightfv(int light, int pname, FloatBuffer params) {
        impl.glLightfv(light, pname, params);
    }

    public void glLineWidth(float width) {
        impl.glLineWidth(width);
    }

    public void glLoadIdentity() {
        impl.glLoadIdentity();
    }

    public void glLoadMatrixf(float[] m, int offset) {
        impl.glLoadMatrixf(m, offset);
    }

    public void glLoadMatrixf(FloatBuffer m) {
        impl.glLoadMatrixf(m);
    }

    public void glLogicOp(int opcode) {
        impl.glLogicOp(opcode);
    }

    public void glMaterialf(int face, int pname, float param) {
        impl.glMaterialf(face, pname, param);
    }

    public void glMaterialfv(int face, int pname, float[] params, int offset) {
        impl.glMaterialfv(face, pname, params, offset);
    }

    public void glMaterialfv(int face, int pname, FloatBuffer params) {
        impl.glMaterialfv(face, pname, params);
    }

    public void glMatrixMode(int mode) {
        impl.glMatrixMode(mode);
    }

    public void glMultMatrixf(float[] m, int offset) {
        impl.glMultMatrixf(m, offset);
    }

    public void glMultMatrixf(FloatBuffer m) {
        impl.glMultMatrixf(m);
    }

    public void glMultiTexCoord4f(int target, float s, float t, float r, float q) {
        impl.glMultiTexCoord4f(target, s, t, r, q);
    }

    public void glNormal3f(float nx, float ny, float nz) {
        impl.glNormal3f(nx, ny, nz);
    }

    public void glNormalPointer(int type, int stride, Buffer pointer) {
        impl.glNormalPointer(type, stride, pointer);
    }

    public void glOrthof(float left, float right, float bottom, float top, float zNear, float zFar) {
        impl.glOrthof(left, right, bottom, top, zNear, zFar);
    }

    public void glPixelStorei(int pname, int param) {
        impl.glPixelStorei(pname, param);
    }

    public void glPointSize(float size) {
        impl.glPointSize(size);
    }

    public void glPolygonOffset(float factor, float units) {
        impl.glPolygonOffset(factor, units);
    }

    public void glPopMatrix() {
        impl.glPopMatrix();
    }

    public void glPushMatrix() {
        impl.glPushMatrix();
    }

    public void glReadPixels(int x, int y, int width, int height, int format, int type, Buffer pixels) {
        impl.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public void glRotatef(float angle, float x, float y, float z) {
        impl.glRotatef(angle, x, y, z);
    }

    public void glSampleCoverage(float value, boolean invert) {
        impl.glSampleCoverage(value, invert);
    }

    public void glScalef(float x, float y, float z) {
        impl.glScalef(x, y, z);
    }

    public void glScissor(int x, int y, int width, int height) {
        impl.glScissor(x, y, width, height);
    }

    public void glShadeModel(int mode) {
        impl.glShadeModel(mode);
    }

    public void glStencilFunc(int func, int ref, int mask) {
        impl.glStencilFunc(func, ref, mask);
    }

    public void glStencilMask(int mask) {
        impl.glStencilMask(mask);
    }

    public void glStencilOp(int fail, int zfail, int zpass) {
        impl.glStencilOp(fail, zfail, zpass);
    }

    public void glTexCoordPointer(int size, int type, int stride, Buffer pointer) {
        impl.glTexCoordPointer(size, type, stride, pointer);
    }

    public void glTexEnvf(int target, int pname, float param) {
        impl.glTexEnvf(target, pname, param);
    }

    public void glTexEnvfv(int target, int pname, float[] params, int offset) {
        impl.glTexEnvfv(target, pname, params, offset);
    }

    public void glTexEnvfv(int target, int pname, FloatBuffer params) {
        impl.glTexEnvfv(target, pname, params);
    }

    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, Buffer pixels) {
        impl.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public void glTexParameterf(int target, int pname, float param) {
        impl.glTexParameterf(target, pname, param);
    }

    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Buffer pixels) {
        impl.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public void glTranslatef(float x, float y, float z) {
        impl.glTranslatef(x, y, z);
    }

    public void glVertexPointer(int size, int type, int stride, Buffer pointer) {
        impl.glVertexPointer(size, type, stride, pointer);
    }

    public void glViewport(int x, int y, int width, int height) {
        impl.glViewport(x, y, width, height);
    }
    
    public int GL_ADD() {
        return GL10.GL_ADD;
    }

    public int GL_ALIASED_LINE_WIDTH_RANGE() {
        return GL10.GL_ALIASED_LINE_WIDTH_RANGE;
    }

    public int GL_ALIASED_POINT_SIZE_RANGE() {
        return GL10.GL_ALIASED_POINT_SIZE_RANGE;
    }

    public int GL_ALPHA() {
        return GL10.GL_ALPHA;
    }

    public int GL_ALPHA_BITS() {
        return GL10.GL_ALPHA_BITS;
    }

    public int GL_ALPHA_TEST() {
        return GL10.GL_ALPHA_BITS;
    }

    public int GL_ALWAYS() {
        return GL10.GL_ALWAYS;
    }

    public int GL_AMBIENT() {
        return GL10.GL_AMBIENT;
    }

    public int GL_AMBIENT_AND_DIFFUSE() {
        return GL10.GL_AMBIENT_AND_DIFFUSE;
    }

    public int GL_AND() {
        return GL10.GL_AND;
    }

    public int GL_AND_INVERTED() {
        return GL10.GL_AND_INVERTED;
    }

    public int GL_AND_REVERSE() {
        return GL10.GL_AND_REVERSE;
    }

    public int GL_BACK() {
        return GL10.GL_BACK;
    }

    public int GL_BLEND() {
        return GL10.GL_BLEND;
    }

    public int GL_BLUE_BITS() {
        return GL10.GL_BLUE_BITS;
    }

    public int GL_BYTE() {
        return GL10.GL_BYTE;
    }

    public int GL_CCW() {
        return GL10.GL_CCW;
    }

    public int GL_CLAMP_TO_EDGE() {
        return GL10.GL_CLAMP_TO_EDGE;
    }

    public int GL_CLEAR() {
        return GL10.GL_CLEAR;
    }

    public int GL_COLOR_ARRAY() {
        return GL10.GL_COLOR_ARRAY;
    }

    public int GL_COLOR_BUFFER_BIT() {
        return GL10.GL_COLOR_BUFFER_BIT;
    }

    public int GL_COLOR_LOGIC_OP() {
        return GL10.GL_COLOR_LOGIC_OP;
    }

    public int GL_COLOR_MATERIAL() {
        return GL10.GL_COLOR_MATERIAL;
    }

    public int GL_COMPRESSED_TEXTURE_FORMATS() {
        return GL10.GL_COMPRESSED_TEXTURE_FORMATS;
    }

    public int GL_CONSTANT_ATTENUATION() {
        return GL10.GL_CONSTANT_ATTENUATION;
    }

    public int GL_COPY() {
        return GL10.GL_COPY;
    }

    public int GL_COPY_INVERTED() {
        return GL10.GL_COPY_INVERTED;
    }

    public int GL_CULL_FACE() {
        return GL10.GL_CULL_FACE;
    }

    public int GL_CW() {
        return GL10.GL_CW;
    }

    public int GL_DECAL() {
        return GL10.GL_DECAL;
    }

    public int GL_DECR() {
        return GL10.GL_DECR;
    }

    public int GL_DEPTH_BITS() {
        return GL10.GL_DEPTH_BITS;
    }

    public int GL_DEPTH_BUFFER_BIT() {
        return GL10.GL_DEPTH_BUFFER_BIT;
    }

    public int GL_DEPTH_TEST() {
        return GL10.GL_DEPTH_TEST;
    }

    public int GL_DIFFUSE() {
        return GL10.GL_DIFFUSE;
    }

    public int GL_DITHER() {
        return GL10.GL_DITHER;
    }

    public int GL_DONT_CARE() {
        return GL10.GL_DONT_CARE;
    }

    public int GL_DST_ALPHA() {
        return GL10.GL_DST_ALPHA;
    }

    public int GL_DST_COLOR() {
        return GL10.GL_DST_COLOR;
    }

    public int GL_EMISSION() {
        return GL10.GL_EMISSION;
    }

    public int GL_EQUAL() {
        return GL10.GL_EQUAL;
    }

    public int GL_EQUIV() {
        return GL10.GL_EQUIV;
    }

    public int GL_EXP() {
        return GL10.GL_EXP;
    }

    public int GL_EXP2() {
        return GL10.GL_EXP2;
    }

    public int GL_EXTENSIONS() {
        return GL10.GL_EXTENSIONS;
    }

    public int GL_FALSE() {
        return GL10.GL_FALSE;
    }

    public int GL_FASTEST() {
        return GL10.GL_FASTEST;
    }

    /*
    public int GL_FIXED() {
        return impl.GL_FIXED;
    }
    */

    public int GL_FLAT() {
        return GL10.GL_FLAT;
    }

    public int GL_FLOAT() {
        return GL10.GL_FLOAT;
    }

    public int GL_FOG() {
        return GL10.GL_FOG;
    }

    public int GL_FOG_COLOR() {
        return GL10.GL_FOG_COLOR;
    }

    public int GL_FOG_DENSITY() {
        return GL10.GL_FOG_DENSITY;
    }

    public int GL_FOG_END() {
        return GL10.GL_FOG_END;
    }

    public int GL_FOG_HINT() {
        return GL10.GL_FOG_HINT;
    }

    public int GL_FOG_MODE() {
        return GL10.GL_FOG_MODE;
    }

    public int GL_FOG_START() {
        return GL10.GL_FOG_START;
    }

    public int GL_FRONT() {
        return GL10.GL_FRONT;
    }

    public int GL_FRONT_AND_BACK() {
        return GL10.GL_FRONT_AND_BACK;
    }

    public int GL_GEQUAL() {
        return GL10.GL_GEQUAL;
    }

    public int GL_GREATER() {
        return GL10.GL_GREATER;
    }

    public int GL_GREEN_BITS() {
        return GL10.GL_GREEN_BITS;
    }

    public int GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES() {
        return GL10.GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES;
    }

    public int GL_IMPLEMENTATION_COLOR_READ_TYPE_OES() {
        return GL10.GL_IMPLEMENTATION_COLOR_READ_TYPE_OES;
    }

    public int GL_INCR() {
        return GL10.GL_INCR;
    }

    public int GL_INVALID_ENUM() {
        return GL10.GL_INVALID_ENUM;
    }

    public int GL_INVALID_OPERATION() {
        return GL10.GL_INVALID_OPERATION;
    }

    public int GL_INVALID_VALUE() {
        return GL10.GL_INVALID_VALUE;
    }

    public int GL_INVERT() {
        return GL10.GL_INVERT;
    }

    public int GL_KEEP() {
        return GL10.GL_KEEP;
    }

    public int GL_LEQUAL() {
        return GL10.GL_LEQUAL;
    }

    public int GL_LESS() {
        return GL10.GL_LESS;
    }

    public int GL_LIGHT_MODEL_AMBIENT() {
        return GL10.GL_LIGHT_MODEL_AMBIENT;
    }

    public int GL_LIGHT_MODEL_TWO_SIDE() {
        return GL10.GL_LIGHT_MODEL_TWO_SIDE;
    }

    public int GL_LIGHT0() {
        return GL10.GL_LIGHT0;
    }

    public int GL_LIGHT1() {
        return GL10.GL_LIGHT1;
    }

    public int GL_LIGHT2() {
        return GL10.GL_LIGHT2;
    }

    public int GL_LIGHT3() {
        return GL10.GL_LIGHT3;
    }

    public int GL_LIGHT4() {
        return GL10.GL_LIGHT4;
    }

    public int GL_LIGHT5() {
        return GL10.GL_LIGHT5;
    }

    public int GL_LIGHT6() {
        return GL10.GL_LIGHT6;
    }

    public int GL_LIGHT7() {
        return GL10.GL_LIGHT7;
    }

    public int GL_LIGHTING() {
        return GL10.GL_LIGHTING;
    }

    public int GL_LINE_LOOP() {
        return GL10.GL_LINE_LOOP;
    }

    public int GL_LINE_SMOOTH() {
        return GL10.GL_LINE_SMOOTH;
    }

    public int GL_LINE_SMOOTH_HINT() {
        return GL10.GL_LINE_SMOOTH_HINT;
    }

    public int GL_LINE_STRIP() {
        return GL10.GL_LINE_STRIP;
    }

    public int GL_LINEAR() {
        return GL10.GL_LINEAR;
    }

    public int GL_LINEAR_ATTENUATION() {
        return GL10.GL_LINEAR_ATTENUATION;
    }

    public int GL_LINEAR_MIPMAP_LINEAR() {
        return GL10.GL_LINEAR_MIPMAP_LINEAR;
    }

    public int GL_LINEAR_MIPMAP_NEAREST() {
        return GL10.GL_LINEAR_MIPMAP_NEAREST;
    }

    public int GL_LINES() {
        return GL10.GL_LINES;
    }

    public int GL_LUMINANCE() {
        return GL10.GL_LUMINANCE;
    }

    public int GL_LUMINANCE_ALPHA() {
        return GL10.GL_LUMINANCE_ALPHA;
    }

    public int GL_MAX_ELEMENTS_INDICES() {
        return GL10.GL_MAX_ELEMENTS_INDICES;
    }

    public int GL_MAX_ELEMENTS_VERTICES() {
        return GL10.GL_MAX_ELEMENTS_VERTICES;
    }

    public int GL_MAX_LIGHTS() {
        return GL10.GL_MAX_LIGHTS;
    }

    public int GL_MAX_MODELVIEW_STACK_DEPTH() {
        return GL10.GL_MAX_MODELVIEW_STACK_DEPTH;
    }

    public int GL_MAX_PROJECTION_STACK_DEPTH() {
        return GL10.GL_MAX_PROJECTION_STACK_DEPTH;
    }

    public int GL_MAX_TEXTURE_SIZE() {
        return GL10.GL_MAX_TEXTURE_SIZE;
    }

    public int GL_MAX_TEXTURE_STACK_DEPTH() {
        return GL10.GL_MAX_TEXTURE_STACK_DEPTH;
    }

    public int GL_MAX_TEXTURE_UNITS() {
        return GL10.GL_MAX_TEXTURE_UNITS;
    }

    public int GL_MAX_VIEWPORT_DIMS() {
        return GL10.GL_MAX_VIEWPORT_DIMS;
    }

    public int GL_MODELVIEW() {
        return GL10.GL_MODELVIEW;
    }

    public int GL_MODULATE() {
        return GL10.GL_MODULATE;
    }

    public int GL_MULTISAMPLE() {
        return GL10.GL_MULTISAMPLE;
    }

    public int GL_NAND() {
        return GL10.GL_NAND;
    }

    public int GL_NEAREST() {
        return GL10.GL_NEAREST;
    }

    public int GL_NEAREST_MIPMAP_LINEAR() {
        return GL10.GL_NEAREST_MIPMAP_LINEAR;
    }

    public int GL_NEAREST_MIPMAP_NEAREST() {
        return GL10.GL_NEAREST_MIPMAP_NEAREST;
    }

    public int GL_NEVER() {
        return GL10.GL_NEVER;
    }

    public int GL_NICEST() {
        return GL10.GL_NICEST;
    }

    public int GL_NO_ERROR() {
        return GL10.GL_NO_ERROR;
    }

    public int GL_NOOP() {
        return GL10.GL_NOOP;
    }

    public int GL_NOR() {
        return GL10.GL_NOR;
    }

    public int GL_NORMAL_ARRAY() {
        return GL10.GL_NORMAL_ARRAY;
    }

    public int GL_NORMALIZE() {
        return GL10.GL_NORMALIZE;
    }

    public int GL_NOTEQUAL() {
        return GL10.GL_NOTEQUAL;
    }

    public int GL_NUM_COMPRESSED_TEXTURE_FORMATS() {
        return GL10.GL_NUM_COMPRESSED_TEXTURE_FORMATS;
    }

    public int GL_ONE() {
        return GL10.GL_ONE;
    }

    public int GL_ONE_MINUS_DST_ALPHA() {
        return GL10.GL_ONE_MINUS_DST_ALPHA;
    }

    public int GL_ONE_MINUS_DST_COLOR() {
        return GL10.GL_ONE_MINUS_DST_COLOR;
    }

    public int GL_ONE_MINUS_SRC_ALPHA() {
        return GL10.GL_ONE_MINUS_SRC_ALPHA;
    }

    public int GL_ONE_MINUS_SRC_COLOR() {
        return GL10.GL_ONE_MINUS_SRC_COLOR;
    }

    public int GL_OR() {
        return GL10.GL_OR;
    }

    public int GL_OR_INVERTED() {
        return GL10.GL_OR_INVERTED;
    }

    public int GL_OR_REVERSE() {
        return GL10.GL_OR_REVERSE;
    }

    public int GL_OUT_OF_MEMORY() {
        return GL10.GL_OUT_OF_MEMORY;
    }

    public int GL_PACK_ALIGNMENT() {
        return GL10.GL_PACK_ALIGNMENT;
    }

    /*
    public int GL_PALETTE4_R5_G6_B5_OES() {
        return impl.GL_PALETTE4_R5_G6_B5_OES;
    }

    public int GL_PALETTE4_RGB5_A1_OES() {
        return impl.GL_PALETTE4_R5_G6_B5_OES;
    }

    public int GL_PALETTE4_RGB8_OES() {
        return impl.GL_PALETTE4_RGB8_OES;
    }

    public int GL_PALETTE4_RGBA4_OES() {
        return impl.GL_PALETTE4_RGBA4_OES;
    }

    public int GL_PALETTE4_RGBA8_OES() {
        return impl.GL_PALETTE4_RGBA8_OES;
    }

    public int GL_PALETTE8_R5_G6_B5_OES() {
        return impl.GL_PALETTE8_R5_G6_B5_OES;
    }

    public int GL_PALETTE8_RGB5_A1_OES() {
        return impl.GL_PALETTE8_RGB5_A1_OES;
    }

    public int GL_PALETTE8_RGB8_OES() {
        return impl.GL_PALETTE8_RGB8_OES;
    }

    public int GL_PALETTE8_RGBA4_OES() {
        return impl.GL_PALETTE8_RGBA4_OES;
    }

    public int GL_PALETTE8_RGBA8_OES() {
        return impl.GL_PALETTE8_RGBA8_OES;
    }
    */

    public int GL_PERSPECTIVE_CORRECTION_HINT() {
        return GL10.GL_PERSPECTIVE_CORRECTION_HINT;
    }

    public int GL_POINT_SMOOTH() {
        return GL10.GL_POINT_SMOOTH;
    }

    public int GL_POINT_SMOOTH_HINT() {
        return GL10.GL_POINT_SMOOTH_HINT;
    }

    public int GL_POINTS() {
        return GL10.GL_POINTS;
    }

    public int GL_POINT_FADE_THRESHOLD_SIZE() {
        return GL10.GL_POINT_FADE_THRESHOLD_SIZE;
    }

    public int GL_POINT_SIZE() {
        return GL10.GL_POINT_SIZE;
    }

    public int GL_POLYGON_OFFSET_FILL() {
        return GL10.GL_POLYGON_OFFSET_FILL;
    }

    public int GL_POLYGON_SMOOTH_HINT() {
        return GL10.GL_POLYGON_SMOOTH_HINT;
    }

    public int GL_POSITION() {
        return GL10.GL_POSITION;
    }

    public int GL_PROJECTION() {
        return GL10.GL_PROJECTION;
    }

    public int GL_QUADRATIC_ATTENUATION() {
        return GL10.GL_QUADRATIC_ATTENUATION;
    }

    public int GL_RED_BITS() {
        return GL10.GL_RED_BITS;
    }

    public int GL_RENDERER() {
        return GL10.GL_RENDERER;
    }

    public int GL_REPEAT() {
        return GL10.GL_REPEAT;
    }

    public int GL_REPLACE() {
        return GL10.GL_REPLACE;
    }

    public int GL_RESCALE_NORMAL() {
        return GL10.GL_RESCALE_NORMAL;
    }

    public int GL_RGB() {
        return GL10.GL_RGB;
    }

    public int GL_RGBA() {
        return GL10.GL_RGBA;
    }

    public int GL_SAMPLE_ALPHA_TO_COVERAGE() {
        return GL10.GL_SAMPLE_ALPHA_TO_COVERAGE;
    }

    public int GL_SAMPLE_ALPHA_TO_ONE() {
        return GL10.GL_SAMPLE_ALPHA_TO_ONE;
    }

    public int GL_SAMPLE_COVERAGE() {
        return GL10.GL_SAMPLE_COVERAGE;
    }

    public int GL_SCISSOR_TEST() {
        return GL10.GL_SCISSOR_TEST;
    }

    public int GL_SET() {
        return GL10.GL_SET;
    }

    public int GL_SHININESS() {
        return GL10.GL_SHININESS;
    }

    public int GL_SHORT() {
        return GL10.GL_SHORT;
    }

    public int GL_SMOOTH() {
        return GL10.GL_SMOOTH;
    }

    public int GL_SMOOTH_LINE_WIDTH_RANGE() {
        return GL10.GL_SMOOTH_LINE_WIDTH_RANGE;
    }

    public int GL_SMOOTH_POINT_SIZE_RANGE() {
        return GL10.GL_SMOOTH_POINT_SIZE_RANGE;
    }

    public int GL_SPECULAR() {
        return GL10.GL_SPECULAR;
    }

    public int GL_SPOT_CUTOFF() {
        return GL10.GL_SPOT_CUTOFF;
    }

    public int GL_SPOT_DIRECTION() {
        return GL10.GL_SPOT_DIRECTION;
    }

    public int GL_SPOT_EXPONENT() {
        return GL10.GL_SPOT_EXPONENT;
    }

    public int GL_SRC_ALPHA() {
        return GL10.GL_SRC_ALPHA;
    }

    public int GL_SRC_ALPHA_SATURATE() {
        return GL10.GL_SRC_ALPHA_SATURATE;
    }

    public int GL_SRC_COLOR() {
        return GL10.GL_SRC_COLOR;
    }

    public int GL_STACK_OVERFLOW() {
        return GL10.GL_STACK_OVERFLOW;
    }

    public int GL_STACK_UNDERFLOW() {
        return GL10.GL_STACK_UNDERFLOW;
    }

    public int GL_STENCIL_BITS() {
        return GL10.GL_STENCIL_BITS;
    }

    public int GL_STENCIL_BUFFER_BIT() {
        return GL10.GL_STENCIL_BUFFER_BIT;
    }

    public int GL_STENCIL_TEST() {
        return GL10.GL_STENCIL_TEST;
    }

    public int GL_SUBPIXEL_BITS() {
        return GL10.GL_SUBPIXEL_BITS;
    }

    public int GL_TEXTURE() {
        return GL10.GL_TEXTURE;
    }

    public int GL_TEXTURE_2D() {
        return GL10.GL_TEXTURE_2D;
    }

    public int GL_TEXTURE_COORD_ARRAY() {
        return GL10.GL_TEXTURE_COORD_ARRAY;
    }

    public int GL_TEXTURE_ENV() {
        return GL10.GL_TEXTURE_ENV;
    }

    public int GL_TEXTURE_ENV_COLOR() {
        return GL10.GL_TEXTURE_ENV_COLOR;
    }

    public int GL_TEXTURE_ENV_MODE() {
        return GL10.GL_TEXTURE_ENV_MODE;
    }

    public int GL_TEXTURE_MAG_FILTER() {
        return GL10.GL_TEXTURE_MAG_FILTER;
    }

    public int GL_TEXTURE_MIN_FILTER() {
        return GL10.GL_TEXTURE_MIN_FILTER;
    }

    public int GL_TEXTURE_WRAP_S() {
        return GL10.GL_TEXTURE_WRAP_S;
    }

    public int GL_TEXTURE_WRAP_T() {
        return GL10.GL_TEXTURE_WRAP_T;
    }

    public int GL_TEXTURE0() {
        return GL10.GL_TEXTURE0;
    }

    public int GL_TEXTURE1() {
        return GL10.GL_TEXTURE1;
    }

    public int GL_TEXTURE2() {
        return GL10.GL_TEXTURE2;
    }

    public int GL_TEXTURE3() {
        return GL10.GL_TEXTURE3;
    }

    public int GL_TEXTURE4() {
        return GL10.GL_TEXTURE4;
    }

    public int GL_TEXTURE5() {
        return GL10.GL_TEXTURE5;
    }

    public int GL_TEXTURE6() {
        return GL10.GL_TEXTURE6;
    }

    public int GL_TEXTURE7() {
        return GL10.GL_TEXTURE7;
    }

    public int GL_TEXTURE8() {
        return GL10.GL_TEXTURE8;
    }

    public int GL_TEXTURE9() {
        return GL10.GL_TEXTURE9;
    }

    public int GL_TEXTURE10() {
        return GL10.GL_TEXTURE10;
    }

    public int GL_TEXTURE11() {
        return GL10.GL_TEXTURE11;
    }

    public int GL_TEXTURE12() {
        return GL10.GL_TEXTURE12;
    }

    public int GL_TEXTURE13() {
        return GL10.GL_TEXTURE13;
    }

    public int GL_TEXTURE14() {
        return GL10.GL_TEXTURE14;
    }

    public int GL_TEXTURE15() {
        return GL10.GL_TEXTURE15;
    }

    public int GL_TEXTURE16() {
        return GL10.GL_TEXTURE16;
    }

    public int GL_TEXTURE17() {
        return GL10.GL_TEXTURE17;
    }

    public int GL_TEXTURE18() {
        return GL10.GL_TEXTURE18;
    }

    public int GL_TEXTURE19() {
        return GL10.GL_TEXTURE19;
    }

    public int GL_TEXTURE20() {
        return GL10.GL_TEXTURE20;
    }

    public int GL_TEXTURE21() {
        return GL10.GL_TEXTURE21;
    }

    public int GL_TEXTURE22() {
        return GL10.GL_TEXTURE22;
    }

    public int GL_TEXTURE23() {
        return GL10.GL_TEXTURE23;
    }

    public int GL_TEXTURE24() {
        return GL10.GL_TEXTURE24;
    }

    public int GL_TEXTURE25() {
        return GL10.GL_TEXTURE25;
    }

    public int GL_TEXTURE26() {
        return GL10.GL_TEXTURE26;
    }

    public int GL_TEXTURE27() {
        return GL10.GL_TEXTURE27;
    }

    public int GL_TEXTURE28() {
        return GL10.GL_TEXTURE28;
    }

    public int GL_TEXTURE29() {
        return GL10.GL_TEXTURE29;
    }

    public int GL_TEXTURE30() {
        return GL10.GL_TEXTURE30;
    }

    public int GL_TEXTURE31() {
        return GL10.GL_TEXTURE31;
    }

    public int GL_TRIANGLE_FAN() {
        return GL10.GL_TRIANGLE_FAN;
    }

    public int GL_TRIANGLE_STRIP() {
        return GL10.GL_TRIANGLE_STRIP;
    }

    public int GL_TRIANGLES() {
        return GL10.GL_TRIANGLES;
    }

    public int GL_TRUE() {
        return GL10.GL_TRUE;
    }

    public int GL_UNPACK_ALIGNMENT() {
        return GL10.GL_UNPACK_ALIGNMENT;
    }

    public int GL_UNSIGNED_BYTE() {
        return GL10.GL_UNSIGNED_BYTE;
    }

    public int GL_UNSIGNED_SHORT() {
        return GL10.GL_UNSIGNED_SHORT;
    }

    public int GL_UNSIGNED_SHORT_4_4_4_4() {
        return GL10.GL_UNSIGNED_SHORT_4_4_4_4;
    }

    public int GL_UNSIGNED_SHORT_5_5_5_1() {
        return GL10.GL_UNSIGNED_SHORT_5_5_5_1;
    }

    public int GL_UNSIGNED_SHORT_5_6_5() {
        return GL10.GL_UNSIGNED_SHORT_5_6_5;
    }

    public int GL_VENDOR() {
        return GL10.GL_VENDOR;
    }

    public int GL_VERSION() {
        return GL10.GL_VERSION;
    }

    public int GL_VERTEX_ARRAY() {
        return GL10.GL_VERTEX_ARRAY;
    }

    public int GL_XOR() {
        return GL10.GL_XOR;
    }

    public int GL_ZERO() {
        return GL10.GL_ZERO;
    }

    public AndroidGLESU getGLU() {
        return glu;
    }
}
