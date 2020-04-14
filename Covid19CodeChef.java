import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Covid19CodeChef {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer>  list = new ArrayList<>();
        for(int i=1;i<=t;i++){
            int n = sc.nextInt();
            for(int j=1;j<=n;j++){
                list.add(sc.nextInt());
            }
            System.out.println(checkSocialDistancing(list));
            list.clear();
        }
    }

    private static String checkSocialDistancing(ArrayList<Integer> list) {
        String result = "";
        if(list.size()==1 && list.get(0)==1)
            result = "YES";
        else if(list.size()<7)
            result = "NO";
        else{
            ArrayList<Integer> indexesOfOne = new ArrayList<>();
            for(int i=0;i<list.size();i++){
                if(list.get(i)==1)
                    indexesOfOne.add(i);
            }
            for(int j=1;j<indexesOfOne.size();j++){
                if(indexesOfOne.get(j)-indexesOfOne.get(j-1) == 6) {
                    result = "YES";
                }else {
                    result = "NO";
                    break;
                }
            }
        }
        return result;
    }
}
