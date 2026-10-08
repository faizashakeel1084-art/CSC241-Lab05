public class Demo{
    
   public static void main(String [] args) {
         Product p1 = new Product(" Faiza " , 200.00 , 10);
         Product p2 = new Product("Maryam" , 150.00 , 20);
         Product p3 = new Product(" Saira " , 300.00 , 10);
         Date d1 = new Date(25, 12 ,2007);
        Product p4 = new Product(" ahsan " , 200.00 , 10 , d1);

 System.out.println();
         p1.displayProduct();
          p2.displayProduct();
            p3.displayProduct();
          p4.displayProduct();

}
}
           
      