import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] input = Operations.readFile(args[0],true,true);
        ArrayList<String> arrayListInput = Operations.convertToArrayList(input);
        for(String member : arrayListInput){
            Operations.writeToFile("poemArrayList.txt",member,true,true);
        }
        arrayListInput.sort(new idComparator()); //ArrayList<String> arrayListInputSorted =
        for(String member : arrayListInput){
            Operations.writeToFile("poemArrayListOrderByID.txt",member,true,true);
        }
        HashSet<String> hashSetInput = Operations.convertToHashSet(input);
        for(String member : hashSetInput){
            Operations.writeToFile("poemHashSet.txt",member,true,true);
        }
        TreeSet<String> treeSetInput = Operations.convertToTreeSet(input);
        for(String member : treeSetInput){
            Operations.writeToFile("poemTreeSet.txt",member,true,true);
        }
        TreeSet<String> newtreeSetInput = Operations.newconvertToTreeSet(input);
        for(String member : newtreeSetInput){
            Operations.writeToFile("poemTreeSetOrderByID.txt",member,true,true);
        }
        HashMap<Integer, String> hashMapInput = Operations.convertToHashMap(input);
        for(HashMap.Entry<Integer, String> keyValue : hashMapInput.entrySet()){
            Operations.writeToFile("poemHashMap.txt",keyValue.getKey().toString() + "\t" + keyValue.getValue(),true,true);
        }
    }
}