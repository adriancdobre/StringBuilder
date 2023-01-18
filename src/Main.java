public class Main {
    public static void main(String[] args) {

        String hellorWorld = "Hello" + " World";
        hellorWorld.concat(" and Goodbye!");
        StringBuilder helloWordlBuilder = new StringBuilder( "Hello " + "World");
        helloWordlBuilder.append(" and Goodbye!");
        printInformation(hellorWorld);
        printInformation(helloWordlBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 =new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder helloWordlBuilderPlus = new StringBuilder( "Hello " + "World");
        helloWordlBuilderPlus.append(" and Goodbye!");

        helloWordlBuilderPlus.deleteCharAt(16).insert(16,"g");
        System.out.println(helloWordlBuilderPlus);

        helloWordlBuilderPlus.replace(16,17,"G");
        System.out.println(helloWordlBuilderPlus);

        helloWordlBuilderPlus.reverse().setLength(8);
        System.out.println(helloWordlBuilderPlus);


    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("length= " +string.length());

    }
    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length= " + builder.length());
        System.out.println("capacity = " + builder.capacity());

    }

}
