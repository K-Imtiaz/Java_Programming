public class OverloadingConstructorTest {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        Teacher teacher2=new Teacher("Anis","male");
        teacher2.displayInformation();
        Teacher teacher3=new Teacher("Imtiaz","male",1701045959);
        teacher3.displayInformation();

    }
}