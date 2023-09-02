# Java JVM 堆(Heap)
堆(Heap) 為 Java JVM 中最大的空間，且與方法區都為進程唯一，而一個進程可以有多個執行緒
1. 一個進程(JVM)只存在一個堆(Heap)
2. Java 堆(Heap)區在 JVM 啟動時被創建，其空間也被固定下來也是JVM中最大的空間
3. JVM 規範中，Java 堆(Heap)在物理上可以為不連續記憶體位址，但邏輯上應該被視為連續的
4. 所有執行緒共享一個 Java 堆(Heap)，除外還可以分出線程私有的緩衝區(Thread Local Allocation Buffer, TLAB)
![JVM 簡圖](./images/JVM%20簡圖.jpg)

