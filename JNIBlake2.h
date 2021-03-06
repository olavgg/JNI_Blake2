/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class JNIBlake2 */

#ifndef _Included_JNIBlake2
#define _Included_JNIBlake2
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     JNIBlake2
 * Method:    blake2_init
 * Signature: (Ljava/io/File;)V
 */
JNIEXPORT void JNICALL Java_JNIBlake2_blake2_1init
  (JNIEnv *, jobject, jobject);

/*
 * Class:     JNIBlake2
 * Method:    blake2_update
 * Signature: ([B)V
 */
JNIEXPORT void JNICALL Java_JNIBlake2_blake2_1update
  (JNIEnv *, jobject, jbyteArray);

/*
 * Class:     JNIBlake2
 * Method:    blake2_final
 * Signature: ([B)V
 */
JNIEXPORT void JNICALL Java_JNIBlake2_blake2_1final
  (JNIEnv *, jobject, jbyteArray);

#ifdef __cplusplus
}
#endif
#endif
