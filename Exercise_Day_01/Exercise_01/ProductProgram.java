package Exercise_Day_01.Exercise_01;

public class ProductProgram {
    public static void main(String[] args) {
        Product p = new Product(1, "Pappel", "Utilizado para armazn escrituras");

        System.out.println("Id: "+p.getId());
        System.out.println("Name: "+p.getName());
        System.out.println("Description: "+p.getDescription());
        System.out.println("-------------------------------");

        p.setId(2);
        p.setName("Papel");
        p.setDescription("Utilizado para armazenar escrituras");
        
        
        System.out.println("Id: "+p.getId());
        System.out.println("Name: "+p.getName());
        System.out.println("Description: "+p.getDescription());

    }
}