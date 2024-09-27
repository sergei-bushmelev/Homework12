public class Main {
    public static void main(String[] args) {
        Author nataliaKorneeva = new Author("Наталья", "Корнева");
        Author marusiaSavina = new Author("Маруся", "Савина");
        Author none = new Author();

        Book goToMagadan = new Book("Еду в Магадан", nataliaKorneeva, 2023);
        Book teremaOfRussia = new Book("Терема России", marusiaSavina, 2024);
        Book teremaOfwRussia = new Book("Терема России", marusiaSavina, 2024);
        Book lora = new Book("lora", none, 2010);

        goToMagadan.setYearOfPublication(2021);
        System.out.println(teremaOfRussia);
        System.out.println(lora);
        System.out.println(teremaOfRussia.equals(teremaOfwRussia));
        System.out.println(goToMagadan.equals(teremaOfRussia));
    }
}