package br.rafael;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        GrpcServer.create(6565, builder -> {
                    builder.addService(new GuessNumberService());
                })
                .start()
                .await();



    }
}
