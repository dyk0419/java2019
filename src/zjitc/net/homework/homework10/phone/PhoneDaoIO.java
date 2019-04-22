package zjitc.net.homework.homework10.phone;

import java.io.*;
import java.util.ArrayList;

/**
 * @author 杜源康
 * @date 2019-04-22 16:55
 */
public class PhoneDaoIO implements PhoneDao {
    ArrayList<Phone> arrayList = new ArrayList<Phone>();
    ArrayList<Phone> arrayList2 = new ArrayList<Phone>();

    @Override
    public void in(Phone phone) {
        arrayList.add(phone);
        System.out.println("入库成功");

        BufferedWriter bw = null;
        Writer out = null;
        try {
            out = new FileWriter("D:\\phone.txt", true);
            bw = new BufferedWriter(out);

            String line = phone.getModel() + "," + phone.getName() + "," + phone.getColor();
            bw.write(line);
            bw.newLine();

            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (out != null) {
                    out.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int selectModel(String model) {
        Reader in = null;
        BufferedReader br = null;

        try {
            in = new FileReader("D:\\phone.txt");
            br = new BufferedReader(in);

            String line = null;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                Phone phone = new Phone(s[0], s[1], s[2]);
                arrayList2.add(phone);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if (model.equals(arrayList2.get(i).getModel())) {
                System.out.println("型号：" + arrayList2.get(i).getModel() +
                        "\t" + "名字:" + arrayList2.get(i).getName() +
                        "\t" + "颜色：" + arrayList2.get(i).getColor());
                return 1;
            }
        }
        return -1;
    }

    @Override
    public int selectName(String name) {
        Reader in = null;
        BufferedReader br = null;

        try {
            in = new FileReader("D:\\phone.txt");
            br = new BufferedReader(in);

            String line = null;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                Phone phone = new Phone(s[0], s[1], s[2]);
                arrayList2.add(phone);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if (name.equals(arrayList2.get(i).getName())) {
                System.out.println("型号：" + arrayList2.get(i).getModel() +
                        "\t" + "名字:" + arrayList2.get(i).getName() +
                        "\t" + "颜色：" + arrayList2.get(i).getColor());
                return 1;
            }
        }
        return -1;
    }

    @Override
    public void selectAll() {
        Reader in = null;
        BufferedReader br = null;

        try {
            in = new FileReader("D:\\phone.txt");
            br = new BufferedReader(in);

            String line = null;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                System.out.println("型号：" + s[0] + "\t" + "名字：" + s[1] + "\t" + "颜色：" + s[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int delete(Phone phone) {

        return -1;
    }

}
