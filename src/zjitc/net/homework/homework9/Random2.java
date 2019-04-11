//package zjitc.net.homework.homework9;
//
//import java.util.*;
//
///**
// * @author 杜源康
// * @date 2019-04-12 00:01
// */
//public class Random2 {
//    public static <HashMap> void main(String[] args) {
//        Map<String, String> a = new HashMap<>();
//        a.put("0", "godv");
//        a.put("1", "mifengaaa");
//        a.put("2", "aluka");
//        a.put("3", "gucun");
//        a.put("4", "cpt");
//        a.put("5", "forever");
//        a.forEach((k, v) -> {
//                    System.out.println(k + "=>" + v);
//                }
//        时间换空间, 生成随机数用遍历次数做随机取值:
//
//            Random rnd = new Random();
//            rnd.setSeed(new Date().hashCode());
//            final int d = rnd.nextInt(a.size());
//            int x = 0;
//            Iterator<Map.Entry<String, String>> it = a.entrySet().iterator();
//            while (it.hasNext()) {
//                Map.Entry<String, String> itt = it.next();
//                if (x++ == d) {
//                    System.out.println(itt.getKey() + "=>" + itt.getValue());
//                }
//            }
//        空间换时间, 先存储KeySet然后做随机取key值
//            ArrayList<String> b = new ArrayList<>(a.size());
//            a.forEach((k, v) -> {
//                b.add(k);
//            });
//            Random rnd = new Random();
//            rnd.setSeed(new Date().hashCode());
//            final int d = rnd.nextInt(a.size());
//            System.out.println(b.get(d) + "=>" + a.get(b.get(d)));
//
//        }
//    }
//
