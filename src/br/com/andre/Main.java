package br.com.andre;

public class Main {

    public static void main(String[] args) {
        Software tomcat = new Software("Tomcat", 300);
        Software java = new Software("Java", 1000);
        Software debian = new Software("Debian", 2000);
        Software sql = new Software("SQL Server", 400);
        Software dotnet = new Software(".NET", 1000);
        Software ubuntu = new Software("Ubuntu", 2500);
        Software binary = new Software("Static Binary", 200);
        Software alpine = new Software("Alpine", 800);

        Container c1 = new Container();
        c1.addSoftware(tomcat);
        c1.addSoftware(java);
        c1.addSoftware(debian);

        Container c2 = new Container();
        c2.addSoftware(sql);
        c2.addSoftware(dotnet);
        c2.addSoftware(ubuntu);

        Container c3 = new Container();
        c3.addSoftware(binary);
        c3.addSoftware(alpine);

        Compose containers = new Compose();
        containers.addContainer(c1);
        containers.addContainer(c2);
        containers.addContainer(c3);

        containers.run();
//        c1.stop();
        System.out.println("Tamanho total: " + containers.getTamanhoTempoReal());
    }
}
