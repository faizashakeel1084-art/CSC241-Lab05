public class Product{
  
      private String id;
      private double price;
      private int quantity;
      private static double maxPrice = 0.0;
      private static double minPrice = 0.0;
      private String name;
      private static int count = 0; 
      private Date md;

      Product(String name, double price , int quantity){

            this(name, price, quantity, new Date(1,1,1));
          
 }
 
        Product(String name, double price , int quantity, Date md){
            this.name = name;
            this.price = price;
            this.quantity = quantity;

            this.md = md;

            this.id = String.format("p%03d", count++);

            if(count == 1){
                  maxPrice = price;
                  minPrice = price;
            } 
            if(count > 1 && minPrice > price){
                  minPrice = price;
            }
            if(count>1 && maxPrice < price){
                  maxPrice = price;
            }
}


   
     public void displayProduct(){
            System.out.println("Id: " +id);
            System.out.println("Name " + name);
            System.out.println("Quantity: " + quantity);
            System.out.println("Max price: " + maxPrice);
            System.out.println("Min Price : " + minPrice);

           System.out.printf("Manufacturing Date : %s \n " , " " + md.toString());


}
}


      