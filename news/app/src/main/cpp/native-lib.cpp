#include <jni.h>
#include <string>

extern "C"
JNIEXPORT void JNICALL
//加密
Java_com_tb_wangfang_news_utils_NDKFileEncryptUtils_encry(JNIEnv *env, jclass type,
                                                          jstring inputPath_, jstring outputPath_) {
    const char *inputPath = env->GetStringUTFChars(inputPath_, 0);
    const char *outputPath = env->GetStringUTFChars(outputPath_, 0);
    // TODO
//打开文件
    FILE *normal_fp = fopen(inputPath, "r");
    FILE *crypt_fp = fopen(outputPath, "w");
    //一次读取一个字符
    int ch;
    while ((ch = fgetc(normal_fp)) != EOF) { //End of File
        //写入（异或运算）
//        fputc(ch ^ 9, crypt_fp);
        fputc(ch, crypt_fp);
    }
    //关闭
    fclose(crypt_fp);
    fclose(normal_fp);

    env->ReleaseStringUTFChars(inputPath_, inputPath);
    env->ReleaseStringUTFChars(outputPath_, outputPath);
}
extern "C"
JNIEXPORT void JNICALL
//解密
Java_com_tb_wangfang_news_utils_NDKFileEncryptUtils_decry(JNIEnv *env, jclass type,
                                                          jstring inputPath_, jstring outputPath_) {
    const char *inputPath = env->GetStringUTFChars(inputPath_, 0);
    const char *outputPath = env->GetStringUTFChars(outputPath_, 0);

    // TODO
    //打开文件
    FILE *normal_fp = fopen(inputPath, "r");
    FILE *crypt_fp = fopen(outputPath, "w");
    //一次读取一个字符
    int ch;
    while ((ch = fgetc(normal_fp)) != EOF) { //End of File
        //写入（异或运算）
//        fputc(ch ^ 9, crypt_fp);
        fputc(ch, crypt_fp);
    }
    //关闭
    fclose(crypt_fp);
    fclose(normal_fp);


    env->ReleaseStringUTFChars(inputPath_, inputPath);
    env->ReleaseStringUTFChars(outputPath_, outputPath);
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_tb_wangfang_news_ui_activity_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
