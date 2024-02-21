import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    static BufferedWriter br;
    public static void printList(ArrayList ar,BufferedWriter br,Boolean space) throws IOException {
        for(int i=0;i<ar.size()-1;i++){
            br.write(ar.get(i)+" ");
        }
        if(space)
            br.write(ar.get(ar.size()-1)+"\n\n");
        else
            br.write(ar.get(ar.size()-1)+"\n");

    }
    public static void main(String[] args) throws IOException {
        String inputFile=args[0];
        ArrayList<String> lines = new ArrayList<String>();
        //Writer FileWriter = new FileWriter("output.txt",false);



        //Write_Text wt=new Write_Text();

        ArrayList<Integer> arm_list = new ArrayList<Integer>();
        ArrayList<Integer> emirp_list = new ArrayList<Integer>();
        ArrayList<Integer> abund_list = new ArrayList<Integer>();


        File_Reader fileReader = new File_Reader();
        Armstrong_Numbers arm_num = new Armstrong_Numbers();
        Emirp_Numbers emirp_num = new Emirp_Numbers();
        Abundant_Numbers abund_num = new Abundant_Numbers();
        BufferedWriter br =new BufferedWriter(new FileWriter("output.txt"));

        lines = fileReader.reader(inputFile);
        for(int i = 0; i < lines.size()-1; i++){
            if(lines.get(i).contains("Armstrong")){
                arm_list = arm_num.armstrong(lines.get(i+1));
                br.write("Armstrong numbers up to "+lines.get(i+1)+":\n");
                printList(arm_list,br,true);
                i++;
            }

            else if(lines.get(i).contains("Emirp")){
                emirp_list = emirp_num.emirp(lines.get(i+1));
                br.write("Emirp numbers up to "+lines.get(i+1)+":\n");
                printList(emirp_list,br,true);
                i++;
            }

            else if(lines.get(i).contains("Abundant")){
                abund_list = abund_num.abundant(lines.get(i+1));
                br.write("Abundant numbers up to "+lines.get(i+1)+":\n");
                printList(abund_list,br,true);
                i++;
            }

            else if(lines.get(i).contains("Ascending")){
                ArrayList<Integer> int_list = new ArrayList<Integer>();
                i++;
                br.write("Ascending order sorting:\n");

                while (true){
                    if(!lines.get(i).equals("-1")){
                        int k = Integer.parseInt(lines.get(i));
                        int_list.add(k);
                        i++;
                        Collections.sort(int_list);
                        printList(int_list,br,false);
                        //System.out.println(int_list);
                    }
                    else {
                        break;
                    }
                }
                br.write("\n");

            }
            else if(lines.get(i).contains("Descending")){
                i++;
                br.write("Descending order sorting:\n");

                ArrayList<Integer> int_list = new ArrayList<Integer>();
                while (true){
                    if(!lines.get(i).equals("-1")){
                        int k = Integer.parseInt(lines.get(i));
                        int_list.add(k);
                        i++;
                        Collections.sort(int_list);
                        Collections.sort(int_list, Comparator.reverseOrder());
                        printList(int_list,br,false);
                        //System.out.println(int_list);
                    }
                    else {
                        break;
                    }
                }
                br.write("\n");
            }

            else{
                continue;
            }
        }
        br.write("Finished...");

        br.close();


    }
}