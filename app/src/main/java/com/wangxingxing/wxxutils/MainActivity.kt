package com.wangxingxing.wxxutils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wangxingxing.mylibrary.DateUtil
import com.wangxingxing.wxxutils.databinding.ActivityMainBinding

/**
 * author : 王星星
 * date : 2022/9/13 16:39
 * email : 1099420259@qq.com
 * description : 测试aar包上传到github
 */
class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvContent.text = DateUtil.getDate(System.currentTimeMillis())
    }
}