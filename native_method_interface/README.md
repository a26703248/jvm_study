# 本地方法介面
### 什麼是本地方法
一個 Native Method 為非 Java 實作方法， 在 Java 中方法使用 native 關鍵字宣告類似於C++中可以使用extern告知編譯器呼叫C語言函數   
"A native method is a Java method whose implementation is provided by non-java code."   
宣告 native 不需實作方法體，是由非 Java 語言在外部實現   
本地方法介面用於融合不同程式語言為Java所用，起初是為呼叫C/C++程式碼

### 本地方法介面存在原因
在某些情況下 Java 實現起來較為複雜或效率不佳，需要依賴於外部系統環境完成，所提供的外部交互介面讓 Java 不須在意繁瑣的實作細節

### 本地方法建議
目前 Java 條件越來越成熟，能盡量少使用本地方法介面就儘量少使用，除非必須依賴硬體相關涵式庫

## 本地方法棧
本地方法棧主要管理本地方法的棧楨
1. 本地方法棧為執行緒私有的
2. 與 Java 棧一樣可動態或固定調整大小
   * 若動態擴展無法請求到資源一樣會拋 OutOfMemoryError
   * 若固定大小時超出棧設定大小一樣會拋 StackOverflowError
3. 具體使用在方法內使用 native 關鍵字，透過 Execution Engine 在運行時使用動態鏈結將C語言實作押入棧楨當中
4. 當執行緒調用某個本地方法時，該方法記憶體管理將不再受到 Java JVM 所管理，權限將會與 JVM 相同層級
    * 本地方法可以通過本地方法介面訪問運行時數據區
    * 可以直接使用處理器中的寄存器做處理
    * 直接從本地記憶體堆分配任意數量記憶體空間
5. 並不是所有 JVM 都支持本地方法，因為 JVM 規範並未明確規範使用語言、實作方法及資料結構等，若不支援可不實作本地方法棧  [java 1.8 本地方法棧說明檔](https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-2.html#jvms-2.5.6)
6. Hotspot JVM 將本地方法棧及Java JVM 棧合二為一(通過動態連結直接呼叫本地方法)
