public class ex4{

    interface Book{
        Book convertPrice(float rate);
    }
    public static class NewBook implements Book{
        private final float price;
        NewBook(float initPrice){
            this.price=initPrice;
        }
        public String printPrice() {
            return String.format("The book costs %f", this.price);
        }
        @Override
        public NewBook convertPrice(float rate){
            return new NewBook(this.price * rate);
        }
    }
     public static void main(String []args){
        NewBook book = new NewBook(25);
        NewBook bookEuro = book.convertPrice(4);
        /*error: incompatible types: Book cannot be converted to NewBook*/
        System.out.println(book.printPrice());
        System.out.println(bookEuro.printPrice());
     }
}
