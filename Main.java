public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        try {
            for (int i = 0; i < 5; i++) {
                list.add(i, "!");
                list.add(i, "World");
                list.add(i, "Hello");
            }
        } catch (IndexOutOfRange e)
        {
            System.out.println("Give me more memory!!");
        }
        try {
            for (int inner = 0; inner < list.size(); inner++) {
                System.out.print(list.get(inner));
            }
        } catch (IndexOutOfRange e) {
            System.out.println("I can't find some elements to print!");
        }
        System.out.println("\n\n/////////////////////\n");

        List<String> linkList = new List<>("Hello, WORLD!!!");
        linkList.add("1");
        linkList.add("2");
        linkList.add("3");
        linkList.add("4");
        linkList.add("5");
        linkList.add("6");
        try {
            for (int inner = 0; inner < linkList.size(); inner++) {
                System.out.println(linkList.get(inner));
            }
        } catch (IndexOutOfRange e) {
            System.out.println("Sorry, I can't print anymore");
        }
    }
}
