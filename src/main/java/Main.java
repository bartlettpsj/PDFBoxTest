import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!!");

        ReallyGroovy reallyGroovy = new ReallyGroovy();
        reallyGroovy.sayHello();

        IntStream.range(0, 9).forEach(i ->
            reallyGroovy.generatePdf("/Users/Paul/Desktop/test.pdf", "")
        );
    }

}
