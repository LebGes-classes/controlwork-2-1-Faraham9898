public class Main {
    public static void main(String[] args) {
        MyMap<String, String> myMap = new MyMap<>();
        myMap.put("A", "1");
        myMap.put("B", "2");
        myMap.put("C", "3");
        myMap.put("D", "4");
        System.out.println(myMap.get("A"));
        System.out.println(myMap.get("B"));
        System.out.println(myMap.get("C"));
        System.out.println(myMap.get("D"));
        // этот map не использует hash, в него можно добавлять пары ключ-значение и изменять уже существующие
    }
}
