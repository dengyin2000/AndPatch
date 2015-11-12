# AndPatch

AndPatch是通过ClassLoader来实现Android的热补丁方案，AndPatch比阿里的Dexposed或者Andfix强在稳定性上，因为Dexposed和Andfix是通过ndk method hook来实现的，之前在使用Dexposed和Andfix时也是遇到各种问题。

AndPatch是参考QZone的这篇文章来实现的：http://bugly.qq.com/blog/?p=781

## 实现原理

具体实现原理请看QZone的这篇文章：http://bugly.qq.com/blog/?p=781

## 怎样运行示例代码

本例子主要是一个除法计算的Sample。MatchService.java没有考虑除数为0的情况，如果直接运行Sample，当除数为0时会发生崩溃。

[hack.dex](https://github.com/dengyin2000/AndPatch/raw/master/hack.dex)包含了修复版本的MatchService和AntilazyLoad类，你只需要把hack.dex放到手机的/data/data/com.dengyin2000.andpatch/cache/andpatch目录下面，运行app的时候就能解决除数为0时的崩溃问题。

本示例借鉴了multidex源码。