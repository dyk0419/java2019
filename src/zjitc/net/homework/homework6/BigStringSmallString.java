package zjitc.net.homework.homework6;

/**
 * @author 杜源康
 * @date 2019-03-27 22:39
 */
public class BigStringSmallString {
    public static void main(String[] args) {
        String maxString="woaijavawozhenaijavawozhendeaijavawozhendehenaijava";
        String minString="java";
        int count=new BigStringSmallString().getCount(maxString,minString);
        System.out.println("java在大串中出现了："+count+"次");

    }
   private int getCount(String max,String min){
        int count=0;
      while (max.contains(min)){
          max=max.substring(max.indexOf(min)+min.length());
          count++;
      }
        return count;
    }
}
