/**
 * ProjectName: jvm_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/7/16 - 下午 03:22
 * @since JDK 1.8
 */
public class OperandStackTest {
    public static void main(String[] args) {
        byte i = 15;
        int j = 8;
        int k = i + j;
        int m = 8;
    }

    public int getSum(){
        byte i = 15;
        int j = 8;
        int k = i + j;
        return k;
    }

    public void testGetSum(){
        // 獲得上一個棧的結果並保存在當前棧中
        int i = getSum();
        int j = 10;
    }

    // i++ 與 ++i 區別
    public void add(){
        // 1.
        int i1 = 10;
        i1++;
        int i2 = 10;
        ++i2;

        // 2.
        int i3 = 10;
        int i4 = i3++;

        int i5 = 10;
        int i6 = ++i5;

        // 3.
        int i7 = 10;
        i7 = i7++;

        int i8 = 10;
        i8 = ++i8;

        // 4.
        int i9 = 10;
        int i10 = i9++ + ++i9;
    }
}
