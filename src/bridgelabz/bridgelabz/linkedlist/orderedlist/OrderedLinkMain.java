package bridgelabz.bridgelabz.linkedlist.orderedlist;

public class OrderedLinkMain {
    public static void main(String[] args) {
        Integer[] paraArray = {52, 20, 56, 10, 90, 40};
        OrderedList<Integer> array = new OrderedList<>();
        for (Integer number : paraArray) {
            array.push(number);
        }
        System.out.println("********** : Display linked list without order : *********");
        array.display();
        System.out.println("********** : Display linked list with order : *********");
        array.ascendingOrderSort(array.getSeize());
        array.display();
//        System.out.println(" Put the Number which you want Delete");
//        Scanner scanner=new Scanner(System.in);
//        array.s(scanner.nextInt());
//        file.Display();
//        System.out.println(" Put the word which you want Add");
//        file.searchAndAdd(scanner.nextInt(), scanner.nextInt());
//        file.Display();
    }
}
