import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Ali");
        nameList.add("Veli");
        nameList.add("Kırk");
        nameList.add("Dokuz");
        nameList.add("Elli");

        System.out.println(GetIndexOfList(nameList,0));
        System.out.println(GetIndexOfList(nameList,9));
    }

    public static String GetIndexOfList(List<String> list, int index){

        try{
            return list.get(index);
        }catch (IndexOutOfBoundsException e){
            throw new CustomIndexException("Dizinin sınırları dışında bir indeks erişimi yapıldı.");
        }
    }
}