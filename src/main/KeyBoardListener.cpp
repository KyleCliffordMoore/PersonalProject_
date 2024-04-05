#include <Windows.h>
#include "KeyBoardListener.h"

JNIEXPORT jint JNICALL Java_main_NativeKeyBoard_getASyncKeyState(JNIEnv*, jobject, jint jKeyInt) {

	jint keyState = (jint) GetAsyncKeyState(jKeyInt);

	return keyState; 
}

JNIEXPORT jint JNICALL Java_main_NativeKeyBoard_getKeyState(JNIEnv*, jobject, jint jKeyInt) {

	jint keyState = (jint) GetKeyState(jKeyInt);

	return keyState; 
}
