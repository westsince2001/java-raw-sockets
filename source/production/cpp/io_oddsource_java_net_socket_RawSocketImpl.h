/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class io_oddsource_java_net_socket_RawSocketImpl */

#ifndef _Included_io_oddsource_java_net_socket_RawSocketImpl
#define _Included_io_oddsource_java_net_socket_RawSocketImpl
#ifdef __cplusplus
extern "C" {
#endif
#undef io_oddsource_java_net_socket_RawSocketImpl_UNDEFINED
#define io_oddsource_java_net_socket_RawSocketImpl_UNDEFINED -1L
/*
 * Class:     io_oddsource_java_net_socket_RawSocketImpl
 * Method:    nativeStaticInitialize
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_io_oddsource_java_net_socket_RawSocketImpl_nativeStaticInitialize
  (JNIEnv *, jclass);

/*
 * Class:     io_oddsource_java_net_socket_RawSocketImpl
 * Method:    nativeStaticShutdown
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_io_oddsource_java_net_socket_RawSocketImpl_nativeStaticShutdown
  (JNIEnv *, jclass);

/*
 * Class:     io_oddsource_java_net_socket_RawSocketImpl
 * Method:    setSocketOption
 * Signature: (IIII)V
 */
JNIEXPORT void JNICALL Java_io_oddsource_java_net_socket_RawSocketImpl_setSocketOption
  (JNIEnv *, jobject, jint, jint, jint, jint);

/*
 * Class:     io_oddsource_java_net_socket_RawSocketImpl
 * Method:    getSocketOption
 * Signature: (III)I
 */
JNIEXPORT jint JNICALL Java_io_oddsource_java_net_socket_RawSocketImpl_getSocketOption
  (JNIEnv *, jobject, jint, jint, jint);

/*
 * Class:     io_oddsource_java_net_socket_RawSocketImpl
 * Method:    setTimeout
 * Signature: (III)V
 */
JNIEXPORT void JNICALL Java_io_oddsource_java_net_socket_RawSocketImpl_setTimeout
  (JNIEnv *, jobject, jint, jint, jint);

/*
 * Class:     io_oddsource_java_net_socket_RawSocketImpl
 * Method:    getTimeout
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_io_oddsource_java_net_socket_RawSocketImpl_getTimeout
  (JNIEnv *, jobject, jint, jint);

#ifdef __cplusplus
}
#endif
#endif
