package zjitc.net.classwork.interface_.randomrollcaller;

import java.util.Random;

/**
 * @author 杜源康
 * @date 2019-03-25 17:11
 */
public class Test2 {
    public static void main(String[] args) {
        Student[] stu1804={
                new Student("吴灏琳"),new Student("杜源康"),new Student("李广彦"),
                new Student("林永俊"),new Student("朱志文"),new Student("田果"),
                new Student("严凯聪"),new Student("钟康"),new Student("管敏琦"),
                new Student("张起焕"),new Student("卢荣飞"),new Student("屠鑫炜"),
                new Student("胡新雨"),new Student("李光都"),new Student("杨文海"),
                new Student("朱浩帆"),new Student("杨扬健"),new Student("杨帆"),
                new Student("张扬"),new Student("王继飚"),new Student("管敏乾"),
                new Student("叶德候"),new Student("钱亮亮"),new Student("庄璋琰"),
                new Student("张恒冕"),new Student("陈挺"),new Student("万洲")
        };
        System.out.println("班级学生名单如下：");
        /*随机数的范围是0到长度-1*/
        for (int i = 0; i < stu1804.length; i++) {
            System.out.print(stu1804[i].getName() + "\t");
            if ((i+1) % 5 == 0) {
                System.out.print("\n");
            }
        }
        System.out.println();
        Random random=new Random();
        int ra=random.nextInt(stu1804.length);
        System.out.println("现在有请："+stu1804[ra].getName());




    }
}
