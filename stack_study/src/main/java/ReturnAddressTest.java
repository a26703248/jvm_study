import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class ReturnAddressTest {

    public int methodInt(){
        return 0;
    }
    public byte methodByte(){
        return 0;
    }
    public short methodShort(){
        return 0;
    }
    public long methodLong(){
        return 0L;
    }
    public float methodFloat(){
        return 0.0f;
    }
    public double methodDouble(){
        return 0.0;
    }
    public char methodChar(){
        return 'a';
    }
    public boolean methodBoolean(){
        return false;
    }
    public String methodString(){
        return null;
    }
    public Date methodDate(){
        return null;
    }
    public void methodVoid(){
    }

    static {
        int i = 10;
    }

    public void methodA(){
        try {
            methodB();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void methodB() throws IOException {
        FileReader fr = new FileReader("return_address.txt");
        char[] buffer = new char[1024];
        int len;
        while ((len = fr.read(buffer))!= -1){
            String str = new String(buffer, 0, len);
            System.out.println(str);
        }
        fr.close();
    }
}
