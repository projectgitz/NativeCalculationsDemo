#include <jni.h>
#include <android/log.h>

#define  LOG_TAG  "JniCode"

extern "C"
jint Java_com_chetan_nativeadditiondemo_MainActivity_sumTwoValues(
        JNIEnv *env,
        jobject /* this */, jint a, jint b) {
    __android_log_print(ANDROID_LOG_INFO, LOG_TAG, "Need to print : %d %d", a, b);
    return (a + b);
}

jint Java_com_chetan_nativeadditiondemo_MainActivity_multiplicationTwoValues(
        JNIEnv *env,
        jobject /* this */, jint a, jint b) {
    __android_log_print(ANDROID_LOG_INFO, LOG_TAG, "Need to print : %d %d", a, b);
    return (a * b);
}