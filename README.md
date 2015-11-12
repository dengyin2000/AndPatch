# AndPatch

AndPatch是通过ClassLoader来实现Android的热补丁方案，AndPatch比阿里的Dexposed或者Andfix强在稳定性上，因为Dexposed和Andfix是通过ndk method hook来实现的，之前在使用Dexposed和Andfix时也是遇到各种问题。

AndPatch是参考QZone的这篇文章来实现的：http://bugly.qq.com/blog/?p=781