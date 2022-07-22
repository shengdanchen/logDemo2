package com.cetiti.logdemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cetiti.loglib.LogUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogUtils.info("测试TAG","测试内容")
//        io.reactivex.Observable.create<String>(ObservableOnSubscribe<String> { observableEmitter: ObservableEmitter<String?> ->
//            @SuppressLint("CheckResult") val content: String
//            content = if (readAll) {
//                com.cetiti.loglib.FileUtils.readFileAll(fileAbsoluteName)
//            } else {
//                com.cetiti.loglib.FileUtils.readFileFromEnd(
//                    fileAbsoluteName,
//                    endIndex,
//                    "UTF-8"
//                )
//            }
//            observableEmitter.onNext(content)
//        } as ObservableOnSubscribe<String?>?).subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe(object : io.reactivex.functions.Consumer<String?>() {
//                @Throws(Exception::class)
//                fun accept(contentStr: String) {
//                    callback.finishCallback(contentStr)
//                }
//            })
    }
}