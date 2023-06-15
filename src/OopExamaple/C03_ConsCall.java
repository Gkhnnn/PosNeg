package OopExamaple;

public class C03_ConsCall {
    int age;
    String name;
// constractors  cagırırken dikkat etmemiz gerekn sey recursive yani tekrarlamaya dikkat etmeliyiz!! yoksa compiler hata verir.
    public C03_ConsCall() {

    }

    public C03_ConsCall(int age) {
        this();
    }

    public C03_ConsCall(String name) {
        this(32);// bir cons. içerisinde baska bir cons. cagıramayız!!! body'nin ilk satırında cons. cagırılabilir.
    }
    public C03_ConsCall(int age , String name){
        this("gökhan");

    }
}
