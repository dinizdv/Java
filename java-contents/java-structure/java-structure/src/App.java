import com.dinizdev.courses.Students;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // útil para executar imediatamente
        Students stuC1 = new Students();
        stuC1.register();  // output -> Register at course... 

        // útil quando há várias classes com mesmo nome em diferentes pacotes
        com.dinizdev.school.Students stuS1 = new com.dinizdev.school.Students (); 
        stuS1.register();  // output -> Registering at school
    }

    // compile classe: java App
    // jdk -> compile bytecode (non-native)     
    // jre -> execute bytecode for -> (native)
    // packages -> *lowercase -> reverse domain name (com.dinizdev.alunos) -> evitar colisões
}
