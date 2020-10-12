class Main {
    public static void main(String... args) {
        Animals dog = new Animals();
        dog.name = "josh";
        dog.legs = 4;
        String legs = doubleLegs(dog.legs,2);
        String title = dog.name + " would have " + legs + " legs if he had twice as many.";
        System.out.println(title);

        
    }
    public static String doubleLegs(int x, int y){
        int newLegs = x * y;
        String returnValue = Integer.toString(newLegs);
        return returnValue;
    }
}