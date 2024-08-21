package MainProject;

public class calculate {
    /**
     * 生成指定长度的随机代码
     *
     * @param n 生成代码的长度
     * @return 生成的随机代码
     */
    public static String calculate(int n) {
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = (int) (Math.random() * 3);

            switch (type) {
                case 0:
                    int num = (int) (Math.random() * 10);
                    code += num;
                    break;

                case 1:
                    int num2 = (int) (Math.random() * 26);
                    char ch = (char) ('A' + num2);
                    code += ch;
                    break;

                case 2:
                    int num3 = (int) (Math.random() * 26);
                    char ch2 = (char) ('a' + num3);
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
