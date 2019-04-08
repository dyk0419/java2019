package zjitc.net.classwork.api.api2;

/**
 * @Author admin
 * @Date 2019/3/27 9:35
 */
public class StringBufferTest {
    public static void main(String[] args) {
        String s=new String("hello");
        System.out.println(s.getClass()+"@"+s.hashCode()+":"+s);
        s=s+"world";
        System.out.println(s.getClass()+"@"+s.hashCode()+":"+s);
        System.out.println("=============");
        StringBuffer stringBuffer=new StringBuffer("hello");
        System.out.println(stringBuffer.getClass()+"@"+stringBuffer.hashCode()+":"+stringBuffer);
        stringBuffer=stringBuffer.append('w');
        System.out.println(stringBuffer.getClass()+"@"+stringBuffer.hashCode()+":"+stringBuffer);


        System.out.println("=====================================================================");
        System.out.println("1、添加---------------------");
        StringBuffer stringBuffer1=new StringBuffer();
        stringBuffer1.append("abcdefg");
        System.out.println("append添加结果："+stringBuffer1);
        stringBuffer1.insert(2,123);
        System.out.println("insert指定位置添加结果"+stringBuffer1);
        System.out.println("2、删除--------------------");
        /*从start开始到end-1*/
        stringBuffer1.delete(1,8);
        System.out.println("delete删除指定位置结果："+stringBuffer1);
        stringBuffer1.deleteCharAt(2);
        System.out.println("deleteCharAt删除指定位置结果："+stringBuffer1);
        stringBuffer1.delete(0,stringBuffer1.length());
        System.out.println("清空缓存群结果："+stringBuffer1);
        System.out.println("3、修改---------------------");
        StringBuffer stringBuffer2=new StringBuffer("abcdef");
        stringBuffer2.setCharAt(1,'p');
        System.out.println("setCharAt修改指定位置字符结果："+stringBuffer2);
        /*从start开始到end-1*/
        stringBuffer2.replace(1,3,"qq");
        System.out.println("replace替换指定位置字符（串）结果："+stringBuffer2);
        stringBuffer2.reverse();
        System.out.println("字符串翻转结果："+stringBuffer2);


        /*只能产生0-1的随机数*/
        System.out.println("0-1的随机数："+Math.random());

    }
}
