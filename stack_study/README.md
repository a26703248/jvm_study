
## 虛擬機棧區域（JVM Stack）
定義:棧可透過數組或鏈表實作,但不可通過索引訪問元素,只能透過出棧(push)和入棧(pop)操作
### 記憶體相關錯誤
#### StackOverflowError
發生情況:
當 Java 棧為固定大小時，若執行緒請求使用的棧(Stack)超過Java 虛擬機允許的棧(Stack)大小則會發生棧溢出錯誤，例:遞迴次數過多
#### OutOfMemoryError
發生情況:
當 Java 棧為動態大小時，若執行緒無法請求到可使用的棧(Stack)空間則會發生記憶體洩漏錯誤，例:陣列長度超過記憶體大小

### 棧(Stack)系統預設大小
![stack_args](images/stack_args.png)

### 棧偵(Stack frame)結構
* 區域變數表(Local Variables)
* 執行操作數棧(Operand Stack)
* 方法回傳位址(Return Address)
* 動態連結(Dynamic Linking)
* 其他回傳資訊  
![stack_struct](images/stack_struct.png)
### 區域(本地)變數表(Local Variables)
* 可儲存基本類型、物件類型及returnAddress類型
* 因數據類型儲存在棧內故而無執行緒安全問題
* 區域變數表大小是在編譯時期決定好的並保存在Code屬性中的maximum local variable,運行時部會更改
* 區域變數表基本的储存單位為 Slot
* 每一32位元占用1個 Slot(包括ReturnAddress類型),而byte、short、char會被轉換成int储存,boolean相同會被轉換成int储存,0代表false,1代表true,64位元占用2個Slot(包括double、long類型)
* Slot是可重複利用的
#### 物件中的靜態變數與方法內的區域變數差別
在使用變數時,物件中的靜態變數都經過默認初始化(Linking的prepare階段)可直接使用,方法內的區域變數則不會初始化,需顯式給值否則編譯時不會通過
### 執行操作數棧(Operand Stack)
執行操作數棧為LIFO(後進先出)模式,也可稱之為表達式棧(Expression Stack),再根據方法執行時依照執行指令往棧內寫入或提取數據,及出棧(push)和入棧(pop)
### 棧頂緩存技術

### 動態鏈結

### 方法呼叫:解析與派發

### 方法位址返回

## 堆區域（Heap）

## 方法區域（Method Area）

## 常量池區域（Constant Pool）

## 本地方法棧區域（Native Method Stack）