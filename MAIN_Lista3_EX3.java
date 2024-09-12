public class MAIN_Lista3_EX3 {
    public static void main(String[] args) {
        Computador_Lista3 computador1 = new Computador_Lista3("Dell Inspiron 15 3000", "AMD Ryzen 5 5600X", 16, "ASUS TUF Gaming B550-PLUS");
        Computador_Lista3 computador2 = new Computador_Lista3("Dell XPS 13", " Intel Core i5-13600K", 32, " MSI MAG B660 TOMAHAWK WIFI");

        computador1.exibir();
        computador2.exibir();
    }
}
